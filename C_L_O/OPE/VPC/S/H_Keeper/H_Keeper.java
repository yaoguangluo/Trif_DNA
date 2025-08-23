/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package OPE.VPC.S.H_Keeper;

import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
import OPE.VPC.S.V.Pillow;
import OPE.VPC.S.V.V;
import OPE.VPC.S.sets.Sets;
import OPE.VPC.S.skivvy.Skivvy;
import S_A.pheromone.IMV_SIQ;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.JTextPane;
import java.util.Map;

//作者 +著作权人： 罗瑶光, 浏阳
public class H_Keeper {
    public static Map<Long, BootNeroDoc> _H_Keeper;

    public static void vpcsRegister(LinkList first, String fileCurrentpath
        , NodeShow nodeView
        , JTextPane rightBotJTextPane, ThisCanvas canvas, App NE) {
        if (null == _H_Keeper) {
            _H_Keeper = new IMV_SIQ();
        }

        if (200 > _H_Keeper.size()) {
            try {
                BootNeroDoc bootNeroDoc = new BootNeroDoc(first, fileCurrentpath
                    , nodeView
                    , rightBotJTextPane, canvas, NE);
                Sets.register(bootNeroDoc.getId());
                //sets 是sleeper运行时候里面可以分离出来的数据。
                Pillow.register(bootNeroDoc);//pillow是这些数据的分类存储器
                V.register_V(bootNeroDoc);//vision是sleeper运行的具体梦境。
                _H_Keeper.put(bootNeroDoc.getId(), bootNeroDoc);
                bootNeroDoc.start();
            } catch (Exception e) {
                Skivvy.working(_H_Keeper, e);//skivvy负责vision, pillow, sets
                //, sleeper 全程管理和反馈。
            }
        }
    }
}
