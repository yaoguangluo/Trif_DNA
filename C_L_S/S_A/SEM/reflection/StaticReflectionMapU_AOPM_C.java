package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapU_AOPM_E;
import S_A.pheromone.IMV_SIQ;

import java.util.Map;

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
public class StaticReflectionMapU_AOPM_C {
    public static Map<String, String> annotationMap = new IMV_SIQ();

    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("mapClassification", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.mapClassification(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "mapClassification");
        }//, "mapClassification") ;
        if (callFunctionKey.contains("mapClassification2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.mapClassification2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "mapClassification2D");
        }//, "mapClassification2D");
        if (callFunctionKey.contains("stringClassification2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.stringClassification2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringClassification2D");
        }//, "stringClassification2D");
        if (callFunctionKey.contains("listClassification2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.listClassification2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listClassification2D");
        }//, "listClassification2D");
        if (callFunctionKey.contains("mapCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.mapCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "mapCombination");
        }//, "mapCombination");
        if (callFunctionKey.contains("listCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.listCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listCombination");
        }//, "listCombination");
        if (callFunctionKey.contains("intArrayCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.intArrayCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "intArrayCombination");
        }//, "intArrayCombination");
        if (callFunctionKey.contains("doubleArrayCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.doubleArrayCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doubleArrayCombination");
        }//, "doubleArrayCombination");
        if (callFunctionKey.contains("longArrayCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.longArrayCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "longArrayCombination");
        }//, "longArrayCombination");
        if (callFunctionKey.contains("floatArrayCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.floatArrayCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "floatArrayCombination");
        }//, "floatArrayCombination");
        if (callFunctionKey.contains("StringArrayCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.StringArrayCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "StringArrayCombination");
        }//, "StringArrayCombination");
        if (callFunctionKey.contains("charArrayCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.charArrayCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "charArrayCombination");
        }//, "charArrayCombination");
        if (callFunctionKey.contains("byteArrayCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.byteArrayCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "byteArrayCombination");
        }//, "byteArrayCombination");
        if (callFunctionKey.contains("vectorCombination", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.vectorCombination(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "vectorCombination");
        }//, "vectorCombination");
        if (callFunctionKey.contains("DNAAuthStatusCheckEmailAndPds", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.DNAAuthStatusCheckEmailAndPds(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DNAAuthStatusCheckEmailAndPds");
        }//, "DNAAuthStatusCheckEmailAndPds");
        if (callFunctionKey.contains("DNAAuthStatusCheckEmailAndPde", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.DNAAuthStatusCheckEmailAndPde(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DNAAuthStatusCheckEmailAndPde");
        }//, "DNAAuthStatusCheckEmailAndPde");
        if (callFunctionKey.contains("DNAAuthStatusCheckEmailAndPassword", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.DNAAuthStatusCheckEmailAndPassword(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DNAAuthStatusCheckEmailAndPassword");
        }//, "DNAAuthStatusCheckEmailAndPassword");
        if (callFunctionKey.contains("DNAAuthCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.DNAAuthCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DNAAuthCheck");
        }//, "DNAAuthCheck");
        if (callFunctionKey.contains("encode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.encode(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "encode");
        }//, "encode");
        if (callFunctionKey.contains("decode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.decode(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "decode");
        }//, "decode");
        if (callFunctionKey.contains("EncoderByMd5", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.EncoderByMd5(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "EncoderByMd5");
        }//, "EncoderByMd5");
        if (callFunctionKey.contains("EncoderByDNA", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.EncoderByDNA(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "EncoderByDNA");
        }//, "EncoderByDNA");
        if (callFunctionKey.contains("getNewTokenFromUsrAndUsrToken", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.getNewTokenFromUsrAndUsrToken(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNewTokenFromUsrAndUsrToken");
        }//, "getNewTokenFromUsrAndUsrToken");
        if (callFunctionKey.contains("getSecondMD5Password", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.getSecondMD5Password(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getSecondMD5Password");
        }//, "getSecondMD5Password");
        if (callFunctionKey.contains("getFirstMD5Password", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.getFirstMD5Password(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getFirstMD5Password");
        }//, "getFirstMD5Password");
        if (callFunctionKey.contains("getFirstDNAPassword", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.getFirstDNAPassword(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getFirstDNAPassword");
        }//, "getFirstDNAPassword");
        if (callFunctionKey.contains("getNewTokenFromUsrAndUsrTokenByDNA", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.getNewTokenFromUsrAndUsrTokenByDNA(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNewTokenFromUsrAndUsrTokenByDNA");
        }//, "getNewTokenFromUsrAndUsrTokenByDNA");
        if (callFunctionKey.contains("CheckRange_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.CheckRange_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "CheckRange_P");
        }//, "CheckRange_P");
        if (callFunctionKey.contains("Closing_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Closing_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Closing_P");
        }//, "Closing_P");
        if (callFunctionKey.contains("Color_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Color_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Color_P");
        }//, "Color_P");
        if (callFunctionKey.contains("convexHull", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.convexHull(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "convexHull");
        }//, "convexHull");
        if (callFunctionKey.contains("compareSlope", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.compareSlope(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "compareSlope");
        }//, "compareSlope");
        if (callFunctionKey.contains("PNGWrite", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.PNGWrite(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "PNGWrite");
        }//, "PNGWrite");
        if (callFunctionKey.contains("CSVWrite", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.CSVWrite(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "CSVWrite");
        }//, "CSVWrite");
        if (callFunctionKey.contains("Dilation_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Dilation_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Dilation_P");
        }//, "Dilation_P");
        if (callFunctionKey.contains("Emboss_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Emboss_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Emboss_P");
        }//, "Emboss_P");
        if (callFunctionKey.contains("Erosion_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Erosion_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Erosion_P");
        }//, "Erosion_P");
        if (callFunctionKey.contains("print_Mean", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.print_Mean(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "print_Mean");
        }//, "print_Mean");
        if (callFunctionKey.contains("print_Mean", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.print_Mean(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "print_Mean");
        }//, "print_Mean");
        if (callFunctionKey.contains("Guassian_P_2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Guassian_P_2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Guassian_P_2D");
        }//, "Guassian_P_2D");
        if (callFunctionKey.contains("Guassian_P_1D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Guassian_P_1D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Guassian_P_1D");
        }//, "Guassian_P_1D");
        if (callFunctionKey.contains("Guassian_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Guassian_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Guassian_P");
        }//, "Guassian_P");
        if (callFunctionKey.contains("HitAndMiss_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.HitAndMiss_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "HitAndMiss_P");
        }//, "HitAndMiss_P");
        if (callFunctionKey.contains("HoughTransformLoop", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.HoughTransformLoop(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "HoughTransformLoop");
        }//, "HoughTransformLoop");
        if (callFunctionKey.contains("IV_HTMatrix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.IV_HTMatrix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "IV_HTMatrix");
        }//, "IV_HTMatrix");
        if (callFunctionKey.contains("Laplacian_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Laplacian_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Laplacian_P");
        }//, "Laplacian_P");
        if (callFunctionKey.contains("Mask_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Mask_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Mask_P");
        }//, "Mask_P");
        if (callFunctionKey.contains("Median_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Median_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Median_P");
        }//, "Median_P");
        if (callFunctionKey.contains("Opening_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Opening_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Opening_P");
        }//, "Opening_P");
        if (callFunctionKey.contains("PrintCurrent", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.PrintCurrent(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "PrintCurrent");
        }//, "PrintCurrent");
        if (callFunctionKey.contains("writePNG", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.writePNG(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "writePNG");
        }//, "writePNG");
        if (callFunctionKey.contains("GRNpngRead", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.GRNpngRead(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "GRNpngRead");
        }//, "GRNpngRead");
        if (callFunctionKey.contains("REDpngRead", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.REDpngRead(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "REDpngRead");
        }//, "REDpngRead");
        if (callFunctionKey.contains("BLUpngRead", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.BLUpngRead(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "BLUpngRead");
        }//, "BLUpngRead");
        if (callFunctionKey.contains("sizeHW", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.sizeHW(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sizeHW");
        }//, "sizeHW");
        if (callFunctionKey.contains("createBufferImage", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.createBufferImage(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "createBufferImage");
        }//, "createBufferImage");
        if (callFunctionKey.contains("smallToNormal", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.smallToNormal(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "smallToNormal");
        }//, "smallToNormal");
        if (callFunctionKey.contains("PadImage", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.PadImage(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "PadImage");
        }//, "PadImage");
        if (callFunctionKey.contains("RegionGet", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.RegionGet(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "RegionGet");
        }//, "RegionGet");
        if (callFunctionKey.contains("buildGraph", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.buildGraph(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "buildGraph");
        }//, "buildGraph");
        if (callFunctionKey.contains("Sobel_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Sobel_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Sobel_P");
        }//, "Sobel_P");
        if (callFunctionKey.contains("Sobel_P_WithMask", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Sobel_P_WithMask(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Sobel_P_WithMask");
        }//, "Sobel_P_WithMask");
        if (callFunctionKey.contains("Strech_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Strech_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Strech_P");
        }//, "Strech_P");
        if (callFunctionKey.contains("Threshold_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.Threshold_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Threshold_P");
        }//, "Threshold_P");
        if (callFunctionKey.contains("getCnnMeansure", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.getCnnMeansure(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCnnMeansure");
        }//, "getCnnMeansure");
        if (callFunctionKey.contains("WAVtoLYG", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.WAVtoLYG(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "WAVtoLYG");
        }//, "WAVtoLYG");
        if (callFunctionKey.contains("summing_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.summing_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "summing_P");
        }//, "summing_P");
        if (callFunctionKey.contains("initATableSorterZYNK", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.initATableSorterZYNK(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "initATableSorterZYNK");
        }//, "initATableSorterZYNK");
        if (callFunctionKey.contains("initATimeCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.initATimeCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "initATimeCheck");
        }//, "initATimeCheck");

        if (callFunctionKey.contains("zhiShu", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.zhiShu(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "zhiShu");
        }//, "zhiShu");
        if (callFunctionKey.contains("copy2d", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.copy2d(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "copy2d");
        }//, "copy2d");
        if (callFunctionKey.contains("copy1d", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.copy1d(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "copy1d");
        }//, "copy1d");
        if (callFunctionKey.contains("copy1dx2", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.copy1dx2(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "copy1dx2");
        }//, "copy1dx2");

        if (callFunctionKey.contains("initADFT", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.initADFT(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "initADFT");
        }//, "initADFT");
        if (callFunctionKey.contains("initAFFT", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.initAFFT(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "initAFFT");
        }//, "initAFFT");
        if (callFunctionKey.contains("guassian1d", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.guassian1d(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "guassian1d");
        }//, "guassian1d");
        if (callFunctionKey.contains("laplasian1d", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.laplasian1d(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "laplasian1d");
        }//, "laplasian1d");
        if (callFunctionKey.contains("max_v", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.max_v(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "max_v");
        }//, "max_v");
        if (callFunctionKey.contains("max_i", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.max_i(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "max_i");
        }//, "max_i");

        if (callFunctionKey.contains("min_v", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.min_v(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "min_v");
        }//, "min_v");
        if (callFunctionKey.contains("min_i", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.min_i(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "min_i");
        }//, "min_i");
        if (callFunctionKey.contains("median1d", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.median1d(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "median1d");
        }//, "median1d");
        if (callFunctionKey.contains("fengTong1D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.fengTong1D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fengTong1D");
        }//, "fengTong1");
        if (callFunctionKey.contains("fengPaixX", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.fengPaixX(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fengPaixX");
        }//, "fengPaixX");
        if (callFunctionKey.contains("fengPaiyY", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.fengPaiyY(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fengPaiyY");
        }//, "fengPaiyY");
        if (callFunctionKey.contains("fengPaiXx", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.fengPaiXx(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fengPaiXx");
        }//, "fengPaiXx");
        if (callFunctionKey.contains("fengPaiYy", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.fengPaiYy(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fengPaiYy");
        }//, "fengPaiYy");
        if (callFunctionKey.contains("newX", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.newX(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "newX");
        }//, "newX");

        if (callFunctionKey.contains("newY", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.newY(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "newY");
        }//, "newY");
        if (callFunctionKey.contains("newXY", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.newXY(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "newXY");
        }//, "newXY");
        if (callFunctionKey.contains("newXYBest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.newXYBest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "newXYBest");
        }//, "newXYBest");
        if (callFunctionKey.contains("newYwithoutBound", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.newYwithoutBound(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "newYwithoutBound");
        }//, "newYwithoutBound");
        if (callFunctionKey.contains("newXYYwithoutBound", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.newXYYwithoutBound(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "newXYYwithoutBound");
        }//, "newXYYwithoutBound");
        if (callFunctionKey.contains("liangHuaDengChaAdd", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.liangHuaDengChaAdd(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "liangHuaDengChaAdd");
        }//, "liangHuaDengChaAdd");
        if (callFunctionKey.contains("liangHuaXiHua", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.liangHuaXiHua(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "liangHuaXiHua");
        }//, "liangHuaXiHua");

        if (callFunctionKey.contains("liangHuaDengChaMines", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.liangHuaDengChaMines(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "liangHuaDengChaMines");
        }//, "liangHuaDengChaMines");
        if (callFunctionKey.contains("liangHuaEqualDelete", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.liangHuaEqualDelete(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "liangHuaEqualDelete");
        }//, "liangHuaEqualDelete");
        if (callFunctionKey.contains("liangHuaXiHuaHalfSide", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.liangHuaXiHuaHalfSide(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "liangHuaXiHuaHalfSide");
        }//, "liangHuaXiHuaHalfSide");
        if (callFunctionKey.contains("shehold1D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.shehold1D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "shehold1D");
        }//, "shehold1D");
        if (callFunctionKey.contains("caiJian1D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.caiJian1D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "caiJian1D");
        }//, "caiJian1D");
        if (callFunctionKey.contains("unZipWithPath", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.unZipWithPath(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "unZipWithPath");
        }//, "unZipWithPath");
        if (callFunctionKey.contains("bootBackupByUsingGzip", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_AOPM_C.bootBackupByUsingGzip(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "bootBackupByUsingGzip");
        }//, "bootBackupByUsingGzip");
        if (callFunctionKey.contains("fileToZip", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.fileToZip(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fileToZip");
        }//, "fileToZip");
        if (callFunctionKey.contains("compress", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.compress(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "compress");
        }//, "compress");
        if (callFunctionKey.contains("uncompress", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.uncompress(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "uncompress");
        }//, "uncompress");
        if (callFunctionKey.contains("P_Heart", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.P_Heart(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Heart");
        }//, "P_Heart");
        if (callFunctionKey.contains("P_Model", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_AOPM_C.P_Model(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Model");
        }//, "P_Model");
    }
}
