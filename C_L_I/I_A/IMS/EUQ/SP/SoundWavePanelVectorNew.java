package I_A.IMS.EUQ.SP;

import ME.VPC.M.app.App;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.Iterator;
import java.util.Vector;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于 java sound demo JDK 官方 demo 写的
public class SoundWavePanelVectorNew extends SoundWavePanelVector {
    public void paint2(float[] ftkD, Color color, int rangedX
        , int rangedY, int midY) {
        if (null == g2 || null == ftkD) {
            return;
        }
        g2.setColor(color);
        for (int i = 0; i < ftkD.length - 1; i++) {
            g2.drawLine(i + rangedX, rangedY - midY - (int) ftkD[i]
                , i + 1 + rangedX, rangedY - midY - (int) ftkD[i + 1]);
        }
    }

    public void paint_string(Color color, int rangedX
        , int rangedY, String domainName) {
        if (null == g2) {
            return;
        }
        g2.setColor(color);
        g2.drawString(domainName, 0 + rangedX, rangedY + 30);
    }

    public SoundWavePanelVectorNew(Graphics graphics) {
        super(graphics);
        // TODO Auto-generated constructor stub
    }

    public void paint2_string(Color color, int rangedX, int rangedY, String domainName) {
        if (null == g2) {
            return;
        }
        g2.setColor(color);
        g2.drawString(domainName, 0 + rangedX - 128, rangedY + 30 + 40);
    }

    public void paint2(float[] ftkDA, float[] ftkDBI, Color color
        , int rangedX, int rangedY, int midY) {
        if (null == g2 || null == ftkDA) {
            return;
        }
        g2.setColor(color);
        for (int i = 0; i < ftkDA.length - 1; i++) {
            g2.drawLine((int) ftkDA[i] * 3 + rangedX
                , rangedY - midY - (int) ftkDBI[i]
                , (int) ftkDA[i + 1] * 3 + rangedX
                , rangedY - midY - (int) ftkDBI[i + 1]);
        }
    }

    public void paint9(Vector<Double> mlines) {
        if (null == g2) {
            return;
        }
        if (mlines != null) {
            g2.setColor(Color.pink);
            if (mlines.size() > 2) {
                Iterator<Double> iterator = mlines.iterator();
                while (iterator.hasNext()) {
                    Line2D v = iterator.next();//later int remove
                    g2.drawLine((int) v.getX1() + 530, 570
                        , (int) v.getX2() + 530, 570 - (int) v.getY2());
                }
            }
        }
        g2.drawString("虚空分阶", 530, 600);
    }

    public void paint11(Vector<Double> mlines) {//later all in 1
        if (null == g2) {
            return;
        }
        if (mlines != null) {
            g2.setColor(Color.white);
            if (mlines.size() > 2) {
                Iterator<Double> iterator = mlines.iterator();
                while (iterator.hasNext()) {
                    Line2D v = iterator.next();//later int remove
                    g2.drawLine((int) v.getX1() + 790, 420
                        , (int) v.getX2() + 790, 420 - (int) v.getY2());
                }
            }
        }
        g2.drawString("薛定谔虚度漂移", 780 + 10, 350 + 120 - 20);
        g3.drawString("输出", 780 + 10, 350 + 120 - 20);
        g2.drawString("噪音报警类别:", 780 + 10, 350 + 220);
        g3.drawString("噪音报警类别:", 780 + 10, 350 + 220);
    }

    public void paintvalue(String v1) {
        g2.setColor(Color.black);
        g2.setFont(new Font("宋体", Font.BOLD + Font.ITALIC, 20));
        if (v1 != null)
            g2.drawString("你说的是" + v1, 10, 780);
    }

