package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapP_VECS_E;
import S_A.pheromone.IMV_SIQ;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticReflectionMapP_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("aNNTest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.aNNTest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "aNNTest");
        }//, "aNNTest");
        if (callFunctionKey.contains("dNNTest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.dNNTest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "dNNTest");
        }//, "dNNTest");
        if (callFunctionKey.contains("rNNTest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.rNNTest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "rNNTest");
        }//, "rNNTest");
        if (callFunctionKey.contains("sensingTest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.sensingTest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sensingTest");
        }//, "sensingTest");
        if (callFunctionKey.contains("educationLevelTest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapP_VECS_C.educationLevelTest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "educationLevelTest");
        }//, "educationLevelTest");
        if (callFunctionKey.contains("literarinessLevelTest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapP_VECS_C.literarinessLevelTest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "literarinessLevelTest");
        }//, "literarinessLevelTest");
        if (callFunctionKey.contains("successICATest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapP_VECS_C.successICATest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "successICATest");
        }//, "successICATest");
        if (callFunctionKey.contains("getSideEnd2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getSideEnd2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getSideEnd2D");
        }//, "getSideEnd2D");
        if (callFunctionKey.contains("getSideEnd3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getSideEnd3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getSideEnd3D");
        }//, "getSideEnd3D");
        if (callFunctionKey.contains("addNewPositionWithoutHeart", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.addNewPositionWithoutHeart(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "addNewPositionWithoutHeart");
        }//, "addNewPositionWithoutHeart");
        if (callFunctionKey.contains("addNewPositionWithHeart", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.addNewPositionWithHeart(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "addNewPositionWithHeart");
        }//, "addNewPositionWithHeart");
        if (callFunctionKey.contains("getShortestSamplePosition2DGroup", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getShortestSamplePosition2DGroup(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getShortestSamplePosition2DGroup");
        }//, "getShortestSamplePosition2DGroup");
        if (callFunctionKey.contains("getShorterSamplePosition2DGroupsWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getShorterSamplePosition2DGroupsWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getShorterSamplePosition2DGroupsWithScale");
        }//, "getShorterSamplePosition2DGroupsWithScale");
        if (callFunctionKey.contains("getShortestSamplePosition3DGroup", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getShortestSamplePosition3DGroup(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getShortestSamplePosition3DGroup");
        }//, "getShortestSamplePosition3DGroup");
        if (callFunctionKey.contains("getShortestSamplePosition3DGroupsWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getShortestSamplePosition3DGroupsWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getShortestSamplePosition3DGroupsWithScale");
        }//, "getShortestSamplePosition3DGroupsWithScale");
        if (callFunctionKey.contains("fissilePosition2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.fissilePosition2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fissilePosition2D");
        }//, "fissilePosition2D");
        if (callFunctionKey.contains("fissilePosition3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.fissilePosition3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fissilePosition3D");
        }//, "fissilePosition3D");
        if (callFunctionKey.contains("fusionPosition2DwithHeart", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.fusionPosition2DwithHeart(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fusionPosition2DwithHeart");
        }//, "fusionPosition2DwithHeart");
        if (callFunctionKey.contains("fusionPosition3DwithHeart", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.fusionPosition3DwithHeart(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "fusionPosition3DwithHeart");
        }//, "fusionPosition3DwithHeart");
        if (callFunctionKey.contains("getTSPIsolationGroups2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getTSPIsolationGroups2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getTSPIsolationGroups2D");
        }//, "getTSPIsolationGroups2D");
        if (callFunctionKey.contains("getTSPIsolationGroups3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getTSPIsolationGroups3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getTSPIsolationGroups3D");
        }//, "getTSPIsolationGroups3D");
        if (callFunctionKey.contains("getTSPForestIsolationGroups2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getTSPForestIsolationGroups2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getTSPForestIsolationGroups2D");
        }//, "getTSPForestIsolationGroups2D");
        if (callFunctionKey.contains("getTSPForestIsolationGroups3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getTSPForestIsolationGroups3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getTSPForestIsolationGroups3D");
        }//, "getTSPForestIsolationGroups3D");
        if (callFunctionKey.contains("trackTracePosition2DHeartsWithSingerGroup", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.trackTracePosition2DHeartsWithSingerGroup(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "trackTracePosition2DHeartsWithSingerGroup");
        }//, "trackTracePosition2DHeartsWithSingerGroup");
        if (callFunctionKey.contains("trackTracePosition3DHeartsWithSingerGroup", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.trackTracePosition3DHeartsWithSingerGroup(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "trackTracePosition3DHeartsWithSingerGroup");
        }//, "trackTracePosition3DHeartsWithSingerGroup");
        if (callFunctionKey.contains("trackTracePosition2DByHearts", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.trackTracePosition2DByHearts(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "trackTracePosition2DByHearts");
        }//, "trackTracePosition2DByHearts");
        if (callFunctionKey.contains("trackTracePosition3DByHearts", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.trackTracePosition3DByHearts(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "trackTracePosition3DByHearts");
        }//, "trackTracePosition3DByHearts");
        if (callFunctionKey.contains("trackTracePosition2DHeartsWithFissileGroups", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.trackTracePosition2DHeartsWithFissileGroups(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "trackTracePosition2DHeartsWithFissileGroups");
        }//, "trackTracePosition2DHeartsWithFissileGroups");
        if (callFunctionKey.contains("trackTracePosition3DHeartsWithFissileGroups", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.trackTracePosition3DHeartsWithFissileGroups(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "trackTracePosition3DHeartsWithFissileGroups");
        }//, "trackTracePosition3DHeartsWithFissileGroups");
        if (callFunctionKey.contains("findMeanDistanceFromPositions2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanDistanceFromPositions2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanDistanceFromPositions2D");
        }//, "findMeanDistanceFromPositions2D");
        if (callFunctionKey.contains("findMeanDistanceFromPositions3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanDistanceFromPositions3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanDistanceFromPositions3D");
        }//, "findMeanDistanceFromPositions3D");
        if (callFunctionKey.contains("findPascalMeanDistanceByEachPositions2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findPascalMeanDistanceByEachPositions2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findPascalMeanDistanceByEachPositions2D");
        }//, "findPascalMeanDistanceByEachPositions2D");
        if (callFunctionKey.contains("findPascalMeanDistanceByEachPositions3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findPascalMeanDistanceByEachPositions3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findPascalMeanDistanceByEachPositions3D");
        }//, "findPascalMeanDistanceByEachPositions3D");
        if (callFunctionKey.contains("getPosition2DsGroupPascalHearts", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPosition2DsGroupPascalHearts(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPosition2DsGroupPascalHearts");
        }//, "getPosition2DsGroupPascalHearts");
        if (callFunctionKey.contains("getPosition3DsGroupPascalHearts", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPosition3DsGroupPascalHearts(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPosition3DsGroupPascalHearts");
        }//, "getPosition3DsGroupPascalHearts");
        if (callFunctionKey.contains("getPosition2DsGroupPascalMids", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPosition2DsGroupPascalMids(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPosition2DsGroupPascalMids");
        }//, "getPosition2DsGroupPascalMids");

        if (callFunctionKey.contains("getPosition3DsGroupPascalMids", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPosition3DsGroupPascalMids(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPosition3DsGroupPascalMids");
        }//, "getPosition3DsGroupPascalMids");
        if (callFunctionKey.contains("getPosition2DsGroupPascalDirection", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPosition2DsGroupPascalDirection2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPosition2DsGroupPascalDirection");
        }//, "getPosition2DsGroupPascalDirection");
        if (callFunctionKey.contains("getPosition3DsGroupPascalDirection", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPosition3DsGroupPascalDirection3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPosition3DsGroupPascalDirection");
        }//, "getPosition3DsGroupPascalDirection");
        if (callFunctionKey.contains("getPosition3DsGroupPascalDirection", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPosition3DsGroupPascalDirection3DMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPosition3DsGroupPascalDirection");
        }//, "getPosition3DsGroupPascalDirection");
        if (callFunctionKey.contains("getPosition2DsGroupPascalDirection", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPosition2DsGroupPascalDirection2DMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPosition2DsGroupPascalDirection");
        }//, "getPosition2DsGroupPascalDirection");
        if (callFunctionKey.contains("getYaoguangLuo2DEulerRingTSP", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getYaoguangLuo2DEulerRingTSP(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getYaoguangLuo2DEulerRingTSP");
        }//, "getYaoguangLuo2DEulerRingTSP");
        if (callFunctionKey.contains("getYaoguangLuo3DEulerRingTSP", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getYaoguangLuo3DEulerRingTSP(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getYaoguangLuo3DEulerRingTSP");
        }//, "getYaoguangLuo3DEulerRingTSP");
        if (callFunctionKey.contains("getYaoguangLuo2DEulerRingTSP2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getYaoguangLuo2DEulerRingTSP2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getYaoguangLuo2DEulerRingTSP2D");
        }//, "getYaoguangLuo2DEulerRingTSP2D");
        if (callFunctionKey.contains("getYaoguangLuo3DEulerRingTSP2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getYaoguangLuo3DEulerRingTSP2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getYaoguangLuo3DEulerRingTSP2D");
        }//, "getYaoguangLuo3DEulerRingTSP2D");
        if (callFunctionKey.contains("getYaoguangLuo2DEulerRingTSP3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getYaoguangLuo2DEulerRingTSP3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getYaoguangLuo2DEulerRingTSP3D");
        }//, "getYaoguangLuo2DEulerRingTSP3D");
        if (callFunctionKey.contains("getYaoguangLuo3DEulerRingTSP3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getYaoguangLuo3DEulerRingTSP3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getYaoguangLuo3DEulerRingTSP3D");
        }//, "getYaoguangLuo3DEulerRingTSP3D");

        if (callFunctionKey.contains("getImagePix2DGroupFilter", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getImagePix2DGroupFilter(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getImagePix2DGroupFilter");
        }//, "getImagePix2DGroupFilter");
        if (callFunctionKey.contains("getImagePix3DGroupFilter", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getImagePix3DGroupFilter(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getImagePix3DGroupFilter");
        }//, "getImagePix3DGroupFilter");
        if (callFunctionKey.contains("NLPBestSentenceMatch", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.NLPBestSentenceMatch(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "NLPBestSentenceMatch");
        }//, "NLPBestSentenceMatch");
        if (callFunctionKey.contains("NLPBestSentencesMatch", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.NLPBestSentencesMatch(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "NLPBestSentencesMatch");
        }//, "NLPBestSentencesMatch");
        if (callFunctionKey.contains("getNLPBestSentencesMatchScore", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getNLPBestSentencesMatchScore(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNLPBestSentencesMatchScore");
        }//, "getNLPBestSentencesMatchScore");
        if (callFunctionKey.contains("getNLPBestSentencesMatchScoreRights", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getNLPBestSentencesMatchScoreRights(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNLPBestSentencesMatchScoreRights");
        }//, "getNLPBestSentencesMatchScoreRights");
        if (callFunctionKey.contains("getErrorAsserts", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getErrorAsserts(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getErrorAsserts");
        }//, "getErrorAsserts");
        if (callFunctionKey.contains("getBinaryErrorAsserts", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getBinaryErrorAsserts(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getBinaryErrorAsserts");
        }//, "getBinaryErrorAsserts");
        if (callFunctionKey.contains("findTotalIncrementWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findTotalIncrementWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findTotalIncrementWithScale");
        }//, "findTotalIncrementWithScale");
        if (callFunctionKey.contains("findMeanIncrementWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanIncrementWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanIncrementWithScale");
        }//, "findMeanIncrementWithScale");
        if (callFunctionKey.contains("findMeanOfFilterDoubleArrayWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanOfFilterDoubleArrayWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanOfFilterDoubleArrayWithScale");
        }//, "findMeanOfFilterDoubleArrayWithScale");
        if (callFunctionKey.contains("findMeanOfDoubleArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanOfDoubleArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanOfDoubleArray");
        }//, "findMeanOfDoubleArray");
        if (callFunctionKey.contains("findMeanOfTwoDoubleArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanOfTwoDoubleArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanOfTwoDoubleArray");
        }//, "findMeanOfTwoDoubleArray");
        if (callFunctionKey.contains("findMeanOfTwoDoubleArray2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanOfTwoDoubleArray2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanOfTwoDoubleArray2D");
        }//, "findMeanOfTwoDoubleArray2D");
        if (callFunctionKey.contains("findMeanOfDoubleMatrix2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanOfDoubleMatrix2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanOfDoubleMatrix2D");
        }//, "findMeanOfDoubleMatrix2D");
        if (callFunctionKey.contains("findRowMeanOfDoubleMatrix2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findRowMeanOfDoubleMatrix2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findRowMeanOfDoubleMatrix2D");
        }//, "findRowMeanOfDoubleMatrix2D");
        if (callFunctionKey.contains("findCulumnMeanOfDoubleMatrix2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findCulumnMeanOfDoubleMatrix2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findCulumnMeanOfDoubleMatrix2D");
        }//, "findCulumnMeanOfDoubleMatrix2D");
        if (callFunctionKey.contains("findMeanOfDoubleMatrix3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanOfDoubleMatrix3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanOfDoubleMatrix3D");
        }//, "findMeanOfDoubleMatrix3D");
        if (callFunctionKey.contains("findMeanOfDoubleList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanOfDoubleList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanOfDoubleList");
        }//, "findMeanOfDoubleList");
        if (callFunctionKey.contains("findMeanOfMartrix1DList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanOfMartrix1DList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanOfMartrix1DList");
        }//, "findMeanOfMartrix1DList");
        if (callFunctionKey.contains("findMeanOfMartrix2DList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanOfMartrix2DList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanOfMartrix2DList");
        }//, "findMeanOfMartrix2DList");
        if (callFunctionKey.contains("findSumOfDoubleArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findSumOfDoubleArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findSumOfDoubleArray");
        }//, "findSumOfDoubleArray");
        if (callFunctionKey.contains("findSumOfTwoDoubleArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findSumOfTwoDoubleArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findSumOfTwoDoubleArray");
        }//, "findSumOfTwoDoubleArray");
        if (callFunctionKey.contains("findSumOfTwoDoubleArray2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findSumOfTwoDoubleArray2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findSumOfTwoDoubleArray2D");
        }//, "findSumOfTwoDoubleArray2D");
        if (callFunctionKey.contains("findSumOfDoubleMatrix2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findSumOfDoubleMatrix2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findSumOfDoubleMatrix2D");
        }//, "findSumOfDoubleMatrix2D");
        if (callFunctionKey.contains("findRowSumOfDoubleMatrix2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findRowSumOfDoubleMatrix2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findRowSumOfDoubleMatrix2D");
        }//, "findRowSumOfDoubleMatrix2D");
        if (callFunctionKey.contains("findCulumnSumOfDoubleMatrix2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findCulumnSumOfDoubleMatrix2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findCulumnSumOfDoubleMatrix2D");
        }//, "findCulumnSumOfDoubleMatrix2D");
        if (callFunctionKey.contains("findSumOfDoubleMatrix3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findSumOfDoubleMatrix3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findSumOfDoubleMatrix3D");
        }//, "findSumOfDoubleMatrix3D");
        if (callFunctionKey.contains("findSumOfDoubleList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findSumOfDoubleList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findSumOfDoubleList");
        }//, "findSumOfDoubleList");
        if (callFunctionKey.contains("findSumOfMartrix1DList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findSumOfMartrix1DList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findSumOfMartrix1DList");
        }//, "findSumOfMartrix1DList");
        if (callFunctionKey.contains("findSumOfMartrix2DList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findSumOfMartrix2DList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findSumOfMartrix2DList");
        }//, "findSumOfMartrix2DList");
        if (callFunctionKey.contains("getShareholdCount", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getShareholdCount(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getShareholdCount");
        }//, "getShareholdCount");
        if (callFunctionKey.contains("encodeEstimateSumOfScoresList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.encodeEstimateSumOfScoresList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "encodeEstimateSumOfScoresList");
        }//, "encodeEstimateSumOfScoresList");
        if (callFunctionKey.contains("encodeEstimateSumOfScoresArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.encodeEstimateSumOfScoresArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "encodeEstimateSumOfScoresArray");
        }//, "encodeEstimateSumOfScoresArray");
        if (callFunctionKey.contains("getEstimateCartesianSumOfScoresArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getEstimateCartesianSumOfScoresArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getEstimateCartesianSumOfScoresArray");
        }//, "getEstimateCartesianSumOfScoresArray");
        if (callFunctionKey.contains("getEstimateCartesian1DSumOfScoresArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getEstimateCartesian1DSumOfScoresArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getEstimateCartesian1DSumOfScoresArray");
        }//, "getEstimateCartesian1DSumOfScoresArray");
        if (callFunctionKey.contains("encodeEstimateInitonsScore", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.encodeEstimateInitonsScore(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "encodeEstimateInitonsScore");
        }//, "encodeEstimateInitonsScore");

        if (callFunctionKey.contains("decodeEstimateInitonsScore", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.decodeEstimateInitonsScore(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "decodeEstimateInitonsScore");
        }//, "decodeEstimateInitonsScore");
        if (callFunctionKey.contains("getRightsEstimateScore", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getRightsEstimateScore(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getRightsEstimateScore");
        }//, "getRightsEstimateScore");
        if (callFunctionKey.contains("getSimilarFuzzSetWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getSimilarFuzzSetWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getSimilarFuzzSetWithScale");
        }//, "getSimilarFuzzSetWithScale");
        if (callFunctionKey.contains("getDistanceRatio2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getDistanceRatio2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDistanceRatio2D");
        }//, "getDistanceRatio2D");
        if (callFunctionKey.contains("getARCDistanceRatio2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getARCDistanceRatio2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getARCDistanceRatio2D");
        }//, "getARCDistanceRatio2D");
        if (callFunctionKey.contains("getTrueARCDistanceRatio2D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getTrueARCDistanceRatio2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getTrueARCDistanceRatio2D");
        }//, "getTrueARCDistanceRatio2D");
        if (callFunctionKey.contains("getDistanceRatio3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getDistanceRatio3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDistanceRatio3D");
        }//, "getDistanceRatio3D");
        if (callFunctionKey.contains("getTrueARCDistanceRatio3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getTrueARCDistanceRatio3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getTrueARCDistanceRatio3D");
        }//, "getTrueARCDistanceRatio3D");
        if (callFunctionKey.contains("getPercentListByOuterKey", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPercentListByOuterKeyDoubleList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPercentListByOuterKey");
        }//, "getPercentListByOuterKey");
        if (callFunctionKey.contains("kernel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapP_VECS_C.kernel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "kernel");
        }//, "kernel");
        if (callFunctionKey.contains("kernelFix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapP_VECS_C.kernelFix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "kernelFix");
        }//, "kernelFix");
        if (callFunctionKey.contains("findTotalIncrementRatioWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findTotalIncrementRatioWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findTotalIncrementRatioWithScale");
        }//, "findTotalIncrementRatioWithScale");
        if (callFunctionKey.contains("findMeanIncrementRatioWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.findMeanIncrementRatioWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "findMeanIncrementRatioWithScale");
        }//, "findMeanIncrementRatioWithScale");
        if (callFunctionKey.contains("frequencyUpSplit", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.frequencyUpSplit(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "frequencyUpSplit");
        }//, "frequencyUpSplit");
        if (callFunctionKey.contains("frequencyDownSplit", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.frequencyDownSplit(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "frequencyDownSplit");
        }//, "frequencyDownSplit");
        if (callFunctionKey.contains("frequencyUpSplitWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.frequencyUpSplitWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "frequencyUpSplitWithScale");
        }//, "frequencyUpSplitWithScale");
        if (callFunctionKey.contains("frequencyDownSplitWithScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.frequencyDownSplitWithScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "frequencyDownSplitWithScale");
        }//, "frequencyDownSplitWithScale");


        if (callFunctionKey.contains("predictionResult", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.predictionResult(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "predictionResult");
        }//, "predictionResult");
        if (callFunctionKey.contains("predictionMatrixResult", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.predictionMatrixResult(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "predictionMatrixResult");
        }//, "predictionMatrixResult");
        if (callFunctionKey.contains("getImagePixClassificationMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getImagePixClassificationMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getImagePixClassificationMap");
        }//, "getImagePixClassificationMap");
        if (callFunctionKey.contains("getVWaveFromImagePix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getVWaveFromImagePix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getVWaveFromImagePix");
        }//, "getVWaveFromImagePix");
        if (callFunctionKey.contains("getHWaveFromImagePix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getHWaveFromImagePix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getHWaveFromImagePix");
        }//, "getHWaveFromImagePix");
        if (callFunctionKey.contains("getPixPercentByDeterPix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPixPercentByDeterPix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPixPercentByDeterPix");
        }//, "getPixPercentByDeterPix");
        if (callFunctionKey.contains("getClusterPercentByDeterPixGroup", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getClusterPercentByDeterPixGroup(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getClusterPercentByDeterPixGroup");
        }//, "getClusterPercentByDeterPixGroup");
        if (callFunctionKey.contains("getPixPercentByDeterPixGroup", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPixPercentByDeterPixGroup(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPixPercentByDeterPixGroup");
        }//, "getPixPercentByDeterPixGroup");
        if (callFunctionKey.contains("filterFusion2DSetsWithCountScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.filterFusion2DSetsWithCountScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "filterFusion2DSetsWithCountScale");
        }//, "filterFusion2DSetsWithCountScale");
        if (callFunctionKey.contains("filterFusion3DSetsWithCountScale", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.filterFusion3DSetsWithCountScale(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "filterFusion3DSetsWithCountScale");
        }//, "filterFusion3DSetsWithCountScale");
        if (callFunctionKey.contains("filterPosition2DsWithScaledDistance", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.filterPosition2DsWithScaledDistance(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "filterPosition2DsWithScaledDistance");
        }//, "filterPosition2DsWithScaledDistance");
        if (callFunctionKey.contains("filterPosition3DsWithScaledDistance", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.filterPosition3DsWithScaledDistanceMap3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "filterPosition3DsWithScaledDistance");
        }//, "filterPosition3DsWithScaledDistance");
        if (callFunctionKey.contains("filterPosition2DsWithScaledDistance", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.filterPosition2DsWithScaledDistanceMap2D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "filterPosition2DsWithScaledDistance");
        }//, "filterPosition2DsWithScaledDistance");
        if (callFunctionKey.contains("filterPosition3DsWithScaledDistance", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.filterPosition3DsWithScaledDistance3DList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "filterPosition3DsWithScaledDistance");
        }//, "filterPosition3DsWithScaledDistance");
        if (callFunctionKey.contains("getPercentListByOuterKey", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPercentListByOuterKeyDoubleList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPercentListByOuterKey");
        }//, "getPercentListByOuterKey");
        if (callFunctionKey.contains("getPercentArrayByOuterKey", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPercentArrayByOuterKey(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPercentArrayByOuterKey");
        }//, "getPercentArrayByOuterKey");
        if (callFunctionKey.contains("getEachPercentSetOfArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getEachPercentSetOfArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getEachPercentSetOfArray");
        }//, "getEachPercentSetOfArray");
        if (callFunctionKey.contains("getPercentArrayByOuterKey", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_VECS_C.getPercentArrayByOuterKey(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPercentArrayByOuterKey");
        }//, "getPercentArrayByOuterKey");
    }
}
