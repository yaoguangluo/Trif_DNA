package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.SIQ.tinMap.TinMap;

import java.util.List;
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapS_IDUQ_C {
	public static IMV_SIQ annotationMap= new IMV_SIQ();
	 
	//TinMap extends ConcurrentIMV_SIQ implements Cloneable{
	public TinMap clone(App NE) ;
	// DoSplit
	public List<String>splitRegex(App NE);
}
