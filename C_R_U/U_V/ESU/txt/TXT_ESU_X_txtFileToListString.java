package U_V.ESU.txt;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileInputStream;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class TXT_ESU_X_txtFileToListString {
    public static List<String> _E(String filePath) {
        List<String> list = new ArrayList<>();
        InputStream inputStream = DetaFileInputStream.E(new File(filePath));
        DetaBufferedReader cReader = new DetaBufferedReader(
            new InputStreamReader(inputStream));
        String ctempString;
        while (null != (ctempString = cReader.readDetaLine())) {
            list.add(ctempString);
        }
        cReader.closeDeta();
        return list;
    }
}
