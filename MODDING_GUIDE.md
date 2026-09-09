# ⚡ MTX-API — Complete Reverse Engineering & Modding Guide

This document provides a comprehensive reference on how we reverse-engineered, instrumented, and built the **MatrixAPI** mod for the obfuscated J2ME game **Ninja School Online 217w** (`NinjaSchool_217w.jar`).

---

## 🛠️ 1. Tools & Environment Setup

To reverse-engineer, modify, compile, and run the J2ME application, the following tools were used:

| Tool | Purpose | Usage in Project |
| :--- | :--- | :--- |
| **CFR Decompiler / Recaf** | Bytecode Decompiler & Analysis | Used to decompile the obfuscated JAR into readable Java code in `src_decompiled/`. |
| **Javassist (`lib/javassist.jar`)** | Bytecode Manipulation & Injection | Instruments bytecode at build time without needing full source re-compilation. |
| **ECJ Compiler (`lib/ecj.jar`)** | Java Compiler for J2ME | Compiles mod code targeting CLDC 1.1 / MIDP 2.0 Java runtimes. |
| **J2ME API Stubs (`midpapi20.jar`, `cldcapi11.jar`)** | Classpath Dependencies | Provides J2ME MIDlet runtime stubs during compilation. |
| **Neutron / MicroEmulator** | J2ME Emulator | Execution environment for testing the patched runnable JAR (`dist/mtx-api.jar`). |
| **Automated Build Script (`build.sh`)** | Pipeline Automation | One-click compilation, bytecode patching, and JAR repacking script. |

---

## 🏗️ 2. Project Architecture & File Layout

```
mtx-api/
├── build.sh                             # Automated 4-step build script
├── MODDING_GUIDE.md                     # This reference guide
├── README.md                            # Quick start overview
├── input/
│   └── NinjaSchool_217w.jar             # Original unmodified J2ME game JAR
├── lib/
│   ├── javassist.jar                    # Bytecode instrumentation library
│   ├── ecj.jar                          # Eclipse Java Compiler
│   ├── midpapi20.jar                    # MIDP 2.0 API stubs
│   └── cldcapi11.jar                    # CLDC 1.1 API stubs
├── src/
│   ├── mod/
│   │   ├── MatrixAPI.java               # Central Facade & entrypoint for bytecode hooks
│   │   ├── ui/
│   │   │   └── MatrixUI.java            # Menus, input dialogs & command routing
│   │   ├── net/
│   │   │   └── MatrixNet.java           # Network packet inspection & Packet 93 dispatch
│   │   └── log/
│   │       └── MatrixLogger.java        # Console formatting, stat parsing & key tracing
│   └── patcher/
│       └── Patcher.java                 # Javassist bytecode instrumenter script
└── dist/
    └── mtx-api.jar                      # Final runnable, patched game JAR
```

---

## 🔬 3. How We Reverse-Engineered & Modified the Obfuscated Game

Ninja School Online J2ME is compiled and heavily obfuscated (short class names like `dg`, `an`, `bp`, `ce`, `dh`, `main.a`). Here is how key game mechanics were mapped and hooked:

### A. Menu Injection (`dg.ah()`)
* **Original Behavior:** Method `dg.ah()` builds the main game menu list vector.
* **Our Modification:** Using Javassist `ExprEditor`, we intercept `ds.a(...)` calls inside `dg.ah()` and inject `mod.MatrixAPI.addMatrixMenuItem(vector)`.
* **Result:** `MatrixAPI` is inserted at **Index 0** (the very top option of the main game menu).

### B. Command Interception (`dg.b(int id, Object obj)`)
* **Original Behavior:** `dg.b(int, Object)` acts as the central command router for in-game menu selections.
* **Our Modification:** We injected a check at the beginning of `dg.b`:
  ```java
  if (mod.MatrixAPI.handleMatrixCommand(commandId, obj)) return;
  ```
