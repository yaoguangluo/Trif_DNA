package M_V.MVQ.button;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaButton extends JButton implements MouseListener, MouseMotionListener, MouseWheelListener{
	
	public BufferedImage bufferedImage;
	/**
	 * Author Yaoguang Luo
	 */
	public DetaButton(String string, final int x, final int y, java.awt.Color c) {
		super(string); 
		this.setBackground(c);
		this.addMouseMotionListener(new MouseMotionListener() {
			int motionI= 1;
			public void mouseDragged(MouseEvent e) {
			}
			public void mouseMoved(MouseEvent e) {
				Color reg= Color.black;
				if(1== motionI++) {
					reg= Color.black;
				}else if(2== motionI) {
					reg= Color.blue;
				}else if(3== motionI) {
					motionI= 1;
					reg= Color.green;
				}
				Graphics g= getGraphics();
				g.setColor(reg);
				int xPoints[]= {1, 1+ 10, 1};
				int yPoints[]= {1, 1, 1+ 10};
				g.fillPolygon(xPoints, yPoints, 3);
			}
		});
	}
	public DetaButton(String string) {
		super(string); 
		int i= 1+ (int)(Math.abs(Math.random()*100))% 4;
		Color regBackground= null;
		if(1== i) {
			regBackground= Color.orange;
		}else if(2== i) {
			regBackground= Color.magenta;
		}else if(3== i) {
			regBackground= Color.green;
		}else if(4== i) {
			regBackground= Color.pink;
		}
		this.setBackground(regBackground);
		this.addMouseMotionListener(new MouseMotionListener() {
			int motionI= 1;
			public void mouseDragged(MouseEvent e) {
			}
			public void mouseMoved(MouseEvent e) {
				Color reg= Color.black;
				if(1== motionI++) {
					reg= Color.black;
				}else if(2== motionI) {
					reg= Color.blue;
				}else if(3== motionI) {
					motionI= 1;
					reg= Color.green;
				}
				Graphics g= getGraphics();
				g.setColor(reg);
				int xPoints[]= {1, 1+ 10, 1};
				int yPoints[]= {1, 1, 1+ 10};
				g.fillPolygon(xPoints, yPoints, 3);
			}
		});
		
		this.addMouseListener(this);
		this.addMouseWheelListener(this);
		this.addMouseMotionListener(this);
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
		////20230106-System.out.println(e.getButton());
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		////20230106-System.out.println(e.getButton());
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
}
