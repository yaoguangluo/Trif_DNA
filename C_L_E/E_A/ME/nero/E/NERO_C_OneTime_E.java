package E_A.ME.nero.E;

import C_A.ME.nero.C.NERO_C_OneTime;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.SVQ.stable.S_Pos;

import java.util.Map;

//著作权人+作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class NERO_C_OneTime_E implements NERO_C_OneTime {

    public StringBuilder getBinaryForestRecurWords(StringBuilder outputWordNode
        , StringBuilder inputString, int charPosition, int inputLength
        , Map<Long, FMHMMNode> forestRoots, int forestDepth, int charPositionNext) {
        if (S_Pos.INT_THREE == forestDepth) {
            return outputWordNode;
        }
        FMHMMNode fFHMMNode = forestRoots.get(Long.valueOf(inputString.charAt(charPosition)));
        if (null == fFHMMNode) {
            return outputWordNode;
        }
        Map<String, Integer> outputList = fFHMMNode.getNext();
        if (null == outputList || charPositionNext >= inputLength) {
            return outputWordNode;
        }
        char positionOfi = inputString.charAt(charPositionNext);
        if (outputList.containsKey(String.valueOf(positionOfi))) {
            outputWordNode = getBinaryForestRecurWords(outputWordNode.append(positionOfi)
                , inputString, charPositionNext, inputLength, forestRoots, ++forestDepth
                , ++charPositionNext);
        }
        return outputWordNode;
    }

    //prepare for the big map collection in the future.
    public StringBuilder getBinaryForestsRecurWords(StringBuilder outputWordNode
        , String inputString, int charPosition, int inputLength
        , Map<Long, FMHMMNode>[] forestsRoots, int forestDepth, int charPositionNext) {
        if (S_Pos.INT_THREE == forestDepth) {
            return outputWordNode;
        }
        FMHMMNode fFHMMNode = getFMHMMNode(forestsRoots, inputString, charPosition);
        if (null == fFHMMNode) {
            return outputWordNode;
        }
        Map<String, Integer> outputList = fFHMMNode.getNext();
        if (null == outputList || charPositionNext >= inputLength) {
            return outputWordNode;
        }
        char positionOfi = inputString.charAt(charPositionNext);
        if (outputList.containsKey(String.valueOf(positionOfi))) {
            outputWordNode = getBinaryForestsRecurWords(outputWordNode.append(positionOfi)
                , inputString, charPositionNext, inputLength, forestsRoots
                , ++forestDepth, ++charPositionNext);
        }
        return outputWordNode;
    }

    private FMHMMNode getFMHMMNode(Map<Long, FMHMMNode>[] forestsRoots, String inputString
        , int charPosition) {
        for (Map<Long, FMHMMNode> forestsRoot : forestsRoots) {
            if (forestsRoot.containsKey(Long.valueOf(inputString.charAt(charPosition)))) {
                return forestsRoot.get(Long.valueOf(inputString.charAt(charPosition)));
            }
        }
        return null;
    }

    public StringBuilder getQuickForestRecurWord(StringBuilder outputWordNode
        , String inputString, int charPosition, int inputLength
        , int forestDepth, int charPositionNext, App NE) {
        if (S_Pos.INT_THREE == forestDepth || charPositionNext >= inputLength) {
            return outputWordNode;
        }
        char positionOfi = inputString.charAt(charPositionNext);
        if (NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn
            .containsKey(String.valueOf(outputWordNode.toString() + positionOfi))) {
            outputWordNode = getQuickForestRecurWord(outputWordNode.append(positionOfi)
                , inputString, charPositionNext, inputLength, ++forestDepth
                , ++charPositionNext, NE);
        }
        return outputWordNode;
    }
}
