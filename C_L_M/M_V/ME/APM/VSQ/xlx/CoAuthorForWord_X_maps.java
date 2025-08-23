package M_V.ME.APM.VSQ.xlx;

import VSQ.threeD.flowers.CoAuthorForWord_X_S;

import java.util.LinkedHashMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CoAuthorForWord_X_maps extends CoAuthorForWord_X_S {

    public void bootCommonMap(String string, boolean isButton
        , CommonRotClass commonRotClass) {
        if (rootWord == null) {
            return;
        }
        if (rootWord.equalsIgnoreCase(string) && isButton == false) {
            return;
        }
        if (null == commonRotClass.inputs) {
            return;
        }
        rootWord = string;
        //rootLeaf.clear();
        findLeaf.clear();
        frequencyLeaf.clear();
        findLeaf.put(rootWord, 1);
        frequencyLeaf.put(rootWord, 1);
        LinkedHashMap<String, Object> leaf = new LinkedHashMap<>();
        LinkedHashMap<String, Object> subLeaf = new LinkedHashMap<>();
        for (int i = 0; i < commonRotClass.inputs.length; i++) {
            subLeaf.put(commonRotClass.inputs[i].toString()
                , new LinkedHashMap<String, Object>());
        }
        leaf.put(rootWord, subLeaf);
        commonRotClass.rootLeaf = subLeaf;
    }
}
//subLeaf.put("浆-花色-", new IMV_SIQ());
//subLeaf.put("灰-曲直-", new IMV_SIQ());
//subLeaf.put("林-呼怒-", new IMV_SIQ());
//subLeaf.put("山-歌意-", new IMV_SIQ());
//subLeaf.put("岸-禾蔷-", new IMV_SIQ());
//subLeaf.put("北坎-河-恐呻", new IMV_SIQ());
//subLeaf.put("溪-润健-", new IMV_SIQ());
//subLeaf.put("沼-悦魄-", new IMV_SIQ());
//subLeaf.put("石-商忧-", new IMV_SIQ());
//subLeaf.put("岩-思顺-", new IMV_SIQ());
//subLeaf.put("沙-宫赤-", new IMV_SIQ());

//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[11];
//	commonRotClass.inputs[0]= new String("浆-花色-");  
//	commonRotClass.inputs[1]= new String("灰-曲直-");
//	commonRotClass.inputs[2]= new String("林-呼怒-");
//	commonRotClass.inputs[3]= new String("山-歌意-");
//	commonRotClass.inputs[4]= new String("岸-禾蔷-");
//	commonRotClass.inputs[5]= new String("北坎-河-恐呻");
//	commonRotClass.inputs[6]= new String("溪-润健-");
//	commonRotClass.inputs[7]= new String("沼-悦魄-");
//	commonRotClass.inputs[8]= new String("石-商忧-");
//	commonRotClass.inputs[9]= new String("岩-思顺-");
//	commonRotClass.inputs[10]= new String("沙-宫赤-");
//}
//subLeaf.put("马-午丞-灵境-甲午刑-休加制", new IMV_SIQ());
//subLeaf.put("蛇-巳云-新象-辰戌刑", new IMV_SIQ());
//subLeaf.put("龙-辰云-新象-辰戌刑", new IMV_SIQ());
//subLeaf.put("兔-卯力-凶伤-开惊加制", new IMV_SIQ());
//subLeaf.put("虎-寅月-山亭-甲申刑-殇杜加制", new IMV_SIQ());
//subLeaf.put("牛-丑月-山亭-甲申刑-殇杜加制", new IMV_SIQ());
//subLeaf.put("鼠-子目-屯才-生死加制", new IMV_SIQ());
//subLeaf.put("猪-亥口-阴池-丙丁奇门", new IMV_SIQ());
//subLeaf.put("狗-戌口-阴池-丙丁奇门", new IMV_SIQ());
//subLeaf.put("鸡-酉早-水阁-丙丁奇门", new IMV_SIQ());
//subLeaf.put("猴-申因-枯木-甲戊刑", new IMV_SIQ());
//subLeaf.put("羊-未因-枯木-甲戊刑", new IMV_SIQ());


