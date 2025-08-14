package VSQ.etl;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.S.ne.App_S;
import OPE.MSQ.OVU.PQE.nodeInfo.NodeInfo;
import OPE.MSQ.OVU.PQE.nodeProject.NodeProject;
import OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornJSplitPane;
import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.U_RelatedLineVPS;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;
import S_A.pheromone.IMV_SIQ;
import exception.thread.DetaThread;

import javax.swing.JApplet;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.MenuItem;
import java.awt.PopupMenu;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class GUISample_X_S extends JApplet {
    public int w, h;
    public int flash = 0;
    public int count = 0;
    public int choose = 0;
    public int newx, newy;
    public String fileCurrentpath;
    public String currentNodeName;
    public String treeNodeName;

    public UnicornJSplitPane mainSplitPane;
    public UnicornJSplitPane leftSplitPane;
    public UnicornJSplitPane rightSplitPane;
    public UnicornJSplitPane righttopSplitPane;
    public JScrollPane righttopScrollPane;
    public JScrollPane rightdownScrollPane;
    public JScrollPane rightrightScrollPane;
    public JTextPane rightBotJTextPane;
    public JTextPane text;

    public PopupMenu popupMenu, nodeMenu, engineMenu;
    public MenuItem save, saveAs, delete, load, boot, bootETL, osgis;
    public MenuItem menuItem;
    public MenuItem configre, run, show, dNode, dLine;
    public DetaThread thread, threadApplet;

    public App_S u;
    public ThisCanvas canvas;
    public U_RelatedLineVPS updateRelatedLine;
    public CogsBinaryForest_AE _A;
    public Object[][] tableData_old;
    public IMV_SIQ pos;
    public IMV_SIQ nodeReflection = new IMV_SIQ();

    public LinkList first;
    public NodeShow nodeView;
    public NodeProject nodeProject;
    public NodeInfo nodeInfo;
}
//	public int currentx, currenty;
//	public int oldx, oldy;
//	public String currentNodePrimaryKey;
//	public int currentNodeID;
//	public int is_O= 0;