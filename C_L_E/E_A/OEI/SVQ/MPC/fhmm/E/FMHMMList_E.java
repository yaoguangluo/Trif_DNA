package E_A.OEI.SVQ.MPC.fhmm.E;

import C_A.OCI.SVQ.MPC.fhmm.C.FMHMMList;
import E_A.ME.euclid.E.Euclid_CE;
import ME.VPC.M.app.App;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class FMHMMList_E implements FMHMMList {
    private Map<Long, FMHMMNode> linkedHashMap;
    private IMV_SIQ words;
    @SuppressWarnings(S_Pos.RAW_TYPES)
    private Map<Integer, Map> linkedHashMapRoot;

    @SuppressWarnings(S_Pos.RAW_TYPES)
    public Map<Integer, Map> getRoot() {
        return this.linkedHashMapRoot;
    }

    public void index() {
        words = new IMV_SIQ();
        linkedHashMap = new IMV_SIQ();
        linkedHashMapRoot = new IMV_SIQ();
        InputStream inputStream = getClass().getResourceAsStream(
            S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_CN);
        DetaBufferedReader cReader = new DetaBufferedReader(DetaInputStreamReader.E(
            inputStream, S_Pos.UTF8_STRING));
        String cInputString;
        while ((cInputString = cReader.readDetaLine()) != null) {
            if (!(!cInputString.replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING)
                .equals(S_Pos.EMPTY_STRING) && cInputString.split(S_Pos.NLP_SYMBO_SLASH)
                .length > S_Pos.INT_ONE)) {
                continue;
            }
            words.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            linkedHashMap = loopLoadForest(cInputString);
        }
        cReader.closeDeta();
        linkedHashMapRoot = new Euclid_CE().mCogsEuclid(linkedHashMap);
    }

    public Map<Long, FMHMMNode> loopLoadForest(String cInputString) {
        Here:
        for (int i = S_Pos.INT_ZERO; i < cInputString.length(); i++) {
            if (linkedHashMap.containsKey(Long.valueOf(cInputString.charAt(i)))) {
                FMHMMNode fHHMMNode = linkedHashMap.get(Long.valueOf(cInputString.charAt(i)));
                linkedHashMap = doNeroPostCognitive(fHHMMNode, cInputString, i);
                continue Here;
            } else {
                FMHMMNode fHHMMNode = new FMHMMNode();
                fHHMMNode.I_Vb(S_Pos.EMPTY_STRING + cInputString.charAt(i));
                if (i + S_Pos.INT_ONE < cInputString.length()) {
                    Map<String, Integer> next = new IMV_SIQ();
                    next.put(S_Pos.EMPTY_STRING + cInputString.charAt(i
                        + S_Pos.INT_ONE), S_Pos.INT_ONE);
                    fHHMMNode.I_Next(next);
                }
                linkedHashMap.put(Long.valueOf(cInputString.charAt(i)), fHHMMNode);
            }
        }
        return linkedHashMap;
    }

    public Map<Long, FMHMMNode> doNeroPostCognitive(FMHMMNode fFHMMNode
        , String cInputString, int i) {
        if (fFHMMNode.getNext() != null) {
            if (i + S_Pos.INT_ONE < cInputString.length()) {
                linkedHashMap = doCheckAndRunNeroPostFix(fFHMMNode, cInputString, i);
            }
        } else {
            ConcurrentHashMap<String, Integer> concurrentHashMap = new IMV_SIQ();
            if (i + S_Pos.INT_ONE < cInputString.length()) {
                concurrentHashMap.put(S_Pos.EMPTY_STRING + cInputString.charAt(i
                    + S_Pos.INT_ONE), S_Pos.INT_ONE);
            }
            fFHMMNode.I_Next(concurrentHashMap);
            linkedHashMap.put(Long.valueOf(cInputString.charAt(i)), fFHMMNode);
        }
        return linkedHashMap;
    }

    public Map<Long, FMHMMNode> doCheckAndRunNeroPostFix(FMHMMNode fFHMMNode
        , String cInputString, int i) {
        if (!fFHMMNode.getNext().containsKey(S_Pos.EMPTY_STRING + cInputString.charAt(i
            + S_Pos.INT_ONE))) {
            Map<String, Integer> map = fFHMMNode.getNext();
            map.put(S_Pos.EMPTY_STRING + cInputString.charAt(i + S_Pos.INT_ONE)
                , S_Pos.INT_ONE);
            fFHMMNode.I_Next(map);
            linkedHashMap.put(Long.valueOf(cInputString.charAt(i)), fFHMMNode);
        }
        return linkedHashMap;
    }

    public IMV_SIQ getWords() {
        return this.words;
    }

    public Map<Long, FMHMMNode> getMap() {
        return this.linkedHashMap;
    }

    public IMV_SIQ getPosEnToEn() {
        return null;
    }

    public IMV_SIQ getEnToCn() {
        return null;
    }

    public IMV_SIQ getCnToEn() {
        return null;
    }

    public void indexEnToCn() {
    }

    public void indexCnToEn() {
    }

    public IMV_SIQ getPosEnToCn() {
        return null;
    }

    public IMV_SIQ getPosCnToCn() {
        return null;
    }

    public void indexPosEnToCn() {
    }

    public void indexPosEnToEn() {
    }

    public void indexFullEnToCn() {
    }

    public void indexFullCnToEn() {
    }

    public IMV_SIQ getFullEnToCn() {
        return null;
    }

    public IMV_SIQ getFullCnToEn() {
        return null;
    }
