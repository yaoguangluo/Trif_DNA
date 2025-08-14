package O_V.OP.SM.AOP.MEC.SIQ.SM.reflection;

import S_A.pheromone.IMV_SIQ;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Spec{
	private IMV_SIQ culumnTypes;
	public IMV_SIQ getCulumnTypes() {
		return culumnTypes;
	}
	public void I_CulumnTypes(IMV_SIQ culumnTypes) {
		this.culumnTypes= culumnTypes;
	}
	public void I_CulumnType(String culumnName, String culumnType) {
		this.culumnTypes.put(culumnName, culumnType);
	}
	
	public String getCulumnType(String culumnName) {
		if(culumnTypes.containsKey(culumnName)) {
			return culumnTypes.getString(culumnName);
		}
		return null;	
	}

}
