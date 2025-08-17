package test.java.InterfaceTest.tinShell;

import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;
import test.java.InterfaceTest.chineseParser.DemoPOSTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class FlowerTalkEncodingTest {

    @Test
    void searchFromTable() {
    }

    @Test
    void searchFromTablewithScale() {
    }

    /*
     * 这是一个 DNN分词进行POS核心词汇搭配来加速语义命令分析 逻辑，测试main函数demo的test版本，
     * 在真实的场景下将人类语言和文字tin shell脚本进行-动名--名动-按德塔分词后词汇搭配模型之间的距离来
     * 德塔排序生成笛卡尔命令组输出，方便最快最优 的笛卡尔遍历加速。主要用于花语TVM指令集有效快速构建
     * 可以设计精度下限来DNN处理巨大的文字文本来做函数匹配加速。
     * --罗瑶光
     * */
    @Test
    void main() throws InterruptedException {
        //启动测试开始
        //配置系统支持
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //词性初始化
        IMV_SIQ pos = commonTestInition.NE.app_S._A.getPosCnToCn();
        //init test
        //输入一句话 如tinshell这个String变量
        String tinshell = ("首先获取一个表，名字是" + "怎么也捂不热哟～"
            + "，如果有这个表，准备下一步选择;\r\n" +
            // "条件为:和:功效|DNN搜索|功效|菜谱|4;\r\n" +
            // "条件为:和:中药名称|包含|菜谱;\r\n" +
            // "条件为:和:风险规避|不包含|孕;\r\n" +
            // "条件为:和:性味|不包含|凉;\r\n" +
            // "条件为:和:性味|不包含|咸;\r\n" +
            // "获取列名:中药名称:打分:功效;\r\n" +
            // "在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n" +
            // "操作:0|行至|30;\r\n" +
            // "操作:中药名称|颜色标记为|红色;"
            "");
        //1.1 分词
        StringBuilder sb = new StringBuilder(tinshell);
        List<String> listVerbal = commonTestInition.NE.app_S._A.parserMixedString(sb);
        //1.2 分词后词性标注
        DemoPOSTest demoPOSTest = new DemoPOSTest();
        demoPOSTest.testPOS(listVerbal, pos);
        //1.3 可取出各类词汇map
        IMV_SIQ_SS _IMV_SIQ_SS_noun = demoPOSTest.noun;
        IMV_SIQ_SS _IMV_SIQ_SS_verb = demoPOSTest.verb;
        IMV_SIQ_SS _IMV_SIQ_SS_adv = demoPOSTest.adv;
        IMV_SIQ_SS _IMV_SIQ_SS_adj = demoPOSTest.adj;
        //1.4 组合词汇距离权重
        HashMap<String, Double> connectionRNN = new HashMap<>();
        //名动组合
        Iterator<String> iteratorN = _IMV_SIQ_SS_noun.keySet().iterator();
        Iterator<String> iteratorV = _IMV_SIQ_SS_verb.keySet().iterator();
        while (iteratorN.hasNext()) {
            WordFrequency WordFrequencyN = _IMV_SIQ_SS_noun.get(iteratorN.next());
            String stringN = WordFrequencyN.get_word();
            double positionN = WordFrequencyN.getAveragePosition();
            while (iteratorV.hasNext()) {
                WordFrequency WordFrequencyV = _IMV_SIQ_SS_verb.get(iteratorV.next());
                String stringV = WordFrequencyV.get_word();
                double positionV = WordFrequencyV.getAveragePosition();
                double meanOfPositions = (positionN + positionV) / 2;
                connectionRNN.put(stringN + "+" + stringV, meanOfPositions);
                connectionRNN.put(stringV + "+" + stringN, meanOfPositions);
                //可精度过滤meanOfPositions见末尾注释的老接口函数
            }
        }
        // 名名，单字，等各类组合，见末尾注释的老接口函数
        //

        //2.1 罗氏DNN 价值词汇 真实应用方式
        DNNTest dNNTest = new DNNTest();
        ANNTest aNNTest = new ANNTest();
        String[][] ann = aNNTest.getANNMatrix(tinshell, commonTestInition.NE);
        String[][] dnn = dNNTest.getDNNMatrix(ann, tinshell, commonTestInition.NE);
        List<String> listDNN = new ArrayList<>();
        for (int i = 0; i < dnn.length; i++) {
            listDNN.add(dnn[i][0]);
        }
        //输出
        System.out.println("--程度 词汇一览");
        Iterator<String> iteratorsAdj = _IMV_SIQ_SS_adj.keySet().iterator();
        while (iteratorsAdj.hasNext()) {
            System.out.print(" " + iteratorsAdj.next());
        }
        System.out.println();
        Iterator<String> iteratorsAdv = _IMV_SIQ_SS_adv.keySet().iterator();
        while (iteratorsAdv.hasNext()) {
            System.out.print(" " + iteratorsAdv.next());
        }
        System.out.println();
        System.out.println();
        System.out.println("--DNN 词汇一览");
        for (int i = 0; i < dnn.length; i++) {
            System.out.print(" " + listDNN.get(i));
        }
        System.out.println();
        System.out.println();
        System.out.println("--名词 词汇一览");
        Iterator<String> iteratorsNoun = _IMV_SIQ_SS_noun.keySet().iterator();
        while (iteratorsNoun.hasNext()) {
            System.out.print(" " + iteratorsNoun.next());
        }
        System.out.println();
        System.out.println();
        System.out.println("--动词 词汇一览");
        Iterator<String> iteratorsVerb = _IMV_SIQ_SS_verb.keySet().iterator();
        while (iteratorsVerb.hasNext()) {
            System.out.print(" " + iteratorsVerb.next());
        }
        System.out.println();
        System.out.println();
        System.out.println("--组合 词汇 距离一览");
        //
        Iterator<String> iteratorsRNN = connectionRNN.keySet().iterator();
        while (iteratorsRNN.hasNext()) {
            String string = iteratorsRNN.next();
            double temp = connectionRNN.get(string);
            System.out.println(string + "-" + temp);
        }
        //
        System.out.println();
        System.out.println();
        //价值
        //根据2 的罗氏DNN价值词汇打分排序去写各类触发函数 优先来 寻找1 的德塔分词POS词汇组合根据RNN距离
        //权重打分进行罗瑶光极速排序5代来笛卡尔匹配十六元基花索引函数组最优先决策 执行。这种强大的模型可
        // 构建数千种花语基础底层建筑，我就不多说了。
        //todo。。
        //举例一旦出现 -获取-， -表名- 这类词汇，可直接触发 硬盘里，资源下，内存中等已经有的某类表名集合
        // 比如（怎么也捂不热哟 等）进行对应的输入文匹配，一旦输入文也有该表名（怎么也捂不热哟）一旦有就
        // 确定了，比如 怎么也捂不热哟 这个表，直接锁定该表或者相似的表名， 方便优先跟进操作。

        //设置输入待搜索列表，
        commonTestInition.endEnvironment();
    }
}
//下面是可参考我可运行的老接口
//NE.app_S.workVerbaMap.setHumanTalk(tinshell, NE);
//Boolean findSubject = NE.app_S.workVerbaMap.findSubject(NE);
//String string = NE.app_S.workVerbaMap.returnBestTypeOfCommands(findSubject);

