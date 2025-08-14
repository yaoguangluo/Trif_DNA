package S_A.TRNA.RRNA;

import M_V.MVQ.label.DetaLabel;
import P_V.PCI.ASQ.basic.RatioMatrix;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import S_A.SixActionMap.HelpVerbaMap;
import S_A.SixActionMap.StudyVerbaMap;
import S_A.SixActionMap.WorkVerbaMap;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import U_A.PEU.P.image.ConvexHull;
import jniLYGAFDCDFFT.LYGAFDCTDFFT;
import jniLYGAFDCDFFT.LYGAFDCTDFFT_F;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

//这个函数将染色体中所有 new 出来大型对象进行单例化 注册，模拟核糖体。简化 stable_S在主体程序中的占用，动机缩小可计算内存。
//下一步明年应该感谢 灵感 来自-医学蛋白酶丝化 -- Valentina Perissi, -- 莫名心 猝感，不会是因为去个nature 每人15页ppt，要跟我做文章吧。。。606
//下一步明年也可以感谢（Xuetao Cao, Koji Okamoto, Hanming Shen, Richard Youle）-
//本来这是我2025年的进度，但是太无聊了，。。。nume-forma-stru-sets
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//S_objectIdentify
public class U_Q extends Q_I {

    public StudyVerbaMap studyVerbaMap;
    public WorkVerbaMap workVerbaMap;
    public List<IMV_SIQ> outputMapList;
    public List<IMV_SIQ> joinObj;
    public List<IMV_SIQ> newObj;
    public LYGAFDCTDFFT lYGAFDCTDFFT;
    public LYGAFDCTDFFT_F lYGAFDCTDFFT_F;
    public IMV_SIQ dataMap;
    public Object[][][] objectsT;
    public JSONObject jsobj;
    public Object[] objectA;

    //
    public TinMap outputMap;
    public int initonsDistanceRelationship = 30;
    public List<String> output;
    public IMV_SIQ tableNameMap = new IMV_SIQ();
    public List<Object> list;
    public List<Object> outputObjectList;

    public List<DetaLabel> jFrameList;
    public List<Double> inputList;
    public List<Object> listObject;
    public List<double[]> inputListDA;
    public List<double[][]> inputListDT;
    public List<Double> listDouble;
    public List<Double> scoresList;
    public ArrayList<String> copy_xj;
    public List<String> listString;
    public List<Object> destination;
    public List<AMV_MVS_VSQ_2D> groupsList;
    public List<Double> outputDoubleList;
    public List<IMV_SIQ> obj;
    public List<AMV_MVS_VSQ_2D> list2D;
    public List<AMV_MVS_VSQ_3D> list3D;
    public List<AMV_MVS_VSQ_2D> coods;
    public ArrayList<String> nameContent;
    public List<AMV_MVS_VSQ_3D> coods3D;
    public List<AMV_MVS_VSQ_2D> hearts;
    public List<AMV_MVS_VSQ_3D> hearts3D;
    public List<AMV_MVS_VSQ_3D> input3D;
    public List<AMV_MVS_VSQ_2D> groupsList2D;
    public List<AMV_MVS_VSQ_2D> position2Ds;
    public List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs;
    public List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs3D;
    public List<AMV_MVS_VSQ_3D> position3Ds;
    public List<AMV_MVS_VSQ_2D> input2DList;
    public ArrayList<AMV_MVS_VSQ_2D> groups;
    public List<ConvexHull.Vertex> vertices;
    public ArrayList<AMV_MVS_VSQ_3D> groups3D;
    public List<RatioMatrix> groupsRatioList;
    //
    public IMV_SIQ map;
    public IMV_SIQ nlp;

    public HelpVerbaMap helpVerbaMap;
    public IMV_SIQ inputMap;
    public IMV_SIQ rowCells;
    public IMV_SIQ textContent;
    public IMV_SIQ dic_xj;
    public IMV_SIQ conditions;
    //public TinMap objectMap;//later normalization
    public IMV_SIQ dic_li;
    public IMV_SIQ rowMap;
    public IMV_SIQ pos;
    public IMV_SIQ inputValues;
    public IMV_SIQ destinationMap;
    public IMV_SIQ_SS keyMap;
    public IMV_SIQ_SS outputList;

    public Map<String, Boolean> findinNewObj;
    public Map<Double, List<AMV_MVS_VSQ_2D>> groups2D;
    public Map<Double, List<AMV_MVS_VSQ_2D>> input2D;
    public Map<Double, AMV_MVS_VSQ_2D> hearts2D;
    public Map<Double, AMV_MVS_VSQ_2D> pascalHearts;
    public Map<Double, AMV_MVS_VSQ_2D> groupsHeart;
    public Map<Double, AMV_MVS_VSQ_2D> pascalMids;
    public Map<Double, AMV_MVS_VSQ_3D> pascalMids3D;
    public Map<Double, List<AMV_MVS_VSQ_3D>> groups3DMap;
    public Map<Double, AMV_MVS_VSQ_3D> pascalHearts3D;
    public Map<Double, AMV_MVS_VSQ_3D> groupsHeart3D;
    public Map<String, RatioMatrix> groupsMap;
    public Map<Integer, Boolean> rowsMap;
    public Map<Integer, Boolean> culumns;
    public Map<Double, List<AMV_MVS_VSQ_2D>> groups2DMap;
    public Map<Double, List<AMV_MVS_VSQ_3D>> inputMap3D;
    public Map<Double, List<AMV_MVS_VSQ_2D>> imagePix2D;
    public Map<Double, List<AMV_MVS_VSQ_3D>> groupsMap3D;
    //
    public Object object;
    public Object value;
    public Object[] spec;
    public Object[] defaultTableDataSpec;
    public Object[] huaRuiJiJtableCulumns;
    public Object[][] defaultTableData;
    public Object[][] huaRuiJiJtable;
    public Object[][] tableData;
    public Object[][] tableData_old;
    public Object[][] objects;

    public JSONObject culumnOfNewRow;
    public JSONObject jaculumnOfUpdateRow;
    //
    public IMV_SIQ inputHashMap;
    public Hashtable<String, Object> hashtable;

    public JSONObject jSONObject;
    public Vector<Object> vector;
    public Iterator<Object> iterator;
}