//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[12];
//	commonRotClass.inputs[0]= new String("马-午丞-灵境-甲午刑-休加制");  
//	commonRotClass.inputs[1]= new String("蛇-巳云-新象-辰戌刑");
//	commonRotClass.inputs[2]= new String("龙-辰云-新象-辰戌刑");
//	commonRotClass.inputs[3]= new String("兔-卯力-凶伤-开惊加制");
//	commonRotClass.inputs[4]= new String("虎-寅月-山亭-甲申刑-殇杜加制");
//	commonRotClass.inputs[5]= new String("牛-丑月-山亭-甲申刑-殇杜加制");
//	commonRotClass.inputs[6]= new String("鼠-子目-屯才-生死加制");
//	commonRotClass.inputs[7]= new String("猪-亥口-阴池-丙丁奇门");
//	commonRotClass.inputs[8]= new String("狗-戌口-阴池-丙丁奇门");
//	commonRotClass.inputs[9]= new String("鸡-酉早-水阁-丙丁奇门");
//	commonRotClass.inputs[10]= new String("猴-申因-枯木-甲戊刑");
//	commonRotClass.inputs[11]= new String("羊-未因-枯木-甲戊刑");
//}
//subLeaf.put("景-层乱枯紫稠急-疏同", new IMV_SIQ());
//subLeaf.put("杜-散灿鲜靛急瀑", new IMV_SIQ());
//subLeaf.put("殇-衣嫩蓝青微湍", new IMV_SIQ());
//subLeaf.put("生-软柔黄珊细缓", new IMV_SIQ());
//subLeaf.put("修-滑透墨辉绵平-枢密", new IMV_SIQ());
//subLeaf.put("开-坚鲜浓红呼清", new IMV_SIQ());
//subLeaf.put("精-纯淡红橙当浊", new IMV_SIQ());
//subLeaf.put("陨-混浓棕黄刺污", new IMV_SIQ());

//
//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[8];
//	commonRotClass.inputs[0]= new String("景-层乱枯紫稠急-疏同");  
//	commonRotClass.inputs[1]= new String("杜-散灿鲜靛急瀑");
//	commonRotClass.inputs[2]= new String("殇-衣嫩蓝青微湍");
//	commonRotClass.inputs[3]= new String("生-软柔黄珊细缓");
//	commonRotClass.inputs[4]= new String("修-滑透墨辉绵平-枢密");
//	commonRotClass.inputs[5]= new String("开-坚鲜浓红呼清");
//	commonRotClass.inputs[6]= new String("精-纯淡红橙当浊");
//	commonRotClass.inputs[7]= new String("陨-混浓棕黄刺污");
//}

