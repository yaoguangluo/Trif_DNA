package ME.VPC.S.ne;

import ME.VPC.M.app.App;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextPane;

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
public class SectionJPanel_X_S extends JPanel {
    
    public String[] tabNames = {"中药本草", "数据分析", "智能相诊", "图片搜索"
        , "位术数", "西医内科", "中医方剂", "中医诊断", "古籍"
        , "中医生殖", "西医妇幼", "西医急诊", "大外科", "中医外伤"
        , "西药处方", "编辑页", "哈里森内科", "五官科", "男科", "老年科"
        , "传染科", "新生儿科", "麻醉科", "精神科", "脑外科", "现代护理"
        , "核医学", "肿瘤科", "西医骨伤", "遗传学"};
    public JCheckBox jlabel_box[];
    public JCheckBox xlsWithSpec;
    public JCheckBox pagehookJCheckBox;
    public boolean[] tabNamesHook = new boolean[30];
    public boolean isConfig = true;
    public JCheckBox jlabel_end_boxs;
    public JCheckBox jlabel_end_boxs1;
    public JCheckBox jlabel_end_boxs2;
    public JCheckBox jlabel_end_boxs3;
    public JCheckBox jlabel_peizhi_di25;
    public JTextPane jTextPane;
    public JCheckBox jlabel_peizhi_di2511;
    @SuppressWarnings("unused")
    private JCheckBox jlabel_peizhi_di2512;
    public JCheckBox jlabel_peizhi_di2513;
    //	private JComponent jlabelpeizhi2255;
//	private JComponent jlabelpeizhi2256;
//	private JComponent jlabelpeizhi2257;
    public JCheckBox jlabel_peizhi_di2515;
    public JCheckBox jlabel_end_boxs31;
    public JCheckBox jlabel_peizhi_di2233;//专家
    public JCheckBox jlabel_peizhi_di2122;//DNN
    public App appInThisClass;
    public App NE;
    @SuppressWarnings("rawtypes")
    public JComboBox newPages;
    public M_V.MVQ.button.DetaButton boot_button;
}