package ME.VPC.H.literature;

import ME.VPC.S.ne.App_S;
import java.util.List;

//准备导入数据
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
//20211028
public class literial_X_literial_liner_P extends literial {
	// 速度慢, 精度高, 适用于文章短篇
	// 速度快, 精度一般, 适用于专业白话文。
	public static String literial_liner_P(App_S app, String input) {
		StringBuilder stringBuilder = new StringBuilder();
		try {
			List<String> list = app._A.parserMixedString(input);
			for (String string : list) {
				if (null == literialVerbalBaseMap) {// 局部调试, 稍后进行合并, 罗瑶光
					literial_X_initVerbalBase.initVerbalBase();
				}
				if (literialVerbalBaseMap.containsKey(string)) {
					stringBuilder.append(literialVerbalBaseMap.get(string));
				} else {
					stringBuilder.append(string);
				}
			}
		} catch (Exception e) {
			app.hook.hookFrequentException("literial_liner_P异常.",
					System.currentTimeMillis(), e);
		}
		return stringBuilder.toString();
	}
}