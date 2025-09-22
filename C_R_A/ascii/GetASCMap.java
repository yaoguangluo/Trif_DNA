package ascii;
import ME.VPC.S.ne.App_S;
import ME.VPC.M.app.App;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
//20220701-20220702
public class GetASCMap {
    //这个函数用于dnn的全文索引进行txt读取
    public Map<String, int[][]> doGetASCMap(App_S app, Map<String
        , int[][]> map, String ascFile, App NE) {
        try {
            File file;//配置文件在同一个文件架夹下便于管理。
            file = new File(ascFile);
            //肯定存在的。
            DetaBufferedReader bufferedWriter = new DetaBufferedReader(DetaInputStreamReader.E
                (new FileInputStream(file), "UTF8"));
            String line;
            String page = null;
            //String[] pageSection;
            List<Integer> trcArray0 = new ArrayList<>();
            List<Integer> trcArray1 = new ArrayList<>();
            int[][] trc = null;
            while ((line = bufferedWriter.readDetaLine()) != null) {
                if (line.contains("<>")) {
                    if (null != page) {
                        //trcarray to trc
                        trc = new int[2][trcArray0.size()];
                        Iterator<Integer> iterator0 = trcArray0.iterator();
                        int i0 = 0;
                        while (iterator0.hasNext()) {
                            trc[0][i0++] = iterator0.next();
                        }
                        Iterator<Integer> iterator1 = trcArray1.iterator();
                        int i1 = 0;
                        while (iterator1.hasNext()) {
                            trc[1][i1++] = iterator1.next();
                        }
                        map.put(page, trc);
                    }
                    page = line.replace("<>", ""); //"t_r_c_pl_al"
                    //pageSection= page.split("_"); //"t_r_c_pl_al"
                    trcArray0.clear();
                    trcArray1.clear();
                    //trc= new int[2][Integer.valueOf(pageSection[3])];
                }
                if (line.contains("_p")) {
                    String[] strings = line.split("_p");
                    if (strings.length > 0) {//确定2行
                        trcArray0.add(Integer.valueOf(strings[0]));
                        //trc[0][pc++]= Integer.valueOf(strings[0]);
                    }
                }
                if (line.contains("_a")) {
                    String[] strings = line.split("_a");
                    if (strings.length > 0) {//确定2行
                        trcArray1.add(Integer.valueOf(strings[0]));
                        //trc[1][ac++]= Integer.valueOf(strings[0]);
                    }
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            app.hook.hookFrequentException("getASCMap出错", System.currentTimeMillis(), e);
        }
        NE.app_S.appConfig.SectionJPanel.jTextPane.setText("读取了" + map.size() + "行数据.");
        return map;
    }
}