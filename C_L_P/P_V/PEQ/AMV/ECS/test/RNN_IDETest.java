/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package P_V.PEQ.AMV.ECS.test;

import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Common;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_String;
import S_A.pheromone.IMV_SIQ;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RNN_IDETest {
    private String text = S_String.text1;

    public static void main(String[] argv) {
        RNN_IDETest rNN_IDETest = new RNN_IDETest();
        // rNN_IDETest.getIDEMatrix();
    }

    public String[][] getIDEMatrix(String text, App NE) {
        this.text = text;
        return this.getIDEMatrix(NE);
    }

    public String[][] getIDEMatrix(App NE) {
        SensingTest sensingTest = NE.app_S.sensingTest;//no concurrent.
        String[][] sensingMatrix = sensingTest.getMatrix(this.text, NE);
        Map<String, List<Double>> map = new LinkedHashMap<>();
        for (int i = 0; i < sensingMatrix.length; i++) {
            List<Double> list = new LinkedList<>();
            list.add(1.0);
            map.put(sensingMatrix[i][0], list);
        }
        String[][] ideMatrix = new String[sensingMatrix.length][4];
        List<String> sets = sensingTest.getSets();
        IMV_SIQ pos = sensingTest.getPosCnToCn();
        Iterator<String> setsIterator = sets.iterator();
        double count = 1.0;
        //map position
        while (setsIterator.hasNext()) {
            String word = setsIterator.next();
            if (map.containsKey(word)) {
                List<Double> list = map.get(word);
                list.add(count);
                map.put(word, list);
            }
            count++;
        }
        //RNN LOOP position
        int ideMatrixCount = 0;
        Iterator<String> mapIterator = map.keySet().iterator();
        while (mapIterator.hasNext()) {
            String word = mapIterator.next();
            List<Double> list = map.get(word);
            double dovFactor = 1.0;
            double popFactor = 0.0;
            double eopFactor = 1.0;
            double dovCount = 1.0;
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    dovCount++;
                    dovFactor += list.get(j);
                }
                dovFactor += Math.abs(list.get(i) - dovFactor);
                eopFactor += (eopFactor + list.get(i)) / 2;
            }
            //pos normalization
            if (pos.containsKey(word)) {
                popFactor += S_Maps.dongCi.containsKey(word) ? 16 : 0;
                popFactor += S_Maps.mingCi.containsKey(word) ? 4 : 0;
                popFactor += S_Maps.xingRongCi.containsKey(word) ? 2 : 0;
            }
            ideMatrix[ideMatrixCount][0] = word;
            ideMatrix[ideMatrixCount][1] = "" + popFactor;
            ideMatrix[ideMatrixCount][2] = "" + dovFactor / dovCount;
            ideMatrix[ideMatrixCount][3] = "" + eopFactor;
            ideMatrixCount++;
        }
        return ideMatrix;
    }

    public String[][] getIDEMatrixExclude_A(String string, App NE) {
        SensingTest sensingTest = NE.app_S.sensingTest;//later in concurrent.
        String[][] sensingMatrix = sensingTest.getMatrix(string, NE);
        Map<String, List<Double>> map = new LinkedHashMap<>();
        for (int i = 0; i < sensingMatrix.length; i++) {
            List<Double> list = new LinkedList<>();
            list.add(1.0);
            map.put(sensingMatrix[i][0], list);
        }
        String[][] ideMatrix = new String[sensingMatrix.length][4];
        List<String> sets = sensingTest.getSets();
        IMV_SIQ pos = sensingTest.getPosCnToCn();
        Iterator<String> setsIterator = sets.iterator();
        double count = 1.0;
        //map position
        while (setsIterator.hasNext()) {
            String word = setsIterator.next();
            if (map.containsKey(word)) {
                List<Double> list = map.get(word);
                list.add(count);
                map.put(word, list);
            }
            count++;
        }
        //RNN LOOP position
        int ideMatrixCount = 0;
        Iterator<String> mapIterator = map.keySet().iterator();
        while (mapIterator.hasNext()) {
            String word = mapIterator.next();
            List<Double> list = map.get(word);
            double dovFactor = 1.0;
            double popFactor = 0.0;
            double eopFactor = 1.0;
            double dovCount = 1.0;
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    dovCount++;
                    dovFactor += list.get(j);
                }
                dovFactor += Math.abs(list.get(i) - dovFactor);
                eopFactor += (eopFactor + list.get(i)) / 2;
            }
            //pos normalization
            if (pos.containsKey(word)) {
                popFactor += S_Maps.dongCi.containsKey(word) ? 16 : 0;
                popFactor += S_Maps.mingCi.containsKey(word) ? 4 : 0;
                popFactor += S_Maps.xingRongCi.containsKey(word) ? 2 : 0;
            }

            ideMatrix[ideMatrixCount][0] = word;
            ideMatrix[ideMatrixCount][1] = "" + popFactor;
            ideMatrix[ideMatrixCount][2] = "" + dovFactor / dovCount;
            ideMatrix[ideMatrixCount][3] = "" + eopFactor;
            ideMatrixCount++;
        }
        return ideMatrix;
    }

    public String[][] getIDEMatrixExclude_A(String[][] ann, String string, App NE) {
        //敏感度 意识 sensing
        String[][] sensingMatrix = ann;
        Map<String, List<Double>> map = new LinkedHashMap<>();
        for (int i = 0; i < sensingMatrix.length; i++) {
            List<Double> list = new LinkedList<>();
            list.add(1.0);
            map.put(sensingMatrix[i][0], list);
        }
        String[][] ideMatrix = new String[sensingMatrix.length][4];
        List<String> sets = NE.app_S.sensingTest.getSets();//later check object oriented vars
        IMV_SIQ pos = NE.app_S.sensingTest.getPosCnToCn();
        Iterator<String> setsIterator = sets.iterator();
        double count = 1.0;
        //map position
        //开始计算图距离
        while (setsIterator.hasNext()) {
            String word = setsIterator.next();
            if (map.containsKey(word)) {
                List<Double> list = map.get(word);
                list.add(count);
                map.put(word, list);
            }
            count++;
        }
        //RNN LOOP position
        int ideMatrixCount = 0;
        Iterator<String> mapIterator = map.keySet().iterator();
        while (mapIterator.hasNext()) {
            String word = mapIterator.next();
            List<Double> list = map.get(word);
            double dovFactor = 1.0; //距离distance的距离 distance of same vebals
            double popFactor = 0.0; // 语义距离 part of speech
            double eopFactor = 1.0; // 位移距离 eclid of parts 我全部会注释 到处是猫腻
            double dovCount = 1.0; // 计数
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    dovCount++;
                    dovFactor += list.get(j);
                }
                dovFactor += Math.abs(list.get(i) - dovFactor); //平方和距离开方
                eopFactor += (eopFactor + list.get(i)) / 2;// 欧基里德用来计算熵增
            }
            //pos normalization
            if (pos.containsKey(word)) {
                popFactor += S_Maps.mingCi.containsKey(word) ? 16 : 0;
                popFactor += S_Maps.dongCi.containsKey(word) ? 5 : 0;
                popFactor += pos.getString(word).contains("医") ? 3 : 0;
                popFactor += S_Maps.weiCi.containsKey(word) ? 3 : 0;
                popFactor += S_Maps.xingRongCi.containsKey(word) ? 2 : 0;
            }
            ideMatrix[ideMatrixCount][0] = word;
            ideMatrix[ideMatrixCount][1] = S_Common.STRING_EMPTY + popFactor;
            ideMatrix[ideMatrixCount][2] = S_Common.STRING_EMPTY + dovFactor / dovCount;// 平均distance数
            ideMatrix[ideMatrixCount][3] = S_Common.STRING_EMPTY + eopFactor;
            ideMatrixCount++;
        }
        //这里再2018年 最老的版本我用的是system来进行print, 后来包装成函数我就注释掉了, 后来优化就删去了system 德打印函数,  罗瑶光20210420
        return ideMatrix;
    }
}
