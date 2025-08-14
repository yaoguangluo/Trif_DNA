package S_A.SEM.bloom;

import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.E.RatioMap_E;
import A_V.ica.EducationRatio;
import A_V.ica.InitBehaviorICAKernel;
import C_A.ME.analysis.C.A;
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
import M_V.MSV.OSQ.sets.DetaDouble;
import ASQ.YaoguangLuoEulerRing.tsp.TSP2D_X_getYaoguangLuo2DEulerRingTSP2D;
import ASQ.YaoguangLuoEulerRing.tsp.TSP2D_X_getYaoguangLuo3DEulerRingTSP2D;
import ASQ.YaoguangLuoEulerRing.tsp.TSP3D_X_getYaoguangLuo2DEulerRingTSP3D;
import ASQ.YaoguangLuoEulerRing.tsp.TSP3D_X_getYaoguangLuo3DEulerRingTSP3D;
import ASQ.YaoguangLuoEulerRing.tsp.TSP_X_getYaoguangLuo2DEulerRingTSP;
import ASQ.YaoguangLuoEulerRing.tsp.TSP_X_getYaoguangLuo3DEulerRingTSP;
import P_V.PCI.ASQ.basic.RatioMatrix;
import ASQ.classification.AMV.MVS.VSQ.Classification_X_addNewPositionWithHeart;
import ASQ.classification.AMV.MVS.VSQ.Classification_X_addNewPositionWithoutHeart;
import ASQ.classification.AMV.MVS.VSQ.HeartsSample_X_getShorterSamplePosition2DGroupsWithScale;
import ASQ.classification.AMV.MVS.VSQ.HeartsSample_X_getShortestSamplePosition2DGroup;
import ASQ.classification.AMV.MVS.VSQ.HeartsSample_X_getShortestSamplePosition3DGroup;
import ASQ.classification.AMV.MVS.VSQ.HeartsSample_X_getShortestSamplePosition3DGroupsWithScale;
import ASQ.classification.fissile.Fissile_X_fissilePosition2D;
import ASQ.classification.fissile.Fissile_X_fissilePosition3D;
import ASQ.cluster.SideEnd_X_getSideEnd2D;
import ASQ.cluster.SideEnd_X_getSideEnd3D;
import ASQ.fusion.Fusion_X_fusionPosition2DwithHeart;
import ASQ.fusion.Fusion_X_fusionPosition3DwithHeart;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import P_V.PCI.ASQ.demension.Line2D;
import P_V.PCI.ASQ.demension.Line3D;
import P_V.PCI.ASQ.desolation.ErrorAsserts;
import ASQ.ica.CorrelationICA_X_frequencyDownSplit;
import ASQ.ica.CorrelationICA_X_frequencyDownSplitWithScale;
import ASQ.ica.CorrelationICA_X_frequencyUpSplit;
import ASQ.ica.CorrelationICA_X_frequencyUpSplitWithScale;
import P_V.PCI.ASQ.image.ImagePixClassification;
import ASQ.image.pix.Extract_X_getHWaveFromImagePix;
import ASQ.image.pix.Extract_X_getVWaveFromImagePix;
import ASQ.group.Percentage_X_getClusterPercentByDeterPixGroup;
import ASQ.group.Percentage_X_getPixPercentByDeterPix;
import ASQ.group.Percentage_X_getPixPercentByDeterPixGroup;
import ASQ.filter.Filter_X_getImagePix2DGroupFilter;
import ASQ.filter.Filter_X_getImagePix3DGroupFilter;
import ASQ.isolation.Isolation_X_getTSPIsolationGroups2D;
import ASQ.isolation.Isolation_X_getTSPIsolationGroups3D;
import ASQ.forest.Forest_X_getTSPForestIsolationGroups2D;
import ASQ.forest.Forest_X_getTSPForestIsolationGroups3D;
import ASQ.nlp.NLPTopicMatch_X_NLPBestSentenceMatch;
import ASQ.nlp.NLPTopicMatch_X_NLPBestSentencesMatch;
import ASQ.nlp.NLPTopicMatch_X_getNLPBestSentencesMatchScore;
import ASQ.nlp.NLPTopicMatch_X_getNLPBestSentencesMatchScoreRights;
import ASQ.pca.AMV_MVS_VSQ_Filter_X_filterPosition2DsWithScaledDistance;
import ASQ.pca.AMV_MVS_VSQ_Filter_X_filterPosition3DsWithScaledDistance;
import P_V.PCI.ASQ.pca.PCAMeanOfFuzzPC;
import ASQ.find.AMV.MVS.VSQ.GroupPascalHearts_X_getPosition2DsGroupPascalDirection;
import ASQ.find.AMV.MVS.VSQ.GroupPascalHearts_X_getPosition2DsGroupPascalHearts;
import ASQ.find.AMV.MVS.VSQ.GroupPascalHearts_X_getPosition2DsGroupPascalMids;
import ASQ.find.AMV.MVS.VSQ.GroupPascalHearts_X_getPosition3DsGroupPascalDirection;
import ASQ.find.AMV.MVS.VSQ.GroupPascalHearts_X_getPosition3DsGroupPascalHearts;
import ASQ.find.AMV.MVS.VSQ.GroupPascalHearts_X_getPosition3DsGroupPascalMids;
import ASQ.find.mean.Distance_X_findMeanDistanceFromPositions2D;
import ASQ.find.mean.Distance_X_findMeanDistanceFromPositions3D;
import ASQ.find.mean.Distance_X_findPascalMeanDistanceByEachPositions2D;
import ASQ.find.mean.Distance_X_findPascalMeanDistanceByEachPositions3D;
import ASQ.fusion.Filter_X_filterFusion2DSetsWithCountScale;
import ASQ.fusion.Filter_X_filterFusion3DSetsWithCountScale;
import ASQ.probabaility.classification.Classification_X_predictionMatrixResult;
import ASQ.probabaility.classification.Classification_X_predictionResult;
import ASQ.fuzz.Fuzz_X_getSimilarFuzzSet;
import ASQ.fuzz.Fuzz_X_getSimilarFuzzSetListWithScale;
import P_V.PCI.ASQ.probability.GetListOfArrayRatio;
import P_V.PCI.ASQ.probability.Percentage;
import P_V.PCI.ASQ.ratio.DistanceRatio;
import P_V.PCI.ASQ.ratio.IncrementRatio;
import P_V.PCI.ASQ.score.ProbabilityScore;
import P_V.PCI.ASQ.statistic.FindIncrement;
import P_V.PCI.ASQ.statistic.FindMean;
import P_V.PCI.ASQ.statistic.FindSum;
import P_V.PCI.ASQ.statistic.ShareholdCount;
import ASQ.trace.AMV.MVS.VSQ.Hearts_X_trackTracePosition2DHeartsWithSingerGroup;
import ASQ.trace.AMV.MVS.VSQ.Hearts_X_trackTracePosition3DHeartsWithSingerGroup;
import ASQ.trace.fissile.AMV.MVS.VSQ.ByHearts_X_trackTracePosition2DByHearts;
import ASQ.trace.fissile.AMV.MVS.VSQ.ByHearts_X_trackTracePosition3DByHearts;
import ASQ.trace.fissile.AMV.MVS.VSQ.Hearts_X_trackTracePosition2DHeartsWithFissileGroups;
import ASQ.trace.fissile.AMV.MVS.VSQ.Hearts_X_trackTracePosition3DHeartsWithFissileGroups;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import P_V.PEQ.OPM.VEC.test.EducationLevelTest;
import P_V.PEQ.OPM.VEC.test.LiterarinessLevelTest;
import P_V.PEQ.OPM.VEC.test.SuccessICATest;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;
import S_A.SVQ.stable.S_String;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import U_A.PEU.P.nlp.DETA_ANN_HMM;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//进行了test 的main 整理, 还没有测试, 稍后。
//可以用的 一些老接口见 http://tinos.qicp.vip/data.html
//著作权人 + 作者= 罗瑶光
//稍后加pvecs组的static class前缀。
public class StaticFunctionMapP_VECS_E implements StaticFunctionMapP_VECS_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings("unused")
    public void translateChineseToEnglish(App NE) {
        AES_QMS_XSD_TIH v = NE._I_U.v;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
        Nlp_CE_X_S nlp_CE_X_S = NE.app_S.nlp_CE_X_S;
        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
        SensingTest sensingTest = NE._I_U.sensingTest;
        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;
        CogsBinaryForest_AE _A = NE._I_U._AE;
//        _A.IV_Mixed(
////            emotionMap_E, nERO_C_OneTime_E, nlp_CE_X_S, pos_X_P, sensingTest
////                , fMHMMListOneTime_E, quick6DLuoYaoguangSort3DMap_E
//        );
        IMV_SIQ ce = ((BinaryForest_AE) _A).getCnToEn();
        IMV_SIQ ec = ((BinaryForest_AE) _A).getEnToCn();
        IMV_SIQ poscc = ((BinaryForest_AE) _A).getPosCnToCn();
        IMV_SIQ posec = ((BinaryForest_AE) _A).getPosEnToCn();
        IMV_SIQ posee = ((BinaryForest_AE) _A).getPosEnToEn();
        IMV_SIQ fce = ((BinaryForest_AE) _A).getFullCnToEn();
        IMV_SIQ fec = ((BinaryForest_AE) _A).getFullEnToCn();
        //20230106-System.out.println("输入");
        // String v= "如流枫之回雪, 若浣花洗月";
        ////			 //String v= "数据一直在更新中";
        //			String v= "中国正在崛起的道路上奔跑";
        //			String v= "我一直在奔跑, 我需要一双翅膀！";
        //			String v= "他也一直在奔跑, 他同样需要一双翅膀！";
        //20230106-System.out.println(v);
        Translator ts = new Translator_E();
        ts.IV_(_A);
        //			TimeCheck t= new TimeCheck();
        //			t.begin();
        List<Verbal> verbals = ts.index(_A, v._S_);
        String ch = ts.getChineseSentenseFromVerbalList(verbals);
        //			t.end();
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
            //		==null?verbals.get(i).getChinese():verbals.get(i).getExplain());
        }
        //			t.duration();

        //			ReadEnglish readEnglish= new ReadEnglish();
        //			readEnglish.setPreReadText(en);
        //			readEnglish.start();
    }

    public String[][] aNNTest(App NE) {
        AES_QMS_XSD_TIH string = NE._I_U.string;
        CogsBinaryForest_AE _AE = NE._I_U._AE;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        RatioMap_E ratioMap = NE._I_U.ratioMap_E;
        SensingTest sensingTest = NE._I_U.sensingTest;
        //ANNTest ANNTest= new ANNTest();
        //SensingTest sensingTest = new SensingTest();
        //SUM OF ANN MAP CULUMN KERNEL内核提取加 String参数。
        String[][] preAnnMatrix = sensingTest.getMatrix(string._S_, NE);
        String[][] AnnMatrix = new DETA_ANN_HMM().summing_P(preAnnMatrix);
        for (int j = 0; j < AnnMatrix.length; j++) {
            double sum = 0.0;
            for (int i = 7; i < AnnMatrix[0].length; i++) {
                sum += Double.valueOf(AnnMatrix[j][i]);
            }
            if (sum >= 0.6) {
                //20230106-System.out.println(AnnMatrix[j][0]+AnnMatrix[j][1]
                //		+ AnnMatrix[j][2] + AnnMatrix[j][3] + "ANN:" + sum);
            }
        }
        return AnnMatrix;
    }

    public String[][] dNNTest(App NE) {
        AES_QMS_XSD_TIH string = NE._I_U.string;
        SensingTest sensingTest = NE._I_U.sensingTest;
        CogsBinaryForest_AE _A = NE._I_U._AE;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        RatioMap_E ratioMap = NE._I_U.ratioMap_E;
        RNN_IDETest rNN_IDETest = NE._I_U.rNN_IDETest;

        DNNTest dNNTest = new DNNTest();
        ANNTest aNNTest = new ANNTest();
        String[][] ann = aNNTest.getANNMatrix(string._S_, NE);
        String[][] dnn = dNNTest.getDNNMatrix(ann, string._S_, NE);
        //		String[][] ann= aNNTest.getANNMatrix(string, _A);
        //		String[][] dnn= dNNTest.getDNNMatrix(ann, _A, string);
        for (int i = 0; i < dnn.length; i++) {
            //lwa的思维refer 文森特 领英2年前  数据挖掘教材 展示过 lwa 的思想, 这里也标注下。
            //之前第三修订版的著作权申请和github中 rnn 的左开始向右计算
            //有refer 文森特大名关于 曾发布左边开始的卷积计算的文字描述。
            //领英去年7月冻结我的 账号后, 我就再没有关注过文森特了。因为我对外就一个领英
            //, 和 微信的 脸书同步关联, 我在国内从不翻墙 搞鬼。
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
        return dnn;//输出的是dnn, 不是lwa加工。
    }

    public String[][] rNNTest(App NE) {

        AES_QMS_XSD_TIH string = NE._I_U.string;
        CogsBinaryForest_AE _A = NE._I_U._AE;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        RatioMap_E ratioMap = NE._I_U.ratioMap_E;
        RNN_IDETest rNN_IDETest = NE._I_U.rNN_IDETest;

        return rNN_IDETest.getIDEMatrix(string._S_, NE);
    }

    public String[][] sensingTest(App NE) {
        AES_QMS_XSD_TIH string = NE._I_U.string;
        CogsBinaryForest_AE _A = NE._I_U._AE;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        RatioMap_E ratioMap = NE._I_U.ratioMap_E;

        SensingTest sensingTest = new SensingTest();
        return sensingTest.getMatrix(string._S_, NE);
    }

    public void educationLevelTest(App NE) {
        String[] input = NE._I_U.stringA;
        CogsBinaryForest_AE _AE = NE._I_U._AE;
        //ICA kernel
        double[][] kernel = new double[3][];
        kernel[0] = new EducationRatio().getEducationKernel(input[0], _AE, NE);
        kernel[1] = new EducationRatio().getEducationKernel(input[1], _AE, NE);
        kernel[2] = new EducationRatio().getEducationKernel(input[2], _AE, NE);

        //ANN kernel
        double[][] kernelRatio = new double[3][];
        kernelRatio[0] = new EducationRatio().getEducationRatioKernel(kernel[0]);
        kernelRatio[1] = new EducationRatio().getEducationRatioKernel(kernel[1]);
        kernelRatio[2] = new EducationRatio().getEducationRatioKernel(kernel[2]);
        EducationLevelTest educationLevelTest = new EducationLevelTest();
        educationLevelTest.IQ_EducationLevel(kernelRatio);
    }

    public void literarinessLevelTest(App NE) {
        String[] input = NE._I_U.inputStringA;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        EmotionInit emotionInit = NE._I_U.emotionInit;
        RatioMap_E ratioMap_E = NE._I_U.ratioMap_E;
        CogsBinaryForest_AE _AE = NE._I_U._AE;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        //ICA kernel
        double[][] kernel = new double[3][];
        kernel[0] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[0], NE);
        kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[1], NE);
        kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[2], NE);
        LiterarinessLevelTest educationLevelTest = new LiterarinessLevelTest();
        educationLevelTest.IQ_EducationLevel(kernel);
    }

    public void successICATest(App NE) {
        String[] input = NE._I_U.inputStringA;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        EmotionInit emotionInit = NE._I_U.emotionInit;
        RatioMap_E ratioMap_E = NE._I_U.ratioMap_E;
        CogsBinaryForest_AE _AE = NE._I_U._AE;
        SuccessICATest successICATest = NE._I_U.successICATest;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        //ICA kernel
        double[][] kernel = new double[3][];
        kernel[0] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[0], NE);
        kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[1], NE);
        kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[2], NE);
        successICATest.IQ_KernelCNN(kernel);
        for (int i = 0; i < successICATest.kernelCNN.length; i++) {
            for (int j = 0; j < successICATest.kernelCNN[0].length; j++) {
                //20230106-System.out.print(successICATest.kernelCNN[i][j] + " ");
            }
            //20230106-System.out.println();
        }
    }

    //测试成功了, 稍后优化。
    @SuppressWarnings("unused")
    public static void main()
        throws InstantiationException {
        App NE = new App();
        String[] argv = NE._I_U.argv;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        EmotionInit emotionInit = NE._I_U.emotionInit;
        RatioMap_E ratioMap = NE._I_U.ratioMap_E;
        CogsBinaryForest_AE _A = NE._I_U._AE;
        SuccessICATest successICATest = NE._I_U.successICATest;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        SensingTest sensingTest = NE._I_U.sensingTest;
        RNN_IDETest rNN_IDETest = NE._I_U.rNN_IDETest;

        String string = S_String.text1;
        String[][] string1 = new StaticFunctionMapP_VECS_E().aNNTest(NE);
        String[][] string2 = new StaticFunctionMapP_VECS_E().dNNTest(NE);
        String[][] string3 = new StaticFunctionMapP_VECS_E().rNNTest(NE);
        String[][] string4 = new StaticFunctionMapP_VECS_E().sensingTest(NE);

        String[] strings = new String[3];
        strings[0] = S_String.text1;
        strings[1] = S_String.text2;
        strings[2] = S_String.text3;
        new StaticFunctionMapP_VECS_E().educationLevelTest(NE);
        new StaticFunctionMapP_VECS_E().literarinessLevelTest(NE);
        new StaticFunctionMapP_VECS_E().successICATest(NE);
    }

    @Override
    public List<AMV_MVS_VSQ_2D> getSideEnd2D(App NE) {
        List<AMV_MVS_VSQ_2D> list = NE._I_U.list2D;
        double scale = NE._I_U.scaleDouble;
        return SideEnd_X_getSideEnd2D._E(list, scale);
    }

    @Override
    public List<AMV_MVS_VSQ_3D> getSideEnd3D(App NE) {
        List<AMV_MVS_VSQ_3D> list3D = NE._I_U.list3D;
        double scale = NE._I_U.scaleDouble;
        return SideEnd_X_getSideEnd3D._E(list3D, scale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithoutHeart(App NE) {
        Map<Double, List<AMV_MVS_VSQ_2D>> groups = NE._I_U.groups2D;
        AMV_MVS_VSQ_2D position2d = NE._I_U.position2D;
        double scaleDistance = NE._I_U.scaleDistance;
        return Classification_X_addNewPositionWithoutHeart._E(groups, position2d
            , scaleDistance);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithHeart(App NE) {
        Map<Double, List<AMV_MVS_VSQ_2D>> groups = NE._I_U.groups2D;
        AMV_MVS_VSQ_2D position2d = NE._I_U.position2D;
        Map<Double, AMV_MVS_VSQ_2D> hearts = NE._I_U.hearts2D;
        double scaleDistance = NE._I_U.scaleDistance;
        return Classification_X_addNewPositionWithHeart._E(groups, position2d
            , hearts, scaleDistance);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> fissilePosition2D(App NE) {
        List<AMV_MVS_VSQ_2D> groups = NE._I_U.groupsList;
        double scale = NE._I_U.scaleDouble;
        return Fissile_X_fissilePosition2D._E(groups, scale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_3D>> fissilePosition3D(App NE) {
        List<AMV_MVS_VSQ_3D> groups = NE._I_U.groups3D;
        double scale = NE._I_U.scaleDouble;
        return Fissile_X_fissilePosition3D._E(groups, scale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> fusionPosition2DwithHeart(App NE) {
        Map<Double, List<AMV_MVS_VSQ_2D>> groups = NE._I_U.groups2DMap;
        Map<Double, AMV_MVS_VSQ_2D> groupsHeart = NE._I_U.groupsHeart;
        double scale = NE._I_U.scaleDouble;
        return Fusion_X_fusionPosition2DwithHeart._E(groups, groupsHeart, scale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_3D>> fusionPosition3DwithHeart(App NE) {
        Map<Double, List<AMV_MVS_VSQ_3D>> groups = NE._I_U.groups3DMap;//later
        Map<Double, AMV_MVS_VSQ_3D> groupsHeart = NE._I_U.groupsHeart3D;
        double scale = NE._I_U.scaleDouble;
        return Fusion_X_fusionPosition3DwithHeart._E(groups, groupsHeart, scale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPIsolationGroups2D(App NE) {
        List<AMV_MVS_VSQ_2D> groups = NE._I_U.groupsList;
        double scale = NE._I_U.scaleDouble;
        return Isolation_X_getTSPIsolationGroups2D._E(groups, scale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPIsolationGroups3D(App NE) {
        List<AMV_MVS_VSQ_3D> groups = NE._I_U.groups3D;//later..
        double scale = NE._I_U.scaleDouble;
        return Isolation_X_getTSPIsolationGroups3D._E(groups, scale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPForestIsolationGroups2D(App NE) {
        List<AMV_MVS_VSQ_2D> groups = NE._I_U.groupsList;
        double scale = NE._I_U.scaleDouble;
        return Forest_X_getTSPForestIsolationGroups2D._E(groups, scale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPForestIsolationGroups3D(App NE) {
        List<AMV_MVS_VSQ_3D> groups = NE._I_U.groups3D;
        double scale = NE._I_U.scaleDouble;
        return Forest_X_getTSPForestIsolationGroups3D._E(groups, scale);
    }

    @Override
    public List<AMV_MVS_VSQ_2D> trackTracePosition2DHeartsWithSingerGroup(App NE) {
        List<AMV_MVS_VSQ_2D> coods = NE._I_U.coods;
        return Hearts_X_trackTracePosition2DHeartsWithSingerGroup._E(coods);
    }

    @Override
    public List<AMV_MVS_VSQ_3D> trackTracePosition3DHeartsWithSingerGroup(App NE) {
        List<AMV_MVS_VSQ_3D> coods = NE._I_U.coods3D;
        return Hearts_X_trackTracePosition3DHeartsWithSingerGroup._E(coods);
    }

    @Override
    public List<AMV_MVS_VSQ_2D> trackTracePosition2DByHearts(App NE) {
        List<AMV_MVS_VSQ_2D> hearts = NE._I_U.hearts;
        return ByHearts_X_trackTracePosition2DByHearts._E(hearts);
    }

    @Override
    public List<AMV_MVS_VSQ_3D> trackTracePosition3DByHearts(App NE) {
        List<AMV_MVS_VSQ_3D> hearts = NE._I_U.hearts3D;
        return ByHearts_X_trackTracePosition3DByHearts._E(hearts);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> trackTracePosition2DHeartsWithFissileGroups(App NE) {
        List<AMV_MVS_VSQ_2D> coods = NE._I_U.coods;
        double distanceScale = NE._I_U.distanceScaleDouble;
        return Hearts_X_trackTracePosition2DHeartsWithFissileGroups._E(coods
            , distanceScale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_3D>> trackTracePosition3DHeartsWithFissileGroups(App NE) {
        List<AMV_MVS_VSQ_3D> coods = NE._I_U.coods3D;
        double distanceScale = NE._I_U.distanceScaleDouble;
        return Hearts_X_trackTracePosition3DHeartsWithFissileGroups._E(coods
            , distanceScale);
    }

    //个别单词10个字母 错误1，2个无障碍，之后元基编码，20多个基其中1，2个出入不影响打分匹配。
    //别人别猜测我在干嘛，我这样写 一定是解决我罗瑶光的自身问题，并内心已有了明确答案和逻辑才会出手，
// 绝对不是解决黑客 暗处人员，和阅读者的问题。
    @Override
    public double findMeanDistanceFromPositions2D(App NE) {
        List<AMV_MVS_VSQ_2D> position2Ds = NE._I_U.position2Ds;
        double observerPCAScale = NE._I_U.observerPCAScale;
        int sortRangeScale = NE._I_U.sortRangeScale;
        return Distance_X_findMeanDistanceFromPositions2D._E(position2Ds
            , observerPCAScale, sortRangeScale);
    }

    @Override
    public double findMeanDistanceFromPositions3D(App NE) {
        List<AMV_MVS_VSQ_3D> position3Ds = NE._I_U.position3Ds;
        double observerPCAScale = NE._I_U.observerPCAScale;
        int sortRangeScale = NE._I_U.sortRangeScale;
        return Distance_X_findMeanDistanceFromPositions3D._E(position3Ds
            , observerPCAScale, sortRangeScale);
    }

    @Override
    public double[] findPascalMeanDistanceByEachPositions2D(App NE) {
        List<AMV_MVS_VSQ_2D> position2Ds = NE._I_U.position2Ds;
        double observerPCAScale = NE._I_U.observerPCAScale;
        int sortRangeScale = NE._I_U.sortRangeScale;
        return Distance_X_findPascalMeanDistanceByEachPositions2D._E(position2Ds
            , observerPCAScale, sortRangeScale);
    }

    @Override
    public double[] findPascalMeanDistanceByEachPositions3D(App NE) {
        List<AMV_MVS_VSQ_3D> position3Ds = NE._I_U.position3Ds;
        double observerPCAScale = NE._I_U.observerPCAScale;
        int sortRangeScale = NE._I_U.sortRangeScale;
        return Distance_X_findPascalMeanDistanceByEachPositions3D._E(position3Ds
            , observerPCAScale, sortRangeScale);
    }

    @Override
    public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalHearts(App NE) {
        ArrayList<AMV_MVS_VSQ_2D> groups = NE._I_U.groups;
        double scale = NE._I_U.scaleDouble;
        return GroupPascalHearts_X_getPosition2DsGroupPascalHearts._E(groups, scale);
    }

    @Override
    public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalHearts(App NE) {
        ArrayList<AMV_MVS_VSQ_3D> groups = NE._I_U.groups3D;
        double scale = NE._I_U.scaleDouble;
        return GroupPascalHearts_X_getPosition3DsGroupPascalHearts._E(groups, scale);
    }

    @Override
    public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalMids(App NE) {
        ArrayList<AMV_MVS_VSQ_2D> groups = NE._I_U.groups;
        double scale = NE._I_U.scaleDouble;
        return GroupPascalHearts_X_getPosition2DsGroupPascalMids._E(groups, scale);
    }

    @Override
    public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalMids(App NE) {
        ArrayList<AMV_MVS_VSQ_3D> groups = NE._I_U.groups3D;
        double scale = NE._I_U.scaleDouble;
        return GroupPascalHearts_X_getPosition3DsGroupPascalMids._E(groups, scale);
    }

    @Override
    public Map<Double, Line2D> getPosition2DsGroupPascalDirection2DMap(App NE) {
        Map<Double, AMV_MVS_VSQ_2D> pascalHearts = NE._I_U.pascalHearts;
        Map<Double, AMV_MVS_VSQ_2D> pascalMids = NE._I_U.pascalMids;
        return GroupPascalHearts_X_getPosition2DsGroupPascalDirection._E(pascalHearts
            , pascalMids);
    }

    @Override
    public Map<Double, Line3D> getPosition3DsGroupPascalDirection3D(App NE) {
        Map<Double, AMV_MVS_VSQ_3D> pascalHearts = NE._I_U.pascalHearts3D;
        Map<Double, AMV_MVS_VSQ_3D> pascalMids = NE._I_U.pascalMids3D;
        return GroupPascalHearts_X_getPosition3DsGroupPascalDirection._E(pascalHearts
            , pascalMids);
    }

    @Override
    public Map<Double, Line3D> getPosition3DsGroupPascalDirection3DMap(App NE) {
        ArrayList<AMV_MVS_VSQ_3D> groups = NE._I_U.groups3D;
        double scale = NE._I_U.scaleDouble;
        return GroupPascalHearts_X_getPosition3DsGroupPascalDirection._E(groups, scale);
    }

    @Override
    public Map<Double, Line2D> getPosition2DsGroupPascalDirection2D(App NE) {
        ArrayList<AMV_MVS_VSQ_2D> groups = NE._I_U.groups;
        double scale = NE._I_U.scaleDouble;
        return GroupPascalHearts_X_getPosition2DsGroupPascalDirection._E(groups, scale);
    }

    @Override
    public List<Line2D> getYaoguangLuo2DEulerRingTSP(App NE) {
        List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs = NE._I_U.AMV_MVS_VSQs;
        return TSP_X_getYaoguangLuo2DEulerRingTSP._E(AMV_MVS_VSQs);
    }

    @Override
    public List<Line3D> getYaoguangLuo3DEulerRingTSP(App NE) {
        List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs = NE._I_U.AMV_MVS_VSQs3D;
        return TSP_X_getYaoguangLuo3DEulerRingTSP._E(AMV_MVS_VSQs);
    }

    @Override
    public List<Line2D> getYaoguangLuo2DEulerRingTSP2D(App NE) {
        List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs = NE._I_U.AMV_MVS_VSQs;
        return TSP2D_X_getYaoguangLuo2DEulerRingTSP2D._E(AMV_MVS_VSQs);
    }

    @Override
    public List<Line3D> getYaoguangLuo3DEulerRingTSP2D(App NE) {
        List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs = NE._I_U.AMV_MVS_VSQs3D;
        return TSP2D_X_getYaoguangLuo3DEulerRingTSP2D._E(AMV_MVS_VSQs);
    }

    @Override
    public List<Line2D> getYaoguangLuo2DEulerRingTSP3D(App NE) {
        List<AMV_MVS_VSQ_2D> positions = NE._I_U.position2Ds;

        int sortRangeScale = NE._I_U.sortRangeScale;
        int sortDeepsScale = NE._I_U.sortDeepsScale;

        return TSP3D_X_getYaoguangLuo2DEulerRingTSP3D._E(positions
            , sortRangeScale, sortDeepsScale);
    }

    @Override
    public List<Line3D> getYaoguangLuo3DEulerRingTSP3D(App NE) {
        List<AMV_MVS_VSQ_3D> positions = NE._I_U.position3Ds;//later bio reg to..

        int sortRangeScale = NE._I_U.sortRangeScale;
        int sortDeepsScale = NE._I_U.sortDeepsScale;

        return TSP3D_X_getYaoguangLuo3DEulerRingTSP3D._E(positions
            , sortRangeScale, sortDeepsScale);
    }

    @Override
    public int[][] getImagePix2DGroupFilter(App NE) {

        int[][] inputPixMatrix = NE._I_U.inputPixMatrix;
        int RBG = NE._I_U.RBG;
        int distanceScale = NE._I_U.distanceScale;
        int max = NE._I_U.max;
        int min = NE._I_U.min;

        return Filter_X_getImagePix2DGroupFilter._E(inputPixMatrix, RBG
            , distanceScale, max, min);
    }

    @Override
    public int[][][] getImagePix3DGroupFilter(App NE) {

        int[][][] inputPixMatrix = NE._I_U.inputPixMatrixT;
        int RBG = NE._I_U.RBG;
        int distanceScale = NE._I_U.distanceScale;
        int max = NE._I_U.max;
        int min = NE._I_U.min;

        return Filter_X_getImagePix3DGroupFilter._E(inputPixMatrix, RBG
            , distanceScale, max, min);
    }

    @Override
    public String NLPBestSentenceMatch(App NE) {

        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
        String[] sampleSentences = NE._I_U.sampleSentences;
//        int sortStackRange = NE._I_U.sortStackRange;
//        double filterRate = NE._I_U.filterRate;
//        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
//        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
//        Nlp_CE_X_S nlp_CE_X_S = NE._I_U.nlp_CE_X_S;
//        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
//        SensingTest sensingTest = NE._I_U.sensingTest;
//        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
//        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
//            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;

        return NLPTopicMatch_X_NLPBestSentenceMatch._E(searchString._S_, sampleSentences
            , NE);
    }

    @Override
    public List<String> NLPBestSentencesMatch(App NE) {

        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
        String[] sampleSentences = NE._I_U.sampleSentences;
        int sortStackRange = NE._I_U.sortStackRange;
        double filterRate = NE._I_U.filterRate;
//        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
//        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
//        Nlp_CE_X_S nlp_CE_X_S = NE._I_U.nlp_CE_X_S;
//        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
//        SensingTest sensingTest = NE._I_U.sensingTest;
//        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
//        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
//            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;

        return NLPTopicMatch_X_NLPBestSentencesMatch._E(searchString._S_, sampleSentences
            , sortStackRange, filterRate, NE);
    }

    @Override
    public double[] getNLPBestSentencesMatchScore(App NE) {

        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
        String[] sampleSentences = NE._I_U.sampleSentences;
//        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
//        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
//        Nlp_CE_X_S nlp_CE_X_S = NE._I_U.nlp_CE_X_S;
//        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
//        SensingTest sensingTest = NE._I_U.sensingTest;
//        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
//        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
//            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;

        return NLPTopicMatch_X_getNLPBestSentencesMatchScore._E(searchString._S_
            , sampleSentences, NE);
    }

    @Override
    public double[] getNLPBestSentencesMatchScoreRights(App NE) {
//        AES_QMS_XSD_TIH searchString = NE._I_U.searchString;
//        String[] sampleSentences = NE._I_U.sampleSentences;
        A _A = NE._I_U._A;
        IMV_SIQ nlp = NE._I_U.nlp;
        IMV_SIQ_SS keyMap = NE._I_U.keyMap;

        return NLPTopicMatch_X_getNLPBestSentencesMatchScoreRights._E(nlp, keyMap);
    }

    @Override
    public double findTotalIncrementWithScale(App NE) {
        double value = NE._I_U.valueDouble;
        double times = NE._I_U.timesDouble;
        double scale = NE._I_U.scaleDouble;
        return FindIncrement.findTotalIncrementWithScale(value, times, scale);
    }

    @Override
    public double findMeanIncrementWithScale(App NE) {
        double value = NE._I_U.valueDouble;
        double times = NE._I_U.timesDouble;
        double scale = NE._I_U.scaleDouble;
        return FindIncrement.findMeanIncrementWithScale(value, times, scale);
    }

    @Override
    public double findMeanOfFilterDoubleArrayWithScale(App NE) {
        double[] input = NE._I_U.inputsA;
        double filterScale = NE._I_U.filterScale;
        int sortRangeScale = NE._I_U.sortRangeScale;
        return FindMean.findMeanOfFilterDoubleArrayWithScale(input, filterScale, sortRangeScale);
    }

    @Override
    public double findMeanOfDoubleArray(App NE) {
        double[] input = NE._I_U.inputsA;
        return FindMean.findMeanOfDoubleArray(input);
    }

    @Override
    public double[] findMeanOfTwoDoubleArray(App NE) {
        double[] origin = NE._I_U.origin;
        double[] input = NE._I_U.inputsA;
        return FindMean.findMeanOfTwoDoubleArray(origin, input);
    }

    @Override
    public double[][] findMeanOfTwoDoubleArray2D(App NE) {
        double[][] origin = NE._I_U.originA;
        double[][] input = NE._I_U.inputDoubleM;
        return FindMean.findMeanOfTwoDoubleArray2D(origin, input);
    }

    @Override
    public double findMeanOfDoubleMatrix2D(App NE) {
        double[][] input = NE._I_U.inputDoubleM;
        return FindMean.findMeanOfDoubleMatrix2D(input);
    }

    @Override
    public double[] findRowMeanOfDoubleMatrix2D(App NE) {
        double[][] input = NE._I_U.inputDoubleM;
        return FindMean.findRowMeanOfDoubleMatrix2D(input);
    }

    @Override
    public double[] findCulumnMeanOfDoubleMatrix2D(App NE) {
        double[][] input = NE._I_U.inputDoubleM;
        return FindMean.findCulumnMeanOfDoubleMatrix2D(input);
    }

    @Override
    public double findMeanOfDoubleMatrix3D(App NE) {
        double[][][] input = NE._I_U.inputT;
        return FindMean.findMeanOfDoubleMatrix3D(input);
    }

    @Override
    public double findMeanOfDoubleList(App NE) {
        List<Double> input = NE._I_U.inputList;
        return FindMean.findMeanOfDoubleList(input);
    }

    @Override
    public double[] findMeanOfMartrix1DList(App NE) {
        List<double[]> input = NE._I_U.inputListDA;
        return FindMean.findMeanOfMartrix1DList(input);
    }

    @Override
    public double[][] findMeanOfMartrix2DList(App NE) {
        List<double[][]> input = NE._I_U.inputListDT;
        return FindMean.findMeanOfMartrix2DList(input);
    }

    @Override
    public double findSumOfDoubleArray(App NE) {
        double[] input = NE._I_U.inputsA;
        return FindSum.findSumOfDoubleArray(input);
    }

    @Override
    public double[] findSumOfTwoDoubleArray(App NE) {
        double[] origin = NE._I_U.originDoubleA;
        double[] input = NE._I_U.inputsA;
        return FindSum.findSumOfTwoDoubleArray(origin, input);
    }

    @Override
    public double[][] findSumOfTwoDoubleArray2D(App NE) {
        double[][] origin = NE._I_U.originA;
        double[][] input = NE._I_U.inputDoubleM;
        return FindSum.findSumOfTwoDoubleArray2D(origin, input);
    }

    @Override
    public double findSumOfDoubleMatrix2D(App NE) {
        double[][] input = NE._I_U.inputDoubleM;
        return FindSum.findSumOfDoubleMatrix2D(input);
    }

    @Override
    public double[] findRowSumOfDoubleMatrix2D(App NE) {
        double[][] input = NE._I_U.inputDoubleM;
        return FindSum.findRowSumOfDoubleMatrix2D(input);
    }

    @Override
    public double[] findCulumnSumOfDoubleMatrix2D(App NE) {
        double[][] input = NE._I_U.inputDoubleM;
        return FindSum.findCulumnSumOfDoubleMatrix2D(input);
    }

    @Override
    public double findSumOfDoubleMatrix3D(App NE) {
        double[][][] input = NE._I_U.inputT;
        return FindSum.findSumOfDoubleMatrix3D(input);
    }

    @Override
    public double findSumOfDoubleList(App NE) {
        List<Double> input = NE._I_U.inputList;
        return FindSum.findSumOfDoubleList(input);
    }

    @Override
    public double[] findSumOfMartrix1DList(App NE) {
        List<double[]> input = NE._I_U.inputListDA;
        return FindSum.findSumOfMartrix1DList(input);
    }

    @Override
    public double[][] findSumOfMartrix2DList(App NE) {
        List<double[][]> input = NE._I_U.inputListDT;
        return FindSum.findSumOfMartrix2DList(input);
    }

    @Override
    public boolean getErrorAsserts(App NE) {
        double inputValue = NE._I_U.inputValue;
        double[] matchValues = NE._I_U.matchValues;
        double scale = NE._I_U.scaleDouble;
        return ErrorAsserts.getErrorAsserts(inputValue, matchValues, scale);
    }

    @Override
    public boolean getBinaryErrorAsserts(App NE) {
        double inputValue = NE._I_U.inputValue;
        double[] matchValues = NE._I_U.matchValues;
        double scale = NE._I_U.scaleDouble;
        int sortStackRange = NE._I_U.sortStackRange;
        boolean isSort = NE._I_U.isSort;

        return ErrorAsserts.getBinaryErrorAsserts(inputValue, matchValues, scale
            , sortStackRange, isSort);
    }

    @Override
    public double getShareholdCount(App NE) {
        int[][] input = NE._I_U.input;
        int sharehold = NE._I_U.sharehold;
        return ShareholdCount.getShareholdCount(input, sharehold);
    }

    @Override
    public boolean encodeEstimateSumOfScoresList(App NE) {
        List<Double> scores = NE._I_U.scoresList;
        double estimateValue = NE._I_U.estimateValue;
        return ProbabilityScore.encodeEstimateSumOfScoresList(scores, estimateValue);
    }

    @Override
    public boolean encodeEstimateSumOfScoresArray(App NE) {
        double[] scores = NE._I_U.scores;
        double estimateValue = NE._I_U.estimateValue;
        return ProbabilityScore.encodeEstimateSumOfScoresArray(scores, estimateValue);
    }

    @Override
    public boolean getEstimateCartesianSumOfScoresArray(App NE) {
        double input = NE._I_U.inputD;
        double[] EstimateRatios = NE._I_U.estimateRatios;
        double estimateValue = NE._I_U.estimateValue;

        return ProbabilityScore.getEstimateCartesianSumOfScoresArray(input, EstimateRatios
            , estimateValue);
    }

    @Override
    public boolean getEstimateCartesian1DSumOfScoresArray(App NE) {
        double[] inputs = NE._I_U.inputsA;
        double[] EstimateRatios = NE._I_U.estimateRatios;
        double estimateValue = NE._I_U.estimateValue;
        return ProbabilityScore.getEstimateCartesian1DSumOfScoresArray(inputs
            , EstimateRatios, estimateValue);
    }

    @Override
    public boolean[] encodeEstimateInitonsScore(App NE) {
        double[] input = NE._I_U.inputsA;
        double[] estimateRatios = NE._I_U.estimateRatios;
        double[] estimateValue = NE._I_U.estimateValueA;
        return ProbabilityScore.encodeEstimateInitonsScore(input
            , estimateRatios, estimateValue);
    }

    @Override
    public boolean[] decodeEstimateInitonsScore(App NE) {
        double input = NE._I_U.inputD;
        double[] estimateRatios = NE._I_U.estimateRatios;
        double[] estimateValue = NE._I_U.estimateValueA;

        return ProbabilityScore.decodeEstimateInitonsScore(input
            , estimateRatios, estimateValue);
    }

    @Override
    public double[] getRightsEstimateScore(App NE) {
        double[] inputs = NE._I_U.inputsA;
        double[] rights = NE._I_U.rights;
        return ProbabilityScore.getRightsEstimateScore(inputs, rights);
    }

    @Override
    public RatioMatrix getSimilarFuzzSetWithScale(App NE) {
        RatioMatrix input = NE._I_U.inputRatio;
        List<RatioMatrix> groups = NE._I_U.groupsRatioList;
        double scale = NE._I_U.scaleDouble;
        return PCAMeanOfFuzzPC.getSimilarFuzzSetWithScale(input, groups, scale);
    }

    @Override
    public List<AMV_MVS_VSQ_2D> getShortestSamplePosition2DGroup(App NE) {
        AMV_MVS_VSQ_2D inputHeart = NE._I_U.inputHeart;
        Map<Double, List<AMV_MVS_VSQ_2D>> groups = NE._I_U.groups2D;

        return HeartsSample_X_getShortestSamplePosition2DGroup._E(inputHeart
            , groups);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> getShorterSamplePosition2DGroupsWithScale(App NE) {
        AMV_MVS_VSQ_2D inputHeart = NE._I_U.inputHeart;
        Map<Double, List<AMV_MVS_VSQ_2D>> groups = NE._I_U.groups2D;
        double scale = NE._I_U.scaleDouble;
        return HeartsSample_X_getShorterSamplePosition2DGroupsWithScale._E(inputHeart
            , groups, scale);
    }

    @Override
    public List<AMV_MVS_VSQ_3D> getShortestSamplePosition3DGroup(App NE) {
        AMV_MVS_VSQ_3D inputHeart = NE._I_U.inputHeart3D;
        Map<Double, List<AMV_MVS_VSQ_3D>> groups = NE._I_U.groupsMap3D;
        return HeartsSample_X_getShortestSamplePosition3DGroup._E(inputHeart
            , groups);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_3D>> getShortestSamplePosition3DGroupsWithScale(App NE) {
        AMV_MVS_VSQ_3D inputHeart = NE._I_U.inputHeart3D;
        Map<Double, List<AMV_MVS_VSQ_3D>> groups = NE._I_U.groupsMap3D;
        double scale = NE._I_U.scaleDouble;
        return HeartsSample_X_getShortestSamplePosition3DGroupsWithScale._E(inputHeart
            , groups, scale);
    }

    @Override
    public RatioMatrix getSimilarFuzzSet(App NE) {
        RatioMatrix input = NE._I_U.inputRatio;
        List<RatioMatrix> groups = NE._I_U.groupsRatioList;
        return Fuzz_X_getSimilarFuzzSet._E(input, groups);
    }

    @Override
    public List<RatioMatrix> getSimilarFuzzSetListWithScale(App NE) {
        RatioMatrix input = NE._I_U.inputRatio;
        List<RatioMatrix> groups = NE._I_U.groupsRatioList;
        double scale = NE._I_U.scaleDouble;
        return Fuzz_X_getSimilarFuzzSetListWithScale._E(input
            , groups, scale);
    }

    @Override
    public double getDistanceRatio2D(App NE) {
        AMV_MVS_VSQ_2D begin = NE._I_U.begin;
        AMV_MVS_VSQ_2D end = NE._I_U.end;
        return DistanceRatio.getDistanceRatio2D(begin, end);
    }

    @Override
    public double getARCDistanceRatio2D(App NE) {
        AMV_MVS_VSQ_2D begin = NE._I_U.begin;
        AMV_MVS_VSQ_2D end = NE._I_U.end;
        return DistanceRatio.getARCDistanceRatio2D(begin, end);
    }

    @Override
    public double getTrueARCDistanceRatio2D(App NE) {
        AMV_MVS_VSQ_2D begin = NE._I_U.begin;
        AMV_MVS_VSQ_2D end = NE._I_U.end;
        return DistanceRatio.getTrueARCDistanceRatio2D(begin, end);
    }

    @Override
    public double getDistanceRatio3D(App NE) {
        AMV_MVS_VSQ_3D begin = NE._I_U.begin3D;
        AMV_MVS_VSQ_3D end = NE._I_U.end3D;
        return DistanceRatio.getDistanceRatio3D(begin, end);
    }

    @Override
    public double getTrueARCDistanceRatio3D(App NE) {
        AMV_MVS_VSQ_3D begin = NE._I_U.begin3D;
        AMV_MVS_VSQ_3D end = NE._I_U.end3D;
        return DistanceRatio.getTrueARCDistanceRatio3D(begin, end);
    }

    @Override
    public List<Double> getPercentListByOuterKeyDoubleList(App NE) {
        double[] array = NE._I_U.arrayDouble;
        return GetListOfArrayRatio.getPercentListByOuterKey(array);
    }

    @Override
    public void kernel(App NE) {
        List<Double> output = NE._I_U.outputDoubleList;
        double[] array = NE._I_U.arrayDouble;
        int j = NE._I_U.j;

        GetListOfArrayRatio.kernel(output, array, j);
    }

    @Override
    public void kernelFix(App NE) {
        List<Double> output = NE._I_U.outputDoubleList;
        double[] array = NE._I_U.arrayDouble;
        int j = NE._I_U.j;
        GetListOfArrayRatio.kernelFix(output, array, j);
    }

    @Override
    public double findTotalIncrementRatioWithScale(App NE) {
        double value = NE._I_U.valueDouble;
        double times = NE._I_U.timesDouble;
        double scale = NE._I_U.scaleDouble;
        return IncrementRatio.findTotalIncrementRatioWithScale(value, times, scale);
    }

    @Override
    public double findMeanIncrementRatioWithScale(App NE) {
        double value = NE._I_U.valueDouble;
        double times = NE._I_U.timesDouble;
        double scale = NE._I_U.scaleDouble;
        return IncrementRatio.findMeanIncrementRatioWithScale(value, times, scale);
    }

    @Override
    public double[] frequencyUpSplit(App NE) {
        double[] originFrequency = NE._I_U.originFrequency;
        double[] compareFrequency = NE._I_U.compareFrequency;
        return CorrelationICA_X_frequencyUpSplit._E(originFrequency, compareFrequency);
    }

    @Override
    public double[] frequencyDownSplit(App NE) {
        double[] originFrequency = NE._I_U.originFrequency;
        double[] compareFrequency = NE._I_U.compareFrequency;
        return CorrelationICA_X_frequencyDownSplit._E(originFrequency, compareFrequency);
    }

    @Override
    public double[] frequencyUpSplitWithScale(App NE) {
        double[] originFrequency = NE._I_U.originFrequency;
        double[] compareFrequency = NE._I_U.compareFrequency;
        double scale = NE._I_U.scaleDouble;
        return CorrelationICA_X_frequencyUpSplitWithScale._E(originFrequency
            , compareFrequency, scale);
    }

    @Override
    public double[] frequencyDownSplitWithScale(App NE) {
        double[] originFrequency = NE._I_U.originFrequency;
        double[] compareFrequency = NE._I_U.compareFrequency;
        double scale = NE._I_U.scaleDouble;
        return CorrelationICA_X_frequencyDownSplitWithScale._E(originFrequency
            , compareFrequency, scale);
    }

    @Override
    public boolean predictionResult(App NE) {
        RatioMatrix input = NE._I_U.inputRatio;
        List<RatioMatrix> groups = NE._I_U.groupsRatioList;
        double scale = NE._I_U.scaleDouble;
        return Classification_X_predictionResult._E(input, groups);
    }

    @Override
    public String predictionMatrixResult(App NE) {
        RatioMatrix input = NE._I_U.inputRatio;
        Map<String, RatioMatrix> groups = NE._I_U.groupsMap;
        double scale = NE._I_U.scaleDouble;
        return Classification_X_predictionMatrixResult._E(input, groups);
    }

    @Override
    public Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> getImagePixClassificationMap(App NE) {
        int[][] pixMap = NE._I_U.pixMap;
        return ImagePixClassification.getImagePixClassificationMap(pixMap);
    }

    @Override
    public Map<Integer, ArrayList<AMV_MVS_VSQ_3D>> getImagePixClassificationMap3D(App NE) {
        int[][][] pixMap = NE._I_U.pixMapT;
        return ImagePixClassification.getImagePixClassificationMap(pixMap);
    }

    @Override
    public int[] getVWaveFromImagePix(App NE) {
        int[][] pixMap = NE._I_U.pixMap;
        int RGB = NE._I_U.RGB;
        return Extract_X_getVWaveFromImagePix._E(pixMap, RGB);
    }

    @Override
    public int[] getHWaveFromImagePix(App NE) {
        int[][] pixMap = NE._I_U.pixMap;
        int RGB = NE._I_U.RGB;
        return Extract_X_getHWaveFromImagePix._E(pixMap, RGB);
    }

    @Override
    public double getPixPercentByDeterPix(App NE) {
        int[][] imagePix = NE._I_U.imagePix;
        int scaleRBG = NE._I_U.scaleRBG;
        return Percentage_X_getPixPercentByDeterPix._E(imagePix, scaleRBG);
    }

    // 稍后加pvecs组的static class前缀。
    @Override
    public double getClusterPercentByDeterPixGroup(App NE) {
        Map<Double, List<AMV_MVS_VSQ_2D>> imagePix = NE._I_U.imagePix2D;
        int scaleSUM = NE._I_U.scaleSUM;
        //return 前缀.getClusterPercentByDeterPixGroup(imagePix, scaleSUM);
        return Percentage_X_getClusterPercentByDeterPixGroup._E(imagePix
            , scaleSUM);
    }

    @Override
    public double getPixPercentByDeterPixGroup(App NE) {
        Map<Double, List<AMV_MVS_VSQ_2D>> imagePix = NE._I_U.imagePix2D;
        int scaleSUM = NE._I_U.scaleSUM;
        return Percentage_X_getPixPercentByDeterPixGroup._E(imagePix, scaleSUM);
    }

    //FusionPCAFilter
    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> filterFusion2DSetsWithCountScale(App NE) {
        Map<Double, List<AMV_MVS_VSQ_2D>> groups = NE._I_U.groups2D;
        double countScale = NE._I_U.countScale;
        return Filter_X_filterFusion2DSetsWithCountScale._E(groups, countScale);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_3D>> filterFusion3DSetsWithCountScale(App NE) {
        Map<Double, List<AMV_MVS_VSQ_3D>> groups = NE._I_U.groupsMap3D;
        double countScale = NE._I_U.countScale;
        return Filter_X_filterFusion3DSetsWithCountScale._E(groups, countScale);
    }

    //PCA_AMV_MVS_VSQ_Filter
    @Override
    public List<AMV_MVS_VSQ_2D> filterPosition2DsWithScaledDistance(App NE) {//
        List<AMV_MVS_VSQ_2D> input = NE._I_U.input2DList;
        AMV_MVS_VSQ_2D heart = NE._I_U.inputHeart;//later
        double scaleDistacne = NE._I_U.distanceScaleDouble;
        return AMV_MVS_VSQ_Filter_X_filterPosition2DsWithScaledDistance._E(input
            , heart
            , scaleDistacne);
    }

    @Override
    public List<AMV_MVS_VSQ_3D> filterPosition3DsWithScaledDistance3DList(App NE) {
        List<AMV_MVS_VSQ_3D> input = NE._I_U.input3D;
        AMV_MVS_VSQ_3D heart = NE._I_U.inputHeart3D;
        double scaleDistacne = NE._I_U.distanceScaleDouble;
        return AMV_MVS_VSQ_Filter_X_filterPosition3DsWithScaledDistance._E(input
            , heart
            , scaleDistacne);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_2D>> filterPosition2DsWithScaledDistanceMap2D(App NE) {
        Map<Double, List<AMV_MVS_VSQ_2D>> input = NE._I_U.input2D;
        AMV_MVS_VSQ_2D heart = NE._I_U.inputHeart;
        double scaleDistacne = NE._I_U.distanceScaleDouble;
        return AMV_MVS_VSQ_Filter_X_filterPosition2DsWithScaledDistance._E(input
            , heart, scaleDistacne);
    }

    @Override
    public Map<Double, List<AMV_MVS_VSQ_3D>> filterPosition3DsWithScaledDistanceMap3D(App NE) {
        Map<Double, List<AMV_MVS_VSQ_3D>> input = NE._I_U.inputMap3D;
        AMV_MVS_VSQ_3D heart = NE._I_U.inputHeart3D;//later
        double scaleDistacne = NE._I_U.distanceScaleDouble;
        return AMV_MVS_VSQ_Filter_X_filterPosition3DsWithScaledDistance._E(input
            , heart, scaleDistacne);
    }


    //Percentage{
    @Override
    public List<Double> getPercentListByOuterKey(App NE) {
        List<Double> list = NE._I_U.inputList;
        double key = NE._I_U.keyDouble;
        return Percentage.getPercentListByOuterKey(list, key);
    }

    @Override
    public double[] getPercentArrayByOuterKeyArray(App NE) {
        double[] array = NE._I_U.arrayDouble;
        double key = NE._I_U.keyDouble;
        return Percentage.getPercentArrayByOuterKey(array, key);
    }

    @Override
    public double[] getEachPercentSetOfDoubleArray(App NE) {
        double[] array = NE._I_U.arrayDouble;
        return Percentage.getEachPercentSetOfArray(array);
    }

    @Override
    public double[][] getPercentArrayByOuterKey(App NE) {
        double[][] array = NE._I_U.arrayDoubleM;
        double key = NE._I_U.keyDouble;
        return Percentage.getPercentArrayByOuterKey(array, key);//出现迭代问题
    }

    @Override
    public double[][] getEachPercentSetOfArray(App NE) {
        double[][] array = NE._I_U.arrayDoubleM;
        return Percentage.getEachPercentSetOfArray(array);
    }
}
