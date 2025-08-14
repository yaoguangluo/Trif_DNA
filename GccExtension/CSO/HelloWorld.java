package CSO;

import java.io.File;
import java.io.IOException;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 * */
//demo调通。准备接口化编码。明年，华瑞集3.0
public class HelloWorld {
    static {
        //Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/project/TinOS/PythonExtension/CSO/HelloWorld.dylib
        String projectPath = "PythonExtension/CSO/";
        File cFile = new File(projectPath + "jni/HelloWorld.dylib");
        String cStringPath = null;
        try {
            cStringPath = cFile.getCanonicalPath()
                .replace(cFile.getPath(), "" + cFile.getPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cStringPath);
        System.load(cStringPath);
    }

    public static native void main(int argc, String[] argv);

    public static void main(String[] args) {
        String[] argv = new String[3];
        argv[0] = "10";
        argv[1] = "11";
        argv[2] = "12";
        HelloWorld.main(3, argv);
    }
//   public static void main(String[] args) {
//      //compile
//      String GccPath = "gcc";
//      String projectPath = "PythonExtension/CSO/";
//      String FileName = "HelloWorld.dylib";
//      String FileTail = ".c";
//      String FileOut = "./";
//      String[] argv = new String[2];
//      argv[0] = "101";
//      argv[1] = "102";
//      try {
//         File cFile = new File(projectPath + FileName + FileTail);
//         String cStringPath = cFile.getCanonicalPath()
//             .replace(cFile.getPath(), "" + cFile.getPath());
//         String test = GccPath +
//             " -DDEBUG=100 " +
//             cStringPath +
//             " -o " +
//             cStringPath.replace(FileName + FileTail, FileName);
//         System.out.println(test);
//         Process sr = Runtime.getRuntime().exec(test);
//         BufferedReader cin = new BufferedReader(new InputStreamReader(sr
//             .getInputStream()));
//         String cline;
//         while ((cline = cin.readLine()) != null) {
//            System.out.println(cline);
//         }
//         cin.close();
//         sr.waitFor();
//         System.out.println("end");
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//      //shell
//      try {
//         File cFile = new File(projectPath + FileOut + FileName);
//         String cStringPath = cFile.getCanonicalPath()
//             .replace(cFile.getPath(), "" + cFile.getPath());
//         String test = cStringPath;
//         System.out.println(test);
//         Process sr = Runtime.getRuntime().exec(test
//             + " " + argv[0] + " " + argv[1]);
//         BufferedReader cin = new BufferedReader(new InputStreamReader(sr
//             .getInputStream()));
//         String cline;
//         while ((cline = cin.readLine()) != null) {
//            System.out.println(cline);
//         }
//         cin.close();
//         sr.waitFor();
//         System.out.println("end");
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//   }
}