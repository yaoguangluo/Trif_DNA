package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import U_V.ESU.array.Array_ESU_X_arrayToJson;
import U_V.ESU.array.Array_ESU_X_arrayToList;
import U_V.ESU.array.Array_ESU_X_arrayToMap;
import U_V.ESU.array.Array_ESU_X_arrayToMatrix;
import U_V.ESU.array.Array_ESU_X_arrayToMatrix3D;
import U_V.ESU.array.Array_ESU_X_arrayToSet;
import U_V.ESU.array.Array_ESU_X_arrayToVector;
import U_V.ESU.array.Array_ESU_X_arrayToXml;
import U_V.ESU.array.Double_ESU;
import U_V.ESU.csv.CSV_ESU;
import U_V.ESU.date.Date_ESU;
import U_V.ESU.hash.Hash_ESU;
import U_V.ESU.http.HttpUnicode;
import U_V.ESU.image.Image_ESU_X_bufferedImageToFile;
import U_V.ESU.image.Image_ESU_X_bufferedImageToScaleImageFile;
import U_V.ESU.image.Image_ESU_X_imageToFile;
import U_V.ESU.image.Image_ESU_X_pixRGBTableToFile;
import U_V.ESU.image.Image_ESU_X_pixTableToFile;
import U_V.ESU.imageToList.ImageToList_X_waveImageFileToArrayMapWithBlack;
import U_V.ESU.imageToList.ImageToList_X_waveImageFileToArrayWithBlack;
import U_V.ESU.imageToList.ImageToList_X_waveImageFileToArrayWithColor;
import U_V.ESU.imageToList.ImageToList_X_waveImageToArrayMapWithBlack;
import U_V.ESU.imageToList.ImageToList_X_waveImageToArrayWithBlack;
import U_V.ESU.imageToList.ImageToList_X_waveImageToArrayWithColor;
import U_V.ESU.toolkitImageToBufferImage.U_X_toolkitImageIconToBufferImage;
import U_V.ESU.toolkitImageToBufferImage.U_X_toolkitImageToBufferImage;
import U_V.ESU.toolkitImageToBufferImage.U_X_toolkitImageToBufferImageAboutIconConfig;
import U_V.ESU.iterator.Iterator_ESU_X_iteratorToJsonString;
import U_V.ESU.iterator.Iterator_ESU_X_iteratorToList;
import U_V.ESU.iterator.Iterator_ESU_X_iteratorToMap;
import U_V.ESU.iterator.Iterator_ESU_X_iteratorToObjectArray;
import U_V.ESU.iterator.Iterator_ESU_X_iteratorToXml;
import U_V.ESU.iterator.Iterator_ESU_X_stringIteratorToJsonString;
import U_V.ESU.json.Json_ESU_X_jsonArrayToList;
import U_V.ESU.json.Json_ESU_X_jsonObjectToHashtable;
import U_V.ESU.json.Json_ESU_X_jsonObjectToString;
import U_V.ESU.json.Json_ESU_X_jsonObjectToXml;
import U_V.ESU.list.List_ESU_X_listToArray;
import U_V.ESU.list.List_ESU_X_listToIterator;
import U_V.ESU.list.List_ESU_X_listToJsonString;
import U_V.ESU.list.List_ESU_X_listToMap;
import U_V.ESU.list.List_ESU_X_listToObjectArray;
import U_V.ESU.list.List_ESU_X_listToSet;
import U_V.ESU.list.List_ESU_X_listToVector;
import U_V.ESU.list.List_ESU_X_listToXml;
import U_V.ESU.list.List_ESU_X_stringListToJsonString;
import U_V.ESU.list.List_ESU_X_stringlistToStringArray;
import U_V.ESU.map.Map_ESU_X_mapToHash;
import U_V.ESU.map.Map_ESU_X_mapToList;
import U_V.ESU.matrix.Matrix_ESU_X_matrixInSwap;
import U_V.ESU.matrix.Matrix_ESU_X_matrixInclineSwap;
import U_V.ESU.matrix.Matrix_ESU_X_matrixPostSwap;
import U_V.ESU.matrix.Matrix_ESU_X_matrixReverseSwap;
import U_V.ESU.matrix.Matrix_ESU_X_matrixToArray;
import U_V.ESU.matrix3D.Matrix3D_ESU_X_matrixInclineSwapXY;
import U_V.ESU.matrix3D.Matrix3D_ESU_X_matrixInclineSwapXZ;
import U_V.ESU.matrix3D.Matrix3D_ESU_X_matrixInclineSwapYZ;
import U_V.ESU.matrix3D.Matrix3D_ESU_X_matrixReverseSwap;
import U_V.ESU.matrix3D.Matrix3D_ESU_X_matrixReverseSwapXY;
import U_V.ESU.matrix3D.Matrix3D_ESU_X_matrixReverseSwapXZ;
import U_V.ESU.matrix3D.Matrix3D_ESU_X_matrixReverseSwapYZ;
import U_V.ESU.matrix3D.Matrix3D_ESU_X_matrixShiftSwapXYZ;
import U_V.ESU.matrix3D.Matrix3D_ESU_X_matrixToArray;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_stringArrayToString;
import U_V.ESU.string.String_ESU_X_stringToArray;
import U_V.ESU.string.String_ESU_X_stringToCharASCII;
import U_V.ESU.string.String_ESU_X_stringToURIencode;
import U_V.ESU.string.String_ESU_X_uRIencodeToURIdecode;
import U_V.ESU.stringBuilder.S_ESU_X_stringBuilderToCharArray;
import U_V.ESU.stringBuilder.S_ESU_X_stringBuilderToJson;
import U_V.ESU.stringBuilder.S_ESU_X_stringBuilderToMap;
import U_V.ESU.stringBuilder.S_ESU_X_stringBuilderToSplitArray;
import U_V.ESU.stringBuilder.S_ESU_X_stringBuilderToString;
import U_V.ESU.stringBuilder.S_ESU_X_stringBuilderToXml;
import U_V.ESU.tinos.vector.Vector_ESU_X_vectorToArray;
import U_V.ESU.tinos.vector.Vector_ESU_X_vectorToIterator;
import U_V.ESU.tinos.vector.Vector_ESU_X_vectorToJsonString;
import U_V.ESU.tinos.vector.Vector_ESU_X_vectorToList;
import U_V.ESU.tinos.vector.Vector_ESU_X_vectorToMap;
import U_V.ESU.tinos.vector.Vector_ESU_X_vectorToSet;
import U_V.ESU.txt.TXT_ESU_X_txtFileToListString;
import U_V.ESU.txt.TXT_ESU_X_txtFileToListStringArray;
import U_V.ESU.txt.TXT_ESU_X_txtFileToListStringWithRange;
import U_V.ESU.txt.TXT_ESU_X_txtFileToObjectMatrix;
import U_V.ESU.txt.TXT_ESU_X_txtFileToObjectMatrixWithRange;
import U_V.ESU.xml.XML_ESU_X_xmlToHashtable;
import U_V.ESU.xml.XML_ESU_X_xmlToList;
import U_V.ESU.xml.XML_ESU_X_xmlToSets;
import U_V.ESU.xml.XML_ESU_X_xmlToVector;
import U_V.OEU.LYG4DQS4D.LYG9DWithDoubleTopSort5D;
import U_V.SU.object.Object_ESU;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
//著作权人+作者= 罗瑶光
//第一次完善了下, 因为改动了3个static 字符, 稍后养疗经运行下, 看不会出bug不。毕竟不是static value
//, 只是static 函数而已,
public class StaticFunctionMapU_VECS_E implements StaticFunctionMapU_VECS_C{
	public IMV_SIQ annotationMap= new IMV_SIQ();
	public static void main()  {
		App NE= new App();
		String[] argv= NE._I_U.argv;
		String[] strings1D= new String[16];
		strings1D[0]= "dh罗31韵律";
		strings1D[1]= "dh罗11瑶林";
		strings1D[2]= "dh罗2瑶光";
		strings1D[3]= "dh罗4韵律";
		strings1D[2]= "dh罗2尧光";
		strings1D[3]= "dh罗4运律";
		strings1D[4]= "dh罗6瑶d林";
		strings1D[5]= "dh罗瑶0.6光";
		strings1D[6]= "dh罗瑶0.3f光";
		strings1D[7]= "dh罗瑶0.61e7光";
		strings1D[8]= "dh罗瑶0.3e61光";
		strings1D[9]= "dh罗瑶0.3e6光";
		strings1D[10]= "dh罗瑶0.6e2光";
		strings1D[11]= "dh罗瑶0.3e1光";
		strings1D[12]= "dh罗韵111.21律";
		strings1D[13]= "dh罗韵15.21律";
		strings1D[14]= "dh罗瑶g林";
		strings1D[15]= "dhv罗1.09瑶光";
		StaticFunctionMapU_VECS_C.biHuaPinYinSort(strings1D);
		System.out.println(111);
		/*输出结果
		 * 
		 *
dh罗瑶0.3e1光
dh罗瑶0.3e6光
dh罗瑶0.3e61光
dh罗瑶0.3f光
dh罗瑶0.6光
dh罗瑶0.61e7光
dh罗瑶0.6e2光
dh罗瑶g林
dh罗韵111.21律
dh罗韵15.21律
dh罗11瑶林
dh罗2尧光
dh罗31韵律
dh罗4运律
dh罗6瑶d林
dhv罗1.09瑶光

		 * 
		 * */
	}

