package Q_A.OSQ.disk;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.io.File;
import java.io.FileWriter;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class GetDisk {
    public String getSerialNumber(String drive) {
        String result = "";
        try {
            File file = File.createTempFile("realhowto", ".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);
            String vbs = "Set objFSO= CreateObject(\"Scripting.FileSystemObject\")\n"
                + "Set colDrives= objFSO.Drives\n"
                + "Set objDrive= colDrives.item(\"" + drive + "\")\n"
                + "Wscript.Echo objDrive.SerialNumber";// see note
            fw.write(vbs);
            fw.close();
            Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
            DetaBufferedReader input = new DetaBufferedReader(DetaInputStreamReader.E(p.getInputStream()));
            String line;
            while ((line = input.readDetaLine()) != null) {
                result += line;
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.trim();
    }

    public String getKey() {
        String s = getSerialNumber("A");
        s += getSerialNumber("B");
        s += getSerialNumber("C");
        s += getSerialNumber("D");
        s += getSerialNumber("E");
        s += getSerialNumber("F");
        s += getSerialNumber("G");
        s += getSerialNumber("H");
        s += getSerialNumber("I");
        s += getSerialNumber("J");
        s += getSerialNumber("K");
        s += getSerialNumber("L");
        s += getSerialNumber("M");
        s += getSerialNumber("N");
        s += getSerialNumber("O");
        s += getSerialNumber("P");
        s += getSerialNumber("Q");
        s += getSerialNumber("R");
        s += getSerialNumber("S");
        s += getSerialNumber("T");
        s += getSerialNumber("U");
        s += getSerialNumber("V");
        s += getSerialNumber("W");
        ;
        s += getSerialNumber("X");
        s += getSerialNumber("Y");
        s += getSerialNumber("Z");
        return s;
    }

    public static void main(String[] argv) {
        //20230106-System.out.println(new GetDisk().getKey().replaceAll(" ", ""));
    }
}
