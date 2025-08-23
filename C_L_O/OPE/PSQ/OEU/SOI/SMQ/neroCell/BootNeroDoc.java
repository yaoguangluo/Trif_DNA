/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package OPE.PSQ.OEU.SOI.SMQ.neroCell;

import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OPE.VPC.S.skivvy.Skivvy;
import exception.thread.DetaThread;
import S_A.SVQ.stable.S_Annotation;
import S_A.pheromone.IMV_SIQ;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.File_X_Load;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.JTextPane;
import java.io.File;

@SuppressWarnings("unused")
//作者 +著作权人： 罗瑶光, 浏阳
public class BootNeroDoc extends Thread implements Runnable {
    private String fileCurrentpath;
    private LinkList first;
    private LinkNode currentNode;
    private NodeShow nodeView;
    private ThisCanvas canvas;
    private JTextPane rightBotJTextPane;
    private IMV_SIQ pillow;
    App NE;

    public BootNeroDoc(LinkList first, String fileCurrentpath, NodeShow nodeView
        , JTextPane rightBotJTextPane, ThisCanvas canvas, App app_NE) {
        this.fileCurrentpath = fileCurrentpath;
        this.first = first;
        this.rightBotJTextPane = rightBotJTextPane;
        this.canvas = canvas;
        NE = app_NE;
    }

    public void I_Pillow(IMV_SIQ map) {
        this.pillow = map;//map 提供运维, 可控等数据
    }

    public void run() {
        try {
            //20230106-System.out.println(fileCurrentpath);
            if (null == fileCurrentpath || fileCurrentpath.isEmpty()
                || !fileCurrentpath.contains(S_Annotation.FILE_FORMAT_ETL)) {
                //20230106-System.out.println(S_Annotation.ATTENSION_RECHOICE);
                return;
            }
            File file = new File(fileCurrentpath);
            if (!file.isFile()) {
                //20230106-System.out.println(S_Annotation.ATTENSION_RECHOICE);
                return;
            }
            DetaThread.sleepDeta(2);
            currentNode = File_X_Load._E(currentNode, nodeView, file, first, NE);
            DetaThread.sleepDeta(2);
            BootNeroCell.bootCell(currentNode, rightBotJTextPane, canvas, NE);
        } catch (Exception loadE) {
            Skivvy.working(this.getId(), loadE);//skivvy负责vision, pillow, sets
            //, sleeper 全程管理和反馈。
            loadE.printStackTrace();
        }
    }
}
