//package PEU.P.nlp;
//import java.io.IOException;
//public class DETA_DNN {
//	public String[][] summing_P(String[][] ann, String[][] rnn)
//	 {
//		//SUM OF LWA DNN 
//		//1 DNN AOP OF DNN
//		//IDE= "亲密, 离散, 位置"
//		String[][] dnn= new String[rnn.length][4];
//		for(int i= 0; i < rnn.length; i++) {
//			dnn[i][0]= rnn[i][0];
//			double important= 0;
//			for(int j= 0; j < rnn.length; j++) {
//				important += DetaDouble.parseDouble(rnn[j][2]);
//			}
//			dnn[i][1]= "" + Math.sqrt(important * DetaDouble.parseDouble(rnn[i][1]));
//		}
//		//2 DNN CORRELATION LWA
//		for(int i= 0; i < rnn.length; i++) {
//			double correlation= 0;
//			double sumOfPow= 0;
//			for(int j= 0; j < rnn.length; j++) {
//				sumOfPow +=  DetaDouble.parseDouble(rnn[j][3]);
//				//sumOfPow += Math.abs(DetaDouble.parseDouble(rnn[i][3]) - DetaDouble.parseDouble(rnn[j][3]));
//			}
//		//2	sumOfPow= Math.abs(DetaDouble.parseDouble(rnn[i][3]) * (double)rnn.length - sumOfPow);
//		//	sumOfPow /= rnn.length;
//			sumOfPow= Math.abs(DetaDouble.parseDouble(rnn[i][3]) - sumOfPow/rnn.length);//3
//			correlation=  DetaDouble.parseDouble(dnn[i][1]) * sumOfPow;
//			dnn[i][2]= "" + Math.sqrt(correlation);
//		}
//		//3 DNN and summing ANN combination
//		for(int i= 0; i < ann.length; i++) {
//			double summingANN= 0;
//			double combination= 0;
//			for(int j= 7; j < ann[0].length; j++) {
//				summingANN += DetaDouble.parseDouble(ann[i][j]);
//			}
//			combination= summingANN *  DetaDouble.parseDouble(dnn[i][2]);
//			dnn[i][3]= "" + combination;
//		}//		return dnn;		 	
//	}	   
//}	

package U_A.PEU.P.nlp;

import M_V.MSV.OSQ.sets.DetaDouble;
//作者 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DETA_DNN {
        public String[][] summing_P(String[][] ann, String[][] rnn) {
            //SUM OF LWA DNN
            //1 DNN AOP OF DNN
            //IDE= "亲密, 离散, 位置"
            double important = 0.0;
            for (int j = 0; j < rnn.length; j++) {
                //important += Double.parseDouble(rnn[j][2]);
                //修正一处"NaN" 识别 罗瑶光20210429
                important += DetaDouble.parseDouble(rnn[j][2]);
            }
            String[][] dnn = new String[rnn.length][4];
            for (int i = 0; i < rnn.length; i++) {
                dnn[i][0] = rnn[i][0];
                dnn[i][1] = "" + Math.sqrt(important * DetaDouble.parseDouble(rnn[i][1]));
            }
            double sumOfPow = 0.0;
            for (int j = 0; j < rnn.length; j++) {
                //sumOfPow +=  Double.parseDouble(rnn[j][3]);
                //修正一处"NaN" 识别 罗瑶光20210429
                sumOfPow += DetaDouble.parseDouble(rnn[j][3]);
                //sumOfPow += Math.abs(DetaDouble.parseDouble(rnn[i][3])
                //- DetaDouble.parseDouble(rnn[j][3]));
            }
            //2 DNN CORRELATION LWA
            for (int i = 0; i < rnn.length; i++) {
                double correlation = 0.0;
                //2	sumOfPow= Math.abs(DetaDouble.parseDouble(rnn[i][3]) * (double)rnn.length - sumOfPow);
                //	sumOfPow /= rnn.length;
                sumOfPow = Math.abs(DetaDouble.parseDouble(rnn[i][3]) - sumOfPow / rnn.length);//3
                correlation = DetaDouble.parseDouble(dnn[i][1]) * sumOfPow;
                dnn[i][2] = "" + Math.sqrt(correlation);
            }
            //3 DNN and summing ANN combination
            for (int i = 0; i < ann.length; i++) {
                double summingANN = 0.0;
                double combination = 0.0;
                for (int j = 7; j < ann[0].length; j++) {
                    //summingANN += Double.parseDouble(ann[i][j]);
                    //修正一处"NaN" 识别 罗瑶光20210429
                    summingANN += DetaDouble.parseDouble(ann[i][j]);
                }
                combination = summingANN * DetaDouble.parseDouble(dnn[i][2]);
                dnn[i][3] = "" + combination;
            }
            return dnn;
        }
}

//    public String[][] summing_P(String[][] ann, String[][] rnn) {
//        //SUM OF LWA DNN
//        //1 DNN AOP OF DNN
//        //IDE= "亲密, 离散, 位置"
//        String[][] dnn = new String[rnn.length][4];
//        for (int i = 0; i < rnn.length; i++) {
//            dnn[i][0] = rnn[i][0];
//            double important = 0;
//            for (int j = 0; j < rnn.length; j++) {
//                //important += Double.parseDouble(rnn[j][2]);
//                //修正一处"NaN" 识别 罗瑶光20210429
//                important += DetaDouble.parseDouble(rnn[j][2]);
//            }
//            dnn[i][1] = "" + Math.sqrt(important * DetaDouble.parseDouble(rnn[i][1]));
//        }
//        //2 DNN CORRELATION LWA
//        for (int i = 0; i < rnn.length; i++) {
//            double correlation = 0;
//            double sumOfPow = 0;
//            for (int j = 0; j < rnn.length; j++) {
//                //sumOfPow +=  Double.parseDouble(rnn[j][3]);
//                //修正一处"NaN" 识别 罗瑶光20210429
//                sumOfPow += DetaDouble.parseDouble(rnn[j][3]);
//                //sumOfPow += Math.abs(DetaDouble.parseDouble(rnn[i][3])
//                //- DetaDouble.parseDouble(rnn[j][3]));
//            }
//            //2	sumOfPow= Math.abs(DetaDouble.parseDouble(rnn[i][3]) * (double)rnn.length - sumOfPow);
//            //	sumOfPow /= rnn.length;
//            sumOfPow = Math.abs(DetaDouble.parseDouble(rnn[i][3]) - sumOfPow / rnn.length);//3
//            correlation = DetaDouble.parseDouble(dnn[i][1]) * sumOfPow;
//            dnn[i][2] = "" + Math.sqrt(correlation);
//        }
//        //3 DNN and summing ANN combination
//        for (int i = 0; i < ann.length; i++) {
//            double summingANN = 0;
//            double combination = 0;
//            for (int j = 7; j < ann[0].length; j++) {
//                //summingANN += Double.parseDouble(ann[i][j]);
//                //修正一处"NaN" 识别 罗瑶光20210429
//                summingANN += DetaDouble.parseDouble(ann[i][j]);
//            }
//            combination = summingANN * DetaDouble.parseDouble(dnn[i][2]);
//            dnn[i][3] = "" + combination;
//        }
//        return dnn;
//    }