    //录制波是尾数复制，所以会remove，读取波是pos提取，会杂乱。
    public void paint(Graphics g, float[] lines
        , Vector<java.lang.Float> forOutput, App NE) {
        //获取每一段数据的8等分，确定当前数据的8等分
        //确定等分比for loop， 每更新一个等分前 擦去当前的等分
        if (null == g2) {
            return;
        }
        g2 = (Graphics2D) g;
        g2.setColor(new Color(95, 95, 95));
        if (regLine + lines.length > 1024) {
            regLine = 0;
            forOutput.clear();
            if (NE.app_S.full1024) {
                NE.app_S.full1024Vector = temp1024.clone();
            }
        }
        int scaleX = regLine;
        int j = 1;
        for (int i = regLine; i < regLine + lines.length - 1; i++) {
            int x = (int) temp1024[i];
            int y = (int) temp1024[i + 1];
            g2.drawLine(j + 10 + scaleX, x, j++ + 11 + scaleX, y);
        }
        g2.drawString(NE.app_S.rateWave + "Hz 时序波", 10, 170);
        g2.setColor(Color.pink);
        if (lines != null) {
            int x = 0;
            int y = 0;
            scaleX = regLine;//later trif
            j = 1;
            for (int i = 0; i < lines.length - 1; i++) {
                x = (int) lines[i] + 120;
                y = (int) lines[i + 1] + 120;
                forOutput.add(lines[i]);
                x = x < 42 ? 42 : x;
                x = x > 185 ? 185 : x;
                y = y < 42 ? 42 : y;
                y = y > 185 ? 185 : y;
                g2.drawLine(j + 10 + scaleX, x, j++ + 11 + scaleX, y);
                if (regLine + i > 1024) {
                    return;
                }
                temp1024[regLine + i] = x;
            }
            temp1024[regLine + lines.length - 1] = y;
            regLine += lines.length;
        }
        g2.drawString(NE.app_S.rateWave + "Hz 时序波", 10, 170);
    }

    public void paintClean() {
        if (null != g2) {
            g2.setColor(new Color(95, 95, 95));
            g2.fillRect(0, 40, 1100, 160 * 3);
        }
    }

    public void paintSA(Color color) {
        if (null == g2) {
            return;
        }
        //十字标
        g2.setColor(color);
        g2.drawLine(10, 120, 1034, 120);
        g2.drawLine(522, 40, 522, 200);
        //刻度标
        int scale = 16;
        for (int xs = 0; xs < 1024; xs += scale) {
            g2.drawLine(xs + 10, 115, xs + 10, 125);
            if (xs % 128 == 0) {
                g2.drawLine(xs + 10, 110, xs + 10, 130);
                g2.drawString("" + xs, xs + 10, 115);//数字标
            }
        }
        for (int ys = 40; ys < 200; ys += scale) {
            g2.drawLine(512 + 5, ys, 512 + 15, ys);
        }
    }

    public void paintSAm(int x, int y, Color color) {
        if (null == g2) {
            return;
        }
        g2.setColor(color);
        g2.drawLine(x, 41, x, 199);//鼠十字
        g2.drawLine(0, y, 1024, y);
        g2.drawString("(" + x + ", " + -(y - 120) + ")", x, y + 30);//鼠tag
    }
}
//186
//    public void paintValid(Graphics g, Vector<Double> lines
//        , Vector<Double> forOutput, Color color) {
//        g2 = (Graphics2D) g;//later be null check;
//        if (lines != null) {
//            forOutput.clear();
//            g2.setColor(color);
//            for (int i = 1, j = 1; i < lines.size() - 1; i++, j++) {
//                Line2D v = lines.get(i);
//                Line2D v1 = lines.get(i + 1);
//                forOutput.add(lines.get(i + 1));
//                int x = (int) v.getY1() + 120;
//                int y = (int) v1.getY2() + 120;
//                if (x < 42) {
//                    x = 42;
//                }
//                if (x > 185) {
//                    x = 185;
//                }
//                if (y < 42) {
//                    y = 42;
//                }
//                if (y > 185) {
//                    y = 185;
//                }
//                g2.drawLine(j + 10, x, j + 11, y);
//            }
//           // temp1024 = (Vector<Double>) lines.clone();
//        }
//        g2.drawString(NE.app_S.rateWave + "Hz 时序波", 10, 170);
//    }