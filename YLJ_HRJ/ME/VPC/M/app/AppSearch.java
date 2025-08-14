package ME.VPC.M.app;

import ME.VPC.S.ne.WindowsUI;
//import ME.VPC.V.search.ChanJPanel;
//import ME.VPC.V.search.ChouchuJPanel;
//import ME.VPC.V.search.ChuangJPanel;
//import ME.VPC.V.search.DuJPanel;
//import ME.VPC.V.search.HanJPanel;
//import ME.VPC.V.search.KuangJPanel;
//import ME.VPC.V.search.PaixieJPanel;
//import ME.VPC.V.search.QitaJPanel;
//import ME.VPC.V.search.ReJPanel;
//import ME.VPC.V.search.TanJPanel;
//import ME.VPC.V.search.TongJPanel;
//import ME.VPC.V.search.TongueJPanel;
//import ME.VPC.V.search.XueJPanel;
//import ME.VPC.V.search.YangJPanel;
import M_V.MVQ.tabbedpane.DetabbedPane;
import S_A.SVQ.stable.S_File;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.KeyEvent;

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
//新增DNN搜索加权, 自带索引仅仅第一次运行耗时需要2分钟。之后保持在1秒内。
//DNN+前10-25 PCA算法优化 加精度调节
//179行加全文professionNameFilter
public class AppSearch extends ScrollPane {


    //把德塔jingDuSouSuo的函数进行函数片段化去重,
    //罗瑶光 202110121
    public void IV_(JTextField name, JTextField xing_wei, JTextField gui_jing) {
        S_File.DNA_PDN.put(this.getClass().getCanonicalName(), true);
        DetabbedPane jTabbedpane = new DetabbedPane();

//        Container xin_zengContainer = new Container();
//        TongueJPanel xin_zengJPanel = new TongueJPanel(name, xing_wei, gui_jing); //以后归纳
//        xin_zengContainer.setLayout(null);
//        xin_zengContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        xin_zengContainer.add(xin_zengJPanel);
//        jTabbedpane.addTab("综合", new ImageIcon(), xin_zengContainer, "综合");
//        jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0);
//
//        Container HanContainer = new Container();
//        HanJPanel hanJPanel = new HanJPanel(name);
//        HanContainer.setLayout(null);
//        HanContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        HanContainer.add(hanJPanel);
//        jTabbedpane.addTab("发冷", new ImageIcon(), HanContainer, "发冷");
//        jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1);
//
//        Container reContainer = new Container();
//        ReJPanel reJPanel = new ReJPanel(name);
//        reContainer.setLayout(null);
//        reContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        reContainer.add(reJPanel);
//        jTabbedpane.addTab("发热", new ImageIcon(), reContainer, "发热");
//        jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2);
//
//        Container TongContainer = new Container();
//        TongJPanel tongPanel = new TongJPanel(name);
//        TongContainer.setLayout(null);
//        TongContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        TongContainer.add(tongPanel);
//        jTabbedpane.addTab("疼痛", new ImageIcon(), TongContainer, "疼痛");
//        jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3);
//
//        Container chouContainer = new Container();
//        ChouchuJPanel chouJPanel = new ChouchuJPanel(name);
//        chouContainer.setLayout(null);
//        chouContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        chouContainer.add(chouJPanel);
//        jTabbedpane.addTab("抽筋", new ImageIcon(), chouContainer, "抽筋");
//        jTabbedpane.setMnemonicAt(4, KeyEvent.VK_4);
//
//        Container duContainer = new Container();
//        DuJPanel duJPanel = new DuJPanel(name);
//        duContainer.setLayout(null);
//        duContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        duContainer.add(duJPanel);
//        jTabbedpane.addTab("中毒", new ImageIcon(), duContainer, "中毒");
//        jTabbedpane.setMnemonicAt(5, KeyEvent.VK_5);
//
//        Container chuangContainer = new Container();
//        ChuangJPanel chuangJPanel = new ChuangJPanel(name);
//        chuangContainer.setLayout(null);
//        chuangContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        chuangContainer.add(chuangJPanel);
//        jTabbedpane.addTab("脓疮", new ImageIcon(), chuangContainer, "脓疮");
//        jTabbedpane.setMnemonicAt(6, KeyEvent.VK_6);
//
//        Container kuangContainer = new Container();
//        KuangJPanel kuangJPanel = new KuangJPanel(name);
//        kuangContainer.setLayout(null);
//        kuangContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        kuangContainer.add(kuangJPanel);
//        jTabbedpane.addTab("癫狂", new ImageIcon(), kuangContainer, "癫狂");
//        jTabbedpane.setMnemonicAt(7, KeyEvent.VK_7);
//
//        Container paixieContainer = new Container();
//        PaixieJPanel paixieJPanel = new PaixieJPanel(name);
//        paixieContainer.setLayout(null);
//        paixieContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        paixieContainer.add(paixieJPanel);
//        jTabbedpane.addTab("排泄", new ImageIcon(), paixieContainer, "排泄");
//        jTabbedpane.setMnemonicAt(8, KeyEvent.VK_8);
//
//        Container TanContainer = new Container();
//        TanJPanel tanJPanel = new TanJPanel(name);
//        TanContainer.setLayout(null);
//        TanContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        TanContainer.add(tanJPanel);
//        jTabbedpane.addTab("痰汗", new ImageIcon(), TanContainer, "痰汗");
//        jTabbedpane.setMnemonicAt(9, KeyEvent.VK_9);
//
//        Container xueContainer = new Container();
//        XueJPanel xueJPanel = new XueJPanel(name);
//        xueContainer.setLayout(null);
//        xueContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        xueContainer.add(xueJPanel);
//        jTabbedpane.addTab("出血", new ImageIcon(), xueContainer, "出血");
//
//        Container yangContainer = new Container();
//        YangJPanel yangJPanel = new YangJPanel(name);
//        yangContainer.setLayout(null);
//        yangContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        yangContainer.add(yangJPanel);
//        jTabbedpane.addTab("瘙痒", new ImageIcon(), yangContainer, "瘙痒");
//
//        Container fuchanContainer = new Container();
//        ChanJPanel fuchanJPanel = new ChanJPanel(name);
//        fuchanContainer.setLayout(null);
//        fuchanContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        fuchanContainer.add(fuchanJPanel);
//        jTabbedpane.addTab("妇产", new ImageIcon(), fuchanContainer, "妇产");
//
//        Container qitaContainer = new Container();
//        QitaJPanel qitaJPanel = new QitaJPanel(name);
//        qitaContainer.setLayout(null);
//        qitaContainer.setBounds(0, 0, WindowsUI.makeContainerWidth
//            , WindowsUI.makeContainerHeight);
//        qitaContainer.add(qitaJPanel);
//        jTabbedpane.addTab("其他", new ImageIcon(), qitaContainer, "其他");

        this.setPreferredSize(new Dimension(800, 600));//later do
        this.add(jTabbedpane);
        this.setBounds(0, 0, 805, 605);
        this.setVisible(true);
        this.validate();
    }
}