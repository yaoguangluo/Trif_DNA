package M_V.MSU.AMS.VQS.SQV.SI.OSU.SMV.http;

import S_A.ESU.code.stable.S_;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestCall_X_getJson {
	public static String _E(String urlString, String jsonString) {
		String code = S_.STRING_EMPTY;
		URL url;
		StringBuilder stringBuilder;
		try {
			url = new URL(urlString);

			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestMethod(S_.HTTP_GET);
			connection.setRequestProperty(S_.CONTENT_TYPE,
					S_.APPLICATION_JSON_UTF8);
			connection.setDoOutput(true);
			connection.setInstanceFollowRedirects(false);
			OutputStream os = connection.getOutputStream();
			os.write(jsonString.getBytes());
			os.flush();
			stringBuilder = new StringBuilder();
			DetaBufferedReader DetaBufferedReader = null;
			try {
				InputStream inputStream = connection.getInputStream();
				int caherset_size = connection.getHeaderFields().size();
				for (int i = 0; i < caherset_size; i++) {
					String temp = connection.getHeaderField(i);
					if (temp.contains(S_.CHARSET)) {
						if (temp.toUpperCase().contains(S_.CHARSET_UTF8)) {
							code = S_.CHARSET_UTF8;
						}
						if (temp.toUpperCase().contains(S_.CHARSET_UTF_8)
								|| temp.toUpperCase()
										.contains(S_.CHARSET_UTF8)) {
							code = S_.CHARSET_UTF_8;
						}
						if (temp.toUpperCase().contains(S_.CHARSET_GB2312)) {
							code = S_.CHARSET_GB2312;
						}
						if (temp.toUpperCase().contains(S_.CHARSET_ASCII)) {
							code = S_.CHARSET_ASCII;
						}
						if (temp.toUpperCase().contains(S_.CHARSET_UNICODE)) {
							code = S_.CHARSET_UNICODE;
						}
						if (temp.toUpperCase()
								.contains(S_.CHARSET_ISO_8859_1)) {
							code = S_.CHARSET_ISO_8859_1;
						}
					}
				}
				if (null != inputStream) {
					DetaBufferedReader = new DetaBufferedReader(
							DetaInputStreamReader.E(inputStream, code));
					String lines;
					while ((lines = DetaBufferedReader
							.readDetaLine()) != null) {
						stringBuilder.append(lines);
					}
				} else {
					stringBuilder.append(S_.STRING_EMPTY);
				}
			} catch (IOException ex) {
				// throw ex;
			} finally {
				if (null != DetaBufferedReader) {
					try {
						DetaBufferedReader.close();
					} catch (IOException ex) {
						// throw ex;
					}
				}
			}
			return new String(stringBuilder.toString().getBytes(),
					StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
