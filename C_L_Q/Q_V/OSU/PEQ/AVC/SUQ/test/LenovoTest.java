package Q_V.OSU.PEQ.AVC.SUQ.test;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_X_;

import java.util.Iterator;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LenovoTest {
    public static void main(String[] argv) {
        App NE= new App();
        //init
        String text = "..请用户 自行添加sample.." +
                "。";
        NE.app_S.lenovoInit.IV_(text, NE);
        IMV_SIQ_X_ environmentSampleMap = NE.app_S.lenovoInit
            .getEnvironmentInit().getEmotionSampleMap();
        IMV_SIQ lenovo = NE.app_S.lenovoInit.getSensingMap().getLenovoMap();
        //reduce
        //20230106-System.out.println("环    境：");
        Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != NE.app_S.emotionSample.getDistinction()) {
                if (lenovo.containsKey(NE.app_S.emotionSample.getDistinction())) {
                    //20230106-System.out.print(lenovo.get(emotionSample.getDistinction()).toString()+" ");
                } else {
                    //20230106-System.out.print(emotionSample.getDistinction()+" ");
                }
            }
        }
        //20230106-System.out.println("");
        //20230106-System.out.println("动机联想：");
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != NE.app_S.emotionSample.getMotivation()) {
                if (lenovo.containsKey(NE.app_S.emotionSample.getMotivation())) {
                    //20230106-System.out.print(lenovo.get(emotionSample.getMotivation()).toString()+" ");
                } else {
                    //20230106-System.out.print(emotionSample.getMotivation()+" ");
                }
            }
        }
        //20230106-System.out.println("");
        //20230106-System.out.println("倾向探索：" );
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != NE.app_S.emotionSample.getTrending()) {
                if (lenovo.containsKey(NE.app_S.emotionSample.getTrending())) {
                    //20230106-System.out.print(lenovo.get(emotionSample.getTrending()).toString()+" ");
                } else {
                    //20230106-System.out.print(emotionSample.getTrending()+" ");
                }
            }
        }

        //reduce
        //20230106-System.out.println("");
        //20230106-System.out.println("决策挖掘：");
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != NE.app_S.emotionSample.getPrediction()) {
                if (lenovo.containsKey(NE.app_S.emotionSample.getPrediction())) {
                    //20230106-System.out.print(lenovo.get(emotionSample.getPrediction()).toString()+" ");
                } else {
                    //20230106-System.out.print(emotionSample.getPrediction()+" ");
                }
            }
        }
    }
}