	//稍后加前缀
	@Override
	public Map<Double, Map<String, Boolean>> getMapFromDoubleStringArray(App NE) {
		double[] score=NE._I_U.scoreA;
		String[] nameScore=NE._I_U.nameScore;
		return Double_ESU.getMapFromDoubleStringArray(score, nameScore);
	}

	@Override
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray(App NE)  {
		int[] score=NE._I_U.score;
		String[] nameScore=NE._I_U.nameScore;
		return Double_ESU.getMapFromIntStringArray(score, nameScore);
	}

	@Override
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray_ZhongYao(App NE)  {
		int[] score=NE._I_U.score;
		String[] nameScore=NE._I_U.nameScore;
		return Double_ESU.getMapFromIntStringArray_ZhongYao(score, nameScore);
	}

	@Override
	public String arrayToJson(App NE)  {
		Gson gson=NE._I_U.gson;
		Object[] object=NE._I_U.objectA;
		return Array_ESU_X_arrayToJson._E(gson, object);
	}

	@Override
	public String arrayToXml(App NE)  {
		Gson gson=NE._I_U.gson;
		Object[] object=NE._I_U.objectA;
		return Array_ESU_X_arrayToXml._E(gson, object);
	}

	@Override
	public IMV_SIQ arrayToMap(App NE)  {
		Gson gson=NE._I_U.gson;
		Object[] objects=NE._I_U.objectA;
		return Array_ESU_X_arrayToMap._E(objects);
	}

