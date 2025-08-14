package A_V.ASQ.PSU.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

//import SVQ.stable.S_Common;
//import javax.imageio.ImageIO;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class MakeImage {
	public static void main(String[] args)  {
		MakeImage makeImage= new MakeImage();
		int height= 600;
		int weight= 800;
		BufferedImage image= new BufferedImage(weight, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g= image.createGraphics();
		g.setColor(Color.white);
		g.setFont(g.getFont());
		String prePrint= "娴嬭瘯鏂囧瓧";
		Font font= new Font(prePrint, 20, 20);
		int stringW= g.getFontMetrics().stringWidth(prePrint);
		int stringH= g.getFontMetrics().getHeight();
		//20230106-System.out.println(stringW + S_Common.STRING_SYMBOL_PER + stringH);
		int positionX= 10;
		int positionY= 20;
		makeImage.weightPrint(prePrint, g, stringW, stringH, positionX, positionY, font);
		makeImage.heightPrint(prePrint, g, stringW, stringH, positionX, positionY, font);
		//String pathBin= "C:\\Users\\Administrator\\Desktop\\涔\images\\output.jpg";
		//output path
		//File outputBin= new File(pathBin);
		//ImageIO.write(image, "jpeg", outputBin);
	}

	public void weightPrint(String prePrint, Graphics2D g, int stringW, int stringH
			, int positionX, int positionY, Font font) {
		g.setFont(font);
		g.drawString(prePrint, positionX, positionY);
	}
	public void heightPrint(String prePrint, Graphics2D g, int stringW, int stringH
			, int positionX, int positionY, Font font) {
		g.setFont(font);
		g.drawString(prePrint, positionX, positionY);
	}
}
