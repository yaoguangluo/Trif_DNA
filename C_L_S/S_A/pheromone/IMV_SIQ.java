package S_A.pheromone;

import ME.VPC.M.app.App;
import M_V.ME.APM.VSQ.xlx.CommonRotClass;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import P_V.PCI.ASQ.demension.Line2D;
import P_V.PCI.ASQ.demension.Line3D;
import S_A.SixActionMap.FlowerAction;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * * 作者的家庭是父亲 罗荣武，母亲 刘瑞珍，女儿 christina.yaja.luo/罗雅佳, 前妻ringli/李妙环。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class IMV_SIQ extends ConcurrentHashMap {
	public boolean containsKeyChar(char input) {
		if (this.containsKey("" + input)) {
			return true;
		}
		return false;
	}

	public boolean getCompareV(String key, String compare) {
		if (this.containsKey(key)) {
			return this.get(key).toString().equalsIgnoreCase(compare);
		}
		return false;
	}

	public CommonRotClass getCommonRotClass(String string) {
		if (this.containsKey(string)) {
			return (CommonRotClass) this.get(string);
		}
		return null;
	}

	public ArrayList<AMV_MVS_VSQ_3D> getArrayList_AMV_MVS_VSQ_3D(
			double shortestDoubleScale) {
		Double _shortestDoubleScale = Double.valueOf(shortestDoubleScale);
		if (this.containsKey(_shortestDoubleScale)) {
			return (ArrayList<AMV_MVS_VSQ_3D>) this.get(_shortestDoubleScale);
		}
		return null;
	}

	public int getInt(String subject) {
		if (this.containsKey(subject)) {
			return (int) this.get(subject);
		}
		return -1;
	}

	public void putBoolean(String string, boolean value) {
		this.put(string, value);
	}

	public AMV_MVS_VSQ_3D get_AMV_MVS_VSQ_3D(double doubleScale) {
		Double _doubleScale = Double.valueOf(doubleScale);
		if (this.containsKey(_doubleScale)) {
			return (AMV_MVS_VSQ_3D) this.get(_doubleScale);
		}
		return null;
	}

	public ArrayList<AMV_MVS_VSQ_2D> get_List_AMV_MVS_VSQ_2D(
			double doubleScale) {
		Double _doubleScale = Double.valueOf(doubleScale);
		if (this.containsKey(_doubleScale)) {
			return (ArrayList<AMV_MVS_VSQ_2D>) this.get(_doubleScale);
		}
		return null;
	}

	public AMV_MVS_VSQ_2D get_AMV_MVS_VSQ_2D(Double shortestDoubleScale) {
		if (this.containsKey(shortestDoubleScale)) {
			return (AMV_MVS_VSQ_2D) this.get(shortestDoubleScale);
		}
		return null;
	}

	public IMV_SIQ getStringMap(String tag) {
		if (this.containsKey(tag)) {
			return (IMV_SIQ) this.get(tag);
		}
		return null;
	}

	public List<Line2D> getListLine2D(double distanceDouble) {
		Double _distanceDouble = Double.valueOf(distanceDouble);
		if (this.containsKey(_distanceDouble)) {
			return (List<Line2D>) this.get(_distanceDouble);
		}
		return null;
	}

	public List<Line3D> getListLine3D(double distanceDouble) {
		Double _distanceDouble = Double.valueOf(distanceDouble);
		if (this.containsKey(_distanceDouble)) {
			return (List<Line3D>) this.get(_distanceDouble);
		}
		return null;
	}

	public void putObject(String string, Object value) {
		this.put(string, value);
	}

	public void putString(String string, String value) {
		this.put(string, value);
	}

	public LinkNode getLinkNode(String string) {
		if (this.containsKey(string)) {
			return (LinkNode) this.get(string);
		}
		return null;// later null inst;
	}

	// java的一个失败点，类似构造体因为mutable寻址不同不能互相继承，不灵活。
	public StringBuilder getStringBuilder(String subject) {
		if (this.containsKey(subject)) {
			Object object = this.get(subject);
			if (object instanceof String) {
				return new StringBuilder().append(object);
			}
			if (object instanceof StringBuilder) {
				return (StringBuilder) object;
			}

		}
		return null;
	}

	public void couldSQLThenSQL(String key, String[] strings, TinMap output,
			App NE) throws InterruptedException, IOException {// 7代花再缩减 flex
		for (String actionKey : (Iterable<String>) FlowerAction.FlowerP_E_KernelActions
				.keySet()) {
			if (key.contains(actionKey)) {// later separate.
				String temp = FlowerAction.FlowerP_E_KernelActions
						.getString(actionKey);
				FlowerAction.doAction(temp, strings, output, NE);
			}
		}
	}

	// later in SVO parts
	public double getDouble(String string) {
		if (this.containsKey(string)) {
			Object doub = this.get(string);
			if (null != doub) {
				return (Double) doub;
			}
		}
		return 0.0;
	}

	public IMV_SIQ QSV_IMV_SIQ(String key) {
		if (this.containsKey(key)) {
			return (IMV_SIQ) this.get(key);
		}
		return new IMV_SIQ();// avoid null;
	}
	// later for char

	// later for char
	public void couldDoThenDo(String key, String[] strings, TinMap output,
			App NE) throws InterruptedException, IOException {// 7代花再缩减 flex
		Iterator<String> iterators = FlowerAction.FlowerSixDomainActions
				.keySet().iterator();
		while (iterators.hasNext()) {
			String actionKey = iterators.next();
			if (key.contains(actionKey)) {// later separate.
				String temp = FlowerAction.FlowerSixDomainActions
						.getString(actionKey);
				FlowerAction.doAction(temp, strings, output, NE);
			}
		}
	}

	public boolean getBoolean(String string) {
		return (boolean) this.get(string);
	}

	public String getString(String key) {
		if (this.containsKey(key)) {
			return this.get(key).toString();
		}
		return "";
	}

	public String getString(char key) {
		String string = String.valueOf(key);
		if (this.containsKey(string)) {
			return this.get(string).toString();
		}
		return "";
	}

	public void putLinkNode(String primaryKey, LinkNode node) {
		this.put(primaryKey, node);
	}

	public List<Integer> getList(int color) {
		if (this.containsKey(color)) {
			return (List<Integer>) this.get(color);
		}
		return null;
	}

	public List<String> getListString(double key) {
		Double _key = Double.valueOf(key);
		if (this.containsKey(_key)) {
			return (List<String>) this.get(_key);
		}
		return null;
	}

	public void putList(int color, List<Integer> pointRange) {
		this.put(color, pointRange);
	}

	public Row getRow(String string) {
		if (this.contains(string)) {
			return (Row) this.get(string);
		}
		return null;
	}

	public void putRow(String s, Row huaRuiJiJtableRow) {
		this.put(s, huaRuiJiJtableRow);
	}

	public void put_IMV_SIQ(String cellName, IMV_SIQ culumnMap) {
		this.put(cellName, culumnMap);
	}

	public void putDouble(String mapSearchaAtII, double bonusPerRatio) {
		this.put(mapSearchaAtII, bonusPerRatio);
	}

	public void putObjectMatrix(Object huaRuiJiJtableCulumn, Object o) {
		this.put(huaRuiJiJtableCulumn, o);
	}

	public void putList2D(double mapKey, List<AMV_MVS_VSQ_2D> positions) {
		this.put(mapKey, positions);
	}
}
//    public double getDouble(String key){
//        if(this.containsKey(key)){
//            return (Double)(this.get(key));
//        }
//        return 0.0;
//    }

//    public String getTrimString(String key){
//        if(this.containsKey(key)) {
//            return this.get(key).toString().replaceAll("\\s*", "");
//        }
//        return "";
//    }
//    public boolean getCompareV(String key, String compare){
//        if(this.containsKey(key)){
//            return this.get(key).toString().equalsIgnoreCase(compare);
//        }
//       return false;
//    }