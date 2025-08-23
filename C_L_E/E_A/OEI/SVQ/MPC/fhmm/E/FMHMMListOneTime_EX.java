package E_A.OEI.SVQ.MPC.fhmm.E;

import C_A.OCI.SVQ.MPC.fhmm.C.FHMMList_indexAll_X;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class FMHMMListOneTime_EX extends FMHMMListOneTime_E_maps implements FHMMList_indexAll_X {
     public void loadLanguage(String cInputString, String cInputStringKorea
        , String cInputStringJapan, String cInputStringTrandition
        , String cInputStringEnglish, String cInputStringRs, String cInputStringAb
        , String cInputStringFn, String cInputStringGm, String cInputStringSp) {
        studyPos.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
            , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
        posCnToCn.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
            , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
        linkedHashMap = loopLoadForest(cInputString);
        if (null != cInputStringKorea) {
            posCnToCn.put(cInputStringKorea
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            linkedHashMap = loopLoadForest(cInputStringKorea);
        }
        if (null != cInputStringJapan) {
            if (!posCnToCn.containsKey(cInputStringJapan
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])) {
                posCnToCn.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , cInputStringJapan.split(S_Pos.NLP_SYMBO_SLASH).length
                        > S_Pos.INT_ONE ? cInputStringJapan.split(
                        S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE] : "未知");
                linkedHashMap = loopLoadForest(cInputStringJapan);
            }
        }
        if (null != cInputStringTrandition) {
            if (!posCnToCn.containsKey(cInputStringTrandition
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])) {
                posCnToCn.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                linkedHashMap = loopLoadForest(cInputStringTrandition);
            }
        }
        if (null != cInputStringEnglish) {
            posCnToCn.put(cInputStringEnglish
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
        }
        if (null != cInputStringRs) {
            posCnToCn.put(cInputStringRs
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
        }
        if (null != cInputStringAb) {
            posCnToCn.put(cInputStringAb
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
        }
        if (null != cInputStringFn) {//注意拉丁语 系列碎片去重map混淆
            posCnToCn.put(cInputStringFn
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
        }
        if (null != cInputStringGm) {
            posCnToCn.put(cInputStringGm
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
        }
        if (null != cInputStringSp) {
            posCnToCn.put(cInputStringSp
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
        }
    }

    public void loagPOS(String cInputString, String cInputStringKorea
        , String cInputStringJapan, String cInputStringTrandition
        , String cInputStringEnglish, String cInputStringRs, String cInputStringAb
        , String cInputStringFn, String cInputStringGm, String cInputStringSp) {
        if (!S_Maps.fuCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_FU)) {
            S_Maps.fuCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.fuCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.fuCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));

            }
            if (null != cInputStringTrandition) {
                S_Maps.fuCi.put(cInputStringTrandition.
                        split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.fuCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.dongCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_DONG)) {
            S_Maps.dongCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.dongCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.dongCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.dongCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.dongCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.liangCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE].contains(S_Pos.NLP_CI_LIANG)) {
            S_Maps.liangCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.liangCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.liangCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.liangCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.liangCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.lianCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_LIAN)) {
            S_Maps.lianCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.lianCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.lianCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.lianCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.lianCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.baDongCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_BA_DONG)) {
            S_Maps.baDongCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.baDongCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.baDongCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.baDongCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.baDongCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.xianDingCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_XIAN_DING)) {
            S_Maps.xianDingCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.xianDingCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.xianDingCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.xianDingCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.xianDingCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.mingCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_MING)) {
            S_Maps.mingCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.mingCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.mingCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.mingCi.put(cInputStringTrandition.
                        split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.mingCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.daiCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_DAI)) {
            S_Maps.daiCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.daiCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.daiCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.daiCi.put(cInputStringTrandition.
                        split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.daiCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.jieCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_JIE)) {
            S_Maps.jieCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.jieCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.jieCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.jieCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.jieCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.xingRongCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_XING_RONG)) {
            S_Maps.xingRongCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.xingRongCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.xingRongCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.xingRongCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.xingRongCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.zhuCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_ZHU)) {
            S_Maps.zhuCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.zhuCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.zhuCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.zhuCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.zhuCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.weiCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE].contains(S_Pos.NLP_CI_WEI)) {
            S_Maps.weiCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.weiCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.weiCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.weiCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.weiCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.shengLueCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_SHENG_LUE)) {
            S_Maps.shengLueCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.shengLueCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.shengLueCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.shengLueCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.shengLueCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.qingTaiCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_QING_TAI)) {
            S_Maps.qingTaiCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.qingTaiCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.qingTaiCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.qingTaiCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.qingTaiCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.xingWeiCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_XING_WEI)) {
            S_Maps.xingWeiCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.xingWeiCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.xingWeiCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.xingWeiCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.xingWeiCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.shiTaiCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_SHI_TAI)) {
            S_Maps.shiTaiCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.shiTaiCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.shiTaiCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.shiTaiCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.shiTaiCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        if (!S_Maps.dingMingCi.containsKey(cInputString
            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
            && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
            .contains(S_Pos.NLP_CI_DING_MING)) {
            S_Maps.dingMingCi.put(cInputString
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            if (null != cInputStringKorea) {
                S_Maps.dingMingCi.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringJapan) {
                S_Maps.dingMingCi.put(cInputStringJapan
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringTrandition) {
                S_Maps.dingMingCi.put(cInputStringTrandition
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringEnglish) {
                S_Maps.dingMingCi.put(cInputStringEnglish
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
    }
}
/*public void indexAll() {
        studyPos = new IMV_SIQ();
        posCnToCn = new IMV_SIQ();
        linkedHashMap = new IMV_SIQ();
        listCn = new CopyOnWriteArrayList<>();
        listAb = new CopyOnWriteArrayList<>();
        listKo = new CopyOnWriteArrayList<>();
        listJp = new CopyOnWriteArrayList<>();
        listRs = new CopyOnWriteArrayList<>();
        listTt = new CopyOnWriteArrayList<>();
        listEn = new CopyOnWriteArrayList<>();
        listPy = new CopyOnWriteArrayList<>();
        listFn = new CopyOnWriteArrayList<>();
        listSp = new CopyOnWriteArrayList<>();
        listGm = new CopyOnWriteArrayList<>();
        InputStream inputStream
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_CN);
        DetaBufferedReader cReader
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStream, S_Pos.UTF8_STRING));
        InputStream inputStreamKorea
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_KO);
        DetaBufferedReader cReaderKorea
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamKorea, S_Pos.UTF8_STRING));
        InputStream inputStreamJapan
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_JP);
        DetaBufferedReader cReaderJapan
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamJapan, S_Pos.UTF8_STRING));
        InputStream inputStreamTrandition
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_TT);
        DetaBufferedReader cReaderTrandition
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamTrandition, S_Pos.UTF8_STRING));
        InputStream inputStreamEnglish
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_EN_TO_EN);
        DetaBufferedReader cReaderEnglish
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamEnglish, S_Pos.UTF8_STRING));
        InputStream inputStreamPinYin
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_PY);
        DetaBufferedReader cReaderPinYin
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamPinYin, S_Pos.UTF8_STRING));

        InputStream inputStreamRs
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_RS);
        DetaBufferedReader cReaderRs
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamRs, S_Pos.UTF8_STRING));

        InputStream inputStreamAb
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_AB);
        DetaBufferedReader cReaderAb
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamAb, S_Pos.UTF8_STRING));

        InputStream inputStreamFn
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_FN);
        DetaBufferedReader cReaderFn
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamFn, S_Pos.UTF8_STRING));

        InputStream inputStreamGm
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_GM);
        DetaBufferedReader cReaderGm
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamGm, S_Pos.UTF8_STRING));

        InputStream inputStreamSp
            = getClass().getResourceAsStream(S_Pos.WORDS_SOURSE_LINK_POS_CN_TO_SP);
        DetaBufferedReader cReaderSp
            = new DetaBufferedReader(DetaInputStreamReader.E(inputStreamSp, S_Pos.UTF8_STRING));

        String cInputString;
        String cInputStringKorea;
        String cInputStringJapan;
        String cInputStringTrandition;
        String cInputStringEnglish;
        String cInputStringPinYin;
        String cInputStringRs;
        String cInputStringAb;
        String cInputStringFn;
        String cInputStringGm;
        String cInputStringSp;

        Here:
        while ((cInputString = cReader.readDetaLine()) != null) {
            cInputStringKorea = cReaderKorea.readDetaLine();
            cInputStringJapan = cReaderJapan.readDetaLine();
            cInputStringTrandition = cReaderTrandition.readDetaLine();
            cInputStringEnglish = cReaderEnglish.readDetaLine();
            cInputStringPinYin = cReaderPinYin.readDetaLine();
            cInputStringRs = cReaderRs.readDetaLine();
            cInputStringAb = cReaderAb.readDetaLine();

            cInputStringFn = cReaderFn.readDetaLine();
            cInputStringSp = cReaderGm.readDetaLine();
            cInputStringGm = cReaderSp.readDetaLine();
            listCn.add(cInputString);
            if (null != cInputStringKorea) {
                listKo.add(cInputStringKorea);
            }
            if (null != cInputStringJapan) {
                listJp.add(cInputStringJapan);
            }
            if (null != cInputStringTrandition) {
                listTt.add(cInputStringTrandition);
                if (S_Pos.INT_ONE == cInputStringTrandition
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].length()) {
                    S_Maps.CiOne.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));

                }
                if (S_Pos.INT_TWO == cInputStringTrandition
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].length()) {
                    S_Maps.CiTwo.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (S_Pos.INT_THREE == cInputStringTrandition
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].length()) {
                    S_Maps.CiThree.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (S_Pos.INT_FOUR == cInputStringTrandition
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].length()) {
                    S_Maps.CiFour.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (null != cInputStringEnglish) {
                listEn.add(cInputStringEnglish);
            }
            if (null != cInputStringPinYin) {
                listPy.add(cInputStringPinYin);
            }
            if (null != cInputStringRs) {
                listRs.add(cInputStringRs);
            }
            if (null != cInputStringAb) {
                listAb.add(cInputStringAb);
            }
            if (null != cInputStringFn) {
                listFn.add(cInputStringFn);
            }
            if (null != cInputStringSp) {
                listSp.add(cInputStringSp);
            }
            if (null != cInputStringGm) {
                listGm.add(cInputStringGm);
            }
            if (!(!cInputString.replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING)
                .equals(S_Pos.EMPTY_STRING) && cInputString.split(S_Pos.NLP_SYMBO_SLASH)
                .length > S_Pos.INT_ONE)) {
                continue Here;
            }
            if (S_Pos.INT_ONE == cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                .length()) {
                S_Maps.CiOne.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (S_Pos.INT_TWO == cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                .length()) {
                S_Maps.CiTwo.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (S_Pos.INT_THREE == cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                .length()) {
                S_Maps.CiThree.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (S_Pos.INT_FOUR == cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                .length()) {
                S_Maps.CiFour.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (!S_Maps.fuCi.containsKey(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_FU)) {
                S_Maps.fuCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.fuCi.put(cInputStringKorea.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.fuCi.put(cInputStringJapan.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.fuCi.put(cInputStringTrandition.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.fuCi.put(cInputStringEnglish.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.dongCi.containsKey(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_DONG)) {
                S_Maps.dongCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.dongCi.put(cInputStringKorea.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.dongCi.put(cInputStringJapan.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.dongCi.put(cInputStringTrandition.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.dongCi.put(cInputStringEnglish.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.liangCi.containsKey(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_LIANG)) {
                S_Maps.liangCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.liangCi.put(cInputStringKorea.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.liangCi.put(cInputStringJapan.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.liangCi.put(cInputStringTrandition.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.liangCi.put(cInputStringEnglish.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.lianCi.containsKey(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_LIAN)) {
                S_Maps.lianCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.lianCi.put(cInputStringKorea.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.lianCi.put(cInputStringJapan.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.lianCi.put(cInputStringTrandition.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.lianCi.put(cInputStringEnglish.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.baDongCi.containsKey(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_BA_DONG)) {
                S_Maps.baDongCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.baDongCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.baDongCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.baDongCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.baDongCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.xianDingCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_XIAN_DING)) {
                S_Maps.xianDingCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.xianDingCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.xianDingCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.xianDingCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.xianDingCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.mingCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_MING)) {
                S_Maps.mingCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.mingCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.mingCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.mingCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.mingCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.daiCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_DAI)) {
                S_Maps.daiCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.daiCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.daiCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.daiCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.daiCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.jieCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE].contains(S_Pos.NLP_CI_JIE)) {
                S_Maps.jieCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.jieCi.put(cInputStringKorea.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.jieCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.jieCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.jieCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.xingRongCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_XING_RONG)) {
                S_Maps.xingRongCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.xingRongCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.xingRongCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.xingRongCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.xingRongCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.zhuCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_ZHU)) {
                S_Maps.zhuCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.zhuCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.zhuCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.zhuCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.zhuCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.weiCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE].contains(S_Pos.NLP_CI_WEI)) {
                S_Maps.weiCi.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.weiCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.weiCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.weiCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.weiCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.shengLueCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_SHENG_LUE)) {
                S_Maps.shengLueCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.shengLueCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.shengLueCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.shengLueCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.shengLueCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.qingTaiCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_QING_TAI)) {
                S_Maps.qingTaiCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.qingTaiCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.qingTaiCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.qingTaiCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.qingTaiCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.xingWeiCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_XING_WEI)) {
                S_Maps.xingWeiCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.xingWeiCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.xingWeiCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.xingWeiCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.xingWeiCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.shiTaiCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_SHI_TAI)) {
                S_Maps.shiTaiCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.shiTaiCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.shiTaiCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.shiTaiCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.shiTaiCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            if (!S_Maps.dingMingCi.containsKey(cInputString
                .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])
                && cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]
                .contains(S_Pos.NLP_CI_DING_MING)) {
                S_Maps.dingMingCi.put(cInputString
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                if (null != cInputStringKorea) {
                    S_Maps.dingMingCi.put(cInputStringKorea
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringJapan) {
                    S_Maps.dingMingCi.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringTrandition) {
                    S_Maps.dingMingCi.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
                if (null != cInputStringEnglish) {
                    S_Maps.dingMingCi.put(cInputStringEnglish
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                }
            }
            studyPos.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            posCnToCn.put(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            linkedHashMap = loopLoadForest(cInputString);
            if (null != cInputStringKorea) {
                posCnToCn.put(cInputStringKorea
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                linkedHashMap = loopLoadForest(cInputStringKorea);
            }
            if (null != cInputStringJapan) {
                if (!posCnToCn.containsKey(cInputStringJapan
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])) {
                    posCnToCn.put(cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , cInputStringJapan.split(S_Pos.NLP_SYMBO_SLASH).length
                            > S_Pos.INT_ONE ? cInputStringJapan
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE] : "未知");
                    linkedHashMap = loopLoadForest(cInputStringJapan);
                }
            }
            if (null != cInputStringTrandition) {
                if (!posCnToCn.containsKey(cInputStringTrandition
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO])) {
                    posCnToCn.put(cInputStringTrandition
                            .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO]
                        , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
                    linkedHashMap = loopLoadForest(cInputStringTrandition);
                }
            }
            if (null != cInputStringEnglish) {
                posCnToCn.put(cInputStringEnglish
                    .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase(), new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringRs) {
                posCnToCn.put(cInputStringRs
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringAb) {
                posCnToCn.put(cInputStringAb
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }

            if (null != cInputStringFn) {
                posCnToCn.put(cInputStringFn
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringGm) {
                posCnToCn.put(cInputStringGm
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
            if (null != cInputStringSp) {
                posCnToCn.put(cInputStringSp
                        .split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ZERO].toLowerCase()
                    , new StringBuilder(cInputString.split(S_Pos.NLP_SYMBO_SLASH)[S_Pos.INT_ONE]));
            }
        }
        cReader.closeDeta();
        cReaderKorea.closeDeta();
        cReaderJapan.closeDeta();
        cReaderTrandition.closeDeta();
        cReaderEnglish.closeDeta();
        cReaderPinYin.closeDeta();
        cReaderRs.closeDeta();
        cReaderAb.closeDeta();
        cReaderFn.closeDeta();
        cReaderGm.closeDeta();
        cReaderSp.closeDeta();
        try {
            inputStream.close();
            cReader.closeDeta();
            inputStreamKorea.close();
            cReaderKorea.closeDeta();
            inputStreamJapan.close();
            cReaderJapan.closeDeta();
            inputStreamTrandition.close();
            cReaderTrandition.closeDeta();
            inputStreamEnglish.close();
            cReaderEnglish.closeDeta();
            inputStreamPinYin.close();
            cReaderPinYin.closeDeta();
            inputStreamRs.close();
            cReaderRs.closeDeta();
            inputStreamAb.close();
            cReaderAb.closeDeta();
            inputStreamFn.close();
            cReaderFn.closeDeta();
            inputStreamSp.close();
            cReaderSp.closeDeta();
            inputStreamFn.close();
            cReaderFn.closeDeta();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //trim
        S_Maps.baDongCi.remove("");
        S_Maps.daiCi.remove("");
        S_Maps.dingMingCi.remove("");
        S_Maps.dongCi.remove("");
        S_Maps.fuCi.remove("");
        S_Maps.jieCi.remove("");
        S_Maps.lianCi.remove("");
        S_Maps.liangCi.remove("");
        S_Maps.mingCi.remove("");
        S_Maps.qingTaiCi.remove("");
        S_Maps.shengLueCi.remove("");
        S_Maps.shiTaiCi.remove("");
        S_Maps.weiCi.remove("");
        S_Maps.xianDingCi.remove("");
        S_Maps.xingRongCi.remove("");
        S_Maps.xingWeiCi.remove("");
        S_Maps.zhuCi.remove("");
        //20230106-System.out.println(S_Maps.CiOne.size());
        //20230106-System.out.println(S_Maps.CiTwo.size());
        //20230106-System.out.println(S_Maps.CiThree.size());
        //20230106-System.out.println(S_Maps.CiFour.size());
    }*/