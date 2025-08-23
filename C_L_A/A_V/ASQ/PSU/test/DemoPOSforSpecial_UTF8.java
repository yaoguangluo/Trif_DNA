package A_V.ASQ.PSU.test;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DemoPOSforSpecial_UTF8 {
    public void main(String[] args) {
    }
}

////package org.tinos.test; import java.io.IOException; import java.util.ArrayList; import java.util.List; import java.util.Map; import org.tinos.engine.analysis.Analyzer;
////import org.tinos.engine.analysis.imp.CogsBinaryForestAnalyzerImp; import java.lang.System.*; public class DemoPOSforSpecial { public void main(String[] args)
// { Analyzer analyzer= new CogsBinaryForestAnalyzerImp(); analyzer.initMixed(); Map<String, String> nlp= analyzer.getPosCnToCn(); List<String> sets=
//new ArrayList<>(); String[] ss= new String[1]; String[] ss1= new String[1]; ss[0]= "??????????????????????????????????????????????";
//ss1[0]= "?? ?? ???? ?? ?? "; for (int i= 0;i< ss.length;i++) { //20230106-System.out.println("???????????-->"+ ss[i]); sets= analyzer.parserMixedString(ss[i].replace(" ", " "));
////??????? out.print("????????-->"); for (int j= 0;j< sets.size();j++) { if (!sets.get(j).replaceAll("\\s+", "").equals("")) { out.print(sets.get(j)+ " "); } }
////34 out.println(); out.println("????????-->"+ ss1[i]); for (int k= 0;k< sets.size();k++) { if (!sets.get(k).replaceAll("\\s+", "").equals("")) { nlp.get(sets.get(k));
//out.println(sets.get(k)+ "/"+ nlp.get(sets.get(k))+ " "); } }out.println(""); }}} ----------
