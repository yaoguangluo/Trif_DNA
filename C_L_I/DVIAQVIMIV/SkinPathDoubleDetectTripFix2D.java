package DVIAQVIMIV;

import S_A.pheromone.IMV_SIQ;
import U_V.ESU.array.Double_ESU;
import U_V.OEU.LYG4DQS4D.LYG9DWithDoubleTopSort5D;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展erosion变换. 计算机视觉. 
//硬件工具, imageIO, javaCV. 像素头
//因为肽展公式和思想GPL2.0开源, 本程序源码同样GPL2.0开源.
//二次erosion元基肽展读脏 未优化版 罗瑶光 20210827 白癜风伴白发 已经是次次 排分前3.
//罗瑶光 20210829 把函数模块化并 for loop 加入统计采样 筛选。
//世界记录永久定格了。
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class SkinPathDoubleDetectTripFix2D {
    public List<double[]> fileCells_5;
    public List<String> fileNames_5;
    public List<double[]> fileCells_6;
    public List<String> fileNames_6;
    public List<double[]> fileCells_17;
    public List<String> fileNames_17;
    public List<double[]> fileCells_suan_17;
    public List<String> fileNames_suan_17;
    public Map<String, Integer> afterFirstNames;
    public String testImagePath;
    public String[] nameScore;

    public static void main(String[] argv) {
        SkinPathDoubleDetectTripFix2D skinPathDoubleDetectTrip
            = new SkinPathDoubleDetectTripFix2D();
        skinPathDoubleDetectTrip.afterFirstNames = new IMV_SIQ();
        skinPathDoubleDetectTrip.initDeciphring(
            "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt", 6);
        skinPathDoubleDetectTrip.initDeciphring(
            "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB5.txt", 5);
        skinPathDoubleDetectTrip.initDeciphring(
            "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6_jian_17.txt", 17);
        skinPathDoubleDetectTrip.initDeciphring(
            "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6_suan_17.txt", 18);
        skinPathDoubleDetectTrip.testImagePath
            = "C:/Users/yaogu/Desktop/project/开源门户"
            + "/deciphering/线状苔藓-结节性硬化症叶状白斑_脏数据.jpg";
        //= "C:/Users/yaogu/Desktop/project/开源门户/deciphering/播散性黄瘤_脏数据.jpg";
        //= "C:/Users/yaogu/Desktop/project/开源门户
        ///deciphering/脏数据_白癜风伴白发-色素失禁症-毛发稀疏伴色素沉着.jpg";
        int[][] score = new int[][]{
            {5, 10, 5, 8, 25, 15, 15, 20}
            , {95, 5, 8, 8, 25, 15, 15, 20}
            , {5, 5, 2, 8, 1, 45, 1, 1}
            , {95, 5, 2, 8, 1, 45, 1, 1}
        };
        //第一次叠加
        for (int i = 0; i < 10; i++) {
            skinPathDoubleDetectTrip.doFirstPDErosionWithTop(1.0, 1.0
                , 1.0, 1.0, score, 30);
            //叠加前50。
        }
        //可以写mask
        //筛选
        //第二次筛选, 没有出现3次的一律过滤;
        skinPathDoubleDetectTrip.doSecondPDErosionWithTop(1.0, 1.0
            , 1.0, 1.0, score, 50, 4);
        //叠加筛选 前50 次数50%进行。
        //可以写mask
        //细准焦 碱筛选 精度5
        skinPathDoubleDetectTrip.doThirdPDErosionWithTop(1.0, 1.0
            , 1.0, 1.0, score, 500, 4);
        //前500的 叠加筛选次数50%进行。
    }

    public double[] doFourJianPDErosion(int erosion, int pixGate, int pixRatioScale, int pixDistinctScale,
                                        int pcaScale, int upcaScale, int icaScale, int ecaScale) {
        int[][][] getSkinBy = new GetSkinBy().getSkinBy(testImagePath);
        int[][][] doPDEofSkin = new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, erosion);
        //new ReadWritePng().writePNG("C:/Users/yaogu/Desktop/project/开源门户
        ///deciphering/F_DB1.jpg", doPDEofSkin);
        double[] getStatisticCount
            = new GetStatisticCount().getStatisticCount(doPDEofSkin, pixGate, pixRatioScale, pixDistinctScale);
        //这个getStatisticCount地方可以优化为 像奥运会比赛那样, 明显太多德杂色进行自动或者认为剔除,
        //如字的黑色, 一些图片的红色.
        //剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
        double[] getStatisticRatio = new GetStatisticRatio().getStatisticRatio(getStatisticCount);
        //3 遍历疾病数据表.
        //initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt");
        //4 打分
        double[] score = new double[fileNames_6.size()];
        nameScore = new String[fileNames_6.size()];
        GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio
            , fileCells_6, fileNames_6, pcaScale, upcaScale, icaScale, ecaScale);
        return score;
    }

    public double[] doFourSuanPDErosion(int erosion, int pixGate, int pixRatioScale, int pixDistinctScale,
                                        int pcaScale, int upcaScale, int icaScale, int ecaScale) {
        int[][][] getSkinBy = new GetSkinBy().getSkinBy(testImagePath);
        int[][][] doPDEofSkin = new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, erosion);
        //new ReadWritePng().writePNG("C:/Users/yaogu/Desktop/project
        ///开源门户/deciphering/F_DB1.jpg", doPDEofSkin);
        double[] getStatisticCount
            = new GetStatisticCount().getStatisticCount(doPDEofSkin, pixGate, pixRatioScale, pixDistinctScale);
        //这个getStatisticCount地方可以优化为 像奥运会比赛那样, 明显太多德杂色进行自动或者认为剔除,
        //如字的黑色, 一些图片的红色.
        //剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
        double[] getStatisticRatio = new GetStatisticRatio().getStatisticRatio(getStatisticCount);
        //3 遍历疾病数据表.
        //initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt");
        //4 打分
        double[] score = new double[fileNames_5.size()];
        nameScore = new String[fileNames_5.size()];
        GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio
            , fileCells_5, fileNames_5, pcaScale, upcaScale, icaScale, ecaScale);
        return score;
    }

    public double[] doEightSuanPDErosion(int erosion, int pixGate, int pixRatioScale, int pixDistinctScale,
                                         int pcaScale, int upcaScale, int icaScale, int ecaScale) {
        int[][][] getSkinBy = new GetSkinBy().getSkinBy(testImagePath);
        int[][][] doPDEofSkin
            = new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, erosion);
        //new ReadWritePng().writePNG("C:/Users/yaogu/Desktop/project/开源门户
        ///deciphering/F_DB1.jpg", doPDEofSkin);
        double[] getStatisticCount
            = new GetStatisticCount().getStatisticCount(doPDEofSkin, pixGate, pixRatioScale, pixDistinctScale);
        //这个getStatisticCount地方可以优化为 像奥运会比赛那样, 明显太多德杂色进行自动或者认为剔除,
        //如字的黑色, 一些图片的红色.
        //剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
        double[] getStatisticRatio = new GetStatisticRatio().getStatisticRatio(getStatisticCount);
        //3 遍历疾病数据表.
        //initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt");
        //4 打分
        double[] score = new double[fileNames_suan_17.size()];
        nameScore = new String[fileNames_suan_17.size()];
        GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells_suan_17
            , fileNames_suan_17, pcaScale, upcaScale, icaScale, ecaScale);
        return score;
    }

    public double[] doEightJianPDErosion(int erosion, int pixGate, int pixRatioScale, int pixDistinctScale,
                                         int pcaScale, int upcaScale, int icaScale, int ecaScale) {
        int[][][] getSkinBy = new GetSkinBy().getSkinBy(testImagePath);
        int[][][] doPDEofSkin = new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy,
            erosion);
        //new ReadWritePng().writePNG("C:/Users/yaogu/Desktop/project/开源门户
        ///deciphering/F_DB1.jpg", doPDEofSkin);
        double[] getStatisticCount
            = new GetStatisticCount().getStatisticCount(doPDEofSkin, pixGate, pixRatioScale, pixDistinctScale);
        //这个getStatisticCount地方可以优化为 像奥运会比赛那样, 明显太多德杂色进行自动或者认为剔除,
        //如字的黑色, 一些图片的红色.
        //剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
        double[] getStatisticRatio = new GetStatisticRatio().getStatisticRatio(getStatisticCount);
        //3 遍历疾病数据表.
        //initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt");
        //4 打分
        double[] score = new double[fileNames_17.size()];
        nameScore = new String[fileNames_17.size()];
        GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio
            , fileCells_17, fileNames_17, pcaScale, upcaScale, icaScale, ecaScale);
        return score;
    }

    @SuppressWarnings("unused")
    public void doFirstPDErosionWithTop(double fourJian, double fourSuan
        , double eightJian, double eightSuan, int[][] scoreMatrix, int top) {
        double[] score = doFourJianPDErosion(scoreMatrix[0][0], scoreMatrix[0][1]
            , scoreMatrix[0][2], scoreMatrix[0][3]
            , scoreMatrix[0][4], scoreMatrix[0][5], scoreMatrix[0][6]
            , scoreMatrix[0][7]);
        double[] scoreICD = doFourSuanPDErosion(scoreMatrix[1][0], scoreMatrix[1][1]
            , scoreMatrix[1][2], scoreMatrix[1][3]
            , scoreMatrix[1][4], scoreMatrix[1][5], scoreMatrix[1][6]
            , scoreMatrix[1][7]);
        double[] score_17 = doEightJianPDErosion(scoreMatrix[2][0], scoreMatrix[2][1]
            , scoreMatrix[2][2], scoreMatrix[2][3]
            , scoreMatrix[2][4], scoreMatrix[2][5], scoreMatrix[2][6]
            , scoreMatrix[2][7]);
        double[] score_ICD17 = doEightSuanPDErosion(scoreMatrix[3][0], scoreMatrix[3][1]
            , scoreMatrix[3][2], scoreMatrix[3][3]
            , scoreMatrix[3][4], scoreMatrix[3][5], scoreMatrix[3][6]
            , scoreMatrix[3][7]);
        //融合
        for (int i = 0; i < scoreICD.length; i++) {
            score[i] = score[i] * fourJian + scoreICD[i] * fourSuan + score_17[i] * eightJian
                + score_ICD17[i] * eightSuan;
        }
        //5 筛选
        double[] scoreDouble = new double[score.length];
        for (int i = 0; i < scoreDouble.length; i++) {
            scoreDouble[i] = score[i];//
        }
        //改成map
        Map<Double, Map<String, Boolean>> map
            = Double_ESU.getMapFromDoubleStringArray(score, nameScore);
        int 递归深度 = 70; //避免同值冗余内存高峰
        int 堆栈广度 = 7; //避免堆栈浪费计算高峰
        new LYG9DWithDoubleTopSort5D().sort(scoreDouble, 堆栈广度, 递归深度);
        //new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
        //6 推荐
        Here:
        for (int i = 0; i < scoreDouble.length; i++) {
            if (!map.containsKey(scoreDouble[i])) {
                i++;
                continue Here;
            }
            Iterator<String> iterator = map.get(scoreDouble[i]).keySet().iterator();
            while (iterator.hasNext()) {
                String string = iterator.next();
                if (i < top) {//筛选
                    if (!afterFirstNames.containsKey(string)) {
                        afterFirstNames.put(string, 1);
                    } else {
                        afterFirstNames.put(string, afterFirstNames.get(string) + 1);//打分
                    }
                }
                double scoreRank = (null == afterFirstNames.get(string)
                    ? 0.0 : afterFirstNames.get(string)) * i;
                if (string.contains("结节性硬化症叶状白斑") || string.contains("白癜风")
                    || string.contains("黄瘤")) {
                    //20230106-System.out.println(scoreRank+"--"+afterFirstNames.get(string)
                    //	+ "相似图片:"+ i+ "位"+ string+ "--分数:"+ scoreDouble[i]);
                }
            }
            map.remove(scoreDouble[i]);
        }
    }

    @SuppressWarnings("unused")
    public void doSecondPDErosionWithTop(double fourJian, double fourSuan
        , double eightJian, double eightSuan, int[][] scoreMatrix
        , int top, int times) {
        double[] score = doFourJianPDErosion(scoreMatrix[0][0], scoreMatrix[0][1]
            , scoreMatrix[0][2], scoreMatrix[0][3]
            , scoreMatrix[0][4], scoreMatrix[0][5], scoreMatrix[0][6]
            , scoreMatrix[0][7]);
        double[] scoreICD = doFourSuanPDErosion(scoreMatrix[1][0]
            , scoreMatrix[1][1], scoreMatrix[1][2], scoreMatrix[1][3]
            , scoreMatrix[1][4], scoreMatrix[1][5], scoreMatrix[1][6]
            , scoreMatrix[1][7]);
        double[] score_17 = doEightJianPDErosion(scoreMatrix[2][0]
            , scoreMatrix[2][1], scoreMatrix[2][2], scoreMatrix[2][3]
            , scoreMatrix[2][4], scoreMatrix[2][5], scoreMatrix[2][6]
            , scoreMatrix[2][7]);
        double[] score_ICD17 = doEightSuanPDErosion(scoreMatrix[3][0]
            , scoreMatrix[3][1], scoreMatrix[3][2], scoreMatrix[3][3]
            , scoreMatrix[3][4], scoreMatrix[3][5], scoreMatrix[3][6]
            , scoreMatrix[3][7]);
        //融合
        for (int i = 0; i < scoreICD.length; i++) {
            score[i] = score[i] * fourJian + scoreICD[i] * fourSuan + score_17[i] * eightJian
                + score_ICD17[i] * eightSuan;
        }
        //5 筛选
        double[] scoreDouble = new double[score.length];
        for (int i = 0; i < scoreDouble.length; i++) {
            scoreDouble[i] = score[i];//
        }
        //改成map
        Map<Double, Map<String, Boolean>> map = Double_ESU.getMapFromDoubleStringArray(score
            , nameScore);
        int 递归深度 = 70; //避免同值冗余内存高峰
        int 堆栈广度 = 7; //避免堆栈浪费计算高峰
        new LYG9DWithDoubleTopSort5D().sort(scoreDouble, 堆栈广度, 递归深度);
        //new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
        //6 推荐
        Here:
        for (int i = 0; i < scoreDouble.length; i++) {
            if (!map.containsKey(scoreDouble[i])) {
                i++;
                continue Here;
            }
            Iterator<String> iterator = map.get(scoreDouble[i]).keySet().iterator();
            while (iterator.hasNext()) {
                String string = iterator.next();
                if (i < top) {
                    //筛选
                    if (!afterFirstNames.containsKey(string)) {
                        afterFirstNames.put(string, 0);
                    } else {
                        if (afterFirstNames.get(string) > times) {
                            afterFirstNames.put(string, afterFirstNames.get(string) + 1);
                            //出现四次才打分
                        }
                    }
                    double scoreRank = (null == afterFirstNames.get(string)
                        ? 0.0 : afterFirstNames.get(string));
                    if (string.contains("结节性硬化症叶状白斑") || string.contains("白癜风")
                        || string.contains("黄瘤")) {
                        //20230106-System.out.println(">>>>"+scoreRank+"--"
                        //		+afterFirstNames.get(string)+ "相似图片:"+ i+ "位"
                        //		+ string+ "--分数:"+ scoreDouble[i]);
                    }
                }
            }
            map.remove(scoreDouble[i]);
            //	//20230106-System.out.println("相似图片:"+ nameScore[i]+ "-----分数:"+ scoreInt[i]);
        }
    }

    @SuppressWarnings("unused")
    public void doThirdPDErosionWithTop(double fourJian, double fourSuan, double eightJian
        , double eightSuan, int[][] scoreMatrix, int top, int times) {
        double[] score = doFourJianPDErosion(scoreMatrix[0][0], scoreMatrix[0][1]
            , scoreMatrix[0][2], scoreMatrix[0][3]
            , scoreMatrix[0][4], scoreMatrix[0][5], scoreMatrix[0][6]
            , scoreMatrix[0][7]);
        double[] scoreICD = doFourSuanPDErosion(scoreMatrix[1][0], scoreMatrix[1][1]
            , scoreMatrix[1][2], scoreMatrix[1][3]
            , scoreMatrix[1][4], scoreMatrix[1][5], scoreMatrix[1][6]
            , scoreMatrix[1][7]);
        double[] score_17 = doEightJianPDErosion(scoreMatrix[2][0], scoreMatrix[2][1]
            , scoreMatrix[2][2], scoreMatrix[2][3]
            , scoreMatrix[2][4], scoreMatrix[2][5], scoreMatrix[2][6]
            , scoreMatrix[2][7]);
        double[] score_ICD17 = doEightSuanPDErosion(scoreMatrix[3][0], scoreMatrix[3][1]
            , scoreMatrix[3][2], scoreMatrix[3][3]
            , scoreMatrix[3][4], scoreMatrix[3][5], scoreMatrix[3][6]
            , scoreMatrix[3][7]);
        //融合
        for (int i = 0; i < scoreICD.length; i++) {
            score[i] = score[i] * fourJian + scoreICD[i] * fourSuan + score_17[i] * eightJian
                + score_ICD17[i] * eightSuan;
        }
        //5 筛选
        double[] scoreDouble = new double[score.length];
        for (int i = 0; i < scoreDouble.length; i++) {
            scoreDouble[i] = score[i];//
        }
        //改成map
        Map<Double, Map<String, Boolean>> map = Double_ESU.getMapFromDoubleStringArray(score
            , nameScore);
        int 递归深度 = 70; //避免同值冗余内存高峰
        int 堆栈广度 = 7; //避免堆栈浪费计算高峰
        new LYG9DWithDoubleTopSort5D().sort(scoreDouble, 堆栈广度, 递归深度);
        //new Quick9DLYGWithString_ESU().sort(scoreInt, nameScore);
        //6 推荐
        Here:
        for (int i = 0; i < scoreDouble.length; i++) {
            if (!map.containsKey(scoreDouble[i])) {
                i++;
                continue Here;
            }
            Iterator<String> iterator = map.get(scoreDouble[i]).keySet().iterator();
            while (iterator.hasNext()) {
                String string = iterator.next();
                if (i < top) {
                    if (afterFirstNames.containsKey(string)) {
                        double scoreRank = (null == afterFirstNames.get(string)
                            ? 0.0 : afterFirstNames.get(string));
                        if (scoreRank > times) {//mask
                            //20230106-System.out.println(scoreRank+"--"+afterFirstNames.get(string)
                            //	+ "相似图片:"+ i+ "位"+ string+ "--分数:"+ scoreDouble[i]
                            //			+"---"+scoreDouble[i]/scoreRank);
                        }
                    }
                }
                double scoreRank = (null == afterFirstNames.get(string)
                    ? 0.0 : afterFirstNames.get(string));
                if (string.contains("结节性硬化症叶状白斑") || string.contains("白癜风")
                    || string.contains("黄瘤")) {
                    //20230106-System.out.println(">>>>"+scoreRank+"--"+afterFirstNames.get(string)
                    //+ "相似图片:"+ i+ "位"+ string+ "--分数:"+ scoreDouble[i]);
                }
            }
            map.remove(scoreDouble[i]);
        }
    }

    public void initDeciphring(String string, int type) throws NumberFormatException {
        try {
            if (5 == type) {
                fileNames_5 = new ArrayList<>();
                fileCells_5 = new ArrayList<>();
            }
            if (6 == type) {
                fileNames_6 = new ArrayList<>();
                fileCells_6 = new ArrayList<>();
            }
            if (17 == type) {
                fileNames_17 = new ArrayList<>();
                fileCells_17 = new ArrayList<>();
            }
            if (18 == type) {
                fileNames_suan_17 = new ArrayList<>();
                fileCells_suan_17 = new ArrayList<>();
            }

            String ctempString;
            InputStream inputStream = null;

            inputStream = new FileInputStream(string);

            DetaBufferedReader cReader = new DetaBufferedReader(DetaInputStreamReader.E(inputStream, "UTF8"));
            while ((ctempString = cReader.readDetaLine()) != null) {
                String[] lineCell = ctempString.split(">d>");
                if (lineCell.length > 1) {
                    if (5 == type) {
                        fileNames_5.add(lineCell[0]);
                    }
                    if (6 == type) {
                        fileNames_6.add(lineCell[0]);
                    }
                    if (17 == type) {
                        fileNames_17.add(lineCell[0]);
                    }
                    if (18 == type) {
                        fileNames_suan_17.add(lineCell[0]);
                    }
                    double[] lineDouble = new double[lineCell.length - 1];
                    for (int i = 0; i < lineDouble.length; i++) {
                        lineDouble[i] = Double.valueOf(lineCell[i + 1]);
                    }
                    if (5 == type) {
                        fileCells_5.add(lineDouble);
                    }
                    if (6 == type) {
                        fileCells_6.add(lineDouble);
                    }
                    if (17 == type) {
                        fileCells_17.add(lineDouble);
                    }
                    if (18 == type) {
                        fileCells_suan_17.add(lineDouble);
                    }
                }
            }
            cReader.closeDeta();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
