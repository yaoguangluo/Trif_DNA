package DetaSrc.org.html5.upload;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;

//Content-Length: 1130835
//Accept-Encoding: gzip
//filename="下载 (10).jpg"
//image/jpeg
//β��------WebKit
//file 1 �洢��2 bufferedimageȡ���ؼ����á�
//form-->POST /dataSC HTTP/1.1
//form-->Host: tinos.qicp.vip
//form-->Connection: keep-alive
//form-->Content-Length: 1130835
//form-->Cache-Control: max-age=0
//form-->Upgrade-Insecure-Requests: 1
//form-->Origin: http://tinos.qicp.vip
//form-->Content-Type: multipart/form-data;
//boundary=----WebKitFormBoundarywA2HkAKn1AiXiZNG
//form-->User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64) 
//AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36
//form-->Accept: text/html, application/xhtml+xml, application/xml;q=0.9
//, image/avif, image/webp, image/apng, */*;q=0.8
//, application/signed-exchange;v=b3;q=0.9
//form-->Referer: http://tinos.qicp.vip/data.html
//form-->Accept-Encoding: gzip, deflate
//form-->Accept-Language: zh-CN, zh;q=0.9, en;q=0.8, zh-TW;q=0.7
//form-->Cookie: token=*******************313699483*******
//form-->
//form-->------WebKitFormBoundarywA2HkAKn1AiXiZNG
//form-->Content-Disposition: form-data; name="image";
//filename="下载 (10).jpg"
//form-->Content-Type: image/jpeg
//form-->
//form-->???
//415776
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */public class FileUploader{

	@SuppressWarnings("unused")
	public static void processForm(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) {
		InputStream inputStream = null;
		try {
			inputStream = vPCSResponse.getSocket().getInputStream();

			String outPath= "C:/Users/Administrator/Desktop/tempIMG/"; 
			String fileName= "temp1"+ System.currentTimeMillis()+ Math.random()+ ".jpg"; 
			//�ļ��н���
			File fileCategory= new File(outPath);
			if (!fileCategory.exists()&& !fileCategory.isFile()) { 
				fileCategory.mkdirs();
			}
			int length= 0;
			int count= 0;
			DoubleListBytes doubleListBytes= new DoubleListBytes();
			byte[] bytes= new byte[1];
			while((length= inputStream.read(bytes))> 0) {//��ͷ
				doubleListBytes.thisByte= bytes[0];
				doubleListBytes.next= new DoubleListBytes();
				doubleListBytes.next.prev= doubleListBytes;
				doubleListBytes= doubleListBytes.next;
				if(count++>256) {
					count= 0;
					Thread.sleep(1);
				}
			}
			//ǰ��
			while(doubleListBytes.prev!= null) {
				doubleListBytes= doubleListBytes.prev;
				if(count++>256) {
					count= 0;
					Thread.sleep(1);
				}
			}
			StringBuilder stringBuilderPrefix= new StringBuilder();
			while(null!= doubleListBytes) {
				stringBuilderPrefix.append(doubleListBytes.thisByte);
				if(stringBuilderPrefix.toString().contains("image/jpeg")
						||stringBuilderPrefix.toString().contains("image/png")) {
					doubleListBytes= doubleListBytes.next;
					doubleListBytes.prev= null;
					break;
				}
				if(null== doubleListBytes.next) {
					break;
				}
				doubleListBytes= doubleListBytes.next;
				if(count++>256) {
					count= 0;
					Thread.sleep(1);

				}
			}
			//���
			StringBuilder stringBuilderPostfix= new StringBuilder();
			while(doubleListBytes.next!= null) {
				doubleListBytes= doubleListBytes.next;
				if(count++>256) {
					count= 0;
					Thread.sleep(1);
				}
			}
			while(null!= doubleListBytes) {
				stringBuilderPostfix.append(doubleListBytes.thisByte);
				if(stringBuilderPrefix.toString().contains("------WebKitFormBoundary")) {
					doubleListBytes= doubleListBytes.prev;
					doubleListBytes.next= null;
					break;
				}
				if(null== doubleListBytes.prev) {
					break;
				}
				doubleListBytes= doubleListBytes.prev;
				if(count++>256) {
					count= 0;
					Thread.sleep(1);
				}
			}
			while(null!= doubleListBytes.prev) {
				doubleListBytes= doubleListBytes.prev;
				if(count++>256) {
					count= 0;
					Thread.sleep(1);
				}
			}
			File file= new File(outPath+ fileName);
			FileOutputStream fileOutputStream = null;
			fileOutputStream = new FileOutputStream(file);
			while(null!= doubleListBytes) {
				fileOutputStream.write(doubleListBytes.thisByte);
				if(null== doubleListBytes.next) {
					fileOutputStream.close();
					break;
				}
				doubleListBytes= doubleListBytes.next;
				if(count++>256) {
					count= 0;
					Thread.sleep(1);
				}
			}
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
//
//StringBuilder stringbuilderHeader= new StringBuilder();
//stringbuilderHeader.append(bytes);//��ѯ��
//if(stringbuilderHeader.toString().contains("image/jpeg\r\n\r\n")
//		||stringbuilderHeader.toString().contains("image/png\r\n\r\n")) {
//	while((length= inputStream.read(bytes))> 0) {//��ͷ
//		StringBuilder stringbuilderBody= new StringBuilder();
//		stringbuilderBody.append(bytes);//��ѯ��
//		if(!stringbuilderBody.toString().contains("\r\n--")){
//			fileOutputStream.write(bytes);
//		}else {
//			
//		}
//	}
//}
//
//


//		System.out.flush();System.out.println("form-->"+ message);
//		String[] byteStrings= message.split("Content-Type: image/jpeg");
//		if(byteStrings.length< 2) {
//			byteStrings= message.split("Content-Type: image/png");
//			if(byteStrings.length< 2) {
//				return;
//			}
//		}
//		String byteString= byteStrings[1];
//		byte[] stringBytes= byteString.getBytes();
//		System.out.flush();System.out.println("data-->"+ new String(stringBytes));
//		fileOutputStream.write(stringBytes, 0, stringBytes.length);
//		
//		while((len= inputStream.read(bytes))> 0) {
//			message= new String(bytes);
//			String[] byteBoundarys= message.split("------WebKitFormBoundary");
//			if(byteBoundarys.length> 1) {
//				String byteBoundary= byteBoundarys[0];
//				byte[] boundaryBytes= byteBoundary.getBytes();
//				System.out.flush();System.out.println("data-->"+ new String(boundaryBytes));
//				fileOutputStream.write(boundaryBytes, 0, boundaryBytes.length);
//				fileOutputStream.close();
//				return;
//			}
//			System.out.flush();System.out.println("data-->"+ message);
//			fileOutputStream.write(bytes, 0, len);
//		}
//	}	
//}