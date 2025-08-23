package ME.VPC.V.config;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.ShellJPanel_X_S;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_chansfer;
import OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_findNode;
import O_V.OSA.shell.XA_ShellTables;
import O_V.OSM.shell.E_pl_XA_E;
import S_A.SVQ.stable.S_ShellETL;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ShellJPanel extends ShellJPanel_X_S {
    /**
     * 稍后进行优化成 申请版权的格式。
     * 罗瑶光
     */
    //
    //App NE;

    public ShellJPanel(OSU_MCI_MCU_MSI addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
        , App app, OSU_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ
        , TinMap topOutput, TinMap midOutput, TinMap downOutput) {
        NE = app;//later duplication*/
        jlabel_box = new JCheckBox[30];
        this.setLayout(null);
        this.setBounds(0, 0, 800, 600);
        this.setBackground(Color.BLACK);
        //copy tab
        jlabel_button = new M_V.MVQ.button.DetaButton("清空命令");
        jlabel_button.setBounds(10, 20, 100, 30);
        jlabel_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //				tabNamesHook[0]= true;
                //				isConfig= false;
                jTextPane.setText("");
                jTextPane.updateUI();
                app.app_S.jTabbedpane.validate();
                app.validate();
            }
        });
        this.add(jlabel_button);

        jlabel_button_clear = new M_V.MVQ.button.DetaButton("清空刷新");
        jlabel_button_clear.setBounds(10 + 1 * (100 + 30), 20, 100, 30);
        jlabel_button_clear.addActionListener(new ActionListener() {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                NE.validate();
                if (null != addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration) {
                    if (!addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration
                        .replace(" ", "").isEmpty()) {
                        jTextPane.setText(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration);
                    }
                }
                if (null != topOutput) {
                    _SQ__OVQ_OSQ_VSQ.outputOut = topOutput.clone();
                }
                Object object = _SQ__OVQ_OSQ_VSQ.outputOut.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
                TinMap map = (TinMap) object;
//                TinMap map = (TinMap) _SQ__OVQ_OSQ_VSQ.outputOut
//                    .get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
                if (null != midOutput && null != map) {
                    map.put(S_ShellETL.SHELL_ETL_MID_SHELL, midOutput.clone());
                }
                if (null != downOutput && null != map) {
                    map.put(S_ShellETL.SHELL_ETL_DOWN_SHELL, downOutput.clone());
                }
                if (null != map) {
                    _SQ__OVQ_OSQ_VSQ.outputOut
                        .put(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL, map);
                }

                outputjTextPane.setText("\"正在使用 养疗经 1.9.5.5.6 Tin Shell系统(9.5.5.6) . . .\"");
                outputjTextPane.updateUI();
                //				app.jTabbedpane.validate();
                app.validate();
            }
        });
        this.add(jlabel_button_clear);

        jlabel_init_button = new M_V.MVQ.button.DetaButton("初始脚本");
        jlabel_init_button.setBounds(10 + 2 * (100 + 30), 20, 100, 30);
        jlabel_init_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (null != app) {
                    //
                    try {
                        NE.app_S.studyVerbaMap.init_SMV(NE);
                    } catch (NoSuchFieldException ex) {
                        throw new RuntimeException(ex);
                    } catch (InstantiationException ex) {
                        throw new RuntimeException(ex);
                    } catch (IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    } catch (ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                    //*/
                    app.app_S.jTabbedpane.validate();
                    app.validate();
                    //检测脚本综合分类、
                    //分类执行脚本编译机
                    //
                    if (null != NE) {
                        XA_ShellTables.addInitSearchShellTable(NE);
                    }
                    outputjTextPane.setText("已经初始脚本数据。。注意指令长度最大为3000字");
                    outputjTextPane.updateUI();
                    app.app_S.jTabbedpane.validate();
                    app.validate();
                    //我在思考怎么确定node。这里需要通过在一个id来确定node就好办了。
                    //我想到一种方法, 在config和 run 两个函数中就登记这个node id先。之后取值就清楚了。
                    //罗瑶光20220711
                    //设计一个LinkNode thisNodeInfo, 然后再导入。
                    //先找node
                    LinkNode node = null;
                    if (null != addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.primaryInterfaceKeyID) {
                        node = new OSGI_findNode()
                            .findNode(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.primaryInterfaceKeyID
                                , app.app_S.gUISample.first.first);
                    }
                    //再刷新node
                    if (null != node) {
                        new OSGI_chansfer(node, app.app_S.gUISample.first.first);
                    }
                }
            }
        });
        this.add(jlabel_init_button);

        jlabel_debug_button = new M_V.MVQ.button.DetaButton("保存脚本");
        jlabel_debug_button.setBounds(10 + 3 * (100 + 30), 20, 100, 30);
        jlabel_debug_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (null != app) {
                    app.app_S.jTabbedpane.validate();
                    app.validate();
                    //检测脚本综合分类、
                    //分类执行脚本编译机
                    addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration
                        = jTextPane.getText().toString();
                }
            }
        });
        this.add(jlabel_debug_button);

        jlabel_flush_button = new M_V.MVQ.button.DetaButton("执行脚本");
        jlabel_flush_button.setBounds(10 + 4 * (100 + 30), 20, 100, 30);
        jlabel_flush_button.addActionListener(new ActionListener() {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                if (null != app) {
                    app.app_S.jTabbedpane.validate();
                    app.validate();
                    //检测脚本综合分类、
                    //分类执行脚本编译机
                    if (null != addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration) {
                        if (!addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration
                            .replace(" ", "").isEmpty()) {
                            jTextPane.setText(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration);
                        }
                    }

                    //在刷新输入值后, 将最新的tinshell进行取值
                    LinkNode node = null;
                    if (null != addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.primaryInterfaceKeyID) {
                        node = new OSGI_findNode()
                            .findNode(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.primaryInterfaceKeyID
                                , app.app_S.gUISample.first.first);
                        if (null != node.thisFace._SQ__OPE_OPC_ECI.topOutput) {
                            _SQ__OVQ_OSQ_VSQ.outputOut
                                = node.thisFace._SQ__OPE_OPC_ECI.topOutput.clone();
                        }
                        Object object = _SQ__OVQ_OSQ_VSQ.outputOut.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
                        TinMap map = (TinMap) object;
                        if (null != node.thisFace._SQ__OPE_OPC_ECI.midOutput && null != map) {
                            map.put(S_ShellETL.SHELL_ETL_MID_SHELL
                                , node.thisFace._SQ__OPE_OPC_ECI.midOutput.clone());
                        }
                        if (null != node.thisFace._SQ__OPE_OPC_ECI.downOutput && null != map) {
                            map.put(S_ShellETL.SHELL_ETL_DOWN_SHELL
                                , node.thisFace._SQ__OPE_OPC_ECI.downOutput.clone());
                        }
                        if (null != map) {
                            _SQ__OVQ_OSQ_VSQ.outputOut
                                .put(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL, map);
                        }
                    }
                    //执行shell
                    String plSearch = jTextPane.getText();
                    try {
                        if (!_SQ__OVQ_OSQ_VSQ.outputOut.containsKey(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL)) {
                            _SQ__OVQ_OSQ_VSQ.outputOut.put(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL
                                , new TinMap());
                        }
                        //数据进行医学部分剔除出去后，map null问题later
                        //1数据库关键字全部中文化。
                        //2脚本语言关键字全部中文化。
                        //3医学部分剔除后成为xls表格，以后所有shell语言都要修改为支持读xls缓存。
                        //later
                        //TinMap tinMap = (TinMap) _SQ__OVQ_OSQ_VSQ.outputOut.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
                        Object object = _SQ__OVQ_OSQ_VSQ.outputOut.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
                        TinMap tinMap = (TinMap) object;
                        output = E_pl_XA_E.E_pl_XA(plSearch.replace("\r\n", ""), false
                            , tinMap, NE);//later
                        //开始涉及PLETL, 于是 上中下都要, 就把outputOut 完整代入VPCS函数。
                        //更新
                        //计算完后去除output的 mid down 部分
                        if (output.containsKey(S_ShellETL.SHELL_ETL_MID_SHELL)) {
                            output.remove(S_ShellETL.SHELL_ETL_MID_SHELL);
                        }
                        if (output.containsKey(S_ShellETL.SHELL_ETL_DOWN_SHELL)) {
                            output.remove(S_ShellETL.SHELL_ETL_DOWN_SHELL);
                        }
                        _SQ__OVQ_OSQ_VSQ.outputOut.put(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL, output);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                    //输出 检测
                    outputjTextPane.setContentType("text/html");
                    NE.app_S.appConfig.SectionJPanel.jTextPane.setText("end:" + output.size());
                    Iterator<String> iterator = output.keySet().iterator();
                    if (stringBuilder.length() > 0) {
                        stringBuilder.delete(0, stringBuilder.length() - 1);
                    }
                    int max = 50;
                    int i = 0;
                    while (iterator.hasNext()) {
                        if (i++ > max) {
                            break;
                        }
                        String string = iterator.next();
                        NE.app_S.appConfig.SectionJPanel.jTextPane.setText(output.get(string).toString());
                        stringBuilder.append("/r/n" + output.get(string).toString());
                    }
                    //稍后涉及分页20211001
                    stringBuilder = stringBuilder.length() > 300000 ? stringBuilder.delete(300000
                        , stringBuilder.length()) : stringBuilder;
                    outputjTextPane.setText(stringBuilder.toString());
                    outputjTextPane.validate();
                    if (plSearch.contains("界面操作")) {
                        int count = app.app_S.newTableModel.getRowCount() < 30
                            ? app.app_S.newTableModel.getRowCount() : 30;
                        for (int j = 0; j < count; j++) {//默认中药表格
                            stringBuilder.append("/r/n/r/n" + app.app_S.newTableModel.getValueAt(j, 2)
                                + "----" + app.app_S.newTableModel.getValueAt(j, 4));
                        }
                    }
                }
            }
        });
        this.add(jlabel_flush_button);

        jTextPane = new JTextPane();
        JScrollPane jsp_jTextPane = new JScrollPane(jTextPane);
        jsp_jTextPane.setBounds(10 + 0 * 150, 20 + 1 * 15 + 30, 765, 220);
        //稍后出了nodeConfiguration map
        boolean nodeConfiguration = false;
        if(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI==null){
            return;
        }
        if (null != addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration) {
            if (!addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration.isEmpty()) {
                nodeConfiguration = true;
            }
        }
        if (nodeConfiguration) {
            jTextPane.setText(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration);
        } else {
            jTextPane.setText("首先获取一个表，名字是药食同源，如果有这个表，准备下一步选择;\r\n" +
                "条件为:和:功效|DNN搜索|功效|菜谱|4;\r\n" +
                "条件为:和:中药名称|包含|菜谱;\r\n" +
                "条件为:和:风险规避|不包含|孕;\r\n" +
                "条件为:和:性味|不包含|凉;\r\n" +
                "条件为:和:性味|不包含|咸;\r\n" +
                "获取列名:中药名称:打分:功效;\r\n" +
                "在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n" +
                "操作:0|行至|30;\r\n" +
                "操作:中药名称|颜色标记为|红色;");

        }
        this.add(jsp_jTextPane);
        outputjTextPane = new JTextPane();
        JScrollPane jsp_outputjTextPane = new JScrollPane(outputjTextPane);
        jsp_outputjTextPane.setBounds(10 + 0 * 150, 20 + 1 * 15 + 30 + 250, 765, 350);
        outputjTextPane.setText("\"正在使用 养疗经 2.0.0.2.9 Tin Shell系统(0.0.2.9) . . .\"");
        this.add(jsp_outputjTextPane);
        //jTextPane.setText("正在使用 养疗经 1.8.8.8.0 Tin Shell系统(8.8.8.0) . . .");
    }
}
//69~
//tabNamesHook[0]= true;
//isConfig= false;
//清空的时候避免output 重叠计算
//_SQ__OVQ_OSQ_VSQ.outputOut.remove(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
//if(null!= topOutput) {

