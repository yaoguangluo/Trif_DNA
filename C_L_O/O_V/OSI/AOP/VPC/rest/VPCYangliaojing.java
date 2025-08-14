package O_V.OSI.AOP.VPC.rest;

import C_A.OSI.AOP.MS.VPC.C.Config_C;
import C_A.OSI.AOP.MS.VPC.C.DBCategory_C;
import C_A.OSI.AOP.MS.VPC.C.DC;
import C_A.OSI.AOP.MS.VPC.C.IUC;
import C_A.OSI.AOP.MS.VPC.C.QC;
import C_A.OSI.AOP.MS.VPC.C.UC;
import DSU.V.VtoV;
import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDBPLSQL_E;
import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestLoginPort_E;
import ME.VPC.M.app.App;
import O_V.OSI.AOP.rest.medicine.RestMedicinePort_E;
import S_A.SVQ.stable.S_Web;
import S_A.pheromone.IMV_SIQ;

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
public class VPCYangliaojing {
    public static String forward(App app, String string, IMV_SIQ data, App NE) {
        //controller
        if (string.contains(S_Web.REST_PATH_SELECT)) {
            return QC.exec(string, data);
        }
        if (string.contains(S_Web.REST_PATH_SETDB)) {
            return Config_C.exec(string, data);
        }
        if (string.contains(S_Web.REST_PATH_INSERT)) {
            return IUC.exec(string, data);
        }
        if (string.contains(S_Web.REST_PATH_DELETE)) {
            return DC.exec(string, data);
        }
        if (string.contains(S_Web.REST_PATH_UPDATE)) {
            return UC.exec(string, data);
        }
        if (string.contains(S_Web.REST_PATH_DB_CATEGORY)) {
            return DBCategory_C.exec(string, data);
        }
        //plsql
        if (string.equalsIgnoreCase(S_Web.REST_PATH_EXEC_DETA_PLSQL)) {
            return VtoV.ObjectToJsonString(RestDBPLSQL_E.restDBPLSQLImpl(data
                    .getString("token"), data.getString("email")
                , data.getString("password"), data.getString("auth")
                , data.getString("LYGQuery"), data.getString("mod")));
        }
        //restMap
//		if(string.equalsIgnoreCase(S_Web.REST_PATH_LOGIN)){
//			return VtoV.ObjectToJsonString(RestLoginPort_E.login(data.getString("uEmail")
//					, data.getString("uPassword")));
//		}
        if (string.equalsIgnoreCase(S_Web.REST_PATH_FIND)) {
            return VtoV.ObjectToJsonString(RestLoginPort_E.find(data.getString("uEmail")));
        }
        if (string.equalsIgnoreCase(S_Web.REST_PATH_LOGOUT)) {
            return VtoV.ObjectToJsonString(RestLoginPort_E.logout(data.getString("uEmail")
                , data.getString("uToken")));
        }
//		if(string.equalsIgnoreCase(S_Web.REST_PATH_REGISTER)){
//			return VtoV.ObjectToJsonString(RestLoginPort_E.register(data.getString("uEmail")
//					, data.getString("uEmailEnsure")
//					, data.getString("uName"), data.getString("uPassword"), data.getString("uPassWDEnsure")
//					, data.getString("uAddress")
//					, data.getString("uPhone"), data.getString("uWeChat"), data.getString("uQq")
//					, data.getString("uAge")
//					, data.getString("uSex")));
//		}
        if (string.equalsIgnoreCase(S_Web.REST_PATH_CHANGE)) {
            return VtoV.ObjectToJsonString(RestLoginPort_E.change(data.getString("uEmail")
                , data.getString("uChange"), data.getString("uChangeEnsure")
                , data.getString("uToken"), data.getString("uPassword")));
        }
        if (string.equalsIgnoreCase(S_Web.REST_PATH_CHECK_STATUS)) {
            return VtoV.ObjectToJsonString(RestLoginPort_E.checkStatus(data.getString("token")));
        }
        if (string.equalsIgnoreCase(S_Web.REST_PATH_MEDICINEZY)) {
            return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackZY(app
                , data.getString("medicine"), NE));
        }
        if (string.equalsIgnoreCase(S_Web.REST_PATH_MEDICINEXY)) {
            return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackXY(app
                , data.getString("medicine")));
        }
        if (string.equalsIgnoreCase(S_Web.REST_PATH_MEDICINEZT)) {
            return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackZT(app
                , data.getString("medicine")));
        }
        if (string.equalsIgnoreCase(S_Web.REST_PATH_MEDICINEXT)) {
            return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackXT(app
                , data.getString("medicine")));
        }
        if (string.equalsIgnoreCase(S_Web.REST_PATH_MEDICINEYT)) {
            return VtoV.ObjectToJsonString(RestMedicinePort_E.getMedicineBookFeedbackYT(app
                , data.getString("medicine")));
        }
        if (string.equalsIgnoreCase(S_Web.REST_PATH_SEARCH)) {
            return VtoV.ObjectToJsonString(RestMedicinePort_E.doSearch(app, data.getString("word")));
        }
        return S_Web.STRING_EMPTY;
    }

    public static String getCode(String filePath) {
        if (filePath.contains(S_Web.FILE_HTML) || filePath.contains(S_Web.FILE_JS)) {
            return "UTF-8";
        }
        return "UTF8";
    }

    public static String getFilePath(String string) {
        String root = new File("src/main/resources/static").getAbsolutePath().replace("\\"
            , "/");
        if (string.equalsIgnoreCase("") || string.equalsIgnoreCase("/")) {
            string = "/index.html";
        }
        return root + string;
    }
}
