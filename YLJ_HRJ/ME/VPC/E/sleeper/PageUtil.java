package ME.VPC.E.sleeper;

import ME.VPC.S.ne.WindowsUI;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

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
public class PageUtil {

	public static void initPageTail(JScrollPane jsp_statistic,
			JScrollPane jsp_data, JScrollPane jsp, JLabel jlabel) {
		if (null == jsp_statistic) {
			return; // trif
		}
		jsp_statistic.setBounds(5, 290 + 100 - 80 + 200 - 260 + 120 + 26,
				WindowsUI.basicWidth - 650 - 645,
				500 - 166 + 90 - 44 - 120 - 26);
		jsp_data.setBounds(5 + 800 - 650, 290 + 100 - 80 + 200 - 260 + 26 + 120,
				WindowsUI.basicWidth - 800 + 650 - 130,
				500 - 166 + 90 - 70 - 120);//////////////////
		jlabel.setBounds(5, 290 + 100 - 80 + 200 - 260 + 120 - 15, 150, 50);
		jsp.setBounds(5, 0, WindowsUI.basicWidth - 130,
				200 + 100 + 200 - 260 + 120);
	}
}