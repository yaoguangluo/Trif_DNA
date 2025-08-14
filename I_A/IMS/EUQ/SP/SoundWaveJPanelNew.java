package I_A.IMS.EUQ.SP;

import ME.VPC.M.app.App;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.filenameFilter.TXTFilter;
import U_A.PEU.P.movie.LYGFileIO;
import U_A.PEU.P.sound.SoundRecord;
import jniFFT.LYGFFT;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于 java sound demo JDK 官方 demo 写的
public class SoundWaveJPanelNew extends SoundWave implements Runnable {
    ////

    public SoundWaveJPanelNew(Container jpanelFourth, LYGFFT fFT, JTextPane text
        , BufferedImage imageForOutput, App app_NE) {
        NE = app_NE;
        this.imageForOutput = imageForOutput;
        this.fFT = fFT;
        this.setBackground(new Color(100, 100, 100));
        forOutput = new Vector<java.lang.Float>();
        rec = new SoundRecord(null);

        double[] fft = new double[1024];
        for (int regi = 0; regi < fft.length; regi++) {
            fft[regi] = 0.0;
        }
        fft[4] = 500.0;
        double[] rooms = new double[1024];
        for (int regi = 0; regi < fft.length; regi++) {
            rooms[regi] = 0.0;
        }
        LYGFileIO lYGFileIO = new LYGFileIO().initWithFFT(rooms, NE);
        waveJpanel = new O_V.OSI.OSU.AVU.OSQ.wavePlay.Jp(lYGFileIO);

        JButton j = new DetaButton("录音", 100 - 20, 50, Color.pink);
        j.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 1;
                type = 0;
                t1 = new Thread(SoundWaveJPanelNew.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
                jpanelFourth.validate();
            }
        });
        j.setSize(100, 30);
        j.setBounds(500, 20, 100, 30);
        detaButton = new DetaButton("关闭", 100 - 20, 50, Color.black);
        detaButton.setForeground(Color.black);
        detaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 0;
                if (null != waveJpanel) {
                    waveJpanel.reg = 0;
                }
                if (null != jpanelFourth) {
                    jpanelFourth.validate();
                }
            }
        });
        detaButton.setSize(100, 30);
        JButton j2 = new DetaButton("生成数列", 100 - 20, 50, Color.green);
        j2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 2;
                if (forOutput == null) {
                    return;
                }
                if (forOutput.size() <= 0) {
                    return;
                }
                if (text.getText().length() > 5000) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<java.lang.Float> iterator = forOutput.iterator();
                int i = 0;
                while (iterator.hasNext()) {
                    double setOfi = iterator.next();
                    page.append(" " + (i++) + ":" + setOfi);
                }
                if (!text.getText().isEmpty()) {
                    text.setText(text.getText() + "\r\n\r\n" + page.toString());
                } else {
                    text.setText(page.toString());
                }
                text.validate();
            }
        });
        j2.setSize(100, 30);

        JButton j21 = new DetaButton("读取数列", 100 - 20, 50, Color.green);
        j21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 2;
                if (forOutput == null) {
                    return;
                }
                if (forOutput.size() <= 0) {
                    return;
                }
                if (text.getText().length() > 5000) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<java.lang.Float> iterator = forOutput.iterator();
                int i = 0;
                while (iterator.hasNext()) {
                    double setOfi = iterator.next();
                    page.append(" " + (i++) + ":" + setOfi);
                }
                if (!text.getText().isEmpty()) {
                    text.setText(text.getText() + "\r\n\r\n" + page.toString());
                } else {
                    text.setText(page.toString());
                }
                text.validate();
            }
        });
        j21.setSize(100, 30);

        JButton j3 = new DetaButton("存为图片", 100 - 20, 50, Color.magenta);
        j3.addActionListener(new ActionListener() {
            @SuppressWarnings("unused")
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 0;
                //获取图片
                //弹出保存框
                if (null == imageForOutput) {
                    return;
                }
                //get path
                FileDialog filedialog = new FileDialog(new Frame(), "导入到这里", FileDialog.LOAD);
                filedialog.setFilenameFilter(new TXTFilter("png"));
                filedialog.setVisible(true);
                String filepath = filedialog.getDirectory() + filedialog.getFile();
                //20230106-System.out.println(filepath);
                try {
                    File outputBin = new File(filepath + ".png");
                    if (null == imageForOutput) {
                        return;
                    }
                    ImageIO.write(imageForOutput, "png", outputBin);
                } catch (IOException writePngError) {
                    //20230106-System.out.println(filepath);
                }
                //输出图片
            }
        });
        j3.setSize(100, 30);

        JButton j4 = new DetaButton("高敏噪音", 100 - 20, 50, Color.black);
        j4.setForeground(Color.black);
        j4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (null != waveJpanel) {
                    waveJpanel.validate();
                    waveJpanel.updateUI();
                    validate();
                    updateUI();
                    NE.app_S.jTabbedpane.validate();
                    NE.app_S.jTabbedpane.updateUI();
                }
                NE.app_S.reg = 1;
                type = 1;
                t1 = new Thread(SoundWaveJPanelNew.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
                jpanelFourth.validate();
            }
        });
        j4.setSize(100, 30);

        JButton j5 = new DetaButton("读取图片", 100 - 20, 50, Color.black);
        j5.setForeground(Color.black);
        j5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 1;
                type = 1;
                t1 = new Thread(SoundWaveJPanelNew.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
                jpanelFourth.validate();
            }
        });
        j5.setSize(100, 30);

        JButton j51 = new DetaButton("调制解调", 100 - 20, 50, Color.black);
        j51.setForeground(Color.black);
        j51.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 1;
                type = 1;
                //new fft[];
                //double[]  fft= new double[1024];
                //fft[4]= 500;
                //LYGFileIO lYGFileIO= new LYGFileIO().initWithFFT(new double[1024]
                //, makeContainerZNSZ);
                //waveJpanel= new org.LYG.node.sound.wavePlay.jp(lYGFileIO);
                waveJpanel.reg = 5;
                t1 = new Thread(waveJpanel);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
                ;
                jpanelFourth.validate();
            }
        });
        j51.setSize(100, 30);

        DetaButton j6 = new DetaButton("山林", 100 - 10, 50, Color.green);
        j6.setForeground(Color.black);
        j6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 1;
                type = 1;
                t1 = new Thread(SoundWaveJPanelNew.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
                jpanelFourth.validate();
            }
        });
        j6.setSize(100, 30);

        DetaButton j7 = new DetaButton("海边", 100 - 20, 50, Color.blue);
        j7.setForeground(Color.black);
        j7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 1;
                type = 1;
                t1 = new Thread(SoundWaveJPanelNew.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
                jpanelFourth.validate();
            }
        });
        j7.setSize(100, 30);

        JButton j8 = new DetaButton("美梦", 100 - 20, 50, Color.magenta);
        j8.setForeground(Color.black);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NE.app_S.reg = 1;
                type = 1;
                t1 = new Thread(SoundWaveJPanelNew.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
                jpanelFourth.validate();
            }
        });
        j8.setSize(100, 30);
        this.add(j);
        this.add(detaButton);
        this.add(j2);
        this.add(j21);
        this.add(j3);
        this.add(j5);
        this.add(j4);
        this.add(j51);
        this.add(j6);
        this.add(j7);
        this.add(j8);
        NE.app_S.jp3n = new SoundWavePanelVectorNew(imageForOutput.getGraphics());
        NE.app_S.jp3n.setBounds(100, 0, 400, 400);
        NE.app_S.jp3n.setVisible(true);
        this.add(NE.app_S.jp3n);
    }

    public void run() {
        if (1 == NE.app_S.reg) {
            Graphics2D g = (Graphics2D) NE.app_S.jp3n.getGraphics();
            g.setBackground(new Color(110, 110, 110));
            g.setColor(new Color(110, 110, 110));
            g.clearRect(0, 40, 1400, 200);
            new ReadingLine(NE).start();
            ;
            // new ComputingLine(this).start();//2025
            ;
            new ShowingLine(NE).start();
            ;
        }
    }
}
