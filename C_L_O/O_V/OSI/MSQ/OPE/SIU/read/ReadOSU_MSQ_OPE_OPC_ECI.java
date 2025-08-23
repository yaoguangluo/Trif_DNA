/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package O_V.OSI.MSQ.OPE.SIU.read;

import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.AE;
import E_A.ME.analysis.E.BinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import ME.VPC.M.app.App;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.SVQ.stable.S_Common;
import S_A.pheromone.IMV_SIQ;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
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
public class ReadOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {
    
    public int value = 0;
    public String filepath;
    public File[] fileList;
    public String addressString;
    public String searchString;
    public List<String[]> indexResult;
    public AE _A;
    public IMV_SIQ pos;
    public IMV_SIQ pose;
    public IMV_SIQ posec;
    public IMV_SIQ indexWords;

    public ReadOSU_MSQ_OPE_OPC_ECI() {
    }

    //later..
    public void run(final ReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ
        , EmotionMap_E emotionMap_E
        , NERO_C_OneTime_E nERO_C_OneTime_E
        , Nlp_CE_X_S nlp_CE_X_S, Pos_X_P pos_X_P, SensingTest sensingTest
        , FMHMMListOneTime_E fMHMMListOneTime_E
        , Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E, App NE) {
        _A = NE.app_S._A;
        //拿到中文数据
        pos = ((BinaryForest_AE) _A).getPosCnToCn();
        indexResult = new ArrayList<String[]>();
        //20230106-System.out.println("runed"+ value);
        //_SQ__OVQ_OSQ_VSQ.path= new String(filepath);
        //_SQ__OVQ_OSQ_VSQ.out= new JTable(content, spec);
        //20230106-System.out.println(addressString);
        //20230106-System.out.println(searchString);
        //loop category
        File category = new File(addressString);
        if (!category.isDirectory() || !category.exists()) {
            return;
        }
        String[] fileList = category.list();
        List<String> list = _A.parserMixedString(searchString);
        //list to map
        indexWords = new IMV_SIQ();
        for (String string : list) {
            indexWords.put(string, pos.containsKey(string) ? pos.get(string) : "未知");
        }
        indexFile(addressString, fileList);
        //20230106-System.out.println(fileList.length);
        _SQ__OVQ_OSQ_VSQ.indexResult = indexResult;
    }

    private void indexFile(String addressString, String[] fileList) {
        if (null == fileList) {
            return;
        }
        Here:
        for (String string : fileList) {
            File file = new File(addressString + "\\" + string);
            if (file.isDirectory()) {
                indexFile(file.getPath(), file.list());
                continue Here;
            }
            if (!string.contains(".txt")) {
                continue Here;
            }
            score(file);
        }
    }

    private void score(File file) {
        try {
            double rank = 0.0;
            double important = 0.0;
            String path = file.getAbsolutePath();
            //20230106-System.out.println(path);
            String[] result = new String[3];
            if (!file.exists()) {
                return;
            }
            DetaBufferedReader reader = new DetaBufferedReader(DetaFileReader.E(file));
            String tempString;
            while ((tempString = reader.readDetaLine()) != null) {
                List<String> list = _A.parserMixedString(tempString);
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    String value = iterator.next();
                    if (indexWords.containsKey(value)) {
                        if (indexWords.getString(value).contains("名")) {
                            rank += 6;
                            important += value.length();
                        } else if (indexWords.getString(value).contains("动")) {
                            rank += 5;
                            important += value.length();
                        } else if (indexWords.getString(value).contains("形")) {
                            rank += 4;
                            important += value.length();
                        } else if (indexWords.getString(value).contains("谓")) {
                            rank += 3;
                            important += value.length();
                        } else if (indexWords.getString(value).contains("副")) {
                            rank += 2;
                            important += value.length();
                        }
                        rank += 0.01;
                        important += 0.01;
                    }
                }
            }
            reader.close();
            result[0] = S_Common.STRING_EMPTY + rank;
            result[1] = S_Common.STRING_EMPTY + important;
            result[2] = path;
            indexResult.add(result);
        } catch (Exception e) {
            //e.printStackTrace();
        }
        //分词
        //一行一行匹配
        //统计次数。
        //排序。
    }
}
