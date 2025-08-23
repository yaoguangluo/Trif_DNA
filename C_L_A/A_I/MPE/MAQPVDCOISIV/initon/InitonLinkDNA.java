package A_I.MPE.MAQPVDCOISIV.initon;

import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class InitonLinkDNA {
    private Initon initonLink;
    private List<Initon> initonList;

    public void I_NextIniton(Initon initon) {
        initonLink = initonLink.addNextInitons(initon);
        initonList.add(initon);
    }

    public void I_PrevIniton(Initon initon) {
        initonLink = initonLink.addPrevInitons(initon);
        initonList.add(0, initon);
    }

    public Initon getInitonLink() {
        return initonLink;
    }

    public void I_InitonLink(Initon initons) {
        initonLink = initons;
    }
}
