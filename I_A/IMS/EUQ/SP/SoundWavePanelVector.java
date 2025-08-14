package I_A.IMS.EUQ.SP;
//import java.awt.Color;
//import java.awt.Font;

import S_A.linePage.PageP_M;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.geom.Line2D.Double;
import java.util.Vector;
//import ME.VPC.S.WindowsUI;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于 java sound demo JDK 官方 demo 写的
public class SoundWavePanelVector extends Panel {
    public int regLine = 0;
    public float[] temp1024 = new float[1024];
    public PageP_M pageP_M;
    Graphics g3;
    //NE.app_S.pageP_M;
    public SoundWavePanelVector(Graphics graphics) {
        this.g3 = graphics;
    }
    public Vector<Double> lines;
    public Vector<Double> forOutput = new Vector<Double>();
    public String v1;
    public Graphics2D g2;
    //
}
//public boolean isCloseSA = true;
//    public Vector<Double> mlines1;
//    public Vector<Double> mlines2;
//    public Vector<Double> mlines3;
//    public Vector<Double> mlines4;
//    public Vector<Double> mlines5;
//    public Vector<Double> mlines6;
//    public Vector<Double> mlines7;
//    public Vector<Double> mlines8;
//    public Vector<Double> mlines9;
//    public Vector<Double> mlines10;
//    public Vector<Double> mlines11;
//    public Vector<Double> mlines12;