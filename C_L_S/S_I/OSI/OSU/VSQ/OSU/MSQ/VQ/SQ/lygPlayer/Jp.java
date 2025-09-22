package S_I.OSI.OSU.VSQ.OSU.MSQ.VQ.SQ.lygPlayer;

import U_A.PEU.P.movie.LYGFileIO;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Jp extends JPanel {
    
    LYGFileIO cur;
    Thread t1, t2;
    public Image img;
    public File f;
    //	public AviVideoFormat fmv;
//	public WavAudioFormat fav;
    public String fpath;
    public Pm mv;
    public Ps sd;
    public int sytro = 0;
    public RandomAccessFile raf;
    public LYGFileIO io;
    public BufferReader read;
    public float xrot = 0.0f;

    public Jp(final String filepath) {
        read = new BufferReader();
        try {
            raf = new RandomAccessFile(filepath, "r");
            io = new LYGFileIO();
            //read get pos of audio
            io.IQ_header(raf);
            raf.close();
            setLayout(new BorderLayout());
            fpath = filepath;
            JButton filter = new JButton("filter");
            filter.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            JButton j = new JButton("play");
            j.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        raf = new RandomAccessFile(filepath, "r");
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                    //read rand file
                    if (mv == null) {
                        mv = new Pm(raf, io, read);
                        mv.setPreferredSize(new Dimension(600, 400));
                        mv.setVisible(true);
                        add(mv, BorderLayout.CENTER);
                        t1 = new Thread(mv);
                        t1.setPriority(Thread.MIN_PRIORITY);
                        t1.start();
                        mv.updateUI();
                    }
                    if (sd == null) {
                        sd = new Ps(raf, io, read);
                        sd.setPriority(Thread.MIN_PRIORITY);
                        sd.start();
                    }

                    if (t1.isInterrupted() && t2.isInterrupted()) {
                        t1.start();
                        t2.start();
                    }
                }
            });

            JButton j2 = new JButton("stop");
            j2.addActionListener(new ActionListener() {
                @SuppressWarnings("deprecation")
                public void actionPerformed(ActionEvent e) {
                    if (!t1.isInterrupted() || !t2.isInterrupted()) {
                        t1.stop();
                        t2.stop();
                    }
                }
            });


            JButton j1 = new JButton("close");
            j1.addActionListener(new ActionListener() {
                @SuppressWarnings("deprecation")
                public void actionPerformed(ActionEvent e) {
                    if (t1 != null) {
                        mv = null;
                        t1.stop();
                        t1 = null;
                    }
                    if (sd != null) {
                        try {
                            sd.raf.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        sd = null;
                    }
                    if (raf != null) {
                        try {
                            raf.close();
                            raf = null;
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            });
            JPanel jpButtons = new JPanel();
            jpButtons.setLayout(new FlowLayout());
            jpButtons.add(j);
            jpButtons.add(j2);
            jpButtons.add(j1);
            jpButtons.add(filter);

            Box botBox = new Box(BoxLayout.Y_AXIS);
            JSlider sliderx = new JSlider(0, (int)io.duration);
            sliderx.setSnapToTicks(true);
            sliderx.setPaintTicks(true);
            sliderx.setMajorTickSpacing(20);
            sliderx.setMinorTickSpacing(5);
            sliderx.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    xrot = source.getValue();
                }

            });
            botBox.add(sliderx);
            botBox.add(jpButtons);
            add(botBox, BorderLayout.SOUTH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
