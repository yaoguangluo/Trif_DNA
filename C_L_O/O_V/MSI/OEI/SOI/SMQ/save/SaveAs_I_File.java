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
import M_V.MSU.sessionValidation.X_sessionInitByTokenPDICertsDNA;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA_ETL;
import M_V.MVQ.filenameFilter.TXTFilter;
import S_A.SVQ.stable.S_Annotation;
import S_A.SVQ.stable.S_Token;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenCerts;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_stringToURIencode;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileWriter;

//准备把响应事件移植到这里。
//设计成一个档案文件一个密钥文件。
//作者罗瑶光
//作者 +著作权人： 罗瑶光, 浏阳
public class SaveAs_I_File {
    //准备开始应用测试下。//稍后hook 进行 异常修整 20230218
    public static IMV_SIQ getRandomDNAkey(String password) {
        String[] string = new String[4];
        IMV_SIQ map = new IMV_SIQ();
        //生成lock
        TokenCerts tokenCerts
            = X_sessionTokenCertsInitWithHumanWordsByDNA_ETL._E(password, false, null);
        //生成pde, pds
        Token token = X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
        String passwordString = String_ESU_X_charsetSwap._E(token.getmPassword()
            , "UTF8", "UTF8");
        String passwordEncoder = String_ESU_X_stringToURIencode._E(passwordString, "UTF8");
        ////20230106-System.out.println("pds--1>"+ tokenCerts.getPds());
        String passwordPDE = passwordEncoder.toString();//稍后把这里封装成line写行的函数, 做成循环
        String passwordPDS = token.getmPasswordPDS().toString();
        String lock = tokenCerts.getPdnLock();
        String de = token.getUpdsde();
        String ds = token.getUpdsds();
        String ie = token.getUpdsie();
        String is = token.getUpdsis();
        String keyETL = lock + S_Token.ETL_SYMBOL_SMILL + de
            + S_Token.ETL_SYMBOL_SMILL + ds + S_Token.ETL_SYMBOL_SMILL
            + ie + S_Token.ETL_SYMBOL_SMILL + is;
        string[0] = tokenCerts.getPdnPassword();//可逆计算, 用于锁加密
        string[1] = passwordPDE;//不可逆计算, 可用于登陆验证
        string[2] = passwordPDS;//不可逆计算, 可用于登陆验证
        string[3] = keyETL;
        map.put(S_Token.DNA_TOKEN_LOCK, tokenCerts.getPdnPassword());
        map.put(S_Token.DNA_TOKEN_PDE, passwordPDE);
        map.put(S_Token.DNA_TOKEN_PDS, passwordPDS);
        map.put(S_Token.DNA_TOKEN_KEY, keyETL);
        return map;
        // 注释清楚点如下： 好理解 罗瑶光 20211108
        // 原始数据 <-可逆-> 物理元基加密 <-可逆-> 筛子锁加密 <-不可逆-> 肽展加密PDE <-可逆-> 肽丝化加密pds
        // <--------------------可逆--------------------->         <--------------可逆------------>
        //                                             <---不可逆--->
    }

