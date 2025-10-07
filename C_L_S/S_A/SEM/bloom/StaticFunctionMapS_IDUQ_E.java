package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SQI;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import S_I.OSI.PSO.regex.DoSplit;

import java.util.List;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticFunctionMapS_IDUQ_E extends StaticFunctionMapCASE
	implements StaticFunctionMapS_IDUQ_C {

	public TinMap clone(App NE) {
		TinMap tinMap = NE._I_U.tinMap;
		return tinMap.clone();
	}

	public List<String> splitRegex(App NE) {
		AES_QMS_XSD_TIH input = NE._I_U.inputString;
		AES_QMS_XSD_TIH split = NE._I_U.split;
		AES_QMS_XSD_TIH unSplit = NE._I_U.unSplit;
		return DoSplit.splitRegex(input._S_, split._S_, unSplit._S_,
			"\\");
	}
}
