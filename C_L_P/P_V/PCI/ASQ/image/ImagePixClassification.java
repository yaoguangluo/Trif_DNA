package P_V.PCI.ASQ.image;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
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
public class ImagePixClassification {
    //思想：统计与概率论
    //作者：罗瑶光
    //将shareholder分层处理的图片像素数据进行 分类归类统计输出
    public static Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> getImagePixClassificationMap(int[][] pixMap) {
        Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> output = new IMV_SIQ();
        for (int i = 0; i < pixMap.length; i++) {
            for (int j = 0; j < pixMap[0].length; j++) {
                if (pixMap[i][j] > 0) {
                    ArrayList<AMV_MVS_VSQ_2D> temp;
                    if (output.containsKey(pixMap[i][j])) {
                        temp = output.get(pixMap[i][j]);
                    } else {
                        temp = new ArrayList<>();
                    }
                    AMV_MVS_VSQ_2D position2D = new AMV_MVS_VSQ_2D((double) i, (double) j);
                    temp.add(position2D);
                    output.put(pixMap[i][j], temp);
                }
            }
        }
        return output;
    }

    public static Map<Integer, ArrayList<AMV_MVS_VSQ_3D>> getImagePixClassificationMap(int[][][] pixMap) {
        Map<Integer, ArrayList<AMV_MVS_VSQ_3D>> output = new IMV_SIQ();
        for (int i = 0; i < pixMap.length; i++) {
            for (int j = 0; j < pixMap[0].length; j++) {
                for (int k = 0; k < pixMap[0][0].length; k++) {
                    if (pixMap[i][j][k] > 0) {
                        ArrayList<AMV_MVS_VSQ_3D> temp;
                        if (output.containsKey(pixMap[i][j][k])) {
                            temp = output.get(pixMap[i][j][k]);
                        } else {
                            temp = new ArrayList<>();
                        }
                        AMV_MVS_VSQ_3D position3D = new AMV_MVS_VSQ_3D(i, j, k);//fix later
                        temp.add(position3D);
                        output.put(pixMap[i][j][k], temp);
                    }
                }
            }
        }
        return output;
    }
}
