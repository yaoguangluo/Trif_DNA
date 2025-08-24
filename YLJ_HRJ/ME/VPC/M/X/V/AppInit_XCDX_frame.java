package ME.VPC.M.X.V;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JSlider;

import ME.VPC.M.app.App;
import M_V.MVQ.slider.DetaSlider;

/*
 * 1 关于UI组件变量的线程在外部封装，如thread local这类写法上，一定要注意哲学家进餐调度和面包店
 * 算法优化，因为死锁类隐患往往出现在大并发计算的时候，平常看不出，一旦峰值来了就要注意了。
 * 
 * 2 变量在线程调用的时候一定要注意写保护机制， 如concurrent 和 read on write等纠错机制避免
 * leakage
 * 
 * 3 我分词采用的是流水阀门逻辑，一个单进程分解，没有多线程。但是这种addMouseListener的线程
 * 就不一样了，同样有隐患。应注意，多看看书，了解下计算关系学，能很好的处理调度类逻辑。
 * 
 * 4 初学者建议多看看-操作系统原理-最新的教材。
 * */

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class AppInit_XCDX_frame {
	public static void creatCharSizeUI(App NE, int leftRange) {
		NE.app_S.rate.setBounds(420 - leftRange, 36, 50, 20);
		NE.app_S.size_font = new JLabel("文字大小:");
		NE.app_S.size_font.setForeground(Color.yellow);
		NE.app_S.size_font.setBounds(493 - 3 * leftRange, 21, 100, 50);
		NE.app_S.size_font_slider = new DetaSlider(0, 10);
		NE.app_S.size_font_slider.setSnapToTicks(true);
		NE.app_S.size_font_slider.setPaintTicks(true);
		NE.app_S.size_font_slider.setMajorTickSpacing(5);
		NE.app_S.size_font_slider.setMinorTickSpacing(1);
		NE.app_S.size_font_slider.setValue(0);
		NE.app_S.size_font_slider.addChangeListener(event -> {
		});
		System.out.println("启动400编码调试开始-00000039");
		NE.app_S.size_font_slider.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				JSlider source = (JSlider) arg0.getSource();
				NE.app_S.size_font_rot = source.getValue();
				NE.app_S.makeContainer_ZHONG_YAO.zhongYaoTableSimple
						.mouseClicked(arg0);
				NE.app_S.editPane.buttonHighLight.doClick();
				NE.app_S.jTabbedpane.updateUI();
				// loop xls action.. later..
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {// later do
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}
		});
	}

	public static void creatFlowerDensityUI(App NE, int leftRange) {
		NE.app_S.size_font_slider.setBounds(553 - leftRange * 3, 36, 50, 20);
		NE.app_S.density_bloosm = new JLabel("词花密度:");
		NE.app_S.density_bloosm.setForeground(Color.yellow);
		NE.app_S.density_bloosm.setBounds(493 - 3 * leftRange, -7, 100, 50);
		NE.app_S.leaf = new DetaSlider(0, 7);
		NE.app_S.leaf.setSnapToTicks(true);
		NE.app_S.leaf.setPaintTicks(true);
		NE.app_S.leaf.setMajorTickSpacing(5);
		NE.app_S.leaf.setMinorTickSpacing(1);
		NE.app_S.leaf.setValue(0);
		NE.app_S.leaf.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			NE.app_S.leafrot = source.getValue();
			NE.keyReleased(null);
		});
		System.out.println("启动400编码调试开始-00000041");
		NE.app_S.leaf.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// loop xls action.. later..
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}
		});
	}

	public static void creatTalkSpeedSetUI(App NE, int leftRange) {
		NE.app_S.color_bg_slider.setBounds(674 - (leftRange << 2), 36, 50, 20);
		// 稍后缩进
		NE.app_S.read_speed = new JLabel("语速快慢:");
		NE.app_S.read_speed.setForeground(Color.yellow);
		NE.app_S.read_speed.setBounds(614 - (leftRange << 2), -7, 100, 50);
		NE.app_S.read_speed_slider = new DetaSlider(0, 20);
		NE.app_S.read_speed_slider.setSnapToTicks(true);
		NE.app_S.read_speed_slider.setPaintTicks(true);
		NE.app_S.read_speed_slider.setMajorTickSpacing(5);
		NE.app_S.read_speed_slider.setMinorTickSpacing(1);
		NE.app_S.read_speed_slider.setValue(0);
		NE.app_S.read_speed_slider.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			NE.app_S.read_speed_rot = source.getValue();
			NE.keyReleased(null);
		});
		System.out.println("启动400编码调试开始-00000044");
		NE.app_S.read_speed_slider.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}
		});
	}

	public static void creatScaleSearchUI(App NE, int leftRange) {
		NE.app_S.jingmai_filter = new JLabel("精确搜索:");
		NE.app_S.jingmai_filter.setForeground(Color.yellow);
		NE.app_S.jingmai_filter.setBounds(360 - leftRange, -7, 100, 50);
		NE.app_S.look = new DetaSlider(0, 12);
		NE.app_S.look.setSnapToTicks(true);
		NE.app_S.look.setPaintTicks(true);
		NE.app_S.look.setMajorTickSpacing(5);
		NE.app_S.look.setMinorTickSpacing(1);
		NE.app_S.look.setValue(0);
		NE.app_S.look.addChangeListener(event -> {// later。。
			JSlider source = (JSlider) event.getSource();
			NE.app_S.lookrot = source.getValue();
		});
		System.out.println("启动400编码调试开始-00000035");
		NE.app_S.look.addMouseListener(new MouseListener() {// later.. do
			@SuppressWarnings({ "serial", "deprecation" })
			@Override
			public void mouseReleased(MouseEvent arg0) {
				JSlider source = (JSlider) arg0.getSource();
				NE.app_S.lookrot = source.getValue();
				Component component = new Component() {
				};// later..
				KeyEvent keyEvent = new KeyEvent(component, 0, 0, 0, 10);
				keyEvent.setKeyCode(10);
				NE.keyReleased(keyEvent);
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}
		});
	}

	public static void creatColorTextUI(App NE, int leftRange) {
		NE.app_S.look.setBounds(420 - leftRange, 8, 50, 20);
		NE.app_S.color_text = new JLabel("文本颜色:");
		NE.app_S.color_text.setForeground(Color.yellow);
		NE.app_S.color_text.setBounds(360 - leftRange, 21, 100, 50);
		NE.app_S.rate = new DetaSlider(0, 20);
		NE.app_S.rate.setSnapToTicks(true);
		NE.app_S.rate.setPaintTicks(true);
		NE.app_S.rate.setMajorTickSpacing(5);
		NE.app_S.rate.setMinorTickSpacing(1);
		NE.app_S.rate.setValue(0);
		NE.app_S.rate.addChangeListener(event -> {
		});
		System.out.println("启动400编码调试开始-00000037");
		NE.app_S.rate.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				JSlider source = (JSlider) arg0.getSource();
				NE.app_S.raterot = source.getValue() - 100;
				NE.app_S.makeContainer_ZHONG_YAO.zhongYaoTableSimple
						.mouseClicked(arg0);
				// loop xls action.. later..
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}
		});
	}

	public static void creatColorSetUI(App NE, int leftRange) {
		NE.app_S.leaf.setBounds(553 - leftRange * 3, 8, 50, 20);
		NE.app_S.color_bg = new JLabel("背景颜色:");
		NE.app_S.color_bg.setForeground(Color.yellow);
		NE.app_S.color_bg.setBounds(614 - (leftRange << 2), 21, 100, 50);
		NE.app_S.color_bg_slider = new DetaSlider(0, 200);
		NE.app_S.color_bg_slider.setSnapToTicks(true);
		NE.app_S.color_bg_slider.setPaintTicks(true);
		NE.app_S.color_bg_slider.setMajorTickSpacing(5);
		NE.app_S.color_bg_slider.setMinorTickSpacing(1);
		NE.app_S.color_bg_slider.setValue(0);
		NE.app_S.color_bg_slider.addChangeListener(event -> {
		});
		NE.app_S.color_bg_slider.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				JSlider source = (JSlider) arg0.getSource();
				NE.app_S.color_bg_rot = source.getValue();
				NE.app_S.jTabbedpane.updateUI();
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}
		});
	}
}