package E_A.ME.analysis.E;

import C_A.ME.analysis.C.BinaryForest_A;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SQI;

import java.util.Map;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class BinaryForest_AE extends AE implements BinaryForest_A {
	@SuppressWarnings("unchecked")
	public void studyNewWord(String study, String token, String posStudy) {
		// learn new word
		FMHMMNode fFHMMNode = forestRoots
				.get(Long.valueOf(study.charAt(S_Pos.INT_ZERO)));
		Map<String, Integer> map;
		if (null == fFHMMNode) {
			fFHMMNode = new FMHMMNode();
			map = new IMV_SQI();
		} else {
			map = fFHMMNode.getNext();
		}
		map.put(token, S_Pos.INT_ONE);
		fFHMMNode.I_Next(map);
		forestRoots.put(Long.valueOf(study.charAt(S_Pos.INT_ZERO)), fFHMMNode);
		// learn new pos
		fHMMList.studyNewPos(study + token, posStudy);
	}

	@Override
	public IMV_SQI getStudyPos() {
		return fHMMList.getStudyPos();
	}

	@Override
	public IMV_SQI getCtK() {
		return fHMMList.getFullCnToKo();
	}

	@Override
	public IMV_SQI getCtS() {
		return fHMMList.getFullCnToSp();
	}

	@Override
	public IMV_SQI getCtG() {
		return fHMMList.getFullCnToGm();
	}

	@Override
	public SensingTest getSensingTest() {
		return this.sensingTest;
	}

	public IMV_SQI getPosEnToCn() {
		return fHMMList.getPosEnToCn();
	}

	public IMV_SQI getPosEnToEn() {
		return fHMMList.getPosEnToEn();
	}

	@Override
	public IMV_SQI getPosCnToCn() {
		return fHMMList.getPosCnToCn();
	}

	public IMV_SQI getFullEnToCn() {
		return fHMMList.getFullEnToCn();
	}

	public IMV_SQI getFullCnToEn() {
		return fHMMList.getFullCnToEn();
	}

	public IMV_SQI getEnToCn() {
		return fHMMList.getEnToCn();
	}

	public IMV_SQI getCnToEn() {
		return fHMMList.getCnToEn();
	}
}
//	@Override
//	public IMV_SQI getPinYin() {
//		return fHMMList.getFullCnToPy();
//	}
//
//	@Override
//	public IMV_SQI getCtT() {
//		return fHMMList.getFullCnToTt();
//	}

//	@Override
//	public IMV_SQI getCtF() {
//		return fHMMList.getFullCnToFn();
//	}
//
//	@Override
//	public IMV_SQI getCtJ() {
//		return fHMMList.getFullCnToJp();
//	}
//
//	@Override
//	public IMV_SQI getCtR() {
//		return fHMMList.getFullCnToRs();
//	}
//
//	@Override
//	public IMV_SQI getCtA() {
//		return fHMMList.getFullCnToAb();
//	}