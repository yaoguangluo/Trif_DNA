package M_V.ME.ConditionPLSQL_;

import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;
import S_A.pheromone.IMV_SIQ;

import java.io.File;
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
public class X_Kernel extends X_ {
    //比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
    //这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后朔源.
    //准备验算下20210406 罗瑶光
    public static void P_kernel(File readDBTableRowIndexFile
        , List<IMV_SIQ> output, Row bufferRow, IMV_SIQ rowMap) {
        String[] culumnList = readDBTableRowIndexFile.list();
        assert culumnList != null;
        for (String culumn : culumnList) {
            if (culumn.contains("is_delete")) {
                continue;
            }
            String DBTableCulumnIndexPath = readDBTableRowIndexFile + "/" + culumn;
            File readDBTableCulumnIndexPathFile = new File(DBTableCulumnIndexPath);
            Cell cell = new Cell();
            if (readDBTableCulumnIndexPathFile.isDirectory()) {
                //似乎被动了手脚, 20210405 罗瑶光重新检查
                DetaBufferedReader reader = new DetaBufferedReader(DetaFileReader
                    .E(readDBTableCulumnIndexPathFile + "/" + "value.lyg"));
                String temp = "";
                String tempString;
                while ((tempString = reader.readDetaLine()) != null) {
                    temp += tempString;
                }
                reader.closeDeta();
                rowMap.put(culumn, temp);
                cell.I_CellValue(temp);
                bufferRow.putCell(culumn, cell);
            } else {
                rowMap.put(culumn, null);
                cell.I_CellValue(null);
                bufferRow.putCell(culumn, cell);
            }
        }
        output.add(rowMap);
    }
}
