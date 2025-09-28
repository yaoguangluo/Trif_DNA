package S_A.SEM.register;

import java.util.Iterator;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.StaticFunctionMapU_AOPM_E;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticRegisterU_AOPM_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_E, App NE) {

		//稍后封装
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"mapClassification", "input:keywords");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"mapClassification2D", "input:keywords");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"stringClassification2D", "input:keywords");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"listClassification2D", "input:keywords");
		staticFunctionMapU_AOPM_E.annotationMap.put("mapCombination",
			"output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put("listCombination",
			"output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"intArrayCombination", "output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"doubleArrayCombination", "output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"longArrayCombination", "output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"floatArrayCombination", "output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"StringArrayCombination", "output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"charArrayCombination", "output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"byteArrayCombination", "output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"vectorCombination", "output:destination");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"DNAAuthStatusCheckEmailAndPds", "app:string:data");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"DNAAuthStatusCheckEmailAndPde", "app:string:data");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"DNAAuthStatusCheckEmailAndPassword", "app:string:data");
		staticFunctionMapU_AOPM_E.annotationMap.put("DNAAuthCheck",
			"app:string:data");
		staticFunctionMapU_AOPM_E.annotationMap.put("encode",
			"input");
		staticFunctionMapU_AOPM_E.annotationMap.put("decode", "str");
		staticFunctionMapU_AOPM_E.annotationMap.put("EncoderByMd5",
			"salt:pwd:enctimes");
		staticFunctionMapU_AOPM_E.annotationMap.put("EncoderByDNA",
			"key:uPassword:token");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"getNewTokenFromUsrAndUsrToken", "usr:usrToken");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"getSecondMD5Password", "uPassword");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"getFirstMD5Password", "key:uPassword");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"getFirstDNAPassword", "key:uPassword:token");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"getNewTokenFromUsrAndUsrTokenByDNA", "usr:usrToken");
		staticFunctionMapU_AOPM_E.annotationMap.put("CheckRange_P",
			"g");
		staticFunctionMapU_AOPM_E.annotationMap.put("Closing_P",
			"g:kenel");
		staticFunctionMapU_AOPM_E.annotationMap.put("Color_P",
			"r:g:b");
		staticFunctionMapU_AOPM_E.annotationMap.put("convexHull",
			"vertices");
		staticFunctionMapU_AOPM_E.annotationMap.put("compareSlope",
			"dy2:dx2:dy1:dx1");
		staticFunctionMapU_AOPM_E.annotationMap.put("PNGWrite",
			" g:pix:output");
		staticFunctionMapU_AOPM_E.annotationMap.put("CSVWrite",
			"g:pix:outputcsv");
		staticFunctionMapU_AOPM_E.annotationMap.put("Dilation_P",
			"g:kenel");
		staticFunctionMapU_AOPM_E.annotationMap.put("Emboss_P", "g");
		staticFunctionMapU_AOPM_E.annotationMap.put("Erosion_P",
			"g:kenel");
		staticFunctionMapU_AOPM_E.annotationMap.put("print_Mean",
			"outDIR");
		staticFunctionMapU_AOPM_E.annotationMap.put("Guassian_P_2D",
			" g:d:e:sig");
		staticFunctionMapU_AOPM_E.annotationMap.put("Guassian_P_1D",
			"g:frection:kernel:sig");
		staticFunctionMapU_AOPM_E.annotationMap.put("Guassian_P",
			"lygimage:d:e:k");
		staticFunctionMapU_AOPM_E.annotationMap.put("HitAndMiss_P",
			"g:pix:kenel");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"HoughTransformLoop", "g:pix:scale");
		staticFunctionMapU_AOPM_E.annotationMap.put("IV_HTMatrix",
			"g");
		staticFunctionMapU_AOPM_E.annotationMap.put("Laplacian_P",
			"g");
		staticFunctionMapU_AOPM_E.annotationMap.put("Mask_P",
			"mag:dir");
		staticFunctionMapU_AOPM_E.annotationMap.put("Median_P",
			"g:d:e");
		staticFunctionMapU_AOPM_E.annotationMap.put("Opening_P",
			"g:kenel");
		staticFunctionMapU_AOPM_E.annotationMap.put("PrintCurrent",
			"g:pix");
		staticFunctionMapU_AOPM_E.annotationMap.put("writePNG",
			"args:outmag");
		staticFunctionMapU_AOPM_E.annotationMap.put("GRNpngRead",
			"args");
		staticFunctionMapU_AOPM_E.annotationMap.put("REDpngRead",
			"args");
		staticFunctionMapU_AOPM_E.annotationMap.put("BLUpngRead",
			"args");
		staticFunctionMapU_AOPM_E.annotationMap.put("sizeHW", "args");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"createBufferImage", "r:g:b");
		staticFunctionMapU_AOPM_E.annotationMap.put("smallToNormal",
			"r:s:b");
		staticFunctionMapU_AOPM_E.annotationMap.put("PadImage",
			"_image:height:width");
		staticFunctionMapU_AOPM_E.annotationMap.put("RegionGet", "g");
		staticFunctionMapU_AOPM_E.annotationMap.put("buildGraph",
			"g:output");
		staticFunctionMapU_AOPM_E.annotationMap.put("Sobel_P",
			"g:choice");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"Sobel_P_WithMask", "g:choice:mask");
		staticFunctionMapU_AOPM_E.annotationMap.put("Strech_P",
			"g:d:e");
		staticFunctionMapU_AOPM_E.annotationMap.put("Threshold_P",
			"g:Td");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"Threshold_P_Section", "g:Ts:Td");
		staticFunctionMapU_AOPM_E.annotationMap.put("getCnnMeansure",
			"inputs");
		staticFunctionMapU_AOPM_E.annotationMap.put("WAVtoLYG",
			"WAVf:LYGf");
		staticFunctionMapU_AOPM_E.annotationMap.put("summing_P",
			"inputNLP");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"initATableSorterZYNK", "void");
		staticFunctionMapU_AOPM_E.annotationMap.put("initATimeCheck",
			"void");

		staticFunctionMapU_AOPM_E.annotationMap.put("zhiShu",
			"input:scale:shehold");
		staticFunctionMapU_AOPM_E.annotationMap.put("copy2d",
			"input:scale");
		staticFunctionMapU_AOPM_E.annotationMap.put("copy1d",
			"input:scale");
		staticFunctionMapU_AOPM_E.annotationMap.put("copy1dx2",
			"input:scale");

		staticFunctionMapU_AOPM_E.annotationMap.put("initADFT",
			"void");
		staticFunctionMapU_AOPM_E.annotationMap.put("initAFFT",
			"void");
		staticFunctionMapU_AOPM_E.annotationMap.put("guassian1d",
			"input:scale");
		staticFunctionMapU_AOPM_E.annotationMap.put("laplasian1d",
			"input:scale");
		staticFunctionMapU_AOPM_E.annotationMap.put("max_v", "input");
		staticFunctionMapU_AOPM_E.annotationMap.put("max_i", "input");

		staticFunctionMapU_AOPM_E.annotationMap.put("min_v",
			"input:rank");
		staticFunctionMapU_AOPM_E.annotationMap.put("min_i",
			"input:rank");
		staticFunctionMapU_AOPM_E.annotationMap.put("median1D",
			"input:scale");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengTong1D",
			"input");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengPaixX",
			"input");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengPaiyY",
			"input");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengPaiXx",
			"input");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengPaiYy",
			"input");
		staticFunctionMapU_AOPM_E.annotationMap.put("newX",
			"input:width");

		staticFunctionMapU_AOPM_E.annotationMap.put("newY",
			"input:hight");//height
		staticFunctionMapU_AOPM_E.annotationMap.put("newXY",
			"input:width:hight");
		staticFunctionMapU_AOPM_E.annotationMap.put("newXYBest",
			"input:width:hight");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"newYwithoutBound", "input:hight");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"newXYYwithoutBound", "input:width:hight");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"liangHuaDengChaAdd", "input:scale");
		staticFunctionMapU_AOPM_E.annotationMap.put("liangHuaXiHua",
			"input:scale");

		staticFunctionMapU_AOPM_E.annotationMap.put(
			"liangHuaDengChaMines", "input:scale");
		//稍后去掉拼音接口, 只有中文和英文
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"liangHuaEqualDelete", "input");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"liangHuaXiHuaHalfSide", "input");
		staticFunctionMapU_AOPM_E.annotationMap.put("shehold1D",
			"input:scale");
		staticFunctionMapU_AOPM_E.annotationMap.put("caiJian1D",
			"input:left:right");
		staticFunctionMapU_AOPM_E.annotationMap.put("unZipWithPath",
			"zipFullPath:zipCategory");
		staticFunctionMapU_AOPM_E.annotationMap.put(
			"bootBackupByUsingGzip", "zipPath");
		staticFunctionMapU_AOPM_E.annotationMap.put("fileToZip",
			"sourceFilePath:zipFilePath:fileName");
		staticFunctionMapU_AOPM_E.annotationMap.put("compress",
			"data");
		staticFunctionMapU_AOPM_E.annotationMap.put("uncompress",
			"data");

		staticFunctionMapU_AOPM_E.annotationMap.put("P_Heart",
			"zuoBiao:distance:scale");
		staticFunctionMapU_AOPM_E.annotationMap.put("P_Model",
			"zuoBiao:yanjing");

		Iterator<String> iterators = staticFunctionMapU_AOPM_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"U_AOPM");
		}
	}
}
