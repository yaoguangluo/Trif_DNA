package A_V.ASQ.PSU.test;

import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.AE;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import exception.thread.DetaThread;
import P_V.PEQ.AMV.ECS.test.SensingTest;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import java.io.IOException;
//import java.util.List;
//import java.util.concurrent.Callable;
//import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.concurrent.E_Service;
//import java.util.concurrent.E_s;

@SuppressWarnings("unused")
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DemoCogs {
    static List<List<String>> sets;
    static String ss;
    static int c = 0;

    public static void main(String[] args, EmotionMap_E emotionMap_E
        , NERO_C_OneTime_E nERO_C_OneTime_E
        , Nlp_CE_X_S nlp_CE_X_S, Pos_X_P pos_X_P, SensingTest sensingTest
        , FMHMMListOneTime_E fMHMMListOneTime_E
        , Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E) {
        App NE = new App();
        AE _A = new CogsBinaryForest_AE();
        _A.IV_Mixed(NE);
        sets = new CopyOnWriteArrayList<>();
        String ss = "从容易开始从容易知";
        //20230106-System.out.println("");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new TaskWithResult(i, _A, ss));
        }
        while (sets.size() < 100) {
            DetaThread.sleepDeta(300);
        }
        int j = 0;
        for (int i = 0; i < sets.get(0).size(); i++) {
            //20230106-System.out.print(sets.get(0).get(i) + "  |  ");
            j++;
            if (j > 15) {
                j = 0;
                //20230106-System.out.println("");
            }
        }
    }

    public static class TaskWithResult implements Callable<String> {
        private int id;
        private AE _A;
        private String sss;

        public TaskWithResult(int id, AE _A, String sss) {
            this.id = id;
            this._A = _A;
            this.sss = sss;
        }

        public String call() {
            List<String> te = _A.parserMixedString(sss);
            sets.add(te);
            return null;
        }
    }

}
