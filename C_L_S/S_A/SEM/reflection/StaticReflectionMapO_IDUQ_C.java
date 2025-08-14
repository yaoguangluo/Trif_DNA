package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapO_IDUQ_E;
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
public class StaticReflectionMapO_IDUQ_C {
    public static Map<String, String> annotationMap = new IMV_SIQ();

    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_C, IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("U_", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                //java 虚拟机完全可以在 代入的时候将object 自动去匹配成传参类型的, 不能转就null
                //, 高斯林故意的 不写一个exception 处理模块。所以我就累。
                staticFunctionMapO_IDUQ_C.U_(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "U_");
        }
        ;
        if (callFunctionKey.contains("getRandomDNAkey", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_IDUQ_C.getRandomDNAkey(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getRandomDNAkey");
        }
        ;
        if (callFunctionKey.contains("Save", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_IDUQ_C.Save(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "Save");
        }
        ;
        if (callFunctionKey.contains("bootCell", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_IDUQ_C.bootCell(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "bootCell");
        }
        ;
        if (callFunctionKey.contains("BootNeroDoc", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapO_IDUQ_C.BootNeroDoc(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "BootNeroDoc");
        }
        ;
        if (callFunctionKey.contains("vpcsRegister", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_IDUQ_C.vpcsRegister(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "vpcsRegister");
        }
        ;
        if (callFunctionKey.contains("register", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapO_IDUQ_C.register(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "register");
        }
        ;
    }
}
