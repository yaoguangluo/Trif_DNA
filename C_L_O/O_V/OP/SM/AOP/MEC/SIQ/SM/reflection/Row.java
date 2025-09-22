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
//我在想要不要数据库，要了麻烦。内存增量巨恶心。
public class Row{
	private ConcurrentHashMap<String, Cell> cells;

	public boolean containsCell(String cellName) {
		if(cells.containsKey(cellName)) {
			return true;
		}
		return false;
	}
	public ConcurrentHashMap<String, Cell> getCells() {
		return cells;
	}

	public void I_Cells(ConcurrentHashMap<String, Cell> cells) {
		this.cells= cells;
	}

	public Cell getCell(String cellName) {
		if(cells.containsKey(cellName)) {
			return cells.get(cellName);
		}
		return null;	
	}

	public void putCell(String cellName, Cell cell) {
		this.cells.put(cellName, cell);
	}


	public void D_Cell(String cellName) {
		if(cells.containsKey(cellName)) {
			cells.remove(cellName);
		}
	}
}
