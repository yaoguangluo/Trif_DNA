package ME.VPC.utils;

import S_A.SVQ.stable.S_File;

import java.util.StringTokenizer;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class SetLib {
    public SetLib() {
        S_File.DNA_PDN.put(this.getClass().getCanonicalName(), true);
        //String libname=".dll";
        String libpath = System.getProperty("java.library.path");
        if (libpath == null || libpath.length() == 0) {
            throw new RuntimeException("lib path is null");
        }
        System.out.println(System.getProperty("java.library.path"));
        //	String path= null;
        StringTokenizer st = new StringTokenizer(libpath
                , System.getProperty("path.separator"));
        if (st.hasMoreElements()) {
            //	path=st.nextToken();
        } else {
            throw new RuntimeException("cant split libpath:" + libpath);
        }
        //InputStream is= ConvertWord2HM
    }

    public static void main(String[] args) {
        new SetLib();
    }
}