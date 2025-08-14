package ME.VPC.C.skivvy;

import C_A.ME.analysis.C.A;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.MakeContainer_X_S_s;
import exception.thread.DetaThread;

import javax.swing.JSlider;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


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
public class MakeContainerZNSZ_X_S extends MakeContainer_X_S_s {
    public MakeContainerZNSZ_X_S(App NE) {
        super(NE);
        faSliderPage.setSnapToTicks(true);
        faSliderPage.setPaintTicks(true);
        faSliderPage.setMajorTickSpacing(200);
        faSliderPage.setMinorTickSpacing(200);
        faSliderPage.setBackground(Color.black);
        faSliderPage.setForeground(Color.gray);
        faSliderPage.addMouseListener(
            new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    JSlider source = (JSlider) e.getSource();
                    NE.app_S.sourcePageFA = source.getValue();
                    if (null != NE.app_S.pageQ.head) {
                        NE.app_S.pageQ.doClt4WithPage(NE);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            }
        );
        faSliderPage.addKeyListener(
            new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    JSlider source = (JSlider) e.getSource();
                    NE.app_S.sourcePageFA = source.getValue();
                    if (null != NE.app_S.pageQ.head) {
                        NE.app_S.pageQ.doClt4WithPage(NE);
                    }
                }
            }
        );
        paSliderPage.setSnapToTicks(true);
        paSliderPage.setPaintTicks(true);
        paSliderPage.setMajorTickSpacing(1);
        paSliderPage.setMinorTickSpacing(1);
        paSliderPage.setBackground(Color.black);
        paSliderPage.setForeground(Color.gray);
        paSliderPage.addMouseListener(
            new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    JSlider source = (JSlider) e.getSource();
                    NE.app_S.sourcePagePA = source.getValue();
                    if (null != NE.app_S.pageQ.head) {
                        NE.app_S.pageQ.doClt4WithPage(NE);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            }
        );
        frSliderPage.setSnapToTicks(true);
        frSliderPage.setPaintTicks(true);
        frSliderPage.setMajorTickSpacing(1);
        frSliderPage.setMinorTickSpacing(1);
        frSliderPage.setBackground(Color.black);
        frSliderPage.setForeground(Color.gray);
        frSliderPage.addMouseListener(
            new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    JSlider source = (JSlider) e.getSource();
                    NE.app_S.sourcePageFR = source.getValue();
                    //init new
                    NE.app_S.lYGAFDCTDFFT.initk();
                    NE.app_S.lYGAFDCTDFFT_F.initk();
                    //
                    if (null != NE.app_S.pageQ.head) {
                        NE.app_S.pageQ.doClt4WithPage(NE);
                    }
                    //
                    NE.app_S.clearButton.doClick();
                    DetaThread.sleepDeta(100);
                    NE.app_S.line2025.detaButton.doClick();
                    DetaThread.sleepDeta(100);
                    NE.app_S.line2025.j4.doClick();
                    DetaThread.sleepDeta(100);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            }
        );

        pdeSliderPage.setSnapToTicks(true);
        pdeSliderPage.setPaintTicks(true);
        pdeSliderPage.setMajorTickSpacing(1);
        pdeSliderPage.setMinorTickSpacing(1);
        pdeSliderPage.setBackground(Color.black);
        pdeSliderPage.setForeground(Color.gray);
        pdeSliderPage.addMouseListener(
            new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    JSlider source = (JSlider) e.getSource();
                    NE.app_S.sourcePagePDE = source.getValue();//later merge..
                    if (null != NE.app_S.pageQ.head) {
                        NE.app_S.pageQ.doClt4WithPage(NE);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            }
        );

        sliderPage.setSnapToTicks(true);
        sliderPage.setPaintTicks(true);
        sliderPage.setMajorTickSpacing(1);
        sliderPage.setMinorTickSpacing(1);
        sliderPage.setBackground(Color.black);
        sliderPage.setForeground(Color.gray);
        sliderPage.addMouseListener(
            new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    JSlider source = (JSlider) e.getSource();
                    NE.app_S.pageQ.sourcePage = source.getValue();
                    if (NE.app_S.pageQ.sourcePage > NE.app_S.pageQ.count) {
                        NE.app_S.pageQ.sourcePage = NE.app_S.pageQ.count;
                        sliderPage.setValue(NE.app_S.pageQ.sourcePage);
                    }
                    if (null != NE.app_S.pageQ.head) {
                        NE.app_S.pageQ.doClt4WithPage(NE);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            }
        );
        sliderPage.addKeyListener(
            new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    JSlider source = (JSlider) e.getSource();
                    NE.app_S.pageQ.sourcePage = source.getValue();
                    if (NE.app_S.pageQ.sourcePage > NE.app_S.pageQ.count) {
                        NE.app_S.pageQ.sourcePage = NE.app_S.pageQ.count;
                        sliderPage.setValue(NE.app_S.pageQ.sourcePage);
                    }
                    if (null != NE.app_S.pageQ.head) {
                        NE.app_S.pageQ.doClt4WithPage(NE);
                    }
                }
            }
        );
    }

    public int source2 = 0;
    public int source3 = 0;
    public int source4 = 0;
    public int source5 = 0;
    public int source6 = 0;
    public int source7 = 0;
    public int source8 = 0;
    public int source16 = 0;
    public int source32 = 0;
    public int source64 = 0;
    public int source128 = 0;
    public int source256 = 0;
    public int source512 = 0;
    //public int sourcePage = 0;//later

    public JSlider slider2 = new JSlider(0, 360);
    public JSlider slider3 = new JSlider(0, 360);
    public JSlider slider4 = new JSlider(0, 360);
    public JSlider slider5 = new JSlider(0, 360);
    public JSlider slider6 = new JSlider(0, 360);
    public JSlider slider7 = new JSlider(0, 360);
    public JSlider slider8 = new JSlider(0, 360);
    public JSlider slider16 = new JSlider(0, 360);
    public JSlider slider32 = new JSlider(0, 360);
    public JSlider slider64 = new JSlider(0, 360);
    public JSlider slider128 = new JSlider(0, 360);
    public JSlider slider256 = new JSlider(0, 360);
    public JSlider slider512 = new JSlider(0, 360);
    public A _A;
    public JSlider sliderPage = new JSlider(0, 10000);//1024 00 00 max
    public JSlider faSliderPage = new JSlider(0, 50000);
    public JSlider paSliderPage = new JSlider(1, 4);
    public JSlider frSliderPage = new JSlider(2, 16);//32 64 128 256 512 1024 2048 4096
    public JSlider pdeSliderPage = new JSlider(0, 100);
}