//输出结果 ，花语指令集搜索排序， 有效
//Connected to the target VM, address: '127.0.0.1:62597', transport: 'socket'
//*环境初始化*
//*卷积环境 init*
//*PDE环境 init*
//*排序环境 init*
//*语料库表环境 init*
//*CNN type init*
//*ANN RNN DNN init*
//*六元催化 map*
//*花孢环境 init*
//*略先 init*
//*词性环境 init*
//*分词引擎 init*
//*自然语言环境 init*
//*其他枝叶 register*
//-展示词性-
//首先/形谓词作副词----获取/动词----一个/量词----表/动词----，/标点----名/名词----字/名词----
// 是/副词----怎么/副词----也/副词----捂/NULL----不/形谓词作形容词----热/名词----哟/NULL----
// ～/标点----，/标点----如果/从属连词----有/动词----这个/限定词----表/动词----，/标点----准备/动词
// ----下一步/形谓词作副词----选择/动词----;/标点----
//--词汇->名-词性->名词-平均距离->5-出现频率->1.0
//--词汇->字-词性->名词-平均距离->6-出现频率->1.0
//--词汇->热-词性->名词-平均距离->12-出现频率->1.0
//--词汇->获取-词性->动词-平均距离->1-出现频率->1.0
//--词汇->表-词性->动词-平均距离->11-出现频率->2.0
//--词汇->有-词性->动词-平均距离->17-出现频率->1.0
//--词汇->准备-词性->动词-平均距离->21-出现频率->1.0
//--词汇->选择-词性->动词-平均距离->23-出现频率->1.0
//--词汇->首先-词性->形谓词作副词-平均距离->0-出现频率->1.0
//--词汇->不-词性->形谓词作形容词-平均距离->11-出现频率->1.0
//--词汇->下一步-词性->形谓词作副词-平均距离->22-出现频率->1.0
//--词汇->首先-词性->形谓词作副词-平均距离->0-出现频率->1.0
//--词汇->是-词性->null-平均距离->7-出现频率->1.0
//--词汇->怎么-词性->null-平均距离->8-出现频率->1.0
//--词汇->也-词性->形谓词作副词-平均距离->9-出现频率->1.0
//--词汇->下一步-词性->形谓词作副词-平均距离->22-出现频率->1.0trif

//--程度 词汇一览
//首先 不 下一步
//首先 是 怎么 也 下一步
//
//--DNN 词汇一览
//选择 准备 获取
//
//--名词 词汇一览
//名 字 热
//
//--动词 词汇一览
//获取 表 有 准备 选择
//
//--组合 词汇 距离一览
//名+有-11.0
//名+准备-13.0
//名+表-8.0
//名+获取-3.0
//有+名-11.0
//准备+名-13.0
//名+选择-14.0
//表+名-8.0
//获取+名-3.0
//选择+名-14.0
//
//
//Disconnected from the target VM, address: '127.0.0.1:62597', transport: 'socket'
//
//Process finished with exit code 0

