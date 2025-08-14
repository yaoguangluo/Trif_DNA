package VSQ.etl;

import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.CheckRangeVPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.ChooseQ_VPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawArrowVPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DynamicLineU_VPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.MenuItem;
import java.awt.PopupMenu;

//作者: 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ThisCanvas_X_S extends JPanel {
    
    public int w, h;
    public int flash = 0;
    public int count = 0;
    public int currentNodeID;
    public int currentX, currentY;
    public int choose = 0;
    public int oldX, oldY;
    public int newx, newy;
    public int is_O = 0;
    public int is_OS = 0;
    public String currentNodePrimaryKey;
    public String currentNodeName;
    public String fileCurrentpath;
    public LinkList first;
    public NodeShow nodeView;
    public JTextPane rightBotJTextPane;
    public PopupMenu nodeMenu;
    public MenuItem save, delete, load;
    public MenuItem run, show;
    public ChooseQ_VPS chooseCheck;
    public DynamicLineU_VPS dynamicLineUpdater;
    public DrawArrowVPS drawArrow;
    public CheckRangeVPS checkRange;
    public Thread threadApplet;
}
//	public int mouseDirection= 0;
//public MenuItem menuItem;
//public NodeProject nodeProject;
//	public NodeInfo nodeInfo;
//	public UnicornJSplitPane mainSplitPane;
//	public UnicornJSplitPane leftSplitPane;
//	public UnicornJSplitPane rightSplitPane;
//	public UnicornJSplitPane righttopSplitPane;
//	public JScrollPane righttopScrollPane;
//	public JScrollPane rightdownScrollPane;
//	public JScrollPane rightrightScrollPane;
//	public String treeNodeName;
//public boolean isInit= false;