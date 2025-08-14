package E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache;
import U_A.PEU.P.cache.Cache_M;
import YLJ_HRJ.ME.VPC.S.configs.ConfigIndex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestDBConfig_E {
    public static IMV_SIQ setDBPath(String basePath, String token, String auth) {
        IMV_SIQ output;
        try {
            output = new IMV_SIQ();
            String checkStatus = LoginService_E.checkTokenStatus(token, "level");
            if (checkStatus.contains("invalid") && (auth.contains("1"))) {
                output.put("loginInfo", "unsuccess");
                output.put("returnResult", checkStatus);
                return output;
            }
            //检查配置文件
            File config = new File(ConfigIndex.detaDBPath);
            if (config.exists()) {
                config.delete();
            }
            //重写配置文件
            FileWriter fw = null;

            fw = new FileWriter(ConfigIndex.detaDBPath, true);
            fw.write("path->" + basePath);
            fw.close();
            //写缓存
            Cache c = new Cache();
            c.I_Value(basePath);
            Cache_M.putCache("DBPath", c);
            //锁定表
            File fileDBPath = new File(basePath);
            if (fileDBPath.isDirectory()) {
                output.put("info", "isDirectory" + Cache_M.getCacheInfo("DBPath")
                        .getValue().toString());
            } else {
                fileDBPath.mkdir();
                output.put("info", "isCreated" + Cache_M.getCacheInfo("DBPath")
                        .getValue().toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
    public static IMV_SIQ setDBTable(String tableName, String token
            , String auth) {
        IMV_SIQ output = new IMV_SIQ();
        String checkStatus = LoginService_E.checkTokenStatus(token, "level");
        if (checkStatus.contains("invalid") && (auth.contains("1"))) {
            output.put("loginInfo", "unsuccess");
            output.put("returnResult", checkStatus);
            return output;
        }
        //是否有
        String DBPath = Cache_M.getCacheInfo("DBPath").getValue().toString() + "/" + tableName;
        //锁定表
        File fileDBPath = new File(DBPath);
        if (fileDBPath.isDirectory()) {
            output.put("info", "isDirectory:" + DBPath);
        } else {
            fileDBPath.mkdir();
            output.put("info", "isCreated:" + DBPath);
        }
        //有就输出
        //没有就创建
        return output;
    }
}
