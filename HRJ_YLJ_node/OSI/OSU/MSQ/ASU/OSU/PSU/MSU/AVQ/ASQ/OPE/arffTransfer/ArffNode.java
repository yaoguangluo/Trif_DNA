package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.arffTransfer;
public class ArffNode
{ 
	public String _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS;
	public ArffNode next;
	public ArffNode pre;
	public ArffNode()
	{
		next=null;
		pre=null;
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS=null;
	}
	public void I_Name(String name)
	{
		next=null;
		pre=null;
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS=name;
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS=new String(name);
	}
}
