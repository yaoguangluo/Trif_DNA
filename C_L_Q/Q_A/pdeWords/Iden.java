package Q_A.pdeWords;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Iden {
    public String timetoPDW(String time) {
        String outime = "";
        //20230106-System.out.println(time);
        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == '0') {
                outime += "A";
            }
            if (time.charAt(i) == '1') {
                outime += "O";
            }
            if (time.charAt(i) == '2') {
                outime += "P";
            }
            if (time.charAt(i) == '3') {
                outime += "M";
            }
            if (time.charAt(i) == '4') {
                outime += "V";
            }
            if (time.charAt(i) == '5') {
                outime += "E";
            }
            if (time.charAt(i) == '6') {
                outime += "C";
            }
            if (time.charAt(i) == '7') {
                outime += "S";
            }
            if (time.charAt(i) == '8') {
                outime += "I";
            }
            if (time.charAt(i) == '9') {
                outime += "D";
            }
        }
        //20230106-System.out.println(outime);
        return outime;
    }

    public String PDWtoTime(String PDW) {
        String outime = "";
        //20230106-System.out.println(PDW);
        for (int i = 0; i < PDW.length(); i++) {
            if (PDW.charAt(i) == 'A') {
                outime += "0";
            }
            if (PDW.charAt(i) == 'O') {
                outime += "1";
            }
            if (PDW.charAt(i) == 'P') {
                outime += "2";
            }
            if (PDW.charAt(i) == 'M') {
                outime += "3";
            }
            if (PDW.charAt(i) == 'V') {
                outime += "4";
            }
            if (PDW.charAt(i) == 'E') {
                outime += "5";
            }
            if (PDW.charAt(i) == 'C') {
                outime += "6";
            }
            if (PDW.charAt(i) == 'S') {
                outime += "7";
            }
            if (PDW.charAt(i) == 'I') {
                outime += "8";
            }
            if (PDW.charAt(i) == 'D') {
                outime += "9";
            }
        }
        //20230106-System.out.println(outime);
        return outime;
    }

    public static void main(String[] argv) {
        String time = "" + System.currentTimeMillis();
        String PDW = new Iden().timetoPDW(time);
        new Iden().PDWtoTime(PDW);
    }
}
