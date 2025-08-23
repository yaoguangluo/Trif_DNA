package S_A.SEM.bloom;

import fullDNATokenPDI.PDI_X_;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticFunctionMapA_IDUQ_E {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings("unused")
    public static void main(String[] argv) {
        App NE = new App();
        NE._I_U.string._S_ = "罗瑶光";
        String pdw = StaticFunctionMapA_IDUQ_C.getPDW(NE);
        String lock = StaticFunctionMapA_IDUQ_C.getLock(NE);
        String code = StaticFunctionMapA_IDUQ_C.getCode(NE);
        PDI_X_ pDE_RNA_FullFormular = new PDI_X_();
        pDE_RNA_FullFormular.pdw = pdw.toString();
        pDE_RNA_FullFormular.lock = lock.toString();
        pDE_RNA_FullFormular.code = code.toString();
        NE._I_U.pDE_RNA_FullFormular_X = StaticFunctionMapA_IDUQ_C.doPDE(NE);
        NE._I_U.pDE_RNA_FullFormularNew
            = StaticFunctionMapA_IDUQ_C.doPrefixPDE(NE);
        PDI_X_ pDE_RNA_FullFormular2
            = StaticFunctionMapA_IDUQ_C.doPostfixPDE(NE);
        PDI_X_ pDE_RNA_FullFormular3
            = StaticFunctionMapA_IDUQ_C.doSurffixPDE(NE);
    }
}
