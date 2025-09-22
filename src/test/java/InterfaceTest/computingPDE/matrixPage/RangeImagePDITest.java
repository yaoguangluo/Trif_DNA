package test.java.InterfaceTest.computingPDE.matrixPage;

import A_I.MPE.MAQPVDCOISIV.pdi.RangePDI;
import P.image.Guassian;
import U_A.PEU.P.image.ReadWritePng;
import U_V.ESU.image.Image_ESU_X_pixRGBTableToFile;

import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 这是一个 ////非卷积肽数字矩阵变换 如图片 测试main函数demo的test版本，在导入了api之后进行系统集成，然后
 * 用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的参数，
 * 然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，方便集成，对程序员友好。
 * 系统需要jdk1.8 以上的java环境，本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * --罗瑶光
 * */
class RangeImagePDITest {
	public static void main(String[] argv) {
		RangeImagePDITest rangePDITest = new RangeImagePDITest();
		rangePDITest.main();
	}

	// 非卷积肽数字矩阵变换 如图片
	@Test
	void main() {
		// NE初始化
		CommonTestInition commonTestInition = new CommonTestInition();
		commonTestInition.initEnvironment("去弹窗组件流测试");
		// 测试肽计算滤波
		// LYGAFDCTDFFT_F lYGAFDCTDFFT_F = new LYGAFDCTDFFT_F();
		// 初始化
		int facy = 100;// 0～100为酸和碱的浓度模拟区间，不同的浓度不同的环境计算输出。
		//int[][] rp = new int[32][32];
		//for (int i = 0; i < 32; i++) {
		//	for (int j = 0; j < 32; j++) {
		//		rp[i][j] = (int) ((int) (Math.random() * 100000) % 255);
		//		rp[i][j] = (int) ((int) (Math.random() * 100000) % 255);
		//	}
		//}
		// 读取图片
		//图片来自浏览器搜素 图片 关键字复制下来。
		String pathImageIn = "/Users/luoyaoguang430181198505250014/eclipse-workspace/TRIF_DNA"
				+ "/src/test/java/InterfaceTest/computingPDE/matrixPage/input_horri.jpg";
		String pathImageOut= "/Users/luoyaoguang430181198505250014/eclipse-workspace/TRIF_DNA"
				+ "/src/test/java/InterfaceTest/computingPDE/matrixPage/output_horri.jpg";
		int[][] rp = new ReadWritePng().REDpngRead(pathImageIn);
		int[][] gp = new ReadWritePng().GRNpngRead(pathImageIn);
		int[][] bp = new ReadWritePng().BLUpngRead(pathImageIn);
		//高斯平滑
		int[][] outputr = Guassian.P_1D(rp, 15, 15, 1.7);//图片大就要大如15，只能基数设置mask，切记，
		int[][] outputg = Guassian.P_1D(gp, 15, 15, 1.7);
		int[][] outputb = Guassian.P_1D(bp, 15, 15, 1.7);
		// 执行非卷积肽变换滤 255峰值 波测试
		RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(outputr, facy);
		RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(outputg, facy);
		RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(outputb, facy);
		// 输出
		// 输出图片
		//Image_ESU_X_imageToFile 稍后 单元测试 会挨个覆盖率测试
		//Image_ESU_X_bufferedImageToFile 稍后挨个测试
		Image_ESU_X_pixRGBTableToFile._E(pathImageOut, outputr, outputg, outputb, "png");
		/*
		 * 从输出的结果可以清晰地看到图片的白色区域有色素波动，黑色属于纯黑，所以没有区间拉值。
		 * 这种观测适用于海拔，皮肤，不明显特征团
		 * */
		// 关闭
		commonTestInition.endEnvironment();
	}

	@Test
	void IOE() {
	}

	@Test
	void IPE_AOPM_VECS_IDUQ_TXH() {
	}

	@Test
	void IPE_AOPM_VECS_IDUQ_TXH_AC() {
	}

	@Test
	void IPE() {
	}

	@Test
	void QPE() {
	}

	@Test
	void injectPDI() {
	}

	@Test
	void PDSEncode() {
	}

	@Test
	void PDS_OEC_IID() {
	}

	@Test
	void PDS_P_USQ_ECP() {
	}

	@Test
	void PDS_P_USQ_ECP_I() {
	}

	@Test
	void PDS_P_USQ_ECP_I_17() {
	}

	@Test
	void PDS_P_USQ_ECP_I_16() {
	}

	@Test
	void PDS_P_USQ_ECP_I_17_S_() {
	}

	@Test
	void ESU_M_SVQ_PDS_OEU() {
	}

	@Test
	void ESU_ECS_SVQ_PDS_OEU() {
	}

	@Test
	void ESU_P_SVQ_PDS_OEU() {
	}

	@Test
	void ESU_P_SEQ_PDS_OEU() {
	}

	@Test
	void EUP_QD_PQI() {
	}

	@Test
	void EUP_QD_PQU() {
	}

	@Test
	void ESU_M_SVQ_PDS_OEU_M() {
	}

	@Test
	void ESU_M_SVQ_PDS_OEU_P() {
	}

	@Test
	void ESU_M_SVQ_PDS_OEU_O() {
	}

	@Test
	void ESU_M_SVQ_PDS_OEU_A() {
	}

	@Test
	void ESU_M_SVQ_PDS_OEU_OA() {
	}

	@Test
	void double_IPE_AOPM_VECS_IDUQ_TXH_AC() {
	}

	@Test
	void doACAK() {
	}
}