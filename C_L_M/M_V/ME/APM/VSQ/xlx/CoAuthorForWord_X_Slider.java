package M_V.ME.APM.VSQ.xlx;

import M_V.MVQ.button.DetaButton;
import M_V.MVQ.slider.DetaSlider;
import exception.thread.DetaThread;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CoAuthorForWord_X_Slider extends CoAuthorForWord_X_maps {

    public DetaSlider I_DetaSlider(String string, boolean isRotation
        , boolean isObservation) {
        DetaSlider detaSlider = new DetaSlider(0, 1500);
        detaSlider.setSnapToTicks(true);
        detaSlider.setPaintTicks(true);
        detaSlider.setMajorTickSpacing(20);
        detaSlider.setMinorTickSpacing(1);
        detaSlider.addChangeListener(
            event -> {
                JSlider source = (JSlider) event.getSource();
                CommonRotClass commonRotClass = new CommonRotClass();
                if (rootClassMap.containsKey(string)) {
                    commonRotClass = rootClassMap.getCommonRotClass(string);
                }
                if (isObservation) {
                    commonRotClass.rotZ = source.getValue() << 2;
                }
                if (isRotation) {
                    commonRotClass.rot = source.getValue() << 2;
                }

                rootClassMap.put(string, commonRotClass);
            });
        return detaSlider;
    }

    public Box creatSlidersBox() {
        sliderFangDa = new DetaSlider(0, 1500);
        sliderFangDa.setSnapToTicks(true);
        sliderFangDa.setPaintTicks(true);
        sliderFangDa.setMajorTickSpacing(20);
        sliderFangDa.setMinorTickSpacing(1);
        sliderFangDa.addChangeListener(
            event -> {
                JSlider source = (JSlider) event.getSource();
                rotFangDa = source.getValue() << 2;
                trot = rotFangDa * 0.03F;
            });
        buttonFangDa = new DetaButton("放大", 100, 50, Color.RED);
        buttonFangDa.addActionListener(
            e -> {
                //to do..
            });
        Box sliderBoxFangDa = new Box(BoxLayout.X_AXIS);
        sliderBoxFangDa.add(buttonFangDa);
        sliderBoxFangDa.add(sliderFangDa);

        sliderSuoXiao = new DetaSlider(0, 1500);
        sliderSuoXiao.setSnapToTicks(true);
        sliderSuoXiao.setPaintTicks(true);
        sliderSuoXiao.setMajorTickSpacing(20);
        sliderSuoXiao.setMinorTickSpacing(1);
        sliderSuoXiao.addChangeListener(event -> {
            JSlider source = (JSlider) event.getSource();
            rotSuoXiao = source.getValue() << 2;
        });
        buttonSuoXiao = new DetaButton("缩小", 100, 50, Color.RED);
        buttonSuoXiao.addActionListener(e -> {
            //to do..
        });
        Box sliderBoxSuoXiao = new Box(BoxLayout.X_AXIS);
        sliderBoxSuoXiao.add(buttonSuoXiao);
        sliderBoxSuoXiao.add(sliderSuoXiao);

        sliderShunLiu = new DetaSlider(0, 1500);
        sliderShunLiu.setSnapToTicks(true);
        sliderShunLiu.setPaintTicks(true);
        sliderShunLiu.setMajorTickSpacing(20);
        sliderShunLiu.setMinorTickSpacing(1);
        sliderShunLiu.addChangeListener(event -> {
            JSlider source = (JSlider) event.getSource();
            rotShunLiu = source.getValue() << 2;
        });
        buttonShunLiu = new DetaButton("顺流", 100, 50, Color.RED);
        buttonShunLiu.addActionListener(e -> {
            //to do..
        });
        Box sliderBoxShunLiu = new Box(BoxLayout.X_AXIS);
        sliderBoxShunLiu.add(buttonShunLiu);
        sliderBoxShunLiu.add(sliderShunLiu);

        sliderNiLiu = new DetaSlider(0, 1500);
        sliderNiLiu.setSnapToTicks(true);
        sliderNiLiu.setPaintTicks(true);
        sliderNiLiu.setMajorTickSpacing(20);
        sliderNiLiu.setMinorTickSpacing(1);
        sliderNiLiu.addChangeListener(event -> {
            JSlider source = (JSlider) event.getSource();
            rotNiLiu = source.getValue() << 2;
        });
        buttonNiLiu = new DetaButton("逆流", 100, 50, Color.RED);
        buttonNiLiu.addActionListener(e -> {
            //to do..
        });
        Box sliderBoxNiLiu = new Box(BoxLayout.X_AXIS);
        sliderBoxNiLiu.add(buttonNiLiu);
        sliderBoxNiLiu.add(sliderNiLiu);
        //sliderBoxRight
        //稍后优化 commonInputs
        sliderSanJiao = I_DetaSlider("三焦", true, false);
        //稍后缩进
        sliderSanJiaoZ = I_DetaSlider("三焦", false, true);
        //稍后缩进
        buttonSanJiao = new DetaButton("三焦关", 100, 50, Color.green);
        buttonSanJiao.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("三焦")) {
                commonRotClass = rootClassMap.getCommonRotClass("三焦");
            }
            if (commonRotClass.buttonClicked) {
                buttonSanJiao.setBackground(Color.blue);
                buttonSanJiao.setText("三焦关");
            } else {
                buttonSanJiao.setText("三焦开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("上焦-血分-营分-心-小肠");
                    commonRotClass.inputs[1] = new String("气分-胆-股");
                    commonRotClass.inputs[2] = new String("下焦-气分-血分-肝-足");
                    commonRotClass.inputs[3] = new String("中焦-气分-胃-手");
                    commonRotClass.inputs[4] = new String("下焦-血分-卫分-耳-肾-膀胱");
                    commonRotClass.inputs[5] = new String("气分-大肠-首-健");
                    commonRotClass.inputs[6] = new String("上焦-卫分-肺-口");
                    commonRotClass.inputs[7] = new String("中焦-血分-脾-腹");
                }
                bootCommonMap("三焦", true, commonRotClass);
                buttonSanJiao.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("三焦", commonRotClass);
        });
        Box sliderBoxSanJiao = new Box(BoxLayout.X_AXIS);
        sliderBoxSanJiao.add(buttonSanJiao);
        sliderBoxSanJiao.add(sliderSanJiao);
        sliderBoxSanJiao.add(sliderSanJiaoZ);
        //
        sliderBaGang = I_DetaSlider("八纲", true, false);

        sliderBaGangZ = I_DetaSlider("八纲", false, true);
        buttonBaGang = new DetaButton("八纲关", 100, 50, Color.BLUE);
        buttonBaGang.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("八纲")) {
                commonRotClass = rootClassMap.getCommonRotClass("八纲");
            }
            if (commonRotClass.buttonClicked) {
                buttonBaGang.setBackground(Color.blue);
                buttonBaGang.setText("八纲关");
            } else {
                buttonBaGang.setText("八纲开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("离 甜苦干热-火红紫粉");
                    commonRotClass.inputs[1] = new String("巽 酸甜湿热-木蓝");
                    commonRotClass.inputs[2] = new String("震 酸湿-木绿温");
                    commonRotClass.inputs[3] = new String("艮 平温凉-土米黄");
                    commonRotClass.inputs[4] = new String("坎 苦咸涩-水涩寒冷冻黑 紫红");
                    commonRotClass.inputs[5] = new String("乾 辣涩干凉-金赤");
                    commonRotClass.inputs[6] = new String("兑 辣涩干凉热燥-金白辛");
                    commonRotClass.inputs[7] = new String("坤 腻涩干凉-土棕");
                }
                bootCommonMap("八纲", true, commonRotClass);
                buttonBaGang.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("八纲", commonRotClass);
        });
        Box sliderBoxBaGang = new Box(BoxLayout.X_AXIS);
        sliderBoxBaGang.add(buttonBaGang);
        sliderBoxBaGang.add(sliderBaGang);
        sliderBoxBaGang.add(sliderBaGangZ);
        //sliderBoxRight.add(new )

        sliderBaYou = I_DetaSlider("八酉", true, false);

        sliderBaYouZ = I_DetaSlider("八酉", false, true);
        buttonBaYou = new DetaButton("八酉关", 100, 50, Color.pink);
        buttonBaYou.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("八酉")) {
                commonRotClass = rootClassMap.getCommonRotClass("八酉");
            }
            if (commonRotClass.buttonClicked) {
                buttonBaYou.setBackground(Color.blue);
                buttonBaYou.setText("八酉关");
            } else {
                buttonBaYou.setText("八酉开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("酰 离 DH 清润核酸↑ Ⅲ");
                    commonRotClass.inputs[1] = new String("酸 巽 QA 腐蚀调节↖ Ⅴ");
                    commonRotClass.inputs[2] = new String("酮 震 IP 激素扩散← Ⅳ");
                    commonRotClass.inputs[3] = new String("酯 艮 TS 体能聚能↙ Ⅶ");
                    commonRotClass.inputs[4] = new String("酚 坎 OU 受体免疫↓ Ⅵ");
                    commonRotClass.inputs[5] = new String("醚 乾 VM 受体诱导↘ Ⅰ");
                    commonRotClass.inputs[6] = new String("醇 兑 CX 扩散免疫→ Ⅱ");
                    commonRotClass.inputs[7] = new String("酶 坤 DD E 腐蚀诱导↗ Ⅷ");
                }
                bootCommonMap("八酉", true, commonRotClass);
                buttonBaYou.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("八酉", commonRotClass);
        });
        Box sliderBoxBaYou = new Box(BoxLayout.X_AXIS);
        sliderBoxBaYou.add(buttonBaYou);
        sliderBoxBaYou.add(sliderBaYou);
        sliderBoxBaYou.add(sliderBaYouZ);
        //
        sliderYuanJi = I_DetaSlider("阴阳", true, false);
        sliderYuanJiZ = I_DetaSlider("阴阳", false, true);
        buttonYuanJi = new DetaButton("元基关", 100, 50, Color.green);
        buttonYuanJi.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("阴阳")) {
                commonRotClass = rootClassMap.getCommonRotClass("阴阳");
            }
            if (commonRotClass.buttonClicked) {
                buttonYuanJi.setBackground(Color.blue);
                buttonYuanJi.setText("元基关");
            } else {
                buttonYuanJi.setText("元基开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("PV 景 酰 离↑ Ⅲ");
                    commonRotClass.inputs[1] = new String("UH 杜 酮 巽↖ Ⅴ");
                    commonRotClass.inputs[2] = new String("OE 殇 醇 震← Ⅳ");
                    commonRotClass.inputs[3] = new String("IX 生 酯 艮↙ Ⅶ");
                    commonRotClass.inputs[4] = new String("MS 休 醚 坎↓ Ⅵ");
                    commonRotClass.inputs[5] = new String("Q 开 酶 乾↘ Ⅰ");
                    commonRotClass.inputs[6] = new String("ACT 惊 酚 兑→ Ⅱ");
                    commonRotClass.inputs[7] = new String("D 殒 酸 坤↗ Ⅷ");
                }
                bootCommonMap("阴阳", true, commonRotClass);
                buttonYuanJi.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("阴阳", commonRotClass);
        });
        Box sliderBoxYuanJi = new Box(BoxLayout.X_AXIS);
        sliderBoxYuanJi.add(buttonYuanJi);
        sliderBoxYuanJi.add(sliderYuanJi);
        sliderBoxYuanJi.add(sliderYuanJiZ);
        //
        sliderShuangYuan = I_DetaSlider("双元", true, false);
        sliderShuangYuanZ = I_DetaSlider("双元", false, true);
        buttonShuangYuan = new DetaButton("双元关", 100, 50, Color.green);
        buttonShuangYuan.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("双元")) {
                commonRotClass = rootClassMap.getCommonRotClass("双元");
            }
            if (commonRotClass.buttonClicked) {
                buttonShuangYuan.setBackground(Color.blue);
                buttonShuangYuan.setText("双元关");
            } else {
                buttonShuangYuan.setText("双元开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("DH 景 酰 离↑ Ⅲ");
                    commonRotClass.inputs[1] = new String("QA 杜 酸 巽↖ Ⅴ");
                    commonRotClass.inputs[2] = new String("PI 殇 酮 震← Ⅳ");
                    commonRotClass.inputs[3] = new String("ST 生 酯 艮↙ Ⅶ");
                    commonRotClass.inputs[4] = new String("UO 休 酚 坎↓ Ⅵ");
                    commonRotClass.inputs[5] = new String("MV 开 醚 乾↘ Ⅰ");
                    commonRotClass.inputs[6] = new String("CX 惊 醇 兑→ Ⅱ");
                    commonRotClass.inputs[7] = new String("DD E 殒 酶 坤↗ Ⅷ");
                }
                bootCommonMap("双元", true, commonRotClass);
                buttonShuangYuan.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("双元", commonRotClass);
        });
        Box sliderBoxShuangYuan = new Box(BoxLayout.X_AXIS);
        sliderBoxShuangYuan.add(buttonShuangYuan);
        sliderBoxShuangYuan.add(sliderShuangYuan);
        sliderBoxShuangYuan.add(sliderShuangYuanZ);

        sliderJingLuo = I_DetaSlider("经络", true, false);
        sliderJingLuoZ = I_DetaSlider("经络", false, true);
        buttonJingLuo = new DetaButton("经络关", 100, 50, Color.blue);
        buttonJingLuo.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("经络")) {
                commonRotClass = rootClassMap.getCommonRotClass("经络");
            }
            if (commonRotClass.buttonClicked) {
                buttonJingLuo.setBackground(Color.blue);
                buttonJingLuo.setText("经络关");
            } else {
                buttonJingLuo.setText("经络开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("XJ 离 手少阳 手少阴 手厥阴 手太阳↑ Ⅲ");
                    commonRotClass.inputs[1] = new String("WS YQ 巽 足少阳↖ Ⅴ");
                    commonRotClass.inputs[2] = new String("YQ MG 震 足厥阴← Ⅳ");
                    commonRotClass.inputs[3] = new String("MG 艮 手少阳 足阳明↙ Ⅶ");
                    commonRotClass.inputs[4] = new String("JA 坎 足少阴 足太阴 手少阳↓ Ⅵ");
                    commonRotClass.inputs[5] = new String("XH FG 乾 手阳明 ↘ Ⅰ");
                    commonRotClass.inputs[6] = new String("LZ SX 兑 手太阴→ Ⅱ");
                    commonRotClass.inputs[7] = new String("SX JZ 坤 足太阴↗ Ⅷ");
                }
                bootCommonMap("经络", true, commonRotClass);
                buttonJingLuo.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("经络", commonRotClass);
        });
        Box sliderBoxJingLuo = new Box(BoxLayout.X_AXIS);
        sliderBoxJingLuo.add(buttonJingLuo);
        sliderBoxJingLuo.add(sliderJingLuo);
        sliderBoxJingLuo.add(sliderJingLuoZ);
        //
        //sliderBoxRight
        sliderHeLuo = I_DetaSlider("河洛", true, false);
        sliderHeLuoZ = I_DetaSlider("河洛", false, true);
        buttonHeLuo = new DetaButton("河洛关", 100, 50, Color.green);
        buttonHeLuo.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("河洛")) {
                commonRotClass = rootClassMap.getCommonRotClass("河洛");
            }
            if (commonRotClass.buttonClicked) {
                buttonHeLuo.setBackground(Color.blue);
                buttonHeLuo.setText("河洛关");
            } else {
                buttonHeLuo.setText("河洛开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[12];
                    commonRotClass.inputs[0] = new String("03-白羊-土-3m21_4m19");
                    commonRotClass.inputs[1] = new String("04-金牛-金-4m20_5m20");
                    commonRotClass.inputs[2] = new String("05-双子-金-5m21_6m21");
                    commonRotClass.inputs[3] = new String("06-巨蟹-土-6m22_7m22");
                    commonRotClass.inputs[4] = new String("07-狮子-火-7m23_8m22");
                    commonRotClass.inputs[5] = new String("08-处女-火-8m23_9m22");
                    commonRotClass.inputs[6] = new String("09-天枰-土-9m23_10m23");
                    commonRotClass.inputs[7] = new String("10-天蝎-木-10m24_11m22");
                    commonRotClass.inputs[8] = new String("11-射手-木-11m23_12m21");
                    commonRotClass.inputs[9] = new String("12-魔蝎-土-12m22_1m19");
                    commonRotClass.inputs[10] = new String("01-水瓶-水-1m20_2m18");
                    commonRotClass.inputs[11] = new String("02-双鱼-水-2m19_3m20");
                }
                bootCommonMap("河洛", true, commonRotClass);
                buttonHeLuo.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("河洛", commonRotClass);
        });
        Box sliderBoxHeLuo = new Box(BoxLayout.X_AXIS);
        sliderBoxHeLuo.add(buttonHeLuo);
        sliderBoxHeLuo.add(sliderHeLuo);
        sliderBoxHeLuo.add(sliderHeLuoZ);

        sliderLiuRen = I_DetaSlider("六壬", true, false);

        sliderLiuRenZ = I_DetaSlider("六壬", false, true);
        buttonLiuRen = new DetaButton("六壬关", 100, 50, Color.blue);
        buttonLiuRen.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("六壬")) {
                commonRotClass = rootClassMap.getCommonRotClass("六壬");
            }
            if (commonRotClass.buttonClicked) {
                buttonLiuRen.setBackground(Color.red);
                buttonLiuRen.setText("六壬关");
            } else {
                buttonLiuRen.setText("六壬开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[12];
                    commonRotClass.inputs[0] = new String("马-午丞-灵境-甲午刑-休加制");
                    commonRotClass.inputs[1] = new String("蛇-巳云-新象-辰戌刑");
                    commonRotClass.inputs[2] = new String("龙-辰云-新象-辰戌刑");
                    commonRotClass.inputs[3] = new String("兔-卯力-凶伤-开惊加制");
                    commonRotClass.inputs[4] = new String("虎-寅月-山亭-甲申刑-殇杜加制");
                    commonRotClass.inputs[5] = new String("牛-丑月-山亭-甲申刑-殇杜加制");
                    commonRotClass.inputs[6] = new String("鼠-子目-屯才-生死加制");
                    commonRotClass.inputs[7] = new String("猪-亥口-阴池-丙丁奇门");
                    commonRotClass.inputs[8] = new String("狗-戌口-阴池-丙丁奇门");
                    commonRotClass.inputs[9] = new String("鸡-酉早-水阁-丙丁奇门");
                    commonRotClass.inputs[10] = new String("猴-申因-枯木-甲戊刑");
                    commonRotClass.inputs[11] = new String("羊-未因-枯木-甲戊刑");
                }
                bootCommonMap("六壬", true, commonRotClass);
                buttonLiuRen.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("六壬", commonRotClass);
        });
        Box sliderBoxLiuRen = new Box(BoxLayout.X_AXIS);
        sliderBoxLiuRen.add(buttonLiuRen);
        sliderBoxLiuRen.add(sliderLiuRen);
        sliderBoxLiuRen.add(sliderLiuRenZ);

        sliderLiuZhu = I_DetaSlider("流注", true, false);
        sliderLiuZhuZ = I_DetaSlider("流注", false, true);
        buttonLiuZhu = new DetaButton("流注关", 100, 50, Color.pink);
        buttonLiuZhu.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("流注")) {
                commonRotClass = rootClassMap.getCommonRotClass("流注");
            }
            if (commonRotClass.buttonClicked) {
                buttonLiuZhu.setBackground(Color.blue);
                buttonLiuZhu.setText("流注关");
            } else {
                buttonLiuZhu.setText("流注开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("心 小肠 离 腕踝上 经");
                    commonRotClass.inputs[1] = new String("胆 肝 巽 掌趾前 荥");
                    commonRotClass.inputs[2] = new String("胆 肝 震 掌趾前 荥");
                    commonRotClass.inputs[3] = new String("血 胃 艮 肘膝中 合");
                    commonRotClass.inputs[4] = new String("肾 膀胱 坎 掌趾后 输");
                    commonRotClass.inputs[5] = new String("大肠 乾 手足端 井");
                    commonRotClass.inputs[6] = new String("肺 兑 手足端 井");
                    commonRotClass.inputs[7] = new String("血 脾 坤 肘膝中 合");
                }
                bootCommonMap("流注", true, commonRotClass);
                buttonLiuZhu.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("流注", commonRotClass);
        });
        Box sliderBoxLiuZhu = new Box(BoxLayout.X_AXIS);
        sliderBoxLiuZhu.add(buttonLiuZhu);
        sliderBoxLiuZhu.add(sliderLiuZhu);
        sliderBoxLiuZhu.add(sliderLiuZhuZ);

        sliderTianXing = I_DetaSlider("天星", true, false);
        sliderTianXingZ = I_DetaSlider("天星", false, true);
        buttonTianXing = new DetaButton("天星关", 100, 50, Color.green);
        buttonTianXing.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("天星")) {
                commonRotClass = rootClassMap.getCommonRotClass("天星");
            }
            if (commonRotClass.buttonClicked) {
                buttonTianXing.setBackground(Color.blue);
                buttonTianXing.setText("天星关");
            } else {
                buttonTianXing.setText("天星开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[24];
                    commonRotClass.inputs[0] = new String("午-天广-酉");
                    commonRotClass.inputs[1] = new String("丙-太威-辛");
                    commonRotClass.inputs[2] = new String("巳-天屏-酉");
                    commonRotClass.inputs[3] = new String("巽-太乙-Kui");
                    commonRotClass.inputs[4] = new String("辰-天罡-Li");
                    commonRotClass.inputs[5] = new String("乙-天宫-甲");
                    commonRotClass.inputs[6] = new String("卯-天苑-丁");
                    commonRotClass.inputs[7] = new String("甲-天苑-丙");

                    commonRotClass.inputs[8] = new String("寅-天培-未");
                    commonRotClass.inputs[9] = new String("艮-天市-丁");
                    commonRotClass.inputs[10] = new String("丑-天厨-辰");
                    commonRotClass.inputs[11] = new String("Kui-阴光-巳");
                    commonRotClass.inputs[12] = new String("子-天垒-巳");
                    commonRotClass.inputs[13] = new String("壬-天辅-申");
                    commonRotClass.inputs[14] = new String("亥-天皇-乙");
                    commonRotClass.inputs[15] = new String("乾-天庭-卯");


                    commonRotClass.inputs[16] = new String("戌-天魁-丑");
                    commonRotClass.inputs[17] = new String("辛-天乙-丑");
                    commonRotClass.inputs[18] = new String("酉-少微-寅");
                    commonRotClass.inputs[19] = new String("庚-天汉-午");
                    commonRotClass.inputs[20] = new String("申-天关-Kui");
                    commonRotClass.inputs[21] = new String("坤-天镜-乙");
                    commonRotClass.inputs[22] = new String("未-天常-Kui");
                    commonRotClass.inputs[23] = new String("丁-南极-寅");
                }
                bootCommonMap("天星", true, commonRotClass);
                buttonTianXing.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("天星", commonRotClass);
        });
        Box sliderBoxTianXing = new Box(BoxLayout.X_AXIS);
        sliderBoxTianXing.add(buttonTianXing);
        sliderBoxTianXing.add(sliderTianXing);
        sliderBoxTianXing.add(sliderTianXingZ);

        //
        sliderYiShu = I_DetaSlider("易数", true, false);
        sliderYiShuZ = I_DetaSlider("易数", false, true);
        buttonYiShu = new DetaButton("易数关", 100, 50, Color.blue);
        buttonYiShu.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("易数")) {
                commonRotClass = rootClassMap.getCommonRotClass("易数");
            }
            if (commonRotClass.buttonClicked) {
                buttonYiShu.setBackground(Color.blue);
                buttonYiShu.setText("易数关");
            } else {
                buttonYiShu.setText("易数开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("景-层乱枯紫稠急-疏同");
                    commonRotClass.inputs[1] = new String("杜-散灿鲜靛急瀑");
                    commonRotClass.inputs[2] = new String("殇-衣嫩蓝青微湍");
                    commonRotClass.inputs[3] = new String("生-软柔黄珊细缓");
                    commonRotClass.inputs[4] = new String("修-滑透墨辉绵平-枢密");
                    commonRotClass.inputs[5] = new String("开-坚鲜浓红呼清");
                    commonRotClass.inputs[6] = new String("精-纯淡红橙当浊");
                    commonRotClass.inputs[7] = new String("陨-混浓棕黄刺污");
                }
                bootCommonMap("易数", true, commonRotClass);
                buttonYiShu.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("易数", commonRotClass);
        });
        Box sliderBoxYiShu = new Box(BoxLayout.X_AXIS);
        sliderBoxYiShu.add(buttonYiShu);
        sliderBoxYiShu.add(sliderYiShu);
        sliderBoxYiShu.add(sliderYiShuZ);

        //
        sliderZiWu = I_DetaSlider("子午", true, false);
        sliderZiWuZ = I_DetaSlider("子午", false, true);
        buttonZiWu = new DetaButton("子午关", 100, 50, Color.pink);
        buttonZiWu.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("子午")) {
                commonRotClass = rootClassMap.getCommonRotClass("子午");
            }
            if (commonRotClass.buttonClicked) {
                buttonZiWu.setBackground(Color.blue);
                buttonZiWu.setText("子午关");
            } else {
                buttonZiWu.setText("子午开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("XJ禁XH 离 胆");
                    commonRotClass.inputs[1] = new String("WS禁LZ 巽 胆 肝");
                    commonRotClass.inputs[2] = new String("YQ MG禁LZ 震 消化 胃");
                    commonRotClass.inputs[3] = new String("MG禁JA 艮 唾 胰");
                    commonRotClass.inputs[4] = new String("JA禁JZ 坎 发");
                    commonRotClass.inputs[5] = new String("XH FG禁XJ 乾 眠 泪");
                    commonRotClass.inputs[6] = new String("LZ SX禁JA 兑 窦");
                    commonRotClass.inputs[7] = new String("SX JZ禁JA 坤 鼻 汗");
                }
                bootCommonMap("子午", true, commonRotClass);
                buttonZiWu.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("子午", commonRotClass);
        });
        Box sliderBoxZiWu = new Box(BoxLayout.X_AXIS);
        sliderBoxZiWu.add(buttonZiWu);
        sliderBoxZiWu.add(sliderZiWu);
        sliderBoxZiWu.add(sliderZiWuZ);
        //
        sliderKanYu = I_DetaSlider("堪舆", true, false);
        sliderKanYuZ = I_DetaSlider("堪舆", false, true);
        buttonKanYu = new DetaButton("堪舆关", 100, 50, Color.green);
        buttonKanYu.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("堪舆")) {
                commonRotClass = rootClassMap.getCommonRotClass("堪舆");
            }
            if (commonRotClass.buttonClicked) {
                buttonKanYu.setBackground(Color.blue);
                buttonKanYu.setText("堪舆关");
            } else {
                buttonKanYu.setText("堪舆开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[11];
                    commonRotClass.inputs[0] = new String("浆-花色-");
                    commonRotClass.inputs[1] = new String("灰-曲直-");
                    commonRotClass.inputs[2] = new String("林-呼怒-");
                    commonRotClass.inputs[3] = new String("山-歌意-");
                    commonRotClass.inputs[4] = new String("岸-禾蔷-");
                    commonRotClass.inputs[5] = new String("北坎-河-恐呻");
                    commonRotClass.inputs[6] = new String("溪-润健-");
                    commonRotClass.inputs[7] = new String("沼-悦魄-");
                    commonRotClass.inputs[8] = new String("石-商忧-");
                    commonRotClass.inputs[9] = new String("岩-思顺-");
                    commonRotClass.inputs[10] = new String("沙-宫赤-");
                }
                bootCommonMap("堪舆", true, commonRotClass);
                buttonKanYu.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("堪舆", commonRotClass);
        });
        Box sliderBoxKanYu = new Box(BoxLayout.X_AXIS);
        sliderBoxKanYu.add(buttonKanYu);
        sliderBoxKanYu.add(sliderKanYu);
        sliderBoxKanYu.add(sliderKanYuZ);

        //
        sliderWuXing = I_DetaSlider("五行", true, false);
        sliderWuXingZ = I_DetaSlider("五行", false, true);
        buttonWuXing = new DetaButton("五行关", 100, 50, Color.BLUE);
        //boolean buttonWuXingClicked= true;
        buttonWuXing.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("五行")) {
                commonRotClass = rootClassMap.getCommonRotClass("五行");
            }
            if (commonRotClass.buttonClicked) {
                buttonWuXing.setBackground(Color.blue);
                buttonWuXing.setText("五行关");
            } else {
                buttonWuXing.setText("五行开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[5];
                    commonRotClass.inputs[0] = new String("H PV DD 酰 火↑");
                    commonRotClass.inputs[1] = new String("H OEU 醇酮 木↖");
                    commonRotClass.inputs[2] = new String("H CDI 酯酸 土↗");
                    commonRotClass.inputs[3] = new String("H MXS 醚 水↙");
                    commonRotClass.inputs[4] = new String("H AQT 酚酶 金↘");
                }
                bootCommonMap("五行", true, commonRotClass);
                buttonWuXing.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("五行", commonRotClass);
        });
        Box sliderBoxWuXing = new Box(BoxLayout.X_AXIS);
        sliderBoxWuXing.add(buttonWuXing);
        sliderBoxWuXing.add(sliderWuXing);
        sliderBoxWuXing.add(sliderWuXingZ);

        //
        sliderJieQi = I_DetaSlider("节气", true, false);
        sliderJieQiZ = I_DetaSlider("节气", false, true);
        buttonJieQi = new DetaButton("节气关", 100, 50, Color.PINK);
        buttonJieQi.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("节气")) {
                commonRotClass = rootClassMap.getCommonRotClass("节气");
            }
            if (commonRotClass.buttonClicked) {
                buttonJieQi.setBackground(Color.blue);
                buttonJieQi.setText("节气关");
            } else {
                buttonJieQi.setText("节气开");
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[24];
                    commonRotClass.inputs[0] = new String("夏至");
                    commonRotClass.inputs[1] = new String("芒种");
                    commonRotClass.inputs[2] = new String("小满");
                    commonRotClass.inputs[3] = new String("立夏");
                    commonRotClass.inputs[4] = new String("谷雨");

                    commonRotClass.inputs[5] = new String("清明");
                    commonRotClass.inputs[6] = new String("春分");
                    commonRotClass.inputs[7] = new String("惊蛰");
                    commonRotClass.inputs[8] = new String("雨水");
                    commonRotClass.inputs[9] = new String("立春");

                    commonRotClass.inputs[10] = new String("大寒");
                    commonRotClass.inputs[11] = new String("小寒");
                    commonRotClass.inputs[12] = new String("冬至");
                    commonRotClass.inputs[13] = new String("大雪");
                    commonRotClass.inputs[14] = new String("小雪");

                    commonRotClass.inputs[15] = new String("立冬");
                    commonRotClass.inputs[16] = new String("霜降");
                    commonRotClass.inputs[17] = new String("寒露");
                    commonRotClass.inputs[18] = new String("秋分");
                    commonRotClass.inputs[19] = new String("白露");

                    commonRotClass.inputs[20] = new String("处暑");
                    commonRotClass.inputs[21] = new String("立秋");
                    commonRotClass.inputs[22] = new String("大暑");
                    commonRotClass.inputs[23] = new String("小暑");
                }
                bootCommonMap("节气", true, commonRotClass);
                buttonJieQi.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("节气", commonRotClass);
        });
        Box sliderBoxJieQi = new Box(BoxLayout.X_AXIS);
        sliderBoxJieQi.add(buttonJieQi);
        sliderBoxJieQi.add(sliderJieQi);
        sliderBoxJieQi.add(sliderJieQiZ);

        //
        sliderQuDu = I_DetaSlider("导入一", true, false);
        sliderQuDuZ = I_DetaSlider("导入一", false, true);
        buttonQuDu = new DetaButton("导入关", 100, 50, Color.BLUE);
        buttonQuDu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //to do..
                CommonRotClass commonRotClass = new CommonRotClass();
                if (rootClassMap.containsKey("导入一")) {
                    commonRotClass = rootClassMap.getCommonRotClass("导入一");
                }
                if (commonRotClass.buttonClicked) {
                    buttonQuDu.setBackground(Color.blue);
                    buttonQuDu.setText("导入关");
                } else {
                    buttonQuDu.setText("导入开");
                    //read
                    List<String> list = GetCompassList.doGetCompassList();
                    //get
                    commonRotClass.inputs = new String[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        commonRotClass.inputs[i] = list.get(i).toString();
                    }
                    bootCommonMap("导入一", true, commonRotClass);
                    buttonQuDu.setBackground(Color.gray);
                }
                commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
                rootClassMap.put("导入一", commonRotClass);
            }
        });
        Box sliderBoxQuDu = new Box(BoxLayout.X_AXIS);
        sliderBoxQuDu.add(buttonQuDu);
        sliderBoxQuDu.add(sliderQuDu);
        sliderBoxQuDu.add(sliderQuDuZ);

        //
        sliderXianWei = I_DetaSlider("导入二", true, false);
        sliderXianWeiZ = I_DetaSlider("导入二", false, true);
        buttonXianWei = new DetaButton("导入二", 100, 50, Color.PINK);
        buttonXianWei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //to do..
                CommonRotClass commonRotClass = new CommonRotClass();
                if (rootClassMap.containsKey("导入二")) {
                    commonRotClass = rootClassMap.getCommonRotClass("导入二");
                }
                if (commonRotClass.buttonClicked) {
                    buttonXianWei.setBackground(Color.blue);
                } else {
                    //read
                    List<String> list = GetCompassList.doGetCompassList();
                    //get
                    commonRotClass.inputs = new String[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        commonRotClass.inputs[i] = list.get(i).toString();
                    }
                    bootCommonMap("导入二", true, commonRotClass);
                    buttonXianWei.setBackground(Color.gray);
                }
                commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
                rootClassMap.put("导入二", commonRotClass);
            }
        });

        Box sliderBoxXianWei = new Box(BoxLayout.X_AXIS);
        sliderBoxXianWei.add(buttonXianWei);
        sliderBoxXianWei.add(sliderXianWei);
        sliderBoxXianWei.add(sliderXianWeiZ);

        sliderYinWei = I_DetaSlider("导入三", true, false);
        sliderYinWeiZ = I_DetaSlider("导入三", false, true);
        buttonYinWei = new DetaButton("导入三", 100, 50, Color.pink);
        buttonYinWei.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("导入三")) {
                commonRotClass = rootClassMap.getCommonRotClass("导入三");
            }
            if (commonRotClass.buttonClicked) {
                buttonYinWei.setBackground(Color.blue);
            } else {
                //read
                List<String> list = GetCompassList.doGetCompassList();
                //get
                commonRotClass.inputs = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    commonRotClass.inputs[i] = list.get(i).toString();
                }
                bootCommonMap("导入三", true, commonRotClass);
                buttonYinWei.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("导入三", commonRotClass);
        });
        Box sliderBoxYinWei = new Box(BoxLayout.X_AXIS);
        sliderBoxYinWei.add(buttonYinWei);
        sliderBoxYinWei.add(sliderYinWei);
        sliderBoxYinWei.add(sliderYinWeiZ);
        //
        sliderXueWei = I_DetaSlider("导入四", true, false);
        sliderXueWeiZ = I_DetaSlider("导入四", false, true);
        buttonXueWei = new DetaButton("导入四", 100, 50, Color.pink);
        buttonXueWei.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("导入四")) {
                commonRotClass = rootClassMap.getCommonRotClass("导入四");
            }
            if (commonRotClass.buttonClicked) {
                buttonXueWei.setBackground(Color.blue);
            } else {
                //read
                List<String> list = GetCompassList.doGetCompassList();
                //get
                commonRotClass.inputs = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    commonRotClass.inputs[i] = list.get(i).toString();
                }
                bootCommonMap("导入四", true, commonRotClass);
                buttonXueWei.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("导入四", commonRotClass);
        });
        Box sliderBoxXueWei = new Box(BoxLayout.X_AXIS);
        sliderBoxXueWei.add(buttonXueWei);
        sliderBoxXueWei.add(sliderXueWei);
        sliderBoxXueWei.add(sliderXueWeiZ);
        //
        slider_five = I_DetaSlider("_five", true, false);
        slider_fiveZ = I_DetaSlider("_five", false, true);
        button_five = new DetaButton("_five", 100, 50, Color.pink);
        button_five.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("_five")) {
                commonRotClass = rootClassMap.getCommonRotClass("_five");
            }
            if (commonRotClass.buttonClicked) {
                button_five.setBackground(Color.blue);
            } else {
                //read
                List<String> list = GetCompassList.doGetCompassList();
                //get
                commonRotClass.inputs = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    commonRotClass.inputs[i] = list.get(i).toString();
                }
                bootCommonMap("_five", true, commonRotClass);
                button_five.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("_five", commonRotClass);
        });
        Box sliderBox_five = new Box(BoxLayout.X_AXIS);
        sliderBox_five.add(button_five);
        sliderBox_five.add(slider_five);
        sliderBox_five.add(slider_fiveZ);

        slider_six = I_DetaSlider("_six", true, false);
        slider_sixZ = I_DetaSlider("_six", false, true);
        button_six = new DetaButton("_six", 100, 50, Color.pink);
        button_six.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("_six")) {
                commonRotClass = rootClassMap.getCommonRotClass("_six");
            }
            if (commonRotClass.buttonClicked) {
                button_six.setBackground(Color.blue);
            } else {
                //read
                List<String> list = GetCompassList.doGetCompassList();
                //get
                commonRotClass.inputs = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    commonRotClass.inputs[i] = list.get(i).toString();
                }
                bootCommonMap("_six", true, commonRotClass);
                button_six.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("_six", commonRotClass);
        });
        Box sliderBox_six = new Box(BoxLayout.X_AXIS);
        sliderBox_six.add(button_six);
        sliderBox_six.add(slider_six);
        sliderBox_six.add(slider_sixZ);

        //稍后缩进
        slider_seven = I_DetaSlider("_seven", true, false);
        slider_sevenZ = I_DetaSlider("_seven", false, true);
        button_seven = new DetaButton("_seven", 100, 50, Color.pink);
        button_seven.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("_seven")) {
                commonRotClass = rootClassMap.getCommonRotClass("_seven");
            }
            if (commonRotClass.buttonClicked) {
                button_seven.setBackground(Color.blue);
            } else {
                //read
                List<String> list = GetCompassList.doGetCompassList();
                //get
                commonRotClass.inputs = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    commonRotClass.inputs[i] = list.get(i).toString();
                }
                bootCommonMap("_seven", true, commonRotClass);
                button_seven.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("_seven", commonRotClass);
        });
        Box sliderBox_seven = new Box(BoxLayout.X_AXIS);
        sliderBox_seven.add(button_seven);
        sliderBox_seven.add(slider_seven);
        sliderBox_seven.add(slider_sevenZ);
        //
        sliderJingYi = I_DetaSlider("导入八", true, false);
        sliderJingYiZ = I_DetaSlider("导入八", false, true);
        buttonJingYi = new DetaButton("导入八", 100, 50, Color.green);
        buttonJingYi.addActionListener(e -> {
            //to do..
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("导入八")) {
                commonRotClass = rootClassMap.getCommonRotClass("导入八");
            }
            if (commonRotClass.buttonClicked) {
                buttonJingYi.setBackground(Color.blue);
            } else {
                //read
                List<String> list = GetCompassList.doGetCompassList();
                //get
                commonRotClass.inputs = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    commonRotClass.inputs[i] = list.get(i).toString();
                }
                bootCommonMap("导入八", true, commonRotClass);
                buttonJingYi.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("导入八", commonRotClass);
        });
        Box sliderBoxJingYi = new Box(BoxLayout.X_AXIS);
        sliderBoxJingYi.add(buttonJingYi);
        sliderBoxJingYi.add(sliderJingYi);
        sliderBoxJingYi.add(sliderJingYiZ);
        //
        sliderBoxRight.add(sliderBoxFangDa);
        sliderBoxRight.add(sliderBoxSuoXiao);
        sliderBoxRight.add(sliderBoxShunLiu);
        sliderBoxRight.add(sliderBoxNiLiu);

        sliderBoxRight.add(sliderBoxSanJiao);
        sliderBoxRight.add(sliderBoxBaGang);
        sliderBoxRight.add(sliderBoxBaYou);
        sliderBoxRight.add(sliderBoxYuanJi);
        sliderBoxRight.add(sliderBoxShuangYuan);
        sliderBoxRight.add(sliderBoxJingLuo);

        sliderBoxRight.add(sliderBoxHeLuo);
        sliderBoxRight.add(sliderBoxLiuRen);
        sliderBoxRight.add(sliderBoxLiuZhu);
        sliderBoxRight.add(sliderBoxTianXing);
        sliderBoxRight.add(sliderBoxYiShu);
        sliderBoxRight.add(sliderBoxZiWu);
        sliderBoxRight.add(sliderBoxKanYu);

        sliderBoxRight.add(sliderBoxWuXing);
        sliderBoxRight.add(sliderBoxJieQi);
        sliderBoxRight.add(sliderBoxQuDu);
        sliderBoxRight.setBounds(720, 0, 300, 780);
        return sliderBoxRight;
    }

    public JSlider createSlider() {
        return null;
        //稍后优化。。~
    }

    public Box creatOperationsBox() {
        sliderx = new DetaSlider(0, 1500);
        sliderx.setSnapToTicks(true);
        sliderx.setPaintTicks(true);
        sliderx.setMajorTickSpacing(20);
        sliderx.setMinorTickSpacing(1);
        sliderx.addChangeListener(event -> {
            JSlider source = (JSlider) event.getSource();
            xrot = source.getValue() << 2;
        });
        DetaThread.sleepDeta(100);
        slidery = new DetaSlider(0, 1500);
        slidery.setSnapToTicks(true);
        slidery.setPaintTicks(true);
        slidery.setMajorTickSpacing(20);
        slidery.setMinorTickSpacing(1);
        slidery.addChangeListener(event -> {
            JSlider source = (JSlider) event.getSource();
            yrot = source.getValue() << 2;
        });
        DetaThread.sleepDeta(100);
        sliderz = new DetaSlider(0, 1500);
        sliderz.setSnapToTicks(true);
        sliderz.setPaintTicks(true);
        sliderz.setMajorTickSpacing(20);
        sliderz.setMinorTickSpacing(1);
        sliderz.addChangeListener(event -> {
            JSlider source = (JSlider) event.getSource();
            zrot = source.getValue() << 2;
        });
        DetaThread.sleepDeta(100);
        slidert = new DetaSlider(1, 150);
        slidert.setSnapToTicks(true);
        slidert.setPaintTicks(true);
        slidert.setMajorTickSpacing(20);
        slidert.setMinorTickSpacing(1);
        slidert.addChangeListener(event -> {
            JSlider source = (JSlider) event.getSource();
            irot = source.getValue() << 2;
        });
        top = new DetaButton("top", 100, 50, Color.pink);
        top.addActionListener(e -> brot += 0.5);
        down = new DetaButton("down", 100, 50, Color.orange);
        down.addActionListener(e -> brot -= 0.5);
        left = new DetaButton("left", 100, 50, Color.pink);
        left.addActionListener(e -> lrot -= 0.5);
        right = new DetaButton("right", 100, 50, Color.green);
        right.addActionListener(e -> lrot += 0.5);
        bhl = new DetaButton("元基五行", 100, 50, Color.pink);
        bhl.addActionListener(e -> {
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("五行")) {
                commonRotClass = rootClassMap.getCommonRotClass("五行");
            }
            if (commonRotClass.buttonClicked) {
                buttonSanJiao.setBackground(Color.blue);
            } else {
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[5];
                    commonRotClass.inputs[0] = new String("H PV DD 酰 火↑");
                    commonRotClass.inputs[1] = new String("H OEU 醇酮 木↖");
                    commonRotClass.inputs[2] = new String("H CDI 酯酸 土↗");
                    commonRotClass.inputs[3] = new String("H MXS 醚 水↙");
                    commonRotClass.inputs[4] = new String("H AQT 酚酶 金↘");
                }
                bootCommonMap("五行", true, commonRotClass);
                buttonSanJiao.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("五行", commonRotClass);
        });
        cfc = new DetaButton("双元", 100, 50, Color.orange);
        cfc.addActionListener(e -> {
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("双元")) {
                commonRotClass = rootClassMap.getCommonRotClass("双元");
            }
            if (commonRotClass.buttonClicked) {
                buttonSanJiao.setBackground(Color.blue);
            } else {
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("DH 景 酰 离↑ Ⅲ");
                    commonRotClass.inputs[1] = new String("QA 杜 酸 巽↖ Ⅴ");
                    commonRotClass.inputs[2] = new String("PI 殇 酮 震← Ⅳ");
                    commonRotClass.inputs[3] = new String("ST 生 酯 艮↙ Ⅶ");
                    commonRotClass.inputs[4] = new String("UO 休 酚 坎↓ Ⅵ");
                    commonRotClass.inputs[5] = new String("MV 开 醚 乾↘ Ⅰ");
                    commonRotClass.inputs[6] = new String("CX 惊 醇 兑→ Ⅱ");
                    commonRotClass.inputs[7] = new String("DD E 殒 酶 坤↗ Ⅷ");
                }
                bootCommonMap("双元", true, commonRotClass);
                buttonSanJiao.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("双元", commonRotClass);
        });
        whh = new DetaButton("元基八卦", 200, 50, Color.magenta);
        whh.addActionListener(e -> {
            CommonRotClass commonRotClass = new CommonRotClass();
            if (rootClassMap.containsKey("阴阳")) {
                commonRotClass = rootClassMap.getCommonRotClass("阴阳");
            }
            if (commonRotClass.buttonClicked) {
                buttonSanJiao.setBackground(Color.blue);
            } else {
                if (null == commonRotClass.inputs) {
                    commonRotClass.inputs = new String[8];
                    commonRotClass.inputs[0] = new String("PV 景 酰 离↑ Ⅲ");
                    commonRotClass.inputs[1] = new String("UH 杜 酮 巽↖ Ⅴ");
                    commonRotClass.inputs[2] = new String("OE 殇 醇 震← Ⅳ");
                    commonRotClass.inputs[3] = new String("IX 生 酯 艮↙ Ⅶ");
                    commonRotClass.inputs[4] = new String("MS 休 醚 坎↓ Ⅵ");
                    commonRotClass.inputs[5] = new String("Q 开 酶 乾↘ Ⅰ");
                    commonRotClass.inputs[6] = new String("ACT 惊 酚 兑→ Ⅱ");
                    commonRotClass.inputs[7] = new String("D 殒 酸 坤↗ Ⅷ");
                }
                bootCommonMap("阴阳", true, commonRotClass);
                buttonSanJiao.setBackground(Color.gray);
            }
            commonRotClass.buttonClicked = !commonRotClass.buttonClicked;
            rootClassMap.put("阴阳", commonRotClass);
        });
        rst = new DetaButton("重置", 200, 50, Color.pink);
        rst.addActionListener(e -> {
            xrot = -0.0f;
            yrot = -0.0f;
            zrot = 360.0f;
            trot = 0.0f;
            prot = 1.0f;
            lrot = -1.5f;
            brot = -0.5f;
            irot = 78.0f;
            srot = 0.7f;
        });

        save = new DetaButton("保存", 200, 50, Color.green);
        //	rst.setBounds(0, 0, 100, 20);
        save.addActionListener(e -> {
            xrotr = xrot;
            yrotr = yrot;
            zrotr = zrot;
            trotr = trot;
            protr = prot;
            lrotr = lrot;
            brotr = brot;
            irotr = irot;
            srotr = srot;
        });

        load = new DetaButton("读取", 200, 50, Color.magenta);
        //	rst.setBounds(0, 0, 100, 20);
        load.addActionListener(e -> {
            xrot = xrotr;
            yrot = yrotr;
            zrot = zrotr;
            trot = trotr;
            prot = protr;
            lrot = lrotr;
            brot = brotr;
            irot = irotr;
            srot = srotr;
        });
        buttonBox.add(top);
        buttonBox.add(down);
        buttonBox.add(left);
        DetaThread.sleepDeta(100);
        buttonBox.add(right);
        buttonBox.add(whh);
        buttonBox.add(bhl);
        buttonBox.add(cfc);
        buttonBox.add(rst);
        buttonBox.add(save);
        //buttonBox.add(load);
        Box buttonBoxX = new Box(BoxLayout.X_AXIS);
        JButton xzb = new DetaButton("X坐标", 200, 50, Color.pink);
        buttonBoxX.add(xzb);
        buttonBoxX.add(sliderx);
        sliderBoxx1.add(buttonBoxX);

        Box buttonBoxY = new Box(BoxLayout.X_AXIS);
        JButton yzb = new DetaButton("Y坐标", 200, 50, Color.pink);
        buttonBoxY.add(yzb);
        buttonBoxY.add(slidery);
        sliderBoxx1.add(buttonBoxY);

        Box buttonBoxZ = new Box(BoxLayout.X_AXIS);
        JButton zzb = new DetaButton("Z坐标", 200, 50, Color.pink);
        buttonBoxZ.add(zzb);
        buttonBoxZ.add(sliderz);
        sliderBoxx2.add(buttonBoxZ);

        Box buttonBoxT = new Box(BoxLayout.X_AXIS);
        JButton tzb = new DetaButton("T坐标", 200, 50, Color.pink);
        buttonBoxT.add(tzb);
        buttonBoxT.add(slidert);
        sliderBoxx2.add(buttonBoxT);
        sliderBox.add(sliderBoxx1);
        sliderBox.add(sliderBoxx2);
        sliderBox.add(buttonBox);
        sliderBox.setBounds(0, 660, 718, 300);
        return sliderBox;
    }
}