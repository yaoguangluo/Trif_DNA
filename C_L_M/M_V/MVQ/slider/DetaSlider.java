package M_V.MVQ.slider;

import javax.swing.JSlider;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaSlider extends JSlider{

	public DetaSlider(final int x, final int y) {
		super(x, y);
		//this.setForeground(Color.lightGray);
		this.setForeground(Color.pink);
		this.setBackground(Color.black);
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			public void mouseMoved(MouseEvent e) {
//				Graphics g= getGraphics();
//				g.setColor(new Color(255, 0, 255, 128));
//				int xPoints[]={8, 8+15, 8};
//				int yPoints[]={8, 8, 8+15};
//				g.fillPolygon(xPoints, yPoints, 3);
//				int xPoints1[]={x-16-5, x-8, x-8};
//				int yPoints1[]={y-8, y-16-5, y-8};
//				g.fillPolygon(xPoints1, yPoints1, 3);
//				g.fillRect(8, 8, x-16 , 5);
//				g.fillRect(8, 8, 5 , y-16);
//				g.fillRect(8, y-12, x-16 , 5);
//				g.fillRect(x-12, 8, 5 , y-16);
			}
		});
	}
}
