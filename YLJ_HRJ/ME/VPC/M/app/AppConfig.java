package ME.VPC.M.app;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.V.config.SectionJPanel;
import ME.VPC.V.config.ShellJPanel;
import M_V.MVQ.tabbedpane.DetabbedPane;
import O_V.OPM.ESU.admin.PLSQLSectionPanel;
import O_V.OPM.ESU.admin.VPCSRestPanel;
import O_V.OPM.ESU.admin.YouBiaoSectionPanel;
import S_A.SVQ.stable.S_File;
import S_I.OSI.PEI.PCI.PSI.tinShell.AddTinShellView;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.KeyEvent;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class AppConfig extends ScrollPane {
    
    public boolean isConfig = true;
    public SectionJPanel SectionJPanel;
    public PLSQLSectionPanel pLSQLJPanel;
    public YouBiaoSectionPanel youBiaoJPanel;
    public ShellJPanel pLShellJPanel;
    public VPCSRestPanel vPCSRestPanel;

    public void IV_(App app) {
        S_File.DNA_PDN.put(this.getClass().getCanonicalName(), true);
        DetabbedPane jTabbedpane = new DetabbedPane();
        Container SectionJPanelContainer = new Container();
        SectionJPanel = new SectionJPanel(app);
        SectionJPanel.setLayout(null);
        SectionJPanel.setBounds(0, 0, 800, 750);
        SectionJPanelContainer.add(SectionJPanel);
        jTabbedpane.addTab("总启动专科与系统配置版面", new ImageIcon()
            , SectionJPanelContainer, "总启动专科与系统配置版面");
        jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0);

        Container pLSQLJPanelContainer = new Container();
        pLSQLJPanel = new PLSQLSectionPanel(app);
        pLSQLJPanel.setLayout(null);
        pLSQLJPanel.setBounds(0, 0, 800, 750);
        pLSQLJPanelContainer.add(pLSQLJPanel);
        jTabbedpane.addTab("德塔PLSQL控制台", new ImageIcon()
            , pLSQLJPanelContainer, "德塔PLSQL控制台");
        jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1);

        Container pLShellJPanelContainer = new Container();
        pLShellJPanel = new ShellJPanel(new OSU_MCI_MCU_MSI()
            , app, new AddTinShellView(), new TinMap(), new TinMap(), new TinMap());
        pLShellJPanel.setLayout(null);
        pLShellJPanel.setBounds(0, 0, 800, 750);
        pLShellJPanelContainer.add(pLShellJPanel);
        jTabbedpane.addTab("德塔TIN SHELL语言控制台", new ImageIcon()
            , pLShellJPanelContainer, "德塔TIN SHELL语言控制台");
        jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2);

        Container zongHeJPanelContainer = new Container();
        youBiaoJPanel = new YouBiaoSectionPanel(app);
        youBiaoJPanel.setLayout(null);
        youBiaoJPanel.setBounds(0, 0, 800, 750);
        zongHeJPanelContainer.add(youBiaoJPanel);
        jTabbedpane.addTab("综合游标配置中心", new ImageIcon()
            , zongHeJPanelContainer, "综合游标配置中心");
        jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3);
        vPCSRestPanel = new VPCSRestPanel(app);
        vPCSRestPanel.setLayout(null);
        vPCSRestPanel.setBounds(0, 0, 800, 750);
        this.setPreferredSize(new Dimension(800, 750));
        //jTabbedpane.setBounds(0, 0, 805, 505);
        this.add(jTabbedpane);
        this.setBounds(0, 0, 793, 753);
        this.setVisible(true);
        this.validate();
    }
}