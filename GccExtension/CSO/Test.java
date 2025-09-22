package CSO;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 * */
//demo调通。准备接口化编码。明年，华瑞集3.0
public class Test {
    static {
//        String projectPath = "PythonExtension/CSO/";
//        File cFile = new File(projectPath + "CSO_Test");
//        String cStringPath = null;
//        try {
//            cStringPath = cFile.getCanonicalPath()
//                .replace(cFile.getPath(), "" + cFile.getPath());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.loadLibrary(cStringPath);
        System.setProperty("java.library.path", ".");
        //System.loadLibrary("CSO_Test");
    }

    public native void add(int va);

    public static void main(String[] args) {
        String[] argv = new String[3];
        argv[0] = "10";
        argv[1] = "11";
        argv[2] = "12";
        new Test().add(3);
    }
}