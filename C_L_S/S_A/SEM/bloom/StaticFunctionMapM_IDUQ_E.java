package S_A.SEM.bloom;

import A_I.MPE.MSU.ouler.Q_OulerRing;
import A_I.MPE.MSU.ouler.Q_OulerRing16;
import A_I.MPE.MSU.pde.DecadeToPDS;
import A_I.MPE.MSU.pde.DecadeToPDS16;
import A_I.MPE.MSU.pds.PDE_PDS_DL;
import A_I.MPE.MSU.pds.PDE_PDS_DL16;
import S_A.pheromone.IMV_SIQ;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticFunctionMapM_IDUQ_E extends StaticFunctionMapCASE
	implements StaticFunctionMapM_IDUQ_C {

	@Override
	public Q_OulerRing getQ_OulerRing() {
		return new Q_OulerRing();
	}

	@Override
	public Q_OulerRing16 getQ_OulerRing16() {
		return new Q_OulerRing16();
	}

	@Override
	public DecadeToPDS getDecadeToPDS() {
		return new DecadeToPDS();
	}

	@Override
	public DecadeToPDS16 getDecadeToPDS16() {
		return new DecadeToPDS16();
	}

	@Override
	public PDE_PDS_DL getPDE_PDS_DL() {
		return new PDE_PDS_DL();
	}

	@Override
	public PDE_PDS_DL16 getPDE_PDS_DL16() {
		return new PDE_PDS_DL16();
	}

}
