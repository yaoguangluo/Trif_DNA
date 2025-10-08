package VPC.PdeSwapFix;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import A_I.MPE.MAQPVDCOISIV.pdi.TokenPDI;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA;
import U_A.PEU.P.dna.TokenCerts;

//把token pdi例子进行拆分成 3个函数, 之后方便集成到data swap 包中。
//肽展作者 罗瑶光
//编码作者 罗瑶光
//见 VPC.transaction
//见 DNA元基催化与肽计算 第841页公式
//20210828

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class X_pdcToPde {
    public static String pdcToPde(String pdc, String lock, String de, String ds, String ie, String is) {
        TokenCerts tokenCerts = X_sessionTokenCertsInitWithHumanWordsByDNA._E(pdc, true, lock);
        TokenPDI pDE_RNA_Formular = new TokenPDI();
        TokenPDI pDE_RNA_Formular1 = new TokenPDI();
        pDE_RNA_Formular1.pdedeKey = de;
        pDE_RNA_Formular1.pdedsKey = ds;
        pDE_RNA_Formular1.pdeieKey = ie;
        pDE_RNA_Formular1.pdeisKey = is;
        pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
        return pDE_RNA_Formular1.pde;
    }


    //下面这个test demo 展示了 密码-> 肽文-> 肽锁+肽密码-> 密钥, pds和pde密码 -> pds转pde验证-> pde转pds验证
    //全部封装成函数
    //罗瑶光 20210830
    public static void main(String[] argv) {
        FullDNATokenPDI pDE_RNA_FullFormular = new FullDNATokenPDI();
        pDE_RNA_FullFormular.text = "控制吸收";
        pDE_RNA_FullFormular.pdw = X_textToPdw.textToPdw(pDE_RNA_FullFormular);
        pDE_RNA_FullFormular.code = X_pdwToPdc.pdwToPdc(pDE_RNA_FullFormular);
        S_logger.Log.logger.info("" + "肽语: " + pDE_RNA_FullFormular.pdw);
        S_logger.Log.logger.info("" + "肽锁: " + pDE_RNA_FullFormular.lock);
        S_logger.Log.logger.info("" + "散列肽语:" + pDE_RNA_FullFormular.code);
        ////////////////////////////////////////////////////
        pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
        S_logger.Log.logger.info("" + "静态肽展降元概率钥匙E: " + pDE_RNA_FullFormular.pdedeKey);
        S_logger.Log.logger.info("" + "静态肽展降元概率钥匙S: " + pDE_RNA_FullFormular.pdedsKey);
        S_logger.Log.logger.info("" + "静态肽展降元: " + pDE_RNA_FullFormular.pds);
        S_logger.Log.logger.info("" + "静态肽展增元概率钥匙E: " + pDE_RNA_FullFormular.pdeieKey);
        S_logger.Log.logger.info("" + "静态肽展增元概率钥匙S: " + pDE_RNA_FullFormular.pdeisKey);
        S_logger.Log.logger.info("" + "静态肽展增元: " + pDE_RNA_FullFormular.pde);
        //////////////////////////////////////////////////////
        pDE_RNA_FullFormular.time = "" + System.currentTimeMillis();
        pDE_RNA_FullFormular.cacheId = "ID" + Math.random() + ":" + Math.random();
        S_logger.Log.logger.info("" + "时间:  " + pDE_RNA_FullFormular.time);
        S_logger.Log.logger.info("" + "账号随机缓存字符串:  " + pDE_RNA_FullFormular.cacheId);
        /////////////////////////////////////////////////////
        pDE_RNA_FullFormular.session_key = pDE_RNA_FullFormular.pde;
        S_logger.Log.logger.info("" + "Session: " + pDE_RNA_FullFormular.session_key);
        S_logger.Log.logger.info("" + "=============================================================================");
        S_logger.Log.logger.info("" + "开始前序验证：");
        S_logger.Log.logger.info("" + "开始Session解析： " + pDE_RNA_FullFormular.session_key);
        S_logger.Log.logger.info("" + "开始概率钥匙解析：" + pDE_RNA_FullFormular.pdedeKey + pDE_RNA_FullFormular.pdedsKey
            + pDE_RNA_FullFormular.pdeieKey + pDE_RNA_FullFormular.pdeisKey);
        /////////////////////////////////////////////////
        FullDNATokenPDI pDE_RNA_FullFormular1 = new FullDNATokenPDI();
        pDE_RNA_FullFormular1.pdedeKey = pDE_RNA_FullFormular.pdedeKey.toString();
        pDE_RNA_FullFormular1.pdedsKey = pDE_RNA_FullFormular.pdedsKey.toString();
        pDE_RNA_FullFormular1.pdeieKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular1.pdeisKey = pDE_RNA_FullFormular.pdeisKey.toString();
        pDE_RNA_FullFormular.doKeyUnPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular1, true);
        S_logger.Log.logger.info("" + "");
        S_logger.Log.logger.info("" + "得到原降元元基DNA序列：" + pDE_RNA_FullFormular.pds);
        S_logger.Log.logger.info("" + "得到新降元元基DNA序列：" + pDE_RNA_FullFormular1.pds);
        S_logger.Log.logger.info("" + "得到原元基DNA序列：" + pDE_RNA_FullFormular.pde);
        S_logger.Log.logger.info("" + "得到新元基DNA序列：" + pDE_RNA_FullFormular1.pde);
        S_logger.Log.logger.info("" + "验证正确？");
        S_logger.Log.logger.info(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde) ? "正确" : "失败");

        /////////////////////////////////////////
        S_logger.Log.logger.info("" + "=======================================================================");
        S_logger.Log.logger.info("" + "开始pde降元验证：");
        FullDNATokenPDI pDE_RNA_FullFormular2 = new FullDNATokenPDI();
        pDE_RNA_FullFormular2.pdeieKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular2.pdeisKey = pDE_RNA_FullFormular.pdeisKey.toString();
        pDE_RNA_FullFormular2.pdedeKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular2.pdedsKey = pDE_RNA_FullFormular.pdeisKey.toString();
        S_logger.Log.logger.info("" + "准备计算元基DNA序列：" + pDE_RNA_FullFormular1.pde);
        String pds = X_pdeToPds.pdeToPds(pDE_RNA_FullFormular1.pde, pDE_RNA_FullFormular2.pdedeKey
            , pDE_RNA_FullFormular2.pdedsKey
            , pDE_RNA_FullFormular2.pdeieKey
            , pDE_RNA_FullFormular2.pdeisKey);
        S_logger.Log.logger.info("" + "pds");
        S_logger.Log.logger.info("" + "pds");
        S_logger.Log.logger.info("" + pDE_RNA_FullFormular1.pds);
        S_logger.Log.logger.info("" + pds);
        //////////////////////////////////////////////////////////////////
        S_logger.Log.logger.info("" + "开始pds增元验证：");
        FullDNATokenPDI pDE_RNA_FullFormular3 = new FullDNATokenPDI();
        pDE_RNA_FullFormular3.pdeieKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular3.pdeisKey = pDE_RNA_FullFormular.pdeisKey.toString();
        pDE_RNA_FullFormular3.pdedeKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular3.pdedsKey = pDE_RNA_FullFormular.pdeisKey.toString();

        String pde = X_pdsToPde.pdsToPde(pDE_RNA_FullFormular1.pds, pDE_RNA_FullFormular3.pdedeKey
            , pDE_RNA_FullFormular3.pdedsKey
            , pDE_RNA_FullFormular3.pdeieKey
            , pDE_RNA_FullFormular3.pdeisKey);
        S_logger.Log.logger.info("" + "pde");
        S_logger.Log.logger.info("" + "pde");
        S_logger.Log.logger.info("" + pDE_RNA_FullFormular1.pde);
        S_logger.Log.logger.info("" + pde);
    }
}
