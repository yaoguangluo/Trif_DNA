package E_A.OSI.AOP.VPC.PP.port_E;

import DSU.V.VtoV;

import exception.net.O.DetaURLEncoder;
import S_A.pheromone.IMV_SIQ;
import U_V.ESU.json.Json_ESU_X_jsonArrayToList;
import VPC.DetaFrontEnd.DetaFrontEndUtil_X_backEndRequest;
import VPC.DetaFrontEnd.DetaFrontEndUtil_X_cacheRequest;
import VPC.DetaFrontEnd.DetaFrontEndUtil_X_huaRuiJiRequest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestAskPort_E {// implements RestAskPort {

    @SuppressWarnings("deprecation")
    public static IMV_SIQ ask(String ip, String token, String message
            , String pointIp) {
        String json = null;
        if (token != null && !token.equalsIgnoreCase("undefined")) {
            json = DetaFrontEndUtil_X_backEndRequest._E("checkStatus?token="
                    + DetaURLEncoder.encodeDeta(token));
        }
        IMV_SIQ jsonCheckMap;
        boolean jsonCheck = true;
        if (null == json) {
            jsonCheckMap = new IMV_SIQ();
            jsonCheckMap.put("usrName", "匿名咨询师");
            jsonCheck = false;
        } else if (json.contains("unsuccess")) {
            jsonCheck = false;
        }
        if (jsonCheck) {
            jsonCheckMap = VtoV.JsonObjectToMap(new JSONObject(json));
            IMV_SIQ out = new IMV_SIQ();
            String object = DetaFrontEndUtil_X_cacheRequest._E("get?key="
                    + pointIp + "&email=" + DetaURLEncoder.encodeDeta("313699483@qq.com", "UTF-8")
                    + "&password=" + DetaURLEncoder.encodeDeta("Fengyue1985!", "UTF-8"));
            boolean check = true;
            if (null == object) {
                check = false;
            } else if (object.contains("unsuccess")) {
                check = false;
            }
            JSONArray jobj = null;
            if (check) {
                JSONArray newjobj = new JSONArray();
                Object listArray = new JSONTokener(object).nextValue();
                if (listArray instanceof JSONArray) {
                    jobj = new JSONArray(object);
                } else {
                    jobj = new JSONArray();
                    JSONObject jsobj = new JSONObject(object);
                    jobj.put(jsobj);
                }
                for (int i = 0; i < jobj.length(); i++) {
                    JSONObject obj = (JSONObject) jobj.get(i);
                    IMV_SIQ map = VtoV.JsonObjectToMap(obj);
                    map.put("isRead", "true");
                    newjobj.put(map);
                }
                jobj = newjobj;
            } else {
                jobj = new JSONArray();
            }
            IMV_SIQ talk = new IMV_SIQ();
            talk.put("object", jsonCheckMap.get("usrName"));
            talk.put("message", message);
            talk.put("time", System.currentTimeMillis());
            talk.put("isRead", "false");
            jobj.put(talk);
            DetaFrontEndUtil_X_cacheRequest._E("put?key=" + pointIp + "&value="
                    + DetaURLEncoder.encodeDeta(jobj.toString(), "UTF-8")
                    + "&time=" + (System.currentTimeMillis() + 900000)
                    + "&email=" + DetaURLEncoder.encodeDeta("313699483@qq.com", "UTF-8")
                    + "&password=" + DetaURLEncoder.encodeDeta("Fengyue1985!", "UTF-8"));
            out.put("obj", Json_ESU_X_jsonArrayToList._E(jobj));
            // 修正首字母大小写, 上面账号的个人qq sample密码已经更换, 只是个示例而已.
            out.put("loginInfo", "success");
            out.put("returnResult", "发送成功");
            return out;
        }
        IMV_SIQ out = new IMV_SIQ();
        String object = DetaFrontEndUtil_X_cacheRequest._E("get?key=" + "Ask:" + ip + "&email="
                + DetaURLEncoder.encodeDeta("313699483@qq.com", "UTF-8") + "&password="
                + DetaURLEncoder.encodeDeta("Fengyue1985!", "UTF-8"));
        boolean check = true;
        if (null == object) {
            check = false;
        } else if (object.contains("unsuccess")) {
            check = false;
        }
        JSONArray jobj = null;
        if (check) {
            JSONArray newjobj = new JSONArray();
            Object listArray = new JSONTokener(object).nextValue();
            if (listArray instanceof JSONArray) {
                jobj = new JSONArray(object);
            } else {
                jobj = new JSONArray();
                JSONObject jsobj = new JSONObject(object);
                jobj.put(jsobj);
            }
            for (int i = 0; i < jobj.length(); i++) {
                JSONObject obj = (JSONObject) jobj.get(i);
                IMV_SIQ map = VtoV.JsonObjectToMap(obj);
                map.put("isRead", "true");
                newjobj.put(map);
            }
            jobj = newjobj;
        } else {
            jobj = new JSONArray();
        }
        IMV_SIQ talk = new IMV_SIQ();
        talk.put("object", "Guest");
        talk.put("message", message);
        talk.put("time", System.currentTimeMillis());
        talk.put("isRead", "false");
        jobj.put(talk);
        DetaFrontEndUtil_X_cacheRequest._E("put?key=" + "Ask:" + ip + "&value="
                + DetaURLEncoder.encodeDeta(jobj.toString(), "UTF-8")
                + "&time=" + (System.currentTimeMillis() + 900000)
                + "&email=" + DetaURLEncoder.encodeDeta("313699483@qq.com", "UTF-8") + "&password="
                + DetaURLEncoder.encodeDeta("Fengyue1985!", "UTF-8"));
        out.put("obj", Json_ESU_X_jsonArrayToList._E(jobj));
        out.put("loginInfo", "success");
        out.put("returnResult", "发送成功");
        return out;
    }

    @SuppressWarnings("deprecation")
    public static IMV_SIQ feedBack(String ip, String token
            , String pointIp) {
        String json = null;
        if (null != token && !token.equals("undefined")) {
            json = DetaFrontEndUtil_X_backEndRequest._E("checkStatus?token="
                    + DetaURLEncoder.encodeDeta(token));
        }
        IMV_SIQ jsonCheckMap;
        boolean jsonCheck = true;
        if (null == json) {
            jsonCheckMap = new IMV_SIQ();
            jsonCheckMap.put("usrName", "匿名咨询师");
            jsonCheck = false;
        } else if (json.contains("unsuccess")) {
            jsonCheck = false;
        }
        if (jsonCheck) {
            jsonCheckMap = VtoV.JsonObjectToMap(new JSONObject(json));
            IMV_SIQ out = new IMV_SIQ();
            String object = DetaFrontEndUtil_X_cacheRequest._E("get?key="
                    + DetaURLEncoder.encodeDeta(pointIp, "UTF-8")
                    + "&email=" + DetaURLEncoder.encodeDeta("313699483@qq.com") + "&password="
                    + DetaURLEncoder.encodeDeta("Fengyue1985!", "UTF-8"));
            boolean check = true;
            if (null == object) {
                check = false;
            }
            if (object.contains("unsuccess")) {
                check = false;
            }
            JSONArray jobj;
            if (check) {
                Object listArray = new JSONTokener(object).nextValue();
                if (listArray instanceof JSONArray) {
                    jobj = new JSONArray(object);
                } else {
                    jobj = new JSONArray();
                    JSONObject jsobj = new JSONObject(object);
                    jobj.put(jsobj);
                }
                out.put("obj", Json_ESU_X_jsonArrayToList._E(jobj));
                out.put("loginInfo", "success");
                out.put("returnResult", "发送成功");
            } else {
                jobj = new JSONArray();
                out.put("obj", Json_ESU_X_jsonArrayToList._E(jobj));
                out.put("loginInfo", "unsuccess");
                out.put("returnResult", "数据超时");
            }
            return out;
        }
        IMV_SIQ out = new IMV_SIQ();
        String object = DetaFrontEndUtil_X_cacheRequest._E("get?key=" + "Ask:"
                + DetaURLEncoder.encodeDeta(ip, "UTF-8") + "&email="
                + DetaURLEncoder.encodeDeta("313699483@qq.com") + "&password="
                + DetaURLEncoder.encodeDeta("Fengyue1985!", "UTF-8"));
        boolean check = true;
        if (null == object) {
            check = false;
        } else if (object.contains("unsuccess")) {
            check = false;
        }
        JSONArray jobj;
        if (check) {
            Object listArray = new JSONTokener(object).nextValue();
            if (listArray instanceof JSONArray) {
                jobj = new JSONArray(object);
            } else {
                jobj = new JSONArray();
                JSONObject jsobj = new JSONObject(object);
                jobj.put(jsobj);
            }
            out.put("obj", Json_ESU_X_jsonArrayToList._E(jobj));
            out.put("loginInfo", "success");
            out.put("returnResult", "发送成功");
        } else {
            jobj = new JSONArray();
            out.put("obj", Json_ESU_X_jsonArrayToList._E(jobj));
            out.put("loginInfo", "unsuccess");
            out.put("returnResult", "数据超时");
        }
        return out;
    }

    @SuppressWarnings("deprecation")
    public static IMV_SIQ getAskers(String token) {
        String json = null;
        if (null != token) {
            json = DetaFrontEndUtil_X_backEndRequest._E("checkStatus?token="
                    + DetaURLEncoder.encodeDeta(token));
        }
        IMV_SIQ jsonCheckMap;
        boolean jsonCheck = true;
        if (null == json) {
            jsonCheckMap = new IMV_SIQ();
            jsonCheckMap.put("usrName", "匿名咨询师");
            jsonCheck = false;
        } else if (json.contains("unsuccess")) {
            jsonCheck = false;
        }
        if (jsonCheck) {
            jsonCheckMap = VtoV.JsonObjectToMap(new JSONObject(json));
            IMV_SIQ out = new IMV_SIQ();
            String object = DetaFrontEndUtil_X_cacheRequest._E("getAskers?email="
                    + DetaURLEncoder.encodeDeta("313699483@qq.com") + "&password="
                    + DetaURLEncoder.encodeDeta("Fengyue1985!"));
            boolean check = true;
            if (null == object) {
                check = false;
            } else if (object.contains("unsuccess")) {
                check = false;
            }
            JSONArray jobj;
            if (check) {
                Object listArray = new JSONTokener(object).nextValue();
                if (listArray instanceof JSONArray) {
                    jobj = new JSONArray(object);
                } else {
                    jobj = new JSONArray();
                    JSONObject jsobj = new JSONObject(object);
                    jobj.put(jsobj);
                }
                out.put("obj", Json_ESU_X_jsonArrayToList._E(jobj));
                out.put("loginInfo", "success");
                out.put("returnResult", "发送成功");
            } else {
                jobj = new JSONArray();
                out.put("obj", Json_ESU_X_jsonArrayToList._E(jobj));
                out.put("loginInfo", "unsuccess");
                out.put("returnResult", "数据超时");
            }
            return out;
        }
        IMV_SIQ out = new IMV_SIQ();
        out.put("obj", new ArrayList<Object>());
        out.put("loginInfo", "unsuccess");
        out.put("returnResult", "数据超时");
        return out;
    }

    public static IMV_SIQ recordIp(String string) {
        IMV_SIQ out = new IMV_SIQ();
        out.put("loginInfo", "success");
        out.put("returnResult", "已经获取");
        return out;
    }

    public static String dataWS(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataWS?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataCX(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataCX?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataCY(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataCY?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataCG(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataCG?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataCJ(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataCJ?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataCL(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataCL?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataXX(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataXX?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataHF(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataHF?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataCP(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataCP?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataZF(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataZF?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataXL(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataXL?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataRN(String string) {
        String object = DetaFrontEndUtil_X_backEndRequest._E("dataRN?input="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataZY(String string) {
        String object = DetaFrontEndUtil_X_huaRuiJiRequest._E("dataZY?medicine="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataXY(String string) {
        String object = DetaFrontEndUtil_X_huaRuiJiRequest._E("dataXY?medicine="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataYT(String string) {
        String object = DetaFrontEndUtil_X_huaRuiJiRequest._E("dataYT?medicine="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataXT(String string) {
        String object = DetaFrontEndUtil_X_huaRuiJiRequest._E("dataXT?medicine="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }

    public static String dataZT(String string) {
        String object = DetaFrontEndUtil_X_huaRuiJiRequest._E("dataZT?medicine="
                + DetaURLEncoder.encodeDeta(string, "UTF-8"));
        return object;
    }
}
