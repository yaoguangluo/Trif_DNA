package M_V.MVQ.tabbedpane;

import ME.VPC.M.app.App;
import exception.thread.DetaThread;

import javax.swing.BorderFactory;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
@SuppressWarnings("unused")
public class DetabbedPane extends JTabbedPane implements ChangeListener {
    ////
    private int x, y = 0;
    public String lastName = "";
    App NE;

    public DetabbedPane(final int x, final int y, java.awt.Color c, App app_NE) {
        super();
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.setOpaque(true);
        this.setBackground(c);
        NE = app_NE;
    }

    public DetabbedPane() {
        super();
    }

    @Override
    public void stateChanged(ChangeEvent arg0) {
        if (null != arg0) {
            return;
        }
        if (null == NE) {
            return;
        }
        if (null == NE.app_S) {
            return;
        }
        if (null != NE.app_S.line2025) {
            if (null != NE.app_S.line2025.detaButton) {
                if (NE.app_S.jTabbedpane.lastName.contains("智能声学")) {
                    NE.app_S.line2025.detaButton.doClick();
                }
            }
        }
        DetaThread.sleepDeta(1000);
        if (null != NE.app_S.monitor) {
            if (null != NE.app_S.monitor.monitor_X_S) {
                if (null != NE.app_S.monitor.monitor_X_S.bt00) {
                    if (NE.app_S.jTabbedpane.lastName.contains("智能视觉")) {
                        NE.app_S.monitor.monitor_X_S.bt00.doClick();
                        NE.app_S.monitor.monitor_X_S.isStop = true;
                    }
                }
            }
        }
        DetaThread.sleepDeta(500);
        DetaThread.sleepDeta(500);
        if (null != NE.app_S.jTabbedpane) {
            NE.app_S.jTabbedpane.getSelectedComponent().validate();
            DetaThread.sleepDeta(500);
        }
        //
        NE.app_S.jTabbedpane.lastName = NE.app_S.jTabbedpane
            .getSelectedComponent().getName();
    }
}
//46
//        if (null != NE.app_S.soundWaveJPanelNew) {
//            if (NE.app_S.reg != 0) {
//                NE.app_S.reg = 0;
//                if (null != NE.app_S.soundWaveJPanelNew.detaButton) {
//                    NE.app_S.soundWaveJPanelNew.detaButton.doClick();
//                }
//                NE.app_S.jTabbedpane.updateUI();
//            }
//        }
//        if (null != NE.app_S.monitor) {
//            if (null != NE.app_S.monitor.monitor_X_S) {
//                if (null != NE.app_S.monitor.monitor_X_S.bt00) {
//                    if (!NE.app_S.monitor.monitor_X_S.isStop) {
//                        NE.app_S.monitor.monitor_X_S.isStop = true;
//                        //DetaThread.sleepDeta(200);
//                        NE.app_S.jTabbedpane.updateUI();
//                    }
//                }
//            }
//        }
