package S_A.AVQ.OVQ.OSQ.VSQ.obj;

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
public class Verbal {
    public String getChinese() {
        return chinese;
    }

    public void I_Chinese(String chinese) {
        this.chinese = chinese;
    }

    public String getEnglish() {
        return english;
    }

    public void I_English(String english) {
        this.english = english;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void I_PartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getExplain() {
        return explain;
    }

    public void I_Explain(String explain) {
        this.explain = explain;
    }

    public Verbal getNext() {
        return next;
    }

    public void I_Next(Verbal next) {
        this.next = next;
    }

    public Verbal getPrev() {
        return prev;
    }

    public void I_Prev(Verbal prev) {
        this.prev = prev;
    }

    private String chinese;
    private String japanese;
    private String korea;
    private String russian;
    private String arabic;
    private String french;
    private String german;
    private String spanish;
    private String pinyin;
    private String english;
    private String partOfSpeech;
    private String explain;
    private Verbal next;
    private Verbal prev;
}
