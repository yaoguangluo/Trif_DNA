package S_I.OSI.PEI.PCI.PSI.tinShell;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import ME.VPC.M.app.App;
import ME.VPC.V.config.ShellJPanel;
import exception.thread.DetaThread;
import S_A.SVQ.stable.S_ShellETL;

import javax.swing.JFrame;
import java.awt.ScrollPane;

//midshell downshell, PLETL的时代开始了。稍后增加pletl的mid down 计算命令集合。
//作者 罗瑶光
public class AddTinShellRun extends OSU_OPE_OPC_ECI {
    
    public int value = 0;
    public String filepath;
    public ShellJPanel shellJPanel;

    public AddTinShellRun() {
        super();
    }

    //把_SQ__OVQ_OSQ_VSQ.outputOut的地址位剥离出来, 避免计算重叠,
    //罗瑶光20211009
    @SuppressWarnings("unchecked")
    public void run(AddTinShellView _SQ__OVQ_OSQ_VSQ
            , AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
        , App NE) {
        //因为没有在连接的线重画, 触发tablein 入参, 于是在准备设计找到下节点的时候来入参。罗瑶光20211103
        _SQ__OVQ_OSQ_VSQ.tableout = this.toptablein;
        //_SQ__OVQ_OSQ_VSQ.outputOut= this.topOutput;
        //if(null== _SQ__OVQ_OSQ_VSQ.outputOut) {
        //	 _SQ__OVQ_OSQ_VSQ.outputOut= new IMV_SIQ();
        //}
        _SQ__OVQ_OSQ_VSQ.outputOut = new TinMap();
//		if(null!= this.topOutput) {//我先设置成top为mainshell mid和down为附加shell, 这样就可以设计 附加shell的命令了。
//			_SQ__OVQ_OSQ_VSQ.outputOut= this.topOutput.clone();
//		}
//		if(null!= this.midOutput) {
//			_SQ__OVQ_OSQ_VSQ.outputOut.put(S_ShellETL.SHELL_ETL_MID_SHELL, this.midOutput.clone());
//		}
//		if(null!= this.downOutput) {
//			_SQ__OVQ_OSQ_VSQ.outputOut.put(S_ShellETL.SHELL_ETL_DOWN_SHELL, this.downOutput.clone());
//		}

//		node.thisFace._SQ__OPE_OPC_ECI.topOutput 
//		= linkNode.thisFace._SQ__OVQ_OSQ_VSQ.outputOut;
//      准备把执行shellpanel后的 output tinmap 拿出来
//		通过这两行代码重新刷新节点的input。我想把它加在初始脚本里面。不想加在清空刷新。
//		这样清空刷新就保持内存计算, 初始脚本才执行重新计算, 稍后再思考优化。
//		OSGI_chansfer已经有整体全部重新导入的思想, 我需要设计一个特指导入仅仅刷新当前节点。

//		LinkNode node= new LinkNode();
//		gUISample.first.first= Sort.sort(gUISample.first.first);
//		node= gUISample.first.first;
//		while(node!= null){
//			if(node.name.equals(gUISample.canvas.currentNodeName)
//					&& node.ID== gUISample.canvas.currentNodeID
//					&& node.primaryKey.equals
//					(gUISample.canvas.currentNodePrimaryKey)){
//				try {
//      我似乎没有把 id info给变量化, 不然就拿不到局部节点 就无法局部刷新。
        if (null != topOutput) {
            _SQ__OVQ_OSQ_VSQ.outputOut = topOutput.clone();
        }
        Object object= _SQ__OVQ_OSQ_VSQ.outputOut.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
        TinMap map = (TinMap) object;
        if (null != midOutput && null != map) {
            map.put(S_ShellETL.SHELL_ETL_MID_SHELL, midOutput.clone());
        }
        if (null != downOutput && null != map) {
            map.put(S_ShellETL.SHELL_ETL_DOWN_SHELL, downOutput.clone());
        }
        if (null != map) {
            _SQ__OVQ_OSQ_VSQ.outputOut.put(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL, map);
        }

//		if(null!= this.topOutput) {
//			Iterator<String> iterator= this.topOutput.keySet().iterator(); 
//			while(iterator.hasNext()) {
//				String string= iterator.next();
//				ConcurrentIMV_SIQ newMap= new IMV_SIQ();
//				ConcurrentIMV_SIQ map= (ConcurrentIMV_SIQ)this.topOutput.get(string);
//				Iterator<String> iterators= map.keySet().iterator(); 
//				while(iterators.hasNext()) {
//					String strings= iterators.next();
//					newMap.put(strings, map.get(strings));
//				}
//				_SQ__OVQ_OSQ_VSQ.outputOut.put(string, newMap);
//			}
//		}
        //把node configure实行的时候进行保存
        //先设计一种 只有上链接的模式, 以后在设计三种的
        //我需要加一个参数进行在ETL——node-tinshell 三个分层函数中迭代进来, 这样就很清楚的引用clone。
        JFrame jframe = new JFrame();
        //把_SQ__OVQ_OSQ_VSQ.outputOut的地址位剥离出来, 避免计算重叠,
        this.topOutput = (null == this.topOutput ? new TinMap() : this.topOutput);
        this.midOutput = (null == this.midOutput ? new TinMap() : this.midOutput);
        this.downOutput = (null == this.downOutput ? new TinMap() : this.downOutput);

        shellJPanel = new ShellJPanel(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
                , NE, _SQ__OVQ_OSQ_VSQ
                , this.topOutput, this.midOutput, this.downOutput);
        //之前统一节点界面是300*300, 因为这个改成800*750, 不太好就干脆分开来
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setSize(810, 760);
        scrollPane.add(shellJPanel);
        jframe.setLayout(null);
        jframe.add(scrollPane);
        jframe.setSize(810, 760);
        jframe.setIconImage(NE.app_S.logo.getImage());
        jframe.setResizable(false);
        jframe.setVisible(true);
    }

