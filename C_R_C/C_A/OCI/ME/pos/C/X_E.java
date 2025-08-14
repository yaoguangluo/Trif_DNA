package C_A.OCI.ME.pos.C;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ_SS;

import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）

 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）

 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public interface X_E extends X_O_parserFirst {
    void I_FixWordsOfTwo(int charPosition, StringBuilder inputString
        , StringBuilder[] fixWords);

    int loopCheckBackFix(StringBuilder[] fixWord, int backPosition
        , int countLength, List<String> outputList, String[] strings
        , int[] nestCountInputStringLength);

    void didNotFindFirstChar(List<String> outputList, String[] strings
        , StringBuilder[] fixWord);

    int loopCheckBackFixForMap(StringBuilder[] fixWord, int backPosition
        , int countLength, IMV_SIQ_SS outputList, String[] strings
        , int[] nestCountInputStringLength, App NE);

    void didNotFindFirstCharForMap(IMV_SIQ_SS outputList
        , String[] strings, StringBuilder[] fixWord, App NE);
}

