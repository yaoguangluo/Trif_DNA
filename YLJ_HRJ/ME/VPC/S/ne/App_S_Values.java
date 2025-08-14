package ME.VPC.S.ne;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import S_A.SVQ.stable.S_Tag;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class App_S_Values extends App_S_X_Statics {
    //
    public List<String> CacheStringPiple = new CopyOnWriteArrayList<>();
    public IMV_SIQ CacheString = new IMV_SIQ();
    public List<OSU_MCI_MCU_MSI> searchList = new ArrayList<>();
    public IMV_SIQ_ dic_map = new IMV_SIQ_();
    public IMV_SIQ_ dic_li = new IMV_SIQ_();
    public IMV_SIQ_ dic_hai = new IMV_SIQ_();
    public IMV_SIQ_ dic_xz = new IMV_SIQ_();
    public IMV_SIQ_ dic_ya = new IMV_SIQ_();
    public IMV_SIQ_ dic_jm = new IMV_SIQ_();
    public IMV_SIQ_ dic_xw = new IMV_SIQ_();
    public IMV_SIQ_ dic_cy = new IMV_SIQ_();
    public IMV_SIQ_ dic_cj = new IMV_SIQ_();
    public IMV_SIQ_ dic_jj = new IMV_SIQ_();
    public IMV_SIQ_ dic_zf = new IMV_SIQ_();
    public IMV_SIQ_ dic_yl = new IMV_SIQ_();
    public IMV_SIQ_ dic_yw = new IMV_SIQ_();
    public IMV_SIQ_ dic_index = new IMV_SIQ_();
    public Map<String, IMV_SIQ> DNNmap = new IMV_SIQ();
    public Map<String, int[][]> subASCmap = new IMV_SIQ();
    //values
    public int currentPage;
    public int rangeHigh = 40;
    public int row = 0;
    public int col = 0;
    public int lookrot;
    public int raterot;
    public int leafrot;
    public int read_speed_rot;
    public int size_font_rot;
    public int color_bg_rot;
    public int catalyticRot;
    public boolean ready = false;
    public boolean DNASearchIsClick;
    public boolean bootDBInTXTWay = false;
    public boolean bootDBInBaseWay = false;
    public boolean bootDBInWebWay = false;
    public boolean disableCursor = true;
    public double jsliderDNNRatio;
    public String fourInitonSuanTxt = "";
    public String fourInitonJianTxt = "";
    public String sixteenInitonJianTxt = "";
    public String sixteenInitonSuanTxt = "";
    public String key = "";
    public String fourInitonSuanFaTxt;
    public String fourInitonSuanBiTxt;
    public String fourInitonSuanJingTxt;
    public String fourInitonSuanPCATxt;
    public String fourInitonSuanECATxt;
    public String fourInitonSuanUPCATxt;
    public String fourInitonSuanICATxt;
    public String fourInitonJianFaTxt;
    public String fourInitonJianBiTxt;
    public String fourInitonJianJingTxt;
    public String fourInitonJianPCATxt;
    public String fourInitonJianECATxt;
    public String fourInitonJianUPCATxt;
    public String fourInitonJianICATxt;
    public String sixteenInitonJianFaTxt;
    public String sixteenInitonJianBiTxt;
    public String sixteenInitonJianJingTxt;
    public String sixteenInitonJianPCATxt;
    public String sixteenInitonJianECATxt;
    public String sixteenInitonJianUPCATxt;
    public String sixteenInitonJianICATxt;
    public String sixteenInitonSuanFaTxt;
    public String sixteenInitonSuanBiTxt;
    public String sixteenInitonSuanJingTxt;
    public String sixteenInitonSuanPCATxt;
    public String sixteenInitonSuanECATxt;
    public String sixteenInitonSuanUPCATxt;
    public String sixteenInitonSuanICATxt;
    public String fourInitonSuanFuTxt;
    public String fourInitonJianFuTxt;
    public String sixteenInitonJianFuTxt;
    public String sixteenInitonSuanFuTxt;
    public String frontendTxt;
    public String backendTxt;
    public String databasePortTxt;
    public String huan_cun_jie_kouTxt;
    public String lan_ya_jie_kouTxt;
    public String Tel_zhong_duan_Txt;
    public String fourInitonJianScaleTxt;
    public String fourInitonSuanScaleTxt;
    public String sixteenInitonJianScaleTxt;
    public String sixteenInitonSuanScaleTxt;
    public String dbConfigPath;
    public String hint;
    //objects
    public Object[] columnTitle = {S_Tag.columnTitle_0, S_Tag.columnTitle_1
        , S_Tag.columnTitle_2, S_Tag.columnTitle_3, S_Tag.columnTitle_4
        , S_Tag.columnTitle_5, S_Tag.columnTitle_6, S_Tag.columnTitle_7
        , S_Tag.columnTitle_8, S_Tag.columnTitle_9, S_Tag.columnTitle_10
        , S_Tag.columnTitle_11, S_Tag.columnTitle_12, S_Tag.columnTitle_13
        , S_Tag.columnTitle_14};
    public Object[][] tableData_old;

    public List<String> dic_list;
    public List<String> copy;
    public List<String> tabNames;
    public List<String> sets;

    public App_S_Values() {
        super();
    }
}
