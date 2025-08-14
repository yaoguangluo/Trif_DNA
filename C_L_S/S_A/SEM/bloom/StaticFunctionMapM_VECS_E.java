package S_A.SEM.bloom;

import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.IVDTIXQCTIV.LenovoInit;
import A_V.E.RatioMap_E;
import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import C_A.OSI.AOP.MS.VPC.server.VPCSRequest;
import C_A.OSI.AOP.MS.VPC.server.VPCSResponse;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E;
import M_V.ME.E.PLSQLCommand_E_X_P_BaseName;
import M_V.ME.E.PLSQLCommand_E_X_P_Check;
import M_V.ME.E.PLSQLCommand_E_X_P_E;
import M_V.ME.E.PLSQLCommand_E_X_P_Join;
import M_V.ME.E.PLSQLCommand_E_X_P_ListNeedStart;
import M_V.ME.E.PLSQLCommand_E_X_P_SetRoot;
import M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.P_AggregationPLSQL;
import M_V.ME.ConditionPLSQL_.X_Cache;
import M_V.ME.ConditionPLSQL_.X_Kernel;
import M_V.ME.ConditionPLSQL_.X_Map;
import M_V.ME.ConditionPLSQL_.X_Table;
import M_V.ME.GetCulumnsPLSQL.X_P_GetCulumnsMap;
import M_V.ME.GetCulumnsPLSQL.X_getCulumnsMap;
import M_V.ME.GetCulumnsPLSQL.X_getCulumnsMapWithAs;
import M_V.ME.RelationPLSQL_.X_P_AndMap;
import M_V.ME.RelationPLSQL_.X_P_OrMap;
import M_V.ME.word.forest.utils.Util_X_ContainsKey;
import M_V.ME.word.forest.utils.Util_X_prefixWordEqualZero;
import M_V.ME.word.frequency.utils.Util_X_CompareCheck;
import M_V.ME.word.frequency.utils.Util_X_FindCheck;
import M_V.MS.VPC.V.Forward_V;
import M_V.MS.VPC.V.RestMap;
import M_V.MS.VPC.V.RestMap_V;
import M_V.MSD.OP.SM.AOP.MEC.SIQ.SM.OSD.E.D_Rows_E_X_D_RowByAttributesOfCondition;
import M_V.MSD.OP.SM.AOP.MEC.SIQ.SM.OSD.E.D_Rows_E_X_D_RowByTablePathAndIndex;
import M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSI.E.I_Tables_E;
import M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E_X_IU_RowByAttributes;
import M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E_X_IU_RowByBaseName;
import M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E_X_IU_RowByTablePathAndIndex;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.joinRows.Q_JoinRows_E_X_selectRowsByAttributesOfJoinAggregation;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.joinRows.Q_JoinRows_E_X_selectRowsByAttributesOfJoinCondition;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.joinRows.Q_JoinRows_E_X_selectRowsByAttributesOfJoinGetCulumns;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.joinRows.Q_JoinRows_E_X_selectRowsByAttributesOfJoinRelation;
import M_V.MSU.sessionValidation.X_sessionCheck;
import M_V.MSU.sessionValidation.X_sessionCheckWithOrderPDSKey;
import M_V.MSU.sessionValidation.X_sessionCheckWithPostPDSKey;
import M_V.MSU.sessionValidation.X_sessionInitByTokenCertsDNA;
import M_V.MSU.sessionValidation.X_sessionInitByTokenPDICertsDNA;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA_ETL;
import M_V.MSU.sessionValidation.X_sessionTokenUpdateByDNA;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.JoinRows.E.X_U_RowsByAttributesOfJoinAggregation;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.JoinRows.E.X_U_RowsByAttributesOfJoinCondition;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.JoinRows.E.X_U_RowsByAttributesOfJoinGetCulumns;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.JoinRows.E.X_U_RowsByAttributesOfJoinRelation;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowByTablePathAndAttribute;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowByTablePathAndIndex;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowsByAttributesOfAggregation;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowsByAttributesOfCondition;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowsByAttributesOfGetCulumns;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowsByRecordConditions;
import M_V.MSV.OSU.array.ArrayValidation;
import M_V.MSV.OSU.date.DateValidation;
import M_V.MVQ.button.CfxButton;
import M_V.MVQ.label.DetaLabel;
import M_V.MVQ.tableRender.ColorTableRender;
import M_V.MVQ.textpane.CfxTextPane;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_C;
import exception.file.O.DetaBufferedReader;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenCerts;
import org.json.JSONObject;