//subLeaf.put("午-天广-酉", new IMV_SIQ());
//subLeaf.put("丙-太威-辛", new IMV_SIQ());
//subLeaf.put("巳-天屏-酉", new IMV_SIQ());
//subLeaf.put("巽-太乙-Kui", new IMV_SIQ());
//subLeaf.put("辰-天罡-Li", new IMV_SIQ());
//subLeaf.put("乙-天宫-甲", new IMV_SIQ());
//subLeaf.put("卯-天苑-丁", new IMV_SIQ());
//subLeaf.put("甲-天苑-丙", new IMV_SIQ());
//
//subLeaf.put("寅-天培-未", new IMV_SIQ());
//subLeaf.put("艮-天市-丁", new IMV_SIQ());
//subLeaf.put("丑-天厨-辰", new IMV_SIQ());
//subLeaf.put("Kui-阴光-巳", new IMV_SIQ());
//subLeaf.put("子-天垒-巳", new IMV_SIQ());
//subLeaf.put("壬-天辅-申", new IMV_SIQ());
//subLeaf.put("亥-天皇-乙", new IMV_SIQ());
//subLeaf.put("乾-天庭-卯", new IMV_SIQ());
//
//subLeaf.put("戌-天魁-丑", new IMV_SIQ());
//subLeaf.put("辛-天乙-丑", new IMV_SIQ());
//subLeaf.put("酉-少微-寅", new IMV_SIQ());
//subLeaf.put("庚-天汉-午", new IMV_SIQ());
//subLeaf.put("申-天关-Kui", new IMV_SIQ());
//subLeaf.put("坤-天镜-乙", new IMV_SIQ());
//subLeaf.put("未-天常-Kui", new IMV_SIQ());
//subLeaf.put("丁-南极-寅", new IMV_SIQ());
//
//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[24];
//	commonRotClass.inputs[0]= new String("午-天广-酉");  
//	commonRotClass.inputs[1]= new String("丙-太威-辛");
//	commonRotClass.inputs[2]= new String("巳-天屏-酉");
//	commonRotClass.inputs[3]= new String("巽-太乙-Kui");
//	commonRotClass.inputs[4]= new String("辰-天罡-Li");
//	commonRotClass.inputs[5]= new String("乙-天宫-甲");
//	commonRotClass.inputs[6]= new String("卯-天苑-丁");
//	commonRotClass.inputs[7]= new String("甲-天苑-丙");
//	
//	commonRotClass.inputs[8]=  new String("寅-天培-未");  
//	commonRotClass.inputs[9]=  new String("艮-天市-丁");
//	commonRotClass.inputs[10]= new String("丑-天厨-辰");
//	commonRotClass.inputs[11]= new String("Kui-阴光-巳");
//	commonRotClass.inputs[12]= new String("子-天垒-巳");
//	commonRotClass.inputs[13]= new String("壬-天辅-申");
//	commonRotClass.inputs[14]= new String("亥-天皇-乙");
//	commonRotClass.inputs[15]= new String("乾-天庭-卯");
//	
//	
//	commonRotClass.inputs[16]= new String("戌-天魁-丑");  
//	commonRotClass.inputs[17]= new String("辛-天乙-丑");
//	commonRotClass.inputs[18]= new String("酉-少微-寅");
//	commonRotClass.inputs[19]= new String("庚-天汉-午");
//	commonRotClass.inputs[20]= new String("申-天关-Kui");
//	commonRotClass.inputs[21]= new String("坤-天镜-乙");
//	commonRotClass.inputs[22]= new String("未-天常-Kui");
//	commonRotClass.inputs[23]= new String("丁-南极-寅");
//}
//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[8];
//	commonRotClass.inputs[0]= new String("心 小肠 离 腕踝上 经");  
//	commonRotClass.inputs[1]= new String("胆 肝 巽 掌趾前 荥");
//	commonRotClass.inputs[2]= new String("胆 肝 震 掌趾前 荥");
//	commonRotClass.inputs[3]= new String("血 胃 艮 肘膝中 合");
//	commonRotClass.inputs[4]= new String("肾 膀胱 坎 掌趾后 输");
//	commonRotClass.inputs[5]= new String("大肠 乾 手足端 井");
//	commonRotClass.inputs[6]= new String("肺 兑 手足端 井");
//	commonRotClass.inputs[7]= new String("血 脾 坤 肘膝中 合");
//}
//if(null== commonRotClass.inputs) {
//commonRotClass.inputs= new String[8];
//commonRotClass.inputs[0]= new String("上焦-血分-营分-心-小肠");  
//commonRotClass.inputs[1]= new String("气分-胆-股");
//commonRotClass.inputs[2]= new String("下焦-气分-血分-肝-足");
//commonRotClass.inputs[3]= new String("中焦-气分-胃-手");
//commonRotClass.inputs[4]= new String("下焦-血分-卫分-耳-肾-膀胱");
//commonRotClass.inputs[5]= new String("气分-大肠-首-健");
//commonRotClass.inputs[6]= new String("上焦-卫分-肺-口");
//commonRotClass.inputs[7]= new String("中焦-血分-脾-腹");
//}
//640
////		subLeaf.put("03-白羊-土-3m21_4m19", new IMV_SIQ());
//subLeaf.put("04-金牛-金-4m20_5m20", new IMV_SIQ());
//subLeaf.put("05-双子-金-5m21_6m21", new IMV_SIQ());
//subLeaf.put("06-巨蟹-土-6m22_7m22", new IMV_SIQ());
//subLeaf.put("07-狮子-火-7m23_8m22", new IMV_SIQ());
//subLeaf.put("08-处女-火-8m23_9m22", new IMV_SIQ());
//subLeaf.put("09-天枰-土-9m23_10m23", new IMV_SIQ());
//subLeaf.put("10-天蝎-木-10m24_11m22", new IMV_SIQ());
//subLeaf.put("11-射手-木-11m23_12m21", new IMV_SIQ());
//subLeaf.put("12-魔蝎-土-12m22_1m19", new IMV_SIQ());
//subLeaf.put("01-水瓶-水-1m20_2m18", new IMV_SIQ());
//subLeaf.put("02-双鱼-水-2m19_3m20", new IMV_SIQ());
//
//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[12];
//	commonRotClass.inputs[0]= new String("03-白羊-土-3m21_4m19");  
//	commonRotClass.inputs[1]= new String("04-金牛-金-4m20_5m20");
//	commonRotClass.inputs[2]= new String("05-双子-金-5m21_6m21");
//	commonRotClass.inputs[3]= new String("06-巨蟹-土-6m22_7m22");
//	commonRotClass.inputs[4]= new String("07-狮子-火-7m23_8m22");
//	commonRotClass.inputs[5]= new String("08-处女-火-8m23_9m22");
//	commonRotClass.inputs[6]= new String("09-天枰-土-9m23_10m23");
//	commonRotClass.inputs[7]= new String("10-天蝎-木-10m24_11m22");
//	commonRotClass.inputs[8]= new String("11-射手-木-11m23_12m21");
//	commonRotClass.inputs[9]= new String("12-魔蝎-土-12m22_1m19");
//	commonRotClass.inputs[10]= new String("01-水瓶-水-1m20_2m18");
//	commonRotClass.inputs[11]= new String("02-双鱼-水-2m19_3m20");
//}
//737
//if(null== inputs) {
//inputs= new String[8];
//inputs[0]="心 小肠 离 腕踝上 经";
//inputs[1]="胆 肝 巽 掌趾前 荥";
//inputs[2]="胆 肝 震 掌趾前 荥";
//inputs[3]="血 胃 艮 肘膝中 合";
//inputs[4]="肾 膀胱 坎 掌趾后 输";
//inputs[5]="大肠 乾 手足端 井";
//inputs[6]="肺 兑 手足端 井";
//inputs[7]="血 脾 坤 肘膝中 合";
//}
//
//691
//subLeaf.put("上焦-血分-营分-心-小肠", new IMV_SIQ());
//subLeaf.put("气分-胆-股", new IMV_SIQ());
//subLeaf.put("下焦-气分-血分-肝-足", new IMV_SIQ());
//subLeaf.put("中焦-气分-胃-手", new IMV_SIQ());
//subLeaf.put("下焦-血分-卫分-耳-肾-膀胱", new IMV_SIQ());
//subLeaf.put("气分-大肠-首-健", new IMV_SIQ());
//subLeaf.put("上焦-卫分-肺-口", new IMV_SIQ());
//subLeaf.put("中焦-血分-脾-腹", new IMV_SIQ());
//
//640
//subLeaf.put("03-白羊-土-3m21_4m19", new IMV_SIQ());
//subLeaf.put("04-金牛-金-4m20_5m20", new IMV_SIQ());
//subLeaf.put("05-双子-金-5m21_6m21", new IMV_SIQ());
//subLeaf.put("06-巨蟹-土-6m22_7m22", new IMV_SIQ());
//subLeaf.put("07-狮子-火-7m23_8m22", new IMV_SIQ());
//subLeaf.put("08-处女-火-8m23_9m22", new IMV_SIQ());
//subLeaf.put("09-天枰-土-9m23_10m23", new IMV_SIQ());
//subLeaf.put("10-天蝎-木-10m24_11m22", new IMV_SIQ());
//subLeaf.put("11-射手-木-11m23_12m21", new IMV_SIQ());
//subLeaf.put("12-魔蝎-土-12m22_1m19", new IMV_SIQ());
//subLeaf.put("01-水瓶-水-1m20_2m18", new IMV_SIQ());
//subLeaf.put("02-双鱼-水-2m19_3m20", new IMV_SIQ());
//
//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[12];
//	commonRotClass.inputs[0]= new String("03-白羊-土-3m21_4m19");  
//	commonRotClass.inputs[1]= new String("04-金牛-金-4m20_5m20");
//	commonRotClass.inputs[2]= new String("05-双子-金-5m21_6m21");
//	commonRotClass.inputs[3]= new String("06-巨蟹-土-6m22_7m22");
//	commonRotClass.inputs[4]= new String("07-狮子-火-7m23_8m22");
//	commonRotClass.inputs[5]= new String("08-处女-火-8m23_9m22");
//	commonRotClass.inputs[6]= new String("09-天枰-土-9m23_10m23");
//	commonRotClass.inputs[7]= new String("10-天蝎-木-10m24_11m22");
//	commonRotClass.inputs[8]= new String("11-射手-木-11m23_12m21");
//	commonRotClass.inputs[9]= new String("12-魔蝎-土-12m22_1m19");
//	commonRotClass.inputs[10]= new String("01-水瓶-水-1m20_2m18");
//	commonRotClass.inputs[11]= new String("02-双鱼-水-2m19_3m20");
//}
//subLeaf.put("夏至", new IMV_SIQ());
//subLeaf.put("芒种", new IMV_SIQ());
//subLeaf.put("小满", new IMV_SIQ());
//subLeaf.put("立夏", new IMV_SIQ());
//subLeaf.put("谷雨", new IMV_SIQ());
//
//subLeaf.put("清明", new IMV_SIQ());
//subLeaf.put("春分", new IMV_SIQ());
//subLeaf.put("惊蛰", new IMV_SIQ());
//subLeaf.put("雨水", new IMV_SIQ());
//subLeaf.put("立春", new IMV_SIQ());
//
//subLeaf.put("大寒", new IMV_SIQ());
//subLeaf.put("小寒", new IMV_SIQ());
//subLeaf.put("冬至", new IMV_SIQ());
//subLeaf.put("大雪", new IMV_SIQ());
//subLeaf.put("小雪", new IMV_SIQ());
//
//subLeaf.put("立冬", new IMV_SIQ());
//subLeaf.put("霜降", new IMV_SIQ());
//subLeaf.put("寒露", new IMV_SIQ());
//subLeaf.put("秋分", new IMV_SIQ());
//subLeaf.put("白露", new IMV_SIQ());
//
//subLeaf.put("处暑", new IMV_SIQ());
//subLeaf.put("立秋", new IMV_SIQ());
//subLeaf.put("大暑", new IMV_SIQ());
//subLeaf.put("小暑", new IMV_SIQ());


