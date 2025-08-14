package S_A.SEM.bloom;

import A_I.MPE.MAQPVDCOISIV.pdi.RangePDI;
import DVIAQVIMIV.SkinPathDetectTrip_E;
import DVIAQVIMIV.SkinPathDoubleDetectTripFix2D;
import DVIAQVIMIV.SkinPathDoubleDetectTripFix2D_E;
import ME.VPC.M.app.App;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;

//著作权人 + 作者= 罗瑶光
public class StaticFunctionMapI_VECS_E implements StaticFunctionMapI_VECS_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    //SkinPathDoubleDetectTripFix2D_E{
    @Override
    public List<String> doTestWithImageAPP(App NE) {
        App app = NE._I_U.app;
        return SkinPathDoubleDetectTripFix2D_E.doTestWithImageAPP(app.app_S);
    }

    ;

    public double[] doFourJianPDErosion(App NE) {
        int erosion = NE._I_U.erosion;
        int pixGate = NE._I_U.pixGate;
        int pixRatioScale = NE._I_U.pixRatioScale;
        int pixDistinctScale = NE._I_U.pixDistinctScale;
        int pcaScale = NE._I_U.pcaScale;
        int upcaScale = NE._I_U.upcaScale;
        int icaScale = NE._I_U.icaScale;
        int ecaScale = NE._I_U.ecaScale;
        BufferedImage bufferedImage = NE._I_U.bufferedImage;
        return new SkinPathDoubleDetectTripFix2D_E().doFourJianPDErosion(erosion, pixGate
            , pixRatioScale, pixDistinctScale, pcaScale, upcaScale, icaScale, ecaScale
            , bufferedImage);
    }

    ;

    public double[] doFourSuanPDErosion(App NE) {
        int erosion = NE._I_U.erosion;
        int pixGate = NE._I_U.pixGate;
        int pixRatioScale = NE._I_U.pixRatioScale;
        int pixDistinctScale = NE._I_U.pixDistinctScale;
        int pcaScale = NE._I_U.pcaScale;
        int upcaScale = NE._I_U.upcaScale;
        int icaScale = NE._I_U.icaScale;
        int ecaScale = NE._I_U.ecaScale;
        BufferedImage bufferedImage = NE._I_U.bufferedImage;
        return new SkinPathDoubleDetectTripFix2D_E().doFourSuanPDErosion(erosion, pixGate
            , pixRatioScale, pixDistinctScale,
            pcaScale, upcaScale, icaScale, ecaScale, bufferedImage);
    }

    ;

    public double[] doEightSuanPDErosion(App NE) {
        int erosion = NE._I_U.erosion;
        int pixGate = NE._I_U.pixGate;
        int pixRatioScale = NE._I_U.pixRatioScale;
        int pixDistinctScale = NE._I_U.pixDistinctScale;
        int pcaScale = NE._I_U.pcaScale;
        int upcaScale = NE._I_U.upcaScale;
        int icaScale = NE._I_U.icaScale;
        int ecaScale = NE._I_U.ecaScale;
        BufferedImage bufferedImage = NE._I_U.bufferedImage;
        return new SkinPathDoubleDetectTripFix2D_E().doEightSuanPDErosion(erosion, pixGate
            , pixRatioScale, pixDistinctScale,
            pcaScale, upcaScale, icaScale, ecaScale, bufferedImage);
    }

    ;

    public double[] doEightJianPDErosion(App NE) {
        int erosion = NE._I_U.erosion;
        int pixGate = NE._I_U.pixGate;
        int pixRatioScale = NE._I_U.pixRatioScale;
        int pixDistinctScale = NE._I_U.pixDistinctScale;
        int pcaScale = NE._I_U.pcaScale;
        int upcaScale = NE._I_U.upcaScale;
        int icaScale = NE._I_U.icaScale;
        int ecaScale = NE._I_U.ecaScale;
        BufferedImage bufferedImage = NE._I_U.bufferedImage;
        return new SkinPathDoubleDetectTripFix2D_E().doEightJianPDErosion(erosion, pixGate
            , pixRatioScale, pixDistinctScale, pcaScale, upcaScale, icaScale, ecaScale
            , bufferedImage);
    }

    ;

    public void doFirstPDErosionWithTop(App NE) {
        double fourJian = NE._I_U.fourJian;
        double fourSuan = NE._I_U.fourSuan;
        double eightJian = NE._I_U.eightJian;
        double eightSuan = NE._I_U.eightSuan;
        int[][] scoreMatrix = NE._I_U.scoreMatrix;
        int top = NE._I_U.top;
        BufferedImage bufferedImage = NE._I_U.bufferedImage;
        new SkinPathDoubleDetectTripFix2D_E().doFirstPDErosionWithTop(fourJian
            , fourSuan, eightJian, eightSuan, scoreMatrix, top, bufferedImage);
    }

    ;

    public void doSecondPDErosionWithTop(App NE) {

        double fourJian = NE._I_U.fourJian;
        double fourSuan = NE._I_U.fourSuan;
        double eightJian = NE._I_U.eightJian;
        double eightSuan = NE._I_U.eightSuan;
        int[][] scoreMatrix = NE._I_U.scoreMatrix;
        int top = NE._I_U.top;
        int times = NE._I_U.times;
        BufferedImage bufferedImage = NE._I_U.bufferedImage;
        new SkinPathDoubleDetectTripFix2D_E().doSecondPDErosionWithTop(fourJian
            , fourSuan, eightJian, eightSuan, scoreMatrix, top, times, bufferedImage);
    }

    ;

    public void doThirdPDErosionWithTop(App NE) {
        double fourJian = NE._I_U.fourJian;
        double fourSuan = NE._I_U.fourSuan;
        double eightJian = NE._I_U.eightJian;
        double eightSuan = NE._I_U.eightSuan;
        int[][] scoreMatrix = NE._I_U.scoreMatrix;
        int top = NE._I_U.top;
        int times = NE._I_U.times;
        List<String> output = NE._I_U.output;
        BufferedImage bufferedImage = NE._I_U.bufferedImage;
        new SkinPathDoubleDetectTripFix2D_E().doThirdPDErosionWithTop(fourJian
            , fourSuan, eightJian, eightSuan, scoreMatrix
            , top, times, output, bufferedImage);
    }

    ;

    public void initDeciphring(App NE) throws NumberFormatException {
        AES_QMS_XSD_TIH string = NE._I_U.string;
        int type = NE._I_U.type;
        new SkinPathDoubleDetectTripFix2D_E().initDeciphring(string._S_, type);
    }

    ;

    //SkinPathDetectTrip_E{
    public void doTestWithFilePath(App NE) {
        AES_QMS_XSD_TIH testImagePathString = NE._I_U.testImagePathString;
        SkinPathDetectTrip_E.doTestWithFilePath(testImagePathString._S_);
    }

    ;

    public List<String> doTestWithImage(App NE) {
        Image testImagePath = NE._I_U.testImagePath;
        return SkinPathDetectTrip_E.doTestWithImage(testImagePath);
    }

    ;

    public void doTestWithBufferedImage(App NE) {
        BufferedImage testBufferedImagePath = NE._I_U.testBufferedImagePath;
        SkinPathDetectTrip_E.doTestWithBufferedImage(testBufferedImagePath);
    }

    ;

    public static void main(String[] argv) {
        App NE = new App();
        String[] string = new String[5];
        string[0] = "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt";
        string[1] = "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB5.txt";
        string[2] = "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6_jian_17.txt";
        string[3] = "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6_suan_17.txt";
        string[4]
            = "C:/Users/yaogu/Desktop/project/开源门户/deciphering"
            + "/线状苔藓-结节性硬化症叶状白斑_脏数据.jpg";
        NE._I_U.stringA = string;
        new StaticFunctionMapI_VECS_E().staticMain(NE);
    }

    //SkinPathDoubleDetectTripFix2D
    @Override
    public void staticMain(App NE) {
        String[] stringA = NE._I_U.stringA;
        //
        SkinPathDoubleDetectTripFix2D skinPathDoubleDetectTrip = new SkinPathDoubleDetectTripFix2D();
        skinPathDoubleDetectTrip.afterFirstNames = new IMV_SIQ();
        skinPathDoubleDetectTrip.initDeciphring(stringA[0], 6);
        skinPathDoubleDetectTrip.initDeciphring(stringA[1], 5);
        skinPathDoubleDetectTrip.initDeciphring(stringA[2], 17);
        skinPathDoubleDetectTrip.initDeciphring(stringA[3], 18);
        skinPathDoubleDetectTrip.testImagePath = stringA[4];
        //= "C:/Users/yaogu/Desktop/project/开源门户/deciphering/播散性黄瘤_脏数据.jpg";
        //= "C:/Users/yaogu/Desktop/project/开源门户/deciphering
        ///脏数据_白癜风伴白发-色素失禁症-毛发稀疏伴色素沉着.jpg";
        int[][] score = new int[][]{//稍后数组分出去 多样化参数input 设计。
            {5, 10, 5, 8, 25, 15, 15, 20}
            , {95, 5, 8, 8, 25, 15, 15, 20}
            , {5, 5, 2, 8, 1, 45, 1, 1}
            , {95, 5, 2, 8, 1, 45, 1, 1}
        };
        //第一次叠加
        for (int i = 0; i < 10; i++) {
            skinPathDoubleDetectTrip.doFirstPDErosionWithTop(1.0
                , 1.0, 1.0, 1.0, score, 30);
            //叠加前50。
        }
        //可以写mask
        //筛选
        //第二次筛选, 没有出现3次的一律过滤;
        skinPathDoubleDetectTrip.doSecondPDErosionWithTop(1.0
            , 1.0, 1.0, 1.0, score, 50, 4);
        //叠加筛选 前50 次数50%进行。
        //可以写mask
        //细准焦 碱筛选 精度5
        skinPathDoubleDetectTrip.doThirdPDErosionWithTop(1.0
            , 1.0, 1.0, 1.0, score, 500, 4);
        //前500的 叠加筛选次数50%进行
    }

    //16进制 AOPM VECS IDUQ TXHF 肽erosion非卷积视觉计算
    @Override
    public int[][] doPDERangePDI16(App NE) {
        int[][] input = NE._I_U.input;
        int oicd_scale = NE._I_U.oicd_scale;
        return RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(input, oicd_scale);
    }
}
