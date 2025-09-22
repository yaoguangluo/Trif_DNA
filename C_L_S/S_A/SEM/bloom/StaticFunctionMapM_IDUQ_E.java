package S_A.SEM.bloom;

import A_I.MPE.MSU.ouler.Q_OulerRing;
import A_I.MPE.MSU.ouler.Q_OulerRing16;
import A_I.MPE.MSU.pde.DecadeToPDS;
import A_I.MPE.MSU.pde.DecadeToPDS16;
import A_I.MPE.MSU.pds.PDE_PDS_DL;
import A_I.MPE.MSU.pds.PDE_PDS_DL16;
import S_A.pheromone.IMV_SIQ;

//著作权人+ 作者= 罗瑶光
public class StaticFunctionMapM_IDUQ_E implements StaticFunctionMapM_IDUQ_C{
	public IMV_SIQ annotationMap= new IMV_SIQ();
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
