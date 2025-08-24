package M_V.ME.E;

import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Base;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import U_A.PEU.P.cache.Cache_M;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("unchecked")
/*
 * 著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用） 15116110525-
 * 430181198505250014, G24402609, EB0581342 204925063,
 * 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路
 * 208号 阳光家园别墅小区 第十栋别墅
 */

public class PLSQLCommand_E_X_P_Check {
	// plsql函数执行指令 正在检查中 罗瑶光 20210405
	public static void _E(String acknowledge, TinMap object, boolean mod) {
		if (object.getCompareV("start", "1")) {
			PLSQLCommand_E_X_P_E_Kernel._E(object, mod);
		}
		List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("obj")));
		int totalPages = 0;
		if (obj != null) {
			totalPages = obj.size();
		}
		int rowBeginIndex = object.containsKey("pageBegin")
				? Integer.parseInt(object.get("pageBegin").toString())
				: 0;
		int rowEndIndex = object.containsKey("pageEnd")
				? Integer.parseInt(object.get("pageEnd").toString())
				: Math.min(totalPages, 15);
		object.put("pageBegin", rowBeginIndex);
		object.put("pageEnd", rowEndIndex);
		String DBPath = Objects.requireNonNull(Cache_M.getCacheInfo("DBPath"))
				.getValue().toString() + "/"
				+ object.get("baseName").toString();
		String DBTablePath = DBPath + "/" + object.get("tableName").toString();
		object.put("tablePath", DBTablePath);
		object.put("returnResult", "success");
		object.put("totalPages", totalPages);
		object.put("loginInfo", "success");
		List<Object> spec = new ArrayList<>();
		Iterator<String> iterator = Collections.emptyIterator();// later trif..
		if (obj == null || obj.size() < 1) {
			Base base = DetaDBBufferCache_M.db
					.getBase(object.get("baseName").toString());
			Table table = base.getTable(object.get("tableName").toString());
			if (null != table) {
				iterator = table.getSpec().getCulumnTypes().keySet().iterator();
			}
		} else {// 进行map 验证检测 罗瑶光 20210405
			IMV_SIQ map = obj.get(0);
			IMV_SIQ objectInMap = (IMV_SIQ) map
					.get(S_ShellETL.SHELL_ETL_ROWVALUE);
			iterator = null == objectInMap ? null
					: objectInMap.keySet().iterator();
		}
		if (iterator != null) {
			while (iterator.hasNext()) {
				spec.add(iterator.next());
			}
		}
		object.put("spec", spec);
	}
}
