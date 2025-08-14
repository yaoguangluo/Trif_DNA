package O_V.OSI.AOP.MEC.SIQ.pletl;

import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import ME.VPC.M.app.App;
import OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroCell;
import S_A.pheromone.IMV_SIQ;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.File_X_Load;

import javax.swing.JTextPane;
import java.io.File;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class PLETL_E implements PLETL_C {
    @Override
    public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
        , String documentFlowAddress, IMV_SIQ inputMap, App NE) {
        //很好的将 《德塔socket plsql数据库》 和 《德塔 ETL》变成脑的记忆和计算中枢配合。
        //别急, 这个组合虽然没有自主意识, 但是已经形成了VPCS计算神经元的单株 锥形。20200322 罗瑶光
        try {
            String fileCurrentpath = documentFlowAddress;
            File file = new File(fileCurrentpath);
            if (!file.isFile()) {
                //20230106-System.out.println(S_Annotation.ATTENSION_RECHOICE);
                return false;
            }
            LinkNode needDeleteNode = first.first;
            while (needDeleteNode != null) {
                first.first = first.deletNode(first.first, needDeleteNode.name
                    , needDeleteNode.ID, needDeleteNode.primaryKey);
                if (null == needDeleteNode.next) {
                    break;
                }
                needDeleteNode = needDeleteNode.next;
            }
            first.first = File_X_Load._E(first.first, nodeView, file, first, NE);
            BootNeroCell.bootCell(first.first, rightBotJTextPane, null, NE);
        } catch (Exception loadE) {
            loadE.printStackTrace();
        }
        return true;
    }
    //大爱如此
}
