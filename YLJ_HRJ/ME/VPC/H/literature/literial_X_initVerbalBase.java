package ME.VPC.H.literature;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.pheromone.IMV_SIQ;

import java.io.InputStream;
import java.util.ArrayList;

//准备导入数据
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
//20211028
public class literial_X_initVerbalBase extends literial {
    public static void initVerbalBase() {
        if (null == literialVerbalBase) {
            literialVerbalBase = new ArrayList<>();
            InputStream in = new literial_X_initVerbalBase()
                .getClass().getResourceAsStream("BToW.lyg");
            DetaBufferedReader cReader = new DetaBufferedReader(DetaInputStreamReader.E(in));
            String ctempString = null;
            while ((ctempString = cReader.readDetaLine()) != null) {
                if (!ctempString.replace(" ", "").equals("")) {
                    literialVerbalBase.add(ctempString);
                }
            }
            cReader.closeDeta();
        }

        if (null == literialVerbalBaseMap) {
            literialVerbalBaseMap = new IMV_SIQ();
            InputStream in = new literial_X_initVerbalBase()
                .getClass().getResourceAsStream("WToB.lyg");
            DetaBufferedReader cReader = new DetaBufferedReader(DetaInputStreamReader.E(in));
            String ctempString = null;
            while ((ctempString = cReader.readDetaLine()) != null) {
                if (!ctempString.replace(" ", "").equals("")) {
                    if (ctempString.contains("/")) {
                        String[] strings = ctempString.split("/");
                        literialVerbalBaseMap.put(strings[0], strings[1]);
                    }
                }
            }
            cReader.closeDeta();
        }
    }
}
//速度一般, 精度一般}