package OPE.SI.MCI.OEI.OVU.PQE.extOSGI;

import C_A.ME.analysis.C.A;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import OPE.OEQ.MCQ.OVU.PQE.osgi.LinkOSGI;
import OPE.OEQ.MCQ.OVU.PQE.osgi.NodeOSGI;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.fFT.FFTFilterNodeInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.fft2DFilter.Ft2DFilterInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.freqCount.FreqCountNodeInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.guassianWav2DFilter.GuassianWav2DFilterNodeInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.houghWavFilter.HoughWavFilterNodeInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.laplacianFilter.LaplacianFilterNodeInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.logFFT.LogFFTInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.logFFTcount.LogFFTcountInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.lygFilter.LygFilterNodeInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.lygSlaveFilter.LygSlaveFilterInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.maxMiniFilter.MaxMiniFilterNodeInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.medianFilter.MedianFilterNodeInterface;
import OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.wavRead.WavReadNodeInterface;
import OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.xlsReaderNode.XlsReaderNodeInterface;
import OSI.OSU.PSI.OSU.MSQ.VQ.SQ.lygWrite.LYGWriteNodeInterface;
import OSI.OSU.PSU.OSU.MSQ.VQ.SQ.aviToLyg.AVItoLYGNodeInterface;
import OSI.OSU.PSU.OSU.MSQ.VQ.SQ.movieTransfer.MovieTransferNodeInterface;
import OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addPGSearchPage.AddPGSearchPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OVU.OSU.MSQ.OSU.AVU.OSQ.butterworthFilter.ButterworthFilterNodeInterface;
import O_V.OSI.OSU.AVU.OSQ.wavePlay.WavePlayNodeInterface;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.OSU.VSQ.OSU.MSQ.VQ.SQ.lygPlayer.LYGPlayerNodeInterface;
import S_I.OSI.OSU.VSQ.OSU.MSQ.VQ.SQ.lygRead.LYGReadNodeInterface;
import S_I.OSI.OVI.OSU.MSQ.MV.SQ.imageRead.ImageReadNodeInterface;
import S_I.OSI.OVQ.OSU.MSQ.MV.SQ.findColorB.FindColorBInterface;
import S_I.OSI.OVQ.OSU.MSQ.MV.SQ.findColorG.FindColorGInterface;
import S_I.OSI.OVQ.OSU.MSQ.MV.SQ.findColorR.FindColorRInterface;
import S_I.OSI.OVQ.OSU.MSQ.MV.SQ.show3D.Show3DInterface;
import S_I.OSI.OVU.OSU.MSQ.MV.SQ.embossFilter.EmbossFilterInterface;
import S_I.OSI.OVU.OSU.MSQ.MV.SQ.grayFilter.GrayFilterNodeInterface;
import S_I.OSI.OVU.OSU.MSQ.MV.SQ.guassianFilter.GuassianFilterInterface;
import S_I.OSI.OVU.OSU.MSQ.MV.SQ.houghTransform.HoughTransformInterface;
import S_I.OSI.OVU.OSU.MSQ.MV.SQ.imageStrech.ImageStrechNodeInterface;
import S_I.OSI.OVU.OSU.MSQ.MV.SQ.laplacianFilter.LaplacianFilterInterface;
import S_I.OSI.OVU.OSU.MSQ.MV.SQ.medianImageFilter.MedianImageNodeInterface;
import S_I.OSI.OVU.OSU.MSQ.MV.SQ.morphologyFilter.MorphologyFilterInterface;
import S_I.OSI.OVU.OSU.MSQ.MV.SQ.sobelFilter.SobelFilterNodeInterface;
import S_I.OSI.PEI.PCI.PSI.tinShell.AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;

