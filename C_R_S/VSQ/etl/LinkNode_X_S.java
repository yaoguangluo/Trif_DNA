package VSQ.etl;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LinkNode_X_S extends Thread{ 
	public boolean actionNodeLeft= false;
	public boolean actionNodeRight= false;
	public Boolean beconnect;
	public Boolean leftChoose;
	public Boolean rightChoose;
	public Boolean tBeconnect;
	public Boolean mBeconnect;
	public Boolean dBeconnect;
	
	public int flash= 0;
	public int tBeconnectX;
	public int tBeconnectY;
	public int tBeconnectID;
	public int mBeconnectX;
	public int mBeconnectY;
	public int mBeconnectID;
	public int dBeconnectX;
	public int dBeconnectY;
	public int dBeconnectID;
	public int ID;
	public int x, y;
	public int oldx, oldy;
	public LinkNode mNode;
	public LinkNode tNode;
	public LinkNode dNode;
	public LinkNode pre;
	public LinkNode next;

	public String tBeconnectName;
	public String tBeconnectPrimaryKey= ""; 
	public String mBeconnectName;
	public String mBeconnectPrimaryKey= "";
	public String nodeConfiguration= "";
	public String primaryKey= "";
	public String name;
	public String dBeconnectName;
	public String dBeconnectPrimaryKey= "";
	
	public OSU_MCI_MCU_MSI thisFace; 
	public LinkNode_X_S(){}
}
