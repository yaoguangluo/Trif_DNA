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
import src.java.org.lyg.common.maps.VtoV;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */public class FileUploaderSimple {
	public static void processPrefix(String string, byte[] bytesIn,
			FileImageOutputStream fileOutputStream, int contentSize) {
		try {
			byte[] bytesStrings = string.getBytes();
			int position = -1;
			int positionHere = -1;
			int fullLength = bytesIn.length - bytesStrings.length;
			Here: for (int i = 0; i < fullLength; i++) {
				position = i;
				for (int j = 0; j < bytesStrings.length; j++) {
					if (bytesIn[i + j] != bytesStrings[j]) {
						position = -1;
						continue Here;
					}
				}
				if (position != -1) {
					positionHere = position;
					break;
				}
			}
			int len = contentSize - positionHere - bytesStrings.length;
			byte[] newBytes = new byte[len];
			for (int i = 0; i < len; i++) {
				newBytes[i] = bytesIn[positionHere + bytesStrings.length + i];
			}
			fileOutputStream.write(newBytes);
			Thread.sleep(2);
			return;
		} catch (Exception e) {
			System.out.flush();
			System.out.print("processPrefix error");// �Ժ����error log
			return;
		}
	}

	public static void processForm(InputStream inputStream, byte[] bytesIn,
			String type, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
		try {
			// ȫ��д�������ļ�
			String outPath = "C:/Users/Administrator/Desktop/tempIMG/";
			String fileName = "temp" + System.currentTimeMillis()
					+ (int) (Math.random() * 10000000) + type;
			// �ļ��н���
			File fileCategory = new File(outPath);
			if (!fileCategory.exists() && !fileCategory.isFile()) {
				fileCategory.mkdirs();
			}
			int length = 0;
			byte[] bytes = new byte[1024];
			File file = new File(outPath + fileName);
			FileImageOutputStream fileOutputStream = new FileImageOutputStream(
					file);
			String stringIn = new String(bytesIn);
			if (stringIn.contains("image/jpeg\r\n\r\n")) {
				processPrefix("image/jpeg\r\n\r\n", bytesIn, fileOutputStream,
						1600);
			}
			if (stringIn.contains("image/png\r\n\r\n")) {
				processPrefix("image/png\r\n\r\n", bytesIn, fileOutputStream,
						1600);
			}
			while ((length = inputStream.read(bytes)) >= 0) {// ��ͷ
				// System.out.flush();System.out.println(new String(bytes));
				String string = new String(bytes);
				if (string.contains("image/jpeg\r\n\r\n")) {
					processPrefix("image/jpeg\r\n\r\n", bytesIn,
							fileOutputStream, 1024);
				} else if (string.contains("image/png\r\n\r\n")) {
					processPrefix("image/png\r\n\r\n", bytesIn,
							fileOutputStream, 1024);
				} else if (string.contains("------WebKitForm")) {
					byte[] bytesStrings = "------WebKitForm".getBytes();
					int position = -1;
					int positionHere = -1;
					int fullLength = bytes.length - bytesStrings.length;
					Here: for (int i = 0; i < fullLength; i++) {
						position = i;
						for (int j = 0; j < bytesStrings.length; j++) {
							if (bytes[i + j] != bytesStrings[j]) {
								position = -1;
								continue Here;
							}
						}
						if (position != -1) {
							positionHere = position;
							break;
						}
					}
					int len = positionHere;
					byte[] newBytes = new byte[len];
					for (int i = 0; i < len; i++) {
						newBytes[i] = bytes[i];
					}
					fileOutputStream.write(newBytes);
					Thread.sleep(1);
					break;
				} else {
					fileOutputStream.write(bytes, 0, length);
					Thread.sleep(5);
				}
				Thread.sleep(5);
			}
			fileOutputStream.flush();
			// fileOutputStream.close();
			// �ļ��ü�
//			BufferedImage bufferedImage= ImageIO.read(file);
			FileImageInputStream inputStreamTemp = new FileImageInputStream(
					file);
			BufferedImage bufferedImageIn = ImageIO.read(inputStreamTemp);
			System.out.flush();
			System.out.println(bufferedImageIn.getHeight() + "&&"
					+ bufferedImageIn.getWidth());
			BufferedImage bufferedImage = bufferedImageIn;
			if (bufferedImageIn.getHeight() > 800
					|| bufferedImageIn.getWidth() > 800) {
				bufferedImage = new BufferedImage(800, 600,
						BufferedImage.TYPE_INT_RGB);
				bufferedImage.getGraphics().drawImage(bufferedImageIn, 0, 0,
						800, 600, null);
			}
			int h = bufferedImage.getHeight();
			int w = bufferedImage.getWidth();
			System.out.flush();
			System.out.println(h + "&&" + w);
			int[][] g = new int[h][w];
			int[][] r = new int[h][w];
			int[][] b = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					g[i][j] = bufferedImage.getRGB(j, i) >> 8 & 0xFF;
					r[i][j] = bufferedImage.getRGB(j, i) >> 16 & 0xFF;
					b[i][j] = bufferedImage.getRGB(j, i) & 0xFF;
				}
			}
			double maxc = h * w;
			double rc = 1;// �����ĸΪ0
			double gc = 1;
			double bc = 1;
			double rp = 1;
			double gp = 1;
			double bp = 1;
			double rs = 1;
			double gs = 1;
			double bs = 1;
			double rh = 1;
			double gh = 1;
			double bh = 1;
			double rm = 1;
			double gm = 1;
			double bm = 1;
			double bYellow = 1;
			double bmYellow = 1;
			double blYellow = 1;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (r[i][j] > 128) {
						if (g[i][j] > 128 && b[i][j] > 5) {
							bYellow++;
							if (g[i][j] > 192 && b[i][j] > 5) {
								bmYellow++;
								if (g[i][j] > 230 && b[i][j] > 5) {
									blYellow++;
								}
							}
						}
					}
					if (r[i][j] > 0) {
						rc++;
					}
					if (g[i][j] > 0) {
						gc++;
					}
					if (b[i][j] > 0) {
						bc++;
					}
					if (r[i][j] > 22) {
						rp++;
					}
					if (g[i][j] > 22) {
						gp++;
					}
					if (b[i][j] > 22) {
						bp++;
					}
					if (r[i][j] > 96) {
						rs++;
					}
					if (g[i][j] > 96) {
						gs++;
					}
					if (b[i][j] > 96) {
						bs++;
					}
					if (r[i][j] > 128) {
						rh++;
					}
					if (g[i][j] > 128) {
						gh++;
					}
					if (b[i][j] > 128) {
						bh++;
					}
					if (r[i][j] > 200) {
						rm++;
					}
					if (g[i][j] > 200) {
						gm++;
					}
					if (b[i][j] > 200) {
						bm++;
					}
				}
			}
			// �ļ�����
			file.delete();
			Thread.sleep(5);
			fileOutputStream.close();
			file.delete();
			Thread.sleep(15);
			// ���
			Map<String, Object> outputMap = new HashMap<>();
			String string = "�ϴ��ɹ������㷽ʽ: ��ͨ����ͳ�Ʒ�ʽ" + "\r\n" + "��->" + h
					+ "��->" + w + "\r\n" + "������������->" + maxc + "\r\n"
					+ "; ����������->" + rc + ", PCA��->" + rc / maxc + "\r\n"
					+ "; ����������->" + gc + ", PCA��->" + gc / maxc + "\r\n"
					+ "; ����������->" + bc + ", PCA��->" + bc / maxc + "\r\n"
					+ "\r\n" + "; ��ʶ�����������->" + rp + ", PCA��->"
					+ rp / maxc + ", ICA��->" + rp / rc + "\r\n"
					+ "; ��ʶ������������->" + gp + ", PCA��->" + gp / maxc
					+ ", ICA��->" + gp / gc + "\r\n" + "; ��ʶ������������->"
					+ bp + ", PCA��->" + bp / maxc + ", ICA��->" + bp / bc
					+ "\r\n" + "\r\n" + "; �м�ֵ����������->" + rs + ", PCA��->"
					+ rs / maxc + ", ICA��->" + rs / rc + "\r\n"
					+ "; �м�ֵ����������->" + gs + ", PCA��->" + gs / maxc
					+ ", ICA��->" + gs / gc + "\r\n" + "; �м�ֵ����������->" + bs
					+ ", PCA��->" + bs / maxc + ", ICA��->" + bs / bc + "\r\n"
					+ "\r\n" + "; PCA����������->" + rh + ", PCA��->"
					+ rh / maxc + ", ICA��->" + rh / rs + "\r\n"
					+ "; PCA����������->" + gh + ", PCA��->" + gh / maxc
					+ ", ICA��->" + gh / gs + "\r\n" + "; PCA����������->" + bh
					+ ", PCA��->" + bh / maxc + ", ICA��->" + bh / bs + "\r\n"
					+ "\r\n" + "; ǿ�Һ���������->" + rm + ", PCA��->" + rm / maxc
					+ ", ICA��->" + rm / rh + "\r\n" + "; ǿ������������->" + gm
					+ ", PCA��->" + gm / maxc + ", ICA��->" + gm / gh + "\r\n"
					+ "; ǿ������������->" + bm + ", PCA��->" + bm / maxc
					+ ", ICA��->" + bm / bh + "\r\n" + "\r\n"
					+ "; ��ͨ����������->" + bYellow + ", PCA��->"
					+ bYellow / maxc + "\r\n" + ";  PCA����������->" + bmYellow
					+ ", PCA��->" + bmYellow / maxc + ", ICA��->"
					+ bmYellow / bYellow + "\r\n" + "; ǿ�һ���������->"
					+ blYellow + ", PCA��->" + blYellow / maxc + ", ICA��->"
					+ blYellow / bYellow;
			outputMap.put("tc", URLEncoder.encode(string, "UTF-8"));
			String output = VtoV.ObjectToJsonString(outputMap);
			vPCSResponse.printWriter = null;
			try {
				vPCSResponse.printWriter = new PrintWriter(
						new BufferedWriter(new OutputStreamWriter(
								vPCSResponse.getSocket().getOutputStream(),
								"UTF-8")),
						true);
			} catch (Exception e) {
				System.out.flush();
				System.out.println();
			}
			if (output.length() > 0) {
				vPCSResponse.printWriter.println("HTTP/1.1 200 OK\n\n");
				output = output.charAt(0) == '"'
						? output.substring(1, output.length())
						: output;
				output = output.charAt(output.length() - 1) == '"'
						? output.substring(0, output.length() - 1)
						: output;
				vPCSResponse.printWriter.println(output.replace("\\\"", "\""));
				vPCSResponse.printWriter.flush();
				vPCSResponse.printWriter.close();
				vPCSResponse.getSleeperHall()
						.removeThreadById(vPCSResponse.getSocket().hashCode());
			} else {
				System.out.flush();
				System.out.print(vPCSRequest.getRequestLink());
				System.out.flush();
				System.out.print(vPCSRequest.getRequestFilePath());
				return;
			}
		} catch (Exception e) {
			System.out.flush();
			System.out.print("processForm error");// �Ժ����error log
			return;
		}
	}
}
