/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package P_V.PEQ.test;

import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.BinaryForest_AE;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import M_V.MSU.OCI.ME.SMS.translator.C.Translator;
import M_V.MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;
import S_A.pheromone.IMV_SIQ;

import java.util.List;

//import time_Por.TimeCheck;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DemoTSLT {
    @SuppressWarnings("unused")
    public static void main(String[] args, EmotionMap_E emotionMap_E
        , NERO_C_OneTime_E nERO_C_OneTime_E
        , Nlp_CE_X_S nlp_CE_X_S, Pos_X_P pos_X_P, SensingTest sensingTest
        , FMHMMListOneTime_E fMHMMListOneTime_E
        , Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
        , App NE) {
        CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
        _A.IV_Mixed(NE);
        IMV_SIQ ce = ((BinaryForest_AE) _A).getCnToEn();
        IMV_SIQ ec = ((BinaryForest_AE) _A).getEnToCn();
        IMV_SIQ poscc = ((BinaryForest_AE) _A).getPosCnToCn();
        IMV_SIQ posec = ((BinaryForest_AE) _A).getPosEnToCn();
        IMV_SIQ posee = ((BinaryForest_AE) _A).getPosEnToEn();
        IMV_SIQ fce = ((BinaryForest_AE) _A).getFullCnToEn();
        IMV_SIQ fec = ((BinaryForest_AE) _A).getFullEnToCn();
        //20230106-System.out.println("输入");
        String v = "如流枫之回雪, 若浣花洗月";
////		 //String v= "数据一直在更新中";
//		String v= "中国正在崛起的道路上奔跑";
//		String v= "我一直在奔跑, 我需要一双翅膀！";
//		String v= "他也一直在奔跑, 他同样需要一双翅膀！";
        //20230106-System.out.println(v);
        Translator ts = new Translator_E();
        ts.IV_(_A);
//		TimeCheck t= new TimeCheck();
//		t.begin();
        List<Verbal> verbals = ts.index(_A, v);
        String ch = ts.getChineseSentenseFromVerbalList(verbals);
//		t.end();
        //20230106-System.out.println("中文");
        //20230106-System.out.println(ch);

        for (int i = 0; i < verbals.size(); i++) {
            //20230106-System.out.print(verbals.get(i).getChinese());
            //20230106-System.out.print(verbals.get(i).getEnglish());
            //20230106-System.out.print(verbals.get(i).getExplain());
            //20230106-System.out.println(verbals.get(i).getPartOfSpeech());
        }
        List<Verbal> verbalsFix = ts.fixPos(verbals);
        String en = ts.getEnglishSentenseFromVerbalFixList(verbalsFix);
        //20230106-System.out.println("");
        //20230106-System.out.println("英文");
        //20230106-System.out.println(en);

        for (int i = 0; i < verbalsFix.size(); i++) {
            //20230106-System.out.print(verbalsFix.get(i).getChinese());
            //20230106-System.out.print(verbalsFix.get(i).getEnglish());
            //20230106-System.out.print(verbalsFix.get(i).getExplain());
            //20230106-System.out.println(verbalsFix.get(i).getPartOfSpeech());
        }

        //20230106-System.out.println("");
        //20230106-System.out.println("中文解释");
        for (int i = 0; i < verbals.size(); i++) {
            //20230106-System.out.print(verbals.get(i).getExplain()
            //==null?verbals.get(i).getChinese():verbals.get(i).getExplain());
        }
//		t.duration();

//		ReadEnglish readEnglish= new ReadEnglish();
//		readEnglish.setPreReadText(en);
//		readEnglish.start();
    }
}
