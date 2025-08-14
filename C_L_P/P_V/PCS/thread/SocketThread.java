package P_V.PCS.thread;

import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.IVDTIXQCTIV.LenovoInit;
import A_V.E.RatioMap_E;
import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import DSU.V.VtoV;

import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import DVIAQVIMIV.SkinPathDetectTrip_E;
import ME.VPC.M.app.App;
import M_V.MS.VPC.V.RestMap;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SIQ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLDecoder;
import java.net.URLEncoder;
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
public class SocketThread extends Thread implements Runnable {
    private Socket socket;
    private CogsBinaryForest_AE _A;
    private EmotionMap emotionMap;
    private RatioMap_E ratioMap_E;
    private EmotionInit emotionInit;
    private EnvironmentInit environmentInit;
    private SensingMap_E sensingMap_E;
    private EmotionMap_E emotionMap_E;
    private LenovoInit lenovoInit;
    private EmotionSample emotionSample;
    private SensingTest sensingTest;
    private RNN_IDETest rNN_IDETest;
    private String sid;
    private SocketThreadPool socketThreadPool;
    App NE;

    public SocketThread(SocketThreadPool socketThreadPool, Socket socket, String id, App app_NE) {
        NE = app_NE;
        this.socket = socket;
        this.sid = id;
        this._A = NE.app_S._A;
        this.emotionMap = NE.app_S.emotionMap_E;
        this.ratioMap_E = NE.app_S.ratioMap_E;
        this.environmentInit = NE.app_S.environmentInit;
        this.sensingMap_E = NE.app_S.sensingMap_E;
        this.socketThreadPool = socketThreadPool;
    }

    @SuppressWarnings({"unused", "deprecation"})
    public void run() {
        try {
            DetaBufferedReader br = new DetaBufferedReader(
                DetaInputStreamReader.E(socket.getInputStream()));
            String mess = br.readDetaLine();
            if (mess.contains("替") || mess.contains("改") || mess.contains("写")
                || mess.contains("换") || mess.contains("删") || mess.contains("增")
                || mess.contains("更") || mess.contains("rop") || mess.contains("rea")
                || mess.contains("elet") || mess.contains("ate") || mess.contains("ert")
                || mess.contains("lace") || mess.contains("转")) {
                error500();
            }
            if (mess.contains("socketSB")) {
                String[] stringPrefix = mess.split("image=");
                String[] stringPostfix = stringPrefix[1].split(" HTTP");
                String input = URLDecoder.decode(stringPostfix[0]);
                String[] stringRGB = input.split(":");
                int h = Integer.valueOf(stringRGB[0]);
                int w = Integer.valueOf(stringRGB[1]);
                int[][] imageInts = new int[h][w];
                int k = 2;
                int[][][] getSkinBy = new int[3][h][w];
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        imageInts[i][j] = Integer.valueOf(stringRGB[k++]);
                        getSkinBy[0][i][j] = imageInts[i][j] >> 16 & 0xFF;
                        getSkinBy[1][i][j] = imageInts[i][j] >> 8 & 0xFF;
                        getSkinBy[2][i][j] = imageInts[i][j] >> 0 & 0xFF;
                    }
                }
                //图片DNA十六元基肽展识别读脏
                String outputValue = "";
                //imageInts img swap
                StringBuilder page = new StringBuilder();

                //获取图片
                //if(null!= HRJFrame.NE.monitor.img) {
                // 编辑页
                List<String> pathRankList = SkinPathDetectTrip_E.doInnerTest(getSkinBy
                    , NE.app_S);
                if (null != NE.app_S.text && null != pathRankList) {
                    page = new StringBuilder();
                    Iterator<String> iterator = pathRankList.iterator();
                    while (iterator.hasNext()) {
                        String setOfi = iterator.next();
                        page.append("\r\n\r\n" + setOfi);
                    }
                    if (!NE.app_S.text.getText().isEmpty()) {
                        if (NE.app_S.text.getText().length() < 3000) {
                            NE.app_S.text.setText(NE.app_S.text.getText()
                                + "\r\n\r\n" + page.toString());
                        } else {
                            NE.app_S.text.setText(page.toString());
                        }
                    } else {
                        NE.app_S.text.setText(page.toString());
                    }
                    NE.app_S.text.validate();
                }
                //图片搜索页
                if (null != NE.app_S.searchList) {
                    for (int i = 0; i < NE.app_S.searchList.size(); i++) {
                        OSU_MCI_MCU_MSI _OSU_MCI_MCU_MSI
                            = NE.app_S.searchList.get(i);
                        if (_OSU_MCI_MCU_MSI.pageName.equals("图片搜索")) {
                            _OSU_MCI_MCU_MSI.AOP_VEC_SQ_PDE(null
                                , pathRankList);
                        }
                    }
                }
                //}
                //肽计算
                //输出
                outputValue = page.toString();
                String sb = outputValue.toString();
                IMV_SIQ output = new IMV_SIQ();
                output.put(URLEncoder.encode("sb", "UTF-8"), sb);
                String outputString = VtoV.ObjectToJsonString(output);
                //20230106-System.out.println();

                PrintWriter pw = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()
                        , "UTF-8")), true);
                pw.println("HTTP/1.1 200 OK\n\n");
                outputString = outputString.charAt(0) == '"' ? outputString.substring(1
                    , outputString.length()) : outputString;
                outputString = outputString.charAt(outputString.length() - 1) == '"'
                    ? outputString.substring(0
                    , outputString.length() - 1) : outputString;
                pw.println(outputString.replace("\\\"", "\""));
                pw.flush();
                pw.close();
                return;
            }
            if (null == mess) {
                error500();
            }
            if (mess.equalsIgnoreCase("")) {
                error500();
            }
            String[] type = mess.split(" ");
            if (type.length < 2) {
                error500();
            }
            String[] content = type[1].split("\\?");
            if (content.length != 2) {
                error500();
            }
            if (content[1] == null) {
                error500();
            }
            RestMap.P(content, socket, NE);
            socket.close();
        } catch (Exception e) {
            error500();
        }
        socketThreadPool.D_ThreadById(this.sid);
    }

    private void error500() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("HTTP/1.1 500 OK\n\n");
            pw.flush();
            pw.close();
            socket.close();
            socketThreadPool.D_ThreadById(this.sid);
            return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getSid() {
        return this.sid;
    }
}