	@Override
	public Vector<Object> arrayToVector(App NE)  {
		Gson gson=NE._I_U.gson;
		Object[] objects=NE._I_U.objectA;
		return Array_ESU_X_arrayToVector._E(objects);
	}

	@Override
	public List<Object> arrayToList(App NE)  {
		Object[] objects=NE._I_U.objectA;
		return Array_ESU_X_arrayToList._E(objects);
	}

	@Override
	public Iterator<Object> arrayToIterator(App NE)  {
		Object[] objects=NE._I_U.objectA;
		return arrayToIterator(NE);//later
	}

	@Override
	public Set<Object> arrayToSet(App NE)  {
		Object[] objects=NE._I_U.objectA;
		return Array_ESU_X_arrayToSet._E(objects);
	}

	@Override
	public Object[][] arrayToMatrix(App NE)  {
		Object[] objects=NE._I_U.objects;
		int widthRange=NE._I_U.widthRange;
		return Array_ESU_X_arrayToMatrix._E(objects, widthRange);
	}

	@Override
	public Object[][][] arrayToMatrix3D(App NE)  {
		Object[] objects=NE._I_U.objects;
		int widthRange=NE._I_U.widthRange;
		int heightRange=NE._I_U.heightRange;
		return Array_ESU_X_arrayToMatrix3D._E(objects, widthRange, heightRange);
	}

	@Override
	public Object[][] xlsOrCsvFileToObjectMartix(App NE)  {
		AES_QMS_XSD_TIH filePath=NE._I_U.FilePath;
		int pageSheetIndex=NE._I_U.pageSheetIndex;
		return CSV_ESU.xlsOrCsvFileToObjectMartix(filePath._S_, pageSheetIndex);
	}

	@Override
	public List<Object[]> xlsOrCsvFileToListObject(App NE)  {
				 AES_QMS_XSD_TIH filePath=NE._I_U.FilePath;
				 int pageSheetIndex=NE._I_U.pageSheetIndex;
		return CSV_ESU.xlsOrCsvFileToListObject(filePath._S_, pageSheetIndex);
	}

	@Override
	public List<Object[]> xlsOrCsvFileToRangedListObject(App NE)  {
		AES_QMS_XSD_TIH filePath=NE._I_U.FilePath;
		int pageSheetIndex=NE._I_U.pageSheetIndex;
		Map<Integer, Boolean> rows=NE._I_U.rowsMap;
		Map<Integer, Boolean> culumns=NE._I_U.culumns;
		return CSV_ESU.xlsOrCsvFileToRangedListObject(filePath._S_, pageSheetIndex, rows, culumns);
	}

	@Override
	public Object[][] xlsOrCsvFileToRangedObjectMartix(App NE)  {
		AES_QMS_XSD_TIH filePath=NE._I_U.FilePath;
		int pageSheetIndex=NE._I_U.pageSheetIndex;
		Map<Integer, Boolean> rows=NE._I_U.rowsMap;
		Map<Integer, Boolean> culumns=NE._I_U.culumns;
		return CSV_ESU.xlsOrCsvFileToRangedObjectMartix(filePath._S_, pageSheetIndex, rows, culumns);
	}

	@Override
	public String dateToGMTString(App NE)  {
		Date date=NE._I_U.date;
		return Date_ESU.dateToGMTString(date);
	}

	@Override
	public String dateToYYYYMMDD(App NE)  {
		Date date=NE._I_U.date;
		return Date_ESU.dateToYYYYMMDD(date);
	}

	@Override
	public String dateToHHMMSS(App NE)  {
		Date date=NE._I_U.date;
		return Date_ESU.dateToHHMMSS(date);
	}

	@Override
	public String dateToMiliSeconds(App NE)  {
		Date date=NE._I_U.date;
		return Date_ESU.dateToMiliSeconds(date);
	}

