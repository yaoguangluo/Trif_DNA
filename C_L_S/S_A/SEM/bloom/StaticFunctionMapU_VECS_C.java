package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SIQ;
import U_V.OEU.xqpx.wcms.sort.LYG10D15D_X_CUA;
import U_V.PEU.S.UVIMIACI.VerbalSource;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

//著作权人+作者= 罗瑶光
public interface StaticFunctionMapU_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();
    //Double_ESU
    public Map<Double, Map<String, Boolean>> getMapFromDoubleStringArray(App NE);
    public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray(App NE);

    //稍后并到int array 新文件中
    public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray_ZhongYao(App NE);

    //Array_ESU
    public String arrayToJson(App NE);
    public String arrayToXml(App NE);

    public IMV_SIQ arrayToMap(App NE);

    public Vector<Object> arrayToVector(App NE);

    public List<Object> arrayToList(App NE);

    public Iterator<Object> arrayToIterator(App NE);

    public Set<Object> arrayToSet(App NE);

    public Object[][] arrayToMatrix(App NE);

    public Object[][][] arrayToMatrix3D(App NE);

    //CSV_ESU{
    public Object[][] xlsOrCsvFileToObjectMartix(App NE);

    public List<Object[]> xlsOrCsvFileToListObject(App NE);

    public List<Object[]> xlsOrCsvFileToRangedListObject(App NE);

    public Object[][] xlsOrCsvFileToRangedObjectMartix(App NE);

    //Date_ESU
    public String dateToGMTString(App NE);

    public String dateToYYYYMMDD(App NE);

    public String dateToHHMMSS(App NE);

    public String dateToMiliSeconds(App NE);

    public String getCurrentMiliSeconds(App NE);

    public Timestamp dateToTimeStamp(App NE);

    public long timeStampToMiliSeconds(App NE);

    public String timeStampToMiliSecondsWithSize(App NE);

    public String dateStringToMiliSeconds(App NE);

    //Hash_ESU
    public String hashTableToJson(App NE);

    public String hashTableToXml(App NE);

    public List<Object> hashTableToList(App NE);

    public Object[] hashTableToObjectArray(App NE);

    // HttpUnicode{
    //这个函数在作者去年开发股市分析软件的时候从雪球等网站采样抓数据, 发现有UTF8
    //utf-8 gb2312 ascii 等格式数据比较混乱, 于是进行统一格式处理。
    public String getJson(App NE);

    public String postXML(App NE);

    public String postJsonWithSercurity(App NE);

    public String postXMLWithSercurity(App NE);

    public String getHTML(App NE);

    //Image_ESU
    public void pixTableToFile(App NE)
    ;

    public void pixRGBTableToFile(App NE);

    public void bufferedImageToFile(App NE);

    public void imageToFile(App NE);

    public void bufferedImageToScaleImageFile(App NE);

    //ImageToList
    //该函数用于股市等波形图片文件转换成数组。
    public List<Integer> waveImageFileToArrayWithBlack(App NE);

    //该函数用于股市等波形缓存转换成数组。
    public List<Integer> waveImageToArrayWithBlack(App NE);

    //该函数用于股市等波形缓存转换成数组。根据特征颜色处理。
    public List<Integer> waveImageToArrayWithColor(App NE);

    //该函数用于股市等波形图片文件转换成数组。根据特征颜色处理。
    public List<Integer> waveImageFileToArrayWithColor(App NE)
    ;

    //该函数用于股市等波形图片文件转换成相同颜色数组分类集合。
    public Map<Integer, List<Integer>> waveImageFileToArrayMapWithBlack(App NE)
    ;

    //该函数用于股市等波形缓存转换成数组。
    public Map<Integer, List<Integer>> waveImageToArrayMapWithBlack(App NE);

    //ToolkitImageToBufferImage
    public BufferedImage toolkitImageIconToBufferImage(App NE);

    public BufferedImage toolkitImageToBufferImage(App NE);

    public BufferedImage toolkitImageToBufferImageAboutIconConfig(App NE);

    //Iterator_ESU
    public String iteratorToJsonString(App NE);

    public Object stringIteratorToJsonString(App NE);

    public String iteratorToXml(App NE);

    public String iteratorToMap(App NE);

    public Object[] iteratorToObjectArray(App NE);

    public List<Object> iteratorToList(App NE);

    //Json_ESU
    //  剔除个人著作权 申请范围
    //	public IMV_SIQ jsonObjectToMap(Gson gson
    //			, JSONObject jSONObject){
    //		return gson.fromJson(jSONObject.toString()
    //, new TypeToken<IMV_SIQ>(){}.getType()){  };
    //	}

    public List<Object> jsonArrayToList(App NE);

    public String jsonObjectToString(App NE);

    public Hashtable<String, Object> jsonObjectToHashtable(App NE);

    public String jsonObjectToXml(App NE);

    //List_ESU
    public String listToJsonString(App NE);

    public Object stringListToJsonString(App NE);

    public String listToXml(App NE);

    public String listToMap(App NE);

    public Object[] listToObjectArray(App NE);

    public String[] stringlistToStringArray(App NE);

    public Iterator<Object> listToIterator(App NE);

    public Vector<Object> listToVector(App NE);

    public Set<Object> listToSet(App NE);

    public String[] listToArray(App NE);

    //Map_ESU{
    //  剔除个人著作权 申请范围
    //	public String mapToJsonString(Gson gson, IMV_SIQ map){
    //		return gson.toJson(map);
    //	}
    //
    //	public String mapToXml(Gson gson, IMV_SIQ map){
    //		JSONObject jSONObject= new JSONObject(gson.toJson(map)){  };
    //		return XML.toString(jSONObject);
    //	}

    public List<IMV_SIQ> mapToList(App NE);

    public Hashtable<String, Object> mapToHash(App NE);

    //LYG9DWithDoubleTopSort5D
    public double[] sort(App NE);

    //LYG10DWithChineseMixStringSort12D
    @SuppressWarnings("unused")
    public static void biHuaPinYinSort(String[] strings1D) {
        try {
            InputStream inputStreamp = new VerbalSource()
                    .getClass().getResourceAsStream(S_File.PinYinCN_lyg);
            DetaBufferedReader cReaderp = new DetaBufferedReader(
                    DetaInputStreamReader.E(inputStreamp, "UTF8"));
            //index
            String cInputStringp;
            IMV_SIQ map = new IMV_SIQ();
            Map<String, Integer> bihua = new IMV_SIQ();
            while ((cInputStringp = cReaderp.readDetaLine()) != null) {
                String[] words = cInputStringp.split("->");
                if (words.length > 1) {
                    map.put(words[0], words[1]);
                }
            }
            InputStream inputStreamb = new VerbalSource()
                    .getClass().getResourceAsStream(S_File.BiHuaCN_lyg);
            DetaBufferedReader cReaderb = new DetaBufferedReader(
                    DetaInputStreamReader.E(inputStreamb, "UTF8"));
            //index
            String cInputStringb;
            while ((cInputStringb = cReaderb.readDetaLine()) != null) {
                String[] words = cInputStringb.split("->");
                if (words.length > 1) {
                    bihua.put(words[0], Integer.valueOf(words[1]));
                }
            }
            LYG10D15D_X_CUA lYG10D15D_X_CUA = new LYG10D15D_X_CUA();
            lYG10D15D_X_CUA.pinyin = map;
            lYG10D15D_X_CUA.bihua = bihua;
            lYG10D15D_X_CUA.processKernel(strings1D
                    , 0, strings1D.length - 1, 30, 0);
            for (String string : strings1D) {
                //20230106-System.out.println(string);
            }
            cReaderb.close();
            cReaderp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // XML_ESU
    //  剔除个人著作权 申请范围
    //	public JSONObject xmlToJsonObject(String string){
    //		return XML.toJSONObject(string);
    //	}

    public List<Object> xmlToList(App NE);

    //  剔除个人著作权 申请范围
    //	public IMV_SIQ xmlToMap(Gson gson, String string){
    //		return gson.fromJson(XML.toJSONObject(string).toString()
    //, new TypeToken<IMV_SIQ>(){}.getType());
    //	}

    public Vector<Object> xmlToVector(App NE);

    public Set<Object> xmlToSets(App NE);

    public Hashtable<String, Object> xmlToHashtable(App NE);

    //TXT_ESU{
    //注意字节编码的读写正确
    public Object[][] txtFileToObjectMatrix(App NE);

    public Object[][] txtFileToObjectMatrixWithRange(App NE);

    public List<String> txtFileToListStringWithRange(App NE);

    public List<String> txtFileToListString(App NE);

    public List<String[]> txtFileToListStringArray(App NE)
            ;

    //Vector_ESU
    public IMV_SIQ vectorToMap(App NE);

    public List<Object> vectorToList(App NE);

    public Object[] vectorToArray(App NE);

    public Iterator<Object> vectorToIterator(App NE);

    public String vectorToJsonString(App NE);

    public Set<Object> vectorToSet(App NE);

    //StringBuilder_ESU{
    public char[] stringBuilderToCharArray(App NE);

    public String stringBuilderToString(App NE);

    public String stringBuilderToJson(App NE);

    public String stringBuilderToXml(App NE);

    public String[] stringBuilderToSplitArray(App NE);

    public IMV_SIQ stringBuilderToMap(App NE);

    //String_ESU{
    public String[] stringToArray(App NE);

    public String stringArrayToString(App NE);

    public String stringToURIencode(App NE)
            ;

    public String stringToURIencodeOnlyString(App NE);

    public String uRIencodeToURIdecodeOnlyString(App NE);

    public String uRIencodeToURIdecode(App NE)
            ;

    public int[] stringToCharASCII(App NE);

    public String charsetSwap(App NE);

    //StockCode//正则处理, 没有函数规则性, 不添加先。
    //Object_ESU{
    public String objectToJsonString(App NE);

    //Matrix3D_ESU{
    public Object[][][] matrixShiftSwapXYZ(App NE);

    public Object[][][] matrixInclineSwapXY(App NE);

    public Object[][][] matrixInclineSwapXZ(App NE);

    public Object[][][] matrixInclineSwapYZ(App NE);

    public Object[][][] matrixReverseSwapT(App NE);

    public Object[][][] matrixReverseSwapXY(App NE);

    public Object[][][] matrixReverseSwapXZ(App NE);

    public Object[][][] matrixReverseSwapYZ(App NE);

    public Object[] matrixToArrayT(App NE);

    //Matrix_ESU{
    public Object[][] matrixInclineSwap(App NE);

    public Object[][] matrixPostSwap(App NE);

    public Object[][] matrixInSwap(App NE);

    public Object[][] matrixReverseSwapM(App NE);

    public Object[] matrixToArrayM(App NE);//later
    //Flt 智能声诊接口, 不添加先。
}
