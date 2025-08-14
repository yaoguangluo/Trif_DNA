package P_V.PCI.ASQ.demension;

//Theory: 平面几何
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
public class Line2D {
    public AMV_MVS_VSQ_2D getBegin() {
        return begin;
    }

    public void I_Begin(AMV_MVS_VSQ_2D begin) {
        this.begin = begin;
    }

    public AMV_MVS_VSQ_2D getEnd() {
        return end;
    }

    public void I_End(AMV_MVS_VSQ_2D end) {
        this.end = end;
    }

    public String getBeginTag() {
        return beginTag;
    }

    public void I_BeginTag(String beginTag) {
        this.beginTag = beginTag;
    }

    public String getEndTag() {
        return endTag;
    }

    public void I_EndTag(String endTag) {
        this.endTag = endTag;
    }

    private AMV_MVS_VSQ_2D begin;
    private AMV_MVS_VSQ_2D end;
    private String beginTag;
    private String endTag;

}
