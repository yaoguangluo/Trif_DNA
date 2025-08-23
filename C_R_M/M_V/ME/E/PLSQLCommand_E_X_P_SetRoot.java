package M_V.ME.E;

import U_A.PEU.P.cache.Cache;
import U_A.PEU.P.cache.Cache_M;

import java.io.File;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class PLSQLCommand_E_X_P_SetRoot {
    public static void _E(String[] acknowledge) {
        String dbPath = acknowledge[1];
        for (int i = 2; i < acknowledge.length; i++) {
            dbPath += ":" + acknowledge[i];
        }
        if (null != Cache_M.getCacheInfo("DBPath")) {
            File file = new File(dbPath);
            if (!file.exists()) {
                file.mkdirs();
                Cache c = new Cache();
                c.I_Value(dbPath);
                Cache_M.putCache("DBPath", c);
            } else if (file.isFile()) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else if (file.isDirectory()) {
                Cache c = new Cache();
                c.I_Value(dbPath);
                Cache_M.putCache("DBPath", c);
            }
        }
    }
}
