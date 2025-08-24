package ME.VPC.S.ne;

import ME.VPC.C.skivvy.MakeContainer_ZHONG_YAO;
import ME.VPC.E.sleeper.CecilPage;
import ME.VPC.E.sleeper.FckxPage;
import ME.VPC.E.sleeper.FqzPage;
import ME.VPC.E.sleeper.FyydPage;
import ME.VPC.E.sleeper.JzkxPage;
import ME.VPC.E.sleeper.WkxPage;
import ME.VPC.E.sleeper.WskxPage;
import ME.VPC.E.sleeper.XynkPage;
import ME.VPC.E.sleeper.XyscPage;
import ME.VPC.E.sleeper.ZynkxPage;
import ME.VPC.E.sleeper.ZyzdxPage;
import ME.VPC.M.app.AppConfig;
import ME.VPC.M.app.AppHospital;
import ME.VPC.M.app.AppSearch;
import ME.VPC.M.X.AppFilter_X_IV_;
import ME.VPC.M.X.AppInit_XCDX;
import ME.VPC.M.X.App_XCDX;
import ME.VPC.M.X.App_X_getBox;
import M_V.ME.APM.VSQ.editPane.EditPane;
import M_V.MPI.xls.commonXLS.MakeContainerXLS;
import S_A.pheromone.IMV_SIQ;
import YLJ_HRJ.ME.VPC.S.images.ImageIndex;

import javax.swing.JFrame;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;  

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
public class App_S extends App_S_Systems {

	//
	public XynkPage xynkPage;
	public ZynkxPage zynkxPage;
	public ZyzdxPage zyzdxPage;
	public ImageIndex imageIndex;
	public AppHospital appHospital;
	public AppConfig appConfig;
	public FyydPage fyydPage;
	public FqzPage fqzPage;
	public FckxPage fckxPage;
	public JzkxPage jzkxPage;
	public WkxPage wkxPage;
	public WskxPage wskxPage;
	public CecilPage cecil;
	public EditPane editPane;
	public XyscPage xyscPage;
	public App_XCDX app_XCDX;
	public App_X_getBox app_X_getBox;
	public AppSearch appSearch;
	public AppFilter_X_IV_ appFilter;
	public MakeContainer_ZHONG_YAO makeContainer_ZHONG_YAO;
	public IMV_SIQ tempPages = new IMV_SIQ();
	public List<MakeContainerXLS> makeContainerXLSList = new CopyOnWriteArrayList<>();
	public JFrame frame;
	public AppInit_XCDX appInit;

	public App_S() {
		super();
		if (imageIndex == null) {// shaohou main init
			imageIndex = new ImageIndex();
		}
	}
}
//page- obj-stand-vet-vstay-base