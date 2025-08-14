package S_A.SixActionMap;

import ME.VPC.M.app.App;
import OSI.OSU.crab.CrabInterface;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticRootMap;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class FlowerAction {
    public static IMV_SIQ FlowerSixDomainActions = new IMV_SIQ();//later will do in dynamic

    public static IMV_SIQ FlowerP_E_KernelActions = new IMV_SIQ();//later will do in dynamic

    public static IMV_SIQ FlowerChromosomeActions = new IMV_SIQ();

    public static void initFlowerP_E_KernelActions() {
        FlowerP_E_KernelActions.put("条件为", "selectRowsByAttributesOfCondition");
        FlowerP_E_KernelActions.put("操作", "selectRowsByAttributesOfAggregation");
        FlowerP_E_KernelActions.put("获取列名", "selectRowsByAttributesOfGetCulumns");
        FlowerP_E_KernelActions.put("PLETL", "selectRowsByAttributesOfPLETL");
        FlowerP_E_KernelActions.put("PLTCP", "selectRowsByAttributesOfPLTCP");
        FlowerP_E_KernelActions.put(S_ShellETL.SHELL_ETL_CONDITION, "selectRowsByAttributesOfJoinCondition");
        FlowerP_E_KernelActions.put("relation", "selectRowsByAttributesOfJoinRelation");
        FlowerP_E_KernelActions.put("getCulumns", "selectRowsByAttributesOfJoinGetCulumns");
//       //-增删改-对系统危险，先略。
//        FlowerP_E_KernelActions.put("", "");
//        FlowerP_E_KernelActions.put("", "");
//        FlowerP_E_KernelActions.put("", "");
//        FlowerP_E_KernelActions.put("", "");
//        FlowerP_E_KernelActions.put("", "");
//        FlowerP_E_KernelActions.put("", "");
//        FlowerP_E_KernelActions.put("", "");
    }
//现在是static，以后如果有相关进化算法来增加函数，记得改成dynamic，罗瑶光。
    public static void initFlowerSixDomainActions() {
        FlowerSixDomainActions.put("获取表名", "P_TableName");
        FlowerSixDomainActions.put("setRoot", "P_SetRoot");
        FlowerSixDomainActions.put("baseName", "P_BaseName");
        FlowerSixDomainActions.put("界面操作", "P_YLJOperation");
        FlowerSixDomainActions.put("设", "P_StoreValues");
        FlowerSixDomainActions.put("确定文件夹", "P_fileOperations");
        FlowerSixDomainActions.put("匹配条件", "P_fileOperations");
        FlowerSixDomainActions.put("将", "P_fileOperations");
        FlowerSixDomainActions.put(S_ShellETL.SHELL_ETL_CULUMNNAME, "P_ListNeedStart");
        FlowerSixDomainActions.put("修改列名", "P_ListNeedStart");
        FlowerSixDomainActions.put("culumnValue", "P_ListNeedStart");
        FlowerSixDomainActions.put("join", "P_Join");
        FlowerSixDomainActions.put("条件为", "P_ListNeedStart");
        FlowerSixDomainActions.put("relation", "P_ListNeedStart");
        FlowerSixDomainActions.put("操作", "P_ListNeedStart");
        FlowerSixDomainActions.put("PLETL", "P_ListNeedStart");
        FlowerSixDomainActions.put("获取列名", "P_ListNeedStart");
        FlowerSixDomainActions.put("PLTCP", "P_ListNeedStart");
    }

    public static void doAction(String callFunctionKey, String[] temp, TinMap output, App NE) {
        //花语初始
        String[] strings = new String[1];
        IMV_SIQ outputReg = new IMV_SIQ();
        IMV_SIQ inputValue = new IMV_SIQ();
        NE.app_S.helpVerbaMap.didJustNow.put(callFunctionKey, new Object());//later*/
        String chromosome = StaticRootMap.staticClass_XE_Map.getString(callFunctionKey);
        String[] 传参因子 = StaticFunctionMap.callAnnotationMap(chromosome, callFunctionKey); //我是神！ tin神！
        NE._I_U.outputMap = output;
        if (null == 传参因子) {//strong weak
            传参因子 = new String[1];
            传参因子[0] = "object";
        }
        if (传参因子.length > 1) {//later all in 2
            inputValue.put(传参因子[0], temp);
            inputValue.put(传参因子[1], output);
        } else {
            inputValue.put(传参因子[0], output);
        }
        outputReg.put("传参因子", 传参因子);
        outputReg.put("inputValues", inputValue);
        strings[0] = "执行 " + chromosome + " 下 " + callFunctionKey + " 接口, 参数是 传参因子";
        //孢子插件执行
        if (StaticRootMap.chromosomeNode.containsKey(callFunctionKey)) {
            CrabInterface crabInterface = (OSI.OSU.crab.CrabInterface)
                StaticRootMap.chromosomeNode.get(callFunctionKey);
            crabInterface.logic(inputValue, 传参因子, 0, NE);
        } else {
            //下面是老的花函数执行
            StaticRootMap.tinShellV005(strings, outputReg, NE);
        }
        //need VPCS sections later
        IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
        if (null != map) {
            if (map.getString("feedback").equals("object")) {
                Object objectReg = map.get("interfaceReturn");
                output.put("obj", objectReg);
            }
        }
    }
}
// if (temp[0].equals("获取表名")) {
//        String callFunctionKey = ("P_TableName");
//        String[] strings = new String[1];
//        IMV_SIQ outputReg = new IMV_SIQ();
//        IMV_SIQ inputValue = new IMV_SIQ();

