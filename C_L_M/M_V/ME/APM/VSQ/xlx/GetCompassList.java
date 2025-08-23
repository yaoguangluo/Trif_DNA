package M_V.ME.APM.VSQ.xlx;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
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
public class GetCompassList {

    public static List<String> doGetCompassList() {
        List<String> list;
        try {
            list = new ArrayList<>();
            FileDialog filedialog = new FileDialog(new Frame()
                    , "选择罗盘文件", FileDialog.LOAD);
            filedialog.setVisible(true);
            String lyglpFilePath = filedialog.getDirectory() + filedialog.getFile();
            File file;//配置文件在同一个文件架夹下便于管理。
            file = new File(lyglpFilePath);
            if (file.exists()) {//上面的string稍后写在配置面板里面。
                DetaBufferedReader bufferedWriter;
                bufferedWriter = new DetaBufferedReader(DetaInputStreamReader.E
                        (new FileInputStream(file), "UTF8"));
                String line;
                while (true) {
                    if (!((line = bufferedWriter.readDetaLine()) != null)) break;
                    if (!line.isEmpty()) {
                        list.add(line);
                    }
                }
                bufferedWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}