//将原来的
//outputout
//tinsheletl midshell  downshell
//结构改为
//outputout
//tinsheletl
//midshell  downshell
//读取文件到node.thisFace, 再到 addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
//, 准备写成一种更简洁的传入参数模式。稍后
//罗瑶光

//269~
//jTextPane.setText("tableName:中药同源:select;\r\n"
//				+ "condition:or:功效|contains|清热:功效|contains|解毒;\r\n"
//				+ "condition:and:性味|!contains|热:脉络|contains|肺;\r\n"
//				+ "condition:and:风险规避|fliter|毒:风险规避|fliter|孕;\r\n"
//				+ "getCulumns:功效:风险规避|as|风险:脉络:性味:中药名称|as|药名;\r\n"
//				+ "aggregation:风险|color|yellow;\r\n"
//				+ "aggregation:药名|color|red;\r\n"
//				+ "aggregation:功效|parser|pos;\r\n"
//				+ "aggregation:0|limit|20;\r\n"
//				+ "aggregation:药名|sortString|increment;");

//		jTextPane.setText("表名:中药同源:选择;\r\n"
//				+ "条件:或:功效|包含|清热:功效|包含|解毒;\r\n"
//				+ "条件:和:性味|不包含|热:脉络|包含|肺;\r\n"
//				+ "条件:和:风险规避|过滤|毒:风险规避|过滤|孕;\r\n"
//				+ "获取列名:功效:风险规避|改名|风险:脉络:性味:中药名称|改名|药名;\r\n"
//				+ "操作:风险|颜色|黄色;\r\n"
//				+ "操作:药名|颜色|红色;\r\n"
//				+ "操作:功效|分词|词性;\r\n"
//				+ "操作:0|行至|20;\r\n"
//				+ "操作:药名|字符排序|从小到大;");
//稍后改名		
//		jTextPane.setText("获取表名:中药同源:进行选择;
//		条件为:和:功效|jingDuSouSuo|风热咳嗽|0;
//		条件为:和:中药名称|字符串长度大于|3;
//		条件为:或:功效|包含|清热解毒:功效|包含|利尿;
//		条件为:和:性味|不包含|温:脉络|包含|肺;
//		条件为:和:风险规避|过滤掉|毒:风险规避|过滤掉|孕;
//		获取类表名:功效:风险规避|改名为|风险:脉络:性味:中药名称|改名为|药名;
//		操作:0|行至|20;
//		操作:风险|颜色标记为|黄色;
//		操作:药名|颜色标记为|红色;
//		操作:功效|进行分词|DNN;
//				+ "操作:药名|进行字符排序|从小到大;");
//结果出西瓜