//        String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap.getString(callFunctionKey).split(":");
//        NE._I_U.outputMap = output;//加了map后缀需要更新关联函数

//        inputValue.put(传参因子[0], temp);
//        inputValue.put(传参因子[1], output);
//        outputReg.put("传参因子", 传参因子);
//        outputReg.put("inputValues", inputValue);

//        strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//        StaticRootMap.tinShellV005(strings, outputReg);
//    }
//  if (temp[0].equals("setRoot")) {
//        String callFunctionKey = ("P_SetRoot");
//        String[] strings = new String[1];
//        IMV_SIQ outputReg = new IMV_SIQ();
//        IMV_SIQ inputValue = new IMV_SIQ();

//        String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap.getString(callFunctionKey).split(":");
//        NE._I_U.outputMap = output;

//        inputValue.put(传参因子[0], temp);
//        inputValue.put(传参因子[1], output);
//        outputReg.put("传参因子", 传参因子);
//        outputReg.put("inputValues", inputValue);

//        strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//        StaticRootMap.tinShellV005(strings, outputReg);
//    }

//    if (temp[0].equals("界面操作")) {
//        String callFunctionKey = ("P_YLJOperation");
//        String[] strings = new String[1];
//        IMV_SIQ outputReg = new IMV_SIQ();
//        IMV_SIQ inputValue = new IMV_SIQ();

//        String chromosome = StaticRootMap.staticClass_XE_Map.getString(callFunctionKey);
//        String[] 传参因子 = StaticFunctionMap.callAnnotationMap(chromosome, callFunctionKey); //我是神！ tin神！
//        NE._I_U.outputMap = output;
//        inputValue.put(传参因子[0], temp);
//        inputValue.put(传参因子[1], output);
//        outputReg.put("传参因子", 传参因子);
//        outputReg.put("inputValues", inputValue);

//        strings[0] = "执行 " + chromosome + " 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//        StaticRootMap.tinShellV005(strings, outputReg);
//    }

//23
//later separate into 6 classes
//        if (temp[0].equals("获取表名")) {
//            FlowerAction.doAction("P_TableName", temp, output);
//        }
//        //acknowledge= command.split(":");
//        if (temp[0].equals("setRoot")) {
//            FlowerAction.doAction("P_SetRoot", temp, output);
//        }
//        if (temp[0].equals("baseName")) {//库名
//            FlowerAction.doAction("P_BaseName", temp, output);
//        }
//        if (temp[0].equals("界面操作")) {
//            FlowerAction.doAction("P_YLJOperation", temp, output);
//        }
//        if (temp[0].equals("设")) {//新增计算变量存储。
//            FlowerAction.doAction("P_StoreValues", temp, output);
//        }
//        //确定文件夹:路径:进行搜索
//        if (temp[0].equals("确定文件夹")) {//准备设计文件夹计算
//            FlowerAction.doAction("P_fileOperations", temp, output);
//        }
//        // 匹配条件:文件类型|包含|java;
//        //  *     匹配条件:文件大小KB|小于|200;
//        //  *     匹配条件:文件名|包含|哈哈;
//        //  *     匹配条件:替换|5|行间至|10;
//        if (temp[0].equals("匹配条件")) {//准备设计文件夹计算
//            FlowerAction.doAction("P_fileOperations", temp, output);
//        }
//        //将:字符串:替换为:替换;
//        if (temp[0].equals("将")) {//准备设计文件夹计算
//            FlowerAction.doAction("P_fileOperations", temp, output);
//        }
//        if (temp[0].equals(S_ShellETL.SHELL_ETL_CULUMNNAME)) {
//            FlowerAction.doAction("P_ListNeedStart", temp, output);
//        }
//        if (temp[0].equals("修改列名")) {
//            FlowerAction.doAction("P_ListNeedStart", temp, output);
//        }
//        if (temp[0].equals("culumnValue")) {
//            FlowerAction.doAction("P_ListNeedStart", temp, output);
//        }
//        if (temp[0].equals("join")) {
//            FlowerAction.doAction("P_Join", temp, output);
//        }
//        if (temp[0].equals("条件为")) {/*later obesession*/
//            FlowerAction.doAction("P_ListNeedStart", temp, output);
//        }
//        if (temp[0].equals("relation")) {
//            FlowerAction.doAction("P_ListNeedStart", temp, output);
//        }
//        if (temp[0].equals("操作")) {
//            FlowerAction.doAction("P_ListNeedStart", temp, output);
//        }
//        if (temp[0].equals("PLETL")) {
//            FlowerAction.doAction("P_ListNeedStart", temp, output);
//        }
//        if (temp[0].equals("获取列名")) {
//            FlowerAction.doAction("P_ListNeedStart", temp, output);
//        }
//        if (temp[0].equals("PLTCP")) {
//            FlowerAction.doAction("P_ListNeedStart", temp, output);
//        }