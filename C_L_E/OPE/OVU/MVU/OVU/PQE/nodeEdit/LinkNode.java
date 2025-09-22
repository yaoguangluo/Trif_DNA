package OPE.OVU.MVU.OVU.PQE.nodeEdit;

import VSQ.etl.LinkNode_X_S;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LinkNode extends LinkNode_X_S implements Cloneable {
    public void I_Name(String SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, int x1, int y1, int id1) {
        beconnect = false;
        rightChoose = false;
        leftChoose = false;
        tBeconnect = false;
        mBeconnect = false;
        dBeconnect = false;
        x = x1;
        y = y1;
        name = new String(SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
        ID = id1;
        tBeconnectPrimaryKey = "";
        mBeconnectPrimaryKey = "";
        dBeconnectPrimaryKey = "";
        tBeconnectID = 0;
        mBeconnectID = 0;
        dBeconnectID = 0;
        primaryKey = "" + Math.random();
    }

    public void I_xy(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public void I_choose(Boolean choose) {
        leftChoose = choose;
    }

    public LinkNode clone() {
        return this;
    }
}
