package M_V.MSV.OSU.list;

import S_A.ESU.code.stable.S_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ListValidation{
	public static boolean ListSetsCheck(List<Object> list, String setsType) {
		Iterator<Object> iterator= list.iterator();
		while(iterator.hasNext()) {
			Object object= iterator.next();
			if(setsType.equalsIgnoreCase(S_.STRING_DOUBLE)) {
				if(!(object instanceof Double)) {
					return false;
				}	
			}
			if(setsType.equalsIgnoreCase(S_.STRING_INT)) {
				if(!(object instanceof Integer)) {
					return false;
				}	
			}
			if(setsType.equalsIgnoreCase(S_.STRING_FLOAT)) {
				if(!(object instanceof Float)) {
					return false;
				}	
			}
			if(setsType.equalsIgnoreCase(S_.STRING_STRING)) {
				if(!(object instanceof String)) {
					return false;
				}	
			}
			if(setsType.equalsIgnoreCase(S_.STRING_SHORT)) {
				if(!(object instanceof Short)) {
					return false;
				}	
			}
			if(setsType.equalsIgnoreCase(S_.STRING_BOOLEAN)) {
				if(!(object instanceof Boolean)) {
					return false;
				}	
			}
			if(setsType.equalsIgnoreCase(S_.STRING_LONG)) {
				if(!(object instanceof Long)) {
					return false;
				}	
			}
			if(setsType.equalsIgnoreCase(S_.STRING_BYTE)) {
				if(!(object instanceof Byte)) {
					return false;
				}	
			}
		}
		return true;	
	}

	public static List<Object> ListSetsFix(List<Object> list
			, String setsType) {
		List<Object> output= new ArrayList<>();
		Iterator<Object> iterator= list.iterator();
		while(iterator.hasNext()) {
			Object object= iterator.next();
			if(setsType.equalsIgnoreCase(S_.STRING_DOUBLE)) {
				if(!(object instanceof Double)) {
					output.add((double)0.00);
				}else {
					output.add(object);
				}

			}
			if(setsType.equalsIgnoreCase(S_.STRING_INT)) {
				if(!(object instanceof Integer)) {
					output.add((int)0);
				}else {
					output.add(object);
				}
			}
			if(setsType.equalsIgnoreCase(S_.STRING_FLOAT)) {
				if(!(object instanceof Float)) {
					output.add((float)0.0);
				}else {
					output.add(object);
				}
			}
			if(setsType.equalsIgnoreCase(S_.STRING_STRING)) {
				if(!(object instanceof String)) {
					output.add(S_.STRING_EMPTY);
				}else {
					output.add(object);
				}
			}
			if(setsType.equalsIgnoreCase(S_.STRING_SHORT)) {
				if(!(object instanceof Short)) {
					output.add((short)0);
				}else {
					output.add(object);
				}
			}
			if(setsType.equalsIgnoreCase(S_.STRING_BOOLEAN)) {
				if(!(object instanceof Boolean)) {
					output.add(false);
				}else {
					output.add(object);
				}
			}
			if(setsType.equalsIgnoreCase(S_.STRING_LONG)) {
				if(!(object instanceof Long)) {
					output.add((long)(0));
				}else {
					output.add(object);
				}
			}
			if(setsType.equalsIgnoreCase(S_.STRING_BYTE)) {
				if(!(object instanceof Byte)) {
					output.add((byte)0);
				}else {
					output.add(object);
				}
			}
		}
		return output;	
	}
}
