package O_V.OSA.shell;

import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;

//还是要变成map, 不然 命令的 key值查询 只能forloop, 效率减低
//罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class XA_ShellTable{
	public Object[] getHuaRuiJiJtableCulumns() {
		return huaRuiJiJtableCulumns;
	}
	public void setHuaRuiJiJtableCulumns(Object[] huaRuiJiJtableCulumns) {
		this.huaRuiJiJtableCulumns= huaRuiJiJtableCulumns;
	}
	public Object[][] getHuaRuiJiJtable() {
		return huaRuiJiJtable;
	}
	public void setHuaRuiJiJtable(Object[][] huaRuiJiJtable) {
		this.huaRuiJiJtable= huaRuiJiJtable;
	}
	public Object getHuaRuiJiJtableName() {
		return huaRuiJiJtableName;
	}
	public void setHuaRuiJiJtableName(Object huaRuiJiJtableName) {
		this.huaRuiJiJtableName= huaRuiJiJtableName;
	}
	public Row[] getHuaRuiJiJtableRows() {
		return huaRuiJiJtableRows;
	}
	public void setHuaRuiJiJtableRows(Row[] huaRuiJiJtableRows) {
		this.huaRuiJiJtableRows= huaRuiJiJtableRows;
	}
	
	public Object[] huaRuiJiJtableCulumns;
	public Object[][] huaRuiJiJtable;
	public Row[] huaRuiJiJtableRows;
	public Object huaRuiJiJtableName;
}
