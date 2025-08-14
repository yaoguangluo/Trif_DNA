package ME.VPC.V.ET;

import ME.VPC.M.app.App;
import ME.VPC.M.X.AppSearch_X_DetaSearch;
import ME.VPC.S.pillow.WkxPage_X_S_s;
import ME.VPC.V.dictionary.WkxDictionary;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
//import OCI.ME.analysis.C.A;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class WkxPage_X_S_sListeners extends WkxPage_X_S_s
    implements MouseListener, KeyListener {
    //

    public JTextField name() {
        name = new JTextField();
        name.setBounds(180, 50, 380, 80);
        name.addKeyListener(this);
        return name;
    }

    @SuppressWarnings({"serial"})
    public javax.swing.JTable jTable(App app_NE) {
        NE = app_NE;
        WkxDictionary d = new WkxDictionary();
        dic_list = d.txtToList();
        dic_map = d.listToMap(dic_list);
        dic_xj = d.mapToMap_xj(dic_map);
        tableData_old = new Object[dic_xj.size()][18];
        Iterator<String> iter_xj = dic_xj.keySet().iterator();
        copy_xj = new ArrayList<String>();
        while (iter_xj.hasNext())
            copy_xj.add(iter_xj.next());
        for (int j = 0; j < copy_xj.size(); j++) {
            tableData_old[j] = new Object[]{"" + (j + 1),
                "" + 0, copy_xj.get(j).trim(), dic_xj.get(copy_xj.get(j))
                .toString()
                .replaceAll("\\s*", "")
            };
        }
        table = new javax.swing.JTable();
        newTableModel = new DefaultTableModel(tableData_old, columnTitle) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableSections(NE);
        table.getColumnModel().getColumn(0).setPreferredWidth(80 + 30);
        table.getColumnModel().getColumn(1).setPreferredWidth(80 + 30);
        table.getColumnModel().getColumn(2).setPreferredWidth(80 + 230);
        table.getColumnModel().getColumn(3).setPreferredWidth(80 + 830);
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

    @Override
    public void keyPressed(KeyEvent arg0) {
    }

    @SuppressWarnings("unused")
    @Override
    public void keyReleased(KeyEvent arg0) {
        String[] score = new String[copy_xj.size()];
        int[] score_code = new int[copy_xj.size()];
        int[] reg = new int[copy_xj.size()];
        int count = AppSearch_X_DetaSearch.detaSearch(score_code, score, newTableModel
            , tableData_old, copy_xj, key, dic_xj, true, NE);
        //测试了下, OK, 准备整体vpcs替换。之后设计成线程。避免搜索死锁,
        if (-1 == count) {
            return;
        }
        NE.app_S.lYGSortESU9D.javaSort(score_code, score);
        int max = score_code[0];
        Object[][] tableData = new Object[count][18];
        int new_count = 0;
        newTableModel.getDataVector().clear();
        if (null == key || key.equals("")) {
            for (int i = 0; i < tableData_old.length; i++) {
                newTableModel.insertRow(i, tableData_old[i]);
            }
            newTableModel.fireTableDataChanged();
            return;
        }
        Here:
        for (int i = copy_xj.size() - 1; i > -1; i--) {
            if (score_code[i] < 1) {
                continue Here;
            }
            if (app_S.shuming_filter_box.isSelected()) {
                String wei = score[i];
                String temp = app_S.name_filter.getText();
                for (int j = 0; j < temp.length(); j++) {
                    if (wei.contains("" + temp.charAt(j))) {
                        continue Here;
                    }
                }
            }
            tableData[new_count] = new Object[]{new_count + 1, score_code[i],
                score[i], dic_xj.get(score[i]).toString()
            };
            newTableModel.insertRow(new_count, tableData[new_count]);
            new_count += 1;
        }
        newTableModel.fireTableDataChanged();
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
    }
}
//int count=0;
//Map<String, WordFrequency> mapSearchWithoutSort= null;
//mapSearchWithoutSort= _A.parserMixStringByReturnFrequencyMap(key, NE);
//Iterator<String> iteratorForCopy= copy_xj.iterator();	
//int copyCount= 0;
//List<String> list= _A.parserMixedString(key);
//String[] string= List_ESU_X_listToArray._E(list);
//
//String[] stringReg= new String[key.length()/3];
//for(int i= 0; i< stringReg.length; i++) {
//	stringReg[i]= key.substring(i*3, (i*3+ 3)<key.length()?(i*3+ 3):key.length()-1);
//}
//while(iteratorForCopy.hasNext()) {
//	String iteratorForCopyString= iteratorForCopy.next();
//	score[copyCount]= iteratorForCopyString;
//	String temps= dic_xj.get(iteratorForCopyString).toString();
//	Iterator<String> iteratorWordFrequency= mapSearchWithoutSort.keySet().iterator();
//	Here:
//		while(iteratorWordFrequency.hasNext()) {  
//			String mapSearchaAtII= iteratorWordFrequency.next();
//			WordFrequency wordFrequencySearch= mapSearchWithoutSort.get(mapSearchaAtII);
//			if(temps.contains(mapSearchaAtII)) {
//				if(reg[copyCount]== 0){
//					count += 1;
//				}
//				score[copyCount]= iteratorForCopyString;
//				if(score[copyCount].contains(key.replace(" ", ""))) {
//					reg[copyCount]+= 500;
//				}
//				if(key.contains(score[copyCount].replace(" ", ""))) {
//					reg[copyCount]+= 500;
//				}
//				if(!pos.containsKey(mapSearchaAtII)) {
//					reg[copyCount] += 1;
//					score_code[copyCount] += 1 << mapSearchaAtII.length()
//					<< wordFrequencySearch.get_frequency() ;
//					continue Here;
//				}
//				if(pos.get(mapSearchaAtII).contains("名")
//				||pos.get(mapSearchaAtII).contains("动")
//						||pos.get(mapSearchaAtII).contains("形")
//						||pos.get(mapSearchaAtII).contains("谓")) {
//					reg[copyCount] += 2;
//				}
//				reg[copyCount] += 1;
//				score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1) 
//					* (!pos.get(mapSearchaAtII).contains("名")
//					? pos.get(mapSearchaAtII).contains("动")? 45 : 1 : 50)
//						<< mapSearchaAtII.length() * wordFrequencySearch.get_frequency();
//				continue Here;
//			}
//			if(mapSearchaAtII.length()>1) {
//				for(int j=0;j<mapSearchaAtII.length();j++) {
//					if(temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
//						if(reg[copyCount]== 0){
//							count += 1;
//						}
//						score[copyCount]= iteratorForCopyString;
//						score_code[copyCount]+=1;
//						if(pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
//								pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
//								||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
//								||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
//								||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
//								)) {
//							reg[copyCount] += 2;
//						}
//						reg[copyCount] += 1;
//						continue Here;
//					}
//				}
//			}
//		}
//	score_code[copyCount]= score_code[copyCount] * reg[copyCount];
//	//词距
//	int code= 100;
//	int tempb= 0;
//	int tempa= score_code[copyCount];
//	if(key.length()> 4) {
//		//全词
//		for(int i= 0; i< string.length; i++) {
//			if(temps.contains(string[i])) {
//				tempb+= code;
//			}
//		}
//		//断句
//		for(int i= 0; i< stringReg.length; i++) {
//			if(temps.contains(stringReg[i])) {
//				tempb+= code;
//			}
//		}
//		score_code[copyCount]= (int) (tempa/Math.pow(this.app_S.lookrot+ 1, 4)
//		+ tempb*Math.pow(this.app_S.lookrot, 2));
//	}
//	if(key.replace(" ", "").length()> 1&& key.replace(" ", "").length()< 5) {
//		if(temps.contains(key)) {
//			tempb+= code<< 7;
//		}
//		score_code[copyCount]= (int) (tempa/Math.pow(this.app_S.lookrot+ 1, 4)
//		+ tempb*Math.pow(this.app_S.lookrot, 2));
//	}
//	copyCount++;
//}
//LABEL2: