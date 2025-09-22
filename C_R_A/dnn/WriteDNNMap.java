package dnn;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
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
//20220701
//20220702 新增一个总分写表
public class WriteDNNMap {
    //这个函数用于dnn的全文索引进行txt记录
    public static void doWriteDNNMap(String stringPath, App app) {
        Map<String, IMV_SIQ> map = app.app_S.DNNmap;
        try {
            File file = new File(stringPath);
            file.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream(file), "UTF8"));
            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                String temp = iterator.next();
                //添加数据名
                bufferedWriter.write(temp + "<>");
                bufferedWriter.write("\r\n");
                bufferedWriter.flush();
                Map<String, Double> maps = map.get(temp);
                Iterator<String> iterators = maps.keySet().iterator();
                //添加数据实体
                double 总分 = 0.0;
                while (iterators.hasNext()) {
                    String string = iterators.next();
                    double tempDouble = Double.valueOf(maps.get(string));
                    总分 += tempDouble;
                    bufferedWriter.write(string + "->" + tempDouble);
                    bufferedWriter.write("\r\n");
                }
                //DNN添加总分
                bufferedWriter.write("总分" + "->" + 总分);
                bufferedWriter.write("\r\n");
            }
            bufferedWriter.write("\r\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            app.app_S.hook.hookFrequentException("WriteDNNMap出错", System.currentTimeMillis(), e);
        }
    }

    public static void doWriteDNNMap(String stringPath, App app
        , Map<String, IMV_SIQ> subDNNmap) {
        Map<String, IMV_SIQ> map = subDNNmap;
        try {
            File file = new File(stringPath);
            file.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream(file), "UTF8"));
            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                String temp = iterator.next();
                //添加数据名
                bufferedWriter.write(temp + "<>");
                bufferedWriter.write("\r\n");
                bufferedWriter.flush();
                Map<String, Double> maps = map.get(temp);
                Iterator<String> iterators = maps.keySet().iterator();
                //添加数据实体
                double 总分 = 0.0;
                while (iterators.hasNext()) {
                    String string = iterators.next();
                    double tempDouble = Double.valueOf(maps.get(string));
                    总分 += tempDouble;
                    bufferedWriter.write(string + "->" + tempDouble);
                    bufferedWriter.write("\r\n");
                }
                //DNN添加总分
                bufferedWriter.write("总分" + "->" + 总分);
                bufferedWriter.write("\r\n");
            }
            bufferedWriter.write("\r\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            app.app_S.hook.hookFrequentException("WriteDNNMap出错", System.currentTimeMillis(), e);
        }
    }
}
