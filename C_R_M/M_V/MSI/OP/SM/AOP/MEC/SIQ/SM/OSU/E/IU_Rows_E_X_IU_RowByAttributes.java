package M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E;

import S_A.pheromone.IMV_SIQ;
import org.json.JSONObject;

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
public class IU_Rows_E_X_IU_RowByAttributes {
    public static void IU_RowByAttributes(IMV_SIQ object, boolean mod) {
        JSONObject jsobj = new JSONObject();
        //for late will make an exception record queue system, to control all of the db write;
        List<String[]> culumnValues = (List<String[]>) object.get("culumnValue");
        //list to json
        for (String[] strings : culumnValues) {
            String string = "";
            if (strings.length > 2) {
                string = strings[2];
            }
            jsobj.put(strings[1], string);
        }
        IU_Rows_E_X_IU_RowByBaseName.insertRowByBaseName(object.get("baseName").toString()
            , object.get("tableName").toString(), jsobj, mod);
    }
}