/*287~
 * ("获取表名:中医诊断:进行选择;\r\n"
		+ "条件为:和:笔记|包含|发热:笔记|包含|身重;\r\n"
		+ "获取类表名:ID:病症;\r\n"
		+ "操作:0|行至|30;\r\n"
		+ "操作:病症|进行分词|词性显色;\r\n"
		+ "操作:ID|进行数字排序|从小到大;"
		+ "操作:ID|颜色标记为|红色;");
 * */
//	+ "操作:药名|进行字符排序|从小到大;");
//  + "PLETL:中节点|进行表格合并|主码为|ID|模式为|新增列;"

//  下面这个五个命令 rest命令 首先符号冲突,
//  + "定义:变量1|://localhost......;" (正在设计)//稍后。

//  + "PLTCP:病症|进行WEB请求|接口为|localhost|端口为|8000|操作为|分词;"
//  + "PLTCP:病症|进行WEB请求|接口为|localhost|端口为|8000|操作为|DNN;"
//  + "PLTCP:病症|进行WEB请求|接口为|localhost|端口为|8000|操作为|POS;"

//  + "PLETL:该节点|进行输出|模式为|打印;" (正在设计)
//  + "PLETL:该节点|进行保存|模式为|文件|路径为|F盘|巴拉/巴拉小魔仙/。。。。.lyg;" (正在设计)
//  + "PLETL:文档|进行执行|时间为|时间戳|路径为|D盘|巴拉巴拉小魔仙/。。。。.etl;" (正在设计)
