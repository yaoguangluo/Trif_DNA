package S_A.SixActionMap;

import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//1 6元SDLC
//2 sdlc obss
//3 obss normalization
//4 normalizational format
//5 format map
//6 map parser
//7 parser in PDE model
//8 model in time norms
//全部基于罗瑶光著作权基础堆积即可。
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -(- -2018年1月后从未使用，小心网墙欺诈)-
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class WorkVerbaMap {
    public IMV_SIQ unknown_map;
    public String doName;
    public String subjectName;
    public String objectName;
    public String humanTalk;
    public IMV_SIQ_SS _IMV_SIQ_SS;
    public IMV_SIQ_S_ _IMV_SIQ_S_;
    public List<String> _IMV_SIQ_SS_ = new ArrayList<>();
    public IMV_SIQ fixMap;
    public IMV_SIQ doMap;
    public IMV_SIQ objectMap;
    public IMV_SIQ babeiMap;
    public IMV_SIQ verbMap;
    public IMV_SIQ data2DSubjectMap;
    public IMV_SIQ positionMap;
    public IMV_SIQ nounInText;
    public IMV_SIQ verbInText;
    public IMV_SIQ cartesianWorkActions_pos;
    public IMV_SIQ cartesianWorkActionsRights;
    public IMV_SIQ cartesianWorkActionsPositions;
    public IMV_SIQ normalizationalWorkActionsRights;
    public IMV_SIQ normalizationalWorkActionsPositions;
    public IMV_SIQ ActionsObject;
    public IMV_SIQ nounInTextFull;//later
    public IMV_SIQ verbInTextFull;//later
    public IMV_SIQ cartesianWorkActionsFull;//later

    public LinkedList<String> shortString = new LinkedList<>();
    public int[] actionsPositionV;
    public String[] actionsPosition;
    public int[] actionsDistanceV;
    public String[] actionsDistance;
    public int i = 0;

    //一些逻辑不应该出现在电脑上，只能文字出现在书本上。就因为电脑内置蓝牙wifi声卡接口，我就不爽。
    public boolean findSubject(App NE) {
        subjectName = null;
        doName = null;
        objectName = null;
        objectMap.clear();
        verbMap.clear();
        babeiMap.clear();
        nounInText.clear();//small calculus , later do full
        verbInText.clear();
        Iterator<String> iterator = _IMV_SIQ_SS.keySet().iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (data2DSubjectMap.containsKey(string)) {
                objectMap.put(string, i++);
            }
            if (doMap.containsKey(string)) {
                doName += string;
                verbMap.put(string, i++);
            }
            if (fixMap.containsKey(string)) {
                babeiMap.put(string, i++);
            }
            //pos load
            WordFrequency wordFrequency = _IMV_SIQ_SS.getW(string);
            //if (wordFrequency.get_pos().contains("名")) {
            //一切数据首先都应该名词化*/
            nounInText.put(string, wordFrequency);
            //}
            //动 pca map替换成cartsian map先 因为英语会出现had had 有且仅有这类语法。
            //if (wordFrequency.get_pos().contains("动")) {
            verbInText.put(string, wordFrequency);
            //}
            System.out.println(wordFrequency.positions);
        }
        //small talk calculus
        //m 一旦笛卡尔，单字组合就没有用了，仅仅依赖分词即可。
        Iterator<String> iteratorNounM = nounInText.keySet().iterator();
        NextNounM:
        while (iteratorNounM.hasNext()) {
            String stringNounM = iteratorNounM.next();
            if (stringNounM.isEmpty()) {
                continue NextNounM;
            }
            WordFrequency wordFrequencyNounM = _IMV_SIQ_SS.getW(stringNounM);
            int averagePositionNounM = wordFrequencyNounM.getAveragePosition();
            Iterator<String> iteratorNounN = nounInText.keySet().iterator();
            NextNounN:
            while (iteratorNounN.hasNext()) {
                String stringNounN = iteratorNounN.next();
                if (stringNounN.isEmpty()) {
                    continue NextNounN;
                }
                WordFrequency wordFrequencyNounN = _IMV_SIQ_SS.getW(stringNounN);
                int averagePositionNounN = wordFrequencyNounN.getAveragePosition();
                if (stringNounM.equalsIgnoreCase(stringNounN)) {
                    continue NextNounN;
                }
                if (!wordFrequencyNounM.get_pos().equals(wordFrequencyNounN.get_pos())) {
                    //因为笛卡尔交集，所以需要用pos map来识别。
                    continue NextNounN;
                }
                //noun-verb
                String rootM = stringNounM + stringNounN;
                String rootN = stringNounN + stringNounM;
                int rightM = Math.abs(averagePositionNounM - averagePositionNounN);
                int positionM = (averagePositionNounM + averagePositionNounN) >> 1;
                if (2 > rightM && rootM.length() < 3) {
                    nounInText.remove(stringNounM);
                    nounInText.remove(stringNounN);
                    nounInText.put(rootM, positionM);
                    nounInText.put(rootN, positionM);
                    WordFrequency wordFrequency = new WordFrequency(1.0, rootM);
                    wordFrequency.positions.add(positionM);
                    wordFrequency.I_pos("名词");
                    _IMV_SIQ_SS.put(rootM, wordFrequency);
                    _IMV_SIQ_SS.put(rootN, wordFrequency);
                }
            }
        }
        //d
        Iterator<String> iteratorVerbM = verbInText.keySet().iterator();
        NextVerbM:
        while (iteratorVerbM.hasNext()) {
            String stringVerbM = iteratorVerbM.next();
            if (stringVerbM.isEmpty()) {
                continue NextVerbM;
            }
            WordFrequency wordFrequencyVerbM = _IMV_SIQ_SS.getW(stringVerbM);
            int averagePositionVerbM = wordFrequencyVerbM.getAveragePosition();
            Iterator<String> iteratorVerbN = verbInText.keySet().iterator();
            NextVerbN:
            while (iteratorVerbN.hasNext()) {
                String stringVerbN = iteratorVerbN.next();
                if (stringVerbN.isEmpty()) {
                    continue NextVerbN;
                }
                WordFrequency wordFrequencyVerbN = _IMV_SIQ_SS.getW(stringVerbN);
                int averagePositionVerbN = wordFrequencyVerbN.getAveragePosition();
                if (stringVerbN.equalsIgnoreCase(stringVerbN)) {
                    continue NextVerbN;
                }
                if (!wordFrequencyVerbM.get_pos().equals(wordFrequencyVerbN.get_pos())) {
                    //因为笛卡尔交集，所以需要用pos map来识别。
                    continue NextVerbN;
                }
                //noun-verb
                String rootN = stringVerbM + stringVerbN;
                String rootM = stringVerbN + stringVerbM;
                int rightN = Math.abs(averagePositionVerbM - averagePositionVerbN);
                int positionN = (averagePositionVerbM + averagePositionVerbN) >> 1;
                if (2 > rightN && rootN.length() < 3) {
                    verbInText.remove(stringVerbM);
                    verbInText.remove(stringVerbN);
                    verbInText.put(rootN, positionN);
                    verbInText.put(rootM, positionN);
                    WordFrequency wordFrequency = new WordFrequency(1.0, rootN);
                    wordFrequency.positions.add(positionN);
                    wordFrequency.I_pos("动词");
                    _IMV_SIQ_SS.put(rootN, wordFrequency);
                    _IMV_SIQ_SS.put(rootM, wordFrequency);
                }
            }
        }
        //md
        Iterator<String> iteratorNounMd = nounInText.keySet().iterator();
        NextNounMd:
        while (iteratorNounMd.hasNext()) {
            String stringNounMd = iteratorNounMd.next();
            if (stringNounMd.isEmpty()) {
                continue NextNounMd;
            }
            WordFrequency wordFrequencyNounMd = _IMV_SIQ_SS.getW(stringNounMd);
            int averagePositionNounMd = wordFrequencyNounMd.getAveragePosition();

            Iterator<String> iteratorVerbNd = verbInText.keySet().iterator();
            NextVerbNd:
            while (iteratorVerbNd.hasNext()) {
                String stringVerbNd = iteratorVerbNd.next();
                if (stringVerbNd.isEmpty()) {
                    continue NextVerbNd;
                }
                WordFrequency wordFrequencyVerbNd = _IMV_SIQ_SS.getW(stringVerbNd);
                int averagePositionVerbNd = wordFrequencyVerbNd.getAveragePosition();
                if (stringNounMd.equalsIgnoreCase(stringVerbNd)) {
                    continue NextVerbNd;
                }
                if (!
                    (
                        (
                            wordFrequencyNounMd.get_pos().contains("动")
                                || wordFrequencyNounMd.get_pos().contains("名")
                        ) && (
                            wordFrequencyNounMd.get_pos().contains("动")
                                || wordFrequencyNounMd.get_pos().contains("名")
                        )
                    )
                ) {
                    //因为笛卡尔交集，所以需要用pos map来识别。
                    continue NextVerbNd;
                }
                //noun-verb
                String rootNd = stringNounMd + stringVerbNd;
                String rootMd = stringVerbNd + stringNounMd;
                int rightNd = Math.abs(averagePositionNounMd - averagePositionVerbNd);
                int positionNd = (averagePositionNounMd + averagePositionVerbNd) >> 1;
                if (2 > rightNd && rootNd.length() < 3) {
                    nounInText.remove(stringNounMd);
                    verbInText.remove(stringVerbNd);
                    verbInText.put(rootNd, positionNd);
                    verbInText.put(rootMd, positionNd);
                    WordFrequency wordFrequency = new WordFrequency(1.0, rootNd);
                    wordFrequency.positions.add(positionNd);
                    wordFrequency.I_pos("动词名词");
                    _IMV_SIQ_SS.put(rootNd, wordFrequency);
                    _IMV_SIQ_SS.put(rootMd, wordFrequency);
                }
            }
        }
        //init cartesianActions
        Iterator<String> iteratorNoun = nounInText.keySet().iterator();
        NextNoun:
        while (iteratorNoun.hasNext()) {
            String stringNoun = iteratorNoun.next();
            if (stringNoun.isEmpty()) {
                continue NextNoun;
            }
            WordFrequency wordFrequencyNoun = _IMV_SIQ_SS.getW(stringNoun);
            int averagePositionNoun = wordFrequencyNoun.getAveragePosition();
            Iterator<String> iteratorVerb = verbInText.keySet().iterator();
            NextVerb:
            while (iteratorVerb.hasNext()) {
                String stringVerb = iteratorVerb.next();
                if (stringVerb.isEmpty()) {
                    continue NextVerb;
                }
                WordFrequency wordFrequencyVerb = _IMV_SIQ_SS.getW(stringVerb);
                int averagePositionVerb = wordFrequencyVerb.getAveragePosition();
                //noun-verb
                String root = "";
                String root_pos = "";
                if (StudyVerbaMap.initonDelegate.containsKey(stringVerb)) {
                    stringVerb = StudyVerbaMap.initonDelegate.getString(stringVerb);
                }
                if (averagePositionNoun < averagePositionVerb) {
                    root += stringNoun;
                    root += "+";
                    root += stringVerb;
                    root_pos += "_stringNoun" + averagePositionNoun;
                    root_pos += "_stringVerb" + averagePositionVerb;
                } else {
                    root += stringVerb;
                    root += "-";
                    root += stringNoun;
                    root_pos += "_stringVerb" + averagePositionVerb;
                    root_pos += "_stringNoun" + averagePositionNoun;
                }
                int right = Math.abs(averagePositionNoun - averagePositionVerb);
                int position = (averagePositionNoun + averagePositionVerb) >> 1;
                if (!cartesianWorkActionsRights.containsKey(root)
                    && !cartesianWorkActionsPositions.containsKey(root)
                    && right > 0) {
                    if (right < NE.app_S.initonsDistanceRelationship) {
                        if (!root.contains(" ")) {
                            cartesianWorkActions_pos.put(root, root_pos);
                            cartesianWorkActionsRights.put(root, right);
                            cartesianWorkActionsPositions.put(root, position);
                            System.out.println(root + ":" + right + ":" + position + ":" + root_pos);
                        }
                    }
                }
            }
        }
        //
        sortCartesianWorkActionsPosition(NE);
        //
        sortCartesianWorkActionsDistance(NE);
        //
        ActionsNormalization(NE);

        if (!objectMap.isEmpty() && !verbMap.isEmpty()) {
            return true;
        }
        return false;
    }

    private void ActionsNormalization(App NE) {
        Iterator<String> iterators = cartesianWorkActionsPositions.keySet().iterator();
        LEFT:
        while (iterators.hasNext()) {
            String root_position_name = iterators.next();
            int root_position_left = cartesianWorkActionsPositions.getInt(root_position_name);
            int root_rights_left = cartesianWorkActionsRights.getInt(root_position_name);
            //
            Iterator<String> root_right_names = cartesianWorkActionsRights.keySet().iterator();
            RIGHT:
            while (root_right_names.hasNext()) {
                String root_right_name = root_right_names.next();
                int root_position_right = cartesianWorkActionsPositions.getInt(root_position_name);
                int root_rights_right = cartesianWorkActionsRights.getInt(root_position_name);

                int least_rights = root_rights_left + root_rights_right;
                int average_rights = Math.abs(root_position_left - root_position_right);
                int average_position = (root_position_left + root_position_right) / 2;
                if (least_rights < NE.app_S.initonsDistanceRelationship
                    && !root_right_name.equalsIgnoreCase(root_position_name)
                    && average_rights < NE.app_S.initonsDistanceRelationship
                ) {
                    String[] leftsP = new String[2];// = root_right_name.split("+");
                    String[] leftsR = new String[2];
                    String[] rightsP = new String[2];
                    String[] rightsR = new String[2];
                    if (root_right_name.contains("+")) {
                        continue RIGHT;
                    }
                    if (root_right_name.contains("-")) {
                        leftsR = root_right_name.split("-");
                        leftsP = leftsR;
                    }
                    if (root_position_name.contains("+")) {
                        continue LEFT;
                    }
                    if (root_position_name.contains("-")) {
                        rightsR = root_position_name.split("-");
                        rightsP = rightsR;
                    }
                    if (!leftsP[0].equalsIgnoreCase(rightsR[1])
                        && !leftsR[1].equalsIgnoreCase(rightsP[0])) {
                        //later..
                        normalizationalWorkActionsRights.put(root_right_name + "--" + root_position_name, average_rights);
                        normalizationalWorkActionsPositions.put(root_right_name + "++" + root_position_name, average_position);
                        System.out.println(root_right_name + "--" + root_position_name + ":" + average_rights + ":" + average_position + ":" + least_rights);
                    }
                }
            }
        }
    }

    //tree sort 比quick top快，但耗费大量stack，于是不考虑。
    public void sortCartesianWorkActionsDistance(App NE) {
        actionsDistanceV = new int[cartesianWorkActionsRights.size()];
        actionsDistance = new String[cartesianWorkActionsRights.size()];
        Iterator<String> iterator = cartesianWorkActionsRights.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String string = iterator.next();
            actionsDistance[i] = string;
            actionsDistanceV[i++] = cartesianWorkActionsRights.getInt(string);
        }
        NE.app_S.lYGSortESU9D.javaSort(actionsDistanceV, actionsDistance);
        //loop
        for (i = 0; i < actionsDistance.length; i++) {
            System.out.println(actionsDistance[i] + "-" + actionsDistanceV[i]);
        }
    }

    public void sortCartesianWorkActionsPosition(App NE) {
        actionsPositionV = new int[cartesianWorkActionsPositions.size()];
        actionsPosition = new String[cartesianWorkActionsPositions.size()];
        Iterator<String> iterator = cartesianWorkActionsPositions.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String string = iterator.next();
            actionsPosition[i] = string;
            actionsPositionV[i++] = cartesianWorkActionsPositions.getInt(string);
        }
        NE.app_S.lYGSortESU9D.javaSort(actionsPositionV, actionsPosition);
        //loop
        for (i = 0; i < actionsPositionV.length; i++) {
            System.out.println(actionsPosition[i] + "+" + actionsPositionV[i]);
        }
        //------------
    }

    public void initActionMap() {
        //（首-先，一，开始，于是，顺其自然，）
        _IMV_SIQ_SS = new IMV_SIQ_SS();
        _IMV_SIQ_S_ = new IMV_SIQ_S_();
        objectMap = new IMV_SIQ();
        babeiMap = new IMV_SIQ();
        verbMap = new IMV_SIQ();
        fixMap = new IMV_SIQ();
        nounInText = new IMV_SIQ();
        verbInText = new IMV_SIQ();
        unknown_map = new IMV_SIQ();
        cartesianWorkActionsRights = new IMV_SIQ();
        cartesianWorkActionsPositions = new IMV_SIQ();
        cartesianWorkActions_pos = new IMV_SIQ();
        normalizationalWorkActionsRights = new IMV_SIQ();
        normalizationalWorkActionsPositions = new IMV_SIQ();
        //（将，获-取-得，授权，选择，确-定-保，认-准-定，标-记-出，拿-出-到-来，把，）
        data2DSubjectMap = new IMV_SIQ();
        data2DSubjectMap.put("表", true);
        data2DSubjectMap.put("表格", true);
        data2DSubjectMap.put("表单", true);
        data2DSubjectMap.put("东西", true);
        data2DSubjectMap.put("物", true);
        data2DSubjectMap.put("表库", true);
        data2DSubjectMap.put("矩阵", true);
        data2DSubjectMap.put("文档", true);
        data2DSubjectMap.put("文件", true);
        data2DSubjectMap.put("对象", true);
        data2DSubjectMap.put("单子", true);
        data2DSubjectMap.put("数据库", true);
        data2DSubjectMap.put("数据", true);
        data2DSubjectMap.put("文章", true);
        data2DSubjectMap.put("文献", true);
        //（表 表格-单-库，矩阵，文-档-件，对象）
        doMap = new IMV_SIQ();
        doMap.put("进行", true);
        doMap.put("执行", true);
        doMap.put("提", true);
        doMap.put("操", true);
        doMap.put("跟进", true);
        doMap.put("更近", true);
        doMap.put("更进", true);
        doMap.put("数据", true);
        doMap.put("智慧", true);
        doMap.put("逻辑", true);
        doMap.put("选择", true);
        doMap.put("操作", true);
        doMap.put("点击", true);
        doMap.put("点", true);
        doMap.put("确认", true);
        doMap.put("做", true);
        doMap.put("将", true);
        doMap.put("获取", true);
        doMap.put("获", true);
        doMap.put("获得", true);
        doMap.put("取得", true);
        doMap.put("取", true);
        doMap.put("授权", true);
        doMap.put("授", true);
        doMap.put("选", true);
        doMap.put("确定", true);
        doMap.put("确保", true);
        doMap.put("认准", true);
        doMap.put("认", true);
        doMap.put("认定", true);
        doMap.put("定", true);
        doMap.put("标记", true);
        doMap.put("标出", true);
        doMap.put("标", true);
        doMap.put("拿出", true);
        doMap.put("拿到", true);
        doMap.put("拿来", true);
        doMap.put("拿", true);
        fixMap.put("把", true);
        fixMap.put("被", true);
        doMap.put("锁定", true);
        doMap.put("锁存", true);
        doMap.put("锁", true);
        doMap.put("存", true);
        //（进行 执行 跟进 更近 更进 数据 智慧 逻辑 选择 操作 确认）
    }

    public void setHumanTalk(String command, App NE) {
        _IMV_SIQ_SS.clear();
        _IMV_SIQ_SS_.clear();
        _IMV_SIQ_S_.clear();
        this.humanTalk = command;
        //分词 提取 英文段和数字段形成变量。比如dnn 12345等
        _IMV_SIQ_SS_ = NE.app_S._A.parserMixedString(command);
        for (int i = 0; i < _IMV_SIQ_SS_.size(); i++) {
            System.out.println(_IMV_SIQ_SS_.get(i));
        }
//        1 精确词汇pos函数
//        2 精确词汇笛卡尔 取缔之前的老快速 map 频率
        this._IMV_SIQ_SS = NE.app_S._A.getWordFrequencyMap(_IMV_SIQ_SS_, NE);
//        3 精确词汇rnn 和 position
//          loop unknown
//        4 精确词汇的mapping肽指令集

//        5 局部替换即可，价值可识别12345和英文abcde 方便人类语言中入参识别。
        //*/
        //this._IMV_SIQ_SS = NE.app_S._A.parserMixStringByReturnFrequencyMap(command, NE);
        NE.app_S._A.initPCAWordPOS(this._IMV_SIQ_SS, NE);
    }

    //先处理仅一个主谓宾的简单长句，以后处理复杂带连词的多主宾复句子。
    public String returnBestTypeOfCommands(Boolean findSubject) {
        //init shortChineseActions
        Iterator<String> iterator = objectMap.keySet().iterator();
        while (iterator.hasNext()) {
            String subject = iterator.next();
            if (babeiMap.containsKey("把")) {
                if (objectMap.getInt(subject) < babeiMap.getInt("把")) {
                    subjectName += subject;
                }
                if (objectMap.getInt(subject) > babeiMap.getInt("把")) {
                    objectName += subject;
                }
            } else if (babeiMap.containsKey("被")) {
                if (objectMap.getInt(subject) < babeiMap.getInt("被")) {
                    objectName += subject;
                }
                if (objectMap.getInt(subject) > babeiMap.getInt("被")) {
                    subjectName += subject;
                }
            } else {
                if (null == subjectName) {
                    subjectName += subject;
                } else {
                    objectName += subject;
                }
            }
        }
        if (findSubject) {
            String output = "";
            if (null != subjectName) {
                output = subjectName;
            }
            output += ":";
            if (null != doName) {
                output += doName;
            }
            output += ":";
            if (null != objectName) {
                output += objectName;
            }
            return output;//later
        }
        return null;
    }
}