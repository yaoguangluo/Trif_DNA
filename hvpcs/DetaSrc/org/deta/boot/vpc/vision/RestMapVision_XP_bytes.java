package DetaSrc.org.deta.boot.vpc.vision;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import src.java.org.lyg.cache.DetaCacheManager;
import src.java.org.lyg.common.utils.GzipUtil;
import DetaSrc.org.deta.boot.sets.StableBlob;
import DetaSrc.org.deta.boot.sets.StableSets;
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
 * */public class RestMapVision_XP_bytes extends RestMapVision {

	// 51-55这段while函数思想来自 这篇文章：
	// https://blog.csdn.net/top_code/article/details/41042413
	// 非常轻松处理len的长度溢出。谢谢。
	public static void processBytes(VPCSRequest vPCSRequest,
			VPCSResponse vPCSResponse) {
		try {
			List<byte[]> list;
			vPCSResponse.dataOutputStream = new DataOutputStream(
					vPCSResponse.socket.getOutputStream());
			if (DetaCacheManager.getCacheOfBytesList(
					vPCSRequest.getRequestFilePath()) != null) {
				list = DetaCacheManager
						.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
			} else {
				// String fileString=
				// URLDecoder.decode(vPCSRequest.getRequestFilePath(),
				// "UTF8");
				String fileString = vPCSRequest.getRequestFilePath();
				File file = new File(fileString);
				vPCSResponse.fileInputStream = new FileInputStream(file);
				vPCSResponse.byteArrayOutputStream = new ByteArrayOutputStream();
				byte[] byteArray = new byte[1024];
				int len = 0;// list = new ArrayList<>();
				list = StableSets.getListPartBytes();
				vPCSResponse.byteArrayOutputStream.flush();
				while ((len = vPCSResponse.fileInputStream.read(byteArray, 0,
						1024)) != -1) {
					vPCSResponse.byteArrayOutputStream.write(byteArray, 0, len);
					vPCSResponse.byteArrayOutputStream.flush();
				}
				vPCSResponse.fileInputStream.close();
				byte[] sniper = GzipUtil.compress(
						vPCSResponse.byteArrayOutputStream.toByteArray());
				long sniper_length = sniper == null ? 0 : sniper.length;
				list.add(("Content-Length: " + sniper_length + " \n")
						.getBytes("UTF8"));
				list.add(
						vPCSResponse.getResponseContentType().getBytes("UTF8"));
				list.add(sniper);
				DetaCacheManager.putCacheOfBytesList(
						vPCSRequest.getRequestFilePath(), list);
			}
			Iterator<byte[]> iterator = list.iterator();
			vPCSResponse.dataOutputStream.flush();
			while (iterator.hasNext()) {
				byte[] bytes = null;
				int i = 0;
				long bytes_length = 0;
				bytes = iterator.next();
				bytes_length = bytes == null ? 0 : bytes.length;
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
			}
			vPCSResponse.dataOutputStream.close();
			System.out.flush();
			System.out.println(vPCSResponse.getHashCode() + " -f");
		} catch (Exception e) {
			System.out.flush();
			System.out.println(e.getMessage());
			System.out.flush();
			System.out
					.println(vPCSResponse.getHashCode() + "-processBytes err");
			System.out.flush();
			System.out.println(vPCSRequest.getRequestLink());
			System.out.flush();
			System.out.println(vPCSRequest.getRequestFilePath());
			StableBlob.addException();
			return;
		}
	}
}
//list.add(0, vPCSResponse.getResponseContentType().getBytes("UTF8"));
// list.add(0, ("Content-Length: " + sniper_length + " \n").getBytes("UTF8"));
// list.add(0, ("Cache-control: max-age=315360000 \n").getBytes("UTF8"));
// list.add(0, ("Content-Encoding:Gzip \n").getBytes("UTF8"));
// list.add(0, "Accept-Ranges: bytes \n".getBytes("UTF8"));
// list.add(0, "Host:deta software  \n".getBytes("UTF8"));
// list.add(0, "HTTP/1.1 200 OK \n".getBytes("UTF8"));