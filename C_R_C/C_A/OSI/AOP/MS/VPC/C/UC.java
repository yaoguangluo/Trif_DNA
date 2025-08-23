package C_A.OSI.AOP.MS.VPC.C;

import DSU.V.VtoV;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_UE;
import S_A.SVQ.stable.S_Web;

import java.util.Map;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class UC {
    public static String exec(String string, Map<String, String> data) {
        if (string.equalsIgnoreCase(S_Web.REST_PATH_UPDATE_ROW_BY_TABLE_PATH_AND_INDEX)) {
            return VtoV.ObjectToJsonString(RestDB_UE
                .updateRowByTablePathAndIndex(data.get("tablePath")
                    , data.get("pageIndex"), data.get("culumnOfUpdateRow")
                    , data.get("token"), data.get("email")
                    , data.get("password"), data.get("auth")));
        }
        return S_Web.STRING_EMPTY;
    }
}
