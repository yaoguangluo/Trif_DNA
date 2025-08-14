//package VPC.VQS.DSU.utils.Gzip;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.util.zip.GZIPOutputStream;
//
/*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
// * */
//public class GzipUtil_X_compress {
//    // 压缩
//    public static byte[] _E(byte[] data) {
//        if (data == null || data.length == 0) {
//            return null;
//        }
//        byte[] ret;
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        GZIPOutputStream gzip = null;
//        try {
//            gzip = new GZIPOutputStream(out);
//            gzip.write(data);
//            gzip.finish();
//            gzip.close();
//            ret = out.toByteArray();
//            out.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return ret;//out.toString("ISO-8859-1");
//    }
//
//    public static byte[] _E(String str, String stringTypes) {
//        if (str == null || str.length() == 0) {
//            return null;
//        }
//        try {
//            return _E(str.getBytes(stringTypes));
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
////apache 2.0: refer GZIP 官方压缩 demo
////另外refer 哈夫曼 先生.
////---------------------
////作者：树先生i , 罗瑶光进行了修正。
////来源：CSDN
////原文：https://blog.csdn.net/qq_18895659/article/details/72190322
////版权声明：本文为博主原创文章, 转载请附上博文链接！
