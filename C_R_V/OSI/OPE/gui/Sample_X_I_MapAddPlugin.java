package OSI.OPE.gui;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import M_V.MVQ.filenameFilter.TXTFilter;
import S_A.SVQ.stable.S_Annotation;
import OSI.OPE.OVU.PQE.flash.GUISample;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Sample_X_I_MapAddPlugin {
    @SuppressWarnings({"deprecation", "static-access"})
    public static void _E(GUISample gUISample, App NE) {
        String jarCategoryLink = "";
        FileDialog filedialog = new FileDialog(new Frame(), S_Annotation
            .ATTENSION_LOAD_HISTORY, FileDialog.LOAD);
        filedialog.setFilenameFilter(new TXTFilter(S_Annotation.FILE_FORMAT_ETL));
        filedialog.setVisible(true);
        jarCategoryLink = filedialog.getDirectory();
        ////20230106-System.out.println(jarCategoryLink);
        if (null == jarCategoryLink || jarCategoryLink.isEmpty()
                || jarCategoryLink.contains(S_Annotation.FILE_FORMAT_JAR)) {
            //20230106-System.out.println(S_Annotation.ATTENSION_RECHOICE);
            return;
        }
        File file = new File(jarCategoryLink);
        if (file.isFile()) {
            //20230106-System.out.println(S_Annotation.ATTENSION_FILE_CHOICE);
            return;
        }
        File[] files = file.listFiles();
        Here:
        for (int i = 0; i < files.length; i++) {
            gUISample.rightBotJTextPane.validate();
            gUISample.getContentPane().validate();
            URLClassLoader loader = null;
            try {
                loader = new URLClassLoader(new URL[]{files[i].toURL()});
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
            }
            String filename = files[i].getName().replace(S_Annotation.FILE_FORMAT_JAR
                            , S_Annotation.STRING_EMPTY);
            if (!filename.contains("OSI.OSU.")) {//新接口注意下包名20230206
                continue Here;
            }
				/* 源头: 见JDK 官方文档 的classloader 描述 
					//如下注释2行代码 
				 * refer https://www.cnblogs.com/chinaxin/p/3678442.html 
				 * 这小伙子以后有前途。哈哈
					//Class<?> myclass= loader.loadClass("hand.java.loadjar
				 * .TestClass");
					//Gene new object
					//Object myobject= myclass.newInstance();   
				 */
            //因为按照标准格式函数命名, 因此做了首字母的大写变换, 准备调试下.罗瑶光
            String[] filenameSplit = filename.split("\\.");
            String lastName = filenameSplit[filenameSplit.length - 1];
            String FirstCharOfLastName = ("" + lastName.charAt(0)).toUpperCase();
            String NewlastName = FirstCharOfLastName + lastName.subSequence(1
                    , lastName.length());
            //20230106-System.out.println(filename);
            Class<?> myclass = null;
            //   数组                         				//尾组                            				//首字母                    大写
            //filename= (""+ filename.split("\\.")[filename.split("\\.")
            //
            //.length- 1].charAt(0)).toUpperCase();
            ////20230106-System.out.println(filename.replace(filename.split(".")
            //.length, newChar)filename.split(".").length);
            try {
                String className = filename + "." + NewlastName
                        + S_Annotation.NODE_NODE_INTERFACE;
                //20230106-System.out.println(className);
                myclass = loader.loadClass(className);
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
            Object myobject = null;
            try {
                myobject = myclass.newInstance();
            } catch (InstantiationException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
            OSU_MCI_MCU_MSI _OSU_MCI_MCU_MSI = (OSU_MCI_MCU_MSI) myobject;
            if (gUISample.nodeReflection.containsKey(_OSU_MCI_MCU_MSI
                    ._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
                gUISample.rightBotJTextPane.setText("请勿重复添加, 节点已存在"
                        + System.currentTimeMillis());
                continue Here;
                //return;
            }
            gUISample.nodeReflection.put(_OSU_MCI_MCU_MSI._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, null);
            _OSU_MCI_MCU_MSI.register(gUISample.tableData_old, gUISample.text, NE);
            if (_OSU_MCI_MCU_MSI._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("添加")
                    && _OSU_MCI_MCU_MSI._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("页")) {
                gUISample.u.searchList.add(_OSU_MCI_MCU_MSI);
                //memory increment
            }
            _OSU_MCI_MCU_MSI.IMP_PSU(NE);
            gUISample.rightBotJTextPane.setText("节点:" + _OSU_MCI_MCU_MSI
                    ._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS + "已经更新成功"
                + System.currentTimeMillis() + "\r\n"
                + gUISample.rightBotJTextPane.getText());
            gUISample.rightBotJTextPane.validate();
            gUISample.thread.sleepDeta(100);
            gUISample.nodeView.first = gUISample.nodeView.link
                    .addNode(gUISample.nodeView.first, _OSU_MCI_MCU_MSI);
        }
        gUISample.nodeView.U_Tree();
        gUISample.getContentPane().validate();
    }
}
//later..
//88 ////增加小写识别一次, 兼容老的插件。
//                //FirstCharOfLastName= (""+ lastName.charAt(0));
//                //NewlastName= FirstCharOfLastName+ lastName.subSequence(1
//                //, lastName.length());
//                ////20230106-System.out.println(filename);
//                //String className= filename+ "."+ NewlastName
//                //		+ S_Data.NODE_NODE_INTERFACE;
//                ////20230106-System.out.println(className);
//                //try {
//                //	myclass= loader.loadClass(className);
//                //} catch (ClassNotFoundException e) {
//                //
//                //	e.printStackTrace();
//                //}