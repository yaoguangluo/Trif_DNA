package O_V.OSM.shell;

import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"unused"})
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
//pletl 先实现 上中下的 tinmap中指令合并
//设计了简答宾语补足语, 有时间思考下 定语和slang 的模式 和成语模式 罗瑶光
//作者罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class P_AO_PLETL {
    @SuppressWarnings({"unchecked"})
    public static void P_PletlLimitMap(String[] sets, List<IMV_SIQ> output
        , IMV_SIQ object) {
        List<IMV_SIQ> outputTemp = new ArrayList<>();
        //中节点|表格合并|主码|新增列|ID|。。
        //上节点是main节点作为accumulator, 模拟rna芯片计算容器, 中下节点模拟神经元记忆接口。
        //设计宾语补足语 今天改为如下 20211011 罗瑶光
        //PLETL:中节点|进行表格合并|主码为|ID|模式为|新增列;
        //PLETL:中节点|进行表格合并|主码为|ID|模式为|叠加列;
        //PLETL:中节点|进行表格合并|主码为|ID|模式为|有交集叠加列;
        //PLETL:中节点|进行表格合并|主码为|ID|模式为|有交集新增列;
        //PLETL:中节点|进行表格合并|主码为|ID|模式为|无交集新增列;
        if (sets[1].equalsIgnoreCase("进行表格补充")) {
            TinMap mapShell = null;
            String columnIdentify = null;
            if (sets[0].equalsIgnoreCase("中节点")) {
                mapShell = (TinMap) object.get(S_ShellETL.SHELL_ETL_MID_SHELL);
                columnIdentify = "m_";
            }
            if (sets[0].equalsIgnoreCase("下节点")) {
                mapShell = (TinMap) object.get(S_ShellETL.SHELL_ETL_DOWN_SHELL);
                columnIdentify = "d_";
            }

            //将上面进行内外循环 颠倒rotation 如下
            if (sets[2].equalsIgnoreCase("主码为")) {
                //先单一primary key, 之后再设计 forenge key 和 combination key
                //To do。。。初始
                IMV_SIQ keyTemp = new IMV_SIQ();
                IMV_SIQ tinShellETL
                    = (IMV_SIQ) mapShell.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
                List<IMV_SIQ> rowList = (List<IMV_SIQ>) tinShellETL.get("obj");
                //主循环
                List<IMV_SIQ> primaryInLoop = (List<IMV_SIQ>) object.get("obj");
                Iterator<IMV_SIQ> outputTempIterator = primaryInLoop.iterator();
                while (outputTempIterator.hasNext()) {
                    IMV_SIQ rowOutputTempIterator = outputTempIterator.next();
                    IMV_SIQ rowValueRowOutputTempIterator
                        = (IMV_SIQ) rowOutputTempIterator.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                    if (0 != rowList.size()) {
                        //辅循环
                        Iterator<IMV_SIQ> iterator = rowList.iterator();
                        Here:
                        while (iterator.hasNext()) {//非primaryInLoop
                            IMV_SIQ row = iterator.next();
                            IMV_SIQ rowValue
                                = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                            IMV_SIQ culumnValue = (IMV_SIQ) rowValue.get(sets[3]);
                            //outputTemp
                            if (rowValueRowOutputTempIterator.containsKey(sets[3])) {
                                IMV_SIQ rowValueRowOutputTempIteratorCulumnValue
                                    = (IMV_SIQ) rowValueRowOutputTempIterator.get(sets[3]);
                                //合并rowValueRowOutputTempIteratorCulumnValue 与 culumnValue
                                //合并方式, 1 叠加列合并 2 新增列合并
                                //先实现简单的 新增列合并
                                //在执行前进行sets[3]相等检查
                                if (rowValueRowOutputTempIteratorCulumnValue.get("culumnValue")
                                    .equals(culumnValue.get("culumnValue"))) {
                                    if (sets[4].equalsIgnoreCase("模式为")) {
                                        model(sets, rowValue, columnIdentify, rowValueRowOutputTempIterator);
                                    }
                                }
                                //其他定状补语 函数
                                //。。。
                                //。。。
                                //。
                            }
                            rowOutputTempIterator.put(S_ShellETL.SHELL_ETL_ROWVALUE
                                , rowValueRowOutputTempIterator);
                        }
                    }
                    outputTemp.add(rowOutputTempIterator);
                }
            }
            //			if(sets[2].equalsIgnoreCase("自由定义各种命令。。")) {
            //			//To do。。。
            //		}
            output.clear();
            output.addAll(outputTemp);
        }
        if (sets[1].equalsIgnoreCase("进行表格合并")) {
            TinMap mapShell = null;
            String columnIdentify = null;
            if (sets[0].equalsIgnoreCase("中节点")) {
                mapShell = (TinMap) object.get(S_ShellETL.SHELL_ETL_MID_SHELL);
                columnIdentify = "m_";
            }
            if (sets[0].equalsIgnoreCase("下节点")) {
                mapShell = (TinMap) object.get(S_ShellETL.SHELL_ETL_DOWN_SHELL);
                columnIdentify = "d_";
            }

            //将上面进行内外循环 颠倒rotation 如下
            if (sets[2].equalsIgnoreCase("主码为")) {
                //先单一primary key, 之后再设计 forenge key 和 combination key
                //To do。。。初始
                IMV_SIQ keyTemp = new IMV_SIQ();
                TinMap tinShellETL = (TinMap) mapShell.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
                List<IMV_SIQ> rowList = (List<IMV_SIQ>) tinShellETL.get("obj");
                //主循环
                List<IMV_SIQ> primaryInLoop = (List<IMV_SIQ>) object.get("obj");
                Iterator<IMV_SIQ> outputTempIterator = primaryInLoop.iterator();
                while (outputTempIterator.hasNext()) {
                    IMV_SIQ rowOutputTempIterator = outputTempIterator.next();
                    IMV_SIQ rowValueRowOutputTempIterator
                        = (IMV_SIQ) rowOutputTempIterator.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                    if (rowValueRowOutputTempIterator.containsKey(sets[3])) {
                        IMV_SIQ rowValueRowOutputTempIteratorCulumnValue
                            = (IMV_SIQ) rowValueRowOutputTempIterator.get(sets[3]);
                        if (!keyTemp.containsKey(rowValueRowOutputTempIteratorCulumnValue.get("culumnValue").toString())) {
                            keyTemp.put(rowValueRowOutputTempIteratorCulumnValue.get("culumnValue").toString(), "");
                            outputTemp.add(rowOutputTempIterator);
                        }
                    }
                }
                if (0 != rowList.size()) {
                    //辅循环
                    Iterator<IMV_SIQ> iterator = rowList.iterator();
                    Here:
                    while (iterator.hasNext()) {//非primaryInLoop
                        IMV_SIQ row = iterator.next();
                        IMV_SIQ rowValue
                            = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                        IMV_SIQ culumnValue = (IMV_SIQ) rowValue.get(sets[3]);
                        //outputTemp
                        if (rowValue.containsKey(sets[3])) {
                            if (!keyTemp.containsKey(culumnValue.get("culumnValue").toString())) {
                                keyTemp.put(culumnValue.get("culumnValue").toString(), "");
                                IMV_SIQ rowOutputTempIterator = new IMV_SIQ();
                                rowOutputTempIterator.put(S_ShellETL.SHELL_ETL_ROWVALUE, rowValue);
                                outputTemp.add(rowOutputTempIterator);
                            }
                        }
                    }
                }
                output.clear();
                output.addAll(outputTemp);
            }
        }

        //设计点 相交
        //PLETL:中节点|进行表格相交|主码为|ID|模式为|新增列;
        //PLETL:中节点|进行表格相交|主码为|ID|模式为|叠加列;
        //PLETL:中节点|进行表格相交|主码为|ID|模式为|有交集叠加列;
        //PLETL:中节点|进行表格相交|主码为|ID|模式为|有交集新增列;
        //PLETL:中节点|进行表格相交|主码为|ID|模式为|无交集新增列;
        if (sets[1].equalsIgnoreCase("进行表格相交")) {
            TinMap mapShell = null;
            String columnIdentify = null;
            if (sets[0].equalsIgnoreCase("中节点")) {
                mapShell = (TinMap) object.get(S_ShellETL.SHELL_ETL_MID_SHELL);
                columnIdentify = "m_";
            }
            if (sets[0].equalsIgnoreCase("下节点")) {
                mapShell = (TinMap) object.get(S_ShellETL.SHELL_ETL_DOWN_SHELL);
                columnIdentify = "d_";
            }
            //将上面进行内外循环 颠倒rotation 如下
            if (sets[2].equalsIgnoreCase("主码为")) {//先单一primary key, 之后再设计 forenge key 和 combination key
                //To do。。。初始
                IMV_SIQ tinShellETL
                    = (IMV_SIQ) mapShell.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
                List<IMV_SIQ> rowList = (List<IMV_SIQ>) tinShellETL.get("obj");
                //主循环
                List<IMV_SIQ> primaryInLoop = (List<IMV_SIQ>) object.get("obj");
                Iterator<IMV_SIQ> outputTempIterator = primaryInLoop.iterator();
                while (outputTempIterator.hasNext()) {
                    IMV_SIQ rowOutputTempIterator = outputTempIterator.next();
                    IMV_SIQ rowValueRowOutputTempIterator
                        = (IMV_SIQ) rowOutputTempIterator.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                    boolean findConjunction = false;
                    if (0 != rowList.size()) {
                        //辅循环
                        Iterator<IMV_SIQ> iterator = rowList.iterator();
                        while (iterator.hasNext()) {//非primaryInLoop
                            IMV_SIQ row = iterator.next();
                            IMV_SIQ rowValue
                                = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                            IMV_SIQ culumnValue = (IMV_SIQ) rowValue.get(sets[3]);
                            //outputTemp
                            if (rowValueRowOutputTempIterator.containsKey(sets[3])) {
                                IMV_SIQ rowValueRowOutputTempIteratorCulumnValue
                                    = (IMV_SIQ) rowValueRowOutputTempIterator.get(sets[3]);
                                //合并rowValueRowOutputTempIteratorCulumnValue 与 culumnValue
                                //合并方式, 1 叠加列合并 2 新增列合并
                                //先实现简单的 新增列合并
                                //在执行前进行sets[3]相等检查
                                if (rowValueRowOutputTempIteratorCulumnValue.get("culumnValue")
                                    .equals(culumnValue.get("culumnValue"))) {//以后命令多了优化
                                    findConjunction = true;
                                    if (sets[4].equalsIgnoreCase("模式为")) {
                                        model(sets, rowValue, columnIdentify, rowValueRowOutputTempIterator);
                                    }
                                }
                                //其他定状补语 函数
                                //。。。
                                //。。。
                                //。
                            }
                            rowOutputTempIterator.put(S_ShellETL.SHELL_ETL_ROWVALUE, rowValueRowOutputTempIterator);
                        }
                    }
                    if (true == findConjunction) {//有交集的行才保留
                        outputTemp.add(rowOutputTempIterator);
                    }
                }
            }
            //			if(sets[2].equalsIgnoreCase("自由定义各种命令。。")) {
            //			//To do。。。
            //		}
            output.clear();
            output.addAll(outputTemp);
        }

        //PLETL:中节点|进行表格剔除|主码为|ID|模式为|相交部分剔除;
        if (sets[1].equalsIgnoreCase("进行表格剔除")) {
            TinMap mapShell = null;
            String columnIdentify = null;
            if (sets[0].equalsIgnoreCase("中节点")) {
                mapShell = (TinMap) object.get(S_ShellETL.SHELL_ETL_MID_SHELL);
                columnIdentify = "m_";
            }
            if (sets[0].equalsIgnoreCase("下节点")) {
                mapShell = (TinMap) object.get(S_ShellETL.SHELL_ETL_DOWN_SHELL);
                columnIdentify = "d_";
            }

            //将上面进行内外循环 颠倒rotation 如下
            if (sets[2].equalsIgnoreCase("主码为")) {//先单一primary key, 之后再设计 forenge key 和 combination key
                //To do。。。初始
                IMV_SIQ tinShellETL
                    = (IMV_SIQ) mapShell.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
                List<IMV_SIQ> rowList = (List<IMV_SIQ>) tinShellETL.get("obj");
                //主循环
                List<IMV_SIQ> primaryInLoop = (List<IMV_SIQ>) object.get("obj");
                Iterator<IMV_SIQ> outputTempIterator = primaryInLoop.iterator();
                while (outputTempIterator.hasNext()) {
                    IMV_SIQ rowOutputTempIterator = outputTempIterator.next();
                    IMV_SIQ rowValueRowOutputTempIterator
                        = (IMV_SIQ) rowOutputTempIterator.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                    boolean findConjunction = false;
                    if (0 != rowList.size()) {
                        //辅循环
                        Iterator<IMV_SIQ> iterator = rowList.iterator();
                        while (iterator.hasNext()) {//非primaryInLoop
                            IMV_SIQ row = iterator.next();
                            IMV_SIQ rowValue
                                = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                            IMV_SIQ culumnValue = (IMV_SIQ) rowValue.get(sets[3]);
                            //outputTemp
                            if (rowValueRowOutputTempIterator.containsKey(sets[3])) {
                                IMV_SIQ rowValueRowOutputTempIteratorCulumnValue
                                    = (IMV_SIQ) rowValueRowOutputTempIterator.get(sets[3]);
                                //合并rowValueRowOutputTempIteratorCulumnValue 与 culumnValue
                                //合并方式, 1 叠加列合并 2 新增列合并
                                //先实现简单的 新增列合并
                                //在执行前进行sets[3]相等检查
                                if (rowValueRowOutputTempIteratorCulumnValue.get("culumnValue")
                                    .equals(culumnValue.get("culumnValue"))) {//以后命令多了优化
                                    findConjunction = true;
                                }
                                //其他定状补语 函数
                                //。。。
                                //。。。
                                //。
                            }
                            rowOutputTempIterator.put(S_ShellETL.SHELL_ETL_ROWVALUE, rowValueRowOutputTempIterator);
                        }
                    }
                    if (false == findConjunction) {//无交集的行才保留
                        outputTemp.add(rowOutputTempIterator);
                    }
                }
            }
            //			if(sets[2].equalsIgnoreCase("自由定义各种命令。。")) {
            //			//To do。。。
            //		}
            output.clear();
            output.addAll(outputTemp);
        }
    }

    //之后这个定状补的函数我会分出去 结构化 罗瑶光 20211012
    @SuppressWarnings("unchecked")
    private static void model(String[] sets, IMV_SIQ rowValue, String columnIdentify
        , IMV_SIQ rowValueRowOutputTempIterator) {

        if (sets[5].equalsIgnoreCase("新增列")) {
            Iterator<String> iteratorCulumnValue = rowValue.keySet().iterator();
            while (iteratorCulumnValue.hasNext()) {
                String string = iteratorCulumnValue.next();
                IMV_SIQ culumnCell = (IMV_SIQ) rowValue.get(string);
                culumnCell.put(S_ShellETL.SHELL_ETL_CULUMNNAME, columnIdentify + string);
                rowValueRowOutputTempIterator.put(columnIdentify + string, culumnCell);
                //先这样, 测试下
            }
        }
        //叠加列
        if (sets[5].equalsIgnoreCase("叠加列")) {
            //列遍历
            Iterator<String> iteratorCulumnValue = rowValue.keySet().iterator();
            while (iteratorCulumnValue.hasNext()) {
                String string = iteratorCulumnValue.next();
                //列操作
                IMV_SIQ culumnCell = (IMV_SIQ) rowValue.get(string);
                if (rowValueRowOutputTempIterator.containsKey(string)) {
                    //有就叠加
                    IMV_SIQ culumnCellMain
                        = (IMV_SIQ) rowValueRowOutputTempIterator.get(string);
                    culumnCellMain.put("culumnValue", culumnCellMain.get("culumnValue").toString()
                        + culumnCell.get("culumnValue").toString());
                    rowValueRowOutputTempIterator.put(string, culumnCellMain);
                } else {
                    //没有就添加
                    culumnCell.put(S_ShellETL.SHELL_ETL_CULUMNNAME, columnIdentify + string);
                    rowValueRowOutputTempIterator.put(columnIdentify + string, culumnCell);
                }
            }
        }
        //有交集列 叠加
        if (sets[5].equalsIgnoreCase("有交集叠加列")) {
            //列遍历
            Iterator<String> iteratorCulumnValue = rowValue.keySet().iterator();
            while (iteratorCulumnValue.hasNext()) {
                String string = iteratorCulumnValue.next();
                //列操作
                IMV_SIQ culumnCell = (IMV_SIQ) rowValue.get(string);
                if (rowValueRowOutputTempIterator.containsKey(string)) {
                    //有就叠加
                    IMV_SIQ culumnCellMain
                        = (IMV_SIQ) rowValueRowOutputTempIterator.get(string);
                    culumnCellMain.put("culumnValue", culumnCellMain.get("culumnValue").toString()
                        + culumnCell.get("culumnValue").toString());
                    rowValueRowOutputTempIterator.put(string, culumnCellMain);
                }
            }
        }
        //有交集列 新增
        if (sets[5].contains("交集新增列")) {
            //列遍历
            Iterator<String> iteratorCulumnValue = rowValue.keySet().iterator();
            while (iteratorCulumnValue.hasNext()) {
                String string = iteratorCulumnValue.next();
                //列操作
                IMV_SIQ culumnCell = (IMV_SIQ) rowValue.get(string);
                if (sets[5].equalsIgnoreCase("有交集新增列")) {
                    if (rowValueRowOutputTempIterator.containsKey(string)) {
                        culumnCell.put(S_ShellETL.SHELL_ETL_CULUMNNAME, columnIdentify + string);
                        rowValueRowOutputTempIterator.put(columnIdentify + string, culumnCell);
                    }
                } else if (sets[5].equalsIgnoreCase("无交集新增列")) {
                    if (!rowValueRowOutputTempIterator.containsKey(string)) {
                        culumnCell.put(S_ShellETL.SHELL_ETL_CULUMNNAME, columnIdentify + string);
                        rowValueRowOutputTempIterator.put(columnIdentify + string, culumnCell);
                    }
                }
            }
        }
        //相交部分剔除
    }
}
