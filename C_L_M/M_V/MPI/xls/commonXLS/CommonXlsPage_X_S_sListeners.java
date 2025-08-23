package M_V.MPI.xls.commonXLS;

import dnn.GetDNNMap;
import dnn.WriteDNNMap;
import ME.VPC.M.app.App;
import ME.VPC.M.X.AppSearch_X_DetaSearchWithDNN;
import S_A.pheromone.IMV_SIQ;
import U_V.ESU.office.XlsToYLJBufferPage;
import U_V.ESU.office.XlsxToYLJBufferPage;
import U_V.ESU.sort.Quick9DLYGWithString_ESU;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class CommonXlsPage_X_S_sListeners extends CommonXlsPage_X_S_s
    implements MouseListener {
    //

    public JTextField name() {
        name = new JTextField();
        name.setBounds(180, 50, 380, 80);
        return name;
    }

    @SuppressWarnings({"serial"})
    public javax.swing.JTable jTable(String fileType, App app_NE) {
        NE = app_NE;
        if (fileType.equalsIgnoreCase("xls")) {
            tableData_old = new XlsToYLJBufferPage().readNonObjectXls(this
                , 6, NE.app_S.appConfig.SectionJPanel.xlsWithSpec.isSelected());
        } else if (fileType.equalsIgnoreCase("xlsx")) {
            tableData_old = new XlsxToYLJBufferPage().readNonObjectXlsx(this
                , 6, NE.app_S.appConfig.SectionJPanel.xlsWithSpec.isSelected());
        }
        //default
        if (null == identifyColumns) {
            identifyColumns = new int[1];
            identifyColumns[0] = 2;
        }
        //如果有dnn表，读取即可。
        String dnnPath = xlsFilePath.replace(".xlsx", ".lygDnn");
        dnnPath = dnnPath.replace(".xls", ".lygDnn");
        File file;//配置文件在同一个文件架夹下便于管理。
        file = new File(dnnPath);
        Map<String, IMV_SIQ> subDNNmap = new IMV_SIQ();
        if (file.exists()) {
            GetDNNMap.doGetDNNMap(app_S, NE.app_S.DNNmap, dnnPath, NE);
        } else {//如果没有，就生成小表。
            subDNNmap = CommonXLSDNN.createXlSDNN(tableData_old, identifyColumns
                , subDNNmap, NE);
            //小表写入dnn，
            WriteDNNMap.doWriteDNNMap(dnnPath, NE, subDNNmap);
        }
        if (!subDNNmap.isEmpty()) {//小表并入dnn大表。
            Iterator<String> iterator = subDNNmap.keySet().iterator();
            while (iterator.hasNext()) {
                String string = iterator.next();
                IMV_SIQ dnnSet = subDNNmap.get(string);
                NE.app_S.DNNmap.put(string, dnnSet);
            }
        }//CommonXLSDNN.createXlSDNN(tableData_old, identifyColumns);
        table = new javax.swing.JTable();
        newTableModel = new DefaultTableModel(tableData_old, columnTitle) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableSections(NE);
        table.addMouseListener(this);
        return table;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        simpleClicked(NE);
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    public void doSearch1() {

    }

    public void doSearch() {
        List<Object> tableData_oldListObjects = new ArrayList<>();
        String identifyParser = "_-_";
        if (null == tableData_old) {
            return;
        }
        Here:
        for (int i = 0; i < tableData_old.length; i++) {
            StringBuilder lineStringBuilder = new StringBuilder();
            for (int k = 0; k < columnTitle.length; k++) {
                if (0 != k) {
                    lineStringBuilder.append(identifyParser);
                }
                if (null != tableData_old[i][k]) {
                    lineStringBuilder.append(tableData_old[i][k]);//.toString();
                } else {
                    lineStringBuilder.append(" ");
                }
            }
            //later do a function call
            int itemCount = NE.app_S.newFilterLine.getItemCount();
            String[] strings = new String[itemCount];
            for (int j = 0; j < strings.length; j++) {
                strings[j] = new String(NE.app_S.newFilterLine.getItemAt(j).toString());
            }
            boolean needDelete = false;
            boolean needAdd = true;
            for (int j = 0; j < strings.length; j++) {
                String[] filters = strings[j].split("-");
                if (filters[0].equalsIgnoreCase(pageName)) {
                    for (int k = 0; k < columnTitle.length; k++) {
                        if (columnTitle[k].toString().equalsIgnoreCase(filters[1])) {
                            if (null == tableData_old[i][k]) {
                                tableData_old[i][k] = "";
                                tableData_oldListObjects.add(lineStringBuilder);
                                continue Here;
                            }
                            if (filters[2].contains("剔除")) {
                                if (tableData_old[i][k].toString().contains(filters[3])) {
                                    needDelete = true;
                                }
                            } else if (filters[2].contains("保留")) {
                                if (tableData_old[i][k].toString().contains(filters[3])) {
                                    needAdd = true;
                                } else {
                                    needAdd = false;
                                }
                            } else {
                                tableData_oldListObjects.add(lineStringBuilder);
                                continue Here;
                            }
                        }
                    }
                }
            }
            if (!needDelete & needAdd) {
                tableData_oldListObjects.add(lineStringBuilder);
            }
            continue Here;
        }
        if (null == key || key.isEmpty()) {
            newTableModel.getDataVector().clear();
            Iterator<Object> iterator = tableData_oldListObjects.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                Object[] objects = iterator.next().toString().split(identifyParser);
                newTableModel.insertRow(i++, objects);
            }
            newTableModel.fireTableDataChanged();
            return;
        }
        String[] score = new String[tableData_oldListObjects.size()];
        String[] scoreOutput = new String[tableData_oldListObjects.size()];
        int[] score_code = new int[tableData_oldListObjects.size()];//稍后精简 入参
        int count = new AppSearch_X_DetaSearchWithDNN().detaSimpleSearch(score_code, score
            , newTableModel, key, true, identifyColumns, fileNamePrefix, scoreOutput
            , tableData_oldListObjects, identifyParser, NE);
        if (-1 == count) {
            return;
        }
        new Quick9DLYGWithString_ESU().sort(score_code, scoreOutput);
        Object[][] tableData = new Object[tableData_oldListObjects.size()][tableData_old[0].length];
        int new_count = 0;
        newTableModel.getDataVector().clear();
        if (null == key || key.equals("")) {
            for (int i = 0; i < tableData_old.length; i++) {
                newTableModel.insertRow(i, tableData_old[i]);
            }
            newTableModel.fireTableDataChanged();
            return;
        }
        //checkfilter
        Here:
        for (int i = tableData_oldListObjects.size() - 1; i > -1; i--) {
            if (score_code[i] < 1) {
                continue Here;
            }
            String[] columns = scoreOutput[i].split(identifyParser);
            tableData[new_count] = new Object[columns.length];
            for (int j = 0; j < columns.length; j++) {
                columns[j] = columns[j] == null ? "" : columns[j];
                tableData[new_count][j] = columns[j].toString();
            }
            tableData[new_count][1] = score_code[i];
            newTableModel.insertRow(new_count, tableData[new_count]);
            new_count += 1;
            continue Here;
        }
        newTableModel.fireTableDataChanged();
    }
}