    public static void Save(LinkNode first) {
        //初始化 dna密码文件的函数
        //加密
        //我先设计第一次加密是随机。那么这里每一行都要进行加密。
        //准备设计三种加密形式, 第一种 pde级别加密, 第二种pds级别加密, 第三种简单的物理级别加密。
        //准备开始。罗瑶光 20211117
        FileDialog filedialog = new FileDialog(new Frame(), S_Annotation.DOC_CREATE
            , FileDialog.LOAD);
        filedialog.setFilenameFilter(new TXTFilter(S_Annotation.FILE_FORMAT_ETL));
        filedialog.setVisible(true);
        String fileSavepath = filedialog.getDirectory() + filedialog.getFile();
        System.out.println(fileSavepath);
        if (new File(fileSavepath).isFile()
            && fileSavepath.contains(S_Annotation.FILE_FORMAT_ETL)) {
            System.out.println(S_Annotation.DOC_EXIST);
            return;
        }
        fileSavepath = fileSavepath + S_Annotation.FILE_FORMAT_ETL;
        System.out.println(fileSavepath);
        //create file and save
        try {
            //SessionValidation sessionValidation= new SessionValidation();
            //String[] string= SaveAs_I_File.getRandomDNAkey(sessionValidation, S_Token.EMPTY_STRING);
            FileWriter fileWriter = new FileWriter(fileSavepath);
            FileWriter fileWriterKey = new FileWriter(fileSavepath + ".dna");
            LinkNode node = first;
            while (null != node) {
                //挨个取。没难度。逐个把信息写入文件。
                //节点坐标, 节点名, 节点关联,
                String NodeCoordinationX = S_Token.EMPTY_STRING + node.x;
                String NodeCoordinationY = S_Token.EMPTY_STRING + node.y;
                String NodeName = S_Token.EMPTY_STRING + node.name;
                String NodeID = S_Token.EMPTY_STRING + node.ID;
                String flash = S_Token.EMPTY_STRING + node.flash;
                String beconnect = S_Token.EMPTY_STRING + node.beconnect;
                String leftChoose = S_Token.EMPTY_STRING + node.leftChoose;
                String rightChoose = S_Token.EMPTY_STRING + node.rightChoose;
                String tBeconnect = S_Token.EMPTY_STRING + node.tBeconnect;
                String tBeconnectX = S_Token.EMPTY_STRING + node.tBeconnectX;
                String tBeconnectY = S_Token.EMPTY_STRING + node.tBeconnectY;
                String tBeconnectName = S_Token.EMPTY_STRING + node.tBeconnectName;
                String tBeconnectID = S_Token.EMPTY_STRING + node.tBeconnectID;
                //String tBeconnectPrimaryKey= S_Token.EMPTY_STRING+ node.dBeconnectPrimaryKey;
                //猫腻横行
                String tBeconnectPrimaryKey = S_Token.EMPTY_STRING + node.tBeconnectPrimaryKey;
                //无耻, 稍后文档我也优化下。罗瑶光 20211102
                String mBeconnect = S_Token.EMPTY_STRING + node.mBeconnect;
                String mBeconnectX = S_Token.EMPTY_STRING + node.mBeconnectX;
                String mBeconnectY = S_Token.EMPTY_STRING + node.mBeconnectY;
                String mBeconnectName = S_Token.EMPTY_STRING + node.mBeconnectName;
                String mBeconnectID = S_Token.EMPTY_STRING + node.mBeconnectID;
                String mBeconnectPrimaryKey = S_Token.EMPTY_STRING + node.mBeconnectPrimaryKey;
                String dBeconnect = S_Token.EMPTY_STRING + node.dBeconnect;
                String dBeconnectX = S_Token.EMPTY_STRING + node.dBeconnectX;
                String dBeconnectY = S_Token.EMPTY_STRING + node.dBeconnectY;
                String dBeconnectName = S_Token.EMPTY_STRING + node.dBeconnectName;
                String dBeconnectID = S_Token.EMPTY_STRING + node.dBeconnectID;
                String dBeconnectPrimaryKey = S_Token.EMPTY_STRING + node.dBeconnectPrimaryKey;
                String primaryKey = S_Token.EMPTY_STRING + node.primaryKey;
                String nodeConfiguration = S_Token.EMPTY_STRING
                    + node.thisFace.nodeConfiguration.replace(S_Token.LINE_ENTER
                    , S_Token.EMPTY_STRING);//元基加密换算
                nodeConfiguration = nodeConfiguration.substring(0
                    , nodeConfiguration.length() > 5000 ? 5000 : nodeConfiguration.length());
                //避免过长。
                String isConfiged = S_Token.EMPTY_STRING + node.thisFace.isConfiged;
                String isExecuted = S_Token.EMPTY_STRING + node.thisFace.isExecuted;
                //配置
                //采用元基础的物理加密形式, 直接调用接口就是了, 先不采用钥匙概率加密
                //, 避免需要保存的变量过多、
                //罗瑶光20211106
                //大家要用记得文本的长度要检测啊, 不要一行几千上万字也这样一下写一行
                //, 不然到时候读行会卡死, 改成bufferIO。我先点醒下。
                //new FullDNATokenPDI_XCDX().initonETLSect(S_Token.EMPTY_STRING);
                //new FullDNATokenPDI().initonDeSect(S_Token.EMPTY_STRING);
                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                IMV_SIQ map = getRandomDNAkey(S_Token.ETL_NODE_COORDINATION_X
                    + S_Token.ETL_SYMBOL_PER + NodeCoordinationX);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_NODE_NAME
                    + S_Token.ETL_SYMBOL_PER + NodeName);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_NODE_COORDINATION_Y
                    + S_Token.ETL_SYMBOL_PER + NodeCoordinationY);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_NODE_ID
                    + S_Token.ETL_SYMBOL_PER + NodeID);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_FLASH
                    + S_Token.ETL_SYMBOL_PER + flash);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_BECONNECT
                    + S_Token.ETL_SYMBOL_PER + beconnect);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_LEFT_CHOOSE
                    + S_Token.ETL_SYMBOL_PER + leftChoose);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_RIGHT_CHOOSE
                    + S_Token.ETL_SYMBOL_PER + rightChoose);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_TBECONNECT
                    + S_Token.ETL_SYMBOL_PER + tBeconnect);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_TBECONNECT_X
                    + S_Token.ETL_SYMBOL_PER + tBeconnectX);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_TBECONNECT_Y
                    + S_Token.ETL_SYMBOL_PER + tBeconnectY);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_TBECONNECT_NAME
                    + S_Token.ETL_SYMBOL_PER + tBeconnectName);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_TBECONNECT_ID
                    + S_Token.ETL_SYMBOL_PER + tBeconnectID);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_TBECONNECT_PRIMARY_KEY
                    + S_Token.ETL_SYMBOL_PER + tBeconnectPrimaryKey);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_MBECONNECT
                    + S_Token.ETL_SYMBOL_PER + mBeconnect);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_MBECONNECT_X
                    + S_Token.ETL_SYMBOL_PER + mBeconnectX);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_MBECONNECT_Y
                    + S_Token.ETL_SYMBOL_PER + mBeconnectY);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_MBECONNECT_NAME
                    + S_Token.ETL_SYMBOL_PER + mBeconnectName);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_MBECONNECT_ID
                    + S_Token.ETL_SYMBOL_PER + mBeconnectID);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_MBECONNECT_PRIMARY_KEY
                    + S_Token.ETL_SYMBOL_PER + mBeconnectPrimaryKey);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_DBECONNECT
                    + S_Token.ETL_SYMBOL_PER + dBeconnect);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_DBECONNECT_X
                    + S_Token.ETL_SYMBOL_PER + dBeconnectX);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_DBECONNECT_Y
                    + S_Token.ETL_SYMBOL_PER + dBeconnectY);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_DBECONNECT_NAME
                    + S_Token.ETL_SYMBOL_PER + dBeconnectName);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_DBECONNECT_ID
                    + S_Token.ETL_SYMBOL_PER + dBeconnectID);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_DBECONNECT_PRIMARY_KEY
                    + S_Token.ETL_SYMBOL_PER + dBeconnectPrimaryKey);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_PRIMARY_KEY
                    + S_Token.ETL_SYMBOL_PER + primaryKey);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_NODE_CONFIGURATION
                    + S_Token.ETL_SYMBOL_PER + nodeConfiguration);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_ISCONFIGED
                    + S_Token.ETL_SYMBOL_PER + isConfiged);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                map = getRandomDNAkey(S_Token.ETL_ISEXECUTED
                    + S_Token.ETL_SYMBOL_PER + isExecuted);
                fileWriter.write(map.getString(S_Token.DNA_TOKEN_LOCK));
                fileWriterKey.write(map.getString(S_Token.DNA_TOKEN_KEY));

                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                //分割
                String split = "##############################";
                fileWriter.write(S_Token.LINE_ENTER);
                fileWriterKey.write(S_Token.LINE_ENTER);
                fileWriter.write(split);
                fileWriter.flush();
                fileWriterKey.write(split);
                fileWriterKey.flush();
                if (null == node.next) {
                    break;
                }
                node = node.next;
            }
            fileWriter.close();
            fileWriterKey.close();
        } catch (Exception saveFile) {
        }
    }
}
