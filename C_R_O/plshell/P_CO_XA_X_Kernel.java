package plshell;

import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;
import S_A.pheromone.IMV_SIQ;

import java.io.File;
import java.io.FileReader;
import java.util.List;

//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
//先替换所有涉及DMA的函数片段
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class P_CO_XA_X_Kernel extends P_CO_XA_X_ {
    //比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
    //这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后溯源.
    //准备验算下20210406 罗瑶光
    public static void P_kernel(File readDBTableRowIndexFile,
                                List<IMV_SIQ> output, Row bufferRow, IMV_SIQ rowMap) {
        String[] culumnList = readDBTableRowIndexFile.list(); //生成一个列表头名组
        assert culumnList != null;
        for (String culumn : culumnList) { //遍历头名
            if (culumn.contains("is_delete")) {//已删除文件逃逸
                continue;
            }
            String DBTableCulumnIndexPath = readDBTableRowIndexFile + "/" + culumn;//开始取值
            File readDBTableCulumnIndexPathFile = new File(DBTableCulumnIndexPath);
            Cell cell = new Cell();
            if (readDBTableCulumnIndexPathFile.isDirectory()) {
                //似乎被动了手脚, 20210405 罗瑶光重新检查
                String string = readDBTableCulumnIndexPathFile + "/" + "value.lyg";
                FileReader fileReader = DetaFileReader.E(string);
                DetaBufferedReader reader = new DetaBufferedReader(fileReader);
                String temp = "";
                String tempString;
                while ((tempString = reader.readDetaLine()) != null) {
                    temp += tempString;
                }
                reader.closeDeta();
                rowMap.putString(culumn, temp); //储值
                cell.I_CellValue(temp); //数据库内存储值
                bufferRow.putCell(culumn, cell);
            } else {
                rowMap.putString(culumn, null);
                cell.I_CellValue(null);
                bufferRow.putCell(culumn, cell);
            }
        }
        output.add(rowMap);
    }

    //P_kernel等比复制过来的search shell组件, 我要替换的是数据库储值, jtable表做output
    //把jtable数据表的数据 变成数据库的db映射, 传入参数是dma的每一行文件的集合,
    //DefaultTableModel 的 Object[][] huaRuiJiJtable 对应 DBTablePath
    //readDBTableRowIndexFile对应 row id
    //huaRuiJiJtableCulumns 对应 culumn
    //jtable  太上层, 用它的spec 速度会很慢。所以用object[][]  先
    //罗瑶光 20210924
    //出现一个问题, 我的table db是非线性map 结构, 自带表头key, 而data 是矩阵, 下面逻辑要全部改掉
    public static void P_kernel_search(int rowId, Object[] huaRuiJiJtableCulumns
        , Object[][] huaRuiJiJtable, List<IMV_SIQ> output, Row bufferRow, IMV_SIQ rowMap) {
        Object[] rowList = huaRuiJiJtable[rowId];
        for (int i = 0; i < huaRuiJiJtableCulumns.length; i++) {
            Cell cell = new Cell();
            rowMap.putObjectMatrix(huaRuiJiJtableCulumns[i], rowList[i]);
            cell.I_CellValue(rowList[i]);
            bufferRow.putCell((String) huaRuiJiJtableCulumns[i], cell);
        }
        output.add(rowMap);
    }
}
