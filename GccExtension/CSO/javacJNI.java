package CSO;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

//java shell c so call jni-jna demo
public class javacJNI {
    public static void main(String[] strings) {
        try {
            //gcc -fPIC -shared -o libapi.so api.c
            //gcc -dynamiclib -o libtest.dylib TestJNI.c
            String GccPath = "gcc";
            String projectPath = "PythonExtension/CSO/";
            File cFile = new File(projectPath + "HelloWorld.dylib.c");
            String cStringPath = cFile.getCanonicalPath()
                    .replace(cFile.getPath(), "" + cFile.getPath());
            File sFile = new File(projectPath + "HelloWorld.dylib.dylib");
            String sStringPath = sFile.getCanonicalPath()
                    .replace(sFile.getPath(), "" + sFile.getPath());
            //gcc -fPIC CSO_Test.c -o example.so -shared -I
//            String test = GccPath +
//                    " -fPIC " +
//                    cStringPath +
//                    " -o " +
//                    sStringPath +
//                    " -shared -I ";
//            String test = GccPath +
//                    " -fPIC -shared -o " +
//                    sStringPath +
//                    " " +
//                    cStringPath;
            String test = GccPath +
                    " -dynamiclib -o " +
                    sStringPath
                    + " " + cStringPath;
            System.out.println(test);
            Process sr = Runtime.getRuntime().exec(test);
            BufferedReader cin = new BufferedReader(new InputStreamReader(sr
                    .getInputStream()));
            String cline;
            while ((cline = cin.readLine()) != null) {
                System.out.println(cline);
            }
            cin.close();
            sr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}