package S_A.SEM.bloom;

import fullDNATokenPDI.PDI_X_;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Common;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;

//将dna加密的 main test 进行封装成函数。准备优化下。
//著作权人+ 作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticFunctionMapA_IDUQ_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    //肽语
    public static String getPDW(App NE) {
        AES_QMS_XSD_TIH string = NE._I_U.string;
        PDI_X_ pDE_RNA_FullFormular = new PDI_X_();
        pDE_RNA_FullFormular.text = string._S_;
        pDE_RNA_FullFormular.pdw = pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
        return pDE_RNA_FullFormular.pdw;
    }

    //肽锁
    public static String getLock(App NE) {
        PDI_X_ pDE_RNA_FullFormular = new PDI_X_();
        String[] lock = new String[12];
        lock[0] = "A";
        lock[3] = "O";
        lock[6] = "P";
        lock[9] = "M";
        lock[1] = "V";
        lock[4] = "E";
        lock[7] = "C";
        lock[10] = "S";
        lock[2] = "I";
        lock[5] = "D";
        lock[8] = "U";
        lock[11] = "Q";
        int i = (int) (Math.random() * 12) % 12;
        pDE_RNA_FullFormular.lock += lock[i];
        i = (int) (Math.random() * 12) % 12;
        pDE_RNA_FullFormular.lock += lock[i];
        i = (int) (Math.random() * 12) % 12;
        pDE_RNA_FullFormular.lock += lock[i];
        i = (int) (Math.random() * 12) % 12;
        pDE_RNA_FullFormular.lock += lock[i];
        return pDE_RNA_FullFormular.lock;
    }

    //散列肽语 // 第二次修正会增加vpcs 接口多样化。 罗瑶光
    public static String getCode(App NE) {
        PDI_X_ pDE_RNA_FullFormular = new PDI_X_();
        for (int i = 0; i < NE._I_U.pdw._S_.length(); i++) {
            pDE_RNA_FullFormular.code += NE._I_U.lock._S_ + NE._I_U.pdw._S_.charAt(i);
        }
        return pDE_RNA_FullFormular.code;
    }

    //pde计算 确定pDE_RNA_FullFormular 变量中要有 肽语 肽锁 散列 的输入值。
    public static PDI_X_ doPDE(App NE) {
        PDI_X_ pDE_RNA_FullFormular = NE._I_U.pDE_RNA_FullFormular_X;
        //20230106-System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
        //20230106-System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
        //20230106-System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
        //pDE_RNA_FullFormular.bys= "0.6/0.3/0.5/0.632";
        //20230106-System.out.println("静态密钥: "+ pDE_RNA_FullFormular.bys);
        pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
        //20230106-System.out.println("静态肽展降元概率钥匙E: "+ pDE_RNA_FullFormular.pdedeKey);
        //20230106-System.out.println("静态肽展降元概率钥匙S: "+ pDE_RNA_FullFormular.pdedsKey);
        //20230106-System.out.println("静态肽展降元: "+ pDE_RNA_FullFormular.pds);
        //20230106-System.out.println("静态肽展增元概率钥匙E: "+ pDE_RNA_FullFormular.pdeieKey);
        //20230106-System.out.println("静态肽展增元概率钥匙S: "+ pDE_RNA_FullFormular.pdeisKey);
        //20230106-System.out.println("静态肽展增元: "+ pDE_RNA_FullFormular.pde);
        return pDE_RNA_FullFormular;
    }

    //前序计算  确定pDE_RNA_FullFormular 变量中要有 肽语 肽锁 散列 概率钥匙 等相关输入值。
    public static PDI_X_ doPrefixPDE(App NE) {
        PDI_X_ pDE_RNA_FullFormular = NE._I_U.pDE_RNA_FullFormular_X;
        pDE_RNA_FullFormular.time = "" + System.currentTimeMillis();
        pDE_RNA_FullFormular.cacheId = "ID" + Math.random() + S_Common.STRING_SYMBOL_PER + Math.random();
        //20230106-System.out.println("时间:  " + pDE_RNA_FullFormular.time);
        //20230106-System.out.println("账号随机缓存字符串:  " + pDE_RNA_FullFormular.cacheId);
        pDE_RNA_FullFormular.session_key = pDE_RNA_FullFormular.pde;
        //20230106-System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
        //20230106-System.out.println("=======================================================");
        //20230106-System.out.println("开始前序验证：");
        //20230106-System.out.println("开始Session解析： " + pDE_RNA_FullFormular.session_key);
        //20230106-System.out.println("开始概率钥匙解析：" + pDE_RNA_FullFormular.pdedeKey+ pDE_RNA_FullFormular.pdedsKey
        //		+ pDE_RNA_FullFormular.pdeieKey+ pDE_RNA_FullFormular.pdeisKey);

        PDI_X_ pDE_RNA_FullFormular1 = new PDI_X_();
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
        //20230106-System.out.println(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde)? "正确": "失败");
        return pDE_RNA_FullFormular1;
    }

    //后序计算  确定pDE_RNA_FullFormular 和 pDE_RNA_FullFormular1 变量中要有 肽语 肽锁 散列 概率钥匙 等相关输入值。
    public static PDI_X_ doPostfixPDE(App NE) {
        PDI_X_ pDE_RNA_FullFormular = NE._I_U.pDE_RNA_FullFormular_X;
        PDI_X_ pDE_RNA_FullFormularNew = NE._I_U.pDE_RNA_FullFormularNew;
        //20230106-System.out.println("==================================================");
        //20230106-System.out.println("开始后序验证：");
        PDI_X_ pDE_RNA_FullFormular2 = new PDI_X_();
        pDE_RNA_FullFormular2.pdeieKey = pDE_RNA_FullFormular.pdedeKey.toString();
        pDE_RNA_FullFormular2.pdeisKey = pDE_RNA_FullFormular.pdedsKey.toString();
        pDE_RNA_FullFormular2.pdedeKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular2.pdedsKey = pDE_RNA_FullFormular.pdeisKey.toString();
        //20230106-System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormularNew.pde);
        pDE_RNA_FullFormular2.doSessionKeyUnPress(pDE_RNA_FullFormularNew.pde
            , pDE_RNA_FullFormular2, true);
        //20230106-System.out.println();
        //20230106-System.out.println("得到原续降元元基DNA序列："+ pDE_RNA_FullFormularNew.pds);
        //20230106-System.out.println("得到后续降元元基DNA序列："+ pDE_RNA_FullFormular2.pds);
        //20230106-System.out.println("验证正确？");
        //20230106-System.out.println(pDE_RNA_FullFormularNew.pds.equals(pDE_RNA_FullFormular2.pds)? "正确": "失败");

        return pDE_RNA_FullFormular2;
    }

    //整序计算 确定pDE_RNA_FullFormular, pDE_RNA_FullFormular1 变量中要有 肽语 肽锁 散列 概率钥匙 等相关输入值。
    public static PDI_X_ doSurffixPDE(App NE) {
        PDI_X_ pDE_RNA_FullFormular = NE._I_U.pDE_RNA_FullFormular_X;
        PDI_X_ pDE_RNA_FullFormularNew = NE._I_U.pDE_RNA_FullFormularNew;
        //20230106-System.out.println("===============================================");
        //20230106-System.out.println("开始整序验证：");
        PDI_X_ pDE_RNA_FullFormular3 = new PDI_X_();

        pDE_RNA_FullFormular3.pdeieKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular3.pdeisKey = pDE_RNA_FullFormular.pdeisKey.toString();
        pDE_RNA_FullFormular3.pdedeKey = pDE_RNA_FullFormular.pdeieKey.toString();
        pDE_RNA_FullFormular3.pdedsKey = pDE_RNA_FullFormular.pdeisKey.toString();

        //20230106-System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormularNew.pde);//pde加成
        pDE_RNA_FullFormular3.doFullSessionKeyUnPress(pDE_RNA_FullFormularNew.pde
            , pDE_RNA_FullFormular3, true);
        //20230106-System.out.println();
        //20230106-System.out.println("得到原续降元元基DNA序列："+ pDE_RNA_FullFormularNew.pds);
        //20230106-System.out.println("得到后续降元元基DNA序列："+ pDE_RNA_FullFormular3.pds);
        //20230106-System.out.println("验证正确？");
        //20230106-System.out.println(pDE_RNA_FullFormularNew.pds.equals(pDE_RNA_FullFormular3.pds)? "正确": "失败");
        //20230106-System.out.println("准备整序计算元基DNA序列："+ pDE_RNA_FullFormularNew.pde);
        //20230106-System.out.println("准备整序计算元基DNA序列："+ pDE_RNA_FullFormular3.pde);
        //20230106-System.out.println(pDE_RNA_FullFormularNew.pde.equals(pDE_RNA_FullFormular3.pde)? "正确": "失败");
        return pDE_RNA_FullFormular3;
    }
}
