package DetaSrc.org.html5.upload;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
//�����������Javascriptǰ��socket����������ͨѶ������Э��
//���� ����Ȩ�� ������ 20220819-0-30~ 20220820-0-27
//˼�� socket ����ͨѶ, java �ļ���д��
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class FileUploaderSimpleBackUp{
//	public static void processForm(VPCSRequest vPCSRequest
//			, VPCSResponse vPCSResponse) throws IOException, InterruptedException {
//		//ȫ��д�������ļ�
//		InputStream inputStream = null;
//		inputStream= vPCSResponse.getSocket().getInputStream();
//		String outPath= "C:/Users/Administrator/Desktop/tempIMG/"; 
//		String fileName= "temp"+ System.currentTimeMillis()+ Math.random()+ ".jpg"; 
//		//�ļ��н���
//		File fileCategory= new File(outPath);
//		if (!fileCategory.exists()&& !fileCategory.isFile()) { 
//			fileCategory.mkdirs();
//		}
//		int length= 0;
//		int count= 0;
//		byte[] bytes= new byte[1024];
//		File file= new File(outPath+ fileName);
//		FileOutputStream fileOutputStream= new FileOutputStream(file);
//		while((length= inputStream.read(bytes))> 0) {//��ͷ
//			fileOutputStream.write(bytes, 0, length);
//			if(count++> 15) {
//				count= 0;
//				Thread.sleep(1);
//			}
//		}
//		fileOutputStream.close();
//		//�ļ��ü�
//
//		//�ļ�����
//
//		//���
//	}
	
	public static void processForm(InputStream inputStream, byte[] bytesIn
			, String type) throws IOException, InterruptedException {
		//ȫ��д�������ļ�
//		InputStream inputStream = null;
//		inputStream= vPCSResponse.getSocket().getInputStream();
		String outPath= "C:/Users/Administrator/Desktop/tempIMG/"; 
		String fileName= "temp"+ System.currentTimeMillis()+ (int)(Math.random()*10000000)+ type; 
		//�ļ��н���
		File fileCategory= new File(outPath);
		if (!fileCategory.exists()&& !fileCategory.isFile()) { 
			fileCategory.mkdirs();
		}
		int length= 0;
		byte[] bytes= new byte[1024];
		File file= new File(outPath+ fileName);
		FileOutputStream fileOutputStream= new FileOutputStream(file);
		String stringIn= new String(bytesIn);
		if(stringIn.contains("image/jpeg\r\n\r\n")) {
			byte[] bytesStrings= "image/jpeg\r\n\r\n".getBytes();
			int position= -1;
			int positionHere= -1;
			int fullLength= bytesIn.length- bytesStrings.length;
			Here:
				for(int i= 0; i< fullLength; i++) {
					position= i;
					for(int j= 0; j< bytesStrings.length; j++) {
						if(bytesIn[i+ j]!= bytesStrings[j]) {
							position= -1;
							continue Here;
						}
					}
					if(position!= -1) {
						positionHere= position;
						break;
					}
				}
			int len= 1600- positionHere- bytesStrings.length;
			byte[] newBytes= new byte[len];
			for(int i= 0; i< len; i++) {
				newBytes[i]= bytesIn[positionHere+ bytesStrings.length+ i];
			}
			fileOutputStream.write(newBytes);	
		}
		if(stringIn.contains("image/png\r\n\r\n")) {
			byte[] bytesStrings= "image/png\r\n\r\n".getBytes();
			int position= -1;
			int positionHere= -1;
			int fullLength= bytesIn.length- bytesStrings.length;
			Here:
				for(int i= 0; i< fullLength; i++) {
					position= i;
					for(int j= 0; j< bytesStrings.length; j++) {
						if(bytesIn[i+ j]!= bytesStrings[j]) {
							position= -1;
							continue Here;
						}
					}
					if(position!= -1) {
						positionHere= position;
						break;
					}
				}
			int len= 1600- positionHere- bytesStrings.length;
			byte[] newBytes= new byte[len];
			for(int i= 0; i< len; i++) {
				newBytes[i]= bytesIn[positionHere+ bytesStrings.length+ i];
			}
			fileOutputStream.write(newBytes);	
		}
		while((length= inputStream.read(bytes))> 0) {//��ͷ
			//System.out.flush();System.out.println(new String(bytes));	
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
				int len= 1024- positionHere- bytesStrings.length;
				byte[] newBytes= new byte[len];
				for(int i= 0; i< len; i++) {
					newBytes[i]= bytes[positionHere+ bytesStrings.length+ i];
				}
				fileOutputStream.write(newBytes);	
			}else if(string.contains("image/png\r\n\r\n")) {
				byte[] bytesStrings= "image/png\r\n\r\n".getBytes();
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
				int len= 1024- positionHere- bytesStrings.length;
				byte[] newBytes= new byte[len];
				for(int i= 0; i< len; i++) {
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
				int len= positionHere;
				byte[] newBytes= new byte[len];
				for(int i= 0; i< len; i++) {
					newBytes[i]= bytes[i];
				}
				fileOutputStream.write(newBytes);	
			}else {
				fileOutputStream.write(bytes, 0, length);
			}
			Thread.sleep(5);
		}
		fileOutputStream.close();
		//�ļ��ü�

		//�ļ�����

		//���
	}
}