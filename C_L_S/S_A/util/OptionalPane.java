/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
package S_A.util;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
/*
 * 1 颜色变换选项
 * 2 波形分析选项
 * 3 能量选项
 * 4 滤波选项
 * 5 积量观测
 * 6 校准提示
 * */

/*
 * 1 图片占取主要的内存，所以不能用图片帧，严重占大量内存，于是一个数据帧long即可
 * 于是 数据帧long 对应list的double片段，图片帧仅仅做片段的前后10+内片段集进行展示，超过点击前滚或者后滚模式翻页。
 * 计算频率仅仅计算片段前后10+页内的当前屏幕显示的1024滑动显示焦点数据进行图片化分析即可。
 * 也就是说软件不需要修改，只要翻页录入即可，这样不美观，所以还是。
 * */
/*
 * 2 预计功能，首先我要一个1024的展示当前页面的功能，同时要记录完整波形，这里遇到一个问题，每秒钟至少有几十个1024，
 * 一分钟几千个1024，1小时电脑就会内存拓机。所以不可能全部画图，需要设置最大值封顶，所以这里出现一个option
 * 就是保留现在所有的当前画图功能，同时内部还有一个记录max封顶的循环队列隐藏记忆。，点击这个记忆，便可以list一样横幅
 * 观测完整波形。
 * */
/*
 * 3 预先设计 首先我需要设计一个面板替换原来的1024的展示。然后这个面板方便我在点击停止录制的时候会切换到横幅记忆
 * 这个记忆队列我需要设计成 前置丢失限长的linklist，长度限制在1024 00 00，100 00个1024即可, 不需要分页
 * 鼠标滑动画布横幅，频率计算当前屏幕的1024图片即可。
 * */
/*
 * 4 在录制音频的函数里添加1024的横幅数据， 每100个数据组一页，存入100页限长list。
 * */
public class OptionalPane extends JPanel {
    //这个；逻辑无争议。
    public ArrayList<int[]> stackDataX = new ArrayList<>();
    public long stackX = 0;//数据页帧1024max
    public int locationX = 0;//图片帧1024 00 00
    //仅仅计算比例波inputs
    public void paintNews(Graphics g, int[] inputs, int lastV) {
        //添加录音数据
        stackDataX.add(inputs);
//        //draw in tail panel
//        /*
//         * 图片帧画图
//         * 数据帧校准
//         * 横幅滑动观测模式
//         * 读取数据帧，计算图片帧，
//         * */
        g.setColor(new Color(110, 110, 110));
        int inputsLength = inputs.length;
        int x = locationX;
        //draw connect
        g.drawLine(x, lastV, x + 1, inputs[0]);
//        //draw loop
        int y = 0;
        for (x = locationX + 1, y = 0; y < inputsLength - 1; x++, y++) {
            g.drawLine(x, inputs[y], x + 1, inputs[y + 1]);
        }
        //tail op
        locationX += inputsLength;
    }

    /*
     * 1 整体去data vectors
     * 2 区分图片帧 和 数据帧
     * 3
     * 4
     * */
    public void paintTail(double[] mlines) {

    }

    /*
     * 1 设计可左右滑动的画布
     * 2 画布记录完整的声音波形
     * 3 支持颜色切换
     * 4 支持精确与比例波形记录变换
     * 5 显示比例波形的记录时的最大与最小值
     * 6 支持记录波形的切换波特率
     * */
}