	@Override
	public String getCurrentMiliSeconds(App NE)  {
		Date date=NE._I_U.date;
		return Date_ESU.getCurrentMiliSeconds(date);
	}

	@Override
	public Timestamp dateToTimeStamp(App NE)  {
		Date date=NE._I_U.date;
		return Date_ESU.dateToTimeStamp(date);
	}

	@Override
	public long timeStampToMiliSeconds(App NE)  {
		Timestamp timestamp=NE._I_U.timestamp;
		return Date_ESU.timeStampToMiliSeconds(timestamp);
	}

	@Override
	public String timeStampToMiliSecondsWithSize(App NE)  {
		Timestamp timestamp=NE._I_U.timestamp;
		int size=NE._I_U.size;
		return Date_ESU.timeStampToMiliSecondsWithSize(timestamp, size);
	}

	@Override
	public String dateStringToMiliSeconds(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		return Date_ESU.dateStringToMiliSeconds(string._S_);
	}

	@Override
	public String hashTableToJson(App NE)  {
		Gson gson=NE._I_U.gson;
		Hashtable<String, Object> hashtable=NE._I_U.hashtable;
		return Hash_ESU.hashTableToJson(gson, hashtable);
	}

	@Override
	public String hashTableToXml(App NE)  {
		Gson gson=NE._I_U.gson;
		Hashtable<String, Object> hashtable=NE._I_U.hashtable;
		return Hash_ESU.hashTableToXml(gson, hashtable);
	}

	@Override
	public List<Object> hashTableToList(App NE)  {
		Gson gson=NE._I_U.gson;
		Hashtable<String, Object> hashtable=NE._I_U.hashtable;
		return Hash_ESU.hashTableToList(gson, hashtable);
	}

	@Override
	public Object[] hashTableToObjectArray(App NE)  {
		Gson gson=NE._I_U.gson;
		Hashtable<String, Object> hashtable=NE._I_U.hashtable;
		return Hash_ESU.hashTableToObjectArray(gson, hashtable);
	}

	@Override
	public String getJson(App NE)  {
		AES_QMS_XSD_TIH urlString=NE._I_U.urlString;
		AES_QMS_XSD_TIH jsonString=NE._I_U.jsonString;
		return new HttpUnicode().getJson(urlString._S_, jsonString._S_);
	}

	@Override
	public String postXML(App NE)  {
		AES_QMS_XSD_TIH urlString=NE._I_U.urlString;
		AES_QMS_XSD_TIH XMLString=NE._I_U.xmlString;
		return new HttpUnicode().postXML(urlString._S_, XMLString._S_);
		//这个函数 refer java.net 白皮书教材。我的写法是按照印度买的 java how to program 蓝皮书写的
		//记得章节是 http sever client socket通信 两本书都在美国 4年前没带回来。
	}

	@Override
	public String postJsonWithSercurity(App NE)  {
		AES_QMS_XSD_TIH urlString=NE._I_U.urlString;
		AES_QMS_XSD_TIH jsonString=NE._I_U.jsonString;
		return new HttpUnicode().postJsonWithSercurity(urlString._S_, jsonString._S_);
	}

	@Override
	public String postXMLWithSercurity(App NE)  {
		AES_QMS_XSD_TIH urlString=NE._I_U.urlString;
		AES_QMS_XSD_TIH XMLString=NE._I_U.xmlString;
		return new HttpUnicode().postXMLWithSercurity(urlString._S_, XMLString._S_);
	}

	@Override
	public String getHTML(App NE)  {
		AES_QMS_XSD_TIH urlString=NE._I_U.urlString;
		Object object=NE._I_U.object;
		return new HttpUnicode().getHTML(urlString._S_, object);
	}

	@Override
	public void pixTableToFile(App NE)  {
		AES_QMS_XSD_TIH pngOutputPath=NE._I_U.pngOutputPath;
		int[][] pix=NE._I_U.pixM;
		AES_QMS_XSD_TIH fileType=NE._I_U.fileType;
		Image_ESU_X_pixTableToFile._E(pngOutputPath._S_, pix, fileType._S_);
	}

	@Override
	public void pixRGBTableToFile(App NE)  {
		AES_QMS_XSD_TIH pngOutputPath=NE._I_U.pngOutputPath;
		int[][] pixRed=NE._I_U.pixRed;
		int[][] pixGreen=NE._I_U.pixGreen;
		int[][] pixBlue=NE._I_U.pixBlue;
		AES_QMS_XSD_TIH fileType=NE._I_U.fileType;
		Image_ESU_X_pixRGBTableToFile._E(pngOutputPath._S_, pixRed, pixGreen, pixBlue, fileType._S_);
	}

	@Override
	public void bufferedImageToFile(App NE)  {
		AES_QMS_XSD_TIH pngOutputPath=NE._I_U.pngOutputPath;
		BufferedImage bufferedImage=NE._I_U.bufferedImage;
		AES_QMS_XSD_TIH fileType=NE._I_U.fileType;
		Image_ESU_X_bufferedImageToFile._E(pngOutputPath._S_, bufferedImage, fileType._S_);

	}