//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[24];
//	commonRotClass.inputs[0]= new String("夏至");  
//	commonRotClass.inputs[1]= new String("芒种");
//	commonRotClass.inputs[2]= new String("小满");
//	commonRotClass.inputs[3]= new String("立夏");
//	commonRotClass.inputs[4]= new String("谷雨");
//	
//	commonRotClass.inputs[5]= new String("清明");  
//	commonRotClass.inputs[6]= new String("春分");
//	commonRotClass.inputs[7]= new String("惊蛰");
//	commonRotClass.inputs[8]= new String("雨水");
//	commonRotClass.inputs[9]= new String("立春");
//	
//	commonRotClass.inputs[10]= new String("大寒");  
//	commonRotClass.inputs[11]= new String("小寒");
//	commonRotClass.inputs[12]= new String("冬至");
//	commonRotClass.inputs[13]= new String("大雪");
//	commonRotClass.inputs[14]= new String("小雪");
//	
//	commonRotClass.inputs[15]= new String("立冬");  
//	commonRotClass.inputs[16]= new String("霜降");
//	commonRotClass.inputs[17]= new String("寒露");
//	commonRotClass.inputs[18]= new String("秋分");
//	commonRotClass.inputs[19]= new String("白露");
//	
//	commonRotClass.inputs[20]= new String("处暑");  
//	commonRotClass.inputs[21]= new String("立秋");
//	commonRotClass.inputs[22]= new String("大暑");
//	commonRotClass.inputs[23]= new String("小暑");
//}
//subLeaf.put("心 小肠 离 腕踝上 经", new IMV_SIQ());
//subLeaf.put("胆 肝 巽 掌趾前 荥", new IMV_SIQ());
//subLeaf.put("胆 肝 震 掌趾前 荥", new IMV_SIQ());
//subLeaf.put("血 胃 艮 肘膝中 合", new IMV_SIQ());
//subLeaf.put("肾 膀胱 坎 掌趾后 输", new IMV_SIQ());
//subLeaf.put("大肠 乾 手足端 井", new IMV_SIQ());
//subLeaf.put("肺 兑 手足端 井", new IMV_SIQ());
//subLeaf.put("血 脾 坤 肘膝中 合", new IMV_SIQ());

