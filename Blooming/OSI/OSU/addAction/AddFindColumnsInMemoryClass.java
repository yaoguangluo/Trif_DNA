package OSI.OSU.addAction;

import ME.VPC.M.app.App;
import OSI.OSU.crab.CrabInterface;
import O_V.OSA.shell.XA_ShellTable;
import O_V.OSA.shell.XA_ShellTables;
import S_A.SEM.bloom.StaticFunctionMapS_AOPM_C;
import S_A.SEM.bloom.StaticRootMap;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
//稍后封装成一个统一的傻瓜接口。
public class AddFindColumnsInMemoryClass implements CrabInterface {
    String callFunctionKey;

    //public IMV_SIQ chromosomeRoot= new IMV_SIQ();
    //public IMV_SIQ chromosomeFlower= new IMV_SIQ();
    //public IMV_SIQ chromosomeLeaf= new IMV_SIQ();
    //public IMV_SIQ chromosomeBlooming= new IMV_SIQ();
    //public IMV_SIQ chromosomeMetabolism= new IMV_SIQ();
    //public IMV_SIQ chromosomePDE= new IMV_SIQ();
    //public IMV_SIQ chromosomeDNA= new IMV_SIQ();
    //public IMV_SIQ chromosomeNode= new IMV_SIQ();
    /*
     * 用于表达元基花的链接
     * */
    //确定元基花的染色体位置
    //确定元基花的染色体调用细节
    //确定染色体的粘合机制
    //确定染色体的剥离机制
    //确定染色体的静态执行
    //StaticRootMap.chromosomeRoot.put("crab", null);
    //StaticRootMap.chromosomeLeaf.put("crab", null);
    //StaticRootMap.chromosomeDNA.put("crab", null);
    public void chromosomes() {
        StaticRootMap.initMap();
        callFunctionKey = "callFunctionKey";
        //20230207 走统计新陈代谢
        StaticRootMap.staticBloomingTimes.put(callFunctionKey, (long) 0);
        StaticRootMap.staticBloomingTime.put(callFunctionKey, System.currentTimeMillis());//增加记忆时间。20241013
        StaticRootMap.staticClass_XE_Map.put(callFunctionKey, "S_AOPM");
        StaticRootMap.chromosomeNode.put(callFunctionKey, new AddFindColumnsInMemoryClass());//20241001准备把这行移出去。
        StaticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKey, "inputValues:传参因子:因子");
        //String callFunctionKey= "callFunctionKey";
        //StaticRootMap.initMap();
    }

    ;

    /*
     * 用于表达花语的链接
     * */
    //确定花语的入参模式
    //确定花语的绽放次数
    //确定花语的最优选择
    //确定花语的映射记忆
    //StaticRootMap.chromosomeFlower.put("crab", null);
    //StaticRootMap.chromosomeBlooming.put("crab", null);
    //StaticRootMap.chromosomeMetabolism.put("crab", null);
    public void bloomings() {
        StaticRootMap.chromosomeBlooming.put(callFunctionKey, this.getClass());
    }

    ;

    /*
     * 用于表达执行方式和函数内容
     * */
    //确定函数的dna编码方式和名称
    //确定输入的计算参数名称
    //确定输出的结果对象类型
    //确定函数的三方资源
    //确定函数的加密形式
    //确定函数的运算周期
    //StaticRootMap.chromosomeNode.put("crab", null);
    //StaticRootMap.chromosomePDE.put("crab", null);
    public void neroCells() {
    }

    ;

    /*
     * 用于表达执行主体
     * */
    //
    //StaticRootMap.chromosomeBlooming.put("crab", null);
    //StaticRootMap.chromosomeRNA.put("crab", null);
    //System.out.println("Hello Word!");
    //return null;
    public Object logic(IMV_SIQ inputValues, String[] 传参因子, int 因子, App NE) {
        if (NE.app_S.workVerbaMap.cartesianWorkActionsRights.containsKey("名为-列")
            || NE.app_S.workVerbaMap.cartesianWorkActionsRights.containsKey("列-名为")) {
            System.out.printf("highly fit"); //later in mapping iterator.*/
        }
        System.out.println("Hello Word!");
        //获取表
        if (!NE._I_U.outputMap.containsKey("获取表名")) {
            return null;
        }
        //later will loop join table;
        String huoqubiaoming = NE._I_U.outputMap.getString("获取表名");
        if (XA_ShellTables.searchShellTables.containsKey(huoqubiaoming)) {
            XA_ShellTable _XA_ShellTable = XA_ShellTables.searchShellTables.get(huoqubiaoming);
            Object[] columns = _XA_ShellTable.huaRuiJiJtableCulumns;
            String shellType = "获取列名:";
            for (int i = 0; i < columns.length; i++) {
                if (NE._I_U.commandAcknowledge.contains(columns[i].toString())) {
                    shellType += columns[i].toString();
                    shellType += ":";
                }
            }
            shellType = shellType.substring(0, shellType.length() - 1);
            String[] strings = shellType.split(":");
            List<String[]> list = new ArrayList();
            list.add(strings);
            NE._I_U.outputMap.put("获取列名", list);//集成到老的接口模式先，避免bug*/
            NE._I_U.outputMap.put("type", "进行选择");
        }
        return null;
    }
}
//127
//获取表的对象
//搜索对象列名遍历list《string》，
//list《string》to 。。/。。/。/。string
//string to strings in object and return

//        Pl_XA_Command_E.P_TableName(NE._I_U.acknowledge
//            , NE._I_U.outputMap);
//        IMV_SIQ object = NE._I_U.outputMap;
//        Iterator<String> iterator = NE.app_S.tableNameMap.keySet().iterator();
//        while (iterator.hasNext()) {
//            String string = iterator.next();
//            if (NE._I_U.commandAcknowledge.contains(string)) {
//                String[] strings = new String[3];
//                strings[0] = "获取列名";//集成到老的接口模式先，避免bug
//                strings[1] = string;
//                strings[2] = "进行选择";
//                object.put("获取表名", strings);//集成到老的接口模式先，避免bug
//                object.put("type", "进行选择");
//            }
//        }