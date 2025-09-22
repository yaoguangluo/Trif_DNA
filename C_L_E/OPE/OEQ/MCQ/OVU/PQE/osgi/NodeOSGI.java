package OPE.OEQ.MCQ.OVU.PQE.osgi;

import S_A.VSQ.etl.NodeOSGI_S;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class NodeOSGI extends NodeOSGI_S {
    @Override
    public Object clone() {
        NodeOSGI obj = null;
        try {
            obj = (NodeOSGI) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public NodeOSGI() {
        next = null;
        pre = null;
        currentFace = null;
        thisIcon = null;
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = null;
    }

    public void I_Name(OSU_MCI_MCU_MSI thisface) {
        next = null;
        pre = null;
        currentFace = thisface;
        thisIcon = currentFace.thisIcon;
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS
            = new String(currentFace._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
    }
}
