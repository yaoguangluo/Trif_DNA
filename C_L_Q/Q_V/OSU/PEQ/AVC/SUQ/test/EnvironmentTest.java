package Q_V.OSU.PEQ.AVC.SUQ.test;

import A_V.IVDTIXQCTIV.EnvironmentInit;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_String;
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
public class EnvironmentTest{
	public static void main(String[] argv)  {
		App NE= new App();
		//init
		EnvironmentInit environmentInit= new EnvironmentInit();
		environmentInit.IV_(S_String.text1, NE);
		IMV_SIQ_X_ environmentSampleMap= environmentInit.getEmotionSampleMap();
		//reduce
		//20230106-System.out.println("环    境：");
		Iterator<String> Iterator= environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word= Iterator.next();
			NE.app_S.emotionSample= environmentSampleMap.get_S(word);
			if(null != NE.app_S.emotionSample.getDistinction()) {
				//20230106-System.out.print(emotionSample.getDistinction()+" ");
			}
		}
		//20230106-System.out.println("");
		//20230106-System.out.println("动    机：");
		Iterator= environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word= Iterator.next();
			NE.app_S.emotionSample= environmentSampleMap.get_S(word);
			if(null != NE.app_S.emotionSample.getMotivation()) {
				//20230106-System.out.print(emotionSample.getMotivation()+" ");
			}
		}
		//20230106-System.out.println("");
		//20230106-System.out.println("倾    向：" );
		Iterator= environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word= Iterator.next();
			NE.app_S.emotionSample= environmentSampleMap.get_S(word);
			if(null != NE.app_S.emotionSample.getTrending()) {
				//20230106-System.out.print(emotionSample.getTrending()+" ");
			}
		}
		//reduce
		//20230106-System.out.println("");
		//20230106-System.out.println("决    策：");
		Iterator= environmentSampleMap.keySet().iterator();
		while(Iterator.hasNext()) {
			String word= Iterator.next();
			NE.app_S.emotionSample= environmentSampleMap.get_S(word);
			if(null != NE.app_S.emotionSample.getPrediction()) {
				//20230106-System.out.print(emotionSample.getPrediction()+" ");
			}
		}	
	}
}
