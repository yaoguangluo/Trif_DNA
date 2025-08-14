package M_V.MSU.OCI.ME.SMS.translator.C;

import E_A.ME.analysis.E.AE;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;

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
public interface Translator{	
	void IV_(CogsBinaryForest_AE _A) ;
	String EnglishStringToChineseString(AE _A, String EnglishString);
	String ChineseStringToEnglishString(AE _A, String ChineseString);
	String MixedStringToChineseString(AE _A, String key);
	String ChineseStringToEnglishStringWithPOS(AE _A, String v);
	List<Verbal> index(AE _A, String mixedString);
	List<Verbal> fixPos(List<Verbal> verbals);
	String getChineseSentenseFromVerbalList(List<Verbal> verbals);
	String getEnglishSentenseFromVerbalFixList(List<Verbal> verbalsFix);
}
