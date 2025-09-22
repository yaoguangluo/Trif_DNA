package M_V.MVQ.label;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.pheromone.IMV_SIQ;
//import org.reportMap.ReportIndex;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

//设计 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaLabelConjunction {
    public static DetaLabelConjunction detaLabelConjunction;
    public Map<String, Boolean> checkSets = new IMV_SIQ();

    public void IV_() {
//        try {
//            InputStream inputStream = new ReportIndex().getClass()
//                    .getResourceAsStream("report.txt");
//            DetaBufferedReader cReader = new DetaBufferedReader(
//                    DetaInputStreamReader.E(inputStream));
//            String ctempString = null;
//            while (true) {
               // if (!((ctempString = cReader.readDetaLine()) != null)) break;
//                if (!ctempString.replace(" ", "").equals(""))
//                    if (!detaLabelConjunction.checkSets.containsKey(ctempString)) {
//                        detaLabelConjunction.checkSets.put(ctempString, true);
            //        }
      //      }
//            cReader.closeDeta();
//            inputStream.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void findAndSetTag(DetaLabel detaLabel, String name) {
        Iterator<String> iterator = detaLabelConjunction.checkSets.keySet().iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            String subString = name;
            subString = name.substring(0, 1);
            if (name.length() > 2) {
                subString = name.substring(0, 2);
            }
            if (name.length() > 5) {
                subString = name.substring(0, 5);
            }
            if (name.length() > 7) {
                subString = name.substring(0, 7);
            }
            if (name.length() > 8) {
                subString = name.substring(0, 8);
            }
            if (name.length() > 10) {//之后太长截的取中文的部分
                subString = name.substring(0, 7);
            }
            if (string.substring(5, 6 + subString.length())
                    .toUpperCase().contains(subString.toUpperCase())) {
                detaLabel.setTag(string, true);
            }
        }
    }
}
