package src.java.org.lyg.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
//import org.jboss.resteasy.spi.HttpRequest;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//refer java.net ��Ƥ��
public class POSTREST {
	public String postJson(String urlString, String jsonString)
			throws IOException {
		URL url = new URL(urlString);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append(jsonString);
		OutputStream os = connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush();
		// requestBody=connection.getInputStream();
		String requestBody = "";
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		try {
			InputStream inputStream = connection.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(
						new InputStreamReader(inputStream));
				char[] charBuffer = new char[128];
				int bytesRead = -1;
				while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append("");
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					throw ex;
				}
			}
		}
		requestBody = stringBuilder.toString();
		return requestBody;

	}

	public String postXML(String urlString, String XMLString)
			throws IOException {
		URL url = new URL(urlString);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/xml");
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);

		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append(XMLString);
		OutputStream os = connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush();

		// requestBody=connection.getInputStream();

		String requestBody = "";
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		try {
			InputStream inputStream = connection.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(
						new InputStreamReader(inputStream));
				char[] charBuffer = new char[128];
				int bytesRead = -1;
				while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append("");
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					throw ex;
				}
			}
		}
		requestBody = stringBuilder.toString();
		return requestBody;

	}

	public String postJsonWithSercurity(String urlString, String jsonString)
			throws IOException {
		URL url = new URL(urlString);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");

		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);

		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append(jsonString);
		OutputStream os = connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush();

		// requestBody=connection.getInputStream();

		String requestBody = "";
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		try {
			InputStream inputStream = connection.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(
						new InputStreamReader(inputStream));
				char[] charBuffer = new char[128];
				int bytesRead = -1;
				while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append("");
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					throw ex;
				}
			}
		}
		requestBody = stringBuilder.toString();
		return requestBody;

	}

	public String postXMLWithSercurity(String urlString, String XMLString)
			throws IOException {
		URL url = new URL(urlString);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/xml");
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);

		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append(XMLString);
		OutputStream os = connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush();

		// requestBody=connection.getInputStream();

		String requestBody = "";
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		try {
			InputStream inputStream = connection.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(
						new InputStreamReader(inputStream));
				char[] charBuffer = new char[128];
				int bytesRead = -1;
				while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append("");
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					throw ex;
				}
			}
		}
		requestBody = stringBuilder.toString();
		return requestBody;

	}
//	///*
//	public String getRaw(HttpRequest request) throws IOException {
//		String requestBody = "";
//		StringBuilder stringBuilder = new StringBuilder();
//		BufferedReader bufferedReader = null;
//		try {
//			InputStream inputStream = request.getInputStream();
//			if (inputStream != null) {
//				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//				char[] charBuffer = new char[128];
//				int bytesRead = -1;
//				while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
//					stringBuilder.append(charBuffer, 0, bytesRead);
//				}
//			} else {
//				stringBuilder.append("");
//			}
//		} catch (IOException ex) {
//			throw ex;
//		} finally {
//			if (bufferedReader != null) {
//				try {
//					bufferedReader.close();
//				} catch (IOException ex) {
//					throw ex;
//				}
//			}
//		}
//		requestBody = stringBuilder.toString();
//		return requestBody;
//
//	}

	@SuppressWarnings("unused")
	public String getStatusFromString(String response) {
		String temp = "";
		for (int i = 0; i < response.length(); i++) {
		}
		// TODO Auto-generated method stub
		return null;
	}
}