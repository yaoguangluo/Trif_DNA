package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapU_VECS_E;
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
public class StaticReflectionMapU_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings({"static-access", "unchecked"})
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;//later distinct a datamap and objectmap
        //IMV_SIQ inputValues

        if (callFunctionKey.contains("main", NE)) {
            staticFunctionMapU_VECS_C.main();//稍后分出去
            output.put("U_VECS_main", "void");//非void接口就直接put进去即可。
        }
        if (callFunctionKey.contains("getMapFromDoubleStringArray", NE)) {
            boolean find = false;
            IMV_SIQ inputValues = null;
            //取值方法, 先检查上一个接口
            if (null != output.get("lastInterfaceBackfeed")) {
                if (output.get("lastInterfaceBackfeed")
                    .toString().equalsIgnoreCase("success")) {
                    String lastInterfaceReturn = (String) output.get("lastInterfaceName");//取 上一次运行接口名
                    if (null != lastInterfaceReturn) {
                        IMV_SIQ lastReturns
                            = (IMV_SIQ) output.get(lastInterfaceReturn);//取上一次运行接口的返回结果。
                        inputValues = (IMV_SIQ) lastReturns.get("interfaceReturn");//
                        find = true;
                    }
                }
            }
            //检查上一个接口是否匹配;
            if (find) {
                //if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore", NE)) {
                //	find= true;
                //}else {
                //	find= false;
                //}
                for (int i = 0; i < 传参因子.length; i++) {//轮训传参 string i++
                    if (!inputValues.containsKey(传参因子[i])) {
                        find = false;
                    }
                }
            }
            //////////////////////////////////////////////////////////////////////////////////////

            //caoZuo方法, 就检查全局传参
            if (!find) {//当上一个接口没有返回这个接口需要的数据时, 就检查全局传参
                inputValues = (IMV_SIQ) output.get("inputValues");//取存储值
            }
            //检查特定输入参数是否匹配
            if (null != inputValues) {
                //if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore", NE)) {
                //	find= true;
                //}
                find = true;
                for (int i = 0; i < 传参因子.length; i++) {//轮训传参 string i++
                    if (!inputValues.containsKey(传参因子[i])) {
                        find = false;
                    }
                }
            }//本来想设计成插件模式, 但是速度降低100倍不止, 先不考虑,
            //////////////////////////////////////////////////////////////
            //检查是否能运行
            if (find) {
                //double[]  score= (double[] )inputValues.get("score");
                //String[] nameScore= (String[])inputValues.get("nameScore");
                //开始caoZuo
                map = staticFunctionMapU_VECS_C.getMapFromDoubleStringArray(NE);
            }
            if (find) {
                //存储方法
                IMV_SIQ returnValue = new IMV_SIQ();
                returnValue.put("interfaceReturn", map);
                //输出
                output.put(callFunctionKey, returnValue);
                output.put("lastInterfaceName", "getMapFromDoubleStringArray");//稍后设计成可 理论完美并行的模式。
                output.put("lastInterfaceBackfeed", "success");
            } else {
                output.put("lastInterfaceName", "getMapFromDoubleStringArray");
                output.put("lastInterfaceBackfeed", "faild");
            }
            return;
        }
        ;//下面类推同理
        if (callFunctionKey.contains("getMapFromIntStringArray", NE)) {
            //pre
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.getMapFromIntStringArray(NE);
            }
            //post
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getMapFromIntStringArray");
        }
        ;
        if (callFunctionKey.contains("getMapFromIntStringArray_ZhongYao", NE)) { //我在思考怎么设计以后总object自动识别 的那就 int string 这种type 都懒得小括号了。
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.getMapFromIntStringArray_ZhongYao(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getMapFromIntStringArray_ZhongYao");
        }
        ;
        if (callFunctionKey.contains("arrayToJson", NE)) {//java 竟然没有识别函数的传参类型的 数组返回函数。害的我一个一个的小括号手写
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.arrayToJson(NE);
                //我在思考怎么设计以后总object自动识别 的那就 Gson Object 这种type 都懒得小括号了。
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayToJson");
        }
        ;
        if (callFunctionKey.contains("arrayToXml", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.arrayToXml(NE);
                //java 竟然没有识别函数的传参类型的 数组返回函数。害的我一个一个的小括号手写
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayToXml");
        }
        ;
        if (callFunctionKey.contains("arrayToMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.arrayToMap(NE);
                //java 竟然没有识别函数的传参类型的 数组返回函数。害的我一个一个的小括号手写
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayToMap");
        }
        ;
        if (callFunctionKey.contains("arrayToVector", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.arrayToVector(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayToVector");
        }
        ;
        if (callFunctionKey.contains("arrayToList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C
                    .arrayToList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayToList");
        }
        ;
        if (callFunctionKey.contains("arrayToIterator", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.arrayToIterator(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayToIterator");
        }
        ;
        if (callFunctionKey.contains("arrayToSet", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.arrayToSet(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayToSet");
        }
        ;
        if (callFunctionKey.contains("arrayToMatrix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C
                    .arrayToMatrix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayToMatrix");
        }
        ;
        if (callFunctionKey.contains("arrayToMatrix3D", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.arrayToMatrix3D(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayToMatrix3D");
        }
        ;
        if (callFunctionKey.contains("xlsOrCsvFileToObjectMartix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.xlsOrCsvFileToObjectMartix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "xlsOrCsvFileToObjectMartix");
        }
        ;
        if (callFunctionKey.contains("xlsOrCsvFileToListObject", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.xlsOrCsvFileToListObject(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "xlsOrCsvFileToListObject");
        }
        ;
        if (callFunctionKey.contains("xlsOrCsvFileToRangedListObject", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.xlsOrCsvFileToRangedListObject(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "xlsOrCsvFileToRangedListObject");
        }
        ;
        if (callFunctionKey.contains("xlsOrCsvFileToRangedObjectMartix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.xlsOrCsvFileToRangedObjectMartix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "xlsOrCsvFileToRangedObjectMartix");
        }
        ;
        if (callFunctionKey.contains("dateToGMTString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.dateToGMTString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "dateToGMTString");
        }
        ;
        if (callFunctionKey.contains("dateToYYYYMMDD", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.dateToYYYYMMDD(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "dateToYYYYMMDD");
        }
        ;
        if (callFunctionKey.contains("dateToHHMMSS", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.dateToHHMMSS(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "dateToHHMMSS");
        }
        ;
        if (callFunctionKey.contains("dateToMiliSeconds", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.dateToMiliSeconds(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "dateToMiliSeconds");
        }
        ;
        if (callFunctionKey.contains("getCurrentMiliSeconds", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.getCurrentMiliSeconds(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCurrentMiliSeconds");
        }
        ;
        if (callFunctionKey.contains("dateToTimeStamp", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.dateToTimeStamp(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "dateToTimeStamp");
        }
        ;
        if (callFunctionKey.contains("timeStampToMiliSeconds", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.timeStampToMiliSeconds(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "timeStampToMiliSeconds");
        }
        ;
        if (callFunctionKey.contains("timeStampToMiliSecondsWithSize", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.timeStampToMiliSecondsWithSize(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "timeStampToMiliSecondsWithSize");
        }
        ;
        if (callFunctionKey.contains("dateStringToMiliSeconds", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.dateStringToMiliSeconds(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "dateStringToMiliSeconds");
        }
        ;
        if (callFunctionKey.contains("hashTableToJson", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.hashTableToJson(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "hashTableToJson");
        }
        ;
        if (callFunctionKey.contains("hashTableToXml", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.hashTableToXml(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "hashTableToXml");
        }
        ;
        if (callFunctionKey.contains("hashTableToList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.hashTableToList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "hashTableToList");
        }
        ;
        if (callFunctionKey.contains("hashTableToObjectArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.hashTableToObjectArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "hashTableToObjectArray");
        }
        ;
        if (callFunctionKey.contains("getJson", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.getJson(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getJson");
        }
        ;
        if (callFunctionKey.contains("postXML", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.postXML(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "postXML");
        }
        ;
        if (callFunctionKey.contains("postJsonWithSercurity", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.postJsonWithSercurity(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "postJsonWithSercurity");
        }
        ;
        if (callFunctionKey.contains("postXMLWithSercurity", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.postXMLWithSercurity(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "postXMLWithSercurity");
        }
        ;
        if (callFunctionKey.contains("getHTML", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.getHTML(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getHTML");
        }
        ;
        if (callFunctionKey.contains("pixTableToFile", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_VECS_C.pixTableToFile(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "pixTableToFile");
        }
        ;
        if (callFunctionKey.contains("pixRGBTableToFile", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_VECS_C.pixRGBTableToFile(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "pixRGBTableToFile");
        }
        ;
        if (callFunctionKey.contains("bufferedImageToFile", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_VECS_C.bufferedImageToFile(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "bufferedImageToFile");
        }
        ;
        if (callFunctionKey.contains("imageToFile", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_VECS_C.imageToFile(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "imageToFile");
        }
        ;
        if (callFunctionKey.contains("bufferedImageToScaleImageFile", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapU_VECS_C.bufferedImageToScaleImageFile(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "bufferedImageToScaleImageFile");
        }
        ;
        if (callFunctionKey.contains("waveImageFileToArrayWithBlack", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.waveImageFileToArrayWithBlack(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "waveImageFileToArrayWithBlack");
        }
        ;
        if (callFunctionKey.contains("waveImageToArrayWithBlack", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C
                    .waveImageToArrayWithBlack(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "waveImageToArrayWithBlack");
        }
        ;
        if (callFunctionKey.contains("waveImageToArrayWithColor", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.waveImageToArrayWithColor(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "waveImageToArrayWithColor");
        }
        ;
        if (callFunctionKey.contains("waveImageFileToArrayWithColor", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C
                    .waveImageFileToArrayWithColor(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "waveImageFileToArrayWithColor");
        }
        ;
        if (callFunctionKey.contains("waveImageFileToArrayMapWithBlack", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.waveImageFileToArrayMapWithBlack(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "waveImageFileToArrayMapWithBlack");
        }
        ;
        if (callFunctionKey.contains("waveImageToArrayMapWithBlack", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C
                    .waveImageToArrayMapWithBlack(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "waveImageToArrayMapWithBlack");
        }
        ;
        if (callFunctionKey.contains("toolkitImageIconToBufferImage", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.toolkitImageIconToBufferImage(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "toolkitImageIconToBufferImage");
        }
        ;
        if (callFunctionKey.contains("toolkitImageToBufferImage", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.toolkitImageToBufferImage(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "toolkitImageToBufferImage");
        }
        ;
        if (callFunctionKey.contains("toolkitImageToBufferImageAboutIconConfig", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C
                    .toolkitImageToBufferImageAboutIconConfig(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "toolkitImageToBufferImageAboutIconConfig");
        }
        ;
        if (callFunctionKey.contains("iteratorToJsonString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.iteratorToJsonString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "iteratorToJsonString");
        }
        ;
        if (callFunctionKey.contains("stringIteratorToJsonString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringIteratorToJsonString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringIteratorToJsonString");
        }
        ;
        if (callFunctionKey.contains("iteratorToXml", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.iteratorToXml(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "iteratorToXml");
        }
        ;
        if (callFunctionKey.contains("iteratorToMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.iteratorToMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "iteratorToMap");
        }
        ;
        if (callFunctionKey.contains("iteratorToObjectArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.iteratorToObjectArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "iteratorToObjectArray");
        }
        ;
        if (callFunctionKey.contains("iteratorToList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.iteratorToList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "iteratorToList");
        }
        ;
        if (callFunctionKey.contains("jsonArrayToList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.jsonArrayToList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "jsonArrayToList");
        }
        ;
        if (callFunctionKey.contains("jsonObjectToString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.jsonObjectToString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "jsonObjectToString");
        }
        ;
        if (callFunctionKey.contains("jsonObjectToHashtable", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.jsonObjectToHashtable(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "jsonObjectToHashtable");
        }
        ;
        if (callFunctionKey.contains("jsonObjectToXml", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.jsonObjectToXml(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "jsonObjectToXml");
        }
        ;
        if (callFunctionKey.contains("listToJsonString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.listToJsonString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listToJsonString");
        }
        ;
        if (callFunctionKey.contains("stringListToJsonString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringListToJsonString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringListToJsonString");
        }
        ;
        if (callFunctionKey.contains("listToXml", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.listToXml(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listToXml");
        }
        ;
        if (callFunctionKey.contains("listToMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.listToMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listToMap");
        }
        ;
        if (callFunctionKey.contains("listToObjectArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.listToObjectArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listToObjectArray");
        }
        ;
        if (callFunctionKey.contains("stringlistToStringArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringlistToStringArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringlistToStringArray");
        }
        ;
        if (callFunctionKey.contains("listToIterator", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.listToIterator(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listToIterator");
        }
        ;
        if (callFunctionKey.contains("listToVector", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.listToVector(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listToVector");
        }
        ;
        if (callFunctionKey.contains("listToSet", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.listToSet(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listToSet");
        }
        ;
        if (callFunctionKey.contains("listToArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.listToArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "listToArray");
        }
        ;
        if (callFunctionKey.contains("mapToList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.mapToList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "mapToList");
        }
        ;
        if (callFunctionKey.contains("mapToHash", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.mapToHash(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "mapToHash");
        }
        ;
        if (callFunctionKey.contains("jnisort", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.sort(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "jnisort");
        }
        ;
        if (callFunctionKey.contains("xmlToList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.xmlToList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "xmlToList");
        }
        ;
        if (callFunctionKey.contains("xmlToVector", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.xmlToVector(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "xmlToVector");
        }
        ;
        if (callFunctionKey.contains("xmlToSets", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.xmlToSets(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "xmlToSets");
        }
        ;
        if (callFunctionKey.contains("xmlToHashtable", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.xmlToHashtable(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "xmlToHashtable");
        }
        ;
        if (callFunctionKey.contains("txtFileToObjectMatrix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C
                    .txtFileToObjectMatrix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "txtFileToObjectMatrix");
        }
        ;
        if (callFunctionKey.contains("txtFileToObjectMatrixWithRange", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.txtFileToObjectMatrixWithRange(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "txtFileToObjectMatrixWithRange");
        }
        ;
        if (callFunctionKey.contains("txtFileToListStringWithRange", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.txtFileToListStringWithRange(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "txtFileToListStringWithRange");
        }
        ;
        if (callFunctionKey.contains("txtFileToListString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.txtFileToListString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "txtFileToListString");
        }
        ;
        if (callFunctionKey.contains("txtFileToListStringArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.txtFileToListStringArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "txtFileToListStringArray");
        }
        ;
        if (callFunctionKey.contains("vectorToMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.vectorToMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "vectorToMap");
        }
        ;
        if (callFunctionKey.contains("vectorToList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.vectorToList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "vectorToList");
        }
        ;
        if (callFunctionKey.contains("vectorToArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.vectorToArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "vectorToArray");
        }
        ;
        if (callFunctionKey.contains("vectorToIterator", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.vectorToIterator(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "vectorToIterator");
        }
        ;
        if (callFunctionKey.contains("vectorToJsonString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.vectorToJsonString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "vectorToJsonString");
        }
        ;
        if (callFunctionKey.contains("vectorToSet", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.vectorToSet(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "vectorToSet");
        }
        ;
        if (callFunctionKey.contains("stringBuilderToCharArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringBuilderToCharArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringBuilderToCharArray");
        }
        ;
        if (callFunctionKey.contains("stringBuilderToString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringBuilderToString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringBuilderToString");
        }
        ;
        if (callFunctionKey.contains("stringBuilderToJson", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringBuilderToJson(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringBuilderToJson");
        }
        ;
        if (callFunctionKey.contains("stringBuilderToXml", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringBuilderToXml(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringBuilderToXml");
        }
        ;
        if (callFunctionKey.contains("stringBuilderToSplitArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringBuilderToSplitArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringBuilderToSplitArray");
        }
        ;
        if (callFunctionKey.contains("stringBuilderToMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringBuilderToMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringBuilderToMap");
        }
        ;
        if (callFunctionKey.contains("stringToArray", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringToArray(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringToArray");
        }
        ;
        if (callFunctionKey.contains("stringArrayToString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringArrayToString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringArrayToString");
        }
        ;
        if (callFunctionKey.contains("stringToURIencode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringToURIencode(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringToURIencode");
        }
        ;
        if (callFunctionKey.contains("stringToURIencode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringToURIencode(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringToURIencode");
        }
        ;
        if (callFunctionKey.contains("uRIencodeToURIdecode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.uRIencodeToURIdecode(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "uRIencodeToURIdecode");
        }
        ;
        if (callFunctionKey.contains("uRIencodeToURIdecode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.uRIencodeToURIdecode(NE);//later do duplication.
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "uRIencodeToURIdecode");
        }
        ;
        if (callFunctionKey.contains("stringToCharASCII", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.stringToCharASCII(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "stringToCharASCII");
        }
        ;
        if (callFunctionKey.contains("charsetSwap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.charsetSwap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "charsetSwap");
        }
        ;
        if (callFunctionKey.contains("objectToJsonString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.objectToJsonString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "objectToJsonString");
        }
        ;
        if (callFunctionKey.contains("matrixShiftSwapXYZ", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixShiftSwapXYZ(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixShiftSwapXYZ");
        }
        ;
        if (callFunctionKey.contains("matrixInclineSwapXY", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixInclineSwapXY(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixInclineSwapXY");
        }
        ;
        if (callFunctionKey.contains("matrixInclineSwapXZ", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixInclineSwapXZ(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixInclineSwapXZ");
        }
        ;
        if (callFunctionKey.contains("matrixInclineSwapYZ", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixInclineSwapYZ(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixInclineSwapYZ");
        }
        ;
        if (callFunctionKey.contains("matrixReverseSwapT", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixReverseSwapT(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixReverseSwapT");
        }
        ;
        if (callFunctionKey.contains("matrixReverseSwapXY", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixReverseSwapXY(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixReverseSwapXY");
        }
        ;
        if (callFunctionKey.contains("matrixReverseSwapXZ", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixReverseSwapXZ(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixReverseSwapXZ");
        }
        ;
        if (callFunctionKey.contains("matrixReverseSwapYZ", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixReverseSwapYZ(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixReverseSwapYZ");
        }
        ;
        if (callFunctionKey.contains("matrixToArrayM", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixToArrayM(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixToArrayM");
        }
        ;
        if (callFunctionKey.contains("matrixInclineSwap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixInclineSwap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixInclineSwap");
        }
        ;
        if (callFunctionKey.contains("matrixPostSwap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixPostSwap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixPostSwap");
        }
        ;
        if (callFunctionKey.contains("matrixInSwap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixInSwap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixInSwap");
        }
        ;
        if (callFunctionKey.contains("matrixReverseSwap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixReverseSwapM(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixReverseSwap");
        }
        ;
        if (callFunctionKey.contains("matrixToArrayT", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapU_VECS_C.matrixToArrayT(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixToArrayT");
        }
        ;
    }
}
