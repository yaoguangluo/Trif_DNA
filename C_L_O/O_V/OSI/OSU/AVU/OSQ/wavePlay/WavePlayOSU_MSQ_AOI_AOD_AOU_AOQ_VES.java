/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package O_V.OSI.OSU.AVU.OSQ.wavePlay;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AOU_AOQ_VES;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class WavePlayOSU_MSQ_AOI_AOD_AOU_AOQ_VES extends OSU_AOU_AOQ_VES {

    private FileDialog filedialog;

    public WavePlayOSU_MSQ_AOI_AOD_AOU_AOQ_VES(
        final WavePlayOSU_MSQ_OPE_OPC_ECI _SQ__OPE_OPC_ECI) {
        setLayout(null);
        scrollPane = new ScrollPane();
        add(scrollPane);
        panel = new Panel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        JButton button = new JButton("Finish");
        button.setBounds(0, 0, 100, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //20230106-System.out.println(e.getSource());
                close = true;
                _SQ__OPE_OPC_ECI.value = 1;
            }
        });
        panel.add(button);
        JButton readfile = new JButton("Read JPG");
        readfile.setBounds(0, 35, 100, 65);
        readfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                filedialog = new FileDialog(new Frame(), "filechoose", FileDialog.LOAD);
                filedialog.setVisible(true);
                _SQ__OPE_OPC_ECI.filepath
                    = filedialog.getDirectory() + filedialog.getFile();
                //20230106-System.out.println(_SQ__OPE_OPC_ECI.filepath);
            }
        });
        panel.add(readfile);
        scrollPane.add(panel);
        close = false;

    }

    public void config() {
        //20230106-System.out.println(S_ShellETL.SHELL_ETL_DID_CONFIG);
    }
}
