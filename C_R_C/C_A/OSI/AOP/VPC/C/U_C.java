package C_A.OSI.AOP.VPC.C;

import DSU.V.VtoV;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_UE;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowByTablePathAndAttribute;
import S_A.SVQ.stable.S_ShellETL;
import U_A.PEU.P.cache.Cache_M;
import org.json.JSONObject;

import java.util.Map;
import java.util.Objects;

//import org.lyg.common.maps.VtoV;
//import org.lyg.vpc.P.portImpl.RestDBUpdateImpl;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class U_C {
    public static String exec(String string, Map<String, String> data) {
        if (string.equalsIgnoreCase("/updateRowByTablePathAndIndex")) {
            return VtoV.ObjectToJsonString(RestDB_UE.updateRowByTablePathAndIndex(data
                    .get("tablePath"), data.get("pageIndex"), data.get("culumnOfUpdateRow")
                , data.get("token"), data.get("email"), data.get("password"), data.get("auth")));
        }
        //之前用的json, 我之后会改成map, 20210801 罗瑶光
        JSONObject jobj = new JSONObject();
        jobj.put("u_key", data.get("key"));
        jobj.put("u_password", data.get("tokenDNA"));
        jobj.put("u_password", data.get("tokenDNA"));
        String tablePath = Objects.requireNonNull(Cache_M.getCacheInfo("DBPath")).getValue().toString()
            + "/" + data.get("baseName") + "/" + data.get("tableName");
        if (string.equalsIgnoreCase("/updateRowByTablePathAndAttribute")) {
            return VtoV.ObjectToJsonString(X_U_RowByTablePathAndAttribute._E(tablePath
                , data.get(S_ShellETL.SHELL_ETL_CULUMNNAME), data.get("value"), jobj));
        }
        return "";
    }
}
