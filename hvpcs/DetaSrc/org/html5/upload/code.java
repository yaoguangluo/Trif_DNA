package DetaSrc.org.html5.upload;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//���� ����Ȩ�� ������
//�ѵ�ͨ ���� VPCS ����������ͼƬ form ���� ����ʾͼƬ��20220821

//�����������������޹�˾
//Copyright 2018~2022.
//�����������������޹�˾. All rights reserved.
//����ʡ ����� ����ֵ� ����������
//������·208�� �����԰С�� ��10������

/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class code{
	//input stream - outputstream test ok
	@SuppressWarnings("resource")
	public static void main(String[] argv) throws IOException, InterruptedException {
		String file= "C:\\Users\\Administrator\\Desktop\\tempIMG"
				+ "\\temp16609361029160.45680025497380305.jpg";
		//String file= "C:\\Users\\Administrator\\Desktop\\tempIMG\\����.jpg";
		String file1= "C:\\Users\\Administrator\\Desktop\\tempIMG"
				+ "\\����20220821711.jpg";
		//FileInputStream fileInputStream= new FileInputStream(file);
		//FileOutputStream fileOutputStream= new FileOutputStream(file1);
		//byte[] bytes= new byte[1024];
		//int len= 0;
		//while((len= fileInputStream.read(bytes))> 0) {
		//	fileOutputStream.write(bytes, 0, len);
		//	Thread.sleep(5);
		//}
		//fileOutputStream.close();
		FileInputStream fileInputStream= new FileInputStream(file);
		FileOutputStream fileOutputStream= new FileOutputStream(file1);
		byte[] bytes= new byte[1024];
		int len= 0;
		while((len= fileInputStream.read(bytes))> 0) {
			System.out.flush();System.out.println(new String(bytes));	
			String string= new String(bytes);
			if(string.contains("image/jpeg\r\n\r\n")) {
				byte[] bytesStrings= "image/jpeg\r\n\r\n".getBytes();
				int position= -1;
				int positionHere= -1;
				int fullLength= bytes.length- bytesStrings.length;
				Here:
					for(int i= 0; i< fullLength; i++ ) {
						position= i;
						for(int j= 0; j< bytesStrings.length; j++ ) {
							if(bytes[i+ j]!= bytesStrings[j]) {
								position= -1;
								continue Here;
							}
						}
						if(position!= -1) {
							positionHere= position;
							break;
						}
					}
				int length= 1024- positionHere- bytesStrings.length;
				byte[] newBytes= new byte[length];
				for(int i= 0; i< length; i++) {
					newBytes[i]= bytes[positionHere+ bytesStrings.length+ i];
				}
				fileOutputStream.write(newBytes);	
			}else if(string.contains("------WebKitFormBoundary")) {
				byte[] bytesStrings= "------WebKitFormBoundary".getBytes();
				int position= -1;
				int positionHere= -1;
				int fullLength= bytes.length- bytesStrings.length;
				Here:
					for(int i= 0; i< fullLength; i++ ) {
						position= i;
						for(int j= 0; j< bytesStrings.length; j++ ) {
							if(bytes[i+ j]!= bytesStrings[j]) {
								position= -1;
								continue Here;
							}
						}
						if(position!= -1) {
							positionHere= position;
							break;
						}
					}
				int length= positionHere;
				byte[] newBytes= new byte[length];
				for(int i= 0; i< length; i++) {
					newBytes[i]= bytes[i];
				}
				fileOutputStream.write(newBytes);	
			}else {
				fileOutputStream.write(bytes, 0, len);
			}
			Thread.sleep(5);
		}
		fileOutputStream.close();
		System.out.flush();System.out.println(new String(bytes));
	}

	//BufferedReader - outputstream test error
	//		public static void main(String[] argv) throws IOException, InterruptedException {
	//String file= "C:\\Users\\Administrator\\Desktop\\tempIMG\\����.jpg";
	//String file1= "C:\\Users\\Administrator\\Desktop\\tempIMG\\����20220821.jpg";
	//Reader reader= new FileReader(file);
	//BufferedReader bufferedReader = new BufferedReader(reader);
	//FileOutputStream fileOutputStream= new FileOutputStream(file1);
	//String string= "";
	//while((string= bufferedReader.readLine())!= null) {
	//	fileOutputStream.write(string.getBytes());
	//	//fileOutputStream.write("\r\n".getBytes());
	//	Thread.sleep(5);
	//}
	//fileOutputStream.close();

	//String file= "C:\\Users\\Administrator\\Desktop\\tempIMG\\����.jpg";
	//String file1= "C:\\Users\\Administrator\\Desktop\\tempIMG\\����202208212.jpg";
	//Reader reader= new FileReader(file);
	//BufferedReader bufferedReader = new BufferedReader(reader);
	//Writer Writer= new FileWriter(file1);
	//BufferedWriter fileOutputStream= new BufferedWriter(Writer);
	//String string= "";
	//StringBuilder stringBuilder= new StringBuilder(); 
	//while((string= bufferedReader.readLine())!= null) {
	//	fileOutputStream.write(string);
	//	Thread.sleep(5);
	//}
	//fileOutputStream.close();
	//		}
}
//super InputStream - outputstream test ok
//	public static void main(String[] argv) throws IOException, InterruptedException {
//String file= "C:/Users/Administrator/Desktop/tempIMG
///temp16609361029160.45680025497380305.jpg";
//String file1= "C:/Users/Administrator/Desktop/tempIMG
///temp16609361029160.45680025497380305out.jpg";
//FileInputStream fileInputStream= new FileInputStream(file);
//FileOutputStream fileOutputStream= new FileOutputStream(file1);
//byte[] bytes= new byte[1024];
//int len= 0;
//while((len= fileInputStream.read(bytes))> 0) {
//	fileOutputStream.write(bytes, 0, len);
//	String string= new String(bytes);
//	System.out.flush();System.out.println(string);
//	Thread.sleep(5);
//}
//fileOutputStream.close();
//	}



