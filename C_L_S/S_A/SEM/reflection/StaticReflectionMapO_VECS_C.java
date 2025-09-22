package S_A.SEM.reflection;

import java.io.IOException;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapO_VECS_E;
import S_A.pheromone.IMV_SIQ;

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
public class StaticReflectionMapO_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    //之后下面这种写死的函数方式全部弃用，走map 注册模式。
    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_C
        , IMV_SIQ output, App NE) throws InterruptedException, IOException {
        String[] 传参因子 = (String[]) output.get("传参因子");//可以保留作为可观测。
        int 因子 = 0;
        Object map = null;
        //map= 担心被改原堆栈，不用 就要全部改成 put return to outputMap
        if (callFunctionKey.contains("SortStringDemo", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.SortStringDemo(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "SortStringDemo");
        }
        if (callFunctionKey.contains("transactionLogin", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.transactionLogin(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "transactionLogin");
        }
        if (callFunctionKey.contains("transactionRegister", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.transactionRegister(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "transactionRegister");
        }
        if (callFunctionKey.contains("aCommonReadWay", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.aCommonReadWay(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "aCommonReadWay");
        }
        if (callFunctionKey.contains("readDBInTXTWay", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.readDBInTXTWay(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "readDBInTXTWay");
        }
        if (callFunctionKey.contains("readDBInBaseWay", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.readDBInBaseWay(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "readDBInBaseWay");
        }
        if (callFunctionKey.contains("readDBInWebWay", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.readDBInWebWay(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "readDBInWebWay");
        }
        if (callFunctionKey.contains("PLSQLSectionPanel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.PLSQLSectionPanel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "PLSQLSectionPanel");
        }
        if (callFunctionKey.contains("VPCSRestPanel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.VPCSRestPanel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "VPCSRestPanel");
        }
        if (callFunctionKey.contains("YouBiaoSectionPanel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.YouBiaoSectionPanel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "YouBiaoSectionPanel");
        }
        if (callFunctionKey.contains("PL_XA_C", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.PL_XA_C(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "PL_XA_C");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfJoinCondition", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinCondition(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfJoinCondition");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfJoinAggregation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinAggregation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfJoinAggregation");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfJoinGetCulumns", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinGetCulumns(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfJoinGetCulumns");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfJoinRelation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinRelation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfJoinRelation");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfNestCondition", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestCondition(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfNestCondition");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfNestAggregation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestAggregation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfNestAggregation");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfNestGetCulumns", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestGetCulumns(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfNestGetCulumns");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfNestRelation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestRelation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfNestRelation");
        }
        if (callFunctionKey.contains("selectRowsByAttribute", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttribute(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttribute");
        }
        if (callFunctionKey.contains("XA_ShellQ_Rows_E_main", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.XA_ShellQ_Rows_E_main(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "XA_ShellQ_Rows_E_main");
        }
        if (callFunctionKey.contains("selectRowsByTablePath", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByTablePath(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByTablePath");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfCondition", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfCondition(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfCondition");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfAggregation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfAggregation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfAggregation");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfGetCulumns", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfGetCulumns(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfGetCulumns");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfPLETL", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfPLETL(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfPLETL");
        }
        if (callFunctionKey.contains("selectRowsByAttributesOfPLTCP", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.selectRowsByAttributesOfPLTCP(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "selectRowsByAttributesOfPLTCP");
        }
        if (callFunctionKey.contains("addNewSearchShellTable", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.addNewSearchShellTable(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "addNewSearchShellTable");
        }
        if (callFunctionKey.contains("getNewSearchShellTableSpecFromDefaultTableModel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getNewSearchShellTableSpecFromDefaultTableModel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getNewSearchShellTableSpecFromDefaultTableModel");
        }
        if (callFunctionKey.contains("getNewSearchShellTableDataFromDefaultTableModel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getNewSearchShellTableDataFromDefaultTableModel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getNewSearchShellTableDataFromDefaultTableModel");
        }
        if (callFunctionKey.contains("getNewSearchShellTableRowsFromDefaultTableModel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getNewSearchShellTableRowsFromDefaultTableModel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getNewSearchShellTableRowsFromDefaultTableModel");
        }
        if (callFunctionKey.contains("addNewSearchShellTable", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.addNewSearchShellTable(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "addNewSearchShellTable");
        }
        if (callFunctionKey.contains("addNewSearchShellTableWithObjectData", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.addNewSearchShellTableWithObjectData(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "addNewSearchShellTableWithObjectData");
        }
        if (callFunctionKey.contains("addNewSearchShellTableWithObjectData", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.addNewSearchShellTableWithObjectData(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "addNewSearchShellTableWithObjectData");
        }
        if (callFunctionKey.contains("addNewSearchShellTableWithObjectDataReflectionDBRows", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.addNewSearchShellTableWithObjectDataReflectionDBRows(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "addNewSearchShellTableWithObjectDataReflectionDBRows");
        }
        if (callFunctionKey.contains("addNewSearchShellTableReflectionDBRows", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.addNewSearchShellTableReflectionDBRows(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "addNewSearchShellTableReflectionDBRows");
        }
        if (callFunctionKey.contains("addInitSearchShellTable", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.addInitSearchShellTable(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "addInitSearchShellTable");
        }
        if (callFunctionKey.contains("doNeroFlow", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.doNeroFlow(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "doNeroFlow");
        }
        if (callFunctionKey.contains("ReadChinese", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.ReadChinese(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "ReadChinese");
        }
        if (callFunctionKey.contains("kernel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.kernel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "kernel");
        }
        if (callFunctionKey.contains("getMedicineBookFeedbackZY", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getMedicineBookFeedbackZY(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getMedicineBookFeedbackZY");
        }
        if (callFunctionKey.contains("getMedicineBookFeedbackXY", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getMedicineBookFeedbackXY(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getMedicineBookFeedbackXY");
        }

        if (callFunctionKey.contains("getMedicineBookFeedbackZT", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getMedicineBookFeedbackZT(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getMedicineBookFeedbackZT");
        }
        if (callFunctionKey.contains("getMedicineBookFeedbackXT", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getMedicineBookFeedbackXT(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getMedicineBookFeedbackXT");
        }
        if (callFunctionKey.contains("getMedicineBookFeedbackYT", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getMedicineBookFeedbackYT(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getMedicineBookFeedbackYT");
        }
        if (callFunctionKey.contains("getMedicineBookFeedback", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getMedicineBookFeedback(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getMedicineBookFeedback");
        }
        if (callFunctionKey.contains("doSearch", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.doSearch(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "doSearch");
        }
        if (callFunctionKey.contains("forwardDB", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.forwardDB(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "forwardDB");
        }
        if (callFunctionKey.contains("forwardVPC", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.forwardVPC(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "forwardVPC");
        }
        if (callFunctionKey.contains("forwardVPCBackEnd", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.forwardVPCBackEnd(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "forwardVPCBackEnd");
        }
        if (callFunctionKey.contains("forwardVPCYangliaojing", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.forwardVPCYangliaojing(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "forwardVPCYangliaojing");
        }
        if (callFunctionKey.contains("getCode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getCode(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getCode");
        }
        if (callFunctionKey.contains("getFilePath", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getFilePath(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getFilePath");
        }
        if (callFunctionKey.contains("E_pl_XA", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.E_pl_XA(NE);//later
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "E_pl_XA");
        }
        if (callFunctionKey.contains("E_pl_XA", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.E_pl_XA(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "E_pl_XA");
        }
        if (callFunctionKey.contains("P_AggregationLimitMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_AggregationLimitMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_AggregationLimitMap");
        }
        if (callFunctionKey.contains("P_PletlLimitMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_PletlLimitMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_PletlLimitMap");
        }
        if (callFunctionKey.contains("P_YLJOperation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_YLJOperation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_YLJOperation");
        }
        if (callFunctionKey.contains("P_PltcpLimitMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_PltcpLimitMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_PltcpLimitMap");
        }
        if (callFunctionKey.contains("P_Cache", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_Cache(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_Cache");
        }
        if (callFunctionKey.contains("P_kernel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_kernel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_kernel");
        }
        if (callFunctionKey.contains("P_kernel_search", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_kernel_search(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_kernel_search");
        }
        if (callFunctionKey.contains("rowToRowMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.rowToRowMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "rowToRowMap");
        }
        if (callFunctionKey.contains("rowMapToRow", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.rowMapToRow(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "rowMapToRow");
        }
        if (callFunctionKey.contains("P_Map", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_Map(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_Map");
        }
        if (callFunctionKey.contains("getCulumnsMapWithAs", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getCulumnsMapWithAs(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getCulumnsMapWithAs");
        }
        if (callFunctionKey.contains("getCulumnsMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_VECS_C.getCulumnsMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "getCulumnsMap");
        }
        if (callFunctionKey.contains("P_AndMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_AndMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_AndMap");
        }
        if (callFunctionKey.contains("P_OrMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_OrMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_OrMap");
        }
        if (callFunctionKey.contains("P_SetRoot", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_SetRoot(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_SetRoot");
        }
        if (callFunctionKey.contains("P_BaseName", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_BaseName(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_BaseName");
        }
        if (callFunctionKey.contains("P_TableName", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_TableName(NE);
            }//
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_TableName");//之后map全部走输出缓存模型模式。
        }
        if (callFunctionKey.contains("P_ListNeedStart", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_ListNeedStart(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_ListNeedStart");
        }
        if (callFunctionKey.contains("P_Join", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_Join(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_Join");
        }
        if (callFunctionKey.contains("P_E", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_E(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_E");
        }
        if (callFunctionKey.contains("P_Check", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_Check(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_Check");
        }
        if (callFunctionKey.contains("P_StoreValues", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_StoreValues(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_StoreValues");
        }
        if (callFunctionKey.contains("P_fileOperations", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.P_fileOperations(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "P_fileOperations");
        }
        if (callFunctionKey.contains("replaceString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.replaceString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "replaceString");
        }
        if (callFunctionKey.contains("replaceStringWithMapAndFileName", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.replaceStringWithMapAndFileName(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "replaceStringWithMapAndFileName");
        }
        if (callFunctionKey.contains("start", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.start(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "start");
        }
        if (callFunctionKey.contains("replaceStringWithFileName", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.replaceStringWithFileName(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "replaceStringWithFileName");
        }
        if (callFunctionKey.contains("replaceStringWithFileType", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.replaceStringWithFileType(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "replaceStringWithFileType");
        }
        if (callFunctionKey.contains("replaceStringWithFileSize", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.replaceStringWithFileSize(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "replaceStringWithFileSize");
        }
        if (callFunctionKey.contains("replaceStringWithFileLines", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.replaceStringWithFileLines(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "replaceStringWithFileLines");
        }
        if (callFunctionKey.contains("mainShellReplace", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.mainShellReplace(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "mainShellReplace");
        }
        if (callFunctionKey.contains("replaceStringWithLogRecording", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_VECS_C.replaceStringWithLogRecording(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find")
                , map, "replaceStringWithLogRecording");
        }
    }
}
