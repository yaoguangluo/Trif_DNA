package V_A.SQ;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Pos;
import exception.file.O.DetaBufferedReader;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ReadPinYinBihua {
    public static IMV_SIQ_ pinYin = null;
    public static IMV_SIQ biHua = null;

    public static void getPinYinBihuaMap(App NE) {
        try {
            pinYin = new IMV_SIQ_();
            biHua = new IMV_SIQ();
            DetaBufferedReader cReaderp = FastReadProjectFile
                .getDetaBufferedReader(S_File.PinYinCN_lyg
                    , NE.resourceTail + "lygs/", S_Pos.UTF8_STRING);
            //FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
            //, "DetaResources/imgETL/");
            //InputStream inputStreamp= new VerbalSource().getClass()
            //.getResourceAsStream(S_File.PinYinCN_lyg);
            //DetaBufferedReader cReaderp= new DetaBufferedReader(
            //DetaInputStreamReader.E(inputStreamp, "UTF8"));
            //index
            String cInputStringp;
            while ((cInputStringp = cReaderp.readDetaLine()) != null) {
                String[] words = cInputStringp.split("->");
                if (words.length > 1) {
                    pinYin.put(words[0], words[1]);
                }
            }
            cReaderp.close();
            //InputStream inputStreamb= new VerbalSource().getClass()
            //.getResourceAsStream(S_File.BiHuaCN_lyg);
            //DetaBufferedReader cReaderb= new DetaBufferedReader(
            //DetaInputStreamReader.E(inputStreamb, "UTF8"));
            DetaBufferedReader cReaderb = FastReadProjectFile
                .getDetaBufferedReader(S_File.BiHuaCN_lyg
                    , NE.resourceTail + "lygs/", S_Pos.UTF8_STRING);
            //index
            String cInputStringb;
            while ((cInputStringb = cReaderb.readDetaLine()) != null) {
                String[] words = cInputStringb.split("->");
                if (words.length > 1) {
                    biHua.put(words[0], Integer.valueOf(words[1]));
                }
            }
            cReaderb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}