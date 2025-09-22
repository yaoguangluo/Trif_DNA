package O_V.OSA.shell;

import java.io.IOException;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public interface PL_XA_C {
    public String getPLSearch();

    public void I_PLSearch(String pLSearch);

    public PL_XA_C withTableCreate(String tableName);

    public PL_XA_C withTableDelete(String tableName);

    public PL_XA_C withTableInsert(String tableName);

    public PL_XA_C withTableUpdate(String tableName);

    public PL_XA_C withTableSelect(String tableName);

    public PL_XA_C getCulumns();

    public PL_XA_C startAtRootDir(String rootAddress);

    public PL_XA_C withBaseName(String baseName);

    public PL_XA_C withCondition(String conditionType);

    public PL_XA_C let(String leftSet);

    public PL_XA_C lessThanAndEqualTo(String compareSet);

    public PL_XA_C equalTo(String compareSet);

    public PL_XA_C lessThan(String compareSet);

    public PL_XA_C greatThan(String compareSet);

    public PL_XA_C greatThanAndEqualTo(String compareSet);

    public PL_XA_C notEqualTo(String compareSet);

    public PL_XA_C in(String compareSet);

    public PL_XA_C notIn(String compareSet);

    public PL_XA_C equals(String compareSet);

    public PL_XA_C notEquals(String compareSet);

    public PL_XA_C innerJoinWithTable(String baseName, String tableName);

    public PL_XA_C withRelation(String relationType);

    public PL_XA_C as(String compareSet);

    public PL_XA_C upTo(String compareSet);

    public PL_XA_C withAggregation(String aggregationType);

    public PL_XA_C changeCulumnName(String newCulumnName, String oldCulumnName);

    public PL_XA_C withCulumnName(String culumnName, String dataType);

    public PL_XA_C withCulumnValue(String culumnName, String culumnValue);

    public PL_XA_C checkErrors(String string);

    public PL_XA_C fixErrors(String string);

    public PL_XA_C finalE(boolean b, App NE) throws InterruptedException, IOException;

    public IMV_SIQ returnAsMap();

    public PL_XA_C checkAndFixPlSearchGrammarErrors();

    public PL_XA_C checkAndFixSystemEnvironmentErrors();

    public PL_XA_C withTableDrop(String tabKey);

    ////根据tinshell002 文档的中文语法关键字 将PLORM 也中文化
    //全部用拼音，先 之后矫正再 中文
    public PL_XA_C ways(String ways);

    public PL_XA_C conditions(String conditions);

    public PL_XA_C colorTags(String yanSeLeiXing);

    public PL_XA_C parsering(String luoJiLeiXing);

    public PL_XA_C SortingString(String paiXuLeiXing);

    public PL_XA_C scaleSearching(String searchContent);

    public PL_XA_C execPLETL(String jieDianMing);

    public PL_XA_C execPLTCP(String biaoLieMing);

    public PL_XA_C tableConjunction(String zhiXingLuoJi);

    public PL_XA_C tableCombination(String zhiXingLuoJi);

    public PL_XA_C tableDelete(String zhiXingLuoJi);

    public PL_XA_C webRequest(String duanKouHao);

    public PL_XA_C getCulumnName(String lieBiaoMing);
    //。。。。
    //。。
    //。。。
    //。

    //目前用不到PLORM, 优先级稍后, 先继续设计更多 TINSHELL 命令

    //	操作
    //	条件为
    //	获取表名
    //	获取列名
    //	进行分词
    //	词性标注
    //	词性显色
    //	DNN
    //	颜色标记为
    //	红色
    //	蓝色
    //	黄色
    //	绿色
    //	进行字符排序
    //	进行数字排序
    //	从小到大
    //	从大到小
    //	行至
    //	包含
    //	改名为
    //	过滤掉
    //	不包含
    //	进行选择
    //	jingDuSouSuo
    //	PLETL
    //	中节点
    //	进行表格相交
    //	进行表格合并
    //	进行表格剔除
    //	主码为
    //	ID
    //	模式为
    //	相交部分剔除
    //	新增列
    //	叠加列
    //	有交集叠加列
    //	有交集新增列
    //	无交集新增列
    //	其他非中文命令见 德塔PLSQL 文档
    //	PLTCP
    //	进行WEB 请求
    //	接口为
    //	端口为
    //	操作为
}
