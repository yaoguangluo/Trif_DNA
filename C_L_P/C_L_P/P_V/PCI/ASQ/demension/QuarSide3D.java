package P_V.PCI.ASQ.demension;

//Theory: 无法考证
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
public class QuarSide3D {
    public Line3D getTop() {
        return top;
    }

    public void I_Top(Line3D top) {
        this.top = top;
    }

    public Line3D getDown() {
        return down;
    }

    public void I_Down(Line3D down) {
        this.down = down;
    }

    public Line3D getLeft() {
        return left;
    }

    public void I_Left(Line3D left) {
        this.left = left;
    }

    public Line3D getRight() {
        return right;
    }

    public void I_Right(Line3D right) {
        this.right = right;
    }

    private Line3D top;
    private Line3D down;
    private Line3D left;
    private Line3D right;
}
