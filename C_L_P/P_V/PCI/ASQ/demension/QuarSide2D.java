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
public class QuarSide2D {
    public Line2D getTop() {
        return top;
    }

    public void I_Top(Line2D top) {
        this.top = top;
    }

    public Line2D getDown() {
        return down;
    }

    public void I_Down(Line2D down) {
        this.down = down;
    }

    public Line2D getLeft() {
        return left;
    }

    public void I_Left(Line2D left) {
        this.left = left;
    }

    public Line2D getRight() {
        return right;
    }

    public void I_Right(Line2D right) {
        this.right = right;
    }

    private Line2D top;
    private Line2D down;
    private Line2D left;
    private Line2D right;
}