import java.io.File;
import java.net.Socket;
import java.util.List;
import java.util.Map;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
//包含tinshell 002 的pletl源码, 准备包含shell 正则, 和shell 读档执行
//24组元基花的 dna编码记忆配对遗传 正式 并入《DNA 元基催化与肽计算 第四修订版》本 稍后申请著作权。
public class StaticFunctionMapM_VECS_E implements StaticFunctionMapM_VECS_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    //database
    //static
    //U_JoinRows_E {
    public Object updateRowsByAttributesOfJoinCondition(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        return X_U_RowsByAttributesOfJoinCondition._E(object, mod);
    }

    public Object updateRowsByAttributesOfJoinAggregation(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        return X_U_RowsByAttributesOfJoinAggregation._E(object, mod);
    }

    public Object updateRowsByAttributesOfJoinGetCulumns(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        return X_U_RowsByAttributesOfJoinGetCulumns._E(object);
    }

    public Object updateRowsByAttributesOfJoinRelation(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        return X_U_RowsByAttributesOfJoinRelation._E(object, mod);
    }

    //Q_JoinRows_E {
    public Object selectRowsByAttributesOfJoinCondition(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        return Q_JoinRows_E_X_selectRowsByAttributesOfJoinCondition._E(object);
    }

    public Object selectRowsByAttributesOfJoinAggregation(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        return Q_JoinRows_E_X_selectRowsByAttributesOfJoinAggregation._E(object);
    }

    public Object selectRowsByAttributesOfJoinGetCulumns(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        return Q_JoinRows_E_X_selectRowsByAttributesOfJoinGetCulumns._E(object);
    }

    public Object selectRowsByAttributesOfJoinRelation(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        return Q_JoinRows_E_X_selectRowsByAttributesOfJoinRelation._E(object);
    }

    //IU_Rows_E {
    public IMV_SIQ insertRowByTablePathAndIndex(App NE){
        AES_QMS_XSD_TIH tablePath = NE._I_U.tablePath;
        AES_QMS_XSD_TIH pageIndex = NE._I_U.pageIndex;
        JSONObject culumnOfNewRow = NE._I_U.culumnOfNewRow;
        return IU_Rows_E_X_IU_RowByTablePathAndIndex
            .insertRowByTablePathAndIndex(tablePath._S_, pageIndex._S_, culumnOfNewRow);
    }

    public IMV_SIQ insertRowByBaseName(App NE){
        AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        JSONObject jsobj = NE._I_U.jsobj;//later do idu
        if (null == tableName || null == tableName) {
            return new IMV_SIQ();
        }
        boolean mod = NE._I_U.mod;
        return IU_Rows_E_X_IU_RowByBaseName.insertRowByBaseName(baseName._S_
            , tableName._S_, jsobj, mod);
    }

    public void IU_RowByAttributes(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        IU_Rows_E_X_IU_RowByAttributes.IU_RowByAttributes(object, mod);
        return;
    }

    //I_Tables_E {
    public void I_Table(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        I_Tables_E.I_Table(object, mod);
    }

    //D_Rows_E {
    public IMV_SIQ deleteRowByTablePathAndIndex(App NE){
        AES_QMS_XSD_TIH tablePath = NE._I_U.tablePath;
        AES_QMS_XSD_TIH pageIndex = NE._I_U.pageIndex;
        boolean mod = NE._I_U.mod;
        return D_Rows_E_X_D_RowByTablePathAndIndex._E(tablePath._S_, pageIndex._S_, mod);
    }

    public void D_RowByAttributesOfCondition(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        D_Rows_E_X_D_RowByAttributesOfCondition._E(object, mod);
    }


    //U_Rows_E {
    public IMV_SIQ updateRowByTablePathAndIndex(App NE){
        AES_QMS_XSD_TIH tablePath = NE._I_U.tablePath;
        AES_QMS_XSD_TIH pageIndex = NE._I_U.pageIndex;
        JSONObject jaculumnOfUpdateRow = NE._I_U.jaculumnOfUpdateRow;
        return X_U_RowByTablePathAndIndex._E(tablePath._S_, pageIndex._S_
            , jaculumnOfUpdateRow);
    }

    public IMV_SIQ updateRowByTablePathAndAttribute(App NE){
        AES_QMS_XSD_TIH tablePath = NE._I_U.tablePath;
        AES_QMS_XSD_TIH culumnName = NE._I_U.culmnName;
        AES_QMS_XSD_TIH culumnValue = NE._I_U.culumnValue;
        JSONObject jobj = NE._I_U.jsobj;
        return X_U_RowByTablePathAndAttribute._E(tablePath._S_, culumnName._S_
            , culumnValue._S_, jobj);
    }

    public Object updateRowsByRecordConditions(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        return X_U_RowsByRecordConditions._E(object, mod);
    }

    public Object updateRowsByAttributesOfCondition(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        return X_U_RowsByAttributesOfCondition._E(object, mod);
    }

    public List<IMV_SIQ> updateRowsByAttributesOfAggregation(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        return X_U_RowsByAttributesOfAggregation._E(object, mod);
    }

    public Object updateRowsByAttributesOfGetCulumns(App NE){
        IMV_SIQ object = NE._I_U.outputMap;
        return X_U_RowsByAttributesOfGetCulumns._E(object);
    }

    //E_PLSQL_E {
    public IMV_SIQ E_PLSQL(App NE){
        AES_QMS_XSD_TIH plsql = NE._I_U.plsql;
        boolean mod = NE._I_U.mod;
        return E_PLSQL_E.E_PLSQL(plsql._S_, mod);
    }

    public IMV_SIQ E_PLORM(App NE){
        PLORM_C orm = NE._I_U.orm;
        boolean b = NE._I_U.b;
        return E_PLSQL_E.E_PLORM(orm, b);
    }

    //P_AggregationPLSQL {
    public void P_AggregationLimitMap(App NE){
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        P_AggregationPLSQL.P_AggregationLimitMap(sets, output);
    }

    //P_ConditionPLSQL_X_Cache extends P_ConditionPLSQL_XCDX {
    public void P_Cache(App NE){
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        AES_QMS_XSD_TIH tableName = NE._I_U.tableName;
        AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
        IMV_SIQ object = NE._I_U.outputMap;
        if (null == tableName || null == tableName) {
            return;
        }
        X_Cache.P_Cache(sets, output, tableName._S_, baseName._S_, object);
    }

    //P_ConditionPLSQL_X_Kernel extends P_ConditionPLSQL_XCDX {
    //比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
    //这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后,
    //我先调通下, 之后朔源.
    //准备验算下20210406 罗瑶光
    public void P_kernel(App NE){
        AES_QMS_XSD_TIH temp = NE._I_U.temp;
        File readDBTableRowIndexCulumnFile = NE._I_U.readDBTableRowIndexCulumnFile;
        File readDBTableRowIndexFile = NE._I_U.readDBTableRowIndexFile;
        DetaBufferedReader reader = NE._I_U.reader;
        AES_QMS_XSD_TIH DBTableRowIndexPath = NE._I_U.DBTableRowIndexPath;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        Row bufferRow = NE._I_U.bufferRow;
        IMV_SIQ rowMap = NE._I_U.rowMap;

        X_Kernel.P_kernel(
            readDBTableRowIndexFile,
            output, bufferRow, rowMap);
    }

    //P_ConditionPLSQL_X_Map extends P_ConditionPLSQL_XCDX {
    //以后优化成统一对象输出, 不需要再转换。2019-1-15 tin
    public IMV_SIQ rowToRowMap(App NE){
        Row row = NE._I_U.row;
        return X_Map.rowToRowMap(row);
    }

    public void P_Map(App NE){
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        AES_QMS_XSD_TIH dBTablePath = NE._I_U.dBTablePath;
        X_Map.P_Map(sets, output, dBTablePath._S_);
    }

    //P_ConditionPLSQL_X_Table extends P_ConditionPLSQL_XCDX {
    //plsql引擎函数获取表开始检查 罗瑶光 20210405  //奇怪了 这是一个没有读 缓存的plsql引擎
    //, 我准备对比下history
    //object 指令堆栈
    //output 数据行
    public void P_Table(App NE){
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> output = NE._I_U.outputMapList;
        AES_QMS_XSD_TIH DBTablePath = NE._I_U.dBTablePath;
        IMV_SIQ object = NE._I_U.outputMap;
        if (null == DBTablePath) {
            return;//later do a anormalization
        }
        X_Table.P_Table(sets, output, DBTablePath._S_, object);
    }

    //P_GetCulumnsPLSQL {
    public Object getCulumnsMapWithAs(App NE){
        String[] sets = NE._I_U.sets;
        IMV_SIQ row = NE._I_U.rowMap;
        return X_getCulumnsMapWithAs._E(sets, row);
    }

    public Object getCulumnsMap(App NE){
        String[] sets = NE._I_U.sets;
        IMV_SIQ row = NE._I_U.rowMap;
        return X_getCulumnsMap._E(sets, row);
    }

    public Object P_GetCulumnsMap(App NE){
        List<IMV_SIQ> obj = NE._I_U.obj;
        String[] getCulumnsValueArray = NE._I_U.getCulumnsValueArray;
        return X_P_GetCulumnsMap._E(obj, getCulumnsValueArray);
    }

    //P_RelationPLSQL {
    public void P_AndMap(App NE){
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> obj = NE._I_U.obj;
        List<IMV_SIQ> joinObj = NE._I_U.joinObj;
        IMV_SIQ object = NE._I_U.outputMap;
        List<IMV_SIQ> newObj = NE._I_U.newObj;
        X_P_AndMap._E(sets, obj, joinObj, object, newObj);
    }

    public void P_OrMap(App NE){
        String[] sets = NE._I_U.sets;
        List<IMV_SIQ> obj = NE._I_U.obj;
        List<IMV_SIQ> joinObj = NE._I_U.joinObj;
        IMV_SIQ object = NE._I_U.outputMap;
        List<IMV_SIQ> newObj = NE._I_U.newObj;
        Map<String, Boolean> findinNewObj = NE._I_U.findinNewObj;
        X_P_OrMap._E(sets, obj, joinObj, object, newObj, findinNewObj);
    }

    //PLSQLCommand_E {
    public void P_SetRoot(App NE){
        String[] acknowledge = NE._I_U.acknowledge;
        IMV_SIQ output = NE._I_U.outputMap;
        PLSQLCommand_E_X_P_SetRoot._E(acknowledge);
    }

    public void P_BaseName(App NE){
        String[] acknowledge = NE._I_U.acknowledge;
        IMV_SIQ object = NE._I_U.outputMap;
        PLSQLCommand_E_X_P_BaseName._E(acknowledge, object);
    }

