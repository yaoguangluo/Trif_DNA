package M_V.MVQ.button;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class HrjButton extends JButton{
	/**
	 * Author Yaoguang Luo
	 */

	private int x, y=0;
	public HrjButton(String string, final int x, final int y, java.awt.Color c) {
		super(string); 
		this.x= x;
		this.y= y; 
		this.setContentAreaFilled(false); 
		this.setBorder(BorderFactory.createRaisedBevelBorder()); 
		this.setPreferredSize(new Dimension(this.x+ 1, this.y+ 1));
		this.setOpaque(true);
		this.setBackground(c);
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			public void mouseMoved(MouseEvent e) {
				Graphics g= getGraphics();
				I_color(g);
				//g.setColor(new Color(255, 0, 255, 128));
				int xPoints[]={8, 8+15, 8};
				int yPoints[]={8, 8, 8+15};
				g.fillPolygon(xPoints, yPoints, 3);
				int xPoints1[]={x-16-5, x-8, x-8};
				int yPoints1[]={y-8, y-16-5, y-8};
				g.fillPolygon(xPoints1, yPoints1, 3);
				g.fillRect(8, 8, x-16 , 5);
				g.fillRect(8, 8, 5 , y-16);
				g.fillRect(8, y-12, x-16 , 5);
				g.fillRect(x-12, 8, 5 , y-16);
			}
		});
	}
	public void I_color(Graphics g) {
		
		int x=1+new Random().nextInt(9);
		if(1==x){
			g.setColor(Color.BLACK);
		}
		if(2==x){
			g.setColor(Color.blue);
		}
		if(3==x){
			g.setColor(Color.cyan);
		}
		if(4==x){
			g.setColor(Color.DARK_GRAY);
		}
		if(5==x){
			g.setColor(Color.green);
		}
		if(6==x){
			g.setColor(Color.orange);
		}
		if(7==x){
			g.setColor(Color.pink);
		}
		if(8==x){
			g.setColor(Color.pink);
		}
		if(9==x){
			g.setColor(Color.yellow);
		}	
	}
	public void callback(Graphics g){
		Timer blinkTimer= new Timer(800, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics g= getGraphics();
				if(null==g){
					return;
				}
				I_color(g);
				g.drawLine(0, 0, 0, y);
				g.drawLine(0, 0, x, 0);
				g.drawLine(x, y, x, 0);
				g.drawLine(x, y, 0, y);
				I_color(g);
				g.drawLine(2, 2, 2, y-2);
				g.drawLine(2, 2, x-2, 2);
				g.drawLine(x-2, y-2, x-2, 2);
				g.drawLine(x-2, y-2, 2, y-2);
				I_color(g);
				g.drawLine(4, 4, 4, y-4);
				g.drawLine(4, 4, x-4, 4);
				g.drawLine(x-4, y-4, x-4, 4);
				g.drawLine(x-4, y-4, 4, y-4);
				I_color(g);
				g.drawLine(6, 6, 6, y-6);
				g.drawLine(6, 6, x-6, 6);
				g.drawLine(x-6, y-6, x-6, 6);
				g.drawLine(x-6, y-6, 6, y-6);
				I_color(g);
				g.drawLine(8, 8, 8, y-8);
				g.drawLine(8, 8, x-8, 8);
				g.drawLine(x-8, y-8, x-8, 8);
				g.drawLine(x-8, y-8, 8, y-8);
			}
			private void I_color(Graphics g) {
				int x=1+new Random().nextInt(9);
				if(1==x){
					g.setColor(Color.BLACK);
				}
				if(2==x){
					g.setColor(Color.blue);
				}
				if(3==x){
					g.setColor(Color.cyan);
				}
				if(4==x){
					g.setColor(Color.DARK_GRAY);
				}
				if(5==x){
					g.setColor(Color.green);
				}
				if(6==x){
					g.setColor(Color.orange);
				}
				if(7==x){
					g.setColor(Color.pink);
				}
				if(8==x){
					g.setColor(Color.pink);
				}
				if(9==x){
					g.setColor(Color.yellow);
				}	
			}
		});
		blinkTimer.start(); 
	}
}