	@Override
	public void imageToFile(App NE)  {
		AES_QMS_XSD_TIH pngOutputPath=NE._I_U.pngOutputPath;
		Image image=NE._I_U.image;
		AES_QMS_XSD_TIH fileType=NE._I_U.fileType;
		Image_ESU_X_imageToFile._E(pngOutputPath._S_, image, fileType._S_);

	}

	@Override
	public void bufferedImageToScaleImageFile(App NE)  {
		AES_QMS_XSD_TIH pngOutputPath=NE._I_U.pngOutputPath;
		BufferedImage bufferedImage=NE._I_U.bufferedImage;
		AES_QMS_XSD_TIH fileType=NE._I_U.fileType;
		int scale=NE._I_U.scale;
		Image_ESU_X_bufferedImageToScaleImageFile._E(pngOutputPath._S_, bufferedImage, fileType._S_, scale);
	}

	@Override
	public List<Integer> waveImageFileToArrayWithBlack(App NE)  {
		AES_QMS_XSD_TIH FilePath=NE._I_U.FilePath;
		return ImageToList_X_waveImageFileToArrayWithBlack._E(FilePath._S_);
	}

	@Override
	public List<Integer> waveImageToArrayWithBlack(App NE)  {
		BufferedImage bufferedImage=NE._I_U.bufferedImage;
		return ImageToList_X_waveImageToArrayWithBlack._E(bufferedImage);
	}

	@Override
	public List<Integer> waveImageToArrayWithColor(App NE)  {
		BufferedImage bufferedImage=NE._I_U.bufferedImage;
		int colorRange=NE._I_U.colorRange;
		return ImageToList_X_waveImageToArrayWithColor._E(bufferedImage, colorRange);
	}

	@Override
	public List<Integer> waveImageFileToArrayWithColor(App NE)  {
		AES_QMS_XSD_TIH filePath=NE._I_U.filePath;
		int colorRange=NE._I_U.colorRange;
		return ImageToList_X_waveImageFileToArrayWithColor._E(filePath._S_, colorRange);
	}

	@Override
	public Map<Integer, List<Integer>> waveImageFileToArrayMapWithBlack(App NE)  {
		AES_QMS_XSD_TIH filePath=NE._I_U.filePath;
		return ImageToList_X_waveImageFileToArrayMapWithBlack._E(filePath._S_);
	}

	@Override
	public Map<Integer, List<Integer>> waveImageToArrayMapWithBlack(App NE)  {
		//Map<Integer, List<Integer>>
		BufferedImage bufferedImage=NE._I_U.bufferedImage;
		return ImageToList_X_waveImageToArrayMapWithBlack._E(bufferedImage);
	}

	@Override
	public BufferedImage toolkitImageIconToBufferImage(App NE)  {
		int positionX=NE._I_U.positionX;
		int positionY=NE._I_U.positionY;
		ImageIcon imageIcon=NE._I_U.imageIcon;
		return U_X_toolkitImageIconToBufferImage._E(positionX
				, positionY, imageIcon);
	}

	@Override
	public BufferedImage toolkitImageToBufferImage(App NE)  {
		Image image=NE._I_U.image;
		int positionX=NE._I_U.positionX;
		int positionY=NE._I_U.positionY;
		int width=NE._I_U.width;
		int height=NE._I_U.height;
		ImageObserver imageObserver=NE._I_U.imageObserver;
		return U_X_toolkitImageToBufferImage._E(image, positionX, positionY, width, height, imageObserver);
	}

	@Override
	public BufferedImage toolkitImageToBufferImageAboutIconConfig(App NE)  {
		Image image=NE._I_U.image;
		int positionX=NE._I_U.positionX;
		int positionY=NE._I_U.positionY;
		return U_X_toolkitImageToBufferImageAboutIconConfig._E(image, positionX, positionY);
	}

	@Override
	public String iteratorToJsonString(App NE)  {
		Gson gson=NE._I_U.gson;
		Iterator<Object> iterator=NE._I_U.iterator;
		return Iterator_ESU_X_iteratorToJsonString._E(gson, iterator);
	}

	@Override
	public Object stringIteratorToJsonString(App NE)  {
		Gson gson=NE._I_U.gson;
		Iterator<String> iterator=NE._I_U.iteratorString;
		return Iterator_ESU_X_stringIteratorToJsonString._E(gson, iterator);
	}

	@Override
	public String iteratorToXml(App NE)  {
		Gson gson=NE._I_U.gson;
		Iterator<Object> iterator=NE._I_U.iterator;
		return Iterator_ESU_X_iteratorToXml._E(gson, iterator);
	}

	@Override
	public String iteratorToMap(App NE)  {
		Gson gson=NE._I_U.gson;
		Iterator<Object> iterator=NE._I_U.iterator;
		return Iterator_ESU_X_iteratorToMap._E(gson, iterator);
	}