    public void bootAsDoc() {
//		_SQ__OVQ_OSQ_VSQ.tableout= this.toptablein; 	 
//		_SQ__OVQ_OSQ_VSQ.outputOut= new TinMap();
//		if(null!= topOutput) {
//			_SQ__OVQ_OSQ_VSQ.outputOut= topOutput.clone();
//		}
//		IMV_SIQ map= (IMV_SIQ)_SQ__OVQ_OSQ_VSQ.outputOut.get(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
//		if(null!= midOutput&& null!= map) {
//			map.put(S_ShellETL.SHELL_ETL_MID_SHELL, midOutput.clone());
//		}
//		if(null!= downOutput&& null!= map) {
//			map.put(S_ShellETL.SHELL_ETL_DOWN_SHELL, downOutput.clone());
//		}
//		if(null!= map) {
//			_SQ__OVQ_OSQ_VSQ.outputOut.put(S_ShellETL.SHELL_ETL_TIN_SHELL_ETL, map);
//		}
//		shellJPanel= new ShellJPanel(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI, HRJFrame.NE, SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
//				, null== this.topOutput? new TinMap(): this.topOutput, this.midOutput, this.downOutput);
//		JFrame jframe= new JFrame(); //从上面复制下来, 稍后去重。
//		ScrollPane scrollPane= new ScrollPane();
//		scrollPane.setSize(810, 760);
//		scrollPane.add(shellJPanel);
//		jframe.setLayout(null);
//		jframe.add(scrollPane);
//		jframe.setSize(810, 760);
//		jframe.setIconImage(HRJFrame.NE.logo.getImage());
//		jframe.setResizable(false);
//		jframe.setVisible(true);
        DetaThread.sleepDeta(25);//属于中断操作 避免卡顿。
        shellJPanel.jlabel_button.doClick();
        shellJPanel.jlabel_button_clear.doClick();
        shellJPanel.jlabel_init_button.doClick();
        shellJPanel.jlabel_debug_button.doClick();
        shellJPanel.jlabel_flush_button.doClick();
    }

    public void bootAsDoc(AddTinShellView addTinShellView,
                          AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) {
        DetaThread.sleepDeta(25);//属于中断操作 避免卡顿。
        shellJPanel.jlabel_button.doClick();
        shellJPanel.jlabel_button_clear.doClick();
        shellJPanel.jlabel_init_button.doClick();
        shellJPanel.jlabel_debug_button.doClick();
        shellJPanel.jlabel_flush_button.doClick();
    }
}
