package OSI.OSU.addAction;

import ME.VPC.M.app.App;
import O_V.OSM.shell.Pl_XA_Command_E;
import S_A.pheromone.IMV_SIQ;

import java.util.Iterator;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , （lyg.tin@gmail.com 弃用, lygtin@sina.com 弃用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class AddActionExample {
    public void addClass(App NE) {
        Pl_XA_Command_E.P_TableName(NE._I_U.acknowledge
            , NE._I_U.outputMap);
        IMV_SIQ object = NE._I_U.outputMap;
        Iterator<String> iterator = NE.app_S.tableNameMap.keySet().iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (NE._I_U.commandAcknowledge.contains(string)) {
                String[] strings = new String[3];
                strings[0] = "获取表名";//集成到老的接口模式先，避免bug
                strings[1] = string;
                strings[2] = "进行选择";
                object.put("获取表名", strings);//集成到老的接口模式先，避免bug
                object.put("type", "进行选择");
                return;
            }
        }
    }
}