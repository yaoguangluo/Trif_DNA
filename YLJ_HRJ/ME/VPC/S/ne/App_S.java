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
import S_A.SEM.bloom.StaticRootMap;
import S_A.SVQ.stable.S_MapsInitons;
import S_A.SixActionMap.FlowerAction;
import S_A.pheromone.IMV_SIQ;
import YLJ_HRJ.ME.VPC.S.images.ImageIndex;

import S_A.SEM.reflection.*;
import S_A.SEM.bloom.*;

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
	//去static，稍后HVPCS分解
	public StaticRootMap staticRootMap = new StaticRootMap();
	public FlowerAction flowerAction = new FlowerAction();
	public S_MapsInitons _S_MapsInitons = new S_MapsInitons();

	public StaticReflectionMapA_VECS_C staticReflectionMapA_VECS_C = new StaticReflectionMapA_VECS_C();
	public StaticReflectionMapA_IDUQ_C staticReflectionMapA_IDUQ_C = new StaticReflectionMapA_IDUQ_C();
	public StaticReflectionMapO_VECS_C staticReflectionMapO_VECS_C = new StaticReflectionMapO_VECS_C();
	public StaticReflectionMapO_IDUQ_C staticReflectionMapO_IDUQ_C = new StaticReflectionMapO_IDUQ_C();

	public StaticReflectionMapP_VECS_C staticReflectionMapP_VECS_C = new StaticReflectionMapP_VECS_C();
	public StaticReflectionMapP_IDUQ_C staticReflectionMapP_IDUQ_C = new StaticReflectionMapP_IDUQ_C();
	public StaticReflectionMapM_VECS_C staticReflectionMapM_VECS_C = new StaticReflectionMapM_VECS_C();
	public StaticReflectionMapM_IDUQ_C staticReflectionMapM_IDUQ_C = new StaticReflectionMapM_IDUQ_C();

	public StaticReflectionMapV_AOPM_C staticReflectionMapV_AOPM_C = new StaticReflectionMapV_AOPM_C();
	public StaticReflectionMapV_IDUQ_C staticReflectionMapV_IDUQ_C = new StaticReflectionMapV_IDUQ_C();
	public StaticReflectionMapE_AOPM_C staticReflectionMapE_AOPM_C = new StaticReflectionMapE_AOPM_C();
	public StaticReflectionMapE_IDUQ_C staticReflectionMapE_IDUQ_C = new StaticReflectionMapE_IDUQ_C();

	public StaticReflectionMapC_AOPM_C staticReflectionMapC_AOPM_C = new StaticReflectionMapC_AOPM_C();
	public StaticReflectionMapC_IDUQ_C staticReflectionMapC_IDUQ_C = new StaticReflectionMapC_IDUQ_C();
	public StaticReflectionMapS_AOPM_C staticReflectionMapS_AOPM_C = new StaticReflectionMapS_AOPM_C();
	public StaticReflectionMapS_IDUQ_C staticReflectionMapS_IDUQ_C = new StaticReflectionMapS_IDUQ_C();

	public StaticReflectionMapI_AOPM_C staticReflectionMapI_AOPM_C = new StaticReflectionMapI_AOPM_C();
	public StaticReflectionMapI_VECS_C staticReflectionMapI_VECS_C = new StaticReflectionMapI_VECS_C();
	public StaticReflectionMapD_AOPM_C staticReflectionMapD_AOPM_C = new StaticReflectionMapD_AOPM_C();
	public StaticReflectionMapD_VECS_C staticReflectionMapD_VECS_C = new StaticReflectionMapD_VECS_C();

	public StaticReflectionMapU_AOPM_C staticReflectionMapU_AOPM_C = new StaticReflectionMapU_AOPM_C();
	public StaticReflectionMapU_VECS_C staticReflectionMapU_VECS_C = new StaticReflectionMapU_VECS_C();
	public StaticReflectionMapQ_AOPM_C staticReflectionMapQ_AOPM_C = new StaticReflectionMapQ_AOPM_C();
	public StaticReflectionMapQ_VECS_C staticReflectionMapQ_VECS_C = new StaticReflectionMapQ_VECS_C();

	public StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_C = new StaticFunctionMapA_VECS_E();
	public StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_C = new StaticFunctionMapA_IDUQ_E();
	public StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_C = new StaticFunctionMapO_VECS_E();
	public StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_C = new StaticFunctionMapO_IDUQ_E();
	public StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_C = new StaticFunctionMapP_VECS_E();
	public StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_C = new StaticFunctionMapP_IDUQ_E();
	public StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_C = new StaticFunctionMapM_VECS_E();
	public StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_C = new StaticFunctionMapM_IDUQ_E();

	public StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_C = new StaticFunctionMapV_AOPM_E();
	public StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_C = new StaticFunctionMapV_IDUQ_E();
	public StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_C = new StaticFunctionMapE_AOPM_E();
	public StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_C = new StaticFunctionMapE_IDUQ_E();
	public StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_C = new StaticFunctionMapC_AOPM_E();
	public StaticFunctionMapC_IDUQ_E staticFunctionMapC_IDUQ_C = new StaticFunctionMapC_IDUQ_E();
	public StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_C = new StaticFunctionMapS_AOPM_E();
	public StaticFunctionMapS_IDUQ_E staticFunctionMapS_IDUQ_C = new StaticFunctionMapS_IDUQ_E();
	
	public StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_C = new StaticFunctionMapI_AOPM_E();
	public StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_C = new StaticFunctionMapI_VECS_E();
	public StaticFunctionMapD_AOPM_E staticFunctionMapD_AOPM_C = new StaticFunctionMapD_AOPM_E();
	public StaticFunctionMapD_VECS_E staticFunctionMapD_VECS_C = new StaticFunctionMapD_VECS_E();
	public StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_C = new StaticFunctionMapU_AOPM_E();
	public StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_C = new StaticFunctionMapU_VECS_E();
	public StaticFunctionMapQ_AOPM_E staticFunctionMapQ_AOPM_C = new StaticFunctionMapQ_AOPM_E();
	public StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C = new StaticFunctionMapQ_VECS_E();
	
	
	
	public App_S() {
		super();
		if (imageIndex == null) {// shaohou main init
			imageIndex = new ImageIndex();
		}
	}
}
//page- obj-stand-vet-vstay-base