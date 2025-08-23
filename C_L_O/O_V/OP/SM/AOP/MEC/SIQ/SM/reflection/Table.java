package O_V.OP.SM.AOP.MEC.SIQ.SM.reflection;
import java.util.concurrent.ConcurrentHashMap;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Table{
	private ConcurrentHashMap<String, Row> rows;
	public void I_Spec(Spec spec) {
		this.spec= spec;
	}
	private Spec spec;
	public Spec getSpec() {
		return spec;
	}
	public ConcurrentHashMap<String, Row> getRows() {
		return rows;
	}
	
	public void I_Rows(ConcurrentHashMap<String, Row> rows) {
		this.rows= rows;
	}
	
	public Row getRow(String rowName) {
		if(rows.containsKey(rowName)) {
			return rows.get(rowName);
		}
		return null;	
	}

	public void putRow(String rowName, Row row) {
		this.rows.put(rowName, row);
	}

	public void D_Row(String rowName) {
		if(rows.containsKey(rowName)) {
			rows.remove(rowName);
		}
	}
}
