package E_A.ME.nero.E;

import C_A.ME.nero.C.NERO_C;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.SVQ.stable.S_Pos;

import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class NERO_CE implements NERO_C {
    @SuppressWarnings({S_Pos.RAW_TYPES, S_Pos.UNCHECKED})
    public StringBuilder getBinaryForestRecurWord(StringBuilder outputWordNode
        , String inputString, int charPosition, int inputLength
        , Map<Integer, Map> forestRoots, int forestDepth, int charPositionNext) {
        if (S_Pos.INT_THREE == forestDepth) {
            return outputWordNode;
        }
        char charAtPosition = inputString.charAt(charPosition);
        int rangeHigh = charAtPosition >> S_Pos.INT_TEN;
        Map<Integer, Map> trees = forestRoots.get(rangeHigh);
        if (null == trees) {
            return outputWordNode;
        }
        int range = charAtPosition >> S_Pos.INT_SIX;
        if (!trees.containsKey(range)) {
            return outputWordNode;
        }
        Map<Long, FMHMMNode> maps = trees.get(range);
        FMHMMNode fFHMMNode = maps.get(Long.valueOf(charAtPosition));
        if (null == fFHMMNode) {
            return outputWordNode;
        }
        Map<String, Integer> outputList = fFHMMNode.getNext();
        if (null == outputList || charPositionNext >= inputLength) {
            return outputWordNode;
        }
        char positionOfi = inputString.charAt(charPositionNext);
        if (outputList.containsKey(String.valueOf(positionOfi))) {
            outputWordNode = getBinaryForestRecurWord(outputWordNode.append(positionOfi)
                , inputString, charPositionNext, inputLength, forestRoots
                , forestDepth + S_Pos.INT_ONE, ++charPositionNext);
        }
        return outputWordNode;
    }
}