//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[8];
//	commonRotClass.inputs[0]= new String("心 小肠 离 腕踝上 经");  
//	commonRotClass.inputs[1]= new String("胆 肝 巽 掌趾前 荥");
//	commonRotClass.inputs[2]= new String("胆 肝 震 掌趾前 荥");
//	commonRotClass.inputs[3]= new String("血 胃 艮 肘膝中 合");
//	commonRotClass.inputs[4]= new String("肾 膀胱 坎 掌趾后 输");
//	commonRotClass.inputs[5]= new String("大肠 乾 手足端 井");
//	commonRotClass.inputs[6]= new String("肺 兑 手足端 井");
//	commonRotClass.inputs[7]= new String("血 脾 坤 肘膝中 合");
//}
//subLeaf.put("XJ 离 手少阳 手少阴 手厥阴 手太阳↑ Ⅲ", new IMV_SIQ());
//subLeaf.put("WS YQ 巽 足少阳↖ Ⅴ", new IMV_SIQ());
//subLeaf.put("YQ MG 震 足厥阴← Ⅳ", new IMV_SIQ());
//subLeaf.put("MG 艮 手少阳 足阳明↙ Ⅶ", new IMV_SIQ());
//subLeaf.put("JA 坎 足少阴 足太阴 手少阳↓ Ⅵ", new IMV_SIQ());
//subLeaf.put("XH FG 乾 手阳明 ↘ Ⅰ", new IMV_SIQ());
//subLeaf.put("LZ SX 兑 手太阴→ Ⅱ", new IMV_SIQ());
//subLeaf.put("SX JZ 坤 足太阴↗ Ⅷ", new IMV_SIQ());

