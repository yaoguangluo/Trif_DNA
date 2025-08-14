package E_A.ME.analysis.E;

import C_A.ME.analysis.C.AC;
import S_A.SVQ.stable.S_Pos;

import java.util.Iterator;
import java.util.LinkedList;
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
public class AE extends AE_M implements AC {
    public List<String> parserMixedString(String inputString) {
        mixedString = new StringBuilder(inputString);
        return parserMixedString(mixedString);
    }
    public List<String> parserMixedString(StringBuilder inputString) {
        mixedString = new StringBuilder(inputString);
        mixedString.append(S_Pos.SPACE_STRING_DISTINCTION);
        inputLength = mixedString.length();
        outputList = new LinkedList<>();
        forestDepth = S_Pos.INT_ZERO;
        fixWords = new StringBuilder[S_Pos.INT_TWO];
        fixWords[S_Pos.INT_ZERO] = new StringBuilder();
        fixWords[S_Pos.INT_ONE] = new StringBuilder();
        stringBuilder = new StringBuilder();
        find = S_Pos.INT_ZERO;
        Here:
        for (charPosition = S_Pos.INT_ZERO; charPosition < inputLength
            ; charPosition += (countLength != S_Pos.INT_ZERO ? countLength: S_Pos.INT_ONE)) {
            if (charPosition < inputLength - S_Pos.INT_ONE
                && mixedString.charAt(charPosition) < S_Pos.INT_TEN_SOUTHANDS) {
                if (find == S_Pos.INT_ZERO) {
                    fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWords[S_Pos.INT_ZERO].length());
                }
                fixWords[S_Pos.INT_ZERO].append(mixedString.charAt(charPosition));
                countLength = S_Pos.INT_ONE;
                find = S_Pos.INT_ONE;
                continue Here;
            }
            if (S_Pos.INT_ONE == find) {
                if (S_Pos.INT_ONE == find) {
                    find = S_Pos.INT_ZERO;
                    Iterator<String> it = fHMMList.englishStringToWordsList(
                            fixWords[S_Pos.INT_ZERO].toString()).iterator();
                    StringBuilder number = new StringBuilder();
                    while (it.hasNext()) {
                        String temp = it.next();
                        if (S_Pos.NUMBERS.contains(temp)) {
                            number.append(temp);
                        } else {
                            if (number.length() > 0) {
                                outputList.add(number.toString());
                                number.delete(0, number.length());
                            }
                            outputList.add(temp);
                        }
                    }
                    if (number.length() > 0) {
                        outputList.add(number.toString());
                        number.delete(0, number.length());
                    }
                    fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO
                            , fixWords[S_Pos.INT_ZERO].length());
                }
            }
            stringBuilder.delete(S_Pos.INT_ZERO, stringBuilder.length());
            stringBuilder.append(mixedString.charAt(charPosition));
            stringBuilder = nero_C.getBinaryForestRecurWords(stringBuilder
                , mixedString, charPosition, inputLength, forestRoots, forestDepth
                , charPosition + S_Pos.INT_ONE);
            String countWordNode = stringBuilder.toString();
            int compare = countLength = countWordNode.length();
            if (S_Pos.INT_ONE == compare) {
                outputList.add(countWordNode);
                fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWords[S_Pos.INT_ZERO].length());
                fixWords[S_Pos.INT_ZERO].append(countWordNode);
                continue Here;
            }
            if (S_Pos.INT_TWO == compare) {
                countLength = nlp_C.forTwoChar(countLength, outputList, stringBuilder
                    , fixWords, charPosition, mixedString);
                continue Here;
            }
            if (S_Pos.INT_THREE == compare) {
                I_FixWords(charPosition, mixedString, fixWords);
                countLength = nlp_C.ofThree(countLength, outputList, stringBuilder
                    , fixWords, charPosition, mixedString);
                continue Here;
            }
            if (S_Pos.INT_FOUR == compare) {
                I_FixWords(charPosition, mixedString, fixWords);
                countLength = nlp_C._E(countLength, outputList, stringBuilder, fixWords
                    , charPosition, mixedString);
            }
        }
        return outputList;
    }
}
//24
//if(null==mixedString){
//        mixedString = inputString;
//    }else{
//        mixedString.delete(0, mixedString.length());
//        mixedString.append(inputString);
//    }
//        mixedString.append(S_Pos.SPACE_STRING_DISTINCTION);
//    inputLength = mixedString.length();
//        if(null==outputList){
//        outputList = new LinkedList<>();
//    }else{
//        outputList.clear();
//    }
//    forestDepth = S_Pos.INT_ZERO;
//        if(null== fixWords){
//        fixWords = new StringBuilder[S_Pos.INT_TWO];
//        fixWords[S_Pos.INT_ZERO] = new StringBuilder();
//        fixWords[S_Pos.INT_ONE] = new StringBuilder();
//    }else{
//        fixWords[S_Pos.INT_ZERO].delete(0, fixWords[S_Pos.INT_ZERO].length());
//        fixWords[S_Pos.INT_ONE].delete(0, fixWords[S_Pos.INT_ONE].length());
//    }
//        if(null== stringBuilder){
//        stringBuilder = new StringBuilder();
//    }else{
//        stringBuilder.delete(0, stringBuilder.length());
//    }