package ME.VPC.M.X;

import ME.VPC.M.app.App;
import M_V.MPI.xls.commonXLS.CommonXlsPage_X_S_s;
import M_V.MVQ.button.DetaButton;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
@SuppressWarnings({"unchecked", "rawtypes", "unused"})
public class CommonFilterTool {
    public void initCommonFilterTool(int x, int y, App NE) {
        //button 加的；
        JComboBox biao_lie_xuan_ze = new JComboBox();
        biao_lie_xuan_ze.setBounds(x + 125, y + 28, 110, 20);
        biao_lie_xuan_ze.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {

            }
        });

        JComboBox biao_ye_xuan_ze = new JComboBox();
        biao_ye_xuan_ze.setBounds(x + 0 - 45, y + 28, 100 + 65, 20);
        biao_ye_xuan_ze.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                // 表列选择 gengxin
                if (arg0.getStateChange() == ItemEvent.SELECTED) {
                    String namePage = arg0.getItem().toString();
                    int totalPages = NE.app_S.jTabbedpane.getComponentCount();
                    biao_lie_xuan_ze.removeAllItems();
                    for (int i = 0; i < totalPages; i++) {
                        String tempNamePage = new String(NE.app_S
                            .jTabbedpane.getComponent(i).getName().toString());
                        if (namePage.equalsIgnoreCase(tempNamePage)) {
                            try {//稍后集成药食同源首页老表。20231126，因为xlsx已经有药材表了。bcqj
                                if (tempNamePage.equalsIgnoreCase("药食同源")) {
                                    if (null != NE.app_S.columnTitle) {
                                        int columnSize = NE.app_S.columnTitle.length;
                                        for (int j = 0; j < columnSize; j++) {
                                            biao_lie_xuan_ze.addItem(NE.app_S.columnTitle[j]);
                                        }
                                    }
                                } else {
                                    CommonXlsPage_X_S_s commonXlsPage_X_S_s
                                        = (CommonXlsPage_X_S_s) NE.app_S.
                                        jTabbedpane.getComponent(i);
                                    if (null != commonXlsPage_X_S_s.columnTitle) {
                                        int columnSize = commonXlsPage_X_S_s.columnTitle.length;
                                        for (int j = 0; j < columnSize; j++) {
                                            biao_lie_xuan_ze.addItem(commonXlsPage_X_S_s.columnTitle[j]);
                                        }
                                    }
                                }
                                //later for all in 1 here
                                biao_lie_xuan_ze.updateUI();
                            } catch (Exception e) {
                                return;
                            }
                        }
                    }
                }
            }
        });

        JComboBox shai_xuan_fang_shi = new JComboBox();
        shai_xuan_fang_shi.setBounds(x + 240, y + 28, 100, 20);
        shai_xuan_fang_shi.addItem("包含保留");
        shai_xuan_fang_shi.addItem("包含剔除");

        JTextField shai_xuan_nei_rong = new JTextField();
        shai_xuan_nei_rong.setBounds(x + 60 + 285, y + 28, 100, 20);

        NE.app_S.newFilterLine.setBounds(x + 110 - 25
            , y + 0, 210 + 45, 20);
        NE.app_S.newFilterLine.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                // 表列选择 gengxin
                if (arg0.getStateChange() == ItemEvent.SELECTED) {
                    String namePage = arg0.getItem().toString();
                    String[] arrays = namePage.split("-");
                    biao_lie_xuan_ze.setSelectedItem(arrays[0]);
                    biao_ye_xuan_ze.setSelectedItem(arrays[1]);
                    shai_xuan_fang_shi.setSelectedItem(arrays[2]);
                    shai_xuan_nei_rong.setText(arrays[3]);
                    biao_lie_xuan_ze.updateUI();
                    biao_ye_xuan_ze.updateUI();
                    shai_xuan_fang_shi.updateUI();
                    shai_xuan_nei_rong.updateUI();
                }
            }
        });
        //jiemian
        JButton xin_zeng_shai_xuan = new DetaButton("新增筛选");
        xin_zeng_shai_xuan.setBounds(x + 60 + 285, y + 0, 100, 20);
        xin_zeng_shai_xuan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String string = new String();
                if (-1 == biao_ye_xuan_ze.getSelectedIndex()) {
                    return;
                }
                int biao_ye_xuan_zegetSelectedIndex = biao_ye_xuan_ze.getSelectedIndex();
                String jlabelbiao_ye_xuan_ze = biao_ye_xuan_ze.getItemAt(
                    biao_ye_xuan_zegetSelectedIndex).toString();
                string += jlabelbiao_ye_xuan_ze + "-";
                if (-1 == biao_lie_xuan_ze.getSelectedIndex()) {
                    return;
                }
                String jlabelbiao_lie_xuan_ze = biao_lie_xuan_ze.getItemAt(
                    biao_lie_xuan_ze.getSelectedIndex()).toString();
                string += jlabelbiao_lie_xuan_ze + "-";
                if (-1 == shai_xuan_fang_shi.getSelectedIndex()) {
                    return;
                }
                String jlabelshai_xuan_fang_shi = shai_xuan_fang_shi.getItemAt(
                    shai_xuan_fang_shi.getSelectedIndex()).toString();
                string += jlabelshai_xuan_fang_shi + "-";
                if (shai_xuan_nei_rong.getText().isEmpty()) {
                    return;
                }
                String jlabelshai_xuan_nei_rong = shai_xuan_nei_rong.getText().toString();
                string += jlabelshai_xuan_nei_rong;
                NE.app_S.newFilterLine.addItem(string);
                NE.app_S.newFilterLine.updateUI();
            }
        });

        JButton shu_xin = new DetaButton("刷新");
        shu_xin.setBounds(x - 45, y + 0, 60, 20);
        shu_xin.addActionListener(arg0 -> {
            biao_ye_xuan_ze.removeAllItems();
            //表
            int totalPages = NE.app_S.jTabbedpane.getComponentCount();
            String[] string = new String[totalPages];
            for (int i = 0; i < totalPages; i++) {
                string[i] = new String(NE.app_S.jTabbedpane
                    .getComponent(i).getName().toString());
                biao_ye_xuan_ze.addItem(string[i]);
            }
            biao_ye_xuan_ze.updateUI();
        });

        JButton qing_kong = new DetaButton("qing_kong");
        qing_kong.setBounds(x + 20, y + 0, 60, 20);
        qing_kong.addActionListener(arg0 -> {
            NE.app_S.newFilterLine.removeAllItems();
            NE.app_S.newFilterLine.updateUI();
            biao_ye_xuan_ze.removeAllItems();
            //表
            int totalPages = NE.app_S.jTabbedpane.getComponentCount();
            String[] string = new String[totalPages];
            for (int i = 0; i < totalPages; i++) {
                string[i] = new String(NE.app_S.jTabbedpane
                    .getComponent(i).getName().toString());
                biao_ye_xuan_ze.addItem(string[i]);
            }
            biao_ye_xuan_ze.updateUI();
        });

        JButton shan_chu_dang_qian_shai_xuan = new DetaButton("删除当前筛选");
        shan_chu_dang_qian_shai_xuan.setBounds(x + 60 + 270 + 120, y + 0, 130, 20);
        shan_chu_dang_qian_shai_xuan.addActionListener(arg0 -> {
            NE.app_S.newFilterLine.removeItemAt(
                NE.app_S.newFilterLine.getSelectedIndex());
            NE.app_S.newFilterLine.updateUI();
            biao_ye_xuan_ze.removeAll();
            //表
            int totalPages = NE.app_S.jTabbedpane.getComponentCount();
            String[] string = new String[totalPages];
            for (int i = 0; i < totalPages; i++) {
                string[i] = new String(NE.app_S.jTabbedpane
                    .getComponent(i).getName().toString());
                biao_ye_xuan_ze.addItem(string[i]);
            }
            biao_ye_xuan_ze.updateUI();
        });

        JButton xiu_gai_dang_qian_shai_xuan = new DetaButton("修改当前筛选");
        xiu_gai_dang_qian_shai_xuan.setBounds(x + 60 + 270 + 120, y + 28, 130, 20);
        xiu_gai_dang_qian_shai_xuan.addActionListener(arg0 -> {
            String string = new String();
            if (-1 == biao_ye_xuan_ze.getSelectedIndex()) {
                return;
            }
            int biao_ye_xuan_zegetSelectedIndex = biao_ye_xuan_ze.getSelectedIndex();
            String jlabelbiao_ye_xuan_ze = biao_ye_xuan_ze.getItemAt(
                biao_ye_xuan_zegetSelectedIndex).toString();
            string += jlabelbiao_ye_xuan_ze + "-";
            if (-1 == biao_lie_xuan_ze.getSelectedIndex()) {
                return;
            }
            String jlabelbiao_lie_xuan_ze = biao_lie_xuan_ze.getItemAt(
                biao_lie_xuan_ze.getSelectedIndex()).toString();
            string += jlabelbiao_lie_xuan_ze + "-";
            if (-1 == shai_xuan_fang_shi.getSelectedIndex()) {
                return;
            }
            String jlabelshai_xuan_fang_shi = shai_xuan_fang_shi.getItemAt(
                shai_xuan_fang_shi.getSelectedIndex()).toString();
            string += jlabelshai_xuan_fang_shi + "-";
            if (shai_xuan_nei_rong.getText().isEmpty()) {
                return;
            }
            String jlabelshai_xuan_nei_rong = shai_xuan_nei_rong.getText().toString();
            string += jlabelshai_xuan_nei_rong;
            NE.app_S.newFilterLine.removeItemAt(
                NE.app_S.newFilterLine.getSelectedIndex());
            NE.app_S.newFilterLine.addItem(string);
            NE.app_S.newFilterLine.updateUI();
        });

        //init
        NE.app_S.jPanel.add(xin_zeng_shai_xuan);
        NE.app_S.jPanel.add(shu_xin);
        NE.app_S.jPanel.add(qing_kong);
        NE.app_S.jPanel.add(NE.app_S.newFilterLine);
        NE.app_S.jPanel.add(biao_ye_xuan_ze);
        NE.app_S.jPanel.add(biao_lie_xuan_ze);
        NE.app_S.jPanel.add(shai_xuan_fang_shi);
        NE.app_S.jPanel.add(shai_xuan_nei_rong);
        NE.app_S.jPanel.add(shan_chu_dang_qian_shai_xuan);
        NE.app_S.jPanel.add(xiu_gai_dang_qian_shai_xuan);
    }
}


