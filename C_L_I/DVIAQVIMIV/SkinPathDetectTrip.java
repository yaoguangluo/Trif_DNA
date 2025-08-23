package DVIAQVIMIV;

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
//
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
public class SkinPathDetectTrip {
    public static List<double[] > fileCells;
    public static List<String> fileNames;

    public static void main(String[] argv) {
        //皮肤病图片识别
        //1 读取一张图片
        //String testImagePath= "C:/Users/yaogu/Desktop/project/开源门户
        ///deciphering/F_DB.jpg";
        String testImagePath = "C:/Users/yaogu/Desktop/project/开源门户"
                + "/deciphering/一般脏_白癜风伴白发-色素失禁症-毛发稀疏伴色素沉着.jpg";
        //2 计算图片训练值
        int erosion = 5;
        int[][][] getSkinBy = new GetSkinBy().getSkinBy(testImagePath);
        int[][][] doPDEofSkin = new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, erosion);
        //new ReadWritePng().writePNG("C:/Users/yaogu/Desktop/project/开源门户
        ///deciphering/F_DB1.jpg", doPDEofSkin);
        int pixGate = 10;
        int pixRatioScale = 5;
        int pixDistinctScale = 8;
        double[]  getStatisticCount = new GetStatisticCount().getStatisticCount(doPDEofSkin
                , pixGate, pixRatioScale, pixDistinctScale);
        //这个getStatisticCount地方可以优化为 像奥运会比赛那样, 明显太多德杂色进行自动或者认为剔除
        //, 如字的黑色, 一些图片的红色.
        //剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
        double[]  getStatisticRatio = new GetStatisticRatio().getStatisticRatio(getStatisticCount);
        //
        //3 遍历疾病数据表.
        initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt");
        //4 打分
        double[]  score = new double[fileNames.size()];
        String[] nameScore = new String[fileNames.size()];
        int pcaScale = 25;
        int upcaScale = 15;
        int icaScale = 15;
        int ecaScale = 20;
        GetColorRatioScore.scoreDeciphring(score, nameScore, getStatisticRatio, fileCells
                , fileNames, pcaScale, upcaScale, icaScale, ecaScale);
        //
        erosion = 95;
        getSkinBy = new GetSkinBy().getSkinBy(testImagePath);
        doPDEofSkin = new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, erosion);
        //new ReadWritePng().writePNG("C:/Users/yaogu/Desktop/project/开源门户/deciphering
        ///F_DB1.jpg", doPDEofSkin);
        pixGate = 10;
        pixRatioScale = 8;
        pixDistinctScale = 8;
        getStatisticCount = new GetStatisticCount().getStatisticCount(doPDEofSkin, pixGate
                , pixRatioScale, pixDistinctScale);
        //这个getStatisticCount地方可以优化为 像奥运会比赛那样, 明显太多德杂色进行自动或者认为剔除
        //, 如字的黑色, 一些图片的红色.
        //剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
        getStatisticRatio = new GetStatisticRatio().getStatisticRatio(getStatisticCount);
        //
        //3 遍历疾病数据表.
        initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB5.txt");
        //4 打分
        double[]  scoreICD = new double[fileNames.size()];
        GetColorRatioScore.scoreDeciphring(scoreICD, nameScore, getStatisticRatio, fileCells
                , fileNames, pcaScale, upcaScale, icaScale, ecaScale);
        //
        //
        erosion = 5;
        getSkinBy = new GetSkinBy().getSkinBy(testImagePath);
        doPDEofSkin = new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, erosion);
        //new ReadWritePng().writePNG("C:/Users/yaogu/Desktop/project/开源门户
        ///deciphering/F_DB_17.jpg", doPDEofSkin);
        pixGate = 10;
        pixRatioScale = 2;
        pixDistinctScale = 8;
        getStatisticCount = new GetStatisticCount().getStatisticCount(doPDEofSkin, pixGate
                , pixRatioScale, pixDistinctScale);
        //这个getStatisticCount地方可以优化为 像奥运会比赛那样, 明显太多德杂色进行自动或者认为剔除
        //, 如字的黑色, 一些图片的红色.
        //剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
        getStatisticRatio = new GetStatisticRatio().getStatisticRatio(getStatisticCount);
        //
        //3 遍历疾病数据表.
        initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering"
                + "/F_DB6_jian_17.txt");
        //4 打分
        double[]  score_17 = new double[fileNames.size()];
        pcaScale = 1;
        upcaScale = 45;
        icaScale = 1;
        ecaScale = 1;
        GetColorRatioScore.scoreDeciphring(score_17, nameScore, getStatisticRatio
                , fileCells, fileNames, pcaScale, upcaScale, icaScale, ecaScale);
        //
        erosion = 95;
        getSkinBy = new GetSkinBy().getSkinBy(testImagePath);
        doPDEofSkin = new DoPDEofSkin().doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(getSkinBy, erosion);
        //new ReadWritePng().writePNG("C:/Users/yaogu/Desktop/project/开源门户
        ///deciphering/F_DB_17.jpg", doPDEofSkin);
        pixGate = 10;
        pixRatioScale = 3;//采样是5
        pixDistinctScale = 8;
        getStatisticCount = new GetStatisticCount().getStatisticCount(doPDEofSkin
                , pixGate, pixRatioScale, pixDistinctScale);
        //这个getStatisticCount地方可以优化为 像奥运会比赛那样, 明显太多德杂色进行自动或者认为剔除
        //, 如字的黑色, 一些图片的红色.
        //剔除后也可以最小值剔除, 如 一些散落的灰色(高斯噪), 无特征的三原同位色阶 颜色, 图片颜色等.
        getStatisticRatio = new GetStatisticRatio().getStatisticRatio(getStatisticCount);
        //
        //3 遍历疾病数据表.
        initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering"
                + "/F_DB6_suan_17.txt");
        //4 打分
        double[]  score_ICD17 = new double[fileNames.size()];
        pcaScale = 1;
        upcaScale = 45;
        icaScale = 1;
        ecaScale = 1;
        GetColorRatioScore.scoreDeciphring(score_ICD17, nameScore, getStatisticRatio
                , fileCells, fileNames, pcaScale, upcaScale, icaScale, ecaScale);
        //融合
        for (int i = 0; i < scoreICD.length; i++) {
            //score[i]+= scoreICD[i]+ score_17[i]+ score_ICD17[i];
            score[i] = score[i] * 1 + scoreICD[i] * 0.001 + score_17[i] * 1 + score_ICD17[i] * 1;
        }
        //5 筛选
        double[]  scoreDouble = new double[score.length];
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
                if (string.contains("白癜风伴")) {
                    //20230106-System.out.println("相似图片:"+ i+ "位"+ string+ "-----分数:"+ scoreDouble[i]);
                } else {
                    if (i < 20) {
                        //20230106-System.out.println("相似图片:"+ i+ "位"+ string+ "-----分数:"+ scoreDouble[i]);
                    }
                }
            }
            map.remove(scoreDouble[i]);
            //	//20230106-System.out.println("相似图片:"+ nameScore[i]+ "-----分数:"+ scoreInt[i]);
        }
    }

    private static void initDeciphring(String string) {
        try {
            fileNames = new ArrayList<>();
            fileCells = new ArrayList<>();
            String ctempString;
            InputStream inputStream = null;
            inputStream = new FileInputStream(string);
            DetaBufferedReader cReader = new DetaBufferedReader(
                    DetaInputStreamReader.E(inputStream, "UTF8"));
            while ((ctempString = cReader.readDetaLine()) != null) {
                String[] lineCell = ctempString.split(">d>");
                if (lineCell.length > 1) {
                    fileNames.add(lineCell[0]);
                    double[]  lineDouble = new double[lineCell.length - 1];
                    for (int i = 0; i < lineDouble.length; i++) {
                        lineDouble[i] = Double.valueOf(lineCell[i + 1]);
                    }
                    fileCells.add(lineDouble);
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
