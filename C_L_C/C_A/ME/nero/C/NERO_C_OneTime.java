package C_A.ME.nero.C;

import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;

import java.util.Map;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public interface NERO_C_OneTime {
	StringBuilder getBinaryForestRecurWords(StringBuilder inputStringWordNode,
			StringBuilder inputString, int charPosition, int inputLength,
			Map<Long, FMHMMNode> forestRoots, int forestDepth,
			int charPositionNext);

	StringBuilder getBinaryForestsRecurWords(StringBuilder inputStringWordNode,
			String inputString, int charPosition, int inputLength,
			Map<Long, FMHMMNode>[] forestsRoots, int forestDepth,
			int charPositionNext);

	StringBuilder getQuickForestRecurWord(StringBuilder inputStringWordNode,
			String inputString, int charPosition, int inputLength,
			int forestDepth, int charPositionNext, App NE);
}