//later trif eclipse 转 ideaj出现的问题
    @Override
    public void indexPosEnToCn(App NE) {

    }

    @Override
    public void indexFn(App NE) {

    }

    @Override
    public void indexKo(App NE) {

    }

    @Override
    public void indexJp(App NE) {

    }

    @Override
    public void indexGm(App NE) {

    }

    @Override
    public void indexSp(App NE) {

    }

    @Override
    public void indexAb(App NE) {

    }

    @Override
    public void indexRs(App NE) {

    }

    @Override
    public void indexPy(App NE) {

    }

    @Override
    public void indexTt(App NE) {

    }

    @Override
    public void indexPosEnToEn(App NE) {

    }

    @Override
    public void indexEnToCn(App NE) {

    }

    @Override
    public void indexCnToEn(App NE) {

    }

    @Override
    public List<String> englishStringToWordsList(String string) {
        return null;
    }

    @Override
    public void indexFullCnToJp() {
    }

    @Override
    public void indexFullCnToRs() {
    }

    @Override
    public void indexFullCnToAb() {
    }

    @Override
    public void indexFullCnToFn() {

    }

    @Override
    public void indexFullCnToGm() {

    }

    @Override
    public void indexFullCnToKo() {

    }

    @Override
    public void indexFullCnToSp() {

    }

    @Override
    public void indexFullCnToPy() {

    }

    @Override
    public IMV_SIQ getFullCnToJp() {
        return null;
    }

    @Override
    public IMV_SIQ getFullCnToRs() {
        return null;
    }

    @Override
    public IMV_SIQ getFullCnToAb() {
        return null;
    }

    @Override
    public IMV_SIQ getFullCnToFn() {
        return null;
    }

    @Override
    public IMV_SIQ getFullCnToGm() {
        return null;
    }

    @Override
    public IMV_SIQ getFullCnToKo() {
        return null;
    }

    @Override
    public IMV_SIQ getFullCnToSp() {
        return null;
    }

    @Override
    public IMV_SIQ getFullCnToPy() {
        return null;
    }

    @Override
    public Map<Long, FMHMMNode>[] getMaps() {
        return null;
    }

    @Override
    public Map<Long, IMV_SIQ> getWordsForests() {
        return null;
    }

    @Override
    public void studyNewPos(String string, String posStudy) {
    }

    @Override
    public IMV_SIQ getStudyPos() {
        return null;
    }

    @Override
    public IMV_SIQ getFullCnToTt() {
        return null;
    }

    @Override
    public void indexFullNegative() {

    }

    @Override
    public void indexFullPositive() {

    }

    @Override
    public IMV_SIQ getFullNegative() {
        return null;
    }

    @Override
    public IMV_SIQ getFullPositive() {
        return null;
    }

    @Override
    public void indexFullCnToTt() {

    }
}
