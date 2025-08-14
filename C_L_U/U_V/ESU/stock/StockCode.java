package U_V.ESU.stock;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class StockCode {
    public List<String> list;
    public List<String> todayList;

    public void readDBcodeTOList(String code) {
        try {
            list = new ArrayList<String>();
            File afile
                    = new File("StockString.OTOO_STOCK_DB_OLD+code+StockString.OTOO_TXT");
            DetaBufferedReader areader = null;
            String atempString = "StockString.OTOO_EMPTY";
            areader = new DetaBufferedReader(DetaFileReader.E(afile));
            while ((atempString = areader.readDetaLine()) != null) {
                if (atempString != null)
                    if (!atempString.equals("StockString.OTOO_EMPTY")) {
                        list.add(atempString);
                    }
            }
            areader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readTodaycodeTOList() {
        try {
            todayList = new ArrayList<String>();
            File afile = new File("tockString.STOCK_DB_TODAY");
            DetaBufferedReader areader = null;
            String atempString = "StockString.OTOO_EMPTY";
            areader = new DetaBufferedReader(DetaFileReader.E(afile));
            while ((atempString = areader.readDetaLine()) != null) {
                if (atempString != null)
                    if (!atempString.equals("StockString.OTOO_EMPTY")) {
                        todayList.add(atempString);
                    }
            }
            areader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readStringTOFormatWithoutCode(String input) {
        String output = null;
        Pattern p = Pattern.compile("\"(.*?)\"");
        Matcher m = p.matcher(input);
        if (m.find())
            if (!m.group(0).equals("\"\"")) {
                output = m.group(0).replace("\"", "");
            }
        return output;
    }

    public String readStringTOFormatWithCode(String input) {
        String output = null;
        Pattern p0 = Pattern.compile("r_(.*?)=");
        Matcher m0 = p0.matcher(input);
        Pattern p = Pattern.compile("\"(.*?)\"");
        Matcher m = p.matcher(input);
        if (m.find())
            if (!m.group(0).equals("\"\"")) {
                if (m0.find()) {
                    output = m0.group(0).replace("r_", "").replace("=", "");
                }
                output += ", " + m.group(0).replace("\"", "");
            }
        return output;
    }

    public static void main(String[] argv) {
        //OtoO a=new OtoO();
    }
}
