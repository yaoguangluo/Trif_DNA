package test.java.interfaces.net.http.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import I_Q.hvpcs.html5.upload.FileUploaderSimpleDNA;
import I_Q.hvpcs.lyg.common.utils.GzipUtil;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */

//--思考为什么用list这段函数里
//--罗瑶光
public class RestHVPCS {
	public static void main(String[] args) throws IOException,
		InterruptedException {
		FileUploaderSimpleDNA.newADNAMap(null);
		new RestHvpcsServer(null).start();
		//
		Thread.sleep(8000);
		//test
		S_logger.Log.logger.info("--test");
		URL url;
		ArrayList<Byte> list = new ArrayList<>();
		try {
			url = new URL("http://localhost:" + "8000" + "/"
				+ "index.html");
			HttpURLConnection conn = (HttpURLConnection) url
				.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException(
					"Failed : HTTP error code : " + conn
						.getResponseCode());
			}
			InputStream br = conn.getInputStream();
			byte[] bytes = new byte[1024];
			int len = 0;
			while ((len = br.read(bytes)) != -1) {
				byte[] bytesTemp = new byte[len];
				for (int i = 0; i < len; i++) {
					bytesTemp[i] = bytes[i];
					list.add(bytesTemp[i]);
				}
			}
			conn.disconnect();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		byte[] bytes = new byte[list.size()];
		Iterator<Byte> iterators = list.iterator();
		int count = 0;
		while (iterators.hasNext()) {
			bytes[count++] = iterators.next();
		}
		byte[] bs = GzipUtil.uncompress(bytes);
		S_logger.Log.logger.info(new String(bs));
		S_logger.Log.logger.info("--end");
		// Thread.sleep(30000);
		//输出正确，注意编码格式UTF8，我稍后修正。	
		//我hvpcs是走gzip，所以还要解压。
		//对了我2018年后就再也没有用过Jboss MVC spring 等web引擎了。
	}
}
//--思考为什么用list这段函数里
//10月 16, 2025 11:10:02 上午 test.java.interfaces.net.http.socket.RestHVPCS main
//信息: 12345678
//10月 16, 2025 11:10:02 上午 test.java.interfaces.net.http.socket.RestHVPCS main
//信息: --end