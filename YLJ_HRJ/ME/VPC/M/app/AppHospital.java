package ME.VPC.M.app;

//import ME.VPC.H.hospital.LinChuangJianYanBaoGaoA;
//import ME.VPC.H.hospital.LinChuangJianYanBaoGaoB;
import ME.VPC.H.hospital.XiYaoJPanel;
import ME.VPC.H.hospital.ZhongYaoJPanel;
import ME.VPC.S.ne.WindowsUI;
import M_V.MVQ.label.DetaLabel;
import M_V.MVQ.tabbedpane.DetabbedPane;
import S_A.SVQ.stable.S_File;
import exception.thread.DetaThread;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import java.util.List;

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
public class AppHospital extends ScrollPane implements MouseMotionListener {
    
    public List<DetaLabel> jFrameList = new LinkedList<>();

    public void IV_(JTextPane name, App app) throws InterruptedException {
        S_File.DNA_PDN.put(this.getClass().getCanonicalName(), true);
        DetabbedPane jTabbedpane = new DetabbedPane();
        Container chuanRanJiZhenContainer = new Container();
//        LinChuangJianYanBaoGaoA chuanRanJiZhenPanel
//            = new LinChuangJianYanBaoGaoA(name, jFrameList);
        chuanRanJiZhenContainer.setLayout(null);
        chuanRanJiZhenContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
            , WindowsUI.makeContainerHeight);
       // chuanRanJiZhenContainer.add(chuanRanJiZhenPanel);
        jTabbedpane.addTab("临床检验报告A", new ImageIcon()
            , chuanRanJiZhenContainer, "临床检验报告A");
        jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0);
        DetaThread.sleepDeta(100);
        Container jianYanBaoGaoContainer = new Container();
       // LinChuangJianYanBaoGaoB jianYanBaoGaoJPanel
        //    = new LinChuangJianYanBaoGaoB(name, app, jFrameList);
        jianYanBaoGaoContainer.setLayout(null);
        jianYanBaoGaoContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
            , WindowsUI.makeContainerHeight);
        //jianYanBaoGaoContainer.add(jianYanBaoGaoJPanel);
        jTabbedpane.addTab("临床检验报告B", new ImageIcon()
            , jianYanBaoGaoContainer, "临床检验报告B");
        jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1);
        DetaThread.sleepDeta(100);
        Container zhongyaoContainer = new Container();
        ZhongYaoJPanel zhongyaoJPanel = new ZhongYaoJPanel(name);
        zhongyaoContainer.setLayout(null);
        zhongyaoContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
            , WindowsUI.makeContainerHeight);
        zhongyaoContainer.add(zhongyaoJPanel);
        jTabbedpane.addTab("中药推荐", new ImageIcon()
            , zhongyaoContainer, "中药推荐");
        jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2);
        DetaThread.sleepDeta(100);
        Container xiYaoContainer = new Container();
        XiYaoJPanel xiYaoJPanel = new XiYaoJPanel(app.app_S.jxText);
        xiYaoContainer.setLayout(null);
        xiYaoContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
            , WindowsUI.makeContainerHeight);
        xiYaoContainer.add(xiYaoJPanel);
        jTabbedpane.addTab("西药推荐", new ImageIcon(), xiYaoContainer, "西药推荐");
        jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3);
        DetaThread.sleepDeta(100);
        //this.setLayout(null);
        this.setPreferredSize(new Dimension(800, 600));
        //jTabbedpane.setBounds(0, 0, 805, 505);
        this.add(jTabbedpane);
        this.setBounds(0, 0, 805, 505);
        this.setVisible(true);
        this.addMouseMotionListener(this);
        chuanRanJiZhenContainer.validate();
        jianYanBaoGaoContainer.validate();
        zhongyaoContainer.validate();
        xiYaoContainer.validate();
        this.validate();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}