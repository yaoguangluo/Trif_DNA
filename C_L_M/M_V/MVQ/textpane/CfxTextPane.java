package M_V.MVQ.textpane;

import javax.swing.BorderFactory;
import javax.swing.JTextPane;
import java.awt.Dimension;
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
public class CfxTextPane extends JTextPane {

	private int x, y=0;
	public CfxTextPane(String string, final int x, final int y, java.awt.Color c) {
		super(); 
		this.x=x;
		this.y=y; 
		this.setBorder(BorderFactory.createRaisedBevelBorder()); 
		this.setPreferredSize(new Dimension(this.x+1, this.y+1));
		this.setOpaque(true);
		this.setBackground(c);
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			public void mouseMoved(MouseEvent e) {
			}
		});
	}
}
