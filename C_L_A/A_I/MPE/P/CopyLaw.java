package A_I.MPE.P;

import S_A.pheromone.IMV_SIQ;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CopyLaw {
	public DNA copy(DNA dna) {
		DNA newDna = new DNA();
		newDna.functionLineDeque = copy(dna.getMaskLineDeque());
		newDna.maskLineDeque = mask(newDna.functionLineDeque,
				dna.getFunctionLineDeque(), dna.getMaskLineDeque());
		newDna.functionLineMap = copyMap(newDna.maskLineDeque);
		newDna.maskLineMap = copyMap(newDna.functionLineDeque);
		return newDna;
	}

	@SuppressWarnings("unchecked")
	public ConcurrentHashMap<Integer, PDN> copyMap(
			ConcurrentLinkedDeque<PDN> functionLineDeque) {
		ConcurrentHashMap<Integer, PDN> output = new IMV_SIQ();
		Iterator<PDN> iterator = functionLineDeque.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			PDN pdn = iterator.next();
			boolean[] booleanPdn = pdn.getPdn();
			boolean[] booleanPdnNew = new boolean[booleanPdn.length];
			for (int i = 0; i < booleanPdn.length; i++) {
				booleanPdnNew[i] = !booleanPdn[i];
			}
			PDN pdnNew = new PDN();
			pdnNew.I_Pdn(booleanPdnNew);
			output.put(count++, pdnNew);
		}
		return output;
	}

	public ConcurrentLinkedDeque<PDN> mask(
			ConcurrentLinkedDeque<PDN> originDeque,
			ConcurrentLinkedDeque<PDN> newDeque,
			ConcurrentLinkedDeque<PDN> maskOutput) {
		Iterator<PDN> iteratorOriginDeque = originDeque.iterator();
		Iterator<PDN> iteratorNewDeque = newDeque.iterator();
		while (iteratorOriginDeque.hasNext()) {
			PDN pdnOriginDeque = iteratorOriginDeque.next();
			PDN pdnNewDeque = iteratorNewDeque.next();
			boolean[] booleanPdnOriginDeque = pdnOriginDeque.getPdn();
			boolean[] booleanPdnNewDeque = pdnNewDeque.getPdn();
			for (int i = 0; i < booleanPdnOriginDeque.length; i++) {
				if (booleanPdnOriginDeque[i] != booleanPdnNewDeque[i]) {
					return null;
				}
			}
		}
		return maskOutput;
	}

	public ConcurrentLinkedDeque<PDN> copy(
			ConcurrentLinkedDeque<PDN> maskLineDeque) {
		ConcurrentLinkedDeque<PDN> output = new ConcurrentLinkedDeque<>();
		Iterator<PDN> iterator = maskLineDeque.iterator();
		while (iterator.hasNext()) {
			PDN pdn = iterator.next();
			boolean[] booleanPdn = pdn.getPdn();
			boolean[] booleanPdnNew = new boolean[booleanPdn.length];
			for (int i = 0; i < booleanPdn.length; i++) {
				booleanPdnNew[i] = !booleanPdn[i];
			}
			PDN pdnNew = new PDN();
			pdnNew.I_Pdn(booleanPdnNew);
			output.add(pdnNew);
		}
		return output;
	}

	public DNA mutationCopy(DNA dna) {
		DNA newDna = new DNA();
		newDna.maskLineDeque = copy(dna.getMaskLineDeque());
		newDna.functionLineDeque = mask(newDna.maskLineDeque,
				dna.getFunctionLineDeque(), dna.getMaskLineDeque());
		newDna.functionLineMap = copyMap(newDna.maskLineDeque);
		newDna.maskLineMap = copyMap(newDna.functionLineDeque);
		return newDna;
	}
}
