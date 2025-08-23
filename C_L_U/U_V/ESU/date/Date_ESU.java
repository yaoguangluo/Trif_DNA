package U_V.ESU.date;

import S_A.ESU.code.stable.S_;

import java.sql.Timestamp;
import java.util.Date;

@SuppressWarnings({S_.SUPPRESS_WARNINGS_DEPRECATION
    , S_.SUPPRESS_WARNINGS_STATIC_ACCESS})
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
public class Date_ESU {
    public static String dateToGMTString(Date date) {
        return date.toGMTString();
    }

    public static String dateToYYYYMMDD(Date date) {
        return S_.STRING_EMPTY + date.getYear()
            + S_.STRING_PER + date.getMonth()
            + S_.STRING_PER + date.getDay();
    }

    public static String dateToHHMMSS(Date date) {
        return S_.STRING_EMPTY + date.getHours()
            + S_.STRING_PER + date.getMinutes()
            + S_.STRING_PER + date.getSeconds();
    }

    public static String dateToMiliSeconds(Date date) {
        return S_.STRING_EMPTY + date.getTime();
    }

    public static Date MiliSecondsToDate(String miliSeconds) {
        long miliSecondsLong = Long.parseLong(miliSeconds);
        return new Date(miliSecondsLong);
    }

    public static String getCurrentMiliSeconds(Date date) {
        return S_.STRING_EMPTY + new Date().getTime();
    }

    public static Timestamp dateToTimeStamp(Date date) {
        long utc = date.UTC(date.getYear(), date.getMonth(), date.getDay()
            , date.getHours(), date.getMinutes(), date.getSeconds());
        return new Timestamp(utc);
    }

    public static long timeStampToMiliSeconds(Timestamp timestamp) {
        return timestamp.getTime();
    }

    public static String timeStampToMiliSecondsWithSize(Timestamp timestamp
        , int size) {
        String time = S_.STRING_EMPTY + timestamp.getTime();
        return time.substring(0, size);
    }

    public static String dateStringToMiliSeconds(String string) {
        return S_.STRING_EMPTY + new Date(string).getTime();
    }
}
