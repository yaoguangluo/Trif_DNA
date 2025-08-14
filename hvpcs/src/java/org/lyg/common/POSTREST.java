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
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */
//refer java.net ��Ƥ��
public class POSTREST {
	public String postJson(String urlString, String jsonString) throws IOException {
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
		//requestBody=connection.getInputStream();
		String requestBody = "";
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		try {
			InputStream inputStream = connection.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
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


	public String postXML(String urlString, String XMLString) throws IOException {
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

		//requestBody=connection.getInputStream();

		String requestBody = "";
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		try {
			InputStream inputStream = connection.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
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

	public String postJsonWithSercurity(String urlString, String jsonString) throws IOException {
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

		//requestBody=connection.getInputStream();

		String requestBody = "";
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		try {
			InputStream inputStream = connection.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
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

	public String postXMLWithSercurity(String urlString, String XMLString) throws IOException {
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

		//requestBody=connection.getInputStream();

		String requestBody = "";
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		try {
			InputStream inputStream = connection.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
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