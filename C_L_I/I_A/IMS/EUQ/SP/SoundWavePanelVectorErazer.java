//package I_A.IMS.EUQ.SP;
//
//import java.awt.Graphics;
//
////import ME.VPC.S.WindowsUI;
///*
// * 著作权人 ，作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
// * , -
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
//208号 阳光家园别墅小区 第十栋
// * */
//public class SoundWavePanelVectorErazer extends SoundWavePanelVector {
//
//    ////
//
//    public SoundWavePanelVectorErazer(Graphics graphics) {
//        super(graphics);
//    }
//
//    //稍后综合通过坐标点进行位置计算
//}
//

////    public void erazer2(double[] ftkD, Color color) {
////        if (null == g2) {
////            return;
////        }
////        g2.setColor(color);
////        if (mlines != null) {
////            if (mlines.size() > 2) {
////                Iterator<Double> iterator = mlines.iterator();
////                while (iterator.hasNext()) {
////                    Line2D v = iterator.next();//later int remove
////                    g2.drawLine((int) v.getX1() + 10
////                        , 290, (int) v.getX2() + 10
////                        , 290 - (int) v.getY2());
////                }
////            }
////        }
////        g2.drawString("库里图基傅立叶fft", 10, 320);
////    }
//
//    public void erazer3(Vector<Line2D.Double> mlines) {
//        if (null == g2) {
//            return;
//        }
//        g2.setColor(new Color(110, 110, 110));
//        if (mlines != null) {
//            if (mlines.size() > 2) {
//                Iterator<Line2D.Double> iterator = mlines.iterator();
//                while (iterator.hasNext()) {
//                    Line2D v = iterator.next();//later int remove
//                    g2.drawLine((int) v.getX1() + 10
//                        , 420, (int) v.getX2() + 10
//                        , 420 - (int) v.getY2());
//                }
//            }
//        }
//        g2.drawString("虚构空间", 10, 450);
//    }
//
//    public void erazer5(Vector<Line2D.Double> mlines) {
//        if (null == g2) {
//            return;
//        }
//        g2.setColor(new Color(110, 110, 110));
//        if (mlines != null) {
//            if (mlines.size() > 2) {
//                Iterator<Line2D.Double> iterator = mlines.iterator();
//                while (iterator.hasNext()) {
//                    Line2D v = iterator.next();//later int remove
//                    g2.drawLine((int) v.getX1() + 270
//                        , 290, (int) v.getX2() + 270
//                        , 290 - (int) v.getY2());
//                }
//            }
//        }
//        g2.drawString("虚构时能", 260 + 10, 320);
//    }
//
//    public void erazer6(Vector<Line2D.Double> mlines) {
//        if (null == g2) {
//            return;
//        }
//        g2.setColor(new Color(110, 110, 110));
//        if (mlines != null) {
//            if (mlines.size() > 2) {
//                Iterator<Line2D.Double> iterator = mlines.iterator();
//                while (iterator.hasNext()) {
//                    Line2D v = iterator.next();//later int remove
//                    g2.drawLine((int) v.getX1() + 270
//                        , 420, (int) v.getX2()
//                            + 270, 420 - (int) v.getY2());
//                }
//            }
//        }
//        g2.drawString("虚构希尔伯特时能漂移", 270, 450);
//    }
//
//    public void erazer7(Vector<Line2D.Double> mlines) {
//        if (null == g2) {
//            return;
//        }
//        g2.setColor(new Color(110, 110, 110));
//        if (mlines != null) {
//            if (mlines.size() > 2) {
//                Iterator<Line2D.Double> iterator = mlines.iterator();
//                while (iterator.hasNext()) {
//                    Line2D v = iterator.next();//later int remove
//                    g2.drawLine((int) v.getX1() + 530
//                        , 290, (int) v.getX2() + 530
//                        , 290 - (int) v.getY2());
//                }
//            }
//        }
//        g2.drawString("虚度时能", 530, 320);
//    }
//
//    public void erazer8(Vector<Line2D.Double> mlines) {
//        if (null == g2) {
//            return;
//        }
//        g2.setColor(new Color(110, 110, 110));
//        if (mlines != null) {
//            if (mlines.size() > 2) {
//                Iterator<Line2D.Double> iterator = mlines.iterator();
//                while (iterator.hasNext()) {
//                    Line2D v = iterator.next();//later int remove
//                    g2.drawLine((int) v.getX1() + 530
//                        , 420, (int) v.getX2() + 530
//                        , 420 - (int) v.getY2());
//                }
//            }
//        }
//        g2.drawString("时函数", 530, 450);
//    }
//
//    public void erazer9(Vector<Line2D.Double> mlines) {
//        if (null == g2) {
//            return;
//        }
//        g2.setColor(new Color(110, 110, 110));//later merge with color。
//        if (mlines != null) {
//            if (mlines.size() > 2) {
//                Iterator<Line2D.Double> iterator = mlines.iterator();
//                while (iterator.hasNext()) {
//                    Line2D v = iterator.next();//later int remove
//                    g2.drawLine((int) v.getX1() + 530
//                        , 570, (int) v.getX2() + 530
//                        , 570 - (int) v.getY2());
//                }
//            }
//        }
//        g2.drawString("虚空分阶", 530, 600);
//    }
//
//    public void erazer10(Vector<Line2D.Double> mlines) {
//        if (null == g2) {
//            return;
//        }
//        g2.setColor(new Color(110, 110, 110));
//        if (mlines != null) {
//            if (mlines.size() > 2) {
//                Iterator<Line2D.Double> iterator = mlines.iterator();
//                while (iterator.hasNext()) {
//                    Line2D v = iterator.next();//later int remove
//                    g2.drawLine((int) v.getX1() + 790
//                        , 290 - 40, (int) v.getX2() + 790
//                        , 290 - 40 - (int) v.getY2());
//                }
//            }
//        }
//        g2.drawString("PDN-PDE", 790, 320);
//    }
//
//    public void erazer11(Vector<Line2D.Double> mlines) {
//        if (null == g2) {
//            return;
//        }
//        g2.setColor(new Color(110, 110, 110));
//        if (mlines != null) {
//            if (mlines.size() > 2) {
//                Iterator<Line2D.Double> iterator = mlines.iterator();
//                while (iterator.hasNext()) {
//                    Line2D v = iterator.next();//later int remove
//                    g2.drawLine((int) v.getX1() + 790, 420
//                        , (int) v.getX2() + 790, 420 - (int) v.getY2());
//                }
//            }
//        }
//        g2.drawString("薛定谔虚度漂移", 780 + 10, 350 + 120 - 20);
//        g3.drawString("输出", 780 + 10, 350 + 120 - 20);
//        g2.drawString("噪音报警类别:", 780 + 10, 350 + 220);
//        g3.drawString("噪音报警类别:", 780 + 10, 350 + 220);
//    }
//
//    public void erazerSA() {
//        //十字标
//        g2.setColor(new Color(110, 110, 110));
//        g2.drawLine(0, 120, 1024, 120);
//        g2.drawLine(512, 120 - 80, 512, 120 + 80);
//        //刻度标
//        //数字标
//        //鼠十字
//        //鼠tag
//    }