//    public void P_TableName(App NE){
//        String[] acknowledge = NE._I_U.acknowledge;
//        IMV_SIQ object = NE._I_U.outputMap;
//        PLSQLCommand_E_X_P_TableName._E(acknowledge, object);
//    }

    public void P_ListNeedStart(App NE){
        String[] acknowledge = NE._I_U.acknowledge;
        IMV_SIQ object = NE._I_U.outputMap;
        PLSQLCommand_E_X_P_ListNeedStart._E(acknowledge, object);
    }

    public void P_Join(App NE){
        String[] acknowledge = NE._I_U.acknowledge;
        IMV_SIQ object = NE._I_U.outputMap;
        PLSQLCommand_E_X_P_Join._E(acknowledge, object);
    }

    public void P_E(App NE){
        String[] acknowledge = NE._I_U.acknowledge;
        TinMap object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        PLSQLCommand_E_X_P_E._E(acknowledge, object, mod);
    }

    //plsql函数执行指令 正在检查中 罗瑶光 20210405
    public void P_Check(App NE){
        AES_QMS_XSD_TIH acknowledgeString = NE._I_U.acknowledgeString;
        TinMap object = NE._I_U.outputMap;
        boolean mod = NE._I_U.mod;
        PLSQLCommand_E_X_P_Check._E(acknowledgeString._S_, object, mod);
    }

    //WordForestUtil {
    public void wordsForestNotContainsKey(App NE){
        IMV_SIQ_SS outputList = NE._I_U.outputList;
        AES_QMS_XSD_TIH countWordNode = NE._I_U.countWordNode;
        StringBuilder[] prefixWord = NE._I_U.prefixWord;
        int charPosition = NE._I_U.parserCharPosition;
        Util_X_ContainsKey.not_E(outputList, countWordNode._S_, prefixWord, NE);
    }

    public void prefixWordEqualZero(App NE){
        IMV_SIQ_SS outputList = NE._I_U.outputList;
        AES_QMS_XSD_TIH countWordNode = NE._I_U.countWordNode;
        StringBuilder[] prefixWord = NE._I_U.prefixWord;
        Util_X_prefixWordEqualZero._E(outputList, countWordNode._S_, prefixWord, NE);
    }

    public void wordsForestContainsKey(App NE){
        IMV_SIQ_SS outputList = NE._I_U.outputList;
        AES_QMS_XSD_TIH countWordNode = NE._I_U.countWordNode;
        StringBuilder[] prefixWord = NE._I_U.prefixWord;
        Util_X_ContainsKey._E(outputList, countWordNode._S_, prefixWord, NE);
    }

    //WordFrequencyUtil {
    public void WordFrequencyFindCheck(App NE){
        IMV_SIQ_SS outputList = NE._I_U.outputList;
        StringBuilder[] fixWords = NE._I_U.fixWords;
        Util_X_FindCheck._E(outputList, fixWords, NE);
    }

    public void WordFrequencyCompareCheck(App NE){
        IMV_SIQ_SS outputList = NE._I_U.outputList;
        StringBuilder[] fixWords = NE._I_U.fixWords;
        AES_QMS_XSD_TIH countWordNode = NE._I_U.countWordNode;
        Util_X_CompareCheck._E(outputList, fixWords, countWordNode._S_, NE);
    }

    //SessionValidation{
    //序列检查, 用于并发条件下又没有缓存服务器额情况下.
    //用户注意, FullDNATokenPDI 是我目的用来做DNA搜索的, 在dna加密这里也可以用, 但是, 如果要用
    //, 请谨慎修改.
    public boolean sessionCheck(App NE){
        Token token = NE._I_U.token;
        TokenCerts tokenCerts = NE._I_U.tokenCerts;
        return X_sessionCheck._E(token, tokenCerts);
    }

    //序列使用一次便更新重置
    public Token sessionTokenUpdateByDNA(App NE){
        AES_QMS_XSD_TIH password = NE._I_U.password;
        return X_sessionTokenUpdateByDNA._E(password._S_);
    }

    //序列初始生成
    //可以将密码和时间都加载在这个humanWordsPassword中, 这样时间就不需要比对了.
    //我建议是码农别偷懒.
    public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(App NE){
        AES_QMS_XSD_TIH humanWordsPassword = NE._I_U.humanWordsPassword;
        boolean bys = NE._I_U.bys;
        AES_QMS_XSD_TIH lockBys = NE._I_U.lockBys;
        return X_sessionTokenCertsInitWithHumanWordsByDNA._E(humanWordsPassword._S_
            , bys, lockBys._S_);
    }

    //区别上面非etl, 稍后去重 罗瑶光20211107 用到initonETLSect;
    public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA_ETL(App NE){
        AES_QMS_XSD_TIH humanWordsPassword = NE._I_U.humanWordsPassword;
        boolean bys = NE._I_U.bys;
        AES_QMS_XSD_TIH lockBys = NE._I_U.lockBys;
        return X_sessionTokenCertsInitWithHumanWordsByDNA_ETL
            ._E(humanWordsPassword._S_, bys, lockBys._S_);
    }

    //序列PDI初始生成走非Util函数
    public Token sessionInitByTokenPDICertsDNA(App NE){
        TokenCerts tokenCerts = NE._I_U.tokenCerts;
        return X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
    }

    //序列初始生成
    public Token sessionInitByTokenCertsDNA(App NE){
        TokenCerts tokenCerts = NE._I_U.tokenCerts;
        return X_sessionInitByTokenCertsDNA._E(tokenCerts);
    }

    //序列 正序密文检查
    public boolean sessionCheckWithOrderPDSKey(App NE){
        Token token = NE._I_U.token;
        TokenCerts tokenCerts = NE._I_U.tokenCerts;
        return X_sessionCheckWithOrderPDSKey._E(token, tokenCerts);
    }

    //序列 反序密文检查
    public boolean sessionCheckWithPostPDSKey(App NE){
        Token token = NE._I_U.token;
        TokenCerts tokenCerts = NE._I_U.tokenCerts;
        return X_sessionCheckWithPostPDSKey._E(token, tokenCerts);
    }

    //ArrayValidation{
    //以后 validation大体包括 check和fix, 2个部分。
    public boolean arrayIntCheck(App NE){
        int[] array = NE._I_U.array;
        int min = NE._I_U.min;
        int max = NE._I_U.max;
        return ArrayValidation.arrayIntCheck(array, min, max);
    }

    public int[] arrayIntFix(App NE){
        int[] array = NE._I_U.array;
        int min = NE._I_U.min;
        int max = NE._I_U.max;
        return ArrayValidation.arrayIntFix(array, min, max);
    }

    public boolean arrayLongCheck(App NE){
        long[] array = NE._I_U.arrayLong;
        int min = NE._I_U.min;
        int max = NE._I_U.max;
        return ArrayValidation.arrayLongCheck(array, min, max);
    }

    public long[] arrayLongFix(App NE){
        long[] array = NE._I_U.arrayLong;
        int min = NE._I_U.min;
        int max = NE._I_U.max;
        return ArrayValidation.arrayLongFix(array, min, max);
    }

    public boolean arrayDoubleCheck(App NE){
        double[] array = NE._I_U.arrayDouble;
        double min = NE._I_U.minDouble;
        double max = NE._I_U.maxDouble;
        return ArrayValidation.arrayDoubleCheck(array, min, max);
    }

    public double[] arrayDoubleFix(App NE){
        double[] array = NE._I_U.arrayDouble;
        double min = NE._I_U.minDouble;
        double max = NE._I_U.maxDouble;
        return ArrayValidation.arrayDoubleFix(array, min, max);
    }

    public boolean arrayFloatCheck(App NE){
        float[] array = NE._I_U.arrayF;
        float min = NE._I_U.minFloat;
        float max = NE._I_U.maxFloat;
        return ArrayValidation.arrayFloatCheck(array, min, max);
    }

    public float[] arrayFloatFix(App NE){
        float[] array = NE._I_U.arrayF;
        float min = NE._I_U.minFloat;
        float max = NE._I_U.maxFloat;
        return ArrayValidation.arrayFloatFix(array, min, max);
    }

    //DateValidation{
    public boolean currentSystemTimeCheck(App NE){
        long offsetUTC8 = NE._I_U.offsetUTC8;
        long miliSecondsDistinction = NE._I_U.miliSecondsDistinction;
        return DateValidation.currentSystemTimeCheck(offsetUTC8
            , miliSecondsDistinction);
    }

    public long currentSystemTimeToUTC(App NE){
        long offsetUTC8 = NE._I_U.offsetUTC8;
        return DateValidation.currentSystemTimeToUTC(offsetUTC8);
    }

    //Translator
    //public Translator getTranslator(){
    //	return null;
    //}

    //ListValidation{
    public boolean ListSetsCheck(App NE){
        return false;
    }

    public List<Object> ListSetsFix(App NE){
        return null;
    }

    //MatrixValidation{
    public boolean matrixCheck(App NE){
        return false;
    }

    public Object[][] matrixFix(App NE){
        return null;
    }

    //NullObject{
    public String checkNULL(App NE){
        return null;
    }

    public CfxButton getCfxButton(App NE){
        AES_QMS_XSD_TIH string = NE._I_U.string;
        int x = NE._I_U.x;
        int y = NE._I_U.y;
        java.awt.Color c = NE._I_U.c;
        return new CfxButton(string._S_, x, y, c);
    }

    //今天描述下这个文件, 早期张鑫杰给我一个csharp的按钮边框闪烁波纹, 我在美国被 卡拉森让牛怡然
    //给我把联想电脑格了, 我在2014年设计etl的 分割按钮界面的时候
    //谷歌搜索的stackoverflow 有 甲骨文sun的官方 demo怎么设计 动态画组件。
    //于是我设计了最早的detasplit 组件, 那时候我肋感神经剧烈疼痛, 搞了2个月就停止了
    //一停止我就不痛了, 莫名前妻那时候让我去波音面试还//后来在画板中画节点的边缘画了比较丑的边缘。
    //, 后来2016-7年之后我开始设计这个组件。, 最后一次和张鑫杰说话是2014年skype qq
    //最后一次 见 章鑫杰是 2010年3月
    //一次我问 在国内普通ip怎么发布网站, 他回我一句 花生壳, 就把我给删了。
    public M_V.MVQ.button.DetaButton DetaButton(App NE){
        AES_QMS_XSD_TIH string = NE._I_U.string;
        int x = NE._I_U.x;
        int y = NE._I_U.y;
        java.awt.Color c = NE._I_U.c;
        return new M_V.MVQ.button.DetaButton(string._S_, x, y, c);
    }

