package C_A.ME.analysis.C;

import ME.VPC.M.app.App;

import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public interface A {
    //    public List<String> parserMixedString(StringBuilder mixedString);
//    public List<String> parserMixedString(String mixedString);
    public List<String> parserString(String inputString);

    public void I_FixWords(int charPosition, StringBuilder inputString
        , StringBuilder[] fixWords);

    public String[] parserEnglishString(String englishString);

    public void IV_(App NE);

    public void IV_Mixed(App NE);

    public void IV_All(App NE);

    public void IV_condition(int indexType, App NE);
}
//void IV_() ;
//void IV_Mixed() ;
//List<String> parserString(String input);
//void I_FixWords(int charPosition, String inputString, StringBuilder[] fixWords);
//String[] parserEnglishString(String englishString);
//List<String> parserMixedString(String mixedString);
