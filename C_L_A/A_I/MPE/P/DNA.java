package A_I.MPE.P;
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
public class DNA{
	public ConcurrentLinkedDeque<PDN> getFunctionLineDeque() {
		return functionLineDeque;
	}
	
	public void I_FunctionLineDeque(ConcurrentLinkedDeque<PDN> functionLineDeque) {
		this.functionLineDeque= functionLineDeque;
	}
	
	public ConcurrentLinkedDeque<PDN> getMaskLineDeque() {
		return maskLineDeque;
	}
	
	public void I_MaskLineDeque(ConcurrentLinkedDeque<PDN> maskLineDeque) {
		this.maskLineDeque= maskLineDeque;
	}
	
	public ConcurrentHashMap<Integer, PDN> getFunctionLineMap() {
		return functionLineMap;
	}
	
	public void I_FunctionLineMap(ConcurrentHashMap<Integer, PDN> functionLineMap) {
		this.functionLineMap= functionLineMap;
	}
	
	public ConcurrentHashMap<Integer, PDN> getMaskLineMap() {
		return maskLineMap;
	}
	
	public void I_MaskLineMap(ConcurrentHashMap<Integer, PDN> maskLineMap) {
		this.maskLineMap= maskLineMap;
	}
	
	public ConcurrentLinkedDeque<PDN> functionLineDeque;
	public ConcurrentLinkedDeque<PDN> maskLineDeque;
	public ConcurrentHashMap<Integer, PDN> functionLineMap;
	public ConcurrentHashMap<Integer, PDN> maskLineMap;
}