////
//int itemCount= NE.app_S.newFilterLine.getItemCount();
//String[] strings= new String[itemCount];
//for(int j= 0; j< strings.length; j++) {
//	strings[j]= new String(NE.app_S.newFilterLine.getItemAt(j).toString());
//}
//for(int j= 0; j< strings.length; j++) {
//	String[] filters= strings[j].split("-");
//	if(filters[0].equalsIgnoreCase(pageName)) {//find filters[1]index
//		int column;
//		for(int k= 0; k< columnTitle.length; k++) {
//			if(columnTitle[k].toString().equalsIgnoreCase(filters[1])) {
//				column= k;
//				if(null== tableData[new_count][column]) {
//					tableData[new_count][column]= "";
//					newTableModel.insertRow(new_count, tableData[new_count]);
//					new_count+=1;
//					continue Here;
//				}
//				if(filters[2].contains("剔除")) {
//					if(tableData[new_count][column].toString().contains(filters[3])) {
//						continue Here;
//					}
//				}else if(filters[2].contains("保留")) {
//					if(tableData[new_count][column].toString().contains(filters[3])) {
//						newTableModel.insertRow(new_count, tableData[new_count]);
//						new_count+=1;
//						continue Here;
//					}else {
//						continue Here;
//					}
//				}else {
//					newTableModel.insertRow(new_count, tableData[new_count]);
//					new_count+=1;
//					continue Here;
//				}   
//			}
//		}
//	}
//}
//146
//                                else {//我就知道有问题。
//                                    needDelete = false;
//                                }