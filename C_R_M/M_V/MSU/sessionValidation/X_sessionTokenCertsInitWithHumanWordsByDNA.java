package M_V.MSU.sessionValidation;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import U_A.PEU.P.dna.TokenCerts;

//DNA加密设计 罗瑶光
//DNA加密思想 罗瑶光
//Refer <DNA元基编码>罗瑶光 罗荣武, <PDE肽展公式>: 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_sessionTokenCertsInitWithHumanWordsByDNA {
    //序列初始生成
    //可以将密码和时间都加载在这个humanWordsPassword中, 这样时间就不需要比对了.
    //我建议是码农别偷懒.
    public static TokenCerts _E(String humanWordsPassword
        , boolean bys, String lockBys) {
        FullDNATokenPDI pDE_RNA_FullFormular = new FullDNATokenPDI();
        //String a= "luoyaoguang";
        //pDE_RNA_FullFormular.encodeDNA(a);
        pDE_RNA_FullFormular.key[0] = 0.6;
        pDE_RNA_FullFormular.key[1] = 0.3;
        pDE_RNA_FullFormular.key[2] = 0.5;
        pDE_RNA_FullFormular.key[3] = 0.632;
        pDE_RNA_FullFormular.text = humanWordsPassword;
        pDE_RNA_FullFormular.pdw = pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
        //		//20230106-System.out.println("原文: "+ pDE_RNA_FullFormular.text);
        //pDE_RNA_FullFormular.pdw= "字典保密：MSIOCUOCIPCUPCI";
        if (bys) {
            pDE_RNA_FullFormular.lock = lockBys;
        } else {
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
        }
        for (int i = 0; i < pDE_RNA_FullFormular.pdw.length(); i++) {
            pDE_RNA_FullFormular.code += pDE_RNA_FullFormular.lock
                + pDE_RNA_FullFormular.pdw.charAt(i);
        }
        //		//20230106-System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
        //		//20230106-System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
        //		//20230106-System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
        TokenCerts tokenCerts = new TokenCerts();
        tokenCerts.I_PdnKey(pDE_RNA_FullFormular.pdw);
        tokenCerts.I_PdnLock(pDE_RNA_FullFormular.lock);
        tokenCerts.I_Password(humanWordsPassword);
        tokenCerts.I_PdnPassword(pDE_RNA_FullFormular.code);
        return tokenCerts;
    }
}
