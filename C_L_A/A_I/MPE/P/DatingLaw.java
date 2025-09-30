package A_I.MPE.P;


/*
 * 个人著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 * 15116110525- 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道
 * 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅 第三层
 */
public class DatingLaw{
	public RST dating(RST father, RST mother) {
		RST son= new RST();
		//random
		if(Math.random()>0.5) {
			son.I_FatherDeque(father.getFatherDeque());
		}else {
			son.I_FatherDeque(father.getMotherDeque());
		}
		
		if(Math.random()<0.5) {
			son.I_MotherDeque(mother.getMotherDeque());
		}else {
			son.I_MotherDeque(mother.getFatherDeque());
		}	
		return son;
	}
}
