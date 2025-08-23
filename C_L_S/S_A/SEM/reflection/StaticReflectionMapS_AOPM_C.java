package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapS_AOPM_E;
import S_A.pheromone.IMV_SIQ;

import java.util.Map;

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
public class StaticReflectionMapS_AOPM_C {
    public static Map<String, String> annotationMap = new IMV_SIQ();

    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("DropCellPLSQL", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.DropCellPLSQL(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DropCellPLSQL");
        }
        ;
        if (callFunctionKey.contains("DropCellORM", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.DropCellORM(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DropCellORM");
        }
        ;
        if (callFunctionKey.contains("DeleteCellORM", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.DeleteCellORM(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DeleteCellORM");
        }
        ;
        if (callFunctionKey.contains("DeleteCellPLSQL", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.DeleteCellPLSQL(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DeleteCellPLSQL");
        }
        ;
        if (callFunctionKey.contains("InsertCellORM", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.InsertCellORM(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "InsertCellORM");
        }
        ;
        if (callFunctionKey.contains("InsertCellPLSQL", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.InsertCellPLSQL(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "InsertCellPLSQL");
        }
        ;
        if (callFunctionKey.contains("UpdateCellORM", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.UpdateCellORM(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "UpdateCellORM");
        }
        ;
        if (callFunctionKey.contains("UpdateCellORMByRowId", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.UpdateCellORMByRowId(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "UpdateCellORMByRowId");
        }
        ;
        if (callFunctionKey.contains("UpdateCellORMByEquals", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.UpdateCellORMByEquals(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "UpdateCellORMByEquals");
        }
        ;
        if (callFunctionKey.contains("UpdateCellPLSQL", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapS_AOPM_C.UpdateCellPLSQL(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "UpdateCellPLSQL");
        }
        ;
        if (callFunctionKey.contains("creatMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapS_AOPM_C.creatMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "creatMap");
        }
        ;
    }
}
