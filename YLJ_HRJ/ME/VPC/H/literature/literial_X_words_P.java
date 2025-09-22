package ME.VPC.H.literature;

import ME.VPC.M.app.App;

import java.util.Iterator;
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
public class literial_X_words_P extends literial {
	public String words_P(App app, String input) {
		List<String> list = app.app_S._A.parserMixedString(input);
		Iterator<String> iteratorList = list.iterator();
		StringBuilder stringBuilder = new StringBuilder();
		Here: while (iteratorList.hasNext()) {
			String stringIteratorList = iteratorList.next();
			if (1 < stringIteratorList.length()) {
				if (null == literialVerbalBase) {// 局部调试, 稍后进行合并, 罗瑶光
					literial_X_initVerbalBase.initVerbalBase();
				}
				for (String string : literialVerbalBase) {
					if (string.contains(stringIteratorList)) {
						stringBuilder.append(string);
						continue Here;
					}
				}
			}
			stringBuilder.append(stringIteratorList);
		}
		return stringBuilder.toString();
	}
	// 速度慢, 精度高, 适用于文章短篇
}