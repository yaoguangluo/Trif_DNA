package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import M_V.MVQ.button.CfxButton;
import M_V.MVQ.tableRender.ColorTableRender;
import M_V.MVQ.textpane.CfxTextPane;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenCerts;

import java.util.List;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public interface StaticFunctionMapM_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    //database
    //static
    //U_JoinRows_E {
    public Object updateRowsByAttributesOfJoinCondition(App NE);

    public Object updateRowsByAttributesOfJoinAggregation(App NE);

    public Object updateRowsByAttributesOfJoinGetCulumns(App NE);

    public Object updateRowsByAttributesOfJoinRelation(App NE);

    //Q_JoinRows_E {
    public Object selectRowsByAttributesOfJoinCondition(App NE);

    public Object selectRowsByAttributesOfJoinAggregation(App NE);

    public Object selectRowsByAttributesOfJoinGetCulumns(App NE);

    public Object selectRowsByAttributesOfJoinRelation(App NE);

    //IU_Rows_E {
    public IMV_SIQ insertRowByTablePathAndIndex(App NE);

    public IMV_SIQ insertRowByBaseName(App NE);

    public void IU_RowByAttributes(App NE);

    //I_Tables_E {
    public void I_Table(App NE);

    //D_Rows_E {
    public IMV_SIQ deleteRowByTablePathAndIndex(App NE);

    public void D_RowByAttributesOfCondition(App NE);


    //U_Rows_E {
    public IMV_SIQ updateRowByTablePathAndIndex(App NE);

    public IMV_SIQ updateRowByTablePathAndAttribute(App NE);

    public Object updateRowsByRecordConditions(App NE);

    public Object updateRowsByAttributesOfCondition(App NE);

    public List<IMV_SIQ> updateRowsByAttributesOfAggregation(App NE);

    public Object updateRowsByAttributesOfGetCulumns(App NE);

    //E_PLSQL_E {
    public IMV_SIQ E_PLSQL(App NE);

    public IMV_SIQ E_PLORM(App NE);

    //P_AggregationPLSQL {
    public void P_AggregationLimitMap(App NE);

    //P_ConditionPLSQL_X_Cache extends P_ConditionPLSQL_XCDX {
    public void P_Cache(App NE);

    //P_ConditionPLSQL_X_Kernel extends P_ConditionPLSQL_XCDX {
    //比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
    //这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后,
    //我先调通下, 之后朔源.
    //准备验算下20210406 罗瑶光
    public void P_kernel(App NE);

    //P_ConditionPLSQL_X_Map extends P_ConditionPLSQL_XCDX {
    //以后优化成统一对象输出, 不需要再转换。2019-1-15 tin
    public IMV_SIQ rowToRowMap(App NE);

    public void P_Map(App NE);

    //P_ConditionPLSQL_X_Table extends P_ConditionPLSQL_XCDX {
    //plsql引擎函数获取表开始检查 罗瑶光 20210405  //奇怪了 这是一个没有读 缓存的plsql引擎
    //, 我准备对比下history
    //object 指令堆栈
    //output 数据行
    public void P_Table(App NE);

    //P_GetCulumnsPLSQL {
    public Object getCulumnsMapWithAs(App NE);

    public Object getCulumnsMap(App NE);

    public Object P_GetCulumnsMap(App NE);

    //P_RelationPLSQL {
    public void P_AndMap(App NE);

    public void P_OrMap(App NE);

    //PLSQLCommand_E {
    public void P_SetRoot(App NE);

    public void P_BaseName(App NE);

    //public void P_TableName(App NE);

    public void P_ListNeedStart(App NE);

    public void P_Join(App NE);

    public void P_E(App NE);

    //plsql函数执行指令 正在检查中 罗瑶光 20210405
    public void P_Check(App NE);

    //WordForestUtil {
    public void wordsForestNotContainsKey(App NE);

    public void prefixWordEqualZero(App NE);

    public void wordsForestContainsKey(App NE);

    //WordFrequencyUtil {
    public void WordFrequencyFindCheck(App NE);

    public void WordFrequencyCompareCheck(App NE);

    //SessionValidation{
    //序列检查, 用于并发条件下又没有缓存服务器额情况下.
    //用户注意, FullDNATokenPDI 是我目的用来做DNA搜索的, 在dna加密这里也可以用, 但是, 如果要用
    //, 请谨慎修改.
    public boolean sessionCheck(App NE);

    //序列使用一次便更新重置
    public Token sessionTokenUpdateByDNA(App NE);

    //序列初始生成
    //可以将密码和时间都加载在这个humanWordsPassword中, 这样时间就不需要比对了.
    public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(App NE);

    //区别上面非etl, 稍后去重 罗瑶光20211107 用到initonETLSect;
    public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA_ETL(App NE);

    //序列PDI初始生成走非Util函数
    public Token sessionInitByTokenPDICertsDNA(App NE);

    //序列初始生成
    public Token sessionInitByTokenCertsDNA(App NE);

    //序列 正序密文检查
    public boolean sessionCheckWithOrderPDSKey(App NE);

    //序列 反序密文检查
    public boolean sessionCheckWithPostPDSKey(App NE);

    //ArrayValidation{
    //以后 validation大体包括 check和fix, 2个部分。
    public boolean arrayIntCheck(App NE);

    public int[] arrayIntFix(App NE);

    public boolean arrayLongCheck(App NE);

    public long[] arrayLongFix(App NE);

    public boolean arrayDoubleCheck(App NE);

    public double[]  arrayDoubleFix(App NE);

    public boolean arrayFloatCheck(App NE);

    public float[] arrayFloatFix(App NE);

    //DateValidation{
    public boolean currentSystemTimeCheck(App NE);

    public long currentSystemTimeToUTC(App NE);

    //Translator
    //public Translator getTranslator(){
    //	return null;
    //}

    //ListValidation{
    public boolean ListSetsCheck(App NE);

    public List<Object> ListSetsFix(App NE);

    //MatrixValidation{
    public boolean matrixCheck(App NE);

    public Object[][] matrixFix(App NE);

    //NullObject{
    public String checkNULL(App NE);

    public CfxButton getCfxButton(App NE);

    public M_V.MVQ.button.DetaButton DetaButton(App NE);

    //public M_V.MVQ.button.DetaButton DetaButton(App NE);

    public M_V.MVQ.button.YLJShowButton YLJShowButton(App NE);

    //DetaIndexLabel extends JLabel implements MouseListener{
    public M_V.MVQ.label.DetaIndexLabel DetaIndexLabel(App NE);
    //DetaLabel extends JLabel{

    public M_V.MVQ.label.DetaLabel DetaLabel(App NE);

    //DetaSlider extends JSlider{
    public M_V.MVQ.slider.DetaSlider DetaSlider(App NE);

    //MVQ.tabbedpane
    public M_V.MVQ.tabbedpane.DetabbedPane DetabbedPane(App NE);

    //ColorTableRender
    public ColorTableRender getColorTableRender(App NE);

    //CfxTextArea extends JTextArea {
    public M_V.MVQ.textarea.CfxTextArea CfxTextArea(App NE);


    //MVQ.textfield;
    public M_V.MVQ.textfield.CfxTextField CfxTextField(App NE);

    //MVQ.textpane;
    public CfxTextPane CfxTextPane(App NE);

    //vpcs
    //Forward_V extends ServerForward_Standard{
    public void forwardToRestMap(App NE);

    //RestMap_V extends ServerRestMap_Standard {
    public void P_Rest(App NE);

    public void P_RestDB(App NE);

    //RestMap extends ServerForward_Standard{
    public void P(App NE);
    //un static
}
