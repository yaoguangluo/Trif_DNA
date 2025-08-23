package C_A.OCI.SVQ.MPC.fhmm.C;
//词汇翻译系统

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.nlp.StopSymbol_UTF8;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public interface FHMMList {
    public List<String> englishStringToWordsList(String string);

    public Map<Long, FMHMMNode> getMap();

    public Map<Long, FMHMMNode>[] getMaps();

    //稍后translator的index 去重 统一用index mixed
    public void index();

    public void indexFullEnToCn();

    public void indexFullCnToEn();

    public void indexFullCnToFn();

    public void indexFullCnToKo();

    public void indexFullCnToJp();

    public void indexFullCnToGm();

    public void indexFullCnToSp();

    public void indexFullCnToRs();

    public void indexFullCnToAb();

    public void indexFullCnToPy();

    public void indexFullCnToTt();

    public IMV_SIQ getFullEnToCn();

    public IMV_SIQ getFullCnToEn();

    public void indexPosEnToCn(App NE);

    public void indexFn(App NE);

    public void indexKo(App NE);

    public void indexJp(App NE);

    public void indexGm(App NE);

    public void indexSp(App NE);

    public void indexAb(App NE);

    public void indexRs(App NE);

    public void indexPy(App NE);

    public void indexTt(App NE);

    public void indexPosEnToEn(App NE);

    public void indexEnToCn(App NE);

    public void indexCnToEn(App NE);

    public Map<Long, FMHMMNode> loopLoadForest(String cInputString);

    public Map<Long, FMHMMNode> doNeroPostCognitive(FMHMMNode fFHMMNode, String cInputString, int i);

    public Map<Long, FMHMMNode> doCheckAndRunNeroPostFix(FMHMMNode fFHMMNode, String cInputString, int i);

    public IMV_SIQ getPosCnToCn();

    public IMV_SIQ getEnToCn();

    public IMV_SIQ getCnToEn();

    public IMV_SIQ getPosEnToCn();

    public IMV_SIQ getPosEnToEn();

    public IMV_SIQ getFullCnToJp();

    public IMV_SIQ getFullCnToRs();

    public IMV_SIQ getFullCnToAb();

    public IMV_SIQ getFullCnToFn();

    public IMV_SIQ getFullCnToGm();

    public IMV_SIQ getFullCnToKo();

    public IMV_SIQ getFullCnToSp();

    public IMV_SIQ getFullCnToPy();

    public IMV_SIQ getFullCnToTt();

    public void indexFullNegative();

    public void indexFullPositive();

    public IMV_SIQ getFullNegative();

    public IMV_SIQ getFullPositive();

    public Map<Long, IMV_SIQ> getWordsForests();

    public void studyNewPos(String string, String posStudy);

    public IMV_SIQ getStudyPos();
}
