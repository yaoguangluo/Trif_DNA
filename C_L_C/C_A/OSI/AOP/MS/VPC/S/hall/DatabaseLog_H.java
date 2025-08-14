package C_A.OSI.AOP.MS.VPC.S.hall;

import M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;
import S_A.SVQ.stable.S_Web;
import U_A.PEU.P.cache.Cache_M;
import U_A.PEU.P.zip.GzipUtil;
import U_A.PEU.P.zip.UnZip;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@SuppressWarnings("unused")
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DatabaseLog_H {
    static String logCategoryPath;
    static String logCurrentFilePath;
    static String logCurrentFile;
    public static void I_BinLog_H() {
        //db write operation
        IV_LogCategoryPath();
        IV_CurrentFilePath();
        //write error rollback
        //binlog
    }

    private static void IV_CurrentFilePath() {
        long yearMonthDay = System.currentTimeMillis();
        long day = yearMonthDay / (1000 * 60 * 60 * 24);
        logCurrentFilePath = logCategoryPath + "/log/logger" + day + ".det";
    }

    private static void IV_LogCategoryPath() {
        if (null != Cache_M.getCacheInfo("DBPath")) {
            logCategoryPath = Cache_M.getCacheInfo("DBPath").getValue().toString();
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void writeLogFile(long when, String who, String plsql) {
        Q_CurrentFileRange();
        //zip text string and write; im thinking about a new method to make string write small.
        String logString = "#@:" + when + "@:" + who + "@:" + plsql;
        FileWriter fw = null;
        try {
            fw = new FileWriter(logCurrentFilePath, true);
            fw.write("\n\r\n");
            fw.write(new String(GzipUtil.compress(logString.getBytes(S_Web.CHARSET_UTF8))
                    , S_Web.CHARSET_UTF8));
            //	fw.write(logString);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Q_CurrentFileRange() {
        long yearMonthDay = System.currentTimeMillis();
        long day = yearMonthDay / (1000 * 60 * 60 * 24);
        String willMakeFile = logCategoryPath + "/log/logger" + day + ".det";
        String willMakeFilePath = logCategoryPath + "/log";
        File file = new File(willMakeFile);
        File fileWillMakeFilePath = new File(willMakeFilePath);
        if (!fileWillMakeFilePath.exists()) {
            fileWillMakeFilePath.mkdirs();
            //dont make new for this class, will get memory leakage
        }
        if (!file.exists()) {
            //dont make new for this class, will get memory leakage
            logCurrentFilePath = willMakeFile;
        }
        //if currentfiletime - currenttime > 1 day
        //if currentfilesize > 100mb will make discussion later, now just make one file per day.
        //makenew file;
    }

    private static void coverageByTime(long time) {
        //	1删除已损坏的数据库 已完成
        File needClear = new File("C:/DetaDB");
        needClear.delete();
        //	2解压备份数据库 已完成
        UnZip.unZipWithPath("C:/DetaLog/zipCover/zip_1549583065203.zip"
                , "C:/DetaLog/zipCover/cover");
        //	3循环执行备份plsql命令, 直到等于大于时间戳完成返回。
        DetaBufferedReader reader = null;
        reader = new DetaBufferedReader(DetaFileReader
            .E("C:/DetaLog/log/logger.det"));
        String tempString;
        while ((tempString = reader.readDetaLine()) != null) {
            //解gzip压缩并执行数据库恢复
            try {
                tempString = new String(GzipUtil.uncompress(tempString.getBytes(S_Web
                    .CHARSET_UTF8)), S_Web.CHARSET_UTF8);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
            long currentTime = Long.valueOf(tempString.split("@:")[1]);
            if (currentTime < time) {//逐条恢复到点。
                E_PLSQL_E.E_PLSQL(tempString.split("@:")[3], true);
            }
        }
        reader.closeDeta();
    }
}
