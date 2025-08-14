package DetaSrc.org.html5.upload;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;
import org.lyg.common.maps.VtoV;
//�����������Javascriptǰ��socket����������ͨѶ������Э��
//���� ����Ȩ�� ������ 20220819-0-30~ 20220820-0-27~20220822
//˼�� socket ����ͨѶ, java �ļ���д��
//��inputStream��bytes list��Ȼ��byteslist �� bufferimageBYtesRead�� Ȼ���Ϊ imageio
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class FileUploaderUnwrite{
	public static void processPrefix(String string, byte[] bytesIn
			, int contentSize, List<byte[]> list, VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws IOException, InterruptedException{
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
			//fileOutputStream.write(newBytes);	
			list.add(newBytes);
			Thread.sleep(5);
			return;
		}catch(Exception e){
			//e.printStackTrace();
			Map<String, Object> outputMap= new HashMap<>();
			outputMap.put("tc", URLEncoder.encode("�������", "UTF-8"));
			String output= VtoV.ObjectToJsonString(outputMap);
			vPCSResponse.printWriter 
			= new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
					.getOutputStream(), "UTF-8")), true);
			if(output.length()> 0) {
				vPCSResponse.printWriter.println("HTTP/1.1 200 OK\n\n"); 
				output=output.charAt(0)=='"'?output.substring(1, output.length()):output;
				output=output.charAt(output.length()-1)=='"'?output.substring(0
						, output.length()-1):output;
				vPCSResponse.printWriter.println(output.replace("\\\"", "\""));
				vPCSResponse.printWriter.flush();
				vPCSResponse.printWriter.close();	
				vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getSocket().hashCode());
			}else {
				System.out.flush();System.out.print(vPCSRequest.getRequestLink());
				System.out.flush();System.out.print(vPCSRequest.getRequestFilePath());
				return;
			}	
		}
	}

	@SuppressWarnings("unused")
	public static void processForm(InputStream inputStream, byte[] bytesIn
			, String type, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {
		try {
			int length= 0;
			byte[] bytes= new byte[1024];
			String stringIn= new String(bytesIn);
			List<byte[]> list= new ArrayList<>();
			if(stringIn.contains("image/jpeg\r\n\r\n")) {
				processPrefix("image/jpeg\r\n\r\n", bytesIn, 1600, list
						, vPCSRequest, vPCSResponse);
			}
			if(stringIn.contains("image/png\r\n\r\n")) {
				processPrefix("image/png\r\n\r\n", bytesIn, 1600, list
						, vPCSRequest, vPCSResponse);
			}
			while((length= inputStream.read(bytes))>=0) {//��ͷ
				//System.out.flush();System.out.println(new String(bytes));	
				String string= new String(bytes);
				if(string.contains("image/jpeg\r\n\r\n")) {
					processPrefix("image/jpeg\r\n\r\n", bytesIn, 1024, list
							, vPCSRequest, vPCSResponse);
				}else if(string.contains("image/png\r\n\r\n")) {
					processPrefix("image/png\r\n\r\n", bytesIn, 1024, list
							, vPCSRequest, vPCSResponse);
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
					//fileOutputStream.write(newBytes);	
					list.add(newBytes);
					Thread.sleep(5);
					break;
				}else {
					//fileOutputStream.write(bytes, 0, length);
					list.add(bytes);
					Thread.sleep(5);
				}
				Thread.sleep(5);
			}
			System.out.flush();System.out.println(list.size());
			int fileLength= 0;
			for(int i= 0; i< list.size(); i++) {
				fileLength+= list.get(i).length;
			}
			byte[] listBytes= new byte[fileLength];
			int count= 0;
			for(int i= 0; i< list.size(); i++) {
				byte[] tempBytes= list.get(i);
				for(int j= 0; j< tempBytes.length; j++) {
					listBytes[count++]= tempBytes[j];
				}
			}
			InputStream imageInputStream= new ByteArrayInputStream(listBytes, 0, fileLength);
			BufferedImage bufferedImage = null;
			try {
				bufferedImage= ImageIO.read(imageInputStream);
			}catch(Exception e) {
				System.out.flush();System.out.println();
			}
			//BufferedImage bufferedImage= ImageIO.read(imageInputStream);
			//�ļ��ü�
			int h = bufferedImage.getHeight();
			int w = bufferedImage.getWidth();
			System.out.flush();System.out.println(h+"&&"+w);
			int[][] g = new int[h][w];
			int[][] r = new int[h][w];
			int[][] b = new int[h][w];
			for (int i = 0; i < h; i++){
				for (int j = 0; j < w; j++){
					g[i][j] = bufferedImage.getRGB(j, i) >> 8 & 0xFF;
				r[i][j] = bufferedImage.getRGB(j, i) >> 16 & 0xFF;
					b[i][j] = bufferedImage.getRGB(j, i) & 0xFF;
				}
			}
			double maxc= h*w;
			double rc= 0;
			double gc= 0;
			double bc= 0;
			double rp= 0;
			double gp= 0;
			double bp= 0;
			double rs= 0;
			double gs= 0;
			double bs= 0;
			double rh= 0;
			double gh= 0;
			double bh= 0;
			double rm= 0;
			double gm= 0;
			double bm= 0;
			double bYellow= 0;
			double bmYellow= 0;
			double blYellow= 0;
			for (int i = 0; i < h; i++){
				for (int j = 0; j < w; j++){
					if(r[i][j]> 128) {
						if(g[i][j]> 128&& b[i][j]> 5 ) {
							 bYellow++;
							 if(g[i][j]> 192&& b[i][j]> 5 ) {
								 bmYellow++;
								 if(g[i][j]> 230&& b[i][j]>5) {
									 blYellow++;
								}
							}
						}
					}
					if(r[i][j]>0) {
						rc++;
					}
					if(g[i][j]>0) {
						gc++;
					}
					if(b[i][j]>0) {
						bc++;
					}
					if(r[i][j]>22) {
						rp++;
					}
					if(g[i][j]>22) {
						gp++;
					}
					if(b[i][j]>22) {
						bp++;
					}
					if(r[i][j]>96) {
						rs++;
					}
					if(g[i][j]>96) {
						gs++;
					}
					if(b[i][j]>96) {
						bs++;
					}
					if(r[i][j]>128) {
						rh++;
					}
					if(g[i][j]>128) {
						gh++;
					}
					if(b[i][j]>128) {
						bh++;
					}
					if(r[i][j]>200) {
						rm++;
					}
					if(g[i][j]>200) {
						gm++;
					}
					if(b[i][j]>200) {
						bm++;
					}
				}
			}
			//�ļ�����
			Thread.sleep(5);
			Thread.sleep(15);
			//���
			Map<String, Object> outputMap= new HashMap<>();
			String string= "�ϴ��ɹ���"+ "��->"+ h
					+ "��->"+ w
					+ "\r\n"
					+ "������������->"+ maxc
					+ "\r\n"
					+"; ����������->"+ rc+ ", ����->"+ rc/maxc	+ "\r\n"
					+"; ����������->"+ gc+ ", ����->"+ gc/maxc	+ "\r\n"
					+"; ����������->"+ bc+ ", ����->"+ bc/maxc	+ "\r\n"
					+ "\r\n"
					+"; ��ʶ�����������->"+ rp+ ", ����->"+ rp/maxc	+ "\r\n"
					+"; ��ʶ������������->"+ gp+ ", ����->"+ gp/maxc	+ "\r\n"
					+"; ��ʶ������������->"+ bp+ ", ����->"+ bp/maxc	+ "\r\n"
					+ "\r\n"
					+"; �м�ֵ����������->"+ rs+ ", ����->"+ rs/maxc	+ "\r\n"
					+"; �м�ֵ����������->"+ gs+ ", ����->"+ gs/maxc	+ "\r\n"
					+"; �м�ֵ����������->"+ bs+ ", ����->"+ bs/maxc	+ "\r\n"
					+ "\r\n"
					+"; PCA����������->"+ rh+ ", ����->"+ rh/maxc	+ "\r\n"
					+"; PCA����������->"+ gh+ ", ����->"+ gh/maxc	+ "\r\n"
					+"; PCA����������->"+ bh+ ", ����->"+ bh/maxc	+ "\r\n"
					+ "\r\n"
					+"; ǿ�Һ���������->"+ rm+ ", ����->"+ rm/maxc	+ "\r\n"
					+"; ǿ������������->"+ gm+ ", ����->"+ gm/maxc	+ "\r\n"
					+"; ǿ������������->"+ bm+ ", ����->"+ bm/maxc	+ "\r\n"
					+ "\r\n"
					+"; ����������->"+ bYellow+ ", ����->"+ bYellow/maxc	+ "\r\n"
					+"; PCA����������->"+ bmYellow+ ", ����->"+ bmYellow/maxc	+ "\r\n"
					+"; ǿ�һ���������->"+ blYellow+ ", ����->"+ blYellow/maxc;
			outputMap.put("tc", URLEncoder.encode(string, "UTF-8"));
			String output= VtoV.ObjectToJsonString(outputMap);
			vPCSResponse.printWriter = null; 
			try {
				vPCSResponse.printWriter= new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
						.getOutputStream(), "UTF-8")), true);
			}catch(Exception e) {
				System.out.flush();System.out.println();
			}
			if(output.length()> 0) {
				vPCSResponse.printWriter.println("HTTP/1.1 200 OK\n\n"); 
				output=output.charAt(0)=='"'?output.substring(1, output.length()):output;
				output=output.charAt(output.length()-1)=='"'?output.substring(0
						, output.length()-1):output;
				vPCSResponse.printWriter.println(output.replace("\\\"", "\""));
				vPCSResponse.printWriter.flush();
				vPCSResponse.printWriter.close();	
				vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getSocket().hashCode());
			}else {
				System.out.flush();System.out.print(vPCSRequest.getRequestLink());
				System.out.flush();System.out.print(vPCSRequest.getRequestFilePath());
				return;
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
