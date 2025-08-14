package P_V.PCI.ASQ.demension;

//Theory: Eclid
//Application: Yaoguang.luo
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class AMV_MVS_VSQ_2D {
    public AMV_MVS_VSQ_2D(double x, double y) {
        this.I_X(x);
        this.I_Y(y);
    }

    public AMV_MVS_VSQ_2D() {
        // TODO Auto-generated constructor stub
    }

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getTag() {
        return tag;
    }

    private String tag;

    public void I_Y(double y) {
        this.y = y;
    }

    public void I_X(double x) {
        this.x = x;
    }

    public void I_Tag(String tag) {
        this.tag = tag;
    }

}
