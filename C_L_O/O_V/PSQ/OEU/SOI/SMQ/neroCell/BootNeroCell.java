/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package OPE.PSQ.OEU.SOI.SMQ.neroCell;

import ME.VPC.M.app.App;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_chansfer;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.PEI.PCI.PSI.tinShell.AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import S_I.OSI.PEI.PCI.PSI.tinShell.AddTinShellRun;
import S_I.OSI.PEI.PCI.PSI.tinShell.AddTinShellView;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Iterator;
import java.util.Map;

//作者 +著作权人： 罗瑶光, 浏阳
public class BootNeroCell {
    public static void bootCell(LinkNode linkNode, JTextPane rightBotJTextPane
            , ThisCanvas canvas, App NE) {
        Map<String, LinkNode> bootMaps = new IMV_SIQ();
        LinkNode currentNode = linkNode;
        while (null != currentNode) {
            bootMaps.put(currentNode.primaryKey, currentNode);
            currentNode = currentNode.next;
        }
        Map<String, Boolean> bootedMaps = new IMV_SIQ();
        //准备写深度搜索来做神经流传导, 先更新下版本 1.0.3_beta, 这几天完善。20190617 8：28 罗瑶光
        //我在思考设计一个vpcs 执行器来做etlshell节点的 刷新-初始-保存-执行四个线。
        //早期的模式是简单的执行配置 保存运行 查看, , 现在我要改成 在执行之前确认要保存配置,
        //同时还要执行前更新命令行。看下怎么改更快。
        Iterator<String> iterator;
        while (0 < bootMaps.size()) {
            iterator = bootMaps.keySet().iterator();
            Here:
            while (iterator.hasNext()) {
                currentNode = bootMaps.get(iterator.next());
                if (bootedMaps.containsKey(currentNode.primaryKey)) {
                    continue Here;
                }
                if (currentNode.tBeconnect && !bootedMaps.containsKey(currentNode
                        .tBeconnectPrimaryKey)) {
                    continue Here;
                }
                if (currentNode.mBeconnect && !bootedMaps.containsKey(currentNode
                        .mBeconnectPrimaryKey)) {
                    continue Here;
                }
                if (currentNode.dBeconnect && !bootedMaps.containsKey(currentNode
                        .dBeconnectPrimaryKey)) {
                    continue Here;
                }
                if (null != currentNode.thisFace && currentNode.thisFace.isConfiged) {
                    //配置回复
                    currentNode.thisFace.memoryRecovery(rightBotJTextPane);
                    //取值
                    //问题找到了因为map存储的是父类节点, 所以子类的下放不能new,
                    //如果new就被新的代替了, 准备改写。罗瑶光20211103 22:35
                    new OSGI_chansfer(currentNode, linkNode);
                    TinMap tinmapTop = null;
                    TinMap tinmapMid = null;
                    TinMap tinmapDown = null;
                    if (null != currentNode.thisFace._SQ__OPE_OPC_ECI.topOutput) {
                        tinmapTop = currentNode.thisFace._SQ__OPE_OPC_ECI.topOutput.clone();
                    }
                    if (null != currentNode.thisFace._SQ__OPE_OPC_ECI.midOutput) {
                        tinmapMid = currentNode.thisFace._SQ__OPE_OPC_ECI.midOutput.clone();
                    }
                    if (null != currentNode.thisFace._SQ__OPE_OPC_ECI.downOutput) {
                        tinmapDown = currentNode.thisFace._SQ__OPE_OPC_ECI.downOutput.clone();
                    }
                    //配置, 无耻猫腻
                    ((AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) (currentNode.thisFace))
                            .MEI_MSU(null, null);
                    //稍后我会把null改成异常捕获。
                    //运行
                    currentNode.thisFace._SQ__OPE_OPC_ECI.topOutput = tinmapTop;
                    currentNode.thisFace._SQ__OPE_OPC_ECI.midOutput = tinmapMid;
                    currentNode.thisFace._SQ__OPE_OPC_ECI.downOutput = tinmapDown;
                    currentNode.thisFace.OPE_E(rightBotJTextPane, NE);
                    //if(is etlnode) { 开始设计 tinshell一键执行。
                    //	currentNode.thisFace.刷新
                    //	currentNode.thisFace.初始
                    //	currentNode.thisFace.保存
                    //	currentNode.thisFace.执行
                    //}
                    if (currentNode.thisFace._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.equals("Tin语shell脚本")) {
                        //	//currentNode
                        //		//先从thisface里面找到执行的函数, 然后执行的函数里面自动激活3个button就是了。
                        //		//莫名脸发热, 耳朵发涨, 腹痛, 眼睛模糊, 脑袋不能想事情。那就文字记录下
                        //		//调试好了, 就差关联节点的上一节点传入参数检验和测试了。
                        //configre录入上一节点数据
                        //((AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI)(currentNode.thisFace)).MEI_MSU(null, null);
                        //稍后我会把null改成异常捕获。
                        //
                        //		((AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI)(currentNode.thisFace)).addTinShellRun.bootAsDoc();
                        AddTinShellRun addTinShellRun
                                = (AddTinShellRun) currentNode.thisFace._SQ__OPE_OPC_ECI;
                        addTinShellRun.topOutput = tinmapTop;
                        addTinShellRun.midOutput = tinmapMid;
                        addTinShellRun.downOutput = tinmapDown;
                        addTinShellRun.bootAsDoc((AddTinShellView) (currentNode
                                        .thisFace._SQ__OVQ_OSQ_VSQ)
                                , (AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) (currentNode
                                        .thisFace));
                    }
                    bootedMaps.put(currentNode.primaryKey, true);
                    bootMaps.remove(currentNode.primaryKey);
                } else {
                    //报没有配置异常；弹出配置面板；
                    currentNode.thisFace.MEI_MSU(rightBotJTextPane, canvas);
                    currentNode.thisFace._SQ__AOU_AOQ_VES
                            .setLocation(currentNode.x, currentNode.y);
                    currentNode.thisFace._SQ__AOU_AOQ_VES.setSize(300, 300);
                    currentNode.thisFace._SQ__AOU_AOQ_VES.setResizable(true);
                    currentNode.thisFace._SQ__AOU_AOQ_VES.scrollPane
                            .setBounds(0, 0, currentNode.thisFace._SQ__AOU_AOQ_VES
                                    .getWidth() - 10, currentNode.thisFace._SQ__AOU_AOQ_VES
                                    .getHeight() - 45);
                    currentNode.thisFace._SQ__AOU_AOQ_VES
                            .panel.setPreferredSize(new Dimension(800, 600));
                    currentNode.thisFace._SQ__AOU_AOQ_VES.setBackground(Color.BLUE);
                    currentNode.thisFace._SQ__AOU_AOQ_VES.setVisible(true);
                    currentNode.thisFace._SQ__AOU_AOQ_VES.validate();
                    return;
                }
            }
        }
    }
}
