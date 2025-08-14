package A_V.ASQ.PSU.test;

import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

import java.util.ArrayList;
import java.util.List;

//import SVQ.stable.S_Common;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DemoEX2 {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;

    @SuppressWarnings("unused")
    public static void main(String[] args, EmotionMap_E emotionMap_E
        , NERO_C_OneTime_E nERO_C_OneTime_E
        , Nlp_CE_X_S nlp_CE_X_S, Pos_X_P pos_X_P, SensingTest sensingTest
        , FMHMMListOneTime_E fMHMMListOneTime_E
        , Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E, App NE) {
        CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
        _A.IV_Mixed(NE);
        IMV_SIQ pos = _A.getPosCnToCn();
        List<String> sets = new ArrayList<>();
        IMV_SIQ_SS seta = new IMV_SIQ_SS();
        TimeCheck t = new TimeCheck();
//		String ss= "从容易开始从从容容易从容易开始从从容容易从容易开始从从容容易从容易开始从从容容易"
//				+ "从容易开始从从容容易从容易开始从从容容易从容易开始从从容容易从容易开始从从容容易"
//		 +"从容易开始从从容容易从容易开始从从容容易从容易开始从从容容易从容易开始从从容容易"
//		 +"从容易开始从从容容易从容易开始从从容容易从容易开始从从容容易从容易开始从从容容易";;
        String ss = "获取表名:药食同源:进行选择;条件为:和:功效|精度搜索|风寒咳嗽|1;" +
            "条件为:和:中药名称|字符串长度大于|1;条件为:和:性味|不包含|寒:脉络|包含|肺:性味|不包含|凉;" +
            "获取列名:中药名称;操作:0|行至|30;操作:中药名称|颜色标记为|红色;";
        //
        //DemoEX demoEX=new DemoEX();
        StringBuilder sb = new StringBuilder(ss);
        t.begin();
        for (int i = 0; i < 1; i++) {
            sets = _A.parserMixedString(sb);
        }
        t.end();
        t.duration();
        //20230106-System.out.println(S_Count.a1);
        //20230106-System.out.println(S_Count.a2);
        //20230106-System.out.println(S_Count.a3);
        //20230106-System.out.println(S_Count.a4);
//		//20230106-System.out.println(S_Count.a5);
//		//20230106-System.out.println(S_Count.a6);
//		//20230106-System.out.println(S_Count.a7);
//		//20230106-System.out.println(S_Count.a8);
//		//20230106-System.out.println(S_Count.a9);
//		//20230106-System.out.println(S_Count.a10);
//		//20230106-System.out.println(S_Count.a11);
//		//20230106-System.out.println(S_Count.a12);
        for (int i = 0; i < sets.size(); i++) {
            if (sets.get(i) != null) {
                //	System.out.print(sets.get(i) + " ");
                System.out.print(sets.get(i) + "/" + pos.get(sets.get(i)) + "----");
            }
        }
//		for (int i= 0; i < sets.size(); i++) {
//			if (!sets.get(i).equals("")) {
//				//20230106-System.out.print(sets.get(i) + " ");
//			}
//		}
        //20230106-System.out.println("");
//		t.duration();
        //20230106-System.out.println("");
        //20230106-System.out.println("?????-->");
//		t.begin();
        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < sets.size(); i++) {
                if (!sets.get(i).replaceAll("\\s+", "").equals("")) {
                    //20230106-System.out.print(sets.get(i) + "/" + pos.get(sets.get(i)) + "----");
                }
            }
        }
//		t.end();
        //20230106-System.out.println("");
//		t.duration();
        //20230106-System.out.println("");
        //20230106-System.out.println("-->");
//		t.begin();
        IMV_SIQ_S_ fwa = _A.getWordFrequencyByReturnSortMap(sets, NE);
//		t.end();
        for (int i = fwa.size() - 1; i >= 0; i--) {
            //20230106-System.out.print(fwa.get(i).get_word() + S_Common.STRING_SYMBOL_PER
            //		+ fwa.get(i).get_frequency() + "----");
        }
        //20230106-System.out.println("");
//		t.duration();
    }
}
