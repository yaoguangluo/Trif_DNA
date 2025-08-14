package C_A.OSI.AOP.MS.VPC.C;

import DSU.V.VtoV;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDB_QE;
import S_A.SVQ.stable.S_ShellETL;
import S_A.SVQ.stable.S_Web;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）

 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）

 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class QC {
    public static String exec(String string, IMV_SIQ data) {
        if (string.equalsIgnoreCase(S_Web.REST_PATH_SELECT_ROWS_BY_ATTRIBUTE)) {
            return VtoV.ObjectToJsonString(RestDB_QE.selectRowsByAttribute(data
                    .getString("baseName"), data.getString("tableName")
                , data.getString(S_ShellETL.SHELL_ETL_CULUMNNAME), data.getString("value")
                , data.getString("token"), data.getString("email")
                , data.getString("password"), data.getString("auth")));
        }

        if (string.equalsIgnoreCase(S_Web.REST_PATH_SELECT_ROWS_BY_TABLE_PATH)) {
            return VtoV.ObjectToJsonString(RestDB_QE
                .selectRowsByTablePath(data.getString("tablePath")
                    , data.getString("pageBegin"), data.getString("pageEnd")
                    , data.getString("direction"), data.getString("token")
                    , data.getString("email"), data.getString("password")
                    , data.getString("auth")));
        }
        return S_Web.STRING_EMPTY;
    }
}
