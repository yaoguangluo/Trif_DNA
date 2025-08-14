package S_A.SEM.bloom;

import A_I.MPE.MSU.ouler.Q_OulerRing;
import A_I.MPE.MSU.ouler.Q_OulerRing16;
import A_I.MPE.MSU.pde.DecadeToPDS;
import A_I.MPE.MSU.pde.DecadeToPDS16;
import A_I.MPE.MSU.pds.PDE_PDS_DL;
import A_I.MPE.MSU.pds.PDE_PDS_DL16;
import S_A.pheromone.IMV_SIQ;

//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapM_IDUQ_C {
	public static IMV_SIQ annotationMap= new IMV_SIQ();
	
	public Q_OulerRing getQ_OulerRing();
	public Q_OulerRing16 getQ_OulerRing16();
	public DecadeToPDS getDecadeToPDS();
	public DecadeToPDS16 getDecadeToPDS16();
	public PDE_PDS_DL getPDE_PDS_DL();
	public PDE_PDS_DL16 getPDE_PDS_DL16();
	
}
