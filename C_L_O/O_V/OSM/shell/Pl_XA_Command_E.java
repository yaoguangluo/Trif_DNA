package O_V.OSM.shell;

import ME.VPC.M.app.App;
import O_V.OSA.shell.XA_ShellTable;
import O_V.OSA.shell.XA_ShellTables;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import S_A.SixActionMap.FlowerAction;
import U_A.PEU.P.cache.Cache;
import U_A.PEU.P.cache.Cache_M;

import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@SuppressWarnings("unchecked")
//作者 罗瑶光 
//20220718 319行新增界面操作 tinshell 命令。如下
//界面操作:searchContent|发热痰黄:searchWays|DNN:searchScales|1:fatarFilter|开:professionNameFilter
//|开:inClusterFilter|开:healthyFilter|开:containsFilter|毒:relatiedJingLuoFilter|:unrelatiedXingWeiFilter|温燥:
//如下, 内容可部分省略书写
//界面操作:searchContent|发热痰黄:searchWays|DNN:searchScales|1:fatarFilter|开:inClusterFilter|开
//:healthyFilter|开:containsFilter|毒:unrelatiedXingWeiFilter|热温燥；

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Pl_XA_Command_E {
    public static void P_SetRoot(String[] acknowledge
        , IMV_SIQ output, App NE) {
        String dbPath = acknowledge[1];
        for (int i = 2; i < acknowledge.length; i++) {
            dbPath += ":" + acknowledge[i];
        }
        if (null != Cache_M.getCacheInfo("DBPath")) {
            File file = new File(dbPath);
            if (!file.exists()) {
                file.mkdirs();
                Cache c = new Cache();
                c.I_Value(dbPath);
                Cache_M.putCache("DBPath", c);
            } else if (file.isFile()) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else if (file.isDirectory()) {
                Cache c = new Cache();
                c.I_Value(dbPath);
                Cache_M.putCache("DBPath", c);
            }
        }
    }

    public static void P_BaseName(String[] acknowledge, IMV_SIQ object) {
        object.put(acknowledge[0], acknowledge[1]);
    }

    public static void P_TableName(String[] acknowledge, IMV_SIQ object) {
        object.put(acknowledge[0], acknowledge[1]);
        object.put("type", acknowledge[2]);
    }

    //之前eclipse+联想+戴尔换 苹果+ideaj，变量名中文变英文，英文进行缩写元基编码，
    // 导致相同函数在不同的花瓣下进行的统一的操作时候，产生这类混淆。
    // 中药同源表导入新版本没有缓存库注册，同时变量名混淆+函数混淆，没有记录String[]buffer列。会出现null
    //later
    public static void P_ListNeedStart(String[] acknowledge, IMV_SIQ object) {
        object.put("start", "1");//later
        if (object.containsKey(acknowledge[0])) {
            List<String[]> relationValues = (List<String[]>) object.get(acknowledge[0]);
            relationValues.add(acknowledge);
            object.put(acknowledge[0], relationValues);
            return;
        }
        List<String[]> relationValues = new CopyOnWriteArrayList<>();
        relationValues.add(acknowledge);
        object.put(acknowledge[0], relationValues);
    }

    public static void P_Join(String[] acknowledge, IMV_SIQ object) {
        if (object.getCompareV("countJoins", "1")) {
            object.put("countJoins", "n");
        }
        if (object.getCompareV("countJoins", "0")) {
            object.put("countJoins", "1");
        }
        object.put(S_ShellETL.SHELL_ETL_JOIN_BASE_NAME, acknowledge[1]);
        object.put("joinTableName", acknowledge[2]);
    }

    public static void P_E(String[] acknowledge, TinMap object, boolean mod, App NE) {
        if (object.get("start").toString().equals("1")) {
            if (!acknowledge[0].equalsIgnoreCase(object.get("lastCommand").toString())
                && (object.get("lastCommand").toString().contains("修改列名")
                || object.get("lastCommand").toString().contains("culumnValue")
                || object.get("lastCommand").toString().contains("条件为")
                || object.get("lastCommand").toString().contains("relation")
                || object.get("lastCommand").toString().contains("操作")
                || object.get("lastCommand").toString().contains("PLETL")
                || object.get("lastCommand").toString().contains("PLTCP")
                || object.get("lastCommand").toString().contains("获取列名")
                || object.get("lastCommand").toString()
                .contains(S_ShellETL.SHELL_ETL_CULUMNNAME)
                || object.get("lastCommand").toString().contains("relation"))) {
                P_E_Kernel(object, mod, NE);
            }
        }
    }

    //处理机中心, 别急, 准备验证 罗瑶光
    private static void P_E_Kernel(TinMap object, boolean mod, App NE) {
        if (object.getCompareV("type", "进行选择") &&
            (object.getCompareV("countJoins", "0") ||
                (object.getCompareV("countJoins", "1") &&
                    object.getCompareV("newCommand", "join")))) {
            if (object.containsKey("条件为")) {
                FlowerAction.FlowerSixDomainActions.couldSQLThenSQL("条件为"
                    , NE.app_S.acknowledge, object, NE);
            }
            if (object.containsKey("操作")) {
                FlowerAction.FlowerSixDomainActions.couldSQLThenSQL("操作"
                    , NE.app_S.acknowledge, object, NE);
            }
            if (object.containsKey("获取列名")) {
                FlowerAction.FlowerSixDomainActions.couldSQLThenSQL("获取列名"
                    , NE.app_S.acknowledge, object, NE);
            }
            if (object.containsKey("PLETL")) {
                FlowerAction.FlowerSixDomainActions.couldSQLThenSQL("PLETL"
                    , NE.app_S.acknowledge, object, NE);
            }
            if (object.containsKey("PLTCP")) {
                FlowerAction.FlowerSixDomainActions.couldSQLThenSQL("PLTCP"
                    , NE.app_S.acknowledge, object, NE);
            }
            object.remove("recordRows");
        }
        if (object.getCompareV("type", "进行选择") &&
            (object.getCompareV("countJoins", "n") ||
                (object.getCompareV("countJoins", "1") &&
                    !object.getCompareV("newCommand", "join")))) {
            if (object.containsKey(S_ShellETL.SHELL_ETL_CONDITION)) {
                FlowerAction.FlowerSixDomainActions.couldSQLThenSQL(S_ShellETL.SHELL_ETL_CONDITION
                    , NE.app_S.acknowledge, object, NE);
            }
            if (object.containsKey("relation")) {
                FlowerAction.FlowerSixDomainActions.couldSQLThenSQL("relation"
                    , NE.app_S.acknowledge, object, NE);
            }
            if (object.containsKey("aggregation")) {
                //object.put("obj"
                //, SearchShellQ_JoinRows_E.selectRowsByAttributesOfJoinAggregation(object));
            }
            if (object.containsKey("getCulumns")) {
                FlowerAction.FlowerSixDomainActions.couldSQLThenSQL("getCulumns"
                    , NE.app_S.acknowledge, object, NE);
            }
            if (object.containsKey("PLETL")) {
                //object.put("obj", SearchShellQ_Rows_E.selectRowsByAttributesOfPLETL(object));
            }
            object.remove("recordRows");
        }
        if (object.getCompareV("type", "create")) {
            if (object.containsKey(S_ShellETL.SHELL_ETL_CULUMNNAME)) {
                //I_Tables_E.I_Table(object, mod);
            }
            object.remove("recordRows");
        }
        //离散数学的conjuction变换
        //a^&&b^&&c * kernel[]= (a^&&b^)^^&&c * kernel[]= (a||b)^&&c * kernel[]
        if (object.getCompareV("type", "update") &&
            (object.getCompareV("countJoins", "0") ||
                (object.getCompareV("countJoins", "1") &&
                    object.getCompareV("newCommand", "join")))) {
            if (object.containsKey(S_ShellETL.SHELL_ETL_CONDITION)) {
                //object.put("updateObj"
                //, U_Rows_E.updateRowsByAttributesOfCondition(object, mod));
            }
            if (object.containsKey("aggregation")) {
                //object.put("updateObj"
                //, U_Rows_E.updateRowsByAttributesOfAggregation(object, mod));
            }
            if (object.containsKey("culumnValue")) {
                //U_Rows_E.updateRowsByRecordConditions(object, mod);
            }
            object.remove("recordRows");
        }
        if (object.getCompareV("type", "update") &&
            (object.getCompareV("countJoins", "n") ||
                (object.getCompareV("countJoins", "1") &&
                    !object.getCompareV("newCommand", "join")))) {
            if (object.containsKey(S_ShellETL.SHELL_ETL_CONDITION)) {
                //object.put("updateJoinObj"
                //, U_JoinRows_E.updateRowsByAttributesOfJoinCondition(object, mod));
            }
            if (object.containsKey("relation")) {
                //object.put("updateObj"
                //, U_JoinRows_E.updateRowsByAttributesOfJoinRelation(object, mod));
            }
            if (object.containsKey("aggregation")) {
                //object.put("updateObj"
                //, U_JoinRows_E.updateRowsByAttributesOfJoinAggregation(object, mod));
            }
            if (object.containsKey("culumnValue")) {
                //U_Rows_E.updateRowsByRecordConditions(object, mod);
            }
            object.remove("recordRows");
        }
        if (object.getCompareV("type", "insert")) {
            if (object.containsKey("culumnValue")) {
                //IU_Rows_E.IU_RowByAttributes(object, mod);
            }
        }
        if (object.getCompareV("type", "delete")) {
            if (object.containsKey(S_ShellETL.SHELL_ETL_CONDITION)) {
                //D_Rows_E.D_RowByAttributesOfCondition(object, mod);
            }
        }
        object.remove("条件为");
        object.remove(S_ShellETL.SHELL_ETL_CULUMNNAME);
        object.remove("修改列名");//later
        object.remove("relation");//later
        object.remove("操作");
        object.remove("获取列名");
        object.remove("PLETL");
        object.remove("PLTCP");
        object.put("start", "0");
    }

    //plsql函数执行指令 正在检查中 罗瑶光 20210405
    public static void P_Check(String acknowledge, TinMap object
        , boolean mod, App NE) {
        if (object.getCompareV("start", "1")) {
            P_E_Kernel(object, mod, NE);
        }
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("obj")));
        int totalPages = 0;
        if (obj != null) {
            totalPages = obj.size();
        }
        int rowBeginIndex = object.containsKey("pageBegin")
            ? Integer.valueOf(object.get("pageBegin").toString()) : 0;
        int rowEndIndex = object.containsKey("pageEnd")
            ? Integer.valueOf(object.get("pageEnd").toString())
            : totalPages > 15 ? 15 : totalPages;
        object.put("pageBegin", rowBeginIndex);
        object.put("pageEnd", rowEndIndex);

        //	String DBPath= Cache_M.getCacheInfo("DBPath")
        //.getValue().toString() + "/" + object.get("baseName").toString();
        //	String DBTablePath= DBPath + "/" + object.get("tableName").toString();

        object.put("tablePath", (null == object.get("获取表名") ? ""
            : object.get("获取表名")).toString());
        object.put("returnResult", "success");
        object.put("totalPages", totalPages);
        object.put("loginInfo", "success");
        List<Object> spec = new ArrayList<>();
        //Iterator<String> iterator= new ArrayList<String>().iterator();
        //	if(obj== null || obj.size()< 1) {
        ////Base base= DetaDBBufferCache_M.db.getBase(object.get("baseName").toString());
        //SearchShellTable table= SearchShellTables
        //.searchShellTables.get(object.get("tableName").toString());
        //	Object[] specs= table.getHuaRuiJiJtableCulumns();
        //	}else {//进行map 验证检测 罗瑶光 20210405
        //		IMV_SIQ map= obj.get(0);
        //		IMV_SIQ objectInMap
        //= (IMV_SIQ)map.get(S_ShellETL.SHELL_ETL_ROWVALUE);
        //		iterator= null== objectInMap? null:objectInMap.keySet().iterator();
        //	}
        XA_ShellTable table
            = XA_ShellTables.searchShellTables.get((null == object.get("获取表名")
            ? "" : object.get("获取表名")).toString());
        if (null != table) {
            Object[] specs = table.getHuaRuiJiJtableCulumns();
            for (Object specS : specs) {
                spec.add(specS);
            }
            object.put("spec", spec);
        }
    }

    public static void P_StoreValues(String[] acknowledge, IMV_SIQ output) {

        //如果没有初始就初始
        //如果已经初始就存值
        //0   1   2   3
        //设:数据:为:ddsdsds
        if (acknowledge[0].contains("设") && acknowledge[2].contains("为")) {
            S_ShellETL.storeValue.put(acknowledge[1].toString(), acknowledge[3].toString());
        }
    }

    //之后准备设计成工厂类 或者 单例类 bean
    public static void P_fileOperations(String[] acknowledge, IMV_SIQ output) {
        //确定文件夹:路径:进行搜索
        if (acknowledge[0].equals("确定文件夹")) {
            String filePath = (S_ShellETL.storeValue.containsKey(acknowledge[1])
                ? S_ShellETL.storeValue.get(acknowledge[1]) : acknowledge[1]);
            S_ShellETL.storeValue.put("确定文件夹", filePath.toString()
                .replace("\\:", ":"));
        }

        //	 匹配条件:文件类型:包含:java;
        //	  *     匹配条件:文件大小KB:小于:200;
        //	  *     匹配条件:文件名:包含:哈哈;
        //	  *     匹配条件:替换:5:行间至:10;
        if (acknowledge[0].equals("匹配条件")) {
            if (acknowledge[1].equals("文件类型")) {
                S_ShellETL.storeValue.put("文件类型", acknowledge[3].toString());
            } else if (acknowledge[1].equals("文件大小KB")) {
                S_ShellETL.storeValue.put("文件大小KB", acknowledge[3].toString());
            } else if (acknowledge[1].equals("文件名")) {
                S_ShellETL.storeValue.put("文件名", acknowledge[3].toString());
            } else if (acknowledge[1].equals("替换")) {
                if (acknowledge[3].equals("行间至")) {
                    S_ShellETL.storeValue.put("beginLine"
                        , acknowledge[2].toString());
                    S_ShellETL.storeValue.put("endLine"
                        , acknowledge[4].toString());
                }

            }
        }

        //将:字符串:替换为:替换;
        if (acknowledge[0].equals("将")) {
            if (acknowledge[2].equals("替换为")) {
                //new ShellReplace().replaceString("C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021
                //\\repalceSample", ">_<", "..>_<..");
                try {
                    IMV_SIQ conditions = new IMV_SIQ();
                    conditions.put("fileType"
                        , (S_ShellETL.storeValue.containsKey("文件类型")
                            ? S_ShellETL.storeValue.get("文件类型") : ""));
                    conditions.put("fileName"
                        , (S_ShellETL.storeValue.containsKey("文件名")
                            ? S_ShellETL.storeValue.get("文件名") : ""));
                    conditions.put("filesize_KB"
                        , (S_ShellETL.storeValue.containsKey("文件大小KB")
                            ? S_ShellETL.storeValue.get("文件大小KB") : ""));
                    conditions.put("beginLine"
                        , (S_ShellETL.storeValue.containsKey("beginLine")
                            ? S_ShellETL.storeValue.get("beginLine") : ""));
                    conditions.put("endLine"
                        , (S_ShellETL.storeValue.containsKey("endLine")
                            ? S_ShellETL.storeValue.get("endLine") : ""));
                    conditions.put("searchString"
                        , (S_ShellETL.storeValue.containsKey(acknowledge[1])
                            ? S_ShellETL.storeValue.get(acknowledge[1])
                            : acknowledge[1]));
                    conditions.put("needReplaceString"
                        , (S_ShellETL.storeValue.containsKey(acknowledge[3])
                            ? S_ShellETL.storeValue.get(acknowledge[3])
                            : acknowledge[3]));
                    conditions.put("fileDirectroyPath"
                        , S_ShellETL.storeValue.get("确定文件夹"));
                    //20230106-System.out.println("--->>"+ S_ShellETL.storeValue.get("确定文件夹"));
                    conditions.put("replaceLogPath"
                        , S_ShellETL.storeValue.get("确定文件夹")
                            + "\\replace_Log.lyg");//\\只适用于windows, 记得 / 比较。
                    ShellReplace shellReplace = new ShellReplace();
                    shellReplace.replaceStringWithLogRecording(conditions);
                } catch (Exception e) {
                    //稍后写rollback
                    //思考了下改成最简单的策略。
                    //替换回来非常轻松了。直接将backup文件替换即可。
                    //回滚设计成 exception兼容模式。 罗瑶光
                    //shellReplace.rollbackWithRecordingLog(conditions);, ,
                }
            }
        }
    }

    //界面操作:searchContent|发热痰黄:searchWays|DNN:searchScales|1:fatarFilter|开
    //:professionNameFilter|开:inClusterFilter|开:healthyFilter|开:containsFilter|毒:relatiedJingLuoFilter|:unrelatiedXingWeiFilter|温燥:
    public static void P_YLJOperation(String[] acknowledge, IMV_SIQ output, App NE) {
        //读取配置, 然后
        String searchContent = "";
        String searchWays = "";
        String searchScales = "";
        String fatarFilter = "";
        String professionNameFilter = "";
        String inClusterFilter = "";
        String healthyFilter = "";
        String containsFilter = "";
        String relatiedJingLuoFilter = "";
        String unrelatiedXingWeiFilter = "";
        for (String string : acknowledge) {
            if (string.contains("searchContent")) {
                String[] strings = string.split("\\|");//linux执行小心PCRE 捣蛊。
                if (1 < strings.length) {
                    searchContent = strings[1].toString();
                }
            }
            if (string.contains("searchWays")) {
                String[] strings = string.split("\\|");
                if (1 < strings.length) {
                    searchWays = strings[1].toString();
                }
            }
            if (string.contains("searchScales")) {
                String[] strings = string.split("\\|");
                if (1 < strings.length) {
                    searchScales = strings[1].toString();
                }
            }
            if (string.contains("fatarFilter")) {
                String[] strings = string.split("\\|");
                if (1 < strings.length) {
                    fatarFilter = strings[1].toString();
                }
            }
            if (string.contains("professionNameFilter")) {
                String[] strings = string.split("\\|");
                if (1 < strings.length) {
                    professionNameFilter = strings[1].toString();
                }
            }
            if (string.contains("inClusterFilter")) {
                String[] strings = string.split("\\|");
                if (1 < strings.length) {
                    inClusterFilter = strings[1].toString();
                }
            }
            if (string.contains("healthyFilter")) {
                String[] strings = string.split("\\|");
                if (1 < strings.length) {
                    healthyFilter = strings[1].toString();
                }
            }
            if (string.contains("containsFilter")) {
                String[] strings = string.split("\\|");
                if (1 < strings.length) {
                    containsFilter = strings[1].toString();
                }
            }
            if (string.contains("relatiedJingLuoFilter")) {
                String[] strings = string.split("\\|");
                if (1 < strings.length) {
                    relatiedJingLuoFilter = strings[1].toString();
                }
            }
            if (string.contains("unrelatiedXingWeiFilter")) {
                String[] strings = string.split("\\|");
                if (1 < strings.length) {
                    unrelatiedXingWeiFilter = strings[1].toString();
                }
            }
        }
        //开始配置首页,
        if (professionNameFilter.contains("开")) {
            NE.app_S.shuming_filter_box.setSelected(true);
        } else {
            NE.app_S.shuming_filter_box.setSelected(false);
        }
        if (fatarFilter.contains("开")) {
            NE.app_S.risk_filter_box.setSelected(true);
        } else {
            NE.app_S.risk_filter_box.setSelected(false);
        }
        if (inClusterFilter.contains("开")) {
            NE.app_S.zonghe_filter_box.setSelected(true);
        } else {
            NE.app_S.zonghe_filter_box.setSelected(false);
        }
        if (healthyFilter.contains("开")) {
            NE.app_S.feel_filter_box.setSelected(true);
        } else {
            NE.app_S.feel_filter_box.setSelected(false);
        }
        if (null != searchContent) {
            NE.app_S.name.setText(searchContent.toString());
        } else {
            NE.app_S.name.setText("");
        }
        if (null != searchScales) {
            NE.app_S.lookrot = Integer.valueOf(searchScales);
        } else {
            NE.app_S.lookrot = 0;
        }
        if (null != searchWays) {
            if (searchWays.contains("DNN") || searchWays.contains("dnn")
                || searchWays.contains("Dnn") || searchWays.contains("dNN")) {
                NE.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2122.setSelected(true);
            } else {
                NE.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2122.setSelected(false);
            }
            if (searchWays.contains("专家")) {
                NE.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2233.setSelected(true);
            } else {
                NE.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2233.setSelected(false);
            }
        }
        if (null != containsFilter) {
            NE.app_S.name_filter.setText(containsFilter.toString());
        } else {
            NE.app_S.name_filter.setText("");
        }
        if (null != relatiedJingLuoFilter) {
            NE.app_S.name_filter_not_have.setText(relatiedJingLuoFilter.toString());
        } else {
            NE.app_S.name_filter_not_have.setText("");
        }
        if (null != unrelatiedXingWeiFilter) {
            NE.app_S.nameFeelFilter.setText(unrelatiedXingWeiFilter.toString());
        } else {
            NE.app_S.nameFeelFilter.setText("");
        }
        //触发回车事件
        @SuppressWarnings("deprecation")
        KeyEvent arg0 = new KeyEvent(new JTextField(), 0, 0, 0, 0);
        arg0.setKeyCode(10);
        NE.keyReleased(arg0);
    }
}
//199
//			if(object.containsKey("获取临时表名")) {
////稍后调通后注册用元基花语孢子
////				//object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfGetCulumns(object));
////				String callFunctionKey= "selectRowsByAttributesOfGetCulumns";
////				//StaticRootMap.initMap();
////				String[] strings= new String[1];
////				IMV_SIQ outputReg= new IMV_SIQ();
////				IMV_SIQ inputValue= new IMV_SIQ();
////				String[] 传参因子
////				= StaticFunctionMapO_VECS_C.annotationMap.get(callFunctionKey).split(":");
////				inputValue.put(传参因子[0], object);
////				outputReg.put("传参因子", 传参因子);
////				outputReg.put("inputValues", inputValue);
////				//strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
////				strings[0]= "执行 O_VECS 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
////				StaticRootMap.tinShellV005(strings, outputReg);
////				IMV_SIQ map= (IMV_SIQ) outputReg.get(callFunctionKey);
////				Object objectReg= map.get("interfaceReturn");;
////				object.put("obj", objectReg);
//	//	//	//			}

