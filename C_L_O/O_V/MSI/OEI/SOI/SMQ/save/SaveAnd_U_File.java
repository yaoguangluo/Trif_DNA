/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package OPE.MSI.OEI.SOI.SMQ.save;

import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import S_A.SVQ.stable.S_Common;

import java.io.File;
import java.io.FileWriter;

//作者 +著作权人： 罗瑶光, 浏阳
public class SaveAnd_U_File {
    public static void U_(String fileCurrentpath, LinkNode first) {
        //delete file
        File file = new File(fileCurrentpath);
        if (file.exists() && file.isFile()) {
            file.delete();
        }
        //save
        String fileSavepath = fileCurrentpath;
        //20230106-System.out.println(fileSavepath);
        //create file and save
        try {
            FileWriter fileWriter = new FileWriter(fileSavepath);
            LinkNode node = first;
            while (null != node) {
                //挨个取。没难度。逐个把信息写入文件。
                //节点坐标, jieDianMing, 节点关联,
                String NodeCoordinationX = S_Common.STRING_EMPTY + node.x;
                String NodeCoordinationY = S_Common.STRING_EMPTY + node.y;
                String NodeName = S_Common.STRING_EMPTY + node.name;
                String NodeID = "" + node.ID;
                String flash = "" + node.flash;
                String beconnect = S_Common.STRING_EMPTY + node.beconnect;
                String leftChoose = S_Common.STRING_EMPTY + node.leftChoose;
                String rightChoose = S_Common.STRING_EMPTY + node.rightChoose;
                String tBeconnect = S_Common.STRING_EMPTY + node.tBeconnect;
                String tBeconnectX = S_Common.STRING_EMPTY + node.tBeconnectX;
                String tBeconnectY = S_Common.STRING_EMPTY + node.tBeconnectY;
                String tBeconnectName = S_Common.STRING_EMPTY + node.tBeconnectName;
                String tBeconnectID = S_Common.STRING_EMPTY + node.tBeconnectID;
                //String tBeconnectPrimaryKey= S_Common.STRING_EMPTY+ node.dBeconnectPrimaryKey;
                String tBeconnectPrimaryKey = S_Common.STRING_EMPTY + node.tBeconnectPrimaryKey;
                String mBeconnect = S_Common.STRING_EMPTY + node.mBeconnect;
                String mBeconnectX = S_Common.STRING_EMPTY + node.mBeconnectX;
                String mBeconnectY = S_Common.STRING_EMPTY + node.mBeconnectY;
                String mBeconnectName = S_Common.STRING_EMPTY + node.mBeconnectName;
                String mBeconnectID = S_Common.STRING_EMPTY + node.mBeconnectID;
                String mBeconnectPrimaryKey = S_Common.STRING_EMPTY + node.mBeconnectPrimaryKey;
                String dBeconnect = S_Common.STRING_EMPTY + node.dBeconnect;
                String dBeconnectX = S_Common.STRING_EMPTY + node.dBeconnectX;
                String dBeconnectY = S_Common.STRING_EMPTY + node.dBeconnectY;
                String dBeconnectName = S_Common.STRING_EMPTY + node.dBeconnectName;
                String dBeconnectID = S_Common.STRING_EMPTY + node.dBeconnectID;
                String dBeconnectPrimaryKey = S_Common.STRING_EMPTY + node.dBeconnectPrimaryKey;
                String primaryKey = S_Common.STRING_EMPTY + node.primaryKey;
                String nodeConfiguration = S_Common.STRING_EMPTY + node.thisFace.nodeConfiguration;
                String isConfiged = S_Common.STRING_EMPTY + node.thisFace.isConfiged;
                String isExecuted = S_Common.STRING_EMPTY + node.thisFace.isExecuted;
                //配置
                fileWriter.write("\r\n");
                fileWriter.write("NodeCoordinationX:" + NodeCoordinationX);
                fileWriter.write("\r\n");
                fileWriter.write("NodeName:" + NodeName);
                fileWriter.write("\r\n");
                fileWriter.write("NodeCoordinationY:" + NodeCoordinationY);
                fileWriter.write("\r\n");
                fileWriter.write("NodeID:" + NodeID);
                fileWriter.write("\r\n");
                fileWriter.write("flash:" + flash);
                fileWriter.write("\r\n");
                fileWriter.write("beconnect:" + beconnect);
                fileWriter.write("\r\n");
                fileWriter.write("leftChoose:" + leftChoose);
                fileWriter.write("\r\n");
                fileWriter.write("rightChoose:" + rightChoose);
                fileWriter.write("\r\n");
                fileWriter.write("tBeconnect:" + tBeconnect);
                fileWriter.write("\r\n");
                fileWriter.write("tBeconnectX:" + tBeconnectX);
                fileWriter.write("\r\n");
                fileWriter.write("tBeconnectY:" + tBeconnectY);
                fileWriter.write("\r\n");
                fileWriter.write("tBeconnectName:" + tBeconnectName);
                fileWriter.write("\r\n");
                fileWriter.write("tBeconnectID:" + tBeconnectID);
                fileWriter.write("\r\n");
                fileWriter.write("tBeconnectPrimaryKey:" + tBeconnectPrimaryKey);
                fileWriter.write("\r\n");
                fileWriter.write("mBeconnect:" + mBeconnect);
                fileWriter.write("\r\n");
                fileWriter.write("mBeconnectX:" + mBeconnectX);
                fileWriter.write("\r\n");
                fileWriter.write("mBeconnectY:" + mBeconnectY);
                fileWriter.write("\r\n");
                fileWriter.write("mBeconnectName:" + mBeconnectName);
                fileWriter.write("\r\n");
                fileWriter.write("mBeconnectID:" + mBeconnectID);
                fileWriter.write("\r\n");
                fileWriter.write("mBeconnectPrimaryKey:" + mBeconnectPrimaryKey);
                fileWriter.write("\r\n");
                fileWriter.write("dBeconnect:" + dBeconnect);
                fileWriter.write("\r\n");
                fileWriter.write("dBeconnectX:" + dBeconnectX);
                fileWriter.write("\r\n");
                fileWriter.write("dBeconnectY:" + dBeconnectY);
                fileWriter.write("\r\n");
                fileWriter.write("dBeconnectName:" + dBeconnectName);
                fileWriter.write("\r\n");
                fileWriter.write("dBeconnectID:" + dBeconnectID);
                fileWriter.write("\r\n");
                fileWriter.write("dBeconnectPrimaryKey:" + dBeconnectPrimaryKey);
                fileWriter.write("\r\n");
                fileWriter.write("primaryKey:" + primaryKey);
                fileWriter.write("\r\n");
                fileWriter.write("nodeConfiguration:" + nodeConfiguration);
                fileWriter.write("\r\n");
                fileWriter.write("isConfiged:" + isConfiged);
                fileWriter.write("\r\n");
                fileWriter.write("isExecuted:" + isExecuted);
                fileWriter.write("\r\n");
                //分割
                String split = "##############################";
                fileWriter.write("\r\n");
                fileWriter.write(split);
                fileWriter.flush();
                if (null == node.next) {
                    break;
                }
                node = node.next;
            }
            fileWriter.close();
        } catch (Exception saveFile) {

        }
    }
}
