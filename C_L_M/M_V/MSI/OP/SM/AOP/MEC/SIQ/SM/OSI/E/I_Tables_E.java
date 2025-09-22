package M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSI.E;

import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;
import VPC.DetaDB.DetaDBUtil_X_withoutCulumnNameType;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class I_Tables_E {
    public static void I_Table(IMV_SIQ object, boolean mod) {
        if (!object.containsKey("baseName") || !object.containsKey("tableName")) {
            return;
        }
        //get base
        String DBPath = Cache_M.getCacheInfo("DBPath").getValue().toString()
                + "/" + object.get("baseName").toString();
        File DBPathFile = new File(DBPath);
        if (!DBPathFile.isDirectory()) {
            return;
        }
        //make table dir
        String tablePath = DBPath + "/" + object.get("tableName").toString();
        File tablePathFile = new File(tablePath);
        if (tablePathFile.exists()) {
            return;
        }
        //make spec dir
        tablePathFile.mkdirs();
        String tableSpecPath = tablePath + "/spec";
        String tableRowsPath = tablePath + "/rows";
        File tableSpecPathFile = new File(tableSpecPath);
        File tableRowsPathFile = new File(tableRowsPath);
        tableSpecPathFile.mkdir();
        tableRowsPathFile.mkdir();
        //make data
        List<String[]> culumnNames
                = (List<String[]>) object.get(S_ShellETL.SHELL_ETL_CULUMNNAME);
        Iterator<String[]> iterator = culumnNames.iterator();
        try {
            while (iterator.hasNext()) {
                String[] culumnDefinition = iterator.next();
                //create name
                String culumnNamePath = tableSpecPath + "/" + culumnDefinition[2];
                File culumnNameFile = new File(culumnNamePath);
                if (DetaDBUtil_X_withoutCulumnNameType._E(culumnDefinition[3])) {
                    throw new Exception();
                }
                culumnNameFile.mkdir();
                //create file
                File file = new File(culumnNamePath + "/value.lyg");
                if (file.exists()) {
                    throw new Exception();
                }
                if (mod) {
                    FileWriter fw = null;
                    fw = new FileWriter(file, true);
                    fw.write(culumnDefinition[3]);
                    fw.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