//subLeaf.put("XJ禁XH 离 胆", new IMV_SIQ());
//subLeaf.put("WS禁LZ 巽 胆 肝", new IMV_SIQ());
//subLeaf.put("YQ MG禁LZ 震 消化 胃", new IMV_SIQ());
//subLeaf.put("MG禁JA 艮 唾 胰", new IMV_SIQ());
//subLeaf.put("JA禁JZ 坎 发", new IMV_SIQ());
//subLeaf.put("XH FG禁XJ 乾 眠 泪", new IMV_SIQ());
//subLeaf.put("LZ SX禁JA 兑 窦", new IMV_SIQ());
//subLeaf.put("SX JZ禁JA 坤 鼻 汗", new IMV_SIQ());
//
//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[8];
//	commonRotClass.inputs[0]= new String("XJ禁XH 离 胆");  
//	commonRotClass.inputs[1]= new String("WS禁LZ 巽 胆 肝");
//	commonRotClass.inputs[2]= new String("YQ MG禁LZ 震 消化 胃");
//	commonRotClass.inputs[3]= new String("MG禁JA 艮 唾 胰");
//	commonRotClass.inputs[4]= new String("JA禁JZ 坎 发");
//	commonRotClass.inputs[5]= new String("XH FG禁XJ 乾 眠 泪");
//	commonRotClass.inputs[6]= new String("LZ SX禁JA 兑 窦");
//	commonRotClass.inputs[7]= new String("SX JZ禁JA 坤 鼻 汗");
//}
//subLeaf.put("DH 景 酰 离↑ Ⅲ", new IMV_SIQ());
//subLeaf.put("QA 杜 酸 巽↖ Ⅴ", new IMV_SIQ());
//subLeaf.put("PI 殇 酮 震← Ⅳ", new IMV_SIQ());
//subLeaf.put("ST 生 酯 艮↙ Ⅶ", new IMV_SIQ());
//subLeaf.put("UO 休 酚 坎↓ Ⅵ", new IMV_SIQ());
//subLeaf.put("MV 开 醚 乾↘ Ⅰ", new IMV_SIQ());
//subLeaf.put("CX 惊 醇 兑→ Ⅱ", new IMV_SIQ());
//subLeaf.put("DD E 死 酶 坤↗ Ⅷ", new IMV_SIQ());
//subLeaf.put("H PV DD 酰 火↑", new IMV_SIQ());
//subLeaf.put("H OEU 醇酮 木↖", new IMV_SIQ());
//subLeaf.put("H CDI 酯酸 土↗", new IMV_SIQ());
//subLeaf.put("H MXS 醚 水↙", new IMV_SIQ());
//subLeaf.put("H AQT 酚酶 金↘ ", new IMV_SIQ());

