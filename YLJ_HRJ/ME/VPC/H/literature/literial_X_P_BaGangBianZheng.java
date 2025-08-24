package ME.VPC.H.literature;

import S_A.SVQ.stable.S_Annotation;
import S_A.SVQ.stable.S_Tag;

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
public class literial_X_P_BaGangBianZheng extends literial {
	public static String P_BaGangBianZheng(String key) {
		String keyZhenDuan = key.toString();
		for (int i = 0; i < key.length(); i++) {
			if (S_Annotation.feng
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "风";
				continue;
			}
			if (S_Annotation.han.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "风寒";
				continue;
			}
			if (S_Annotation.hot.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "风热";
				continue;
			}
			if (S_Annotation.shi.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "风湿";
				continue;
			}
			if (S_Annotation.huo.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "火";
				continue;
			}
			if (S_Annotation.zao.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "燥";
				continue;
			}
			if (S_Annotation.liuYin
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "六淫";
				continue;
			}
			if (S_Annotation.qiQing
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "七情";
				continue;
			}
			if (S_Annotation.wangYang
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "亡阳";
				continue;
			}
			if (S_Annotation.wangYin
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "亡阴";
				continue;
			}
			if (S_Annotation.jiBaoShiChang
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "饥饱";
				continue;
			}
			if (S_Annotation.yinShiBuJie
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "饮食";
				continue;
			}
			if (S_Annotation.tiaoShiPianShe
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "挑食";
				continue;
			}
			if (S_Annotation.biaoHan
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "表寒";
				continue;
			}
			if (S_Annotation.biaoRe
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "表热";
				continue;
			}
			if (S_Annotation.yuXue
					.contains(S_Tag.STRING_EMPTY + key.charAt(i))) {
				keyZhenDuan += "淤";
			}
		}
		return keyZhenDuan;
	}
}