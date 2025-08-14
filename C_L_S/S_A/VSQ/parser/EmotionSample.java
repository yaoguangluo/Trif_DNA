package S_A.VSQ.parser;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class EmotionSample {
    public double getPositiveCount() {
        return positiveCount;
    }

    public void I_PositiveCount(double positiveCount) {
        this.positiveCount = positiveCount;
    }

    public double getNegativeCount() {
        return negativeCount;
    }

    public void I_NegativeCount(double negativeCount) {
        this.negativeCount = negativeCount;
    }

    public double getEmotionRatio() {
        return emotionRatio;
    }

    public void I_EmotionRatio(double emotionRatio) {
        this.emotionRatio = emotionRatio;
    }

    public double getMotivationRatio() {
        return motivationRatio;
    }

    public void I_MotivationRatio(double motivationRatio) {
        this.motivationRatio = motivationRatio;
    }

    public double getCorrelationRatio() {
        return correlationRatio;
    }

    public void I_CorrelationRatio(double correlationRatio) {
        this.correlationRatio = correlationRatio;
    }

    public double getContinusRatio() {
        return continusRatio;
    }

    public void I_ContinusRatio(double continusRatio) {
        this.continusRatio = continusRatio;
    }

    public double getTrendsRatio() {
        return trendsRatio;
    }

    public void I_TrendsRatio(double trendsRatio) {
        this.trendsRatio = trendsRatio;
    }

    public double getPredictionRatio() {
        return predictionRatio;
    }

    public void I_PredictionRatio(double predictionRatio) {
        this.predictionRatio = predictionRatio;
    }

    public double getGuessRatio() {
        return guessRatio;
    }

    public void I_GuessRatio(double guessRatio) {
        this.guessRatio = guessRatio;
    }

    public double getSensingRatio() {
        return sensingRatio;
    }

    public void I_SensingRatio(double sensingRatio) {
        this.sensingRatio = sensingRatio;
    }

    public void I_MedCount(int frequency) {
        this.medCount = Double.valueOf(frequency);
    }

    public double getMedCount() {
        return medCount;
    }

    public String getMotivation() {
        return motivation;
    }

    public void I_Motivation(String motivation) {
        this.motivation = motivation.toString();
    }

    public String getTrending() {
        return trending;
    }

    public void I_Trending(String trending) {
        this.trending = trending;
    }

    public String getPrediction() {
        return prediction;
    }

    public void I_Prediction(String prediction) {
        this.prediction = prediction;
    }

    public void I_MedCount(double medCount) {
        this.medCount = medCount;
    }

    public String getDistinction() {
        return distinction;
    }

    public void I_Distinction(String distinction) {
        this.distinction = distinction;
    }

    double positiveCount = 0.0;
    double medCount = 0.0;
    double negativeCount = 0.0;
    double emotionRatio = 0.0;
    double motivationRatio = 0.0;
    double correlationRatio = 0.0;
    double continusRatio = 0.0;
    double trendsRatio = 0.0;
    double predictionRatio = 0.0;
    double guessRatio = 0.0;
    double sensingRatio = 0.0;
    String motivation = "";
    String trending = "";
    String prediction = "";
    String distinction = "";
}