	@Override
	public Object[] iteratorToObjectArray(App NE)  {
		Gson gson=NE._I_U.gson;
		Iterator<Object> iterator=NE._I_U.iterator;
		return Iterator_ESU_X_iteratorToObjectArray._E(iterator);
	}

	@Override
	public List<Object> iteratorToList(App NE)  {
		Gson gson=NE._I_U.gson;
		Iterator<Object> iterator=NE._I_U.iterator;
		return Iterator_ESU_X_iteratorToList._E(gson, iterator);
	}

	@Override
	public List<Object> jsonArrayToList(App NE)  {
		JSONArray jSONArray=NE._I_U.jSONArray;
		return Json_ESU_X_jsonArrayToList._E(jSONArray);
	}

	@Override
	public String jsonObjectToString(App NE)  {
		JSONObject jSONObject=NE._I_U.jSONObject;
		return Json_ESU_X_jsonObjectToString._E(jSONObject);
	}

	@Override
	public Hashtable<String, Object> jsonObjectToHashtable(App NE)  {
		Gson gson=NE._I_U.gson;
		JSONObject jSONObject=NE._I_U.jSONObject;
		return Json_ESU_X_jsonObjectToHashtable._E(gson, jSONObject);
	}

	@Override
	public String jsonObjectToXml(App NE)  {
		JSONObject jSONObject=NE._I_U.jSONObject;
		return Json_ESU_X_jsonObjectToXml._E(jSONObject);
	}

	@Override
	public String listToJsonString(App NE)  {
		Gson gson=NE._I_U.gson;
		List<Object> list=NE._I_U.listObject;
		return List_ESU_X_listToJsonString._E(gson, list);
	}

	@Override
	public Object stringListToJsonString(App NE)  {
		Gson gson=NE._I_U.gson;
		List<String> list=NE._I_U.listString;
		return List_ESU_X_stringListToJsonString._E(gson, list);
	}

	@Override
	public String listToXml(App NE)  {
		Gson gson=NE._I_U.gson;
		List<Object> list=NE._I_U.listObject;
		return List_ESU_X_listToXml._E(gson, list);
	}

	@Override
	public String listToMap(App NE)  {
		Gson gson=NE._I_U.gson;
		List<Object> list=NE._I_U.listObject;
		return List_ESU_X_listToMap._E(gson, list);
	}

	@Override
	public Object[] listToObjectArray(App NE)  {
		List<Object> list=NE._I_U.listObject;
		return List_ESU_X_listToObjectArray._E(list);
	}

	@Override
	public String[] stringlistToStringArray(App NE)  {
		List<String> list=NE._I_U.listString;
		return List_ESU_X_stringlistToStringArray._E(list);
	}

	@Override
	public Iterator<Object> listToIterator(App NE)  {
		List<Object> list=NE._I_U.listObject;
		return List_ESU_X_listToIterator._E(list);
	}

	@Override
	public Vector<Object> listToVector(App NE)  {
		List<Object> list=NE._I_U.listObject;
		return List_ESU_X_listToVector._E(list);
	}

	@Override
	public Set<Object> listToSet(App NE)  {
		List<Object> list=NE._I_U.listObject;
		return List_ESU_X_listToSet._E(list);
	}

	@Override
	public String[] listToArray(App NE)  {
		List<String> list=NE._I_U.listString;
		return List_ESU_X_listToArray._E(list);
	}

	@Override
	public List<IMV_SIQ> mapToList(App NE)  {
		IMV_SIQ map=NE._I_U.map;
		return Map_ESU_X_mapToList._E(map);
	}

	@Override
	public Hashtable<String, Object> mapToHash(App NE)  {
		IMV_SIQ map=NE._I_U.map;
		return Map_ESU_X_mapToHash._E(map);
	}

	@Override
	public double[]  sort(App NE)  {
		double[] array=NE._I_U.arrayDouble;
		int range=NE._I_U.range;
		int deeps=NE._I_U.deeps;
		return new LYG9DWithDoubleTopSort5D().sort(array, range, deeps);
	}

	@Override
	public List<Object> xmlToList(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		AES_QMS_XSD_TIH key=NE._I_U.key;
		return XML_ESU_X_xmlToList._E(string._S_, key._S_);
	}

	@Override
	public Vector<Object> xmlToVector(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		AES_QMS_XSD_TIH key=NE._I_U.key;
		return XML_ESU_X_xmlToVector._E(string._S_, key._S_);
	}

	@Override
	public Set<Object> xmlToSets(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		AES_QMS_XSD_TIH key=NE._I_U.key;
		return XML_ESU_X_xmlToSets._E(string._S_, key._S_);
	}

	@Override
	public Hashtable<String, Object> xmlToHashtable(App NE)  {
		AES_QMS_XSD_TIH xmlString=NE._I_U.xmlString;
		Gson gson=NE._I_U.gson;
		return new XML_ESU_X_xmlToHashtable()._E(xmlString._S_, gson);
	}

