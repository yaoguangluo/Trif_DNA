package C_A.OCI.SVQ.MPC.fhmm.C;
//词汇翻译系统

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public interface FHMMList_indexAll_X {
    void loadLanguage(String cInputString, String cInputStringKorea
        , String cInputStringJapan, String cInputStringTrandition
        , String cInputStringEnglish, String cInputStringRs, String cInputStringAb
        , String cInputStringFn, String cInputStringGm, String cInputStringSp);
    void loagPOS(String cInputString, String cInputStringKorea
        , String cInputStringJapan, String cInputStringTrandition
        , String cInputStringEnglish, String cInputStringRs, String cInputStringAb
        , String cInputStringFn, String cInputStringGm, String cInputStringSp);
}
//public void indexAll() ;