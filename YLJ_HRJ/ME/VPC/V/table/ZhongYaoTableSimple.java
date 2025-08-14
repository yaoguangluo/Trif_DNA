package ME.VPC.V.table;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.tableRender.ColorTableRender;
import O_V.OPM.ESU.admin.DBReadMode;
import P.image.Color_P;
import S_A.SVQ.stable.S_Maps;
import U_A.PEU.P.table.TableSorterZYNK;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
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
public class ZhongYaoTableSimple implements MouseListener {
    private App_S app;
    public App NE;

    @SuppressWarnings({"serial"})
    public javax.swing.JTable jTable(App_S app, App app_NE) {
        this.app = app;
        NE = app_NE;
        DBReadMode.readDBInTXTWay(app, NE);
        //DBReadMode.readDBInXLSWay(app);//shaohou later..
        //DBReadMode.readDBInBaseWay(app);
        //DBReadMode.readDBInWebWay(app);
        if (null == app) {
            return null;//fatal trif
        }
        app.tableData_old = new Object[app.dic_map.size()][14];
        Object[][] tableData_old_for_model = new Object[app.dic_map.size()][14];
        Iterator<String> iter = app.dic_map.keySet().iterator();
        app.copy = new ArrayList<>();
        int cc = 0;
        while (iter.hasNext()) {
            String temp = iter.next();
            app.copy.add(temp);
        }
        //System.out.println(cc);
        app.appConfig.SectionJPanel.jTextPane.setText("" + cc);
        for (int i = 0; i < app.copy.size(); i++) {
            app.tableData_old[i] = new Object[]{
                (app.dic_index.get(app.copy.get(i)) == null ? "" : app.dic_index
                    .getTrimString(app.copy.get(i))), "" + 0, app.copy.get(i).trim(),
                (app.dic_yw.get(app.copy.get(i)) == null
                    ? "" : app.dic_yw.getTrimString(app.copy.get(i))),
                (app.dic_li.get(app.copy.get(i)) == null
                    ? "" : app.dic_li.getTrimString(app.copy.get(i))),
                (app.dic_hai.get(app.copy.get(i)) == null
                    ? "详情参考笔记原文列" : app.dic_hai.getTrimString(app.copy.get(i))
                    .equalsIgnoreCase("")
                    ? "详情参考笔记原文列" : app.dic_hai.getTrimString(app.copy.get(i))),
                (app.dic_yl.get(app.copy.get(i)) == null
                    ? "" : app.dic_yl.getTrimString(app.copy.get(i))),
                (app.dic_xw.get(app.copy.get(i)) == null
                    ? "" : app.dic_xw.getTrimString(app.copy.get(i))),
                (app.dic_jm.get(app.copy.get(i)) == null
                    ? "" : app.dic_jm.getTrimString(app.copy.get(i))),
                (app.dic_xz.get(app.copy.get(i)) == null
                    ? "" : app.dic_xz.getTrimString(app.copy.get(i))),
                (app.dic_jj.get(app.copy.get(i)) == null
                    ? "" : app.dic_jj.getTrimString(app.copy.get(i))),
                (app.dic_cy.get(app.copy.get(i)) == null
                    ? "" : app.dic_cy.getTrimString(app.copy.get(i))),
                (app.dic_ya.get(app.copy.get(i)) == null
                    ? "" : app.dic_ya.getTrimString(app.copy.get(i))),
                (app.dic_zf.get(app.copy.get(i)) == null
                    ? "" : app.dic_zf.getTrimString(app.copy.get(i))),
                "" + (i + 1)};
            tableData_old_for_model[i] = app.tableData_old[i].clone();
        }
        app.table = new javax.swing.JTable();
        app.newTableModel = new DefaultTableModel(tableData_old_for_model
            , app.columnTitle) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // ADDE
        TableSorterZYNK sorter = new TableSorterZYNK(app.newTableModel, NE); //ADD
        sorter.I_TableName("zybc");
        sorter.setTableHeader(app.table.getTableHeader());
        app.table.setModel(sorter);
        app.table.setRowHeight(26); //设置高度
        JTableHeader header = app.table.getTableHeader();
        header.setBackground(new Color(245, 245, 220));
        header.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
        app.table.setFont(new Font("楷体", Font.BOLD, 17));// 设置表格字体
        app.table.addMouseListener(this);
        app.table.getColumnModel().getColumn(2).setPreferredWidth(90 + 70);
        app.table.getColumnModel().getColumn(3).setPreferredWidth(90 + 100);
        app.table.getColumnModel().getColumn(4).setPreferredWidth(90 + 130);
        app.table.getColumnModel().getColumn(5).setPreferredWidth(80 + 130);
        app.table.getColumnModel().getColumn(6).setPreferredWidth(100);
        app.table.getColumnModel().getColumn(7).setPreferredWidth(100);
        app.table.getColumnModel().getColumn(8).setPreferredWidth(100);
        app.table.getColumnModel().getColumn(9).setPreferredWidth(150);
        app.table.getColumnModel().getColumn(10).setPreferredWidth(80 + 30);
        app.table.getColumnModel().getColumn(11).setPreferredWidth(80 + 30);
        app.table.getColumnModel().getColumn(12).setPreferredWidth(80 + 30);
        app.table.getColumnModel().getColumn(14).setPreferredWidth(100);
        app.table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        app.table.getTableHeader().setReorderingAllowed(false);
        app.table.validate();
        app.table.setVisible(true);
        ColorTableRender tcr = new ColorTableRender(NE);
        app.table.setDefaultRenderer(Object.class, tcr);
        return app.table;
    }

