package O_V.OSI.AOP.freetts.thread.read;

import java.util.Iterator;

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
public class ReadEnglish extends Thread implements Runnable {
    public String text = "";
    public int finish = 1;
    //public com.sun.speech.freetts.Voice v;
    //private String voiceName= "kevin16";
    //private com.sun.speech.freetts.VoiceManager vm;
    private List<String> setsForGet;

    public ReadEnglish() {
//		vm= com.sun.speech.freetts.VoiceManager.getInstance();
//		v= vm.getVoice(voiceName);
//		v.setPitch(20.f);//20
//		v.setDurationStretch(0.5f);//0.3
//		v.setRate(100f);//100
//		v.setVolume(1f);//1\
    }

    public void read(String string) {
//		v.allocate();
//		v.speak(string);
//		v.deallocate();
    }

    public void run() {
        if (finish == 1) {
            this.read(this.text);
        }
        if (finish == 2) {
            Iterator<String> iterator = setsForGet.iterator();
            String readString = "";
            int c = 0;
            while (iterator.hasNext() && finish == 2) {
                readString += ";" + iterator.next();
                if (c++ == 20) {
                    c = 0;
                    this.read(readString);
                    readString = " ";
                }
            }
            if (c != 0) {
                this.read(readString);
            }
        }
        finish = 0;
    }

    public void I_PreReadText(String text) {
        if (text.length() == 0) {
            return;
        }
        finish = 1;
        this.text = text;
    }

    public void I_PreReadList(List<String> setsForGet) {
        if (setsForGet.size() == 0) {
            return;
        }
        finish = 2;
        this.setsForGet = setsForGet;
    }
}
