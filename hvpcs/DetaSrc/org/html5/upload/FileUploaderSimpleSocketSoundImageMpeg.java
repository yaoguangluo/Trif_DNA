//package DetaSrc.org.html5.upload;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.URLDecoder;
//import java.net.URLEncoder;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Vector;
//import javax.sound.sampled.AudioInputStream;
//
//import DetaSrc.org.deta.boot.sets.VPCSRequest;
//import DetaSrc.org.deta.boot.sets.VPCSResponse;
//import org.lyg.common.maps.VtoV;
//import PEU.P.image.ReadWritePng;
//import PEU.P.movie.AdataFrame;
//import PEU.P.movie.Header;
//import PEU.P.movie.LYGFileIO;
//import PEU.P.wave.DFT;
//import javazoom.spi.mpeg.sampled.file.MpegAudioFileReader;
//import javazoom.spi.mpeg.sampled.file.MpegAudioFormat;
////�����������Javascriptǰ��socket����������ͨѶ������Э��
////���� ����Ȩ�� ������ 20220819-0-30~ 20220820-0-27~20220822, 20220901, 20220910
////˼�� socket ����ͨѶ, java �ļ���д��ʵ��MP3 reader
///*
// * ����Ȩ�� ������ ������, ���
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
// * 15116110525,  ,
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
// * */public class FileUploaderSimpleSocketSoundImageMpeg{
//	public static void processPrefix(String string, byte[] bytesIn
//			, FileOutputStream fileOutputStream, int contentSize){
//		try {
//			byte[] bytesStrings= string.getBytes();
//			int position= -1;
//			int positionHere= -1;
//			int fullLength= bytesIn.length- bytesStrings.length;
//			Here:
//				for(int i= 0; i< fullLength; i++) {
//					position= i;
//					for(int j= 0; j< bytesStrings.length; j++) {
//						if(bytesIn[i+ j]!= bytesStrings[j]) {
//							position= -1;
//							continue Here;
//						}
//					}
//					if(position!= -1) {
//						positionHere= position;
//						break;
//					}
//				}
//			int len= contentSize- positionHere- bytesStrings.length;
//			byte[] newBytes= new byte[len];
//			for(int i= 0; i< len; i++) {
//				newBytes[i]= bytesIn[positionHere+ bytesStrings.length+ i];
//			}
//			fileOutputStream.write(newBytes);	
//			Thread.sleep(2);
//			return;
//		}catch(Exception e){
//			System.out.flush();System.out.print("processPrefix error");//�Ժ����error log
//			return;
//		}
//	}
//
//	@SuppressWarnings({ "rawtypes", "unused" })
//	public static void processForm(InputStream inputStream, byte[] bytesIn
//			, String type, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse, String stringInput) throws IOException {
//		String email = null;
//		String token = null;
//		byte[] bytesNext= new byte[1600];
//		int length= inputStream.read(bytesNext);	
//		String stringInputNext= new String(bytesNext);
//		String stringInputsFull= stringInput+ stringInputNext;
//		String[] stringInputsFulls= stringInputsFull.split("\r\n");
//		for(String string: stringInputsFulls) {
//			if(string.contains("email=")&&string.contains("token=")) {
//				String[] stringsEmail= string.split("email=");
//				String[] stringsEmailStop= stringsEmail[1].split(";");
//				email= URLDecoder.decode(stringsEmailStop[0], "UTF-8");
//				String[] stringsToken= string.split("token=");
//				token= URLDecoder.decode(stringsToken[1], "UTF-8");
//			}
//		}
//		//׼����2���¡�
//		//1 email token ��֤�۵�
//		//System.out.flush();System.out.println(email+ token);
//		//2 bytesNext �� stringInputNext �����Ƿ���image��boundary����ʼ�������
//		//��������һ�����⣬����û�е�½�͵������ӿڣ���ô������ڵ�һ��bytes��������next�� ���Ǿ�ֱ�ӱ��������ǡ�
//		//ȫ��д�������ļ�
//		String outPath= "C:/Users/Administrator/Desktop/tempIMG/"; 
//		String fileName= "temp"+ System.currentTimeMillis()+ (int)(Math.random()* 10000000)+ type; 
//		//�ļ��н���
//		File fileCategory= new File(outPath);
//		if (!fileCategory.exists()&& !fileCategory.isFile()) { 
//			fileCategory.mkdirs();
//		}
//		File file= new File(outPath+ fileName);
//		FileOutputStream fileOutputStream= new FileOutputStream(file);
//		byte[] bytesInNext= new byte[3200];
//		int count= 0;
//		for(int i= 0; i< bytesIn.length; i++) {
//			bytesInNext[count++]= bytesIn[i];
//		}
//		for(int i= 0; i< bytesNext.length; i++) {
//			bytesInNext[count++]= bytesNext[i];
//		}
//		if(stringInputsFull.contains("audio/x-wav\r\n\r\n")) {
//			processPrefix("audio/x-wav\r\n\r\n", bytesInNext, fileOutputStream, 3200);
//		}
//		if(stringInputsFull.contains("audio/wav\r\n\r\n")) {
//			processPrefix("audio/wav\r\n\r\n", bytesInNext, fileOutputStream, 3200);
//		}
//		if(stringInputsFull.contains("audio/mp3\r\n\r\n")) {
//			processPrefix("audio/mp3\r\n\r\n", bytesInNext, fileOutputStream, 3200);
//		}
//		if(stringInputsFull.contains("audio/mpeg\r\n\r\n")) {
//			processPrefix("audio/mpeg\r\n\r\n", bytesInNext, fileOutputStream, 3200);
//		}
//		try {
//			length= 0;
//			byte[] bytes= new byte[1024];
//			while((length= inputStream.read(bytes))>=0) {//��ͷ	
//				String string= new String(bytes);
//				if(string.contains("audio/x-wav\r\n\r\n")) {
//					processPrefix("audio/x-wav\r\n\r\n", bytesIn, fileOutputStream, 1024);
//				}else if(string.contains("audio/wav\r\n\r\n")) {
//					processPrefix("audio/wav\r\n\r\n", bytesIn, fileOutputStream, 1024);
//				}else if(string.contains("audio/mp3\r\n\r\n")) {
//					processPrefix("audio/mp3\r\n\r\n", bytesIn, fileOutputStream, 1024);
//				}else if(string.contains("audio/mpeg\r\n\r\n")) {
//					processPrefix("audio/mpeg\r\n\r\n", bytesIn, fileOutputStream, 1024);
//				}else if(string.contains("------WebKitForm")) {
//					byte[] bytesStrings= "------WebKitForm".getBytes();
//					int position= -1;
//					int positionHere= -1;
//					int fullLength= bytes.length- bytesStrings.length;
//					Here:
//						for(int i= 0; i< fullLength; i++ ) {
//							position= i;
//							for(int j= 0; j< bytesStrings.length; j++ ) {
//								if(bytes[i+ j]!= bytesStrings[j]) {
//									position= -1;
//									continue Here;
//								}
//							}
//							if(position!= -1) {
//								positionHere= position;
//								break;
//							}
//						}
//					int len= positionHere;
//					byte[] newBytes= new byte[len];
//					for(int i= 0; i< len; i++) {
//						newBytes[i]= bytes[i];
//					}
//					fileOutputStream.write(newBytes);	
//					Thread.sleep(1);
//					break;
//				}else {
//					fileOutputStream.write(bytes, 0, length);
//					Thread.sleep(2);
//				}
//				Thread.sleep(5);
//			}
//			fileOutputStream.flush();
//			//�ļ��ü�
//			File F=new File(outPath+ fileName);
//			System.out.flush();System.out.println(F.length());
//			MpegAudioFileReader mpegAudioFileReader= new MpegAudioFileReader();
//			AudioInputStream ais= mpegAudioFileReader.getAudioInputStream(F);
//			LYGFileIO IO = new LYGFileIO();
//			IO.reset();
//			//get header
//			MpegAudioFormat mpegAudioFormat= (MpegAudioFormat) ais.getFormat();
//			IO.header= new Header();
//			IO.header.SBigEndian= mpegAudioFormat.isBigEndian();
//			IO.header.SChannels=mpegAudioFormat.getChannels();
//			IO.header.SEn=mpegAudioFormat.getEncoding();
//			IO.header.SFrameRate=mpegAudioFormat.getFrameRate();
//			IO.header.SFrameSize= -1== mpegAudioFormat.getFrameSize()? 1: mpegAudioFormat.getFrameSize();
//			IO.header.SSampleRate=mpegAudioFormat.getSampleRate();
//			IO.header.SSampleSizeInBits=mpegAudioFormat.getSampleSizeInBits();
//			IO.header.SSampleSizeInBits= IO.header.SSampleSizeInBits==-1? 16: IO.header.SSampleSizeInBits;
//			IO.header.SFrameLeangth=ais.getFrameLength();
//			//get array
//			//time
//			double times;
//			long milliseconds = (long)((IO.header.SFrameLeangth * 1000) / IO.header.SFrameRate);
//			times = milliseconds / 1000.0;
//			//
//			if((int)times<times){
//				times=(int)(times+1);
//			}
//			//loop store main array to sub array
//			SoundWaveVectorMp3 sv = new SoundWaveVectorMp3();
//			Vector lines = sv.getVectorLines(ais, IO.header.SFrameRate);
//			IO.adataFrame= new AdataFrame();
//			IO.adataFrame.audioArray = sv.audioData;
//			for(int i=0;i<times-1;i++){
//				IO.adataFrame.next = new AdataFrame();
//				IO.adataFrame.next.prev = IO.adataFrame;
//				IO.adataFrame = IO.adataFrame.next;
//				sv = new SoundWaveVectorMp3();
//				lines = sv.getVectorLines(ais, IO.header.SFrameRate);
//				IO.adataFrame.audioArray = sv.audioData;
//			}
//			//�ļ�����
//			file.delete();
//			Thread.sleep(5);
//			//file.delete();
//			Thread.sleep(5);
//			fileOutputStream.close();
//			Thread.sleep(5);
//			//file.delete();
//			//Thread.sleep(15);
//			//Socket �������������ƾ�
//			//vvvvvvipҵ��֮��������ư�
//			//��http���ԣ����оͳ�����	
//			//���� ������
//			//����Ҷ�任
//			//�������� �� 1024 sets��ȡ
//			int ftx= 0;
//			DFT dFT=new DFT();
//			dFT.IV_(1024);
//			double[] outArray= new double[512];
//			while(IO.adataFrame!= null) {
//				while(IO.adataFrame.audioArray.length> ftx) {
//					double[] ft= new double[1024];
//					for(int i= 0; i< 1024; i++) {
//						if(ftx< IO.adataFrame.audioArray.length) {
//							ft[i]= IO.adataFrame.audioArray[ftx++];
//						}
//					}
//					//����
//					double[]out=  dFT.ft(ft);
//					//����
//					for(int i= 0; i<512; i++) {
//						outArray[i]+=out[i];
//					}
//					//ͳ��
//				}
//				IO.adataFrame= IO.adataFrame.next;
//			}
//			//
////			�ҳ����ֵ
//			double max= 0;
//			for(int i= 0; i< 512; i++) {
//				max= outArray[i]> max? outArray[i]: max;
//			}
////			Ȼ���
//			double maxRatio= max/200;
////			Ȼ��ȫ����ֵ
//			double[] imageArray= new double[512];
////			Ȼ������ͼƬ 0-512���
//			for(int i= 0; i< 512; i++) {
//				imageArray[i]= outArray[i]/ maxRatio;
//			}
//			//��ͼƬ
//			int[][][] imageBuffer= new int[3][512][210];
//			for (int i= 0; i< 512; i++){
//				for(int j= (int)imageArray[i]; j> 0; j--) {
//					imageBuffer[0][i][j]= 255>> 16 & 0xFF;
//					imageBuffer[1][i][j]= 255>> 8 & 0xFF;
//					imageBuffer[2][i][j]= 255>> 0 & 0xFF;
//				}
//			}	
//			//�ļ�����
//			//���� ������
//			System.out.flush();System.out.println("success rgb");
//			//���
//			Map<String, Object> outputMap= new HashMap<>();
//			String string= "success write";	
//			String imageLink= "C:/Users/Administrator/git1/frontend_data/src/main/resources/static/temp/";
//			String imageName= "temp"+ System.currentTimeMillis()+ (int)(Math.random()*10000)+ ".png";
//			new ReadWritePng().writePNG(imageLink+ imageName, imageBuffer);
//			Thread.sleep(5);
//			outputMap.put("zt", URLEncoder.encode(string, "UTF-8"));
//			outputMap.put("tempAddr", URLEncoder.encode(imageName, "UTF-8"));
//			System.out.flush();System.out.println("success noise");
//			String output= VtoV.ObjectToJsonString(outputMap);
//			vPCSResponse.printWriter = null; 
//			try {
//				vPCSResponse.printWriter= new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
//						.getOutputStream(), "UTF-8")), true);
//			}catch(Exception e) {
//				System.out.flush();System.out.println();
//			}
//			if(output.length()> 0) {
//				System.out.flush();System.out.println("success YLJ");
//				vPCSResponse.printWriter.println("HTTP/1.1 200 OK\n\n"); 
//				output=output.charAt(0)=='"'?output.substring(1, output.length()):output;
//				output=output.charAt(output.length()-1)=='"'?output.substring(0
//						, output.length()-1):output;
//				vPCSResponse.printWriter.println(output.replace("\\\"", "\""));
//				Thread.sleep(150);
//				vPCSResponse.printWriter.flush();
//				vPCSResponse.printWriter.close();	
//				Thread.sleep(15);
//				vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getSocket().hashCode());
//				Thread.sleep(15);
//				System.out.flush();System.out.println("success all");
//			}else {
//				System.out.flush();System.out.print(vPCSRequest.getRequestLink());
//				System.out.flush();System.out.print(vPCSRequest.getRequestFilePath());
//				return;
//			}	
//		}catch(Exception e){
//			System.out.flush();System.out.print("processForm error");//�Ժ����error log
//			e.printStackTrace();
//			return;
//		}
//	}
//}
