package VPC.PdeSwapFix;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;

//把token pdi例子进行拆分成 3个函数, 之后方便集成到data swap 包中。
//肽展作者 罗瑶光
//编码作者 罗瑶光
//见 VPC.transaction
//见 DNA元基催化与肽计算 第841页公式
//20210828

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）

 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_pdwToPdc {
    public static String pdwToPdc(FullDNATokenPDI pDE_RNA_FullFormular) {
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
        for (i = 0; i < pDE_RNA_FullFormular.pdw.length(); i++) {
            pDE_RNA_FullFormular.code += pDE_RNA_FullFormular.lock + pDE_RNA_FullFormular.pdw.charAt(i);
        }
        return pDE_RNA_FullFormular.code;
    }
}
