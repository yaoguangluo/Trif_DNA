package S_A.SEM.bloom;

import ME.VPC.M.app.App;

import java.util.List;
/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
//著作权人 + 作者= 罗瑶光
public interface StaticFunctionMapI_VECS_C  {
	//SkinPathDoubleDetectTripFix2D_E{
	public List<String> doTestWithImageAPP(App NE);

	public double[] doFourJianPDErosion(App NE);

	public double[] doFourSuanPDErosion(App NE);

	public double[] doEightSuanPDErosion(App NE);

	public double[] doEightJianPDErosion(App NE);

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
