package OSI.OPE.OEI.PVI.SOI.SMQ.load;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import ME.VPC.M.app.App;
import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.Sort;
import S_A.SVQ.stable.S_Token;
import S_A.pheromone.IMV_SIQ;
import exception.file.O.DetaBufferedReader;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///稍后hook 进行 异常修整 20230218
public class File_X_Load {
    public static LinkNode _E(LinkNode first, NodeShow nodeView, File file
        , LinkList thislist, App NE) {
        //get path
        IMV_SIQ nodeMap = new IMV_SIQ();
        try {
            InputStream in = Files.newInputStream(file.toPath());
            DetaBufferedReader cReader = new DetaBufferedReader(
                new InputStreamReader(in));
            //稍后hook 进行 异常修整 20230218
            InputStream inKey = Files.newInputStream(Paths.get(file.getPath() + ".dna"));
            DetaBufferedReader cReaderKey = new DetaBufferedReader(
                new InputStreamReader(inKey));

            String ctempString;
            String ctempStringKey;
            IMV_SIQ currentNodeMap = new IMV_SIQ();
            while ((ctempString = cReader.readDetaLine()) != null
                && (ctempStringKey = cReaderKey.readDetaLine()) != null) {
                if (!ctempString.contains("######################")) {
//ctempString= new FullDNATokenPDI().initonDeSect(ctempString);
                    //文字变数字再变元基, 进行修正。罗瑶光20211106
//String lock= "AISD>_<111111111111111
                    //>_<111111111111111111111111111111111111111111111111111111111
                    //			11111111111111111111111111111111111111111111111111"
//		+ ">_<1111111111111111>_<10111011101101101110110110110110111011011011101110110110"
//		+ "1101101101101101110110110111011011011011011011011101101101101101101110110111011101";
                    //ctempString
                    if (!ctempString.isEmpty()) {
                        String[] MD5dice_DNA = ctempStringKey.split(S_Token.ETL_SYMBOL_SMILL);
                        //开始解密
                        //这里因为dna加密, 概率钥匙不可控, 不可逆, 变不回来, 于是采用简单的锁加密。
                        ctempString = File_X_getOrigianlTextByLock._E(ctempString, MD5dice_DNA[0]);
                        ctempString = new FullDNATokenPDI().initonDeSect(ctempString);
                        if (ctempString.contains(S_Token.ETL_SYMBOL_PER)
                            && ctempString.split(S_Token.ETL_SYMBOL_PER).length > 1) {
                            currentNodeMap.putString(ctempString.split(S_Token.ETL_SYMBOL_PER)[0]
                                //读表分隔符号与tinshell指令分割冲突, 准备采用元基础加密换算。
                                , ctempString.replace(ctempString.split(S_Token.ETL_SYMBOL_PER)[0]
                                    + S_Token.ETL_SYMBOL_PER, ""));
                        }
                    }
                } else {
                    LinkNode node = new LinkNode();
//                    node.beconnect = currentNodeMap.containsKey(S_Token.ETL_BECONNECT)
//                        ? currentNodeMap.getString(S_Token.ETL_BECONNECT).contains(S_Token.ETL_SYMBOL_FALSE)
//                        ? false : true : false;
                    //trif-DL
                    node.beconnect = currentNodeMap.containsKey(S_Token.ETL_BECONNECT)
                        && (!currentNodeMap.getString(S_Token.ETL_BECONNECT).contains(S_Token.ETL_SYMBOL_FALSE));
                    node.dBeconnect = currentNodeMap.containsKey(S_Token.ETL_DBECONNECT)
                        && (!currentNodeMap.getString(S_Token.ETL_DBECONNECT).contains(S_Token.ETL_SYMBOL_FALSE));
                    node.dBeconnectID = currentNodeMap.containsKey(S_Token.ETL_DBECONNECT_ID)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_DBECONNECT_ID)) : 0;
                    node.dBeconnectPrimaryKey = currentNodeMap.containsKey
                        (S_Token.ETL_DBECONNECT_PRIMARY_KEY) ? currentNodeMap.getString
                        (S_Token.ETL_DBECONNECT_PRIMARY_KEY) : S_Token.ETL_SYMBOL_NULL;
                    node.dBeconnectX = currentNodeMap.containsKey(S_Token.ETL_DBECONNECT_X)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_DBECONNECT_X)) : 0;
                    node.dBeconnectY = currentNodeMap.containsKey(S_Token.ETL_DBECONNECT_Y)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_DBECONNECT_Y)) : 0;
                    node.dBeconnectName = currentNodeMap.containsKey(S_Token.ETL_DBECONNECT_NAME)
                        ? currentNodeMap.getString(S_Token.ETL_DBECONNECT_NAME) : S_Token.ETL_SYMBOL_NULL;
                    node.flash = currentNodeMap.containsKey(S_Token.ETL_FLASH)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_FLASH)) : 0;
                    node.ID = currentNodeMap.containsKey(S_Token.ETL_NODE_ID)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_NODE_ID)) : 0;
                    node.leftChoose = currentNodeMap.containsKey(S_Token.ETL_LEFT_CHOOSE)
                        && (!currentNodeMap.getString(S_Token.ETL_LEFT_CHOOSE).contains(S_Token.ETL_SYMBOL_FALSE));
                    node.mBeconnect = currentNodeMap.containsKey(S_Token.ETL_MBECONNECT)
                        && (!currentNodeMap.getString(S_Token.ETL_MBECONNECT).contains(S_Token.ETL_SYMBOL_FALSE));
                    node.mBeconnectID = currentNodeMap.containsKey(S_Token.ETL_MBECONNECT_ID)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_MBECONNECT_ID)) : 0;
                    node.mBeconnectPrimaryKey = currentNodeMap.containsKey
                        (S_Token.ETL_MBECONNECT_PRIMARY_KEY) ? currentNodeMap.getString
                        (S_Token.ETL_MBECONNECT_PRIMARY_KEY) : S_Token.ETL_SYMBOL_NULL;
                    node.mBeconnectX = currentNodeMap.containsKey(S_Token.ETL_MBECONNECT_X)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_MBECONNECT_X)) : 0;
                    node.mBeconnectY = currentNodeMap.containsKey(S_Token.ETL_MBECONNECT_Y)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_MBECONNECT_Y)) : 0;
                    node.mBeconnectName = currentNodeMap.containsKey(S_Token.ETL_MBECONNECT_NAME)
                        ? currentNodeMap.getString(S_Token.ETL_MBECONNECT_NAME) : S_Token.ETL_SYMBOL_NULL;
                    node.name = currentNodeMap.containsKey(S_Token.ETL_NODE_NAME)
                        ? currentNodeMap.getString(S_Token.ETL_NODE_NAME) : S_Token.ETL_SYMBOL_NULL;
                    node.rightChoose = currentNodeMap.containsKey(S_Token.ETL_RIGHT_CHOOSE)
                        && (!currentNodeMap.getString(S_Token.ETL_RIGHT_CHOOSE).contains(S_Token.ETL_SYMBOL_FALSE));
                    node.tBeconnect = currentNodeMap.containsKey(S_Token.ETL_TBECONNECT)
                        && (!currentNodeMap.getString(S_Token.ETL_TBECONNECT).contains(S_Token.ETL_SYMBOL_FALSE));
                    node.tBeconnectID = currentNodeMap.containsKey(S_Token.ETL_TBECONNECT_ID)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_TBECONNECT_ID)) : 0;
                    node.tBeconnectPrimaryKey = currentNodeMap.containsKey
                        (S_Token.ETL_TBECONNECT_PRIMARY_KEY) ? currentNodeMap.getString
                        (S_Token.ETL_TBECONNECT_PRIMARY_KEY) : S_Token.ETL_SYMBOL_NULL;
                    node.primaryKey = currentNodeMap.containsKey(S_Token.ETL_PRIMARY_KEY)
                        ? currentNodeMap.getString(S_Token.ETL_PRIMARY_KEY) : S_Token.ETL_SYMBOL_NULL;
                    node.tBeconnectX = currentNodeMap.containsKey(S_Token.ETL_TBECONNECT_X)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_TBECONNECT_X)) : 0;
                    node.tBeconnectY = currentNodeMap.containsKey(S_Token.ETL_TBECONNECT_Y)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_TBECONNECT_Y)) : 0;
                    node.tBeconnectName = currentNodeMap.containsKey(S_Token.ETL_TBECONNECT_NAME)
                        ? currentNodeMap.getString(S_Token.ETL_TBECONNECT_NAME) : S_Token.ETL_SYMBOL_NULL;
                    node.x = currentNodeMap.containsKey(S_Token.ETL_NODE_COORDINATION_X)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_NODE_COORDINATION_X)) : 0;
                    node.y = currentNodeMap.containsKey(S_Token.ETL_NODE_COORDINATION_Y)
                        ? Integer.parseInt(currentNodeMap.getString(S_Token.ETL_NODE_COORDINATION_Y)) : 0;
                    node = thislist.addNodeOnlyWithFace(node, nodeView.first, NE);
                    node.thisFace.nodeConfiguration = currentNodeMap.containsKey
                        (S_Token.ETL_NODE_CONFIGURATION) ? currentNodeMap.getString(S_Token.ETL_NODE_CONFIGURATION)
                        //元基解密换算, 找了下比较费劲, 准备把接口拿出来做成sample
                        : S_Token.ETL_SYMBOL_NULL;
                    //我在思考是用物理加密还是用dna概率钥匙加密, 如果是dna概率钥匙加密我还有新增几个变量来存储钥匙。
                    node.thisFace.isConfiged = currentNodeMap.containsKey
                        (S_Token.ETL_ISCONFIGED) && !currentNodeMap.getString(S_Token.ETL_ISCONFIGED)
                        .contains(S_Token.ETL_SYMBOL_FALSE);
                    node.thisFace.isExecuted = currentNodeMap.containsKey
                        (S_Token.ETL_ISEXECUTED) && !currentNodeMap.getString(S_Token.ETL_ISEXECUTED)
                        .contains(S_Token.ETL_SYMBOL_FALSE);
                    //增加一个node map 用于 connect链接
                    nodeMap.putLinkNode(node.primaryKey, node);
                    if (null == first) {
                        first = node;
                    } else {
                        first.next = node;
                        node.pre = first;
                        first = first.next;
                    }
                    currentNodeMap.clear();
                }
            }
        } catch (Exception loadE) {
            loadE.printStackTrace();
        }
        first = Sort.sort(first);
        //避免错序录入, 于是增加node链接
        File_X_linkNode._E(first, nodeMap);
        first = Sort.sort(first);
        return first;
    }
    //似乎被猫腻了。稍后地毯式排查。罗瑶光20211102
}
