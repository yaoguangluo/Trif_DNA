/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
package S_A.util;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/*
 * 1 设计可左右滑动的画布
 * 2 画布记录完整的声音波形
 * 3 支持颜色切换
 * 4 支持精确与比例波形记录变换
 * 5 显示比例波形的记录时的最大与最小值
 * 6 支持记录波形的切换波特率
 * */
@SuppressWarnings("serial")
public class MovingPane extends JScrollPane implements MouseMotionListener
    , MouseListener {
    public ArrayList<int[]> stackDataX = new ArrayList<>();
    public long stackX = 0;//数据页帧1024max
    public int locationX = 0;//图片帧1024 00 00
    //10000000
    public static void main(String[] argv) throws InterruptedException {
        //
        UIManager.put("ScrollBarUI"
            , "E_I.OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI");
        //
        int[] inputs = new int[1300];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = 22;
        }
        int[] ss = new int[1024 * 100 * 100];
        ss[10000000] = 4;
        S_logger.Log.logger.info("" + ss[10000000]);

        CanvasPane canvasPane=new CanvasPane();
        canvasPane.setSize(1300, 460);
        canvasPane.setBackground(Color.red);

        //为什么不显示滚动条，明明1300超过了1024，在未加item组件的情况下，jpanel
        //不能触发scroll的滚动条，是不是病了，就要治。
        OptionalPane optionalPane = new OptionalPane();
        optionalPane.setLayout(null);
        optionalPane.setOpaque(true);
        //optionalPane.add(canvasPane);
        optionalPane.setBounds(10, 10, 1300, 160);
        optionalPane.setBackground(Color.GRAY);

        MovingPane movingPane = new MovingPane();
        movingPane.setLayout(null);
        movingPane.setOpaque(false);
        movingPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        movingPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        movingPane.setBounds(0, 0, 1024, 160);
        movingPane.add(optionalPane);
        movingPane.setBackground(Color.BLACK);

        JFrame jframe = new JFrame();
        jframe.setLayout(null);
        jframe.add(movingPane);
        jframe.setSize(1200, 500);
        jframe.setVisible(true);


       // movingPane.paintNews(movingPane.getGraphics(), inputs, 2);

       // movingPane.add(jlabel);
        //movingPane.validate();
        jframe.validate();
    }
    //仅仅计算比例波inputs
    public void paintNews(Graphics g, int[] inputs, int lastV) {
        //添加录音数据
        stackDataX.add(inputs);

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
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}