	@Override
	public Object[][] txtFileToObjectMatrix(App NE)  {
		AES_QMS_XSD_TIH filePath=NE._I_U.filePath;
		AES_QMS_XSD_TIH stopBy=NE._I_U.stopBy;
		return TXT_ESU_X_txtFileToObjectMatrix._E(filePath._S_, stopBy._S_);
	}

	@Override
	public Object[][] txtFileToObjectMatrixWithRange(App NE)  {
		AES_QMS_XSD_TIH filePath=NE._I_U.filePath;
		AES_QMS_XSD_TIH stopBy=NE._I_U.stopBy;
		int rangeBegin=NE._I_U.rangeBegin;
		int rangeEnd=NE._I_U.rangeEnd;
		return TXT_ESU_X_txtFileToObjectMatrixWithRange._E(filePath._S_
				, stopBy._S_, rangeBegin, rangeEnd);
	}

	@Override
	public List<String> txtFileToListStringWithRange(App NE)  {
		AES_QMS_XSD_TIH filePath=NE._I_U.filePath;
		AES_QMS_XSD_TIH stopBy=NE._I_U.stopBy;
		int rangeBegin=NE._I_U.rangeBegin;
		int rangeEnd=NE._I_U.rangeEnd;
		return TXT_ESU_X_txtFileToListStringWithRange._E(filePath._S_
				, rangeBegin, rangeEnd);
	}

	@Override
	public List<String> txtFileToListString(App NE)  {
		AES_QMS_XSD_TIH filePath=NE._I_U.filePath;
		return TXT_ESU_X_txtFileToListString._E(filePath._S_);
	}

	@Override
	public List<String[]> txtFileToListStringArray(App NE)  {
				 AES_QMS_XSD_TIH filePath=NE._I_U.filePath;
				 AES_QMS_XSD_TIH stopBy=NE._I_U.stopBy;
		return TXT_ESU_X_txtFileToListStringArray._E(filePath._S_, stopBy._S_);
	}

	@Override
	public IMV_SIQ vectorToMap(App NE)  {
		Vector<Object> vector=NE._I_U.vector;
		return Vector_ESU_X_vectorToMap._E(vector);
	}

	@Override
	public List<Object> vectorToList(App NE)  {
		Vector<Object> vector=NE._I_U.vector;
		return Vector_ESU_X_vectorToList._E(vector);
	}

	@Override
	public Object[] vectorToArray(App NE)  {
		Vector<Object> vector=NE._I_U.vector;
		return Vector_ESU_X_vectorToArray._E(vector);
	}

	@Override
	public Iterator<Object> vectorToIterator(App NE)  {
		Vector<Object> vector=NE._I_U.vector;
		return Vector_ESU_X_vectorToIterator._E(vector);
	}

	@Override
	public String vectorToJsonString(App NE)  {
		Gson gson=NE._I_U.gson;
		Vector<Object> vector=NE._I_U.vector;
		return Vector_ESU_X_vectorToJsonString._E(gson, vector);
	}

	@Override
	public Set<Object> vectorToSet(App NE)  {
		Vector<Object> vector=NE._I_U.vector;
		return Vector_ESU_X_vectorToSet._E(vector);
	}

	@Override
	public char[] stringBuilderToCharArray(App NE)  {
		StringBuilder stringBuilder=NE._I_U.stringBuilder;
		return S_ESU_X_stringBuilderToCharArray._E(stringBuilder);
	}

	@Override
	public String stringBuilderToString(App NE)  {
		StringBuilder stringBuilder=NE._I_U.stringBuilder;
		return S_ESU_X_stringBuilderToString._E(stringBuilder);
	}

	@Override
	public String stringBuilderToJson(App NE)  {
		Gson gson=NE._I_U.gson;
		StringBuilder stringBuilder=NE._I_U.stringBuilder;
		return S_ESU_X_stringBuilderToJson._E(gson, stringBuilder);
	}

	@Override
	public String stringBuilderToXml(App NE)  {
		Gson gson=NE._I_U.gson;
		StringBuilder stringBuilder=NE._I_U.stringBuilder;
		return S_ESU_X_stringBuilderToXml._E(gson, stringBuilder);
	}

	@Override
	public String[] stringBuilderToSplitArray(App NE)  {
		AES_QMS_XSD_TIH stopBy=NE._I_U.stopBy;
		StringBuilder stringBuilder=NE._I_U.stringBuilder;
		return S_ESU_X_stringBuilderToSplitArray._E(stopBy._S_, stringBuilder);
	}

	@Override
	public IMV_SIQ stringBuilderToMap(App NE)  {
		Gson gson=NE._I_U.gson;
		StringBuilder stringBuilder=NE._I_U.stringBuilder;
		return S_ESU_X_stringBuilderToMap._E(gson, stringBuilder);
	}

