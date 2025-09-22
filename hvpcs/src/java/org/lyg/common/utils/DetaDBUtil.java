/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */
package src.java.org.lyg.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//����Ȩ��, ���� ������
//�����������������޹�˾
public class DetaDBUtil {
	public static String backEndRequest(String request) {
		BufferedReader br;
		HttpURLConnection conn;
		StringBuilder out = new StringBuilder();
		try {
			URL url = new URL("http://localhost:8080/" + request);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			System.out.flush();
			System.out.println("----20000");// ��ֹcleanʧ�ܼ��
			conn.setConnectTimeout(20000);// �Ҳ�����˵ʲô��
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException(
						"Failed : HTTP error code : " + conn.getResponseCode());
			}
			br = new BufferedReader(
					new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String out1 = "";
			// char[] chars= new char[1024];
			// br̫�� ���� buffer
			// br.read(chars, 0, 1024);
			while ((out1 = br.readLine()) != null) {
				if (!out1.isEmpty()) {
					out.append(out1);
				}
			}
//			int size;
//			do {
//				size= br.read(chars, 0, 1024);
//				out.append(chars);
//������������⣬ƾ����Ϊ�߼�����ʦ�ľ��飬Ӧ���� system��output ���� �� console�� �ж��� ������
//			}while(size> 0);
			br.close();
			conn.disconnect();
			return out.toString();
		} catch (Exception e) {
			br = null;
			conn = null;
			out.append(" ");
			System.out.flush();
			System.out.println(e.getMessage());
			// e.printStackTrace();
			return out.toString();
		}
		// return out.toString();
	}

	public static String huaRuiJiRequest(String request) throws IOException {
		System.out.flush();
		System.out.println("request:" + request.length());
		URL url = new URL("http://192.168.2.16:8080/" + request);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setConnectTimeout(20000);
		conn.setRequestProperty("Accept", "application/json");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException(
					"Failed : HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br = new BufferedReader(
				new InputStreamReader((conn.getInputStream()), "UTF-8"));
		String out = "";
		String out1;
		while ((out1 = br.readLine()) != null) {
			out += out1;
		}
		conn.disconnect();
		return out;
	}

	public static String cacheRequest(String request) throws IOException {
		URL url = new URL("http://localhost:6379/" + request);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setConnectTimeout(20000);
		conn.setRequestProperty("Accept", "application/json;charset=utf-8");
		conn.setRequestProperty("Content-Type",
				"application/json;charset=utf-8");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException(
					"Failed : HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br = new BufferedReader(
				new InputStreamReader((conn.getInputStream()), "UTF-8"));
		String out = "";
		String out1;
		while ((out1 = br.readLine()) != null) {
			out += out1;
		}
		conn.disconnect();
		return out;
	}

	public static String DBRequest(String request) throws IOException {
		String out = "";
		try {
			URL url = new URL("http://localhost:3306/" + request);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setConnectTimeout(20000);
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException(
						"Failed : HTTP error code : " + conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(
					new InputStreamReader((conn.getInputStream()), "UTF-8"));
			String out1;
			while ((out1 = br.readLine()) != null) {
				out += out1;
			}
			conn.disconnect();
			return out;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return out;
	}
}