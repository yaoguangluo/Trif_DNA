package test.java.InterfaceTest.initon.util;

import java.util.Iterator;

import U_A.PEU.P.table.TableSorterZYNK;
import U_V.OEU.xqpx.wcms.sort.LYG10D13D_X_CAS;
import V_A.SQ.ReadPinYinBihua;
import test.java.interfaces.test.CommonTestInition;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
/*
 * 这个函数用于测试工程所有文件打印出文件名，函数名和文件夹名，方便之后古拉丁文 十六元基索引
 * 首先我是十六元基编码个人著作权人，作者，是我罗瑶光创造了这个学术体系，从无到有，作为创造者，
 * 我有义务将它细化美观。拼音词库表中 161行 x->x 去掉，不然会导致ascii检索比较问题 影响排
 * 序输出。 -罗瑶光
 * */
public class FindAllProjectFiles {
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] argv)
		throws NoSuchFieldException, InstantiationException,
		IllegalAccessException, ClassNotFoundException {
		// 初始化
		CommonTestInition commonTestInition = new CommonTestInition();
		commonTestInition.initEnvironment("去弹窗组件流测试");
		// 初始化载体
		ReadPinYinBihua.getPinYinBihuaMap(commonTestInition.NE);
		TableSorterZYNK tableSorterZYNK = new TableSorterZYNK(
			commonTestInition.NE);
		//
		System.out.println("---------初始注册函数SMI");
		commonTestInition.NE.app_S.studyVerbalMap.init_SMV(
			commonTestInition.NE);
		Iterator<String> iterators = commonTestInition.NE.app_S.studyVerbalMap._SMI
			.keySet().iterator();
		String[] _SMI_ = new String[commonTestInition.NE.app_S.studyVerbalMap._SMI
			.size()];
		int i = 0;
		while (iterators.hasNext()) {
			String temp = iterators.next();
			System.out.println(temp);
			_SMI_[i++] = temp;
		}
		System.out.println("---------初始注册函数SMV");
		iterators = commonTestInition.NE.app_S.studyVerbalMap._SMV
			.keySet().iterator();
		String[] _SMV_ = new String[commonTestInition.NE.app_S.studyVerbalMap._SMV
			.size()];
		i = 0;
		while (iterators.hasNext()) {
			String temp = iterators.next();
			System.out.println(temp);
			_SMV_[i++] = temp;
		}

		System.out.println("---------初始注册函数SMQ");
		iterators = commonTestInition.NE.app_S.studyVerbalMap._SMQ
			.keySet().iterator();
		String[] _SMQ_ = new String[commonTestInition.NE.app_S.studyVerbalMap._SMQ
			.size()];
		i = 0;
		while (iterators.hasNext()) {
			String temp = iterators.next();
			System.out.println(temp);
			_SMQ_[i++] = temp;
		}
		// sort list
		/* 既然写了商业测试demo，那就直接用啊，写了不用不能当花瓶晾着 */
		//		int returnInt = new LYG10D13D_X_CAS()
		//				.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(_SMI_,
		//						0, 9, 30, ReadPinYinBihua.pinYin, ReadPinYinBihua.biHua,
		//						7, 70);
		//		for (String string : _SMI_) {
		//			System.out.println(string);
		//		}

		//		int returnInt = new LYG10D13D_X_CAS()
		//				.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(_SMV_,
		//						0, 9, 30, ReadPinYinBihua.pinYin, ReadPinYinBihua.biHua,
		//						7, 70);
		//		for (String string : _SMV_) {
		//			System.out.println(string);
		//		}
		/*
		 * 拼音词库表中 161行 x->x 去掉，不然会导致ascii检索比较问题 影响排序输出。
		 */
		int len = _SMQ_.length;
		// len=len/15;
		String[] strings = new String[len];
		for (int j = 0; j < len; j++) {
			strings[j] = _SMQ_[j];

		}
		int returnInt = new LYG10D13D_X_CAS()
			.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(
				strings, 0, strings.length - 1, 40,
				ReadPinYinBihua.pinYin, ReadPinYinBihua.biHua, 7, 70);
		System.out.println("---------输出注册函数SMQ");
		for (String string : strings) {
			System.out.println(string);
		}
		//		
		//		// 1 java获取指定类的变量列表
		//		// java有函数结构接口, 打印华瑞集的主干变量
		//		Method[] method = commonTestInition.NE.app_S.getClass()
		//				.getDeclaredMethods();
		//		for (Method m : method) {
		//			System.out.println("-->" + m.getName());
		//			System.out.println("-->" + m.getAnnotations());
		//		}
		//		// 2 java获取工程的函数名列表
		//
		//		// 3 java获取工程的函数文件夹列表
		//		// 之前有了application24的文件，复制过来修改下即可。
		// 关闭
		commonTestInition.endEnvironment();
	}
}
//输出结果
//---------输出注册函数SMQ
//---------输出注册函数SMQ
//传参因子
//因子
//_A
//_AE
//_image
//AMV_MVS_VSQs
//AMV_MVS_VSQs3D
//accept
//acknowledge
//acknowledgeString
//aNNTest
//ann
//app_X_getBox
//app_XCDX
//appConfig
//appFilter
//app
//appHospital
//appInit
//appSearch
//args
//argsString
//argv
//array
//arrayDouble
//arrayDoubleM
//arrayF
//arrayLong
//backendTxt
//baseName
//begin
//begin3D
//beginLine
//bInt
//bM
//bootDBInBaseWay
//bootDBInTXTWay
//bootDBInWebWay
//bootNeroDoc
//bufferedImage
//bufferRow
//button12Jingmai
//buttonADD
//b
//buttonCTE
//buttonCrt
//buttonCTV
//buttonETC
//buttonFRS
//buttonGXB
//buttonSum
//buttonZiWu
//bys
//CacheString
//CacheStringPiple
//callFunctionKey
//canvas
//catalyticRot
//cecil
//cellName
//cellValue
//choice
//clearButton
//coAuthorForWord
//col
//color_bg
//colorRange
//color_bg_slider
//color_bg_rot
//color_text
//columnTitle
//commandAcknowledge
//compareFrequency
//condition
//conditionSubject
//conditionObject
//conditions
//containerPanel
//coods
//coods3D
//copy
//copy_xj
//countScale
//countWordNode
//c
//culmnName
//culumnValue
//culumns
//culumnTypeString
//culumnOfNewRow
//currentDB
//currentPage
//DBTableRowIndexPath
//DNASearchIsClick
//DNNmap
//data
//dataMap
//databasePortTxt
//date
//dBTablePath
//dbConfigPath
//dDouble
//deeps
//defaultTableData
//defaultTableDataSpec
//defaultTableModel
//density_bloosm
//destinationA
//destinationBytes
//destinationCharA
//destinationDoubleA
//destinationF
//destinationLongA
//destinationMap
//de
//destination
//destinationStringA
//destinationV
//detaButton
//dic_cj
//dic_cy
//dic_hai
//dic_index
//dic_jj
//dic_jm
//dic_li
//dic_list
//dic_map
//dic_xj
//dic_xw
//dic_xz
//dic_ya
//dic_yl
//dic_yw
//dic_zf
//dir
//direction
//disableCursor
//distanceScale
//distanceScaleDouble
//dNNTest
//dna
//d
//documentFlowAddress
//doubleS
//ds
//dx1
//dx2
//dy1
//dy2
//ecaScale
//eDouble
//editPane
//eightJian
//eightSuan
//emotionInit
//emotionMap
//emotionMap_E
//emotionSample
//e
//encode
//encoding
//enctimes
//end
//end3D
//endLine
//environmentInit
//erosion
//estimateRatios
//estimateValue
//estimateValueA
//FilePath
//father
//fckxPage
//feel_filter
//feel_filter_box
//fftA
//fileCurrentpath
//fileDirectroyPath
//fileName
//file
//filePath
//filesize_KB
//fileType
//filterRate
//filterScale
//find
//findinNewObj
//first
//firstLinkList
//fixWords
//fMHMMListOneTime_E
//fMHMMListOneTime_E_X_S
//fourInitonJianBiTxt
//fourInitonJianECATxt
//fourInitonJianFaTxt
//fourInitonJianFuTxt
//fourInitonJianICATxt
//fourInitonJianJingTxt
//fourInitonJianPCATxt
//fourInitonJianScaleTxt
//fourInitonJianTxt
//fourInitonJianUPCATxt
//fourInitonSuanBiTxt
//fourInitonSuanECATxt
//fourInitonSuanFaTxt
//fourInitonSuanFuTxt
//fourInitonSuanICATxt
//fourInitonSuanJingTxt
//fourInitonSuanPCATxt
//fourInitonSuanScaleTxt
//fourInitonSuanTxt
//fourInitonSuanUPCATxt
//fourJian
//fourSuan
//fqzPage
//frameConfig
//frameFilter
//frameHospital
//frameJingmai
//frameJingmaiZiWu
//frame
//frameTag
//frection
//frontendTxt
//full1024
//full1024Vector
//functionLineDeque
//fyydPage
//getCulumnsValueArray
//gM
//groups2D
//groups2DMap
//groups3D
//groups3DMap
//groupsHeart
//groupsHeart3D
//g
//groups
//groupsList
//groupsList2D
//groupsMap
//groupsMap3D
//groupsRatioList
//gson
//gUISample
//hashCode
//hashtable
//hearts
//hearts2D
//hearts3D
//height
//heightRange
//helpVerbalMap
//hight
//hint
//hook
//huan_cun_jie_kouTxt
//huaRuiJiJtable
//huaRuiJiJtableCulumns
//humanWordsPassword
//icaScale
//ie
//image
//imagePix
//imagePix2D
//imageObserver
//imageIndex
//imageIcon
//initonEncrypt
//initonsDistanceRelationship
//input2D
//input2DList
//input3D
//inputCharset
//inputD
//inputDoubleM
//inputHashMap
//inputHeart
//inputHeart3D
//inputList
//inputListDA
//inputListDT
//inputMap
//inputMap3D
//inputNLP
//inputPixMatrix
//inputPixMatrixT
//inputRatio
//input
//inputString
//inputStringA
//inputsA
//inputT
//inputValue
//inputValues
//isCloseFA
//isClosePA
//isCloseSA
//isFFT
//isGussian
//isIFFT
//isLFFT
//isLianghua
//isMedian
//isPdn
//isRecoding
//isSort
//is
//isTFT
//iterator
//iteratorString
//jaculumnOfUpdateRow
//jFrameList
//jingmai_filter
//jlabel_filter_button
//jlabel_filter_not_have
//joinObj
//jPanel
//jp3n
//jScrollPane
//jScrollPaneJingmai
//jScrollPaneJingmaiZiWu
//jSONArray
//jSONObject
//jsliderDNNRatio
//jsobj
//jsonString
//jsp_name
//jsp_name_filter
//jsp_name_filter_not_have
//jsp_nameFeelFilter
//j
//jText
//jTabbedpane
//jTextPane
//jtable
//jxText
//jzkxPage
//kernel
//kernelM
//k
//key
//keyMap
//keyDouble
//keywords
//LYGf
//lan_ya_jie_kouTxt
//leaf
//leafrot
//leftDouble
//lenovoInit
//line2025
//linkNode
//list2D
//list3D
//list
//listCharPosition
//listDouble
//listObject
//listString
//lock
//lockString
//lockBys
//logo
//look
//lookrot
//luo_filter
//luo_filter_box
//lYGAFDCTDFFT
//lYGAFDCTDFFT_F
//lYGSortESU9D
//lygimage
//mag
//makeContainer_ZHONG_YAO
//makeContainerXLSList
//makeContainerZNSZ
//map
//mask
//maskLineDeque
//maskOutput
//matchValues
//max
//maxDouble
//maxFloat
//miliSecondsDistinction
//min
//minDouble
//minFloat
//mod
//monitor
//mother
//name
//name_filter
//name_filter_not_have
//nameContent
//nameFeelFilter
//nameHospital
//nameScore
//nERO_C_OneTime_E
//needReplaceString
//newDeque
//newFilterLine
//newObj
//newTableModel
//nlp
//nlp_CE_X_S
//node
//nodeView
//notCapture
//obj
//object
//objectA
//objects
//objectsT
//observerPCAScale
//offsetUTC8
//oicd_scale
//originA
//original
//originalDNA
//origin
//originDeque
//originDoubleA
//originFrequency
//orm
//orm_AE
//outDIR
//outDIRM
//outmag
//outmagT
//outputA
//outputBytes
//outputCharA
//outputCharset
//outputcsv
//outputDoubleList
//outputFloatA
//outputIntA
//outputList
//outputLongA
//outputMap
//outputMapList
//output
//outputObjectList
//outputString
//outputStringA
//outputV
//pageBegin
//pageEnd
//pageIndex
//pageP_M
//pageQ
//pageSheetIndex
//panel
//panel_yt
//panelZiWu
//parserCharPosition
//pascalHearts
//pascalHearts3D
//pascalMids
//pascalMids3D
//password
//pcaScale
//pDE_RNA_FullFormular
//pDE_RNA_FullFormularNew
//pDE_RNA_FullFormular_X
//pdc
//pdeRatio
//pds
//pdw
//pixBlue
//pixDistinctScale
//pixGate
//pixGreen
//pix
//pixM
//pixMap
//pixMapT
//pixRatioScale
//pixRed
//plSearch
//plsql
//pngOutputPath
//pngy_2_1
//popupMenu
//pos_X_P
//pos
//position2D
//position2Ds
//position2d
//position3Ds
//positionX
//positionY
//prefixWord
//pwd
//quick6DLuoYaoguangSort3DMap_E
//RBG
//RGB
//range
//rangeEnd
//rangeHigh
//rangeBegin
//rank
//rate
//raterot
//rateWave
//ratioMap
//ratioMap_E
//read_speed
//read_speed_slider
//read_speed_rot
//readChinese
//readDBTableRowIndexCulumnFile
//readDBTableRowIndexFile
//reader
//ready
//reg
//requestString
//rightBotJTextPane
//rightDouble
//rights
//risk_filter
//risk_filter_box
//rM
//rNN_IDETest
//rnn
//rootPath
//rowCells
//r
//row
//rowId
//rowIdString
//rowMap
//rows
//rowsMap
//salt
//sampleSentences
//scale
//scaleRBG
//scaleSUM
//scaleDouble
//scaleDistance
//score
//scoreA
//scores
//scoreMatrix
//scoresList
//searchkey
//searchList
//searchString
//sensingMap_E
//sensingTest
//serverName
//sets
//sharehold
//shehold
//shoujueyin
//shoushaoyang
//shoushaoyin
//shoutaiyang
//shoutaiyin
//shouyangmin
//shuming_filter
//shuming_filter_box
//sig
//sixteenInitonJianBiTxt
//sixteenInitonJianECATxt
//sixteenInitonJianFaTxt
//sixteenInitonJianFuTxt
//sixteenInitonJianICATxt
//sixteenInitonJianJingTxt
//sixteenInitonJianPCATxt
//sixteenInitonJianScaleTxt
//sixteenInitonJianTxt
//sixteenInitonJianUPCATxt
//sixteenInitonSuanBiTxt
//sixteenInitonSuanECATxt
//sixteenInitonSuanFaTxt
//sixteenInitonSuanFuTxt
//sixteenInitonSuanICATxt
//sixteenInitonSuanJingTxt
//sixteenInitonSuanPCATxt
//sixteenInitonSuanScaleTxt
//sixteenInitonSuanTxt
//sixteenInitonSuanUPCATxt
//size
//size_font
//size_font_slider
//size_font_rot
//sleeper_H
//socket
//sortDeepsScale
//sortRangeScale
//sortStackRange
//sourceFilePath
//sourcePageFA
//sourcePageFR
//sourcePagePA
//sourcePagePDE
//spec
//split
//statistic
//stopBy
//s
//string
//stringA
//stringBuilder
//stringTypes
//strV
//studyVerbalMap
//subASCmap
//successICATest
//Td
//Tel_zhong_duan_Txt
//Ts
//tabKey
//table
//tableData
//tableName
//tableData_old
//tableNameMap
//tablePath
//tabNames
//tagSearch
//temp
//tempString
//tempBufferedImage
//tempPages
//testBufferedImagePath
//testImagePath
//testImagePathString
//text
//textContent
//thislist
//times
//timesDouble
//timestamp
//tinMap
//token
//tokenCerts
//top
//translator
//type
//typeA
//uAddress
//uAge
//uEmail
//uEmailEnsure
//uName
//unSplit
//unTest
//uPassWDEnsure
//uPassword
//uPhone
//upcaScale
//uQq
//urlString
//uSex
//usr
//usrToken
//uWeChat
//value
//valueDouble
//v
//vertices
//vector
//vPCSRequest
//vPCSResponse
//WAVf
//wei_filter
//wei_filter_box
//width
//widthRange
//widthDouble
//wkxPage
//workVerbalMap
//wskxPage
//x
//xingwei_filter
//xynkPage
//xyscPage
//xmlString
//y
//yanjing
//yaoCaiLabel
//yaoCaiIndex
//zipCategory
//zipFilePath
//zipFullPath
//zipPath
//ziwuxiang
//zonghe_filter
//zonghe_filter_box
//zujueyin
//zuoBiao
//zushaoyang
//zushaoyin
//zutaiyang
//zutaiyin
//zuyangmin
//zynkxPage
//zyzdxPage