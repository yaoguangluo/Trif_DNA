package DetaSrc.org.html5.upload;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;

import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;
import U_A.PEU.P.image.ReadWritePng;
import src.java.org.lyg.common.maps.VtoV;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */public class FileUploaderSimpleSocketPDE{
	public static void processPrefix(String string, byte[] bytesIn
			, FileImageOutputStream fileOutputStream, int contentSize){
		try {
			byte[] bytesStrings= string.getBytes();
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
			int len= contentSize- positionHere- bytesStrings.length;
			byte[] newBytes= new byte[len];
			for(int i= 0; i< len; i++) {
				newBytes[i]= bytesIn[positionHere+ bytesStrings.length+ i];
			}
			fileOutputStream.write(newBytes);	
			Thread.sleep(1);
			return;
		}catch(Exception e){
			System.out.flush();System.out.print("processPrefix error");//�Ժ����error log
			return;
		}
	}

	@SuppressWarnings("unused")
	public static void processForm(InputStream inputStream, byte[] bytesIn, String type
			, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse
			, String stringInput) throws IOException {
		String email = null;
		String token = null;
		byte[] bytesNext= new byte[1600];
		int length= inputStream.read(bytesNext);	
		String stringInputNext= new String(bytesNext);
		String stringInputsFull= stringInput+ stringInputNext;
		String[] stringInputsFulls= stringInputsFull.split("\r\n");
		for(String string: stringInputsFulls) {
			if(string.contains("email=")&&string.contains("token=")) {
				String[] stringsEmail= string.split("email=");
				String[] stringsEmailStop= stringsEmail[1].split(";");
				email= URLDecoder.decode(stringsEmailStop[0], "UTF-8");
				String[] stringsToken= string.split("token=");
				token= URLDecoder.decode(stringsToken[1], "UTF-8");
			}
		}//1 email token ��֤�۵�
		//ȫ��д�������ļ�
		String outPath= "C:/Users/Administrator/Desktop/tempIMG/"; 
		String fileName= "temp"+ System.currentTimeMillis()+ (int)(Math.random()* 10000000)+ type; 
		//�ļ��н���
		File fileCategory= new File(outPath);
		if (!fileCategory.exists()&& !fileCategory.isFile()) { 
			fileCategory.mkdirs();
		}
		File file= new File(outPath+ fileName);
		FileImageOutputStream fileOutputStream= new FileImageOutputStream(file);
		byte[] bytesInNext= new byte[3200];
		int count= 0;
		for(int i= 0; i< bytesIn.length; i++) {
			bytesInNext[count++]= bytesIn[i];
		}
		for(int i= 0; i< bytesNext.length; i++) {
			bytesInNext[count++]= bytesNext[i];
		}
		if(stringInputsFull.contains("image/jpeg\r\n\r\n")) {
			processPrefix("image/jpeg\r\n\r\n", bytesInNext, fileOutputStream, 3200);
		}
		if(stringInputsFull.contains("image/png\r\n\r\n")) {
			processPrefix("image/png\r\n\r\n", bytesInNext, fileOutputStream, 3200);
		}
		try {
			length= 0;
			byte[] bytes= new byte[1024];
			while((length= inputStream.read(bytes))>=0) {//��ͷ	
				String string= new String(bytes);
				if(string.contains("image/jpeg\r\n\r\n")) {
					processPrefix("image/jpeg\r\n\r\n", bytesIn, fileOutputStream, 1024);
				}else if(string.contains("image/png\r\n\r\n")) {
					processPrefix("image/png\r\n\r\n", bytesIn, fileOutputStream, 1024);
				}else if(string.contains("------WebKitForm")) {
					byte[] bytesStrings= "------WebKitForm".getBytes();
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
					Thread.sleep(1);
					break;
				}else {
					fileOutputStream.write(bytes, 0, length);
					Thread.sleep(2);
				}
				Thread.sleep(1);
			}
			fileOutputStream.flush();
			//�ļ��ü�
			FileImageInputStream inputStreamTemp= new FileImageInputStream(file);
			BufferedImage bufferedImageIn= ImageIO.read(inputStreamTemp);
			System.out.flush();System.out.println(bufferedImageIn.getHeight()+ "&&"+ bufferedImageIn.getWidth());
			BufferedImage bufferedImage= bufferedImageIn;
			if(bufferedImageIn.getHeight()> 800 || bufferedImageIn.getWidth()>800) {
				bufferedImage= new BufferedImage(500, 400, BufferedImage.TYPE_INT_RGB);
				bufferedImage.getGraphics().drawImage(bufferedImageIn, 0, 0, 500, 400, null);
			}
			int h= bufferedImage.getHeight();
			int w= bufferedImage.getWidth();
			//System.out.flush();System.out.println(h+ "&&"+ w);
			int[][] rgb= new int[h][w];
			int[][][] rgbPng= new int[3][h][w];
			for (int i= 0; i< h; i++){
				for (int j= 0; j< w; j++){
					rgb[i][j]= bufferedImage.getRGB(j, i);
					rgbPng[0][i][j]= rgb[i][j]>> 16 & 0xFF;
					rgbPng[1][i][j]= rgb[i][j]>> 8 & 0xFF;		
					rgbPng[2][i][j]= rgb[i][j]& 0xFF;	
				}
			}	
			//�ļ�����
			file.delete();
			Thread.sleep(2);
			bufferedImage= null;
			Thread.sleep(2);
			fileOutputStream.close();
			Thread.sleep(2);
			//���� ������
			rgbPng[0]= FileUploaderSimpleDNA.IPE_AOPM_VECS_IDUQ_TXH_AC(rgbPng[0], 15);
			rgbPng[1]= FileUploaderSimpleDNA.IPE_AOPM_VECS_IDUQ_TXH_AC(rgbPng[1], 15);
			rgbPng[2]= FileUploaderSimpleDNA.IPE_AOPM_VECS_IDUQ_TXH_AC(rgbPng[2], 15);
			System.out.flush();System.out.println("success rgb");
			//���
			Map<String, Object> outputMap= new HashMap<>();
			String string= "success write";	
			String imageLink= "C:/Users/Administrator/git1/frontend_data/src/main/resources/static/temp/";
//			String imageName= "temp"+ email.replace(".", "").replace("\"", "")
//					+ System.currentTimeMillis()+ (int)(Math.random()*10000)+ ".png";
			String imageName= "temp"+ System.currentTimeMillis()+ (int)(Math.random()*10000)+ ".png";
			new ReadWritePng().writePNG(imageLink+ imageName, rgbPng);
			Thread.sleep(5);
			outputMap.put("sb", URLEncoder.encode(string, "UTF-8"));
			outputMap.put("tempAddr", URLEncoder.encode(imageName, "UTF-8"));
			String output= VtoV.ObjectToJsonString(outputMap);
			vPCSResponse.printWriter= new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
						.getOutputStream(), "UTF-8")), true);
			if(output.length()> 0) {
				System.out.flush();System.out.println("success YLJ");
				vPCSResponse.printWriter.println("HTTP/1.1 200 OK\n\n"); 
				output=output.charAt(0)=='"'?output.substring(1, output.length()):output;
				output=output.charAt(output.length()-1)=='"'?output.substring(0
						, output.length()-1):output;
				vPCSResponse.printWriter.println(output.replace("\\\"", "\""));
				Thread.sleep(150);
				vPCSResponse.printWriter.flush();
				vPCSResponse.printWriter.close();	
				Thread.sleep(15);
				vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getSocket().hashCode());
				Thread.sleep(15);
				System.out.flush();System.out.println("success all");
			}else {
				System.out.flush();System.out.print(vPCSRequest.getRequestLink());
				System.out.flush();System.out.print(vPCSRequest.getRequestFilePath());
				return;
			}	
		}catch(Exception e){
			System.out.flush();System.out.print("processForm error");//�Ժ����error log
			return;
		}
	}
}
