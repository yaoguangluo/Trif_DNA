package ASQ.fusion;

import ASQ.basic.Distance_X_getDistance3D;
import ASQ.euclid.Euclid_X_findCryptionPosition3D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import S_A.pheromone.IMV_SIQ;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

//task 20191220-20191222 daytime
//通过scale 距离来进行坐标团集合 融聚。
//Theory yaoguang.luo 20191219, 欧基里德
//Application yaoguang.luo
//注意：做完计算可以删除冗余map数据来加速运算, 但是考虑到 java对象入参是指针形式, 于是取消删除思想, 避免破坏函数上层逻辑。
//小伙伴有加速需要, 可以自行修改。
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Fusion_X_fusionPosition3DwithHeart {
    public static IMV_SIQ _E
        (Map<Double, List<AMV_MVS_VSQ_3D>> groups, Map<Double, AMV_MVS_VSQ_3D> groupsHeart, double scale) {
        //初始
        IMV_SIQ output = new IMV_SIQ();
        IMV_SIQ outputHeart = new IMV_SIQ();
        //逐团比较重心距离
        Iterator<Double> outLoop = groupsHeart.keySet().iterator();
        IMV_SIQ isDelete = new IMV_SIQ();
        //小于精度内融聚
        //HereOut:
        while (outLoop.hasNext()) {
            double out = outLoop.next();
            for (double in : groupsHeart.keySet()) {
                if (Objects.equals(out, in) || output.containsKey(in) || isDelete.containsKey(in)) {
                    continue;//out做融聚参照物, in做计算算子。output做观测物。
                }
                AMV_MVS_VSQ_3D inHeart = groupsHeart.get(in);
                //Position3D outHeart= groupsHeart.get(out);
                //如下因为java的指针被对象化, 直接修改入参会产生问题于是新做了outputHeart变量来处理。
                AMV_MVS_VSQ_3D outHeart = outputHeart.containsKey(out)
                    ? outputHeart.get_AMV_MVS_VSQ_3D(out) : groupsHeart.get(out);
                double distance = Distance_X_getDistance3D._E(inHeart, outHeart);
                //比较 是融合
                if (distance < scale) {
                    List<AMV_MVS_VSQ_3D> outList;
                    //比较有融媒
                    if (output.containsKey(out)) {
                        outList = output.getArrayList_AMV_MVS_VSQ_3D(out);
                    } else {//比较无融媒
                        //加融媒in to out 加out, 删除 in
                        outList = groups.get(out);
                    }
                    //加融媒in to out 删除 in
                    List<AMV_MVS_VSQ_3D> inList = groups.get(in);
                    outList.addAll(inList);
                    output.put(out, outList);
                    //更新heart
                    AMV_MVS_VSQ_3D newHeart = Euclid_X_findCryptionPosition3D._E(outHeart, inHeart);
                    outputHeart.put(out, newHeart);
                    isDelete.put(in, in);
                } else {//比较 否融合）
                    //比较有融媒
                    if (!output.containsKey(out)) {//比较无融媒
                        //加融媒 out, 删除 out, 加融媒 in 删除 in
                        if (!output.containsKey(out)) {
                            List<AMV_MVS_VSQ_3D> outList = groups.get(out);
                            output.put(out, outList);
                            //更新heart
                            outputHeart.put(out, outHeart);
                            isDelete.put(out, out);
                        }
                    }
                    if (!output.containsKey(in)) {
                        List<AMV_MVS_VSQ_3D> inList = groups.get(in);
                        output.put(in, inList);
                        //更新heart
                        outputHeart.put(in, inHeart);
                        isDelete.put(in, in);
                    }
                }
            }
        }
        return output;
    }
} 
