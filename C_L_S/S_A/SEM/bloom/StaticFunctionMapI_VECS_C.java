package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

import java.util.List;

//著作权人 + 作者= 罗瑶光
public interface StaticFunctionMapI_VECS_C {
	public static IMV_SIQ annotationMap= new IMV_SIQ();
	//SkinPathDoubleDetectTripFix2D_E{
	public List<String> doTestWithImageAPP(App NE) ;
	public double[]  doFourJianPDErosion(App NE);
	public double[]  doFourSuanPDErosion(App NE);
	public double[]  doEightSuanPDErosion(App NE);
	public double[]  doEightJianPDErosion(App NE);
	public void doFirstPDErosionWithTop(App NE);
	public void doSecondPDErosionWithTop(App NE);
	public void doThirdPDErosionWithTop(App NE);
	public void initDeciphring(App NE) throws NumberFormatException;

	//SkinPathDetectTrip_E{
	public void doTestWithFilePath(App NE);
	public List<String> doTestWithImage(App NE);
	public void doTestWithBufferedImage(App NE);

	//SkinPathDoubleDetectTripFix2D	
	public void staticMain(App NE);

	//16进制带精度erosion肽展计算观测
	public int[][] doPDERangePDI16(App NE);
	//monitor.rp= new RangePDI().IPE_AOPM_VECS_IDUQ_TXH_AC(monitor.rp, monitor.facy);
}
