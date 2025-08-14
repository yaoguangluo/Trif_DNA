package O_V.OSI.AOP.VPC.rest;

import DSU.V.VtoV;

import E_A.OSI.AOP.PCS.PP.port_E.RestLoginPortImpl;
import E_A.OSI.AOP.PCS.PP.port_E.RestNLPPortImpl;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class VPCBackEnd {
    public static String forward(String string, IMV_SIQ data, App NE) {
        if (string.equalsIgnoreCase("/login")) {
            return VtoV.ObjectToJsonString(RestLoginPortImpl.login(data.getString("uEmail")
                , data.getString("uPassword")));
        }
        if (string.equalsIgnoreCase("/find")) {
            return VtoV.ObjectToJsonString(RestLoginPortImpl.find(data.getString("uEmail")));
        }
        if (string.equalsIgnoreCase("/logout")) {
            return VtoV.ObjectToJsonString(RestLoginPortImpl.logout(data.getString("uEmail")
                , data.getString("uToken")));
        }
        if (string.equalsIgnoreCase("/register")) {
            return VtoV.ObjectToJsonString(RestLoginPortImpl.register(data.getString("uEmail")
                , data.getString("uEmailEnsure"), data.getString("uName")
                , data.getString("uPassword"), data.getString("uPassWDEnsure")
                , data.getString("uAddress"), data.getString("uPhone")
                , data.getString("uWeChat"), data.getString("uQq")
                , data.getString("uAge"), data.getString("uSex")));
        }
        if (string.equalsIgnoreCase("/change")) {
            return VtoV.ObjectToJsonString(RestLoginPortImpl.change(data.getString("uEmail")
                , data.getString("uChange"), data.getString("uChangeEnsure")
                , data.getString("uToken"), data.getString("uPassword")));
        }
        if (string.equalsIgnoreCase("/checkStatus")) {
            return VtoV.ObjectToJsonString(RestLoginPortImpl.checkStatus(data.getString("token")));
        }
        if (string.equalsIgnoreCase("/dataWS")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataWS(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataCX")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataCX(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataCY")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataCY(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataXL")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataXL(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataRN")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataRN(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataCG")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataCG(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataCJ")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataCJ(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataCL")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataCL(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataXX")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataXX(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataHF")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataHF(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataCP")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataCP(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataZF")) {
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataZF(data.getString("input"), NE));
        }
        if (string.equalsIgnoreCase("/dataYL")) {
            String tinshell = data.getString("medicine");
            if (tinshell.contains("增") || tinshell.contains("删")
                || tinshell.contains("改") || tinshell.contains("rea")
                || tinshell.contains("elet") || tinshell.contains("ate")
                || tinshell.contains("rop") || tinshell.contains("替")
                || tinshell.contains("转")) {
                return "";    //去写操作权限 罗瑶光
            }
            //return VtoV.ObjectToJsonString(RestNLPPortImpl.dataYL(_A, data.get("input")));
            //20230106-System.out.println(data.get("medicine"));
            return VtoV.ObjectToJsonString(RestNLPPortImpl.dataYL(data.getString("medicine"), NE));
            //之前连华为紫罗兰usb, 导致我2018的联想拯救者开不了机, 猫腻就出来了, 我的medicine修改的在那电脑里。
            //腾讯冻结我sweet00048就是这个商业点, 因为我视频有当时的减肥的截图。哈。
            //而我有两台联想, 又莫名mac私有保密登录, 就被玩了。这群大佬这样搞怎么办？了。
            //这是我2
        }
        return "";
    }
}
