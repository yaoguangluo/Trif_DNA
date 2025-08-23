package test.java.InterfaceTest.tinShell;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import S_A.SEM.bloom.StaticFunctionMapQ_VECS_E;
import S_A.SixActionMap.CreativeVerbaMap;
import S_A.SixActionMap.FlowerAction;
import S_A.SixActionMap.StudyVerbaMap;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import org.junit.jupiter.api.Test;
import test.java.InterfaceTest.CommonTestInition;

import java.util.ArrayList;
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
class SortFlowerTalkTest {
	public static void main(String[] argv) throws InterruptedException {
		SortFlowerTalkTest sortFlowerTalkTest=new SortFlowerTalkTest();
		sortFlowerTalkTest.main();
	}
    @Test
    void searchFromTable() {
    }

    @Test
    void searchFromTablewithScale() {
    }

    /*
     * 这是一个 最简线性表格 执行字符串条件搜索逻辑，测试main函数demo的test版本，在真实的场景下将
     * hashmap的 String，函数 形式- 通过 搜素排序 输出一个 linkedhashmap-String，函数-对象，方便
     * 最快最优 笛卡尔遍历加速。主要用于花语 可以设计精度下限来函数匹配加速。
     * --罗瑶光
     * */
    @SuppressWarnings({ "unchecked", "unused" })
	@Test
    void main() throws InterruptedException {
        //启动测试开始
        CommonTestInition commonTestInition = new CommonTestInition();
        commonTestInition.initEnvironment("去弹窗组件流测试");
        //优化后 索引变化了。
        commonTestInition.NE._I_U._AE = (CogsBinaryForest_AE) commonTestInition
            .NE.app_S._AE;
        //计算搜索
        //配置环境，
        String[] argv = commonTestInition.NE._I_U.argv;
        CogsBinaryForest_AE _AE = commonTestInition.NE._I_U._AE;
        ArrayList<String> nameContent = new ArrayList<String>();
        double lookrot = 0.0;
        //拿出FlowerSixDomainActions 的 string key
        //初始化 花语函数表
        //initon plugin types without OSGI
        System.out.println("FlowerSixDomainActions 元基花自主添加六元催化函数注册");
        CreativeVerbaMap.initInitonActions();
        //
        System.out.println("initonDelegate 元基花触发词汇添加");
        StudyVerbaMap.initInitonDelegate();
        //
        System.out.println("FlowerP_E_KernelActions 元基花脚本函数注册");
        FlowerAction.initFlowerP_E_KernelActions();
        //
        System.out.println("FlowerSixDomainActions 德塔PLSQL数据库ORM函数注册");
        FlowerAction.initFlowerSixDomainActions();
        //输出 linkedHashMap
        IMV_SIQ textContent = FlowerAction.FlowerSixDomainActions;

        //设置输入待搜索列表，
        Iterator<String> iterators = textContent.keySet().iterator();
        while (iterators.hasNext()) {
            nameContent.add(iterators.next());
        }
        System.out.println("待搜索指令数据行");
        for (int i = 0; i < nameContent.size(); i++) {
            System.out.println(nameContent.get(i).toString());
        }
        AES_QMS_XSD_TIH searchkey = new AES_QMS_XSD_TIH("确");
        System.out.println("测试搜索关键字->" + searchkey._S_);
        commonTestInition.NE._I_U.searchkey = searchkey;
        commonTestInition.NE._I_U.nameContent = nameContent;
        commonTestInition.NE._I_U.textContent = textContent;
        commonTestInition.NE._I_U.lookrot = lookrot;
        commonTestInition.NE._I_U._AE = _AE;
        List<Object[]> outputList = new StaticFunctionMapQ_VECS_E()
            .searchFromTablewithScale(commonTestInition.NE, 0, true);
        Iterator<Object[]> iterator = outputList.iterator();
        System.out.println("搜索后 排序指令数据行， 0 为冗余输出，true为搜索key码");
        while (iterator.hasNext()) {
            Object[] object = iterator.next();
            for (int i = 0; i < object.length; i++) {
                System.out.println(object[i].toString());
            }
        }
        commonTestInition.endEnvironment();
    }
}
//输出结果 ，花语指令集搜索排序， 有效
//Connected to the target VM, address: '127.0.0.1:59361', transport: 'socket'
//    *环境初始化*
//    *卷积环境 init*
//    *PDE环境 init*
//    *排序环境 init*
//    *语料库表环境 init*
//    *CNN type init*
//    *ANN RNN DNN init*
//    *六元催化 map*
//    *花孢环境 init*
//    *略先 init*
//    *词性环境 init*
//    *分词引擎 init*
//    *自然语言环境 init*
//    *其他枝叶 register*
//    FlowerSixDomainActions 元基花自主添加六元催化函数注册
//    initonDelegate 元基花触发词汇添加
//    FlowerP_E_KernelActions 元基花脚本函数注册
//    FlowerSixDomainActions 德塔PLSQL数据库ORM函数注册

//    待搜索指令数据行----

//    确定文件夹
//    操作
//    I-表
//    culumnValue
//    将
//    条件为
//    setRoot
//    匹配条件
//    PLETL
//    PLTCP
//    获取表名
//    展示-列
//    relation
//    获取列名
//    界面操作
//    修改列名
//    join
//    baseName
//    设
//    culumnName

//    测试搜索关键字->确

//    搜索后 排序指令数据行， 0 为冗余输出，true为搜索key码
//    1 --排序后数据
//    2012   --打分
//    确定文件夹  --key
//    P_fileOperations  --value
//    Disconnected from the target VM, address: '127.0.0.1:59361', transport: 'socket'
//
//    Process finished with exit code 0