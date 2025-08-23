package U_V.ESU.txt;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileInputStream;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

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

public class TXT_ESU_X_txtFileToObjectMatrixWithRange {
    public static Object[][] _E(String filePath
        , String stopBy, int rangeBegin, int rangeEnd) {
        Object[][] object = new Object[rangeEnd - rangeBegin][];
        InputStream inputStream = DetaFileInputStream.E(new File(filePath));
        DetaBufferedReader cReader = new DetaBufferedReader(
            new InputStreamReader(inputStream));
        String ctempString;
        int i = 0;
        while (null != (ctempString = cReader.readDetaLine())) {
            i++;
            if (i <= rangeEnd && i >= rangeBegin) {
                object[i++] = ctempString.split(stopBy);
            }
        }
        cReader.closeDeta();
        return object;
    }
}
