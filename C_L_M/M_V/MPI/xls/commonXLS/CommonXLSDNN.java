package M_V.MPI.xls.commonXLS;

import ME.VPC.M.app.App;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.pheromone.IMV_SIQ;

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
public class CommonXLSDNN {
    public static Map<String, IMV_SIQ> createXlSDNN(Object[][] tableData_old
            , int[] identifyColumns, Map<String, IMV_SIQ> subDNNmap, App NE){
        //init deta parser
        SensingTest sensingTest = NE.app_S._A.getSensingTest();
//        DNNTest dNNTest = new DNNTest();
//        ANNTest aNNTest = new ANNTest();
//      RNN_IDETest rNN_IDETest = new RNN_IDETest();
        //loop
        try {
            if (null != subDNNmap) {
                if(null==tableData_old){
                    return null;
                }
                for (int i = 0; i < tableData_old.length; i++) {
                    System.out.println(i);
                    double perRatio = 0.0;
                    String needDNNString = "";
                    String stringIdentify = "";
                    for (int j = 0; j < identifyColumns.length; j++) {
                        stringIdentify += (null != tableData_old[i][j]
                                ? tableData_old[i][j] : "").toString();
                    }//Map<String, Double> dnnSet= NE.app_S.DNNmap.get(stringIdentify);
                    IMV_SIQ dnnSet = new IMV_SIQ();
                    for (int j = 0; j < tableData_old[0].length; j++) {
                        needDNNString += (null != tableData_old[i][j]
                                ? tableData_old[i][j] : "").toString();
                    }//do dnn row
                    String[][] ann;
                    ann = NE.app_S.aNNTest.getANNMatrix(needDNNString, NE);
                    if (null != ann) {
                        String[][] dnn = NE.app_S.dNNTest.getDNNMatrix(ann
                            , needDNNString, NE);
                        for (String[] dnnTupe : dnn) {
                            double ratio = Double.valueOf(dnnTupe[1]);
                            //ratio = ratio.isInfinite() ? 1 : ratio;
                            dnnSet.put("" + (null == dnnTupe[0] ? "" : dnnTupe[0]), ratio);
                            perRatio += ratio;
                        }
                        dnnSet.put("总分", perRatio);
                        subDNNmap.put(stringIdentify, dnnSet);
                    } else {
                        dnnSet.put("总分", 1.0);
                        subDNNmap.put(stringIdentify, dnnSet);
                    }
                }
            }
            return subDNNmap;
        } catch (Exception e) {
            System.out.println("读表错误");
            e.printStackTrace();
        }
        return null;
    }
}