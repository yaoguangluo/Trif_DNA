package P_V.PEQ.AMV.ECS.test;
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */

import ME.VPC.M.app.App;
import M_V.MSV.OSQ.sets.DetaDouble;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.nlp.DETA_DNN;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
public class DNNTest {
    public static void main(String[] argv, String string, RNN_IDETest rNN_IDETest, App NE) {
        DNNTest dNNTest = new DNNTest();
        ANNTest aNNTest = new ANNTest();
        String[][] ann = aNNTest.getANNMatrix(string, NE);
        String[][] dnn = dNNTest.getDNNMatrix(ann, string, NE);
//		String[][] ann= aNNTest.getANNMatrix(string, _A);
//		String[][] dnn= dNNTest.getDNNMatrix(ann, _A, string);
        for (int i = 0; i < dnn.length; i++) {
            double dnn_lwa = DetaDouble.parseDouble(dnn[i][3]);
            if (dnn_lwa > 100) {
                //20230106-System.out.print(ann[i][0] + ":");
                //20230106-System.out.print(ann[i][1] + ":");
                //20230106-System.out.print(ann[i][2] + ":");
                //20230106-System.out.print(ann[i][3] + ":");
                //20230106-System.out.print(dnn[i][0] + ":");
                //20230106-System.out.print(dnn[i][3] + ":");
                //20230106-System.out.println("");
            }
        }
    }

    public String[][] getDNNMatrix(String text, App NE) {
        ANNTest aNNTest = new ANNTest();
        RNN_IDETest rNN_IDETest = NE.app_S.rNN_IDETest;//check text need //later..
        String[][] dNNMatrix = new DETA_DNN().summing_P(
                aNNTest.getANNMatrix(text, NE), rNN_IDETest.getIDEMatrix(text, NE)//uncheck
        );
        return dNNMatrix;
    }

    public String[][] getDNNMatrixWithoutRnn(String[][] ann, String text, App NE) {
        String[][] dNNMatrix = new DETA_DNN().summing_P(ann
            , NE.app_S.rNN_IDETest.getIDEMatrix(text, NE));
        return dNNMatrix;
    }

    public String[][] getDNNMatrix(String[][] ann, String string, App NE) {
        //RNN  深度词距离计算 开始注释 罗瑶光
        String[][] rnn = NE.app_S.rNN_IDETest.getIDEMatrixExclude_A(ann, string, NE);
        if (null == rnn) {
            return null;
        }
        rnn = getPOSPCARnnMatrix(rnn);
        if (null == rnn) {
            return null;
        }
        if (ann.length > rnn.length) {
            ann = getAnnWithMaskRnn(ann, rnn);
        }
        String[][] dNNMatrix = new DETA_DNN().summing_P(ann, rnn);
        return dNNMatrix;
    }

    private String[][] getAnnWithMaskRnn(String[][] ann, String[][] rnn) {
        //map
        Map<String, Boolean> rnnMap = new IMV_SIQ();
        for (int i = 0; i < rnn.length; i++) {
            if (!rnnMap.containsKey(rnn[i][0])) {
                rnnMap.put(rnn[i][0], true);
            }
        }
        String[][] maskAnn = new String[rnnMap.size()][];
        int j = 0;
        for (int i = 0; i < ann.length; i++) {
            if (rnnMap.containsKey(ann[i][0])) {
                maskAnn[j++] = ann[i];
            }
        }
        return maskAnn;
    }

    private String[][] getPOSPCARnnMatrix(String[][] rnn) {
        List<String[]> list = new ArrayList<>();
        Here:
        for (int j = 0; j < rnn.length; j++) {
            if (Double.valueOf(rnn[j][1]) == 0
                    || Double.valueOf(rnn[j][1]) == 0
                    || Double.valueOf(rnn[j][1]) == 0
            ) {
                continue Here;
            }
            list.add(rnn[j]);
        }
        String[][] PCANLP = new String[list.size()][15];
        Iterator<String[]> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            PCANLP[i++] = iterator.next();
        }
        return PCANLP;
    }
}