//if(null== commonRotClass.inputs) {
//	commonRotClass.inputs= new String[5];
//	commonRotClass.inputs[0]= new String("H PV DD 酰 火↑");  
//	commonRotClass.inputs[1]= new String("H OEU 醇酮 木↖");
//	commonRotClass.inputs[2]= new String("H CDI 酯酸 土↗");
//	commonRotClass.inputs[3]= new String("H MXS 醚 水↙");
//	commonRotClass.inputs[4]= new String("H AQT 酚酶 金↘");
//}
//subLeaf.put("PV 景 酰 离↑ Ⅲ", new IMV_SIQ());
//subLeaf.put("UH 杜 酮 巽↖ Ⅴ", new IMV_SIQ());
//subLeaf.put("OE 殇 醇 震← Ⅳ", new IMV_SIQ());
//subLeaf.put("IX 生 酯 艮↙ Ⅶ", new IMV_SIQ());
//subLeaf.put("MS 休 醚 坎↓ Ⅵ", new IMV_SIQ());
//subLeaf.put("Q 开 酶 乾↘ Ⅰ", new IMV_SIQ());
//subLeaf.put("ACT 惊 酚 兑→ Ⅱ", new IMV_SIQ());
//subLeaf.put("D 死 酸 坤↗ Ⅷ", new IMV_SIQ());
//subLeaf.put("酰 离 DH 清润核酸↑ Ⅲ", new IMV_SIQ());
//subLeaf.put("酸 巽 QA erosion调节↖ Ⅴ", new IMV_SIQ());
//subLeaf.put("酮 震 IP 激素扩散← Ⅳ", new IMV_SIQ());
//subLeaf.put("酯 艮 TS 体能聚能↙ Ⅶ", new IMV_SIQ());
//subLeaf.put("酚 坎 OU 受体免疫↓ Ⅵ", new IMV_SIQ());
//subLeaf.put("醚 乾 VM 受体诱导↘ Ⅰ", new IMV_SIQ());
//subLeaf.put("醇 兑 CX 扩散免疫→ Ⅱ", new IMV_SIQ());
//subLeaf.put("酶 坤 DD E erosion诱导↗ Ⅷ", new IMV_SIQ());

//public void bootFlowerForest(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
////这里要全部重写，整个插件 canvas
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootFlowerSea(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootClassificationMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootBaYouMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootJingLuoMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootZiWuMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootLiuZhuMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}
//public void bootJieQiMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootBaGangMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootKanYuMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootLiuRenMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootYiShuMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}
//
////经仪数据来自刘基 袁天罡 市面通用八卦罗盘。
//public void bootTianXingMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}
//public void bootJingYiMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//
//subLeaf.put("", new IMV_SIQ());
//
//leaf.put(rootWord, subLeaf);
////	rootLeafList.add(subLeaf);
//rootLeafJingYi= subLeaf;	
////commonRotClass.rootLeaf= subLeaf;
//}

//public void bootHeLuoMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}

//public void bootSanJiaoMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}
//zishiying chuangkou 
//tinshell add mingling 
//jiemian add method
//
//public void bootRandomMap(String string, boolean isButton, CommonRotClass commonRotClass) {
//if(rootWord== null) {
//	return;
//}
//if(rootWord.equalsIgnoreCase(string) && isButton== false) {
//	return;
//} 
//rootWord= string;
////rootLeaf.clear();
//findLeaf.clear();
//frequencyLeaf.clear();
//findLeaf.put(rootWord, 1);
//frequencyLeaf.put(rootWord, 1);
//IMV_SIQ leaf= new IMV_SIQ();
//IMV_SIQ subLeaf= new LinkedHashMap<>();
//for(int i= 0; i< commonRotClass.inputs.length; i++) {
//	subLeaf.put(commonRotClass.inputs[i].toString(), new IMV_SIQ());
//}
//leaf.put(rootWord, subLeaf);
//commonRotClass.rootLeaf= subLeaf;
//}