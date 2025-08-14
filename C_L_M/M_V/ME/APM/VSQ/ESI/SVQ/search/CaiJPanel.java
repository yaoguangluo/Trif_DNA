package M_V.ME.APM.VSQ.ESI.SVQ.search;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CaiJPanel extends JPanel {

    /**
     *
     */


    public CaiJPanel(JTextField name) {
        this.setLayout(null);
        this.setBounds(0, 0, 780, 610);
        this.setBackground(Color.BLACK);
//		//copy tab
        JLabel chineseVerbal = new JLabel("chineseVerbal：之后这里横向扩展一个应用面 @^_^@ ");
        chineseVerbal.setForeground(Color.orange);
        chineseVerbal.setBounds(10, 5, 400, 50);
        this.add(chineseVerbal);

        JLabel chinesePinYin = new JLabel("chinesePinYin：之后这里横向扩展一个应用面 @^_^@ ");
        chinesePinYin.setForeground(Color.WHITE);
        chinesePinYin.setBounds(10, 5 + 25, 400, 50);
        this.add(chinesePinYin);

        JLabel chineseExplain = new JLabel("chineseExplain：之后这里横向扩展一个应用面 @^_^@ ");
        chineseExplain.setForeground(Color.WHITE);
        chineseExplain.setBounds(10, 5 + 50, 400, 50);
        this.add(chineseExplain);

        JLabel verbalExplain = new JLabel("verbalExplain：之后这里横向扩展一个应用面 @^_^@ ");
        verbalExplain.setForeground(Color.WHITE);
        verbalExplain.setBounds(10, 5 + 75, 400, 50);
        this.add(verbalExplain);
        //jiuzheng later
        JLabel verbalSynorine = new JLabel("verbalSynorine：之后这里横向扩展一个应用面 @^_^@ ");
        verbalSynorine.setForeground(Color.WHITE);
        verbalSynorine.setBounds(10, 5 + 100, 400, 50);
        this.add(verbalSynorine);

        JLabel verbalAsynorine = new JLabel("verbalAsynorine：之后这里横向扩展一个应用面 @^_^@ ");
        verbalAsynorine.setForeground(Color.WHITE);
        verbalAsynorine.setBounds(10, 5 + 125, 400, 50);
        this.add(verbalAsynorine);

    }
}
