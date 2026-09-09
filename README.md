# ⚡ MTX-API — Ninja School Online Modding Framework

A lightweight, automated bytecode-injection modding environment for Ninja School Online J2ME (`NinjaSchool_217w.jar`).

> 📘 **Full Technical Reference:** Read [MODDING_GUIDE.md](MODDING_GUIDE.md) for deep details on how the game was reverse-engineered, tools used, bytecode hooks, packet protocol, and stat extraction.

---

## 📁 Repository Structure

```
mtx-api/
├── build.sh                             # One-click build & patch script
├── MODDING_GUIDE.md                     # Complete reverse-engineering & modding guide
├── README.md                            # Quick start overview
├── input/
│   └── NinjaSchool_217w.jar             # Clean original J2ME JAR file
├── lib/                                 # Build tools & API stubs
│   ├── javassist.jar                    # Bytecode manipulation engine
│   ├── ecj.jar                          # Eclipse Java Compiler
│   ├── midpapi20.jar                    # J2ME MIDP 2.0 API stubs
│   └── cldcapi11.jar                    # J2ME CLDC 1.1 API stubs
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
│       └── Patcher.java                 # Javassist bytecode instrumenter
└── dist/
    └── NinjaSchool_217w_MatrixMOD.jar   # Final runnable, patched game JAR
```

---

## 🚀 How to Build

Run the automated build script from the `mtx-api` directory:

```bash
cd mtx-api
chmod +x build.sh
./build.sh
```

The compiled and patched game JAR will be generated in `dist/mtx-api.jar`.

---

## 🛠 Features Implemented in MatrixAPI

* **Top Menu Entry:** `MatrixAPI` inserted at Option 0 of the main game menu.
* **Inspect Player Target:** Remote programmatic player inspection via J2ME text input box (`main.a.L`).
* **Packet 93 Dispatch:** Remote lookup by character name string (`dq.a().a(name, 0)`).
* **Console Logging Engine:** Logs all 18 profile stats (**Level, Class, School, HP, MP, Speed, Attack, Resistances, Dodge, Critical, Counter Stats, Chakra**) directly to the terminal console without log flooding.