* **Command IDs Used:**
  * `888999`: Main `MatrixAPI` menu trigger.
  * `888901`: `Inspect Player Target` sub-option.
  * `888903`: OK button submission callback from the input dialog.

### C. In-Game Text Input Screen (`main.a.L`)
* **Original Behavior:** *Add Friend* uses `main.a.L.a(title, bdCommand, type)` to open native input screens.
* **Our Modification:**
  1. `MatrixAPI.promptPlayerName()` calls `main.a.L.a("Enter Player Name:", new bd("OK", 888903), 0)`.
  2. When the user types a character name and clicks **OK**, command `888903` executes.
  3. `MatrixAPI.submitPlayerInspect()` reads the typed text string directly using `main.a.L.d.d()`, closes the input screen with `main.a.j()`, and triggers inspection.

### D. Programmatic Player Inspection (Packet `93`)
* **Original Behavior:** Inspecting a player nearby sends Packet `93`.
* **Our Modification:** `MatrixAPI.inspectPlayer(playerName)` invokes `dq.a().a(playerName, 0)`. This sends Packet `93` with any arbitrary player name string directly to the game server.

### E. Profile Extraction & Logging (`dg.o(t)`)
* **Original Behavior:** When player profile data arrives from the server, `dg.aV` stores the target player object (`bp`) and `dg.o(t)` renders the Info window screen.
* **Our Modification:** Injected `mod.MatrixAPI.logPlayerInfo(dg.aV)` into `dg.o(t)`.
* **Extracted Attributes (All 18 Stats):**
  * `ab`: Character Name
  * `aM`: Aggressive Point
  * `w`: Level
  * `av.b`: Class (e.g. *Ninja Fan*)
  * `df.eK[a()]`: School (e.g. *Haruna*)
  * `z / B`: HP (Current / Max)
  * `x / y`: MP (Current / Max)
  * `b()`: Movement Speed
  * `(u - u/10) - u`: Attack Damage Range
  * `aG`: Anti Fire
  * `aH`: Anti Ice
  * `aI`: Anti Wind
  * `v`: Reduce Pain
  * `aK`: Accurate Point
  * `aJ`: Dodge Ability
  * `aL`: Critical
  * `aO`: Close Combat Strike Back
  * `aP`: Anti Chakra
  * `aQ`: Anti Chakra Back

### F. Network Packet Logging (`dh.a(ce)` & `an.a(ce)`)
* **Outbound Packets:** Intercepted `dh.a(ce)` to log all outgoing packets (`[MATRIX::NET-OUT]`).
* **Inbound Packets:** Intercepted `an.a(ce)` to log incoming packet IDs (`[MATRIX::NET-IN]`), with noise filtering for continuous movement sync packets (IDs `1`, `-30`, `-28`).

---

## ⚡ 4. How to Build the Project

Run the build script from inside the `mtx-api` directory:

```bash
cd mtx-api
chmod +x build.sh
./build.sh
```

### The 4 Build Pipeline Steps Executed by `build.sh`:
1. **Compiling Mod Classes:** Compiles `MatrixAPI.java` using `ecj.jar` against J2ME CLDC 1.1 / MIDP 2.0 stubs into `build_output/classes`.
2. **Compiling Bytecode Patcher:** Compiles `Patcher.java` into `patcher_build`.
3. **Instrumenting Bytecode:** Runs `Patcher.main()` to load `input/NinjaSchool_217w.jar`, inject Javassist hooks, and output modified `.class` files into `build_output/patched_classes`.
4. **Repacking Runnable JAR:** Unpacks the clean original JAR, overwrites patched classes and mod classes, and creates `dist/NinjaSchool_217w_MatrixMOD.jar`.

---

## 🚀 5. How to Add Future MatrixAPI Features

1. Open `src/mod/MatrixAPI.java`.
2. Add your new sub-option in `showMatrixMenu()`:
   ```java
   menuList.addElement(new bd("My New Feature", 888902));
   ```
3. Add a case in `handleMatrixCommand(int commandId, Object obj)` to handle ID `888902`.
4. Run `./build.sh`!
