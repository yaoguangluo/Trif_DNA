package OSI.OSU.crab;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AOU_AOQ_VES;
import S_A.SVQ.stable.S_ShellETL;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("unused")
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
public class CrabNodePanel extends OSU_AOU_AOQ_VES {
    //
    private JTextPane textTemp;
    private Object[][] tableData_old;

    public CrabNodePanel(final CrabNodeRun _SQ__OPE_OPC_ECI, JTextPane text
            , Object[][] tableData_old) {
        this.textTemp = text;
        this.tableData_old = tableData_old;
        setLayout(null);
        scrollPane = new ScrollPane();
        add(scrollPane);
        panel = new Panel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        JButton button = new JButton(S_ShellETL.SHELL_ETL_FINISH);
        button.setBounds(0, 0, 150, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource());
                close = true;
                _SQ__OPE_OPC_ECI.value = 1;
            }
        });
        panel.add(button);
        JButton readfile = new JButton("");
        readfile.setBounds(0, 35, 150, 65);
        readfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int rc = _SQ__OPE_OPC_ECI.toptablein.getRowCount();
                Object[] spec = new Object[]{"。。。。。。。"};
                Map<Integer, Object[]> cf = new ConcurrentHashMap<Integer, Object[]>();
                int c = 0;
                Here:
                for (int i = 0; i < rc; i++) {
                    for (int j = 0; j < rc; j++) {
                        if (_SQ__OPE_OPC_ECI.toptablein.getValueAt(j, 3).toString()
                                .contains(_SQ__OPE_OPC_ECI.toptablein.getValueAt(i
                                        , 0).toString())) {
                            continue Here;
                        }
                    }
                    Object[] obj = new Object[]{
                            _SQ__OPE_OPC_ECI.toptablein.getValueAt(i, 0),
                            _SQ__OPE_OPC_ECI.toptablein.getValueAt(i, 1),
                            _SQ__OPE_OPC_ECI.toptablein.getValueAt(i, 2),
                            _SQ__OPE_OPC_ECI.toptablein.getValueAt(i, 3),
                            _SQ__OPE_OPC_ECI.toptablein.getValueAt(i, 4),
                            _SQ__OPE_OPC_ECI.toptablein.getValueAt(i, 5),
                    };
                    cf.put(c++, obj);
                }
                Object[][] content = new Object[cf.size()][6];
                for (int i = 0; i < content.length; i++) {
                    content[i] = cf.get(i);
                }
                _SQ__OPE_OPC_ECI.toptablein = new JTable(content, spec);
                _SQ__OPE_OPC_ECI.toptablein.setBounds(0, 100, 400, 400);
                _SQ__OPE_OPC_ECI.toptablein.setVisible(true);
            }
        });
        panel.add(readfile);
        scrollPane.add(panel);
        close = false;
    }

    public void config() {
        System.out.println(S_ShellETL.SHELL_ETL_DID_CONFIG);
    }
}
