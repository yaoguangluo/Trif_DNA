package S_A.SEM.bloom;

import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.IVDTIXQCTIV.LenovoInit;
import A_V.E.RatioMap_E;
import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import C_A.ME.analysis.C.A;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import ME.VPC.M.app.App;
import M_V.MVQ.button.DetaButton;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import O_V.OPM.ESU.admin.DBReadMode;
import O_V.OSA.shell.PL_XA_E;
import O_V.OSA.shell.XA_ShellQ_JoinRows_E;
import O_V.OSA.shell.XA_ShellQ_NestRows_E;
import O_V.OSA.shell.XA_ShellQ_Rows_E;
import O_V.OSA.shell.XA_ShellTables;
import O_V.OSI.AOP.MEC.SIQ.pletl.PLETL_E;
import O_V.OSI.AOP.VPC.rest.VPC;
import O_V.OSI.AOP.VPC.rest.VPCBackEnd;
import O_V.OSI.AOP.VPC.rest.VPCYangliaojing;
import O_V.OSI.AOP.rest.medicine.RestMedicinePort_E;
import plshell.P_CO_XA_X_Cache;
import plshell.P_CO_XA_X_Kernel;
import plshell.P_CO_XA_X_Map;
import O_V.OSM.shell.E_pl_XA_E;
import O_V.OSM.shell.P_AO_PLETL;
import O_V.OSM.shell.P_AO_PLTCP;
import O_V.OSM.shell.P_AO_pl_XA;
import O_V.OSM.shell.P_I_CulumnsPL_XA;
import O_V.OSM.shell.P_RelationPL_XA;
import O_V.OSM.shell.Pl_XA_Command_E;
import O_V.OSM.shell.ShellReplace;
import exception.file.O.DetaBufferedReader;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public class StaticFunctionMapO_VECS_E implements StaticFunctionMapO_VECS_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    @Override
    public void SortStringDemo(App NE) {
        O_V.OSM.shell.SortStringDemo.main(null);
    }

    //TransactionDelegate {逻辑型 应用接口略。
    public IMV_SIQ transactionLogin(App NE) {
        AES_QMS_XSD_TIH uEmail = NE._I_U.uEmail;
        AES_QMS_XSD_TIH uPassword = NE._I_U.uPassword;
        //return TransactionDelegate.transactionLogin(uEmail, uPassword);
        return null;

    }

    public IMV_SIQ transactionRegister(App NE) {
        AES_QMS_XSD_TIH uEmail = NE._I_U.uEmail;
        AES_QMS_XSD_TIH uEmailEnsure = NE._I_U.uEmailEnsure;
        AES_QMS_XSD_TIH uName = NE._I_U.uName;
        AES_QMS_XSD_TIH uPassword = NE._I_U.uPassword;
        AES_QMS_XSD_TIH uPassWDEnsure = NE._I_U.uPassWDEnsure;
        AES_QMS_XSD_TIH uAddress = NE._I_U.uAddress;
        AES_QMS_XSD_TIH uPhone = NE._I_U.uPhone;
        AES_QMS_XSD_TIH uWeChat = NE._I_U.uWeChat;
        AES_QMS_XSD_TIH uQq = NE._I_U.uQq;
        AES_QMS_XSD_TIH uAge = NE._I_U.uAge;
        AES_QMS_XSD_TIH uSex = NE._I_U.uSex;
//		return TransactionDelegate.transactionRegister(uEmail, uEmailEnsure
//				, uName, uPassword, uPassWDEnsure, uAddress
//				, uPhone, uWeChat, uQq, uAge, uSex) ;
        return null;

    }

    //养疗经读表函数
    //DBReadMode{
    public void aCommonReadWay(App NE) {
        App app = NE._I_U.app;
        DBReadMode.aCommonReadWay(app.app_S, NE);
    }

    public void readDBInTXTWay(App NE) {
        App app = NE._I_U.app;
        DBReadMode.readDBInTXTWay(app.app_S, NE);
    }

    public void readDBInBaseWay(App NE) {
        App app = NE._I_U.app;
        DBReadMode.readDBInBaseWay(app.app_S, NE);
    }

    public void readDBInWebWay(App NE) {
        App app = NE._I_U.app;
        DBReadMode.readDBInWebWay(app.app_S, NE);
    }

    public O_V.OPM.ESU.admin.PLSQLSectionPanel PLSQLSectionPanel(App NE) {
        App app = NE._I_U.app;
        return new O_V.OPM.ESU.admin.PLSQLSectionPanel(app);

    }

    public O_V.OPM.ESU.admin.VPCSRestPanel VPCSRestPanel(App NE) {
        App app = NE._I_U.app;
        return new O_V.OPM.ESU.admin.VPCSRestPanel(app);

    }

    public O_V.OPM.ESU.admin.YouBiaoSectionPanel YouBiaoSectionPanel(App NE) {
        App app = NE._I_U.app;
        return new O_V.OPM.ESU.admin.YouBiaoSectionPanel(app);

    }

    //plsearchShell
    public O_V.OSA.shell.PL_XA_C PL_XA_C(App NE) {
        return new O_V.OSA.shell.PL_XA_E();

    }

    // XA_ShellQ_JoinRows_E {
    public Object selectRowsByAttributesOfJoinCondition(App NE) {
        return XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinCondition(NE._I_U.outputMap, NE);
    }

    public Object selectRowsByAttributesOfJoinAggregation(App NE) {
        IMV_SIQ object = NE._I_U.outputMap;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        RatioMap_E ratioMap_E = NE._I_U.ratioMap_E;
        return XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinAggregation(object
            , emotionSample, ratioMap_E, NE);
    }

    public Object selectRowsByAttributesOfJoinGetCulumns(App NE) {
        return XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinGetCulumns(NE._I_U.outputMap);
    }

    public Object selectRowsByAttributesOfJoinRelation(App NE) {
        return XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinRelation(NE._I_U.outputMap);
    }

    //XA_ShellQ_NestRows_E {
    public Object selectRowsByAttributesOfNestCondition(App NE) {
        return XA_ShellQ_NestRows_E.selectRowsByAttributesOfNestCondition(NE._I_U.outputMap, NE);
    }

    public Object selectRowsByAttributesOfNestAggregation(App NE) {
        IMV_SIQ object = NE._I_U.outputMap;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        RatioMap_E ratioMap = NE._I_U.ratioMap_E;
        return XA_ShellQ_NestRows_E.selectRowsByAttributesOfNestAggregation(object
            , emotionSample, ratioMap, NE);
    }

    public Object selectRowsByAttributesOfNestGetCulumns(App NE) {
        return XA_ShellQ_NestRows_E.selectRowsByAttributesOfNestGetCulumns(NE._I_U.outputMap);
    }

    public Object selectRowsByAttributesOfNestRelation(App NE) {
        return XA_ShellQ_NestRows_E.selectRowsByAttributesOfNestRelation(NE._I_U.outputMap);
    }

    //XA_ShellQ_Rows_E {
    public List<IMV_SIQ> selectRowsByAttribute(App NE) {
        AES_QMS_XSD_TIH currentDB = NE._I_U.currentDB;
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        AES_QMS_XSD_TIH culmnName = NE._I_U.culmnName;
        Object value = NE._I_U.value;
        if (null == currentDB || null == tableName || null == culmnName) {
            return new ArrayList<>();
        }
        return XA_ShellQ_Rows_E.selectRowsByAttribute(currentDB._S_
            , tableName._S_, culmnName._S_, value);
    }

    public void XA_ShellQ_Rows_E_main(App NE) {
        String[] args = NE._I_U.args;
        XA_ShellQ_Rows_E.main(args);
    }

    //今天看了下发现我的数据库 没有分页, 以后会设计一个文件夹最大为3000 rows
    //一页, 先不管了, shell 用不到sheets逻辑。
    //罗瑶光20210927
    public IMV_SIQ selectRowsByTablePath(App NE) {
        AES_QMS_XSD_TIH tablePath = NE._I_U.tablePath;
        AES_QMS_XSD_TIH pageBegin = NE._I_U.pageBegin;
        AES_QMS_XSD_TIH pageEnd = NE._I_U.pageEnd;
        AES_QMS_XSD_TIH direction = NE._I_U.direction;
        if (null == tablePath || null == pageBegin
            || null == pageEnd || null == direction) {
            return new IMV_SIQ();
        }
        return XA_ShellQ_Rows_E.selectRowsByTablePath(tablePath._S_, pageBegin._S_
            , pageEnd._S_, direction._S_);

    }

    //db替换shell中 20210927
    public Object selectRowsByAttributesOfCondition(App NE) {
        return XA_ShellQ_Rows_E.selectRowsByAttributesOfCondition(NE._I_U.outputMap, NE);

    }

    //20210927 注释下 稍后替换
    //先设计成 plsearch 语法和 plsql 语法通用, 方便我之后的plorm 统一一种方式扩展 pladmin
    public List<IMV_SIQ> selectRowsByAttributesOfAggregation(App NE) {
        IMV_SIQ object = NE._I_U.outputMap;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        RatioMap_E ratioMap = NE._I_U.ratioMap_E;
        return XA_ShellQ_Rows_E.selectRowsByAttributesOfAggregation(object
            , emotionSample, ratioMap, NE);

    }

    public Object selectRowsByAttributesOfGetCulumns(App NE) {
        return XA_ShellQ_Rows_E.selectRowsByAttributesOfGetCulumns(NE._I_U.outputMap);

    }

    //PLETL命令一多, 之后准备分出去
    //罗瑶光 20211010
    public Object selectRowsByAttributesOfPLETL(App NE) {
        return XA_ShellQ_Rows_E.selectRowsByAttributesOfPLETL(NE._I_U.outputMap);

    }

    public Object selectRowsByAttributesOfPLTCP(App NE) {
        return XA_ShellQ_Rows_E.selectRowsByAttributesOfPLTCP(NE._I_U.outputMap);

    }

    //XA_ShellTables{
    //先把接口做足, 罗瑶光20210925
    //将表变成表映射
    public boolean addNewSearchShellTable(App NE) {
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        JTable jtable = NE._I_U.jtable;
        if (null == tableName) {
            return false;
        }
        return XA_ShellTables.addNewSearchShellTable(tableName._S_, jtable, NE);

    }

    //按sonar方式重复函数分离
    public Object[] getNewSearchShellTableSpecFromDefaultTableModel(App NE) {
        DefaultTableModel defaultTableModel = NE._I_U.defaultTableModel;
        return XA_ShellTables.getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel);

    }

    //按sonar方式重复函数分离
    public Object[][] getNewSearchShellTableDataFromDefaultTableModel(App NE) {
        DefaultTableModel defaultTableModel = NE._I_U.defaultTableModel;
        return XA_ShellTables.getNewSearchShellTableDataFromDefaultTableModel(defaultTableModel);

    }

    //设计个row的结合表map内存结构 用于shell的表头搜索。
    public Row[] getNewSearchShellTableRowsFromDefaultTableModel(App NE) {
        Object[] spec = NE._I_U.spec;
        DefaultTableModel defaultTableModel = NE._I_U.defaultTableModel;
        return XA_ShellTables.getNewSearchShellTableRowsFromDefaultTableModel(spec
            , defaultTableModel);

    }

    //设计个row的结合表map内存结构 用于shell的表头搜索。
    public Row[] getNewSearchShellTableRowsFromObjectArray(App NE) {
        Object[] spec = NE._I_U.spec;
        Object[][] tableData = NE._I_U.tableData;
        return XA_ShellTables.getNewSearchShellTableRowsFromDefaultTableModel(spec
            , tableData);
    }

    //将表映射变成shell映射, 接口VPCS 多样化, 稍后做新陈代谢用。
    public boolean addNewSearchShellTableWithTableModel(App NE) {
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        if (null == tableName) {
            return false;
        }
        DefaultTableModel defaultTableModel = NE._I_U.defaultTableModel;
        return XA_ShellTables.addNewSearchShellTable(tableName._S_, defaultTableModel, NE);

    }

    //将表映射变成shell映射, 接口VPCS 多样化, 稍后做新陈代谢用。 object data 稍后准备 用 _S_ 元基替换。
    public boolean addNewSearchShellTableWithObjectData(App NE) {
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        DefaultTableModel defaultTableModel = NE._I_U.defaultTableModel;
        Object[][] defaultTableData = NE._I_U.defaultTableData;
        if (null == tableName) {
            return false;
        }
        return XA_ShellTables.addNewSearchShellTableWithObjectData(tableName._S_
            , defaultTableModel, defaultTableData, NE);

    }

    //shell映射封装
    public boolean addNewSearchShellTableneedSpec(App NE) {
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        Object[][] defaultTableData = NE._I_U.defaultTableData;
        Object[] defaultTableDataSpec = NE._I_U.defaultTableDataSpec;
        if (null == tableName) {
            return false;
        }
        return XA_ShellTables.addNewSearchShellTable(tableName._S_, defaultTableData
            , defaultTableDataSpec, NE);
    }

    //Reflection map 表头方式存储
    //将表映射变成shell映射, 接口VPCS 多样化, 稍后做新陈代谢用。 object data 稍后准备 用 _S_ 元基替换。
    public boolean addNewSearchShellTableWithObjectDataReflectionDBRows(App NE) {
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        DefaultTableModel defaultTableModel = NE._I_U.defaultTableModel;
        Object[][] defaultTableData = NE._I_U.defaultTableData;
        if (null == tableName) {
            return false;
        }
        return XA_ShellTables.addNewSearchShellTableWithObjectDataReflectionDBRows(
            tableName._S_, defaultTableModel, defaultTableData);

    }

    //Reflection map 表头方式存储
    //shell映射封装
    public boolean addNewSearchShellTableReflectionDBRows(App NE) {
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        Row[] rows = NE._I_U.rows;
        Object[] defaultTableDataSpec = NE._I_U.defaultTableDataSpec;
        if (null == tableName) {
            return false;
        }
        return XA_ShellTables.addNewSearchShellTableReflectionDBRows(tableName._S_, rows
            , defaultTableDataSpec);
    }

    //然后所有养疗经的jtable表全部基于这个文件函数 进行shell 封装。与数据库的内存映射分离。
    public boolean addInitSearchShellTable(App NE) {
        App app = NE._I_U.app;
        return XA_ShellTables.addInitSearchShellTable(app);
    }

    //PLETL_C{
    public boolean doNeroFlow(App NE) {
        JTextPane rightBotJTextPane = NE._I_U.rightBotJTextPane;
        NodeShow nodeView = NE._I_U.nodeView;
        LinkList first = NE._I_U.firstLinkList;
        AES_QMS_XSD_TIH documentFlowAddress = NE._I_U.documentFlowAddress;
        IMV_SIQ inputMap = NE._I_U.inputHashMap;
        return new PLETL_E().doNeroFlow(rightBotJTextPane, nodeView, first
            , documentFlowAddress._S_, inputMap, NE);
    }

    //ReadChinese extends Thread implements Runnable{
    public O_V.OSI.AOP.neo.tts.ReadChinese ReadChinese(App NE) {
        DetaButton detaButton = NE._I_U.detaButton;
        App app = NE._I_U.app;
        A _A = NE._I_U._A;
        return new O_V.OSI.AOP.neo.tts.ReadChinese(detaButton, app.app_S);
    }

    //RestMedicinePort_E {
    public App kernel(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        return RestMedicinePort_E.kernel(app, string._S_, NE);
    }

    public IMV_SIQ getMedicineBookFeedbackZY(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        return RestMedicinePort_E.getMedicineBookFeedbackZY(app, string._S_, NE);

    }

    public IMV_SIQ getMedicineBookFeedbackXY(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        return RestMedicinePort_E.getMedicineBookFeedbackXY(app, string._S_);

    }

    public IMV_SIQ getMedicineBookFeedbackZT(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        return RestMedicinePort_E.getMedicineBookFeedbackZT(app, string._S_);
    }

    public IMV_SIQ getMedicineBookFeedbackXT(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        return RestMedicinePort_E.getMedicineBookFeedbackXT(app, string._S_);
    }

    public IMV_SIQ getMedicineBookFeedbackYT(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        return RestMedicinePort_E.getMedicineBookFeedbackYT(app, string._S_);
    }

    public IMV_SIQ getMedicineBookFeedback(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        return RestMedicinePort_E.getMedicineBookFeedback(app, string._S_);
    }

    public Object doSearch(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        return RestMedicinePort_E.doSearch(app, string._S_);
    }


    //VPC extends ServerVPC_Standard {
    //逐步分离出来, 方便vpcs 之后继承。
    public String forwardDB(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        IMV_SIQ data = NE._I_U.dataMap;
        return VPC.forwardDB(app.app_S, string._S_, data);
    }

    public String forwardVPC(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        IMV_SIQ data = NE._I_U.dataMap;
        return VPC.forward(app.app_S, string._S_, data);

    }

    //VPCBackEnd {
    //public static RestLoginPort restLoginPort;
    public String forwardVPCBackEnd(App NE) {
        EmotionMap emotionMap = NE._I_U.emotionMap;
        RatioMap_E ratioMap_E = NE._I_U.ratioMap_E;
        EmotionInit emotionInit = NE._I_U.emotionInit;
        CogsBinaryForest_AE _A = NE._I_U._AE;
        EnvironmentInit environmentInit = NE._I_U.environmentInit;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        LenovoInit lenovoInit = NE._I_U.lenovoInit;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        IMV_SIQ data = NE._I_U.dataMap;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        SensingTest sensingTest = NE._I_U.sensingTest;
        RNN_IDETest rNN_IDETest = NE._I_U.rNN_IDETest;
        SensingMap_E sensingMap_E = NE._I_U.sensingMap_E;
        return VPCBackEnd.forward(string._S_, data, NE);
    }

    //VPCYangliaojing {
    public String forwardVPCYangliaojing(App NE) {
        App app = NE._I_U.app;
        AES_QMS_XSD_TIH string = NE._I_U.string;
        IMV_SIQ data = NE._I_U.dataMap;
        return VPCYangliaojing.forward(app, string._S_, data, NE);
    }

    public String getCode(App NE) {
        AES_QMS_XSD_TIH filePath = NE._I_U.FilePath;
        return VPCYangliaojing.getCode(filePath._S_);
    }

    public String getFilePath(App NE) {
        AES_QMS_XSD_TIH string = NE._I_U.string;
        return VPCYangliaojing.getFilePath(string._S_);
    }

    //OSI.AOP.VPC.server 启动例子
    //PL ETL shell
    //E_pl_XA_E {
    public TinMap E_pl_XA(App NE) {
        AES_QMS_XSD_TIH plSearch = NE._I_U.plSearch;
        boolean mod = NE._I_U.mod;
        TinMap output = NE._I_U.outputMap;
        return E_pl_XA_E.E_pl_XA(plSearch._S_, mod, output, NE);
    }

    public TinMap E_orm_XA(App NE) {
        PL_XA_E orm = NE._I_U.orm_AE;
        boolean b = NE._I_U.b;
        TinMap output = NE._I_U.outputMap;
        return E_pl_XA_E.E_pl_XA(orm, b, output, NE);
    }

    //P_AO_pl_XA {
    public void P_AggregationLimitMap(App NE) {
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        RatioMap_E ratioMap = NE._I_U.ratioMap_E;
        P_AO_pl_XA.P_AggregationLimitMap(sets, output, emotionSample, ratioMap, NE);
    }

    //分出去
    public void P_PletlLimitMap(App NE) {
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> obj = NE._I_U.obj;
        P_AO_pl_XA.P_PletlLimitMap(sets, obj);
    }

    //P_AO_PLETL {
    public void P_PletlLimitMaps(App NE) throws InstantiationException {//later
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        IMV_SIQ object = NE._I_U.outputMap;
        P_AO_PLETL.P_PletlLimitMap(sets, output, object);
    }

    //P_AO_PLTCP {
    public void P_PltcpLimitMap(App NE) {
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        IMV_SIQ object = NE._I_U.outputMap;
        P_AO_PLTCP.P_PltcpLimitMap(sets, output, object);
    }

    //P_CO_pl_XA_X_Cache extends P_CO_pl_XA_XCDX {
    public void P_Cache(App NE) {
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        IMV_SIQ object = NE._I_U.outputMap;
        AES_QMS_XSD_TIH condition = NE._I_U.condition;
        if (null == tableName || null == condition) {
            return;
        }
        P_CO_XA_X_Cache.P_Cache(sets, output, tableName._S_, object, condition._S_, NE);
    }

    //P_CO_pl_XA_X_Kernel extends P_CO_pl_XA_XCDX {
    //比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
    //这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了,
    //时间点大概在2019年1月后, 我先调通下, 之后朔源.
    //准备验算下20210406 罗瑶光
    public void P_kernel(App NE) {
        AES_QMS_XSD_TIH temp = NE._I_U.temp;
        File readDBTableRowIndexCulumnFile = NE._I_U.readDBTableRowIndexCulumnFile;
        File readDBTableRowIndexFile = NE._I_U.readDBTableRowIndexFile;
        DetaBufferedReader reader = NE._I_U.reader;
        AES_QMS_XSD_TIH DBTableRowIndexPath = NE._I_U.DBTableRowIndexPath;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        Row bufferRow = NE._I_U.bufferRow;
        IMV_SIQ rowMap = NE._I_U.rowMap;
        P_CO_XA_X_Kernel.P_kernel(
            readDBTableRowIndexFile,
            output, bufferRow, rowMap);
    }

    //P_kernel等比复制过来的search shell组件, 我要替换的是数据库储值, jtable表做output
    //把jtable数据表的数据 变成数据库的db映射, 传入参数是dma的每一行文件的集合,
    //DefaultTableModel 的 Object[][] huaRuiJiJtable 对应 DBTablePath
    //readDBTableRowIndexFile对应 row id
    //huaRuiJiJtableCulumns 对应 culumn
    //jtable  太上层, 用它的spec 速度会很慢。所以用object[][]  先
    //罗瑶光 20210924
    //出现一个问题, 我的table db是非线性map 结构, 自带表头key, 而data 是矩阵, 下面逻辑要全部改掉
    public void P_kernel_search(App NE) {
        AES_QMS_XSD_TIH temp = NE._I_U.temp;
        File readDBTableRowIndexFile = NE._I_U.readDBTableRowIndexFile;
        int rowId = NE._I_U.rowId;
        Object[] huaRuiJiJtableCulumns = NE._I_U.huaRuiJiJtableCulumns;
        Object[][] huaRuiJiJtable = NE._I_U.huaRuiJiJtable;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        Row bufferRow = NE._I_U.bufferRow;
        IMV_SIQ rowMap = NE._I_U.rowMap;
        P_CO_XA_X_Kernel.P_kernel_search(rowId
            , huaRuiJiJtableCulumns, huaRuiJiJtable, output, bufferRow, rowMap);
    }

    //P_CO_pl_XA_X_Map extends P_CO_pl_XA_XCDX {
    //以后优化成统一对象输出, 不需要再转换。2019-1-15 tin
    public IMV_SIQ rowToRowMap(App NE) {
        Row row = NE._I_U.row;
        return P_CO_XA_X_Map.rowToRowMap(row);
    }

    //将rowToRowMap 进行逆向 RowMapToRow 一来验证, 2来找最小计算模型, 方便下一步表格编译计算。
    //罗瑶光202109302339
    public Row rowMapToRow(App NE) {
        IMV_SIQ map = NE._I_U.map;
        return P_CO_XA_X_Map.rowMapToRow(map);

    }

    //猫腻哥 把我pmap的output 都改了, 今天一查问题全出来了。20210927, 问题已找到
    //, 不是web 被改模式, 上传commit的时候, 本地被改了,
    //懒得管, 把P_Map 改成 shellP_Map
    public void P_Map(App NE) {
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        IMV_SIQ object = NE._I_U.outputMap;
        if (null == tableName) {
            return;
        }
        P_CO_XA_X_Map.P_Map(sets, output, tableName._S_, object, NE);
    }

    //P_I_CulumnsPL_XA {
    public Object getCulumnsMapWithAs(App NE) {
        String[] sets = NE._I_U.sets;
        IMV_SIQ row = NE._I_U.rowMap;
        return P_I_CulumnsPL_XA.getCulumnsMapWithAs(sets, row);

    }

    public Object getCulumnsMap(App NE) {
        String[] sets = NE._I_U.sets;
        IMV_SIQ row = NE._I_U.rowMap;
        return P_I_CulumnsPL_XA.getCulumnsMap(sets, row);
    }

    public Object P_GetCulumnsMap(App NE) {
        List<IMV_SIQ> obj = NE._I_U.obj;
        String[] getCulumnsValueArray = NE._I_U.getCulumnsValueArray;
        return P_I_CulumnsPL_XA.P_GetCulumnsMap(obj, getCulumnsValueArray);
    }

    //P_RelationPL_XA {
    public void P_AndMap(App NE) {
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> obj = NE._I_U.obj;
        List<IMV_SIQ> joinObj = NE._I_U.joinObj;
        IMV_SIQ object = NE._I_U.outputMap;
        List<IMV_SIQ> newObj = NE._I_U.newObj;
        P_RelationPL_XA.P_AndMap(sets, obj, joinObj, object, newObj);
    }

    public void P_OrMap(App NE) {
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> obj = NE._I_U.obj;
        List<IMV_SIQ> joinObj = NE._I_U.joinObj;
        IMV_SIQ object = NE._I_U.outputMap;
        List<IMV_SIQ> newObj = NE._I_U.newObj;
        Map<String, Boolean> findinNewObj = NE._I_U.findinNewObj;
        P_RelationPL_XA.P_OrMap(sets, obj, joinObj, object, newObj, findinNewObj);
    }

    //Pl_XA_Command_E {
    public void P_SetRoot(App NE) {
        Pl_XA_Command_E.P_SetRoot(NE._I_U.acknowledge
            , NE._I_U.outputMap, NE);
    }

    public void P_BaseName(App NE) {
        Pl_XA_Command_E.P_BaseName(NE._I_U.acknowledge
            , NE._I_U.outputMap);
    }

    public void P_TableName(App NE) {
        Pl_XA_Command_E.P_TableName(NE._I_U.acknowledge
            , NE._I_U.outputMap);
    }

    public void P_YLJOperation(App NE) {
        Pl_XA_Command_E.P_YLJOperation(NE._I_U.acknowledge
            , NE._I_U.outputMap, NE);
    }

    public void P_ListNeedStart(App NE) {
        Pl_XA_Command_E.P_ListNeedStart(NE._I_U.acknowledge
            , NE._I_U.outputMap);
    }

    public void P_Join(App NE) {
        Pl_XA_Command_E.P_Join(NE._I_U.acknowledge
            , NE._I_U.outputMap);
    }

    public void P_E(App NE) {
        String[] acknowledge = NE._I_U.acknowledge;
        TinMap object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        Pl_XA_Command_E.P_E(acknowledge, object, mod, NE);
    }

    //处理机中心, 别急, 准备验证 罗瑶光
    //plsql函数执行指令 正在检查中 罗瑶光 20210405
    public void P_Check(App NE) {
        AES_QMS_XSD_TIH acknowledge = NE._I_U.acknowledgeString;
        TinMap object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        Pl_XA_Command_E.P_Check(acknowledge._S_, object, mod, NE);
    }

    public void P_StoreValues(App NE) {
        Pl_XA_Command_E.P_StoreValues(NE._I_U.acknowledge
            , NE._I_U.outputMap);
    }

    //之后准备设计成工厂类 或者 单例类 bean
    public void P_fileOperations(App NE) {
        Pl_XA_Command_E.P_fileOperations(NE._I_U.acknowledge
            , NE._I_U.outputMap);
    }

    //ShellReplace {
    public void replaceString(App NE) {
        AES_QMS_XSD_TIH fileDirectroyPath = NE._I_U.fileDirectroyPath;
        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
        AES_QMS_XSD_TIH needReplaceString = NE._I_U.needReplaceString;
        new ShellReplace().replaceString(fileDirectroyPath._S_
            , searchString._S_, needReplaceString._S_);
    }

    //稍后设计成map来存储这些String条件变量。
    public void replaceStringWithMapAndFileName(App NE) {
        AES_QMS_XSD_TIH fileDirectroyPath = NE._I_U.fileDirectroyPath;
        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
        IMV_SIQ conditions = NE._I_U.conditions;
        new ShellReplace().replaceStringWithFileName(fileDirectroyPath._S_
            , searchString._S_, conditions);
    }

    //稍后变线程
    public void start(App NE) {
        new ShellReplace().start();
    }

    //文件名对应筛选
    public void replaceStringWithFileName(App NE) {
        AES_QMS_XSD_TIH fileDirectroyPath = NE._I_U.fileDirectroyPath;
        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
        AES_QMS_XSD_TIH needReplaceString = NE._I_U.needReplaceString;
        AES_QMS_XSD_TIH fileName = NE._I_U.fileName;
        new ShellReplace().replaceStringWithFileName(fileDirectroyPath._S_, searchString._S_
            , needReplaceString._S_, fileName._S_);
    }

    //文件后缀筛选
    public void replaceStringWithFileType(App NE) {
        AES_QMS_XSD_TIH fileDirectroyPath = NE._I_U.fileDirectroyPath;
        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
        AES_QMS_XSD_TIH needReplaceString = NE._I_U.needReplaceString;
        AES_QMS_XSD_TIH fileType = NE._I_U.fileType;
        new ShellReplace().replaceStringWithFileType(fileDirectroyPath._S_, searchString._S_
            , needReplaceString._S_, fileType._S_);
    }

    //文件大小筛选
    public void replaceStringWithFileSize(App NE) {
        AES_QMS_XSD_TIH fileDirectroyPath = NE._I_U.fileDirectroyPath;
        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
        AES_QMS_XSD_TIH needReplaceString = NE._I_U.needReplaceString;
        long filesize_KB = NE._I_U.filesize_KB;
        new ShellReplace().replaceStringWithFileSize(fileDirectroyPath._S_, searchString._S_
            , needReplaceString._S_, filesize_KB);
    }

    //文件大小筛选
    public void replaceStringWithFileLines(App NE) {
        AES_QMS_XSD_TIH fileDirectroyPath = NE._I_U.fileDirectroyPath;
        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
        AES_QMS_XSD_TIH needReplaceString = NE._I_U.needReplaceString;
        long beginLine = NE._I_U.beginLine;
        long endLine = NE._I_U.endLine;
        new ShellReplace().replaceStringWithFileLines(fileDirectroyPath._S_, searchString._S_
            , needReplaceString._S_, beginLine, endLine);
    }

    public void mainShellReplace(App NE) {
        String[] argv = NE._I_U.argv;
        ShellReplace.main(argv);
    }

    //设计一种简单的log模式先。
    public void replaceStringWithLogRecording(App NE) {
        IMV_SIQ conditions = NE._I_U.conditions;
        new ShellReplace().replaceStringWithLogRecording(conditions);
    }
}