package S_A.SEM.bloom;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import ME.VPC.M.app.App;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.zip.GzipUtil;
import VPC.DetaDB.DetaDBUtil_X_DBRequest;
import VPC.DetaDB.DetaDBUtil_X_IV_CulumnNameType;
import VPC.DetaDB.DetaDBUtil_X_backEndRequest;
import VPC.DetaDB.DetaDBUtil_X_cacheRequest;
import VPC.DetaDB.DetaDBUtil_X_withoutCulumnNameType;
import VPC.DetaFrontEnd.DetaFrontEndUtil_X_backEndRequest;
import VPC.DetaFrontEnd.DetaFrontEndUtil_X_huaRuiJiRequest;
import utils.DetaUtil;
import VPC.PdeSwap.X_PdcToPde;
import VPC.PdeSwap.X_PdcToPds;
import VPC.PdeSwap.X_PdeToPds;
import VPC.PdeSwap.X_PdsToPde;
import VPC.PdeSwapFix.X_pdcToPde;
import VPC.PdeSwapFix.X_pdcToPds;
import VPC.PdeSwapFix.X_pdeToPds;
import VPC.PdeSwapFix.X_pdsToPde;
import VPC.PdeSwapFix.X_pdwToPdc;
import VPC.PdeSwapFix.X_textToPdw;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public class StaticFunctionMapV_AOPM_E implements StaticFunctionMapV_AOPM_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    public static void load(App NE) {
    }

    //PdeSwap{
    public String PdeSwapPdcToPde(App NE) {
        AES_QMS_XSD_TIH pdc = NE._I_U.pdc;
        AES_QMS_XSD_TIH lock = NE._I_U.lock;
        AES_QMS_XSD_TIH de = NE._I_U.de;
        AES_QMS_XSD_TIH ds = NE._I_U.ds;
        AES_QMS_XSD_TIH ie = NE._I_U.ie;
        AES_QMS_XSD_TIH is = NE._I_U.is;
        return X_PdcToPde.PdcToPde(pdc._S_, lock._S_, de._S_, ds._S_, ie._S_, is._S_);
    }

    public String PdeSwapPdcToPds(App NE) {
        AES_QMS_XSD_TIH pdc = NE._I_U.pdc;
        AES_QMS_XSD_TIH lock = NE._I_U.lock;
        AES_QMS_XSD_TIH de = NE._I_U.de;
        AES_QMS_XSD_TIH ds = NE._I_U.ds;
        AES_QMS_XSD_TIH ie = NE._I_U.ie;
        AES_QMS_XSD_TIH is = NE._I_U.is;
        return X_PdcToPds.PdcToPds(pdc._S_, lock._S_, de._S_, ds._S_, ie._S_, is._S_);
    }

    //刚检查pds to pde 似乎被猫腻了, 我测试下
    //罗瑶光 MPOASCEV
    public String PdeSwapPdeToPds(App NE) {
        AES_QMS_XSD_TIH pds = NE._I_U.pds;
        AES_QMS_XSD_TIH lock = NE._I_U.lock;
        AES_QMS_XSD_TIH de = NE._I_U.de;
        AES_QMS_XSD_TIH ds = NE._I_U.ds;
        AES_QMS_XSD_TIH ie = NE._I_U.ie;
        AES_QMS_XSD_TIH is = NE._I_U.is;
        return X_PdeToPds.PdeToPds(pds._S_, de._S_, ds._S_, ie._S_, is._S_);
    }

    //把FullDNATokenPDI 类里 do_PDE_RNA_FullFormular_Back 函数中的 SCEV MPOA 注释的部分 分出来到在这里。
    //罗瑶光 VECSAOPM
    public String PdeSwapPdsToPde(App NE) {
        AES_QMS_XSD_TIH pds = NE._I_U.pds;
        AES_QMS_XSD_TIH lock = NE._I_U.lock;
        AES_QMS_XSD_TIH de = NE._I_U.de;
        AES_QMS_XSD_TIH ds = NE._I_U.ds;
        AES_QMS_XSD_TIH ie = NE._I_U.ie;
        AES_QMS_XSD_TIH is = NE._I_U.is;
        return X_PdsToPde.PdsToPde(pds._S_, de._S_, ds._S_, ie._S_, is._S_);
    }

    //PdeSwapFix{
    public String PdeSwapFixpdcToPde(App NE) {
        AES_QMS_XSD_TIH pdc = NE._I_U.pdc;
        AES_QMS_XSD_TIH lock = NE._I_U.lock;
        AES_QMS_XSD_TIH de = NE._I_U.de;
        AES_QMS_XSD_TIH ds = NE._I_U.ds;
        AES_QMS_XSD_TIH ie = NE._I_U.ie;
        AES_QMS_XSD_TIH is = NE._I_U.is;
        return X_pdcToPde.pdcToPde(pdc._S_, lock._S_, de._S_, ds._S_, ie._S_, is._S_);
    }

    public String PdeSwapFixpdcToPds(App NE) {
        AES_QMS_XSD_TIH pdc = NE._I_U.pdc;
        AES_QMS_XSD_TIH lock = NE._I_U.lock;
        AES_QMS_XSD_TIH de = NE._I_U.de;
        AES_QMS_XSD_TIH ds = NE._I_U.ds;
        AES_QMS_XSD_TIH ie = NE._I_U.ie;
        AES_QMS_XSD_TIH is = NE._I_U.is;
        return X_pdcToPds.pdcToPds(pdc._S_, lock._S_, de._S_, ds._S_, ie._S_, is._S_);
    }

    //刚检查pds to pde 似乎被猫腻了, 我测试下
    //罗瑶光 MPOASCEV
    public String PdeSwapFixpdeToPds(App NE) {
        AES_QMS_XSD_TIH pds = NE._I_U.pds;
        AES_QMS_XSD_TIH lock = NE._I_U.lock;
        AES_QMS_XSD_TIH de = NE._I_U.de;
        AES_QMS_XSD_TIH ds = NE._I_U.ds;
        AES_QMS_XSD_TIH ie = NE._I_U.ie;
        AES_QMS_XSD_TIH is = NE._I_U.is;
        return X_pdeToPds.pdeToPds(pds._S_, de._S_, ds._S_, ie._S_, is._S_);
    }

    //把FullDNATokenPDI 类里 do_PDE_RNA_FullFormular_Back 函数中的 SCEV MPOA 注释的部分 分出来到在这里。
    //罗瑶光 VECSAOPM
    public String PdeSwapFixpdsToPde(App NE) {
        AES_QMS_XSD_TIH pds = NE._I_U.pds;
        AES_QMS_XSD_TIH lock = NE._I_U.lock;
        AES_QMS_XSD_TIH de = NE._I_U.de;
        AES_QMS_XSD_TIH ds = NE._I_U.ds;
        AES_QMS_XSD_TIH ie = NE._I_U.ie;
        AES_QMS_XSD_TIH is = NE._I_U.is;
        return X_pdsToPde.pdsToPde(pds._S_, de._S_, ds._S_, ie._S_, is._S_);
    }

    public String PdeSwapFixtextToPdw(App NE) {
        FullDNATokenPDI pDE_RNA_FullFormular = NE._I_U.pDE_RNA_FullFormular;
        AES_QMS_XSD_TIH password = NE._I_U.password;
        return X_textToPdw.textToPdw(pDE_RNA_FullFormular);
    }

    public String PdeSwapFixpdwToPdc(App NE) {
        FullDNATokenPDI pDE_RNA_FullFormular = NE._I_U.pDE_RNA_FullFormular;
        return X_pdwToPdc.pdwToPdc(pDE_RNA_FullFormular);
    }

    //下面这个test demo 展示了 密码-> 肽文-> 肽锁+肽密码-> 密钥, pds和pde密码
    //-> pds转pde验证-> pde转pds验证
    //全部封装成函数
    //罗瑶光 20210830
    @SuppressWarnings("unused")
    public static void main() {
        App NE = new App();
        String[] argv = NE._I_U.argv;
        FullDNATokenPDI pDE_RNA_FullFormular = new FullDNATokenPDI();
        pDE_RNA_FullFormular.text = "控制吸收";
        pDE_RNA_FullFormular.pdw = X_textToPdw.textToPdw(pDE_RNA_FullFormular
        );
        pDE_RNA_FullFormular.code = X_pdwToPdc.pdwToPdc(pDE_RNA_FullFormular);
        //20230106-System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
        //20230106-System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
        //20230106-System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
        ////////////////////////////////////////////////////
        pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
        //20230106-System.out.println("静态肽展降元概率钥匙E: "+ pDE_RNA_FullFormular.pdedeKey);
        //20230106-System.out.println("静态肽展降元概率钥匙S: "+ pDE_RNA_FullFormular.pdedsKey);
        //20230106-System.out.println("静态肽展降元: "+ pDE_RNA_FullFormular.pds);
        //20230106-System.out.println("静态肽展增元概率钥匙E: "+ pDE_RNA_FullFormular.pdeieKey);
        //20230106-System.out.println("静态肽展增元概率钥匙S: "+ pDE_RNA_FullFormular.pdeisKey);
        //20230106-System.out.println("静态肽展增元: "+ pDE_RNA_FullFormular.pde);
        //////////////////////////////////////////////////////
        pDE_RNA_FullFormular.time = "" + System.currentTimeMillis();
        pDE_RNA_FullFormular.cacheId = "ID" + Math.random() + ":" + Math.random();
        //20230106-System.out.println("时间:  " + pDE_RNA_FullFormular.time);
        //20230106-System.out.println("账号随机缓存字符串:  " + pDE_RNA_FullFormular.cacheId);
        /////////////////////////////////////////////////////
        pDE_RNA_FullFormular.session_key = pDE_RNA_FullFormular.pde;
        //20230106-System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
        //20230106-System.out.println("============================================");
        //20230106-System.out.println("开始前序验证：");
        //20230106-System.out.println("开始Session解析： " + pDE_RNA_FullFormular.session_key);
        //20230106-System.out.println("开始概率钥匙解析：" + pDE_RNA_FullFormular.pdedeKey
        //		+ pDE_RNA_FullFormular.pdedsKey
        //		+ pDE_RNA_FullFormular.pdeieKey+ pDE_RNA_FullFormular.pdeisKey);
        /////////////////////////////////////////////////
        FullDNATokenPDI pDE_RNA_FullFormular1 = new FullDNATokenPDI();
        pDE_RNA_FullFormular1.pdedeKey = pDE_RNA_FullFormular.pdedeKey.toString();
        pDE_RNA_FullFormular1.pdedsKey = pDE_RNA_FullFormular.pdedsKey.toString();
        pDE_RNA_FullFormular1.pdeieKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular1.pdeisKey = pDE_RNA_FullFormular.pdeisKey.toString();
        pDE_RNA_FullFormular.doKeyUnPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular1, true);
        //20230106-System.out.println();
        //20230106-System.out.println("得到原降元元基DNA序列："+ pDE_RNA_FullFormular.pds);
        //20230106-System.out.println("得到新降元元基DNA序列："+ pDE_RNA_FullFormular1.pds);
        //20230106-System.out.println("得到原元基DNA序列："+ pDE_RNA_FullFormular.pde);
        //20230106-System.out.println("得到新元基DNA序列："+ pDE_RNA_FullFormular1.pde);
        //20230106-System.out.println("验证正确？");
        //20230106-System.out.println(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde)
        //		? "正确": "失败");

        /////////////////////////////////////////
        //20230106-System.out.println("===============================================");
        //20230106-System.out.println("开始pde降元验证：");
        FullDNATokenPDI pDE_RNA_FullFormular2 = new FullDNATokenPDI();
        pDE_RNA_FullFormular2.pdeieKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular2.pdeisKey = pDE_RNA_FullFormular.pdeisKey.toString();
        pDE_RNA_FullFormular2.pdedeKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular2.pdedsKey = pDE_RNA_FullFormular.pdeisKey.toString();
        //20230106-System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormular1.pde);
        String pds = X_pdeToPds.pdeToPds(pDE_RNA_FullFormular1.pde,
            pDE_RNA_FullFormular2.pdedeKey
            , pDE_RNA_FullFormular2.pdedsKey
            , pDE_RNA_FullFormular2.pdeieKey
            , pDE_RNA_FullFormular2.pdeisKey);
        //20230106-System.out.println("pds");
        //20230106-System.out.println("pds");
        //20230106-System.out.println(pDE_RNA_FullFormular1.pds);
        //20230106-System.out.println(pds);
        //////////////////////////////////////////////////////////////////
        //20230106-System.out.println("开始pds增元验证：");
        FullDNATokenPDI pDE_RNA_FullFormular3 = new FullDNATokenPDI();
        pDE_RNA_FullFormular3.pdeieKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular3.pdeisKey = pDE_RNA_FullFormular.pdeisKey.toString();
        pDE_RNA_FullFormular3.pdedeKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular3.pdedsKey = pDE_RNA_FullFormular.pdeisKey.toString();

        String pde = X_pdsToPde.pdsToPde(pDE_RNA_FullFormular1.pds,
            pDE_RNA_FullFormular3.pdedeKey
            , pDE_RNA_FullFormular3.pdedsKey
            , pDE_RNA_FullFormular3.pdeieKey
            , pDE_RNA_FullFormular3.pdeisKey);
        //20230106-System.out.println("pde");
        //20230106-System.out.println("pde");
        //20230106-System.out.println(pDE_RNA_FullFormular1.pde);
        //20230106-System.out.println(pde);
    }

    //DetaDBUtil {
    public String DetaDBUtilDBRequest(App NE) {
        AES_QMS_XSD_TIH request = NE._I_U.requestString;
        return DetaDBUtil_X_DBRequest._E(request._S_);
    }

    public String DetaDBUtilbackEndRequest(App NE) {
        AES_QMS_XSD_TIH request = NE._I_U.requestString;
        return DetaDBUtil_X_backEndRequest._E(request._S_);
    }

    public String DetaDBUtilcacheRequest(App NE) {
        AES_QMS_XSD_TIH request = NE._I_U.requestString;
        return DetaDBUtil_X_cacheRequest._E(request._S_);
    }

    public void IV_CulumnNameType(App NE) {
        DetaDBUtil_X_IV_CulumnNameType._E();
    }

    public boolean withoutCulumnNameType(App NE) {
        AES_QMS_XSD_TIH culumnTypeString = NE._I_U.culumnTypeString;
        return DetaDBUtil_X_withoutCulumnNameType._E(culumnTypeString._S_);
    }

    // DetaFrontEndUtil {
    public String DetaFrontEndUtilbackEndRequest(App NE) {
        AES_QMS_XSD_TIH request = NE._I_U.requestString;
        return DetaFrontEndUtil_X_backEndRequest._E(request._S_);
    }

    //先不动 稍后归纳 华瑞集rest走 前端还是后端还是数据库。
    public String DetaFrontEndUtilhuaRuiJiRequest(App NE) {
        AES_QMS_XSD_TIH request = NE._I_U.requestString;
        return DetaFrontEndUtil_X_huaRuiJiRequest._E(request._S_);
    }

    public String DetaFrontEndUtilcacheRequest(App NE) {
        AES_QMS_XSD_TIH request = NE._I_U.requestString;//later..
        return DetaFrontEndUtilcacheRequest(NE);
    }

    //DetaUtil {
    public void IV_DB(App NE) {
        AES_QMS_XSD_TIH dbConfigPath = NE._I_U.dbConfigPath;
        DetaUtil.IV_DB(dbConfigPath._S_);
    }

    //GzipUtil {
    // 压缩
    public byte[] compressBytes(App NE) {
        byte[] data = NE._I_U.data;
        return GzipUtil.compress(data);
    }

    public byte[] compress(App NE) {
        AES_QMS_XSD_TIH str = NE._I_U.strV;
        AES_QMS_XSD_TIH stringTypes = NE._I_U.stringTypes;
        return GzipUtil.compress(str._S_, stringTypes._S_);
    }

    public byte[] uncompress(App NE) {
        byte[] data = NE._I_U.data;
        return GzipUtil.compress(data);
    }
    //jogl 画图略
}
