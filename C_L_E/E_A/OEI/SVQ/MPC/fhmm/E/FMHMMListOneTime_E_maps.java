package E_A.OEI.SVQ.MPC.fhmm.E;

import C_A.OCI.SVQ.MPC.fhmm.C.FHMMList;
import ME.VPC.M.app.App;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import VSQ.parser.FMHMMListOneTime_E_X_S;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.nlp.StopSymbol_UTF8;

import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

//I will build a collection class for managing this maps. at the next version.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings({ "unchecked", "resource", "unused" })
public class FMHMMListOneTime_E_maps extends FMHMMListOneTime_E_X_S
		implements FHMMList {
	// 之后去掉一切古老的继承关系接口规范 如extends implements，等。
	public List<String> englishStringToWordsList(String string) {
		List<String> list = new LinkedList<>();
		string = string.replaceAll(S_Pos.NLP_SPASE_REP, S_Pos.SPACE_STRING);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			if (StopSymbol_UTF8.symbol
					.contains(S_Pos.EMPTY_STRING + string.charAt(i))) {
				list.add(sb.toString().toLowerCase());
				sb.delete(S_Pos.INT_ZERO, sb.length());
				list.add(String.valueOf(string.charAt(i)));
			} else {
				sb.append(string.charAt(i));
			}
		}
		if (S_Pos.INT_ZERO < sb.length()) {
			list.add(sb.toString().toLowerCase());
		}
		return list;
	}

	public Map<Long, FMHMMNode> getMap() {
		return this.linkedHashMap;
	}

	public Map<Long, FMHMMNode>[] getMaps() {
		int segment = this.linkedHashMap.size();
		int perRatio = segment / S_Pos.INT_SIX;
		Map<Long, FMHMMNode>[] maps = new IMV_SIQ[S_Pos.INT_SIX];
		Iterator<Long> iterator = this.linkedHashMap.keySet().iterator();
		maps[S_Pos.INT_ZERO] = new IMV_SIQ();
		int index = S_Pos.INT_ZERO;
		int count = S_Pos.INT_ONE;
		while (iterator.hasNext()) {
			if (S_Pos.INT_ZERO == count++ % perRatio) {
				if (index < S_Pos.INT_FIVE) {
					index++;
					maps[index] = new IMV_SIQ();
				}
			}
			Long key = iterator.next();
			maps[index].put(key, this.linkedHashMap.get(key));
		}
		return maps;
	}

	// 稍后translator的index 去重 统一用index mixed
	public void index() {
		posCnToCn = new IMV_SIQ();
		linkedHashMap = new IMV_SIQ();
		listCn = new CopyOnWriteArrayList<>();
		InputStream inputStream = getClass()
				.getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_CN);
		DetaBufferedReader cReader = new DetaBufferedReader(
				DetaInputStreamReader.E(inputStream, S_Pos.UTF8_STRING));
		String cInputString;
		Here: while ((cInputString = cReader.readDetaLine()) != null) {
			listCn.add(cInputString);
			if (!(!cInputString.replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING)
					.equals(S_Pos.EMPTY_STRING)
					&& cInputString.split(
							S_Pos.NLP_SYMBO_SLASH).length > S_Pos.INT_ONE)) {
				continue Here;
			}
			if (!S_Maps.fuCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_FU)) {
				S_Maps.fuCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.dongCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_DONG)) {
				S_Maps.dongCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.liangCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_LIANG)) {
				S_Maps.liangCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.lianCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_LIAN)) {
				S_Maps.lianCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.baDongCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_BA_DONG)) {
				S_Maps.baDongCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.xianDingCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_XIAN_DING)) {
				S_Maps.xianDingCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.mingCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_MING)) {
				S_Maps.mingCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.daiCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_DAI)) {
				S_Maps.daiCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.jieCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_JIE)) {
				S_Maps.jieCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.xingRongCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_XING_RONG)) {
				S_Maps.xingRongCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.zhuCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_ZHU)) {
				S_Maps.zhuCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.weiCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_WEI)) {
				S_Maps.weiCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.shengLueCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_SHENG_LUE)) {
				S_Maps.shengLueCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.qingTaiCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_QING_TAI)) {
				S_Maps.qingTaiCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.xingWeiCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_XING_WEI)) {
				S_Maps.xingWeiCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.shiTaiCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_SHI_TAI)) {
				S_Maps.shiTaiCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			if (!S_Maps.dingMingCi.containsKey(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
					&& cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.contains(S_Pos.NLP_CI_DING_MING)) {
				S_Maps.dingMingCi.put(
						cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
						new StringBuilder(cInputString
								.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			}
			posCnToCn.put(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					new StringBuilder(cInputString
							.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
			linkedHashMap = loopLoadForest(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexFullEnToCn() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listee = listEn.iterator();
		fullEnToCn = new IMV_SIQ();
		while (listcc.hasNext() && listee.hasNext()) {
			fullEnToCn.put(
					listee.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase(),
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]);
		}
	}

	public void indexFullCnToEn() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listee = listEn.iterator();
		fullCnToEn = new IMV_SIQ();
		while (listcc.hasNext() && listee.hasNext()) {
			fullCnToEn.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listee.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public void indexFullCnToFn() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listfn = listFn.iterator();
		fullCnToFn = new IMV_SIQ();
		while (listcc.hasNext() && listfn.hasNext()) {
			fullCnToFn.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listfn.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public void indexFullCnToKo() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listko = listKo.iterator();
		fullCnToKo = new IMV_SIQ();
		while (listcc.hasNext() && listko.hasNext()) {
			fullCnToKo.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listko.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public void indexFullCnToJp() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listjp = listJp.iterator();
		fullCnToJp = new IMV_SIQ();
		while (listcc.hasNext() && listjp.hasNext()) {
			fullCnToJp.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listjp.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public void indexFullCnToGm() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listgm = listGm.iterator();
		fullCnToGm = new IMV_SIQ();
		while (listcc.hasNext() && listgm.hasNext()) {
			fullCnToGm.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listgm.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public void indexFullCnToSp() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listsp = listSp.iterator();
		fullCnToSp = new IMV_SIQ();
		while (listcc.hasNext() && listsp.hasNext()) {
			fullCnToSp.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listsp.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public void indexFullCnToRs() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listrs = listRs.iterator();
		fullCnToRs = new IMV_SIQ();
		while (listcc.hasNext() && listrs.hasNext()) {
			fullCnToRs.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listrs.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public void indexFullCnToAb() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listab = listAb.iterator();
		fullCnToAb = new IMV_SIQ();
		while (listcc.hasNext() && listab.hasNext()) {
			fullCnToAb.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listab.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public void indexFullCnToPy() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listpy = listPy.iterator();
		fullCnToPy = new IMV_SIQ();
		while (listcc.hasNext() && listpy.hasNext()) {
			fullCnToPy.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listpy.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public void indexFullCnToTt() {
		Iterator<String> listcc = listCn.iterator();
		Iterator<String> listtt = listTt.iterator();
		fullCnToTt = new IMV_SIQ();
		while (listcc.hasNext() && listtt.hasNext()) {
			fullCnToTt.put(
					listcc.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					listtt.next().split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase());
		}
	}

	public IMV_SIQ getFullEnToCn() {
		return this.fullEnToCn;
	}

	public IMV_SIQ getFullCnToEn() {
		return this.fullCnToEn;
	}

	public void indexPosEnToCn(App NE) {
		posEnToCn = new IMV_SIQ();
		// InputStream in=
		// getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_EN_TO_CN);
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_EN_TO_CN, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		Here: while (null != (cInputString = cReader.readDetaLine())) {
			if (!(!cInputString.replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING)
					.equals(S_Pos.EMPTY_STRING)
					&& cInputString.split(
							S_Pos.NLP_SYMBO_SLASH).length > S_Pos.INT_ONE)) {
				continue Here;
			}
			posEnToCn.put(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase(),
					new StringBuilder(cInputString
							.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
		}
		cReader.closeDeta();
	}

	public void indexFn(App NE) {
		listFn = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_FN, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			listFn.add(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexKo(App NE) {
		listKo = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_KO, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			listKo.add(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexJp(App NE) {
		listJp = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_JP, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			listJp.add(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexGm(App NE) {
		listGm = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_GM, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			listGm.add(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexSp(App NE) {
		listSp = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_SP, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			listSp.add(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexAb(App NE) {
		listAb = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_AB, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			listAb.add(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexRs(App NE) {
		listRs = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_RS, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			listRs.add(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexPy(App NE) {
		listPy = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_PY, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			listPy.add(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexTt(App NE) {
		listTt = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_TT, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			listTt.add(cInputString);
		}
		cReader.closeDeta();
	}

	public void indexPosEnToEn(App NE) {
		posEnToEn = new IMV_SIQ();
		listEn = new CopyOnWriteArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_POS_EN_TO_EN, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		Here: while (null != (cInputString = cReader.readDetaLine())) {
			listEn.add(cInputString);
			if (!(!cInputString.replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING)
					.equals(S_Pos.EMPTY_STRING)
					&& cInputString.split(
							S_Pos.NLP_SYMBO_SLASH).length > S_Pos.INT_ONE)) {
				continue Here;
			}
			posEnToEn.put(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase(),
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.toLowerCase());
		}
		cReader.closeDeta();
	}

	public void indexEnToCn(App NE) {
		enToCn = new IMV_SIQ();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_EN_TO_CN, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		Here: while (null != (cInputString = cReader.readDetaLine())) {
			if (!(!cInputString.replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING)
					.equals(S_Pos.EMPTY_STRING)
					&& cInputString.split(
							S_Pos.NLP_SYMBO_SLASH).length > S_Pos.INT_ONE)) {
				continue Here;
			}
			enToCn.put(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
							.toLowerCase(),
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]);
		}
		cReader.closeDeta();
	}

	public void indexCnToEn(App NE) {
		cnToEn = new IMV_SIQ();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_Pos.WORDS_SOURSE_LINK_CN_TO_EN, NE.resourceTail + "lygs/",
				S_Pos.UTF8_STRING);
		String cInputString;
		Here: while (null != (cInputString = cReader.readDetaLine())) {
			if (!(!cInputString.replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING)
					.equals(S_Pos.EMPTY_STRING)
					&& cInputString.split(
							S_Pos.NLP_SYMBO_SLASH).length > S_Pos.INT_ONE)) {
				continue Here;
			}
			cnToEn.put(
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO],
					cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
							.toLowerCase());
		}
		cReader.closeDeta();
	}

	public Map<Long, FMHMMNode> loopLoadForest(String cInputString) {
		Here: for (int i = S_Pos.INT_ZERO; i < cInputString.length(); i++) {
			if (linkedHashMap
					.containsKey(Long.valueOf(cInputString.charAt(i)))) {
				FMHMMNode fHHMMNode = linkedHashMap
						.get(Long.valueOf(cInputString.charAt(i)));
				linkedHashMap = doNeroPostCognitive(fHHMMNode, cInputString, i);
				continue Here;
			}
			FMHMMNode fHHMMNode = new FMHMMNode();
			fHHMMNode.I_Vb(S_Pos.EMPTY_STRING + cInputString.charAt(i));
			if (i + S_Pos.INT_ONE < cInputString.length()) {
				Map<String, Integer> next = new IMV_SIQ();
				next.put(
						S_Pos.EMPTY_STRING
								+ cInputString.charAt(i + S_Pos.INT_ONE),
						S_Pos.INT_ONE);
				fHHMMNode.I_Next(next);
			}
			linkedHashMap.put(Long.valueOf(cInputString.charAt(i)), fHHMMNode);
		}
		return linkedHashMap;
	}

	public Map<Long, FMHMMNode> doNeroPostCognitive(FMHMMNode fFHMMNode,
			String cInputString, int i) {
		if (null != fFHMMNode.getNext()) {
			if (i + S_Pos.INT_ONE < cInputString.length()) {
				linkedHashMap = doCheckAndRunNeroPostFix(fFHMMNode,
						cInputString, i);
			}
			return linkedHashMap;
		}
		Map<String, Integer> HashMap = new IMV_SIQ();
		if (i + S_Pos.INT_ONE < cInputString.length()) {
			HashMap.put(
					S_Pos.EMPTY_STRING + cInputString.charAt(i + S_Pos.INT_ONE),
					S_Pos.INT_ONE);
		}
		fFHMMNode.I_Next(HashMap);
		linkedHashMap.put(Long.valueOf(cInputString.charAt(i)), fFHMMNode);
		return linkedHashMap;
	}

	public Map<Long, FMHMMNode> doCheckAndRunNeroPostFix(FMHMMNode fFHMMNode,
			String cInputString, int i) {
		if (!fFHMMNode.getNext().containsKey(
				S_Pos.EMPTY_STRING + cInputString.charAt(i + S_Pos.INT_ONE))) {
			Map<String, Integer> map = fFHMMNode.getNext();
			map.put(S_Pos.EMPTY_STRING + cInputString.charAt(i + S_Pos.INT_ONE),
					S_Pos.INT_ONE);
			fFHMMNode.I_Next(map);
			linkedHashMap.put(Long.valueOf(cInputString.charAt(i)), fFHMMNode);
		}
		return linkedHashMap;
	}

	public IMV_SIQ getPosCnToCn() {
		return this.posCnToCn;
	}

	public IMV_SIQ getEnToCn() {
		return enToCn;
	}

	public IMV_SIQ getCnToEn() {
		return cnToEn;
	}

	public IMV_SIQ getPosEnToCn() {
		return this.posEnToCn;
	}

	public IMV_SIQ getPosEnToEn() {
		return this.posEnToEn;
	}

	public IMV_SIQ getFullCnToJp() {
		return this.fullCnToJp;
	}

	public IMV_SIQ getFullCnToRs() {
		return this.fullCnToRs;
	}

	public IMV_SIQ getFullCnToAb() {
		return this.fullCnToAb;
	}

	public IMV_SIQ getFullCnToFn() {
		return this.fullCnToFn;
	}

	public IMV_SIQ getFullCnToGm() {
		return this.fullCnToGm;
	}

	public IMV_SIQ getFullCnToKo() {
		return this.fullCnToKo;
	}

	public IMV_SIQ getFullCnToSp() {
		return this.fullCnToSp;
	}

	public IMV_SIQ getFullCnToPy() {
		this.fullCnToPy.put("鼋", "yuan");// 这些我稍后也会移动到stable文件中去, 免得乱码。
		this.fullCnToPy.put("鹑", "chun");
		this.fullCnToPy.put("鸲鹆", "qu yu");
		this.fullCnToPy.put("鲚鱼", "ji yu");
		this.fullCnToPy.put("鲎", "hou");
		this.fullCnToPy.put("醍醐", "ti hu");
		this.fullCnToPy.put("豹", "bao");
		this.fullCnToPy.put("蟅", "zhe");
		this.fullCnToPy.put("蛴螬", "qi cao");
		this.fullCnToPy.put("蘹", "huai");
		this.fullCnToPy.put("堇", "jin");
		this.fullCnToPy.put("檗", "bo");
		this.fullCnToPy.put("濮", "pu");
		this.fullCnToPy.put("稆", "lv");
		this.fullCnToPy.put("穬", "kuang");
		this.fullCnToPy.put("箘", "jun");
		this.fullCnToPy.put("芰", "ji");
		this.fullCnToPy.put("茨菰", "ci gu");
		this.fullCnToPy.put("荏", "ren");
		this.fullCnToPy.put("荛", "rao");
		this.fullCnToPy.put("菉", "lu");
		this.fullCnToPy.put("菘", "song");
		this.fullCnToPy.put("蕺", "ji");
		this.fullCnToPy.put("蘩蒌", "fan cai");
		return this.fullCnToPy;
	}

	public IMV_SIQ getFullCnToTt() {
		return this.fullCnToTt;
	}

	public void indexFullNegative() {
		fullNegative = new IMV_SIQ();
		InputStream in = getClass()
				.getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_NEGATIVE);
		DetaBufferedReader cReader = new DetaBufferedReader(
				DetaInputStreamReader.E(in, S_Pos.UTF8_STRING));
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			if (!fullNegative.containsKey(cInputString)) {
				fullNegative.put(cInputString, S_Pos.EMPTY_STRING);
			}
		}
		cReader.closeDeta();
	}

	public void indexFullPositive() {
		fullPositive = new IMV_SIQ();
		InputStream in = getClass()
				.getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_POSITIVE);
		DetaBufferedReader cReader = new DetaBufferedReader(
				DetaInputStreamReader.E(in, S_Pos.UTF8_STRING));
		String cInputString;
		while (null != (cInputString = cReader.readDetaLine())) {
			if (!fullPositive.containsKey(cInputString)) {
				fullPositive.put(cInputString, S_Pos.EMPTY_STRING);
			}
		}
		cReader.closeDeta();

	}

	public IMV_SIQ getFullNegative() {
		return this.fullNegative;
	}

	public IMV_SIQ getFullPositive() {
		return this.fullPositive;
	}

	@Override
	public Map<Long, IMV_SIQ> getWordsForests() {
		Map<Long, IMV_SIQ> output = new IMV_SIQ();
		Iterator<String> WordTree = posCnToCn.keySet().iterator();
		while (WordTree.hasNext()) {
			String treeName = WordTree.next();
			if (0 < treeName.length()) {
				IMV_SIQ treeLeafs;
				if (output.containsKey(
						Long.valueOf(treeName.charAt(S_Pos.INT_ZERO)))) {
					treeLeafs = output
							.get(Long.valueOf(treeName.charAt(S_Pos.INT_ZERO)));
					treeLeafs.put(treeName, posCnToCn.get(treeName));
					output.put(Long.valueOf(treeName.charAt(S_Pos.INT_ZERO)),
							treeLeafs);
				} else {
					treeLeafs = new IMV_SIQ();
				}
				treeLeafs.put(treeName, posCnToCn.get(treeName));
				output.put(Long.valueOf(treeName.charAt(S_Pos.INT_ZERO)),
						treeLeafs);
			}
		}
		return output;
	}

	public void studyNewPos(String string, String posStudy) {
		posCnToCn.put(string, posStudy);
	}

	@Override
	public IMV_SIQ getStudyPos() {
		return this.studyPos;
	}
}

//604 //	if((string.charAt(i)> S_Data.INT_SIXTY_FOUR && string.charAt(i)<= S_Data.INT_NINTY)
////	||(string.charAt(i)>= S_Data.INT_NINTY_SEVEN && string.charAt(i)<= S_Data.INT_ONE_TWO_TWO)
////	||symbol.contains(S_Data.EMPTY_STRING+ string.charAt(i)) {
////sb.append(string.charAt(i));
////}else {
////list.add(sb.toString().toLowerCase());
////sb.delete(S_Data.INT_ZERO, sb.length());
////list.add(String.valueOf(string.charAt(i)));
////}