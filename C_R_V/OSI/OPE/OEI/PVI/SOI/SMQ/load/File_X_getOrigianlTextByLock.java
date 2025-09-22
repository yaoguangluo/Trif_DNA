package OSI.OPE.OEI.PVI.SOI.SMQ.load;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class File_X_getOrigianlTextByLock {
    public static String _E(String inputString, String lockString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = lockString.length(); i < inputString.length()
            ; i += lockString.length() + 1) {
            stringBuilder.append(inputString.charAt(i));
        }
        return stringBuilder.toString();
    }
}
//		String[] lock= new String[12];
//		lock[0]= "A"; lock[3]= "O"; lock[6]= "P"; lock[9] = "M";
//		lock[1]= "V"; lock[4]= "E"; lock[7]= "C"; lock[10]= "S";
//		lock[2]= "I"; lock[5]= "D"; lock[8]= "U"; lock[11]= "Q";