package patcher;

import javassist.*;
import javassist.expr.*;

public class Patcher {
    public static void main(String[] args) {
        String inputJarPath = args.length > 0 ? args[0] : "input/NinjaSchool_217w.jar";
        String modBuildPath = args.length > 1 ? args[1] : "build_output/classes";
        String outputPath = args.length > 2 ? args[2] : "build_output/patched_classes";

        try {
            System.out.println("[MTX-API Patcher] Loading bytecode workspace...");
            ClassPool pool = ClassPool.getDefault();
            pool.insertClassPath(inputJarPath);
            pool.insertClassPath("lib/midpapi20.jar");
            pool.insertClassPath("lib/cldcapi11.jar");
            pool.insertClassPath(modBuildPath);

            // 1. Hook Main Menu Creation: Insert MatrixAPI as option 0 inside dg.ah()
            System.out.println("[MTX-API Patcher] Injecting MatrixAPI as VERY FIRST menu item into dg.ah()...");
            CtClass dgClass = pool.get("dg");
            CtMethod ahMethod = dgClass.getDeclaredMethod("ah");
            ahMethod.instrument(new ExprEditor() {
                public void edit(MethodCall m) throws CannotCompileException {
                    if (m.getMethodName().equals("a") && m.getClassName().equals("ds")) {
                        m.replace("{ mod.MatrixAPI.addMatrixMenuItem($1); $_ = $proceed($$); }");
                    }
                }
            });

            // 2. Hook Command Handler: Insert MatrixAPI command handler into dg.b(int, Object)
            System.out.println("[MTX-API Patcher] Injecting MatrixAPI command handler into dg.b(int, Object)...");
            CtClass[] paramsB = new CtClass[]{ CtClass.intType, pool.get("java.lang.Object") };
            CtMethod bMethod = dgClass.getDeclaredMethod("b", paramsB);
            bMethod.insertBefore("{"
                + "  if (mod.MatrixAPI.handleMatrixCommand($1, $2)) return;"
                + "  mod.MatrixAPI.logCommand($1);"
                + "}");

            // 3. Hook Player Info Screen Render in dg.o(t)
            System.out.println("[MTX-API Patcher] Injecting Player Info Console Logger into dg.o(t)...");
            try {
                CtMethod oMethod = dgClass.getDeclaredMethod("o", new CtClass[]{ pool.get("t") });
                oMethod.insertBefore("{ if (dg.aV != null && mod.MatrixAPI.checkAndHandleWebInspect(dg.aV)) return; }");
            } catch (Exception ex) {
                System.out.println("[MTX-API Patcher] Warning: Failed to hook dg.o(t): " + ex.getMessage());
            }
            dgClass.writeFile(outputPath);

            // 4. Hook Inbound Network Packet Listener in an.a(ce)
            System.out.println("[MTX-API Patcher] Injecting Inbound Network Packet Logger into an.a(ce)...");
            CtClass anClass = pool.get("an");
            try {
                CtMethod recvPacketMethod = anClass.getDeclaredMethod("a", new CtClass[]{ pool.get("ce") });
                recvPacketMethod.insertBefore("{ if ($1 != null) mod.MatrixAPI.onPacketReceived($1); }");
            } catch (Exception ex) {
                System.out.println("[MTX-API Patcher] Warning: Failed to hook an.a(ce): " + ex.getMessage());
            }
            anClass.writeFile(outputPath);

            // 5. Hook Key Press Events in main.b.keyPressed(int)
            System.out.println("[MTX-API Patcher] Injecting Deep Logging into main.b.keyPressed()...");
            CtClass mainBClass = pool.get("main.b");
            CtMethod keyPressedMethod = mainBClass.getDeclaredMethod("keyPressed");
            keyPressedMethod.insertBefore("{ mod.MatrixAPI.logKey($1); }");
            mainBClass.writeFile(outputPath);

            // 6. Hook Outbound Network Packet Logger in dh.a(ce)
            System.out.println("[MTX-API Patcher] Injecting Outbound Network Packet Logger into dh.a(ce)...");
            CtClass dhClass = pool.get("dh");
            CtMethod sendPacketMethod = dhClass.getDeclaredMethod("a", new CtClass[]{ pool.get("ce") });
            sendPacketMethod.insertBefore("{ if ($1 != null && $1.a() != null) mod.MatrixAPI.logPacketSend($1.a, $1.a().length); }");
            dhClass.writeFile(outputPath);

            // 7. Hook Notice Dialogs in main.a.a(String) and br.a(String, bd, bd, bd)
            System.out.println("[MTX-API Patcher] Injecting Notice Dialog Logger into main.a.a(String)...");
            CtClass mainAClass = pool.get("main.a");
            CtMethod noticeMethod = mainAClass.getDeclaredMethod("a", new CtClass[]{ pool.get("java.lang.String") });
            noticeMethod.insertBefore("{ if ($1 != null && $1.length() > 0 && mod.MatrixAPI.handleNoticeDialog($1)) return; }");
            mainAClass.writeFile(outputPath);

            System.out.println("[MTX-API Patcher] Injecting Notice Dialog Logger into br.a(String, bd, bd, bd)...");
            CtClass brClass = pool.get("br");
            CtMethod brMethod = brClass.getDeclaredMethod("a", new CtClass[]{ pool.get("java.lang.String"), pool.get("bd"), pool.get("bd"), pool.get("bd") });
            brMethod.insertBefore("{ if ($1 != null && $1.length() > 0 && mod.MatrixAPI.handleNoticeDialog($1)) return; }");
            brClass.writeFile(outputPath);

            System.out.println("[MTX-API Patcher] Injecting Ticker Notice Logger into ae.a(String) & ae.a(String, int, dd)...");
            CtClass aeClass = pool.get("ae");
            CtMethod aeMethod1 = aeClass.getDeclaredMethod("a", new CtClass[]{ pool.get("java.lang.String") });
            aeMethod1.insertBefore("{ if ($1 != null && $1.length() > 0 && mod.MatrixAPI.handleNoticeDialog($1)) return; }");

            CtMethod aeMethod2 = aeClass.getDeclaredMethod("a", new CtClass[]{ pool.get("java.lang.String"), CtClass.intType, pool.get("dd") });
            aeMethod2.insertBefore("{ if ($1 != null && $1.length() > 0 && mod.MatrixAPI.handleNoticeDialog($1)) return; }");
            aeClass.writeFile(outputPath);

            System.out.println("[MTX-API Patcher] MatrixAPI Instrumentation successfully completed!");
        } catch (Exception e) {
            System.err.println("[MTX-API Patcher] Patching Failed!");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
