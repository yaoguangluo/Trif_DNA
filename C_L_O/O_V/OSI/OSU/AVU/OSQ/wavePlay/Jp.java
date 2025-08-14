package O_V.OSI.OSU.AVU.OSQ.wavePlay;

import I_A.IMS.EUQ.SP.SoundPlay;
import U_A.PEU.P.movie.LYGFileIO;
import exception.thread.DetaThread;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Jp extends JPanel implements Runnable {
    /**
     *
     */
    //
    LYGFileIO cur;
    Thread t1;
    public Object bootSound = 0;
    public int reg = 0;

    public Jp(LYGFileIO toplygin) {
        cur = toplygin;
        JButton j = new JButton("play bytes");
        j.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reg = 1;
                bootSound = 1;
                t1 = new Thread(Jp.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
            }
        });
        j.setSize(100, 30);

        JButton j1 = new JButton("close");
        j1.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e) {
                reg = 0;
                bootSound = 0;
                t1.stop();
                t1 = null;
            }
        });
        j1.setSize(100, 30);


        JButton j2 = new JButton("play array");
        j2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reg = 2;
                bootSound = 2;
                t1 = new Thread(Jp.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
            }
        });
        j2.setSize(100, 30);


        JButton j3 = new JButton("play master");
        j3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reg = 3;
                bootSound = 3;
                t1 = new Thread(Jp.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
            }
        });
        j3.setSize(100, 30);

        JButton j4 = new JButton("play slave");
        j4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reg = 4;
                bootSound = 4;
                t1 = new Thread(Jp.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
            }
        });
        j4.setSize(100, 30);


        JButton j5 = new JButton("play fftarray");
        j5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reg = 5;
                bootSound = 5;
                t1 = new Thread(Jp.this);
                t1.setPriority(Thread.MIN_PRIORITY);
                t1.start();
            }
        });
        j5.setSize(100, 30);

        this.add(j);
        this.add(j1);
        this.add(j2);
        this.add(j3);
        this.add(j4);
        this.add(j5);
    }

    public void run() {
        if (reg == 1) {
            cur.toHead();
            if (cur.adataFrame != null) {
                new SoundPlay().Play(cur.adataFrame);
            }
            cur.toHead();
            return;
        }
        if (reg == 2) {
            cur.toHead();
            if (cur.adataFrame != null) {
                new SoundPlay().PlayArray(cur.adataFrame);
            }
            cur.toHead();
            return;
        }

        if (reg == 3) {
            cur.toHead();
            if (cur.adataFrame != null) {
                new SoundPlay().PlayMasterArray(cur.adataFrame);
            }
            cur.toHead();
            return;
        }

        if (reg == 4) {
            cur.toHead();
            if (cur.adataFrame != null) {
                new SoundPlay().PlaySlaveArray(cur.adataFrame);
            }
            cur.toHead();
            return;
        }
        if (reg == 5) {
            DetaThread.sleepDeta(10);
            cur.toHead();
            if (cur.adataFrame != null) {
                try {
                    SoundPlay soundPlay = new SoundPlay();
                    soundPlay.PlayFftArray(cur.adataFrame, cur, this, bootSound);
                    Thread thread = new Thread(soundPlay);
                    thread.setPriority(Thread.MIN_PRIORITY);
                    thread.start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            cur.toHead();
            return;
        }
    }
}
