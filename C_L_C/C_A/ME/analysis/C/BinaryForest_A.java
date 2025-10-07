package C_A.ME.analysis.C;

import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.pheromone.IMV_SQI;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public interface BinaryForest_A {
    void studyNewWord(String study, String token, String posStudy);
    IMV_SQI getStudyPos();
    IMV_SQI getCtK();
    IMV_SQI getCtG();
    IMV_SQI getCtS();
    IMV_SQI getPosEnToCn();
    IMV_SQI getPosEnToEn();
    IMV_SQI getPosCnToCn();
    IMV_SQI getEnToCn();
    IMV_SQI getCnToEn();
    IMV_SQI getFullEnToCn();
    IMV_SQI getFullCnToEn();
    SensingTest getSensingTest();
}