//	public static void main1(String[] argv) throws IOException, InterruptedException {
//		String file= "C:\\Users\\Administrator\\git1\\frontend_data\\DetaSrc\\org\\sevlet\\upload\\temp16609361029160.45680025497380305.jpg";
//		RandomAccessFile randomAccessFile= new RandomAccessFile(file, "r");

//String string= "image/jpeg\r\n\r\n";
//String string= "------WebKitFormBoundary";
//		StringBuilder StringBuilder= new StringBuilder();
//		for(int i= 0; i< string.length(); i++) {
//char c= string.charAt(i);
//String binaryString= Integer.toBinaryString(c);
//StringBuilder.append(binaryString);
//		}
//		System.out.flush();System.out.println(StringBuilder.toString());
//1101 0011 1011 0111 0000 1110 0111 1100 1011 0111 1110 1010 1110
//0001 1001 0111 0011 1110 1101 0110 1101 0
//1011 0110 1101 1011 0110 1101 1011 0110 1101 1010 1111 1001 0111
//0001 0100 1011 1101 0011 1101 0010 0011 
//0110 1111 1110 0101 1011 0110 0001 0110 1111 1110 1011 1011 1011
//0010 0110 0001 1110 0101 1110 01

//1 2 4 8 16 32 64 128 256
//bytes to binary
//		String string= "image/jpeg\r\n\r\n";
//		//String string= "------WebKitFormBoundary";
//		StringBuilder stringBuilder= new StringBuilder(); 
//		byte[] bytes= string.getBytes();
//		for(int i= 0; i< bytes.length; i++) {
//for(int j= 8; j> 0; j--) {
//	byte b= bytes[i];
//	byte c= bytes[i];
//	b= (byte) (c>> j);
//	c= (byte) (c>> j);
//	c= (byte) (c>>(1));//11  1
//	c= (byte) (c<<(1));//1 10
//	if(c == b) {
//		stringBuilder.append(0);
//	}else {
//		stringBuilder.append(1);
//	}
//}
//		}
//		System.out.flush();System.out.println(stringBuilder.toString());
//		
//		//HttpPostRequestDecoder decoder 
//= new HttpPostRequestDecoder(new DefaultHttpDataFactory(false), req);
//	}
