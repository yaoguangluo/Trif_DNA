package OSI.OSU.SI.PSQ.OEI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.editPanelReader;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;

public class EditPanelReaderRun extends OSU_OPE_OPC_ECI {
	
	public int value= 0;
	public String filepath;
	public EditPanelReaderRun( ) {
		super();
	}
	public void run(final EditPanelReaderView _SQ__OVQ_OSQ_VSQ) {
		 _SQ__OVQ_OSQ_VSQ.tableout= this.toptablein; 	
	}
}
