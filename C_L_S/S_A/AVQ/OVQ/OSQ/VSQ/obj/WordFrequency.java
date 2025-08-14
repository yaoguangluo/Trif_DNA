package S_A.AVQ.OVQ.OSQ.VSQ.obj;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class WordFrequency {
    public WordFrequency(double frequency, String word) {
        this.frequency = frequency;
        this.word = word;
    }

    public String get_pos() {
        return pos;
    }

    public void I_pos(String POS) {
        this.pos = POS;
    }

    public String get_word() {
        return word;
    }

    public void I_word(String word) {
        this.word = word;
    }

    public double get_frequency() {
        return frequency;
    }

    public void I_frequency(double frequency) {
        this.frequency = frequency;
    }

    public WordFrequency get_left() {
        return left;
    }

    public void I_Left(WordFrequency left) {
        this.left = left;
    }

    public WordFrequency get_right() {
        return right;
    }

    public void I_Right(WordFrequency right) {
        this.right = right;
    }

    private String word;
    private String pos;
    private double frequency;
    private double dnn_ratio;//从今天开始全部用小写，以后大写仅仅用元基编码。
    private WordFrequency left;
    private WordFrequency right;

    public ArrayList<Integer> positions = new ArrayList<>();

    public int getAveragePosition() {
        if (null == positions) {
            return -1;
        }
        if (positions.isEmpty()) {
            return -1;
        }
        int output = 0;
        Iterator<Integer> iterator = positions.iterator();
        while (iterator.hasNext()) {
            output += iterator.next();
        }
        return output / positions.size();
    }
}