import javax.swing.JTextPane;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register {
	JTextPane text;
	Object[][] tableData_old;
	public App_S u;
	public A _A;
	public IMV_SIQ pos;

	public OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(
			Object[][] tableData_old, JTextPane text, App NE) {
		this.text = text;
		this.tableData_old = tableData_old;
		this.u = NE.app_S;
		this._A = this.u._A;
		this.pos = this.u.fMHMMListOneTime_E_X_S.posCnToCn;
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-01");
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public NodeOSGI Rigester(NodeOSGI first, LinkOSGI link, App NE) {
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-02");
		// 注册
		// XlsReaderNodeInterface xlsReaderNodeInterface= new
		// XlsReaderNodeInterface();
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-02-000");
		// OSU_MCI_MCU_MSI XlsReadernode = (OSU_MCI_MCU_MSI)
		// xlsReaderNodeInterface;
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-02-01-01-01");
		// first = link.addNode(first, XlsReadernode);
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-02-01");
		// OSU_MCI_MCU_MSI imageReadNode = new
		// ImageReadNodeInterface();
		// first = link.addNode(first, imageReadNode);

		// OSU_MCI_MCU_MSI imageStrechNode = new
		// ImageStrechNodeInterface();
		// first = link.addNode(first, imageStrechNode);

		// OSU_MCI_MCU_MSI MedianImageNode = new
		// MedianImageNodeInterface();
		// first = link.addNode(first, MedianImageNode);

		// OSU_MCI_MCU_MSI GrayFilterNode = new
		// GrayFilterNodeInterface();
		// first = link.addNode(first, GrayFilterNode);

		// OSU_MCI_MCU_MSI GuassianFilterNode = new
		// GuassianFilterInterface();
		// first = link.addNode(first, GuassianFilterNode);
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-03");
		// OSU_MCI_MCU_MSI FindColorRNode = new
		// FindColorRInterface();
		// first = link.addNode(first, FindColorRNode);
		// OSU_MCI_MCU_MSI FindColorGNode = new
		// FindColorGInterface();
		// first = link.addNode(first, FindColorGNode);
		// OSU_MCI_MCU_MSI FindColorBNode = new
		// FindColorBInterface();
		// first = link.addNode(first, FindColorBNode);

		// OSU_MCI_MCU_MSI SobelFilterNode= new
		// SobelFilterNodeInterface();
		// first = link.addNode(first, SobelFilterNode);

		// OSU_MCI_MCU_MSI EmbossFilterNode
		// = new EmbossFilterInterface();
		// first = link.addNode(first, EmbossFilterNode);

		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-04");
		// OSU_MCI_MCU_MSI LaplacianFilterNode
		// = new LaplacianFilterInterface();
		// first = link.addNode(first, LaplacianFilterNode);

//        OSU_MCI_MCU_MSI HoughTransformNode = new HoughTransformInterface();
//        first = link.addNode(first, HoughTransformNode);
//
//        OSU_MCI_MCU_MSI WavReadNode = new WavReadNodeInterface();
//        first = link.addNode(first, WavReadNode);
//
//        OSU_MCI_MCU_MSI MedianFilterNode = new MedianFilterNodeInterface();
//        first = link.addNode(first, MedianFilterNode);
//
//        OSU_MCI_MCU_MSI ButterworthFilterNode = new ButterworthFilterNodeInterface();
//        first = link.addNode(first, ButterworthFilterNode);
//
//        OSU_MCI_MCU_MSI LaplacianWaveFilterNode = new LaplacianFilterNodeInterface();
//        first = link.addNode(first, LaplacianWaveFilterNode);
//        System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-05");
//        OSU_MCI_MCU_MSI HoughWavFilterNode = new HoughWavFilterNodeInterface();
//        first = link.addNode(first, HoughWavFilterNode);
//
//        OSU_MCI_MCU_MSI GuassianWav2DFilterNode = new GuassianWav2DFilterNodeInterface();
//        first = link.addNode(first, GuassianWav2DFilterNode);
//
//        OSU_MCI_MCU_MSI MaxMiniFilterNode = new MaxMiniFilterNodeInterface();
//        first = link.addNode(first, MaxMiniFilterNode);
//
//        OSU_MCI_MCU_MSI wavePlayNode = new WavePlayNodeInterface();
//        first = link.addNode(first, wavePlayNode);
//
//        OSU_MCI_MCU_MSI Show3DNode = new Show3DInterface();
//        first = link.addNode(first, Show3DNode);
//
//        OSU_MCI_MCU_MSI MorphologyFilter = new MorphologyFilterInterface();
//        first = link.addNode(first, MorphologyFilter);
//        System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-06");
//        OSU_MCI_MCU_MSI LYGReadNode = new LYGReadNodeInterface();
//        first = link.addNode(first, LYGReadNode);
//
//        OSU_MCI_MCU_MSI LYGWriteNode = new LYGWriteNodeInterface();
//        first = link.addNode(first, LYGWriteNode);
//
//        OSU_MCI_MCU_MSI MovieTransferNode = new MovieTransferNodeInterface();
//        first = link.addNode(first, MovieTransferNode);
//
//        OSU_MCI_MCU_MSI AVItoImagesNode = new AVItoLYGNodeInterface();
//        first = link.addNode(first, AVItoImagesNode);
//
//        OSU_MCI_MCU_MSI LYGPlayerNode = new LYGPlayerNodeInterface();
//        first = link.addNode(first, LYGPlayerNode);
//
//        OSU_MCI_MCU_MSI FFTFilterNode = new FFTFilterNodeInterface();
//        first = link.addNode(first, FFTFilterNode);
//
//        OSU_MCI_MCU_MSI freqCountNode = new FreqCountNodeInterface();
//        first = link.addNode(first, freqCountNode);
//        System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-07");
//        OSU_MCI_MCU_MSI lygFilterNode = new LygFilterNodeInterface();
//        first = link.addNode(first, lygFilterNode);
//
//        OSU_MCI_MCU_MSI lygFilterComp = new Ft2DFilterInterface();
//        first = link.addNode(first, lygFilterComp);
//
//        OSU_MCI_MCU_MSI lygSlave = new LygSlaveFilterInterface();
//        first = link.addNode(first, lygSlave);
//
//        OSU_MCI_MCU_MSI logFFT = new LogFFTInterface();
//        first = link.addNode(first, logFFT);
//        System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-08");
//        OSU_MCI_MCU_MSI logFFTcount = new LogFFTcountInterface();
//        first = link.addNode(first, logFFTcount);
//		OSU_MCI_MCU_MSI dNA3DShow
		// = new dNA3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI();
//		first= link.addNode(first, dNA3DShow);
		// 医学图片页添加
		OSU_MCI_MCU_MSI searchPG = new AddPGSearchPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI();
		if (null == searchPG) {
			System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-04-err");
		}
		searchPG.pageName = "图片搜索";
		// first= link.addNode(first, searchPG);
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-04");
		OSU_MCI_MCU_MSI _OSU_MCI_MCU_MSI = searchPG;
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-05");
		u.gUISample.nodeReflection
				.put(_OSU_MCI_MCU_MSI._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, "");
		_OSU_MCI_MCU_MSI.register(u.gUISample.tableData_old, u.gUISample.text,
				NE);
		_OSU_MCI_MCU_MSI.IMP_PSU(NE);
//		u.gUISample.nodeView.first
		// =
		// u.gUISample.nodeView.link.addNode(u.gUISample.nodeView.first
//				, OSU_MCI_MCU_MSI);
		first = link.addNode(first, _OSU_MCI_MCU_MSI);
		u.searchList.add(searchPG);
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-06");
		OSU_MCI_MCU_MSI tinShell = new AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI();
		tinShell.pageName = "Tin语言";
		// first= link.addNode(first, searchPG);
		_OSU_MCI_MCU_MSI = (OSU_MCI_MCU_MSI) tinShell;
		u.gUISample.nodeReflection
				.put(_OSU_MCI_MCU_MSI._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, "");
		_OSU_MCI_MCU_MSI.register(u.gUISample.tableData_old, u.gUISample.text,
				NE);
		_OSU_MCI_MCU_MSI.IMP_PSU(NE);
//		u.gUISample.nodeView.first
// = u.gUISample.nodeView.link.addNode(u.gUISample.nodeView.first
//				, OSU_MCI_MCU_MSI);
		first = link.addNode(first, _OSU_MCI_MCU_MSI);
		u.searchList.add(tinShell);
		return first;
	}
}
//ddPGSearchPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI	
////////////////
//OSU_MCI_MCU_MSI editPanelReader
//= new EditPanelReaderNodeInterface(this.text);
//first= link.addNode(first, editPanelReader);
//
//OSU_MCI_MCU_MSI editPanelReaderH
//= new EditPanelReaderHNodeInterface(this.text);
//first= link.addNode(first, editPanelReaderH);
//
//OSU_MCI_MCU_MSI addChuFangAttributeH
//= new AddChuFangAttributeHNodeInterface(this.tableData_old
//, this.text);
//first= link.addNode(first, addChuFangAttributeH);
//
//OSU_MCI_MCU_MSI filterChuFangJinJiAttributeH= 
//new filterChuFangJinJiAttributeHNodeInterface(this.tableData_old, this.text);
//first= link.addNode(first, filterChuFangJinJiAttributeH);
//
//OSU_MCI_MCU_MSI chuFangWuXingShowHInterface= 
//new ChuFangWuXingShowHNodeInterface(this.tableData_old, this.text);
//first= link.addNode(first, chuFangWuXingShowHInterface);
////扫描jar、、添加jar
//OSU_MCI_MCU_MSI filterChuFangXingWeiKeyWordsAttributeH= 
//new filterChuFangXingWeiKeyWordsAttributeHNodeInterface(this.tableData_old, this.text);
//first= link.addNode(first, filterChuFangXingWeiKeyWordsAttributeH);
//
//OSU_MCI_MCU_MSI filterChuFangJinJiKeyWordsAttributeH= 
//new filterChuFangJinJiKeyWordsAttributeHNodeInterface(this.tableData_old, this.text);
//first= link.addNode(first, filterChuFangJinJiKeyWordsAttributeH);
//
//OSU_MCI_MCU_MSI updateToEditPane= 
//new updateToEditPaneNodeInterface(this.tableData_old, this.text);
//first= link.addNode(first, updateToEditPane);
//
//OSU_MCI_MCU_MSI readNodeInterface= 
//new ReadNodeInterface(this.tableData_old, this.text);
//first= link.addNode(first, readNodeInterface);

//OSU_MCI_MCU_MSI DNN3DInterface= 
//new ChuFangDNN3DShowNodeInterface(this.tableData_old, this.text, this.u, this._A, this.pos);
//first= link.addNode(first, DNN3DInterface);

//try {
////1扫描
////1.1设计一个文件夹
////扫描文件夹下面资源包录入
//String jarCategoryLink= "";	
//FileDialog filedialog= new FileDialog(new Frame(), S_Data.ATTENSION_LOAD_HISTORY
//, FileDialog.LOAD);
//filedialog.setFilenameFilter(new TXTFilter(S_Data.FILE_FORMAT_ETL));
//filedialog.setVisible(true);
//jarCategoryLink= filedialog.getDirectory();
//////20230106-System.out.println(jarCategoryLink);
//if(null== jarCategoryLink|| jarCategoryLink.isEmpty()|| jarCategoryLink.contains
//(S_Data.FILE_FORMAT_JAR)) {
////20230106-System.out.println(S_Data.ATTENSION_RECHOICE);
//return first;
//}
//File file= new File(jarCategoryLink);
//if(file.isFile()) {
////20230106-System.out.println(S_Data.ATTENSION_FILE_CHOICE);
//return first;
//}
//File[] files= file.listFiles();
//for(int i= 0; i< files.length; i++) {
//@SuppressWarnings({ "deprecation", "resource" })
//URLClassLoader loader= new URLClassLoader(new URL[]{ files[i].toURL() });  
//String filename= files[i].getName().replace(S_Data.FILE_FORMAT_JAR, S_Data.STRING_EMPTY);
//String[] columns= filename.split("\\.");
////如下注释2行代码 refer https://www.cnblogs.com/chinaxin/p/3678442.html 这小伙子以后有前途。哈哈
////Class<?> myclass= loader.loadClass("hand.java.loadjar.TestClass");
////Gene new object
////Object myobject= myclass.newInstance();   
//Class<?> myclass= null;
//try {
//myclass= loader.loadClass(filename+ "."+ columns[columns.length- 1]
//	+ S_Data.NODE_NODE_INTERFACE);
//} catch (ClassNotFoundException e) {
//
//e.printStackTrace();
//}
//Object myobject= null;
//try {
//myobject= myclass.newInstance();
//} catch (InstantiationException | IllegalAccessException e) {
//
//e.printStackTrace();
//}
//OSU_MCI_MCU_MSI OSU_MCI_MCU_MSI
//= (OSU_MCI_MCU_MSI) myobject; 
//first= link.addNode(first, OSU_MCI_MCU_MSI);
//}	
//}catch(Exception e) {
//
//}

//208 //add extp//////
////		//声诊断, 该接口已经2年停止开源研发。
////		OSU_MCI_MCU_MSI soundCheck
//        //= new AddZNSZPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI();
////		soundCheck.pageName= "智能声诊";
////		//first= link.addNode(first, searchPG);
////		OSU_MCI_MCU_MSI OSU_MCI_MCU_MSI
////		= (OSU_MCI_MCU_MSI) soundCheck;
////		u.gUISample.nodeReflection.put(
//        //OSU_MCI_MCU_MSI._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, null);
////		OSU_MCI_MCU_MSI.register(
//        //u.gUISample.tableData_old, u.gUISample.text
////				, u.gUISample.u, u.gUISample._A, u.gUISample.pos);
////		try {
////			OSU_MCI_MCU_MSI.IP;
////		} catch (IOException e1) {
////			e1.printStackTrace();
////		}
//////		u.gUISample.nodeView.first
//        //= u.gUISample.nodeView.link.addNode(u.gUISample.nodeView.first
//////				, OSU_MCI_MCU_MSI);
////		first= link.addNode(first, OSU_MCI_MCU_MSI);
////		u.searchList.add(soundCheck);

//86
//		OSU_MCI_MCU_MSI arffTransferNode
//= new arffTransferNodeInterface();
//		first= link.addNode(first, arffTransferNode);

//		OSU_MCI_MCU_MSI WekaPilot2DNode
//= new WekaPilot2DNodeInterface();
//		first= link.addNode(first, WekaPilot2DNode);