//

//		JComboBox newPages= new JComboBox();
//		newPages.setBounds(x+60+270, y+808, 100+45, 20);
//		newPages.addItemListener(new ItemListener(){
//			@Override
//			public void itemStateChanged(ItemEvent arg0) {
//				// 表列选择 gengxin
//				if(arg0.getStateChange()== ItemEvent.SELECTED) {
//					String namePage= arg0.getItem().toString();
//					int totalPages= NE.app_S.jTabbedpane.getComponentCount();
//					for(int i= 0; i< totalPages; i++) {
//						String tempNamePage= new String(NE.app_S
//								.jTabbedpane.getComponent(i).getName().toString());
//						if(namePage.equalsIgnoreCase(tempNamePage)) {
//							try {
//								CommonXlsPage_X_S_s commonXlsPage_X_S_s
//								= (CommonXlsPage_X_S_s)NE.app_S.jTabbedpane.getComponent(i);
//								//先序号，后再名称 以后改 罗瑶光
//								if(null!= commonXlsPage_X_S_s.columnTitle) {
//									int columnSize= commonXlsPage_X_S_s.columnTitle.length;
//									for(int j= 0; j< columnSize; j++) {
//										表列选择.addItem(commonXlsPage_X_S_s.columnTitle[j]);
//									}				//								}
//								表列选择.updateUI();
//							}catch(Exception e) {
//								return;
//							}
//						}
//					}
//				}
//			}
//		});
//	NE.app_S.jPanel.add(newPages);
//