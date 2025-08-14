package M_V.MSV.OSU.date;

import S_A.ESU.code.stable.S_;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

//refer www.bjtime.com 第 12, 13, 14行 共三行
//注意如果bjtime 网站关闭了这个功能, 该函数将无效, 请再互联网搜索其他提供时间校验的网址。
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DateValidation {
    public static boolean currentSystemTimeCheck(long offsetUTC8
            , long miliSecondsDistinction) {
        try {
            URL url = null;
            url = new URL(S_.STRING_BJTIME);
            URLConnection uRLConnection = url.openConnection();
            uRLConnection.connect();
            long bjtime = uRLConnection.getDate();
            long system = currentSystemTimeToUTC(offsetUTC8);
            if (miliSecondsDistinction < Math.abs(bjtime - system)) {
                return false;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static long currentSystemTimeToUTC(long offsetUTC8) {
        return new Date().getTime() + offsetUTC8;
    }
}
