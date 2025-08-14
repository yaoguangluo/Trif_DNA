package DetaSrc.org.html5.upload;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;

import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;
import org.lyg.common.maps.VtoV;
//�����������Javascriptǰ��socket����������ͨѶ������Э��
//���� ����Ȩ�� ������ 20220819-0-30~ 20220820-0-27~20220822, 20220825, 20220826
//˼�� socket ����ͨѶ, java �ļ���д��
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class FileUploaderSimpleDNA{
	static Map<String, String> initonsSet;
	static Map<String, String> initonsCode;
	static Map<String, String> initonsMap;
	static Map<String, Integer> numberSet;
	static String[] stringsDNA255With16Encoder;
	static Map<String, Integer> stringsDNA255With16Decoder;
	public static void processPrefix(String string, byte[] bytesIn
			, FileImageOutputStream fileOutputStream, int contentSize){//�ȶ��� ��ξͽ��к���ȥ�ص�ʱ�򣬰�sonar��û��ȥӢ�ض����� ������ ����
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
			Thread.sleep(2);
			return;
		}catch(Exception e){
			//e.printStackTrace();
			System.out.flush();System.out.print("processPrefix error");//�Ժ����error log
			return;
		}
	}

	public static void processForm(InputStream inputStream, byte[] bytesIn
			, String type, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
		try {
			//ȫ��д�������ļ�
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
			FileImageOutputStream fileOutputStream= new FileImageOutputStream(file);
			String stringIn= new String(bytesIn);
			if(stringIn.contains("image/jpeg\r\n\r\n")) {
				processPrefix("image/jpeg\r\n\r\n", bytesIn, fileOutputStream, 1600);
			}
			if(stringIn.contains("image/png\r\n\r\n")) {
				processPrefix("image/png\r\n\r\n", bytesIn, fileOutputStream, 1600);
			}
			while((length= inputStream.read(bytes))>=0) {//��ͷ
				//System.out.flush();System.out.println(new String(bytes));	
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
					Thread.sleep(2);
					break;
				}else {
					fileOutputStream.write(bytes, 0, length);
					Thread.sleep(2);
				}
				Thread.sleep(5);
			}
			fileOutputStream.flush();
		//	fileOutputStream.close();
			//�ļ��ü�
//			BufferedImage bufferedImage= ImageIO.read(file);
			FileImageInputStream inputStreamTemp= new FileImageInputStream(file);
			BufferedImage bufferedImageIn= ImageIO.read(inputStreamTemp);
			System.out.flush();System.out.println(bufferedImageIn.getHeight()+ "&&"+ bufferedImageIn.getWidth());
			BufferedImage bufferedImage= bufferedImageIn;
			if(bufferedImageIn.getHeight()> 800 || bufferedImageIn.getWidth()>800) {
				bufferedImage= new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
				bufferedImage.getGraphics().drawImage(bufferedImageIn, 0, 0, 800, 600, null);
			}
			int h= bufferedImage.getHeight();
			int w= bufferedImage.getWidth();
			System.out.flush();System.out.println(h+"&&"+w);
			//dnaʮ��Ԫ����ʴ
			int[][] g1= new int[h][w];
			int[][] r1= new int[h][w];
			int[][] b1= new int[h][w];
			for (int i= 0; i< h; i++){
				for (int j= 0; j< w; j++){//���� ������
					int temp= bufferedImage.getRGB(j, i);
					g1[i][j]= temp>> 8 & 0xFF;		
					r1[i][j]= temp>> 16 & 0xFF;
					b1[i][j]= temp& 0xFF;	
				}
			}
			//���� ������
			int[][] r= IPE_AOPM_VECS_IDUQ_TXH_AC(r1, 15);
			int[][] g= IPE_AOPM_VECS_IDUQ_TXH_AC(g1, 15);
			int[][] b= IPE_AOPM_VECS_IDUQ_TXH_AC(b1, 15);
			System.out.flush();System.out.println("pde");
			double maxc= h*w;
			double rc= 1;//�����ĸΪ0
			double gc= 1;
			double bc= 1;
			double rp= 1;
			double gp= 1;
			double bp= 1;
			double rs= 1;
			double gs= 1;
			double bs= 1;
			double rh= 1;
			double gh= 1;
			double bh= 1;
			double rm= 1;
			double gm= 1;
			double bm= 1;
			double bYellow= 1;
			double bmYellow= 1;
			double blYellow= 1;
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
			file.delete();
			Thread.sleep(5);
			fileOutputStream.close();
			file.delete();
			Thread.sleep(5);
			System.out.flush();System.out.println("file delete");
			//���
			Map<String, Object> outputMap= new HashMap<>();
			String string= "�ϴ��ɹ������㷽ʽ: DNAʮ��Ԫ����ʴŨ�� 85%"
					+ "\r\n"
					+ "��->"+ h+ "��->"+ w
					+ "\r\n"
					+ "������������->"+ maxc
					+ "\r\n"
					+"; �����ظ�ʴ����->"+ rc+ ", PCA��->"+ rc/maxc + "\r\n"
					+"; �����ظ�ʴ����->"+ gc+ ", PCA��->"+ gc/maxc	+ "\r\n"
					+"; �����ظ�ʴ����->"+ bc+ ", PCA��->"+ bc/maxc	+ "\r\n"
					+ "\r\n"
					+"; ��ʶ������ظ�ʴ����->"+ rp+ ", PCA��->"+ rp/maxc+ ", ICA��->"+ rp/rc+ "\r\n"
					+"; ��ʶ�������ظ�ʴ����->"+ gp+ ", PCA��->"+ gp/maxc+ ", ICA��->"+ gp/gc+ "\r\n"
					+"; ��ʶ�������ظ�ʴ����->"+ bp+ ", PCA��->"+ bp/maxc+ ", ICA��->"+ bp/bc+ "\r\n"
					+ "\r\n"
					+"; �м�ֵ�����ظ�ʴ����->"+ rs+ ", PCA��->"+ rs/maxc+ ", ICA��->"+ rs/rc+ "\r\n"
					+"; �м�ֵ�����ظ�ʴ����->"+ gs+ ", PCA��->"+ gs/maxc+ ", ICA��->"+ gs/gc+ "\r\n"
					+"; �м�ֵ�����ظ�ʴ����->"+ bs+ ", PCA��->"+ bs/maxc+ ", ICA��->"+ bs/bc+ "\r\n"
					+ "\r\n"
					+"; PCA�����ظ�ʴ����->"+ rh+ ", PCA��->"+ rh/maxc+ ", ICA��->"+ rh/rs+ "\r\n"
					+"; PCA�����ظ�ʴ����->"+ gh+ ", PCA��->"+ gh/maxc+ ", ICA��->"+ gh/gs+ "\r\n"
					+"; PCA�����ظ�ʴ����->"+ bh+ ", PCA��->"+ bh/maxc+ ", ICA��->"+ bh/bs+ "\r\n"
					+ "\r\n"
					+"; ǿ�Һ����ظ�ʴ����->"+ rm+ ", PCA��->"+ rm/maxc+ ", ICA��->"+ rm/rh+ "\r\n"
					+"; ǿ�������ظ�ʴ����->"+ gm+ ", PCA��->"+ gm/maxc+ ", ICA��->"+ gm/gh+ "\r\n"
					+"; ǿ�������ظ�ʴ����->"+ bm+ ", PCA��->"+ bm/maxc+ ", ICA��->"+ bm/bh+ "\r\n"
					+ "\r\n"
					+"; ��ͨ�����ظ�ʴ����->"+ bYellow+ ", PCA��->"+ bYellow/maxc+ "\r\n"
					+";  PCA�����ظ�ʴ����->"+ bmYellow+ ", PCA��->"+ bmYellow/maxc+ ", ICA��->"+ bmYellow/bYellow+ "\r\n"
					+"; ǿ�һ����ظ�ʴ����->"+ blYellow+ ", PCA��->"+ blYellow/maxc + ", ICA��->"+ blYellow/bYellow;
			outputMap.put("sc", URLEncoder.encode(string, "UTF-8"));
			String output= VtoV.ObjectToJsonString(outputMap);
			vPCSResponse.printWriter= new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
					.getOutputStream(), "UTF-8")), true);
			if(output.length()> 0) {
				vPCSResponse.printWriter.println("HTTP/1.1 200 OK\n\n"); 
				output= output.charAt(0)== '"'? output.substring(1, output.length()): output;
				output= output.charAt(output.length()- 1)== '"'? output.substring(0
						, output.length()- 1): output;
				vPCSResponse.printWriter.println(output.replace("\\\"", "\""));
				vPCSResponse.printWriter.flush();
				vPCSResponse.printWriter.close();	
				vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getSocket().hashCode());
				System.out.flush();System.out.println("success");
				return;
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
	
	public static int[][] IPE_AOPM_VECS_IDUQ_TXH_AC(int[][] ps, int VECS) {
		for(int i= 0; i< ps.length; i++) {
			for(int j= 0; j< ps[0].length; j++) {
				//String IDUQ= new RangePDI().PDS_P_USQ_ECP_I_17(ps[i][j], 17);
				//String IDUQ= PDS_P_USQ_ECP_I_16(ps[i][j], 16);
				String IDUQ= stringsDNA255With16Encoder[ps[i][j]];
				char[][] OIQ= new char[1][IDUQ.length()];
				Here:
				for(int k= 0; k< IDUQ.length(); k++) {
					if(IDUQ.charAt(k)== 'U') {//g
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'Q';
						}else {
							OIQ[0][k]= 'U';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'Q') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'Q';
						}else {
							OIQ[0][k]= 'U';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'I') {//s
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'I';
						}else {
							OIQ[0][k]= 'D';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'D') {//g
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'I';
						}else {
							OIQ[0][k]= 'D';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'V') {//U   //DIUQ
						if(Math.random()* 100< VECS) {    //SEVC ���Ӧ
							OIQ[0][k]= 'C';
						}else {
							OIQ[0][k]= 'V';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'E') {//I
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'E';
						}else {
							OIQ[0][k]= 'S';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'C') {//Q
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'C';
						}else {
							OIQ[0][k]= 'V';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'S') {//D
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'E';
						}else {
							OIQ[0][k]= 'S';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'A') {//A = V + S, �� = C + E = P,  �� = V + S = A
						if(Math.random()* 100< VECS) {    
							OIQ[0][k]= 'P';                 
						}else {
							OIQ[0][k]= 'A';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'O') {//O = E + S, ��= E + E = E ,  �� = V + S = A
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'E';
						}else {
							OIQ[0][k]= 'A';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'P') {//P = E + C, �� = E + C = P,  �� = S + V = A
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'P';
						}else {
							OIQ[0][k]= 'A';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'M') {//M = C + S, �� = C + E = P,  �� = V + S = A
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'P';
						}else {
							OIQ[0][k]= 'A';
						}
						continue Here;
					}else if(IDUQ.charAt(k)== 'F') {//F = E+  C + S, �� = H,  �� = V
						if(Math.random()* 100< VECS) {
							OIQ[0][k]= 'H';
						}else {
							OIQ[0][k]= 'V';
						}
						continue Here;
					}else {
						OIQ[0][k]= IDUQ.charAt(k);
					}
				}
				ps[i][j]= DO_ACP_IDV_16(OIQ, 16);
			}
		}
		return ps;
	}
	public static void newADNAMap() {
		initonsSet= new HashMap<>();
		initonsCode= new HashMap<>();
		initonsMap= new HashMap<>();
 		numberSet= new HashMap<>();	
 		stringsDNA255With16Encoder= new String[256];
 		
		initonsSet.put("0", "0");
		initonsSet.put("1", "1");
		initonsSet.put("2", "2");
		initonsSet.put("3", "3");
		initonsSet.put("4", "4");
		initonsSet.put("5", "5");
		initonsSet.put("6", "6");
		initonsSet.put("7", "7");
		initonsSet.put("8", "8");
		initonsSet.put("9", "9");
		initonsSet.put("10", "A");
		initonsSet.put("11", "B");
		initonsSet.put("12", "C");
		initonsSet.put("13", "D");
		initonsSet.put("14", "E");
		initonsSet.put("15", "F");

		initonsCode.put("0", "D");
		initonsCode.put("1", "C");
		initonsCode.put("2", "P");
		initonsCode.put("3", "E");
		initonsCode.put("4", "T");
		initonsCode.put("5", "H");
		initonsCode.put("6", "O");
		initonsCode.put("7", "S");
		initonsCode.put("8", "M");
		initonsCode.put("9", "A");
		initonsCode.put("A", "X");
		initonsCode.put("B", "F");
		initonsCode.put("C", "V");
		initonsCode.put("D", "I");
		initonsCode.put("E", "U");
		initonsCode.put("F", "Q");
		
		initonsMap.put("D", "0");
 		initonsMap.put("C", "1");
 		initonsMap.put("P", "2");
 		initonsMap.put("E", "3");
 		initonsMap.put("T", "4");
 		initonsMap.put("H", "5");
 		initonsMap.put("O", "6");
 		initonsMap.put("S", "7");
 		initonsMap.put("M", "8");
 		initonsMap.put("A", "9");
 		initonsMap.put("X", "A");
 		initonsMap.put("F", "B");
 		initonsMap.put("V", "C");
 		initonsMap.put("I", "D");
 		initonsMap.put("U", "E");
 		initonsMap.put("Q", "F");
 		
 		numberSet.put("0", 0);
 		numberSet.put("1", 1);
 		numberSet.put("2", 2);
 		numberSet.put("3", 3);
 		numberSet.put("4", 4);
 		numberSet.put("5", 5);
 		numberSet.put("6", 6);
 		numberSet.put("7", 7);
 		numberSet.put("8", 8);
 		numberSet.put("9", 9);
 		numberSet.put("A", 10);
 		numberSet.put("B", 11);
 		numberSet.put("C", 12);
 		numberSet.put("D", 13);
 		numberSet.put("E", 14);
 		numberSet.put("F", 15);
 		for(int i= 0; i< 256; i++) {
 			stringsDNA255With16Encoder[i]= PDS_P_USQ_ECP_I_16(i, 16);
 		}
		return;
	}
	
	public static String PDS_P_USQ_ECP_I_16(int P_VSQ, int MSP) {
		String ISQ= "";
		while(P_VSQ>= MSP) {
			ISQ+= initonsCode.get(initonsSet.get(""+ P_VSQ/ MSP));// P_VSQ;
			P_VSQ%= MSP;
		}
		ISQ+= initonsCode.get(initonsSet.get(""+ P_VSQ));// P_VSQ;
		return ISQ;
	}
	
	public static int DO_ACP_IDV_16(char[][] IDC, int QVM) {
		int OSI= 0;
		for(int i= 0; i< IDC.length; i++) {
			for(int j= 0; j< IDC[0].length- 1; j++) {
				int temp= numberSet.get(initonsMap.get(""+ IDC[i][j]));
				OSI+= temp* Math.pow(QVM, IDC[0].length- j- 1);
				
			}
		}
		int IC= IDC[0].length;
		IC= numberSet.get(initonsMap.get(""+ IDC[0][IC- 1]));
		return OSI+ IC;
	}
}
