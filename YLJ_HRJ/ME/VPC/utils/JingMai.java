package ME.VPC.utils;

import S_A.SVQ.stable.S_File;

import javax.swing.*;
import java.awt.*;
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
public class JingMai extends Panel {
    //
    //mock trif 稍后单例化工厂。
    public ImageIcon png1;
    public ImageIcon png2;
    public ImageIcon png3;
    public ImageIcon png4;
    public ImageIcon png5;
    public ImageIcon png6;
    public ImageIcon png7;
    public ImageIcon png8;
    public ImageIcon png9;
    public ImageIcon png10;
    public ImageIcon png11;
    public ImageIcon png12;
    private final Image screenImage = new BufferedImage(800, 600, 2);
    private final Graphics2D screenGraphic = (Graphics2D) screenImage.getGraphics();
    private Image backgroundImage;

    public JingMai() {
        if(null==getClass()){
            return;//fatal trif
        }
        if(null==getClass().getResource("sjyxbj.png")){
            return;
        }
        png1 = new ImageIcon(getClass().getResource("sjyxbj.png"));
        png2 = new ImageIcon(getClass().getResource("手少阳三焦经.png"));
        png3 = new ImageIcon(getClass().getResource("手少阴心经.png"));
        png4 = new ImageIcon(getClass().getResource("手太阳小肠经.png"));
        png5 = new ImageIcon(getClass().getResource("手太阴肺经.png"));
        png6 = new ImageIcon(getClass().getResource("手阳明大肠经.png"));
        png7 = new ImageIcon(getClass().getResource("足厥阴肝经.png"));
        png8 = new ImageIcon(getClass().getResource("足少阳胆经.png"));
        png9 = new ImageIcon(getClass().getResource("足少阴肾经.png"));
        png10 = new ImageIcon(getClass().getResource("足太阳膀胱经.png"));
        png11 = new ImageIcon(getClass().getResource("足太阴脾经.png"));
        png12 = new ImageIcon(getClass().getResource("足阳明胃经.png"));
        S_File.DNA_PDN.put(this.getClass().getCanonicalName(), true);
        loadImage();
        // 设定焦点在本窗体
        setFocusable(true);
        // 设定初始构造时面板大小, 这里先采用图片的大小
        setPreferredSize(new Dimension(800, 600));
        // 绘制背景
        drawView();
    }

    /**
     * 载入图像
     */
    private void loadImage() {
        //获得当前类对应的相对位置image文件夹下的背景图像
        //将图像实例赋给backgroundImage
        backgroundImage = png1.getImage();
    }

    private void drawView() {
        screenGraphic.drawImage(backgroundImage, 0, 0, null);
    }

    public void paint(Graphics g) {
        g.drawImage(screenImage, 0, 0, null);
    }
}  