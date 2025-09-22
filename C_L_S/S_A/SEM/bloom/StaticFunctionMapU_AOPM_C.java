package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.Token;
import U_A.PEU.P.image.ConvexHull.Vertex;
import U_A.PEU.P.table.TableSorterZYNK;
import U_A.PEU.P.time.TimeCheck;

import java.awt.image.BufferedImage;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Vector;
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapU_AOPM_C {
	public static IMV_SIQ annotationMap= new IMV_SIQ();
	 
	//Cache_M 入选jdk, 略
	//ObjectClassification
	public Map<String, IMV_SIQ>mapClassification(App NE);
	public Map<String, IMV_SIQ>mapClassification2D(App NE);
	public Map<String, String[]>stringClassification2D(App NE);
	public Map<String, List<String>>listClassification2D(App NE);

	//ObjectCombination {
	public IMV_SIQ mapCombination(App NE);
	public List<Object> listCombination(App NE);
	public int[] intArrayCombination(App NE);
	public double[]  doubleArrayCombination(App NE);
	public long[] longArrayCombination(App NE);
	
	public float[] floatArrayCombination(App NE);
	public String[] StringArrayCombination(App NE);
	public char[] charArrayCombination(App NE);
	public byte[] byteArrayCombination(App NE);
	public Vector<Object> vectorCombination(App NE);

	//DNAAuth {
	public boolean DNAAuthStatusCheckEmailAndPds(App NE)
			;
	public boolean DNAAuthStatusCheckEmailAndPde(App NE)
			;
	public boolean DNAAuthStatusCheckEmailAndPassword(App NE);
	public boolean DNAAuthCheck(App NE);

	//StringUtil {
	public String encode(App NE);
	public String decode(App NE);
	public String EncoderByMd5(App NE) throws NoSuchAlgorithmException;
	public String EncoderByDNA(App NE);

	//TokenUtil {
	public Token getNewTokenFromUsrAndUsrToken(App NE);
	public String getSecondMD5Password(App NE);
	public String getFirstMD5Password(App NE);
	public String getFirstDNAPassword(App NE);
	public Token getNewTokenFromUsrAndUsrTokenByDNA(App NE);

	//image
	// CheckRange {
	public int[][] CheckRange_P(App NE);

	//Closing {
	public int[][] Closing_P(App NE);

	//Color_P {
	public String Color_P(App NE);

	//ConvexHull {		
	public List<Vertex> convexHull(App NE);
	public int compareSlope(App NE);
	public void PNGWrite(App NE);
	public void CSVWrite(App NE);

	//Dilation{
	public int[][] Dilation_P(App NE);

	//Emboss {
	public int[][] Emboss_P(App NE);

	//Erosion{
	public int[][] Erosion_P(App NE);

	// GetMean {
	public double print_Mean(App NE);

	////Group_O { 稍后把 非个人著作权的几十行踢出去。
	//public double[] [] GO(int[][] kener, int[][] refG, int[] size);

	//Guassian {
	public int[][] Guassian_P_2D(App NE);
	public int[][] Guassian_P_1D(App NE);
	public BufferedImage Guassian_P(App NE);

	// HitAndMiss{
	public int[][] HitAndMiss_P(App NE);

	//HoughTransform {
	public void HoughTransformLoop(App NE);
	public void IV_HTMatrix(App NE);

	//Laplacian {
	public int[][] Laplacian_P(App NE);

	//Mask {
	public int[][] Mask_P(App NE);

	//Median {
	public int[][] MedianIntArray_P(App NE);
	public BufferedImage Median_P(App NE);

	//Opening {
	public int[][] Opening_P(App NE);
	//PrintMoments{
	public void PrintCurrent(App NE);

	//ReadWritePng {	
	public void writePNG(App NE);
	public void writePNGT(App NE);
	public int[][] GRNpngReadString(App NE);
	public int[][] GRNpngRead(App NE);
	public int[][] REDpngReadString(App NE);
	public int[][] REDpngRead(App NE);
	public int[][] BLUpngReadString(App NE);
	public int[][] BLUpngRead(App NE);
	public int[] sizeHW(App NE);
	public BufferedImage createBufferImage(App NE);

	//RedRaf{
	public int[][] smallToNormal(App NE);

	//Reflection {//renhat教授的稍后剔出去
	public int[][] PadImage(App NE);

	//RegionGet {
	public void RegionGet(App NE);
	public void buildGraph(App NE);

	//Sobel {
	public int[][] Sobel_P(App NE);
	public int[][] Sobel_P_WithMask(App NE);

	//Strech {
	public int[][] StrechIntM_P(App NE);
	public BufferedImage Strech_P(App NE);

	//Threshold {
	public int[][] Threshold_P(App NE);
	public int[][] Threshold_P_Section(App NE);

	////VtoV{ 移除著作权的 和 u vecs 已经出现的稍后剔除出去。先注释掉
	//public JSONObject XmlToJsonObject(String response);
	//public IMV_SIQ JsonObjectToMap(JSONObject response);
	//public String MapToJsonString(IMV_SIQ response);
	//public String ListToJsonString(List<Object> response);
	//public String ObjectToJsonString(Object response);
	//public IMV_SIQ XmlToMap(String response);
	//public String MapToXml(IMV_SIQ response);
	//public List<Object> JsonArrayToList(JSONArray jobj);

	//CnnMeasure{
	public double[] [] getCnnMeansure(App NE);

	//StringUtil { 见我git的 备份描述refer 和 著作申请版本备份refer 都有详细说明
	//md5 官方 注释下, 以后用 dna MD5的作为纪念。 奇怪 还让我eclipse卡死一下刚。
	//public String encode(String input)  ;
	//public String decode(String str) ;
	//public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException
	// ;
	//public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException
	// ;

	//WAVtoLYG{ 以前设计视频的加密很少用。
	public void WAVtoLYG(App NE);
	//LYGFileIO
	//public LYGFileIO initWithFFT(double fft[], MakeContainerZNSZ makeContainerZNSZ);
	//public void lygRead(String filepath)  ;
	//public void lygWrite(String string)  ;
	//public void IQ_header(RandomAccessFile raf)  ;
	//public void IV_ByAudioBytes(AudioFormat af) ;

	//DETA_ANN_HMM {
	public String[][] summingNLP_P(App NE)
	;
	//DETA_DNN {
	public String[][] summing_P(App NE)
	 ;

	//sort he search 没有实用价值  见 top5Dsort, 略, 稍后我会把 养疗经的表格search 组件提取出来变成函数。
	//声音滤波发音 略, 不想设计统一接口, 因为涉及武器安防领域, 本人去年承诺过, 不再个人研发,

	//tablesort 
	public TableSorterZYNK initATableSorterZYNK(App NE); 
	public TimeCheck initATimeCheck(App NE);

	//wave 
	//Common{
	public double[]  zhiShu(App NE);

	//Copy{
	public double[] [] copy2d(App NE);
	public double[] copy1d(App NE);
	public double[] copy1dx2(App NE);

	//DFT
	public void initADFT(App NE);

	//FFT
	public void initAFFT(App NE);

	//Guassian{
	public double[]  guassian1d(App NE);

	//Laplasian{
	public double[]  laplasian1d(App NE);

	//MaxAndMin{
	public double max_v(App NE);
	public double max_i(App NE);
	public double min_v(App NE);
	public double min_i(App NE);

	//Median{
	public double[]  median1d(App NE);

	//PeakStatistic{
	public double[] [] fengTong1D(App NE);
	public double[] [] fengPaixX(App NE);
	public double[] [] fengPaiyY(App NE);
	public double[] [] fengPaiXx(App NE);
	public double[] [] fengPaiYy(App NE);

	//Proportion{
	public double[]  newX(App NE);
	public double[]  newY(App NE);
	public double[]  newXY(App NE);
	public double[]  newXYBest(App NE);
	public double[]  newYwithoutBound(App NE);
	public double[]  newXYYwithoutBound(App NE);

	//Quantification{
	public double[]  liangHuaDengChaAdd(App NE);
	public double[]  liangHuaXiHua(App NE);

	public double[]  liangHuaDengChaMines(App NE);
	public double[]  liangHuaEqualDelete(App NE);
	public double[]  liangHuaXiHuaHalfSide(App NE);
	//Shehold{
	public double[]  shehold1D(App NE);
	//Tailor{
	public double[]  caiJian1D(App NE);

	//UnZip {
	public void unZipWithPath(App NE);

	//BootBackup {  
	public void bootBackupByUsingGzip(App NE);
	//sourceFilePath is a root category of 待压缩的文件目录
	//zipFilePath is a zip category of 压缩的文件目录到
	//fileName is a zip file name
	public boolean fileToZip(App NE);

	//GzipUtil {
	// 压缩
	public byte[] compressBytes(App NE);
	public byte[] compress(App NE);
	public byte[] uncompress(App NE);

	//Filter{
	public int[][] P_Heart(App NE);
	public int[][] P_Model(App NE);//粗糙版本以后优化。
}
