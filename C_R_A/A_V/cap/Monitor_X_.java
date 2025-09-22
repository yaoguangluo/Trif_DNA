package A_V.cap;

import O_V.OSI.AOP.freetts.thread.read.ReadEnglish;
import exception.thread.DetaThread;
import VSQ.ICAQDTVMQVM.Monitor_X_S;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Monitor_X_ extends JApplet {
    ////
    public Monitor_X_S monitor_X_S = new Monitor_X_S();

    public static void main(String[] argv) {
    }

    @Override
    public void init() {
        monitor_X_S.decadeToPDS.IV_(monitor_X_S.decadeToPDS);
        monitor_X_S.readEnglish = new ReadEnglish();

        monitor_X_S.grabber = new OpenCVFrameGrabber(0);
        monitor_X_S.converter = new OpenCVFrameConverter.ToIplImage();
        try {
            monitor_X_S.grabber.start();
            DetaThread.sleepDeta(2000);
            monitor_X_S.frame = monitor_X_S.grabber.grab();
        } catch (Exception e) {
            e.printStackTrace();
        }
        monitor_X_S.frame.imageWidth = 900;
        monitor_X_S.frame.imageHeight = 650;
        monitor_X_S.paintConverter = new Java2DFrameConverter();
        monitor_X_S.difImage = monitor_X_S.paintConverter
            .getBufferedImage(monitor_X_S.frame, 1);
        BufferedImage imageInit = (BufferedImage) monitor_X_S.difImage;
        if (null == imageInit) {
            imageInit = new BufferedImage(0, 0, 0);
        }
        monitor_X_S.encry
            = new int[monitor_X_S.encry_c][imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.encry_new
            = new int[monitor_X_S.encry_c_new][imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.encry_fs
            = new int[monitor_X_S.encry_c_fs][imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_oldr = new int[imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_oldg = new int[imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_oldb = new int[imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_old1 = new int[imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_old2r = new int[imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_old2g = new int[imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_old2b = new int[imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_old3 = new int[imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_old4 = new int[imageInit.getHeight()][imageInit.getWidth()];
        monitor_X_S.out_old5 = new int[imageInit.getHeight()][imageInit.getWidth()];
        this.setBounds(10, 25, 900, 650);
        this.start();
    }

    public void stop() {
        try {
            if (monitor_X_S.grabber != null) {
                monitor_X_S.grabber.stop();
            }
            monitor_X_S.stop = 1;
            this.monitor_X_S.isStop = true;
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public void start() {
    }

    public void paint(Graphics g) {
        try {
            //进行速度调节, 看了下cpu占用15%, 想控制在5%
            if (!this.monitor_X_S.isStop) {
                DetaThread.sleepDeta(16);
                Monitor_X_Animation.X_paint(this.monitor_X_S, this, g);
            }
        } catch (Exception e) {
            //To do
        }
    }

    public void expand(int[][] show, int i, int j, int fac, int k) {
        if (k == 1) {
            for (int v = 0; v < fac; v++) {
                for (int h = 0; h < fac; h++) {
                    if (i + v >= 0 && i + v < show.length
                        && h + j >= 0 && h + j < show[0].length) {
                        show[i + v][h + j] = 255;
                    }
                }
            }
        }
        if (k == 2) {
            for (int v = -fac; v < 0; v++) {
                for (int h = 0; h < fac; h++) {
                    if (i + v >= 0 && i + v < show.length
                        && h + j >= 0 && h + j < show[0].length) {
                        show[i + v][h + j] = 255;
                    }
                }
            }
        }
        if (k == 3) {
            for (int v = 0; v < fac; v++) {
                for (int h = -fac; h < 0; h++) {
                    if (i + v >= 0 && i + v < show.length
                        && h + j >= 0 && h + j < show[0].length) {
                        show[i + v][h + j] = 255;
                    }
                }
            }
        }
        if (k == 4) {
            for (int v = -fac; v < 0; v++) {
                for (int h = -fac; h < 0; h++) {
                    if (i + v >= 0 && i + v < show.length
                        && h + j >= 0 && h + j < show[0].length) {
                        show[i + v][h + j] = 255;
                    }
                }
            }
        }
    }

    public int[][] findDiff(int[][] out, int[][] out_old) {
        int[][] diff = new int[out.length][out[0].length];
        if (out_old != null) {
            for (int i = 0; i < diff[0].length; i++) {
                for (int j = 0; j < diff.length; j++) {
                    if (out[j][i] != out_old[j][i]) {
                        diff[j][i] = out[j][i];
                    }
                    out_old[j][i] = out[j][i];
                }
            }
        } else {
            diff = out;
        }
        return diff;
    }

    public int getMskFilter(int[][] fb, int[][] msk, int i, int j, int size
        , Map<String, Integer> map) {
        if (fb[j][i] != 255) {
            return size;
        }
        if (msk[j][i] == 1) {
            return size;
        }
        if (size > 3000) {
            return size;
        }
        size++;
        map.put(j + ", " + i, 1);
        msk[j][i] = 1;
        if (i + 1 < fb[0].length) {
            size = getMskFilter(fb, msk, i + 1, j, size, map);
        }
        if (i - 1 >= 0) {
            size = getMskFilter(fb, msk, i - 1, j, size, map);
        }
        if (j + 1 < fb.length) {
            size = getMskFilter(fb, msk, i, j + 1, size, map);
        }
        if (j - 1 >= 0) {
            size = getMskFilter(fb, msk, i, j - 1, size, map);
        }
        return size;
    }

    public ArrayList<Cordination> findCordination() {
        ArrayList<Cordination> clist = new ArrayList<>();
        BufferedImage difTemp = (BufferedImage) monitor_X_S.difImage;
        int h = difTemp.getHeight();
        int w = difTemp.getWidth();
        monitor_X_S.gdif = new int[h][w];
        int cp = -16777216;
        // 得到map
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (difTemp.getRGB(j, i) != cp) {
                    monitor_X_S.gdif[i][j] = 1;
                }
            }
        }
        // 计算边缘
        Cordination c = new Cordination();
        c.h0 = 999999;
        c.w0 = 999999;
        c.h1 = 0;
        c.w1 = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (monitor_X_S.gdif[i][j] == 1) {
                    if (c.h0 > i) {
                        c.h0 = i;
                    }
                    if (c.w0 > j) {
                        c.w0 = j;
                    }
                    if (c.h1 < i) {
                        c.h1 = i;
                    }
                    if (c.w1 < i) {
                        c.w1 = i;
                    }
                }
            }
        }
        clist.add(c);
        return clist;
    }
}
//30
//		Monitor_X_ m = new Monitor_X_();
//		m.init();
//		m.setVisible(true);
//		JFrame f = new JFrame();
//		f.setLayout(null);
//		f.add(m);
//		m.monitor_X_S.sliderx = new JSlider(0, 360);
//		m.monitor_X_S.sliderx.setSnapToTicks(true);
//		m.monitor_X_S.sliderx.setPaintTicks(true);
//		m.monitor_X_S.sliderx.setMajorTickSpacing(5);
//		m.monitor_X_S.sliderx.setMinorTickSpacing(1);
//		m.monitor_X_S.sliderx.addChangeListener(
//				new ChangeListener() {
//					public void stateChanged(ChangeEvent event) {
//						JSlider source = (JSlider) event.getSource();
//						m.monitor_X_S.facx = source.getValue();
//					}
//				});
//
//		m.monitor_X_S.slidery = new JSlider(0, 360);
//		m.monitor_X_S.slidery.setSnapToTicks(true);
//		m.monitor_X_S.slidery.setPaintTicks(true);
//		m.monitor_X_S.slidery.setMajorTickSpacing(5);
//		m.monitor_X_S.slidery.setMinorTickSpacing(0);
//		m.monitor_X_S.slidery.addChangeListener(
//				new ChangeListener() {
//					public void stateChanged(ChangeEvent event) {
//						JSlider source = (JSlider) event.getSource();
//						m.monitor_X_S.facy = source.getValue();
//					}
//				});
//
//		m.monitor_X_S.sliderz = new JSlider(0, 360);
//		m.monitor_X_S.sliderz.setSnapToTicks(true);
//		m.monitor_X_S.sliderz.setPaintTicks(true);
//		m.monitor_X_S.sliderz.setMajorTickSpacing(5);
//		m.monitor_X_S.sliderz.setMinorTickSpacing(0);
//		m.monitor_X_S.sliderz.addChangeListener(
//				new ChangeListener() {
//					public void stateChanged(ChangeEvent event) {
//						JSlider source = (JSlider) event.getSource();
//						m.monitor_X_S.facz = source.getValue();
//					}
//				});
//		m.monitor_X_S.slidert = new JSlider(0, 100);
//		m.monitor_X_S.slidert.setSnapToTicks(true);
//		m.monitor_X_S.slidert.setPaintTicks(true);
//		m.monitor_X_S.slidert.setMajorTickSpacing(5);
//		m.monitor_X_S.slidert.setMinorTickSpacing(1);
//		m.monitor_X_S.slidert.addChangeListener(
//				new ChangeListener() {
//					public void stateChanged(ChangeEvent event) {
//						JSlider source = (JSlider) event.getSource();
//						m.monitor_X_S.fact = source.getValue();
//					}
//				});
//		m.monitor_X_S.sliderl = new JSlider(0, 360);
//		m.monitor_X_S.sliderl.setSnapToTicks(true);
//		m.monitor_X_S.sliderl.setPaintTicks(true);
//		m.monitor_X_S.sliderl.setMajorTickSpacing(5);
//		m.monitor_X_S.sliderl.setMinorTickSpacing(0);
//		m.monitor_X_S.sliderl.addChangeListener(
//				new ChangeListener() {
//					public void stateChanged(ChangeEvent event) {
//						JSlider source = (JSlider) event.getSource();
//						m.monitor_X_S.facl = source.getValue();
//					}
//				});
//		m.monitor_X_S.sliderBox.add(m.monitor_X_S.sliderx);
//		m.monitor_X_S.sliderBox.add(m.monitor_X_S.slidery);
//		m.monitor_X_S.sliderBox.add(m.monitor_X_S.sliderz);
//		m.monitor_X_S.sliderBox.add(m.monitor_X_S.slidert);
//		m.monitor_X_S.sliderBox.add(m.monitor_X_S.sliderl);
//		m.monitor_X_S.sliderBox.setBounds(000, 860, 1200, 750);
//		f.add(m.monitor_X_S.sliderBox);
//		f.setTitle("ButtonDemo");
//		f.setLocationRelativeTo(null);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setSize(1000, 1050);
//		f.setVisible(true);