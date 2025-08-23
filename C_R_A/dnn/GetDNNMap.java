package dnn;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SIQ;
import exception.file.O.DetaBufferedReader;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
public class GetDNNMap {
    public URL getDNNMap() throws MalformedURLException {
        URL url = new URL("DNN20058.lyg");
        return url;
    }

    //这个函数用于dnn的全文索引进行txt读取
    @SuppressWarnings("static-access")
    public static Map<String, IMV_SIQ> doGetDNNMap(App_S app, App NE) {
        Map<String, IMV_SIQ> map = new IMV_SIQ();
        try {
            DetaBufferedReader bufferedWriter = FastReadProjectFile.getDetaBufferedReader(S_File.dnnFile
                , "DetaResources/dnnmap/", "UTF8");
//			DetaBufferedReader bufferedWriter= new DetaBufferedReader(DetaInputStreamReader.E
//					(new FileInputStream(file), "UTF8"));
            String line;
            String page = "";
            while ((line = bufferedWriter.readDetaLine()) != null) {
                if (line.contains("<>")) {
                    page = line.replace("<>", "");
                }
                if (line.contains("->")) {
                    String[] strings = line.split("->");
                    if (strings.length > 1) {//确定2行
                        String pageName = page.toString();
                        String wordName = strings[0].toString();
                        double wordDNN = Double.valueOf(strings[1].toString());
                        if (map.containsKey(pageName)) {
                            IMV_SIQ maps = map.get(pageName);
                            maps.put(wordName, wordDNN);
                            map.put(pageName, maps);
                        } else {
                            IMV_SIQ maps = new IMV_SIQ();
                            maps.put(wordName, wordDNN);
                            map.put(pageName, maps);
                        }
                    }
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            app.hook.hookFrequentException("getDNNMap出错", System.currentTimeMillis(), e);
        }
        NE.app_S.appConfig.SectionJPanel.jTextPane.setText("读取了" + map.size() + "行数据.");
        return map;
    }

    @SuppressWarnings("static-access")
    public static Map<String, IMV_SIQ> doGetDNNMap(App_S app
        , Map<String, IMV_SIQ> map, String dnnFile, App NE) {
        try {
            File file;//配置文件在同一个文件架夹下便于管理。
            file = new File(dnnFile);
            //肯定存在的。
//			DetaBufferedReader bufferedWriter= new DetaBufferedReader(DetaInputStreamReader.E
//					(new FileInputStream(file), "UTF8"));
            //shaohou 区别xls和 dnn两种格式
            DetaBufferedReader bufferedWriter = FastReadProjectFile.getDetaBufferedReader(S_File.dnnFile
                , "DetaResources/dnnmap/", "UTF8");
            String line;
            String page = "";
            while ((line = bufferedWriter.readDetaLine()) != null) {
                if (line.contains("<>")) {
                    page = line.replace("<>", "");
                }
                if (line.contains("->")) {
                    String[] strings = line.split("->");
                    if (strings.length > 1) {//确定2行
                        String pageName = page.toString();
                        String wordName = strings[0].toString();
                        double wordDNN = Double.valueOf(strings[1].toString());
                        if (map.containsKey(pageName)) {
                            IMV_SIQ maps = map.get(pageName);
                            maps.put(wordName, wordDNN);
                            map.put(pageName, maps);
                        } else {
                            IMV_SIQ maps = new IMV_SIQ();
                            maps.put(wordName, wordDNN);
                            map.put(pageName, maps);
                        }
                    }
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            app.hook.hookFrequentException("getDNNMap出错", System.currentTimeMillis(), e);
        }
        NE.app_S.appConfig.SectionJPanel.jTextPane.setText("读取了" + map.size() + "行数据.");
        return map;
    }
}