//161
//                //object.put("joinObj", XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinCondition(object));
//                String callFunctionKey = "selectRowsByAttributesOfJoinCondition";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = object;
//                inputValue.put(传参因子[0], object);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                if (null != map) {
//                    if (map.getString("feedback").equals("object")) {
//                        Object objectReg = map.get("interfaceReturn");
//                        object.put("obj", objectReg);
//                    }
//                }
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                Object objectReg = map.get("interfaceReturn");
//                object.put("joinObj", objectReg);
//135
//                String callFunctionKey = "selectRowsByAttributesOfCondition";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = object;
//                inputValue.put(传参因子[0], object);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                Object objectReg = map.get("interfaceReturn");
//                object.put("obj", objectReg);

//139
//                //plsearch 的筛选 在这里拓展。罗瑶光20210927
//                //object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfAggregation(object));
//                String callFunctionKey = "selectRowsByAttributesOfAggregation";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = object;
//                inputValue.put(传参因子[0], object);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                Object objectReg = map.get("interfaceReturn");
//                ;
//                object.put("obj", objectReg);
//143
//                //object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfGetCulumns(object));
//                String callFunctionKey = "selectRowsByAttributesOfGetCulumns";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = object;
//                inputValue.put(传参因子[0], object);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                if (null != map) {
//                    if (map.getString("feedback").equals("object")) {
//                        Object objectReg = map.get("interfaceReturn");
//                        object.put("obj", objectReg);
//                    }
//                }
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                IMV_SIQ objectReg = (IMV_SIQ) map.get("interfaceReturn");
//                if(!objectReg.isEmpty()){
//                    object.put("obj", objectReg);
//                }
//147
//                //object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfPLETL(object));
//                String callFunctionKey = "selectRowsByAttributesOfPLETL";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = object;
//                inputValue.put(传参因子[0], object);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                if (null != map) {
//                    if (map.getString("feedback").equals("object")) {
//                        Object objectReg = map.get("interfaceReturn");
//                        object.put("obj", objectReg);
//                    }
//                }
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                Object objectReg = map.get("interfaceReturn");
//                eclipsec，javac 狗一样的同行。
//                object.put("obj", objectReg);
//151
//                //object.put("obj", XA_ShellQ_Rows_E.selectRowsByAttributesOfPLTCP(object));
//                String callFunctionKey = "selectRowsByAttributesOfPLTCP";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = object;
//                inputValue.put(传参因子[0], object);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                if (null != map) {
//                    if (map.getString("feedback").equals("object")) {
//                        Object objectReg = map.get("interfaceReturn");
//                        object.put("obj", objectReg);
//                    }
//                }
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                Object objectReg = map.get("interfaceReturn");
//                object.put("obj", objectReg);
//165
//                //object.put("obj", XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinRelation(object));
//                String callFunctionKey = "selectRowsByAttributesOfJoinRelation";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = object;
//                inputValue.put(传参因子[0], object);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                if (null != map) {
//                    if (map.getString("feedback").equals("object")) {
//                        Object objectReg = map.get("interfaceReturn");
//                        object.put("obj", objectReg);
//                    }
//                }
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                Object objectReg = map.get("interfaceReturn");
//                ;
//                object.put("obj", objectReg);

//173
//                object.put("joinObj"
//                    , XA_ShellQ_JoinRows_E.selectRowsByAttributesOfJoinGetCulumns(object));
//                String callFunctionKey = "selectRowsByAttributesOfJoinGetCulumns";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = object;
//                inputValue.put(传参因子[0], object);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                if (null != map) {
//                    if (map.getString("feedback").equals("object")) {
//                        Object objectReg = map.get("interfaceReturn");
//                        object.put("obj", objectReg);
//                    }
//                }
//                IMV_SIQ map = (IMV_SIQ) outputReg.get(callFunctionKey);
//                Object objectReg = map.get("interfaceReturn");
//                object.put("joinObj", objectReg);