/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package O_V.OSI.AOP.neo.tts;

import ME.VPC.S.ne.App_S;
import C_A.ME.analysis.C.A;
import ME.VPC.M.app.App;
import M_V.MVQ.button.DetaButton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//编码设计：罗瑶光
//refer Jacob 语音 api demo
//refer 德塔图灵系统, 极速中文分词  罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ReadChinese extends Thread implements Runnable {
    public boolean waitString = false;
    public boolean waitWord = false;
    public boolean stopRead = false;
    public int finish = 0;
    public int oldSpeed = 0;
    public String text = "";
    public Iterator<String> listIterator;
    public Iterator<String> iterator;
    private List<String> setsForGet;
    public DetaButton buttonCTV;
    com.jacob.activeX.ActiveXComponent sap;
    public com.jacob.com.Dispatch sapo;
    public App_S app;
    public A _A;//对象只是 地址位而已, 不是clone, copy和 new

    @SuppressWarnings("unused")
    public ReadChinese(DetaButton buttonCTV, App_S app) {
//		this.buttonCTV= buttonCTV;
//		this.app= app;
//		this._A= _A;
//		oldSpeed= NE.app_S.read_speed_rot;
//		sap= new com.jacob.activeX.ActiveXComponent("Sapi.SpVoice");
//		sapo= sap.getObject();
//		try {
//			// 音量 0-100
//			sap.setProperty("Volume", new com.jacob.com.Variant(100));
//			// 语音朗读速度 -10 到 +10
//			sap.setProperty("Rate", new com.jacob.com.Variant(-10
//					+ NE.app_S.read_speed_rot));
//			com.jacob.com.Variant defalutVoice= sap.getProperty("Voice");
//			com.jacob.com.Dispatch dispdefaultVoice= defalutVoice.toDispatch();
//			com.jacob.com.Variant allVoices= com.jacob.com.Dispatch.call(sapo, "GetVoices");
//			com.jacob.com.Dispatch dispVoices= allVoices.toDispatch();
//			com.jacob.com.Dispatch setvoice= com.jacob.com.Dispatch.call(dispVoices
//					, "Item", new com.jacob.com.Variant(1)).toDispatch();
//			com.jacob.activeX.ActiveXComponent voiceActivex
//			= new com.jacob.activeX.ActiveXComponent(dispdefaultVoice);
//			com.jacob.activeX.ActiveXComponent setvoiceActivex
//			= new com.jacob.activeX.ActiveXComponent(setvoice);
//			com.jacob.com.Variant item
//			= com.jacob.com.Dispatch.call(setvoiceActivex, "GetDescription");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//		}
    }

    public void read(String string) {
        com.jacob.com.Dispatch.call(sapo, "Speak", new com.jacob.com.Variant(string));

    }

    @SuppressWarnings("deprecation")
    public void run() {
        if (finish == 1) {
            this.read(this.text);
        }
        if (finish == 2) {
            List<String> list = new ArrayList<>();
            iterator = setsForGet.iterator();
            while (iterator.hasNext() && finish == 2) {
                while (waitString == true) {
                    while (iterator.hasNext()) {
                        iterator.next();
                    }
                    waitString = false;
                }
                if (iterator.hasNext()) {
                    String readString = iterator.next();
//					if(null!= app) {
//						list= app._A.parserMixedString(readString);
//					}else if(null!= _A) {
//						list= _A.parserMixedString(readString);
//					}
                    list.clear();
                    long stopBy = 25;
                    char[] words = readString.toCharArray();
                    int i = 0;
                    while (i < words.length) {
                        int j = 0;
                        StringBuilder stringBuilder = new StringBuilder();
                        while (j < stopBy && i + j < words.length) {
                            stringBuilder.append(words[i + (j++)]);
                        }
                        list.add(stringBuilder.toString());
                        i += j;
                    }
                    if (null != list && finish == 2) {
                        listIterator = list.iterator();
                        while (listIterator.hasNext()) {
                            while (waitWord == true) {
                                while (listIterator.hasNext()) {
                                    listIterator.next();
                                }
                                waitWord = false;
                            }
                            if (listIterator.hasNext()) {
                                this.read(listIterator.next().replace("<", "").replace(">", ""));
                            }
                        }
                    }
                }
            }
        }
        finish = 0;
        buttonCTV.setLabel("阅读关");
    }

    public void I_PreReadText(String text) {
        if (text.length() == 0) {
            return;
        }
        finish = 1;
        this.text = text;
    }

    @SuppressWarnings("unused")
    public void I_PreReadList(List<String> setsForGet, App NE) {
        if (setsForGet.size() == 0) {
            return;
        }
        finish = 2;
        this.setsForGet = setsForGet;
        if (oldSpeed != NE.app_S.read_speed_rot) {
            oldSpeed = NE.app_S.read_speed_rot;
            //sap= new com.jacob.activeX.ActiveXComponent("Sapi.SpVoice");
            sapo = sap.getObject();
            try {
                // 音量 0-100
                sap.setProperty("Volume", new com.jacob.com.Variant(100));
                // 语音朗读速度 -10 到 +10
                sap.setProperty("Rate", new com.jacob.com.Variant(-10 + oldSpeed));
                com.jacob.com.Variant defalutVoice = sap.getProperty("Voice");
                com.jacob.com.Dispatch dispdefaultVoice = defalutVoice.toDispatch();
                com.jacob.com.Variant allVoices = com.jacob.com.Dispatch.call(sapo, "GetVoices");
                com.jacob.com.Dispatch dispVoices = allVoices.toDispatch();
                com.jacob.com.Dispatch setvoice = com.jacob.com.Dispatch.call(dispVoices
                    , "Item", new com.jacob.com.Variant(1)).toDispatch();
                com.jacob.activeX.ActiveXComponent voiceActivex
                    = new com.jacob.activeX.ActiveXComponent(dispdefaultVoice);
                com.jacob.activeX.ActiveXComponent setvoiceActivex
                    = new com.jacob.activeX.ActiveXComponent(setvoice);
                com.jacob.com.Variant item
                    = com.jacob.com.Dispatch.call(setvoiceActivex, "GetDescription");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }
        }
    }

    public void I_NullSap() {
        try {
            if (null != sapo) {
                sapo.safeRelease();
            }
            if (null != sap) {
                sap.safeRelease();
            }
        } catch (Exception E) {
            //System.gc();
        }
    }
}

//public void run() {
//if(finish== 1) {
//	this.read(this.text);	
//}
//if(finish== 2) {
//	Iterator<String> iterator= setsForGet.iterator();
//	String readString= "";
//	int c= 0;
//	while(iterator.hasNext() && finish== 2) {
//		readString += S_Common.STRING_EMPTY iterator.next();
//		if(c++== 20) {
//			c=0;
//			this.read(readString);	
//			readString=" ";
//		}
//	}
//	if(c!=0) {
//		this.read(readString);	
//	}
//}
//finish=0;
//}

