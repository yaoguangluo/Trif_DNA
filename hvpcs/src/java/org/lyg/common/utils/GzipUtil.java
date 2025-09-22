/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
package src.java.org.lyg.common.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;

public class GzipUtil {
	// ѹ��
	public static byte[] compress(byte[] data) throws IOException {
		if (data == null || data.length == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(out);
		gzip.write(data);
		gzip.finish();
		gzip.close();
		byte[] ret = out.toByteArray();
		out.close();
		return ret;// out.toString("ISO-8859-1");
	}

	public static byte[] compress(String str, String stringTypes)
			throws IOException {
		if (str == null || str.length() == 0) {
			return null;
		}
		return compress(str.getBytes(stringTypes));
	}

	public static byte[] uncompress(byte[] data) throws IOException {
		if (data == null || data.length == 0) {
			return data;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(data);
		GZIPInputStream gunzip = new GZIPInputStream(in);
		byte[] buffer = new byte[256];
		int n;
		while ((n = gunzip.read(buffer)) >= 0) {
			out.write(buffer, 0, n);
		}
		gunzip.close();
		in.close();
		return out.toByteArray();
	}
	// ---------------------
	// ���ߣ�������i , �����������������
	// ��Դ��CSDN
	// ԭ�ģ�https://blog.csdn.net/qq_18895659/article/details/72190322
	// ��Ȩ����������Ϊ����ԭ�����£�ת���븽�ϲ������ӣ�
	// **************************************************************************

	// ������
	@SuppressWarnings({ "static-access", "deprecation" })
	public static String uncompressHTTPURL(String data) throws IOException {
		return new URLDecoder().decode(data);
	}

	// ������
	public static byte[] uncompressInflaterOutputStream(byte[] data)
			throws IOException {
		if (data == null || data.length == 0) {
			return data;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(data);
		InflaterInputStream gunzip = new InflaterInputStream(in);
		byte[] buffer = new byte[256];
		int n;
		while ((n = gunzip.read(buffer)) >= 0) {
			out.write(buffer, 0, n);
		}
		gunzip.close();
		in.close();
		return out.toByteArray();
	}
}
