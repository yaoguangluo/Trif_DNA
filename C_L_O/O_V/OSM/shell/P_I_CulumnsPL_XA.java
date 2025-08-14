package O_V.OSM.shell;

import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
@SuppressWarnings({"unused", "unchecked"})
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class P_I_CulumnsPL_XA {
    public static Object getCulumnsMapWithAs(String[] sets, IMV_SIQ row) {
        return row.get(sets[2]);
    }

    public static Object getCulumnsMap(String[] sets, IMV_SIQ row) {
        return row.get(sets[0]);
    }

    public static Object P_GetCulumnsMap(List<IMV_SIQ> obj, String[] getCulumnsValueArray) {
        List<IMV_SIQ> newobj = new ArrayList<IMV_SIQ>();
        Iterator<IMV_SIQ> iterator = obj.iterator();
        int count = 0;
        NextRow:
        while (iterator.hasNext()) {
            int rowId = count++;
            IMV_SIQ row = iterator.next();
            IMV_SIQ newRow = new IMV_SIQ();
            IMV_SIQ rowValue = new IMV_SIQ();
            NextCell:
            for (int i = 1; i < getCulumnsValueArray.length; i++) {
                String[] sets = getCulumnsValueArray[i].split("\\|");
                if (null != sets && ((IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE)).containsKey(sets[0])) {
                    IMV_SIQ cell
                        = (IMV_SIQ) ((IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE)).get(sets[0]);
                    if (1 == sets.length) {
                        rowValue.put(sets[0], cell);
                        continue NextCell;
                    }
                    if (3 == sets.length && sets[1].equalsIgnoreCase("改名为")) {
                        cell.put(S_ShellETL.SHELL_ETL_CULUMNNAME, sets[2]);
                        rowValue.put(sets[2], cell);
                        continue NextCell;
                    }
                }
            }
            newRow.put(S_ShellETL.SHELL_ETL_ROWVALUE, rowValue);
            newobj.add(newRow);
        }
        obj.clear();
        return obj.addAll(newobj);
    }
}
//	i' m tin god
