package E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E;

import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import ME.VPC.M.app.App;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFile;
import exception.file.O.DetaFileInputStream;
import exception.file.O.DetaInputStreamReader;
import S_A.SVQ.stable.S_Pos;
import S_A.VSQ.parser.EmotionMap_ES;
import S_A.pheromone.IMV_SIQ;

import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class EmotionMap_E extends EmotionMap_ES implements EmotionMap {
    //NE.resourceTail, 因为eclipse打包比ideaij简洁明确，对于程序员编码工程不是sdk研发者。
    //导致工程转ideaj打包缺少一把资源文件上层路径问题，于是
    //加个变量来校正
    public void IV_PositiveMap(App NE) {
        positiveMap = new IMV_SIQ();
        DetaFile file = new DetaFile(S_Pos.WORDS_SOURSE_LINK_POS_POSITIVE);
        InputStream in = DetaFileInputStream.E(file.getDetaCanonicalPath()
            .replace(file.getPath(), NE.resourceTail + "lygs/"
                + file.getPath()));
        DetaBufferedReader cReader = new DetaBufferedReader(
            DetaInputStreamReader.E(in, S_Pos.UTF8_STRING));
        String cInputString;
        while ((cInputString = cReader.readDetaLine()) != null) {
            if (!positiveMap.containsKey(cInputString)) {
                positiveMap.put(cInputString, true);
            }
        }
        cReader.closeDeta();
    }

    public void IV_MotivationMap(App NE) {
        motivationMap = new IMV_SIQ();
        DetaFile file = new DetaFile(S_Pos.WORDS_SOURSE_LINK_MOTIVATION);
        InputStream in = DetaFileInputStream.E(file.getDetaCanonicalPath()
            .replace(file.getDetaPath(), NE.resourceTail + "lygs/"
                + file.getDetaPath()));
        DetaBufferedReader cReader = new DetaBufferedReader(
            DetaInputStreamReader.E(in, S_Pos.UTF8_STRING));
        String cInputString;
        while ((cInputString = cReader.readDetaLine()) != null) {
            String[] value = cInputString.split(S_Pos.NLP_SYMBO_SLASH);
            if (!motivationMap.containsKey(value[S_Pos.INT_ZERO])) {
                motivationMap.put(value[S_Pos.INT_ZERO], value[S_Pos.INT_ONE]);
            }
        }
        cReader.closeDeta();
    }

    public void IV_TrendingMap(App NE) {
        trendingMap = new IMV_SIQ();
        DetaFile file = new DetaFile(S_Pos.WORDS_SOURSE_LINK_TRENDING);
        InputStream in = DetaFileInputStream.E(file.getDetaCanonicalPath()
            .replace(file.getPath(), NE.resourceTail + "lygs/"
                + file.getPath()));
        DetaBufferedReader cReader = new DetaBufferedReader(
            DetaInputStreamReader.E(in, S_Pos.UTF8_STRING));
        String cInputString;
        while ((cInputString = cReader.readDetaLine()) != null) {
            String[] value = cInputString.split(S_Pos.NLP_SYMBO_SLASH);
            if (!trendingMap.containsKey(value[S_Pos.INT_ZERO])) {
                trendingMap.put(value[S_Pos.INT_ZERO], value[S_Pos.INT_ONE]);
            }
        }
        cReader.closeDeta();
    }

    public void IV_NegativeMap(App NE) {
        negativeMap = new IMV_SIQ();
        //URL url= new URL(S_Pos.WORDS_SOURSE_LINK_POS_NEGATIVE);
        DetaFile file = new DetaFile(S_Pos.WORDS_SOURSE_LINK_POS_NEGATIVE);
        InputStream inputStream = DetaFileInputStream.E(file.getDetaCanonicalPath()
            .replace(file.getPath(), NE.resourceTail + "lygs/"
                + file.getPath()));
        InputStreamReader inputStreamReader = DetaInputStreamReader.E(inputStream
            , S_Pos.UTF8_STRING);
        DetaBufferedReader cReader = new DetaBufferedReader(inputStreamReader);
        String cInputString;
        while ((cInputString = cReader.readDetaLine()) != null) {
            if (!negativeMap.containsKey(cInputString)) {
                negativeMap.put(cInputString, true);
            }
        }
        cReader.closeDeta();
    }

    public void IV_PredictionMap(App NE) {
        predictionMap = new IMV_SIQ();
        DetaFile file = new DetaFile(S_Pos.WORDS_SOURSE_LINK_PREDICTION);
        InputStream in = DetaFileInputStream.E(file.getDetaCanonicalPath()
            .replace(file.getPath(), NE.resourceTail + "lygs/"
                + file.getPath()));
        DetaBufferedReader cReader
            = new DetaBufferedReader(DetaInputStreamReader.E(in, S_Pos.UTF8_STRING));
        String cInputString;
        while ((cInputString = cReader.readDetaLine()) != null) {
            String[] value = cInputString.split(S_Pos.NLP_SYMBO_SLASH);
            if (!predictionMap.containsKey(value[S_Pos.INT_ZERO])) {
                predictionMap.put(value[S_Pos.INT_ZERO], value[S_Pos.INT_ONE]);
            }
        }
        cReader.closeDeta();
    }

    public void IV_DistinctionMap(App NE) {
        distinctionMap = new IMV_SIQ();
        DetaFile file = new DetaFile(S_Pos.WORDS_SOURSE_LINK_DISTINCTION);
        InputStream in = DetaFileInputStream.E(file.getDetaCanonicalPath()
            .replace(file.getPath(), NE.resourceTail + "lygs/"
                + file.getPath()));
        DetaBufferedReader cReader = new DetaBufferedReader(
            DetaInputStreamReader.E(in, S_Pos.UTF8_STRING));
        String cInputString;
        while ((cInputString = cReader.readDetaLine()) != null) {
            String[] value = cInputString.split(S_Pos.NLP_SYMBO_SLASH);
            if (!distinctionMap.containsKey(value[S_Pos.INT_ZERO])) {
                distinctionMap.put(value[S_Pos.INT_ZERO], value[S_Pos.INT_ONE]);
            }
        }
        cReader.closeDeta();
    }
}
