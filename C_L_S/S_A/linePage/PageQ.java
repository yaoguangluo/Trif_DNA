package S_A.linePage;

import ME.VPC.M.app.App;
import P.wave.maxAndMin.MaxAndMin_X_max_v;
import U_V.ESU.date.Date_ESU;

import java.awt.geom.Line2D;
import java.util.Date;
import java.util.Vector;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class PageQ extends PageQ_E {
    public PageS doClt4WithPage(App NE) {
        PageS tempPage = this.getPageFromStack(this.sourcePage);
        if (null == tempPage) {
            return null;//later null for 10000 queue problem
        }
        this.newdata = tempPage._d;//later pb getter setter.
        this.idLabelV.setText("" + tempPage.idSV);
        this.ratioLabelV.setText("" + tempPage.maxSV);
        this.timeLabelV.setText("" + Date_ESU.dateToGMTString(new Date(tempPage.timeSV)));
        if (registed) {
            this.doClt4(NE);
        }
        return tempPage;
    }

    public String doClt4(App NE) {
        if (registed) {
            return clt4(null, NE);
        }
        return "";
    }

    public String doClt4WithoutErazer(App NE) {
        if (registed) {
            return clt4WithoutErazer(null, NE);//later merge.
        }
        return "";
    }

    //later
    public void setQMax(int input) {
        max = input;
    }

    public void addDataToTail(float[] inputs, App NE) {
        if (!NE.app_S.isRecoding) {
            return;
        }
        //..add tail
        PageS newPageS = new PageS();
        newPageS._d = inputs.clone();
        newPageS.timeSV = System.currentTimeMillis();
        newPageS.maxSV = MaxAndMin_X_max_v.max_abs_v(inputs);//later null
        //
        if (null != tail) {
            newPageS.idSV = tail.idSV + 1;
            tail.next = newPageS;
            newPageS.prev = tail;
            tail = newPageS;
        } else {
            newPageS.idSV = 0;
            head = newPageS;
            tail = newPageS;
        }
        if (count < max) {
            count++;
            return;
        }
        //to head
        while (null != head) {
            if (null != head.next) {
                head = head.next;
                PageS tempPageS = head.prev;
                tempPageS = null;//因为不是c语言，避免无指针的对象搞名堂。
                head.prev = null;//double -d heap
            }
        }
    }

    public PageS getPageFromStack(int pos) {//之后系统化
        if (pos <= 0) {
            return head;
        }
        if (pos == 1) {
            if (null == head.next) {
                return head.next;
            }
        }
        int count = 1;
        PageS tempPageS = head.next;
        while (count < pos) {
            if (null != tempPageS) {//later null
                if (null != tempPageS.next) {
                    tempPageS = tempPageS.next;
                }
            }
            count++;
        }
        return tempPageS;
    }

    public void regiter(Vector<Line2D.Double> _lines, int _n, float[] _newdata, App NE) {
        fFT = NE.app_S.line2025.fFT;
        lines = _lines;
        soundWaveJPanelNew = NE.app_S.line2025;
        if (null == mainPaint) {
            mainPaint = NE.app_S.jp3n;
        }
        n = _n;
        newdata = _newdata;
        cacheBz = NE.app_S.line2025.cache_bz;
        cacheSj = NE.app_S.line2025.cache_sj;
        forOutput = NE.app_S.line2025.forOutput;
        type = NE.app_S.line2025.type;
        this.registed = true;
    }

    public void doClear() {
        this.head = null;
        this.tail = null;
        count = 0;
    }
}