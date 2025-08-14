package S_A.SixActionMap;

import OSI.OSU.addAction.AddActionInterfaceClass;
import OSI.OSU.addAction.AddFindColumnsInMemoryClass;
import OSI.OSU.addAction.AddParserMixedStringClass;
import OSI.OSU.addAction.AddParserMixedStringToListClass;
import S_A.SEM.bloom.StaticFunctionMapS_AOPM_C;
import S_A.SEM.bloom.StaticRootMap;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class CreativeVerbaMap {
    public IMV_SIQ flowerActionMap = new IMV_SIQ();

    public static void initInitonActions() {
        //非OSGI模式注册花语言，其他见我著作权的CrabInterfaceClass。
        FlowerAction.FlowerSixDomainActions.put("I-表", "findTableInMemory");
        //注册花函数
        AddActionInterfaceClass addActionInterfaceClass = new AddActionInterfaceClass();
        String callFunctionKey = "findTableInMemory";
        //20230207 走统计新陈代谢, 见CrabInterfaceClass
        //chromosomes
        StaticRootMap.staticBloomingTimes.put(callFunctionKey, (long) 0);
        StaticRootMap.staticBloomingTime.put(callFunctionKey, System.currentTimeMillis());//增加记忆时间。20241013
        StaticRootMap.staticClass_XE_Map.put(callFunctionKey, "S_AOPM");
        StaticRootMap.chromosomeNode.put(callFunctionKey, addActionInterfaceClass);//20241001准备把这行移出去。
        StaticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKey, "inputValues:传参因子:因子");
        //booming
        StaticRootMap.chromosomeBlooming.put(callFunctionKey, addActionInterfaceClass);


        //注册花函数
        AddParserMixedStringClass addParserMixedStringClass = new AddParserMixedStringClass();
        String callFunctionKeyaddParserMixedStringClass = "parserMixedString";
        //
        FlowerAction.FlowerChromosomeActions.put(callFunctionKeyaddParserMixedStringClass, addParserMixedStringClass);
        //20230207 走统计新陈代谢, 见CrabInterfaceClass
        //chromosomes
        StaticRootMap.staticBloomingTimes.put(callFunctionKeyaddParserMixedStringClass, (long) 0);
        StaticRootMap.staticBloomingTime.put(callFunctionKeyaddParserMixedStringClass, System.currentTimeMillis());//增加记忆时间。20241013
        StaticRootMap.staticClass_XE_Map.put(callFunctionKeyaddParserMixedStringClass, "A_VECS");
        StaticRootMap.chromosomeNode.put(callFunctionKeyaddParserMixedStringClass, addParserMixedStringClass);//20241001准备把这行移出去。
        StaticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKeyaddParserMixedStringClass, "inputValues:传参因子:因子");
        //booming
        StaticRootMap.chromosomeBlooming.put(callFunctionKeyaddParserMixedStringClass, addParserMixedStringClass);


        //注册花函数
        AddParserMixedStringToListClass addParserMixedStringToListClass = new AddParserMixedStringToListClass();
        String callFunctionKeyAddParserMixedStringToListClass = "parserMixedStringToList";
        //
        FlowerAction.FlowerChromosomeActions.put(callFunctionKeyAddParserMixedStringToListClass, addParserMixedStringToListClass);
        //20230207 走统计新陈代谢, 见CrabInterfaceClass
        //chromosomes
        StaticRootMap.staticBloomingTimes.put(callFunctionKeyAddParserMixedStringToListClass, (long) 0);
        StaticRootMap.staticBloomingTime.put(callFunctionKeyAddParserMixedStringToListClass, System.currentTimeMillis());//增加记忆时间。20241013
        StaticRootMap.staticClass_XE_Map.put(callFunctionKeyAddParserMixedStringToListClass, "A_VECS");
        StaticRootMap.chromosomeNode.put(callFunctionKeyAddParserMixedStringToListClass, addParserMixedStringToListClass);//20241001准备把这行移出去。
        StaticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKeyAddParserMixedStringToListClass, "inputValues:传参因子:因子");
        //booming
        StaticRootMap.chromosomeBlooming.put(callFunctionKeyAddParserMixedStringToListClass, addParserMixedStringToListClass);

        //VI-列 later
        FlowerAction.FlowerSixDomainActions.put("展示-列", "addFindColumnsInMemoryClass");
        //注册花函数
        AddFindColumnsInMemoryClass addFindColumnsInMemoryClass = new AddFindColumnsInMemoryClass();
        String callFunctionKeyAddFindColumnsInMemoryClass = "addFindColumnsInMemoryClass";
        //20230207 走统计新陈代谢, 见CrabInterfaceClass
        //chromosomes
        StaticRootMap.staticBloomingTimes.put(callFunctionKeyAddFindColumnsInMemoryClass, (long) 0);
        StaticRootMap.staticBloomingTime.put(callFunctionKeyAddFindColumnsInMemoryClass, System.currentTimeMillis());//增加记忆时间。20241013
        StaticRootMap.staticClass_XE_Map.put(callFunctionKeyAddFindColumnsInMemoryClass, "S_AOPM");
        StaticRootMap.chromosomeNode.put(callFunctionKeyAddFindColumnsInMemoryClass, addFindColumnsInMemoryClass);//20241001准备把这行移出去。
        StaticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKeyAddFindColumnsInMemoryClass, "inputValues:传参因子:因子");
        //booming
        StaticRootMap.chromosomeBlooming.put(callFunctionKeyAddFindColumnsInMemoryClass, addFindColumnsInMemoryClass);

    }
}