package DetaSrc.org.deta.boot.vpc.vision;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import src.java.org.lyg.cache.DetaCacheManager;
import src.java.org.lyg.common.utils.GzipUtil;
import DetaSrc.org.deta.boot.sets.StableBlob;
import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */public class RestMapVision_XP_bufferBytes extends RestMapVision {

	public static void processBufferBytes(VPCSRequest vPCSRequest,
			VPCSResponse vPCSResponse) {
		try {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("HTTP/1.1 200 OK").append("\n");
			stringBuilder.append("Host:deta software  \n");
			stringBuilder.append("Cache-control: max-age=315360000 \n");
			stringBuilder.append("Content-Encoding:gzip \n");
			stringBuilder.append(vPCSResponse.getResponseContentType());
			String builderToString = stringBuilder.toString();
			String contentBuilderToString;
			if (DetaCacheManager.getCacheOfString(
					vPCSRequest.getRequestFilePath()) != null) {
				contentBuilderToString = DetaCacheManager
						.getCacheOfString(vPCSRequest.getRequestFilePath());
			} else {
				StringBuilder contentBuilder = new StringBuilder();
				File file = new File(vPCSRequest.getRequestFilePath());
				vPCSResponse.fileInputStream = new FileInputStream(file);
				int len = 0;
				byte[] byteArray = new byte[1024];
				while ((len = vPCSResponse.fileInputStream
						.read(byteArray)) != -1) {
					contentBuilder
							.append(new String(byteArray, 0, len, "UTF-8"));
				}
				vPCSResponse.fileInputStream.close();
				Thread.sleep(75);
				contentBuilderToString = contentBuilder.toString();
				DetaCacheManager.putCacheOfString(
						vPCSRequest.getRequestFilePath(),
						contentBuilderToString);
			}
			vPCSResponse.dataOutputStream = new DataOutputStream(
					vPCSResponse.socket.getOutputStream());
			vPCSResponse.dataOutputStream.flush();
			vPCSResponse.dataOutputStream
					.write(builderToString.getBytes("UTF8"));
			Thread.sleep(75);
			byte[] bytes = null;
			int i = 0;
			long bytes_length = 0;
			bytes = GzipUtil.compress(contentBuilderToString.getBytes("UTF8"));
			bytes_length = bytes == null ? 0 : bytes.length;
			vPCSResponse.dataOutputStream.flush();
			if (bytes_length > 10000) {
				int last = bytes.length % 10000;
				for (i = 0; i < bytes.length - 10000; i += 10000) {
					byte[] serparBytes = new byte[10000];
					for (int j = 0; j < 10000; j++) {
						serparBytes[j] = bytes[i + j];
					}
					vPCSResponse.dataOutputStream.write(serparBytes);
					vPCSResponse.dataOutputStream.flush();
				}
				byte[] serparBytes = new byte[last];
				for (int j = 0; j < last; j++) {
					serparBytes[j] = bytes[i + j];
				}
				vPCSResponse.dataOutputStream.write(serparBytes);
				vPCSResponse.dataOutputStream.flush();
			} else if (bytes_length > 0) {
				vPCSResponse.dataOutputStream.write(bytes);
				vPCSResponse.dataOutputStream.flush();
			}
			vPCSResponse.dataOutputStream.close();
			System.out.flush();
			System.out.println(vPCSResponse.getHashCode() + "-f");
		} catch (Exception e) {
			System.out.flush();
			System.out.println(e.getMessage());
			System.out.flush();
			System.out.println(vPCSResponse.getHashCode()
					+ "-processBufferBytes dataOutputStream err");
			System.out.flush();
			System.out.println(vPCSRequest.getRequestLink());
			System.out.flush();
			System.out.println(vPCSRequest.getRequestFilePath());
			StableBlob.addException();
			return;
		}
	}
}