	@Override
	public String[] stringToArray(App NE)  {
		AES_QMS_XSD_TIH stopBy=NE._I_U.stopBy;
		AES_QMS_XSD_TIH string=NE._I_U.string;
		return String_ESU_X_stringToArray._E(stopBy._S_, string._S_);
	}

	@Override
	public String stringArrayToString(App NE)  {
		String[] strings=NE._I_U.stringA;
		return String_ESU_X_stringArrayToString._E(strings);
	}

	@Override
	public String stringToURIencode(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		AES_QMS_XSD_TIH encoding=NE._I_U.encoding;
		return String_ESU_X_stringToURIencode._E(string._S_, encoding._S_);
	}

	@Override
	public String stringToURIencodeOnlyString(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		return String_ESU_X_stringToURIencode._E(string._S_);
	}

	@Override
	public String uRIencodeToURIdecodeOnlyString(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		return String_ESU_X_uRIencodeToURIdecode._E(string._S_);
	}

	@Override
	public String uRIencodeToURIdecode(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		AES_QMS_XSD_TIH encode=NE._I_U.encode;
		return String_ESU_X_uRIencodeToURIdecode._E(string._S_, encode._S_);
	}

	@Override
	public int[] stringToCharASCII(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		return String_ESU_X_stringToCharASCII._E(string._S_);
	}

	@Override
	public String charsetSwap(App NE)  {
		AES_QMS_XSD_TIH string=NE._I_U.string;
		AES_QMS_XSD_TIH inputCharset=NE._I_U.inputCharset;
		AES_QMS_XSD_TIH outputCharset=NE._I_U.outputCharset;

		return String_ESU_X_charsetSwap._E(string._S_, inputCharset._S_, outputCharset._S_);
	}

	@Override
	public String objectToJsonString(App NE)  {
		Gson gson=NE._I_U.gson;
		Object object=NE._I_U.object;
		return Object_ESU.objectToJsonString(gson, object);
	}

	@Override
	public Object[][][] matrixShiftSwapXYZ(App NE)  {
		Object[][][] objects=NE._I_U.objectsT;
		return Matrix3D_ESU_X_matrixShiftSwapXYZ._E(objects);
	}

	@Override
	public Object[][][] matrixInclineSwapXY(App NE)  {
		Object[][][] objects=NE._I_U.objectsT;
		return Matrix3D_ESU_X_matrixInclineSwapXY._E(objects);
	}

	@Override
	public Object[][][] matrixInclineSwapXZ(App NE)  {
		Object[][][] objects=NE._I_U.objectsT;
		return Matrix3D_ESU_X_matrixInclineSwapXZ._E(objects);
	}

	@Override
	public Object[][][] matrixInclineSwapYZ(App NE)  {
		Object[][][] objects=NE._I_U.objectsT;
		return Matrix3D_ESU_X_matrixInclineSwapYZ._E(objects);
	}

	@Override
	public Object[][][] matrixReverseSwapT(App NE)  {
		Object[][][] objects=NE._I_U.objectsT;
		return Matrix3D_ESU_X_matrixReverseSwap._E(objects);
	}

	@Override
	public Object[][][] matrixReverseSwapXY(App NE)  {
		Object[][][] objects=NE._I_U.objectsT;
		return Matrix3D_ESU_X_matrixReverseSwapXY._E(objects);
	}

	@Override
	public Object[][][] matrixReverseSwapXZ(App NE)  {
		Object[][][] objects=NE._I_U.objectsT;
		return Matrix3D_ESU_X_matrixReverseSwapXZ._E(objects);
	}

	@Override
	public Object[][][] matrixReverseSwapYZ(App NE)  {
		Object[][][] objects=NE._I_U.objectsT;
		return Matrix3D_ESU_X_matrixReverseSwapYZ._E(objects);
	}

	@Override
	public Object[] matrixToArrayT(App NE)  {
		Object[][][] objects=NE._I_U.objectsT;
		return Matrix3D_ESU_X_matrixToArray._E(objects);
	}

	@Override
	public Object[][] matrixInclineSwap(App NE)  {
		Object[][] objects=NE._I_U.objects;
		return Matrix_ESU_X_matrixInclineSwap._E(objects);
	}

	@Override
	public Object[][] matrixPostSwap(App NE)  {
		Object[][] objects=NE._I_U.objects;
		return Matrix_ESU_X_matrixPostSwap._E(objects);
	}

	@Override
	public Object[][] matrixInSwap(App NE)  {
		Object[][] objects=NE._I_U.objects;
		return Matrix_ESU_X_matrixInSwap._E(objects);
	}

	@Override
	public Object[][] matrixReverseSwapM(App NE)  {
		Object[][] objects=NE._I_U.objects;
		return Matrix_ESU_X_matrixReverseSwap._E(objects);
	}

	@Override
	public Object[] matrixToArrayM(App NE)  {
		Object[][] objects=NE._I_U.objects;
		return Matrix_ESU_X_matrixToArray._E(objects);
	}
}