//    public M_V.MVQ.button.DetaButton DetaButton(App NE){
//        return new M_V.MVQ.button.DetaButton(NE._I_U.string);
//    }

    public M_V.MVQ.button.YLJShowButton YLJShowButton(App NE){
        AES_QMS_XSD_TIH string = NE._I_U.string;
        int x = NE._I_U.x;
        int y = NE._I_U.y;
        java.awt.Color c = NE._I_U.c;
        return new M_V.MVQ.button.YLJShowButton(string._S_, x, y, c);
    }

    //DetaIndexLabel extends JLabel implements MouseListener{
    public M_V.MVQ.label.DetaIndexLabel DetaIndexLabel(App NE){
        AES_QMS_XSD_TIH name = NE._I_U.name;
        List<DetaLabel> jFrameList = NE._I_U.jFrameList;
        return new M_V.MVQ.label.DetaIndexLabel(name._S_, jFrameList);
    }
    //DetaLabel extends JLabel{

    public M_V.MVQ.label.DetaLabel DetaLabel(App NE){
        AES_QMS_XSD_TIH name = NE._I_U.name;
        return new M_V.MVQ.label.DetaLabel(name._S_);
    }

    //DetaSlider extends JSlider{
    public M_V.MVQ.slider.DetaSlider DetaSlider(App NE){
        int x = NE._I_U.x;
        int y = NE._I_U.y;
        return new M_V.MVQ.slider.DetaSlider(x, y);
    }

    //MVQ.tabbedpane
    public M_V.MVQ.tabbedpane.DetabbedPane DetabbedPane(App NE){
        int x = NE._I_U.x;
        int y = NE._I_U.y;
        java.awt.Color c = NE._I_U.c;
        return new M_V.MVQ.tabbedpane.DetabbedPane(x, y, c, NE);
    }

    //ColorTableRender
    public ColorTableRender getColorTableRender(App NE){
        return new ColorTableRender(NE);
    }

    //CfxTextArea extends JTextArea {
    public M_V.MVQ.textarea.CfxTextArea CfxTextArea(App NE){
        AES_QMS_XSD_TIH string = NE._I_U.string;
        int x = NE._I_U.x;
        int y = NE._I_U.y;
        java.awt.Color c = NE._I_U.c;
        return new M_V.MVQ.textarea.CfxTextArea(string._S_, x, y, c);
    }

    //MVQ.textfield;
    public M_V.MVQ.textfield.CfxTextField CfxTextField(App NE){
        return new M_V.MVQ.textfield.CfxTextField(NE._I_U.string._S_
            , NE._I_U.x, NE._I_U.y, NE._I_U.c);
    }

    //MVQ.textpane;
    public CfxTextPane CfxTextPane(App NE){
        return new M_V.MVQ.textpane.CfxTextPane(NE._I_U.string._S_
            , NE._I_U.x, NE._I_U.y, NE._I_U.c);
    }

    //vpcs
    //Forward_V extends ServerForward_Standard{
    public void forwardToRestMap(App NE){
        App app = NE._I_U.app;
        VPCSRequest vPCSRequest = NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse = NE._I_U.vPCSResponse;
        Forward_V.forwardToRestMap(app.app_S, vPCSRequest, vPCSResponse);
    }

    //RestMap_V extends ServerRestMap_Standard {
    public void P_Rest(App NE){
        App app = NE._I_U.app;
        VPCSRequest vPCSRequest = NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse = NE._I_U.vPCSResponse;
        RestMap_V.P_Rest(app.app_S, vPCSRequest, vPCSResponse);
    }

    public void P_RestDB(App NE){
        App app = NE._I_U.app;
        VPCSRequest vPCSRequest = NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse = NE._I_U.vPCSResponse;
        RestMap_V.P_RestDB(app.app_S, vPCSRequest, vPCSResponse);
    }

    //RestMap extends ServerForward_Standard{
    public void P(App NE){
        String[] type = NE._I_U.typeA;
        Socket socket = NE._I_U.socket;
        CogsBinaryForest_AE _AE = NE._I_U._AE;
        EmotionMap emotionMap = NE._I_U.emotionMap;
        RatioMap_E ratioMap_E = NE._I_U.ratioMap_E;
        EmotionInit emotionInit = NE._I_U.emotionInit;
        EnvironmentInit environmentInit = NE._I_U.environmentInit;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        LenovoInit lenovoInit = NE._I_U.lenovoInit;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        SensingTest sensingTest = NE._I_U.sensingTest;
        RNN_IDETest rNN_IDETest = NE._I_U.rNN_IDETest;
        SensingMap_E sensingMap_E = NE._I_U.sensingMap_E;
        if (null == type) {
            return;
        }
        RestMap.P(type, socket, NE);
    }
    //un static
}