    public void mouseClicked(MouseEvent arg0) {
        if (null == arg0) {
            app.row = 0;
            app.col = 3;
        } else {
            if (app.disableCursor) {
                return;
            }
            app.row = app.table.getSelectedRow();
            app.col = app.table.getSelectedColumn();
        }
        app.key = app.name.getText();
        if (app.key != null && !app.key.replace(" ", "").equals("")
            && app.key.length() > 20) {
            app.key = app.key.substring(0, 20);
        }
        if (app.key == null) {
            app.key = "";
        }
        if (app.zynkxPage != null) {
            this.app.zynkxPage.key = app.table.getValueAt(app.row, 2).toString();
            this.app.zynkxPage.keyReleased(null);
        }
        try {
            if (null != app.coAuthorForWord) {
                app.coAuthorForWord.bootClassificationMap(app.table.getValueAt(app.row
                    , 2).toString(), false, NE);
            }
            String value = app.table.getValueAt(app.row, app.col).toString();
            if (null == app.data) {//later trif
                app.data = new JTextPane();
            }
            app.data.setSize(500, 800);
            app.sets = app._A.parserMixedString(value);//词性分析
            app.data.setContentType("text/html");
            //稍后优化20230202
            app.currentPage = 0;
            app.currentPage = (app.currentPage < 0 ? 0 : app.currentPage);
            StringBuilder page = new StringBuilder().append("");
            List<String> setsForGet = app.sets.subList(app.currentPage * 500
                , (app.currentPage + 1) * 500 < app.sets.size()
                    ? (app.currentPage + 1) * 500 : app.sets.size());
            Iterator<String> iterator = setsForGet.iterator();
            //
            Here:
            while (iterator.hasNext()) {
                String setOfi = iterator.next();
                if (app.fMHMMListOneTime_E_X_S.posCnToCn.get(setOfi) == null) {
                    page.append("<span style=\"background:" + Color_P
                        .P(255, 255, 255) + "\"><font color="
                        + Color_P.P(0, 0, 0) + " size=\"" + NE.app_S
                        .size_font_rot + "\">" + setOfi + "</font></span>");
                    continue Here;
                }
                if (!setOfi.equals("")) {//later..
                    if (app.key.contains(setOfi)
                        && (S_Maps.mingCi.containsKey(setOfi)
                        || S_Maps.dongCi.containsKey(setOfi)
                        || S_Maps.xingRongCi.containsKey(setOfi))) {
                        page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi
                            + "</font></span>");
                        continue Here;
                    }
                    if (S_Maps.mingCi.containsKey(setOfi)) {
                        page.append("<span style=\"background:" + Color_P
                            .P(255, 245 - app.raterot << 3, 255)
                            + "\"><font color=" + Color_P.P(0, 0, 0)
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + "</font></span>");
                        continue Here;
                    }
                    if (S_Maps.dongCi.containsKey(setOfi)) {
                        page.append("<span style=\"background:" + Color_P
                            .P(255 - 10 - app.raterot << 3, 255, 245
                                - app.raterot << 3) + "\"><font color=" + Color_P.P(0, 0, 0) + " size=\"" + NE.app_S
                            .size_font_rot + "\">" + setOfi + "</font></span>");
                        continue Here;
                    }
                    if (S_Maps.xingRongCi.containsKey(setOfi)) {
                        page.append("<span style=\"background:" + Color_P
                            .P(255, 255, 245 - app.raterot << 3) + "\"><font color="
                            + Color_P.P(0, 0, 0)
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + "</font></span>");
                        continue Here;
                    }
                    if (S_Maps.fuCi.containsKey(setOfi)) {
                        page.append("<span style=\"background:" + Color_P
                            .P(245 - app.raterot << 3, 255, 255) + "\"><font color="
                            + Color_P.P(0, 0, 0)
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + "</font></span>");
                        continue Here;
                    }
                    page.append("<span style=\"background:" + Color_P
                        .P(255, 255, 255) + "\"><font color="
                        + Color_P.P(0, 0, 0)
                        + " size=\"" + NE.app_S.size_font_rot + "\">"
                        + setOfi + "</font></span>");
                }
            }
            app.data.setText(page.toString());
            app.data.setSelectionStart(0);//later separater in 2025.
            app.data.setSelectionEnd(0);
            app.data.validate();
            //add graph
            if (null != app.panel_yt) {
                app.panel_yt.removeAll();
                app.yaoCaiLabel.removeAll();
                String value_temp = app.table.getValueAt(app.row, 2).toString()
                    .replace("\\s+", "");
                app.pngy_2_1 = FastReadProjectFile.getDetaImageIconReader(value_temp
                    + ".png", "DetaResources/yaoCaiTu/");
                app.yaoCaiLabel.setIcon(app.pngy_2_1);
                app.yaoCaiLabel.validate();
                app.panel_yt.add(app.yaoCaiLabel);
                app.panel_yt.validate();
                app.panel_yt.updateUI();
            }
            this.app.panel.removeAll();
            this.app.panel.setLayout(new GridLayout(1, 1));
            //add jingmai
            String value_jingmai = "";
            for (int i = 0; i < app.table.getColumnCount(); i++) {
                if (app.table.getValueAt(app.row, i) != null) {
                    String temp = app.table.getValueAt(app.row, i).toString();
                    if (temp.length() < 30) {
                        value_jingmai += temp;
                    }
                }
            }
            //
            int c = 0;
            Box jingMaiBox = new Box(BoxLayout.Y_AXIS);
            if (!value_jingmai.equals("")) {
                //因为是导入图片，所以性味对应的都出来设计成。--罗瑶光20230604描述
                if (true) {
                    JLabel label1 = new JLabel(this.app.shouyangmin);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.shoushaoyang);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.shoushaoyin);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.shoutaiyang);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.shoutaiyin);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.shoujueyin);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.zuyangmin);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.zushaoyang);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.zushaoyin);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.zutaiyang);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.zutaiyin);
                    jingMaiBox.add(label1);
                    c = 1;
                }
                if (true) {
                    JLabel label1 = new JLabel(this.app.zujueyin);
                    jingMaiBox.add(label1);
                    c = 1;
                }
            }
            if (c == 0) {
                JLabel temp = new JLabel("亲, 没找到~");
                this.app.panel.setBackground(new Color(210, 210, 210));
                jingMaiBox.add(temp);
            }
            this.app.panel.add(jingMaiBox);
            this.app.panel.updateUI();
        } catch (Exception e) {
            NE.validate();
            JLabel temp = new JLabel("亲, 没找到~!!");
            if (null != app.panel_yt) {
                app.panel_yt.add(temp);
                app.panel_yt.setBackground(new Color(220, 220, 220));
                app.panel_yt.validate();
                app.panel_yt.updateUI();
            }
            this.app.panel.updateUI();
            e.printStackTrace();
        }
        if (null == app.buttonSum) {
            app.buttonSum = new DetaButton("");
        }
        app.buttonSum.setText("共 " + (app.sets == null ? 0
            : (1 + app.sets.size() / 501)) + " 页");
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
