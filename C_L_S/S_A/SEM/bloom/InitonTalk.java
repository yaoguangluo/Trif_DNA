package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

//打个调用花语的 包
/*
 * 著作权人, 作者 罗瑶光, 浏阳，
 * 作者的家庭是父亲 罗荣武，母亲 刘瑞珍，女儿 christina.yaja.luo/罗雅佳, 前妻ringli/李妙环。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class InitonTalk {
    public static Object commandFlower(String functionIdentify) {
        //机器语指令
        return null;
    }

    public static Object humanFlower(String subject_S, String verb_S, String object_S) {
        //人类语句
        return null;
    }

    public static Object listenFlowers(String initonsLanguage) {
        //1-机器听懂人类语言多句。
        //2-humanFlower 人类单句语句 list
        //3-list 对应 机器语指令commandFlower
        //4-指令配置解码listenFlower
        return null;
    }

    //指令结构语句
    public static IMV_SIQ listenFlower(String initonsLanguage
        , String functionIdentify, String calyxChromosome, App NE) {
        String callFunctionKey = functionIdentify;//
        StaticRootMap.staticBloomingTime.put(callFunctionKey, System.currentTimeMillis());
        StaticRootMap.initMap();
        String[] strings = new String[1];
        IMV_SIQ output = new IMV_SIQ();
        IMV_SIQ inputValue = new IMV_SIQ();
        String[] 传参因子 = new String[0];//LATER USE SWICH
        if (calyxChromosome.equalsIgnoreCase("M_VECS")) {
            传参因子 = StaticFunctionMapM_VECS_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("M_IDUQ")) {
            传参因子 = StaticFunctionMapM_IDUQ_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("A_VECS")) {
            传参因子 = StaticFunctionMapA_VECS_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("A_IDUQ")) {
            传参因子 = StaticFunctionMapA_IDUQ_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("O_VECS")) {
            传参因子 = StaticFunctionMapO_VECS_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("O_IDUQ")) {
            传参因子 = StaticFunctionMapO_IDUQ_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("P_VECS")) {
            传参因子 = StaticFunctionMapP_VECS_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("P_IDUQ")) {
            传参因子 = StaticFunctionMapP_IDUQ_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("V_AOPM")) {
            传参因子 = StaticFunctionMapV_AOPM_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("V_IDUQ")) {
            传参因子 = StaticFunctionMapV_IDUQ_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("E_AOPM")) {
            传参因子 = StaticFunctionMapE_AOPM_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("E_IDUQ")) {
            传参因子 = StaticFunctionMapE_IDUQ_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("C_AOPM")) {
            传参因子 = StaticFunctionMapC_AOPM_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("C_IDUQ")) {
            传参因子 = StaticFunctionMapC_IDUQ_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("S_AOPM")) {
            传参因子 = StaticFunctionMapS_AOPM_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("S_IDUQ")) {
            传参因子 = StaticFunctionMapS_IDUQ_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("I_AOPM")) {
            传参因子 = StaticFunctionMapI_AOPM_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("I_VECS")) {
            传参因子 = StaticFunctionMapI_VECS_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("D_AOPM")) {
            传参因子 = StaticFunctionMapD_AOPM_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("D_VECS")) {
            传参因子 = StaticFunctionMapD_VECS_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("U_AOPM")) {
            传参因子 = StaticFunctionMapU_AOPM_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("U_VECS")) {
            传参因子 = StaticFunctionMapU_VECS_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("Q_AOPM")) {
            传参因子 = StaticFunctionMapQ_AOPM_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        if (calyxChromosome.equalsIgnoreCase("Q_VECS")) {
            传参因子 = StaticFunctionMapQ_VECS_C.annotationMap.getString(callFunctionKey)
                .split(":");//
        }
        for (int i = 0; i < 传参因子.length; i++) {//降低入参权限。只做记忆分析。
            StaticRootMap.staticBloomingTime.put(传参因子[i], System.currentTimeMillis());
            if (StaticRootMap.staticBloomingTimes.containsKey(传参因子[i])) {
                Long times = StaticRootMap.staticBloomingTimes.get(传参因子[i]);
                times++;//方便统计用来删除淘汰函数。例子
                StaticRootMap.staticBloomingTimes.put(传参因子[i], times);
            }//每一次出现的时间list稍后。避免内存增量。
            inputValue.put(传参因子[i], "");//安全机制。
        }
        //opt 先 保留。
        output.put("传参因子", 传参因子);
        output.put("inputValues", inputValue);
        strings[0] = initonsLanguage;
        StaticRootMap.tinShellV005(strings, output, NE);
        Long bootedTimeMillis = StaticRootMap.staticBloomingTime.get(callFunctionKey);
        Long durationalTimeMillis = System.currentTimeMillis() - bootedTimeMillis;
        StaticRootMap.staticBloomingDuration.put(callFunctionKey, durationalTimeMillis);
        IMV_SIQ map = (IMV_SIQ) output.get(callFunctionKey);
        return map;//map里面需要一些固定的标准参数。
    }
    // do a list , average, etc recoder later..
    //129--问题 1 元基花下的map稍后剔除
    //问题2 元基枝下的 map稍后统一注册。
    //问题3 元基花下的函数统计模式分开。
}