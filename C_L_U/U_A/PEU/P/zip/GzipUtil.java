package U_A.PEU.P.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

//作者： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class GzipUtil {
    // 压缩
    public static byte[] compress(byte[] data) {
        if (null == data || 0 == data.length) {
            return null;
        }
        byte[] ret;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = null;
        try {
            gzip = new GZIPOutputStream(out);
            gzip.write(data);
            gzip.finish();
            gzip.close();
            ret = out.toByteArray();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ret;//out.toString("ISO-8859-1");
    }
    public static byte[] compress(String str, String stringTypes) {
        if (null == str || 0 == str.length()) {
            return null;
        }
        try {
            return compress(str.getBytes(stringTypes));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    public static byte[] uncompress(byte[] data) {
        if (null == data || 0 == data.length) {
            return data;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        GZIPInputStream gunzip = null;
        try {
            gunzip = new GZIPInputStream(in);
            byte[] buffer = new byte[256];
            int n;
            while ((n = gunzip.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
            gunzip.close();
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return out.toByteArray();
    }
}
//--------------------- 
//作者：树先生i , 罗瑶光进行了修正。
//来源：CSDN 
//原文：https://blog.csdn.net/qq_18895659/article/details/72190322 
//版权声明：本文为博主原创文章, 转载请附上博文链接！
