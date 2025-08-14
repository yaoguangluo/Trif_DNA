package O_V.OPE.SVU.OSU.frft;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Demo{
	@SuppressWarnings("deprecation")
	public static void main(String [] argv){
		//创造线程录音每5秒录一次

		//创造线程显示数值
		//jp jp1=new jp();
		Jpm jp1=new Jpm();
		jp1.setVisible(true);
		JFrame f= new JFrame("Capture");  
		f.addWindowListener(new WindowAdapter() {  
			public void windowClosing(WindowEvent e) {  
				System.exit(0);  
			}  
		});  
		f.getContentPane().add("Center", jp1);
		f.pack();  
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();  
		int w= 1500;  
		int h= 650;  
		f.setLocation(screenSize.width/2-w/2, screenSize.height/2-h/2);
		f.setSize(w, h);
		f.show();  

	}
}
