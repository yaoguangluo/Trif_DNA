package M_V.ME.APM.VSQ.xlx;

import S_A.SVQ.stable.S_Colors;
import S_A.pheromone.IMV_SIQ;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.util.GLBuffers;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CoAuthorForWord_V extends CoAuthorForWord_A {
    @SuppressWarnings({"unchecked", "static-access"})
    public void drawWords(GL2 gl, int[] s, int se, double[] root
        , float a, int j, int k, LinkedHashMap<String, Object> root3
        , Map<String, Integer> didLeaf, float length, float rotRatio
        , float rotRatioZ, int colorType, boolean animation) {
        if (root3 == null || root3.size() == 0) {
            return;
        }
        int i = 0;
        a = a * length;
        s[se] = root3.size();
        Iterator<String> iteratorLeaf = root3.keySet().iterator();
        //init
        double mcz = Math.cos(2 * Math.PI * (rotRatioZ / 100));
        double msz = Math.sin(2 * Math.PI * (rotRatioZ / 100));
        Here:
        while (iteratorLeaf.hasNext()) {
            if (k >= irot) {
                return;
            }
            k++;
            String leafName = iteratorLeaf.next();
            if (leafName.length() == 0) {
                continue Here;
            }
            LinkedHashMap<String, Object> leaf = (LinkedHashMap<String, Object>) root3.get(leafName);
            //角坐标叠加
            //当xy 固定z 旋转后 将 xz对应y旋转，会倾斜
            //稍后优化 区间余弦叠加
            double mca = Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a;
            double msa = Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a;
            gl.glBegin(gl.GL_LINES);
            if (animation) {
                gl.glColor3f(S_Colors.colors[colorType][0]
                    , S_Colors.colors[colorType][1]
                    , S_Colors.colors[colorType][2]);
            } else {
                gl.glColor3f(0, 0, 0);
            }
            gl.glVertex3d(root[0], root[1], root[2]);
            gl.glVertex3d(root[0] + mca * mcz, root[1] + msa
                , root[2] + mca * msz);
            gl.glEnd();
            gl.glRasterPos3d(root[0] + mca * mcz, root[1] + msa
                , root[2] + mca * msz);
            String prePrint = leafName;
            Font font = new Font(prePrint, 20, 20);
            checkImageBuf = GLBuffers.newDirectByteBuffer(prePrint.length() * 1320);
            BufferedImage image = new BufferedImage(prePrint.length() << 5
                , 20, BufferedImage.TYPE_INT_RGB);
            Graphics2D ga = image.createGraphics();
            //紫色：megenda
            ImageIcon bagua_dui = null;
            if (animation) {
                ga.setColor(Color.white);
                bagua_dui = getColorTag(leafName, ga);
                DrawImage(bagua_dui);
            } else {
                ga.setColor(Color.black);
                bagua_dui = getColorTagBack(leafName, ga);
                DrawImageBack(bagua_dui);
            }
            gl.glRasterPos3d(root[0] + mca * mcz, root[1] + msa
                , root[2] + mca * msz + 9);
            int AMV_MVS_VSQX = 1;
            int AMV_MVS_VSQY = 17;
            this.weightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
            this.heightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
            checkImageBuf.clear();
            int h = image.getHeight();
            if (animation) {
                for (int i1 = h - 1; i1 >= 0; i1--) {
                    for (int j1 = 0; j1 < prePrint.length() * 20; j1++) {
                        checkImageBuf.put((byte) (image.getRGB(j1, i1)
                            & (byte) 0xFF));
                        checkImageBuf.put((byte) (image.getRGB(j1, i1)
                            >> 8 & (byte) 0xFF));
                        checkImageBuf.put((byte) (image.getRGB(j1, i1)
                            >> 16 & (byte) 0xFF));
                    }
                }
            } else {
                for (int i1 = h - 1; i1 >= 0; i1--) {
                    for (int j1 = 0; j1 < prePrint.length() * 20; j1++) {
                        checkImageBuf.put((byte) (0 & (byte) 0xFF));
                        checkImageBuf.put((byte) (0 >> 8 & (byte) 0xFF));
                        checkImageBuf.put((byte) (0 >> 16 & (byte) 0xFF));
                    }
                }
            }

            checkImageBuf.rewind();
            gl.glDrawPixels(prePrint.length() * 20, 20, GL2.GL_RGB
                , GL.GL_UNSIGNED_BYTE, checkImageBuf);
            double root1[] = new double[3];
            root1[0] = root[0] + mca * mcz;
            root1[1] = root[1] + msa;
            root1[2] = root[2] + mca * msz;
            //j= i;
            if (!didLeaf.containsKey(leafName) && findLeaf.containsKey(leafName)) {
                didLeaf.put(leafName, 1);
                drawWords(gl, s, se + 1, root1, a * 0.66f, j + i, k
                    , leaf, didLeaf, length, rotRatio, rotRatioZ, colorType
                    , animation);
            }
            i++;
        }
    }

    @SuppressWarnings({"unchecked", "static-access"})
    public void drawWordsBlack(int[] s, int se, double[] root, float a, int j
        , int k, IMV_SIQ root3, Map<String, Integer> didLeaf
        , float length, float rotRatio, float rotRatioZ) {
        if (root3 == null || root3.size() == 0) {
            return;
        }
        int i = 0;
        s[se] = root3.size();
        a = a * length;
        Iterator<String> iteratorLeaf = root3.keySet().iterator();
        //init
        double mcz = Math.cos(2 * Math.PI * (rotRatioZ / 100));
        double msz = Math.sin(2 * Math.PI * (rotRatioZ / 100));
        Here:
        while (iteratorLeaf.hasNext()) {
            if (k >= irot) {
                return;
            }
            k++;
            String leafName = iteratorLeaf.next();
            if (leafName.length() == 0) {
                continue Here;
            }
            IMV_SIQ leaf = (IMV_SIQ) root3.get(leafName);
            if (leaf.size() > 0) {
            }
            double mca = Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a;
            double msa = Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a;
            gl.glBegin(gl.GL_LINES);
            gl.glColor3f(0, 0, 0);
            gl.glVertex3d(root[0], root[1], root[2]);
            gl.glVertex3d(root[0] + mca * mcz, root[1] + msa
                , root[2] + mca * msz);
            gl.glEnd();
            gl.glRasterPos3d(root[0] + mca * mcz, root[1] + msa
                , root[2] + mca * msz);
            String prePrint = leafName;
            Font font = new Font(prePrint, 20, 20);
            checkImageBuf = GLBuffers.newDirectByteBuffer(prePrint.length() * 1320);
            BufferedImage image = new BufferedImage(prePrint.length() << 5
                , 20, BufferedImage.TYPE_INT_RGB);
            Graphics2D ga = image.createGraphics();
            //ga.setColor(Color.black);
            //紫色：megenda
            ImageIcon bagua_dui = getColorTagBack(leafName, ga);
            if (null != bagua_dui) {
                DrawImageBack(bagua_dui);
            }
            gl.glRasterPos3d(root[0] + mca * mcz, root[1] + msa
                , root[2] + mca * msz + 9);
            int AMV_MVS_VSQX = 1;
            int AMV_MVS_VSQY = 17;
            this.weightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
            this.heightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
            checkImageBuf.clear();
            int h = image.getHeight();
            for (int i1 = h - 1; i1 >= 0; i1--) {
                for (int j1 = 0; j1 < prePrint.length() * 20; j1++) {
                    checkImageBuf.put((byte) (0 & (byte) 0xFF));
                    checkImageBuf.put((byte) (0 >> 8 & (byte) 0xFF));
                    checkImageBuf.put((byte) (0 >> 16 & (byte) 0xFF));
                }
            }
            checkImageBuf.rewind();
            gl.glDrawPixels(prePrint.length() * 20, 20, GL2.GL_RGB
                , GL.GL_UNSIGNED_BYTE, checkImageBuf);
            double root1[] = new double[3];
            root1[0] = root[0] + mca * mcz;
            root1[1] = root[1] + msa;
            root1[2] = root[2] + mca * msz;
            //j= i;
            if (!didLeaf.containsKey(leafName) && findLeaf.containsKey(leafName)) {
                didLeaf.put(leafName, 1);
                drawWordsBlack(s, se + 1, root1, a * 0.66f, j + i
                    , k, leaf, didLeaf, length, rotRatio, rotRatioZ);
            }
            i++;
        }
    }

    private ImageIcon getColorTag(String leafName, Graphics2D ga) {
        ImageIcon bagua = null;
        if (leafName.contains("巽")) {
            bagua = bagua_xun;
            ga.setColor(new Color(226, 5, 9));
        } else if (leafName.contains("离")) {
            bagua = bagua_li;
            ga.setColor(new Color(240, 45, 216));//zi
        } else if (leafName.contains("坤")) {
            bagua = bagua_kun;
            ga.setColor(new Color(0, 185, 185));
        } else if (leafName.contains("兑")) {
            bagua = bagua_dui;
            ga.setColor(new Color(30, 164, 19));
        } else if (leafName.contains("乾")) {
            bagua = bagua_qian;
            ga.setColor(Color.BLUE);
        } else if (leafName.contains("坎")) {
            bagua = bagua_kan;
            ga.setColor(new Color(91, 15, 86));
        } else if (leafName.contains("艮")) {
            bagua = bagua_gen;
            ga.setColor(new Color(0, 255, 255));
        } else if (leafName.contains("震")) {
            bagua = bagua_zhen;
            ga.setColor(new Color(245, 249, 102));
        } else if (leafName.contains("木")) {
            ga.setColor(new Color(226, 5, 9));
        } else if (leafName.contains("火")) {
            ga.setColor(new Color(240, 45, 216));
        } else if (leafName.contains("土")) {
            ga.setColor(new Color(0, 255, 255));
        } else if (leafName.contains("金")) {
            ga.setColor(new Color(30, 164, 19));
        } else if (leafName.contains("水")) {
            ga.setColor(new Color(91, 15, 86));
        }
        return bagua;
    }

    private ImageIcon getColorTagBack(String leafName, Graphics2D ga) {
        ImageIcon bagua = null;
        if (leafName.contains("巽")) {
            bagua = bagua_xun;
        } else if (leafName.contains("离")) {
            bagua = bagua_li;
        } else if (leafName.contains("坤")) {
            bagua = bagua_kun;
        } else if (leafName.contains("兑")) {
            bagua = bagua_dui;
        } else if (leafName.contains("乾")) {
            bagua = bagua_qian;
        } else if (leafName.contains("坎")) {
            bagua = bagua_kan;
        } else if (leafName.contains("艮")) {
            bagua = bagua_gen;
        } else if (leafName.contains("震")) {
            bagua = bagua_zhen;
        }
        ga.setColor(new Color(0, 0, 0));
        return bagua_dui;
    }

    private void DrawImage(ImageIcon bagua_dui) {
        if (null == bagua_dui) {
            return;
        }
        BufferedImage bufferedImage = new BufferedImage(bagua_dui.getIconWidth(),
            bagua_dui.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D ga = bufferedImage.createGraphics();

        ga.drawImage(bagua_dui.getImage(), 0, 0, bagua_dui.getImageObserver());
        ByteBuffer graphImageBuf = GLBuffers.newDirectByteBuffer(
            bufferedImage.getHeight() * (bufferedImage.getWidth() + 10) * 3);
        graphImageBuf.clear();
        int h = bufferedImage.getHeight();
        for (int i1 = h - 1; i1 >= 0; i1--) {
            for (int j1 = 0; j1 < bufferedImage.getWidth(); j1++) {
                if (bufferedImage.getRGB(j1, i1) != 0) {
                    graphImageBuf.put((byte) (bufferedImage.getRGB(j1, i1)
                        >> 0 & (byte) 0xFF));
                    graphImageBuf.put((byte) (bufferedImage.getRGB(j1, i1)
                        >> 8 & (byte) 0xFF));
                    graphImageBuf.put((byte) (bufferedImage.getRGB(j1, i1)
                        >> 16 & (byte) 0xFF));
                }
            }
        }
        graphImageBuf.rewind();
        gl.glDrawPixels(bufferedImage.getWidth(), bufferedImage.getHeight()
            , GL2.GL_RGB, GL.GL_UNSIGNED_BYTE, graphImageBuf);
    }

    private void DrawImageBack(ImageIcon bagua_dui) {
        if (null == bagua_dui) {
            return;
        }
        BufferedImage bufferedImage = new BufferedImage(bagua_dui.getIconWidth(),
            bagua_dui.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D ga = bufferedImage.createGraphics();
        ga.drawImage(bagua_dui.getImage(), 0, 0, bagua_dui.getImageObserver());
        ByteBuffer graphImageBuf = GLBuffers.newDirectByteBuffer(
            bufferedImage.getHeight() * (bufferedImage.getWidth() + 10) * 3);
        graphImageBuf.clear();
        int h = bufferedImage.getHeight();
        for (int i1 = h - 1; i1 >= 0; i1--) {
            for (int j1 = 0; j1 < bufferedImage.getWidth(); j1++) {
                if (bufferedImage.getRGB(j1, i1) != 0) {
                    graphImageBuf.put((byte) (0 >> 0 & (byte) 0xFF));
                    graphImageBuf.put((byte) (0 >> 8 & (byte) 0xFF));
                    graphImageBuf.put((byte) (0 >> 16 & (byte) 0xFF));
                }
            }
        }
        graphImageBuf.rewind();
        gl.glDrawPixels(bufferedImage.getWidth(), bufferedImage.getHeight()
            , GL2.GL_RGB, GL.GL_UNSIGNED_BYTE, graphImageBuf);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        float fAspect;
        if (height == 0) {
            height = 1;
        }
        gl.glViewport(0, 0, width, height);
        fAspect = (float) width / height;
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(53.0f, fAspect, 1.0, 400.0);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void dispose(GLAutoDrawable arg0) {
    }

    public void weightPrint(String prePrint, Graphics2D g, int AMV_MVS_VSQX
        , int AMV_MVS_VSQY, Font font) {
        g.setFont(font);
        g.drawString(prePrint, AMV_MVS_VSQX, AMV_MVS_VSQY);
    }

    public void heightPrint(String prePrint, Graphics2D g, int AMV_MVS_VSQX
        , int AMV_MVS_VSQY, Font font) {
        g.setFont(font);
        g.drawString(prePrint, AMV_MVS_VSQX, AMV_MVS_VSQY);
    }
}
//288
//  } else if (leafName.contains("木")) {
//		  ga.setColor(new Color(0, 0, 0));
//		  } else if (leafName.contains("火")) {
//		  ga.setColor(new Color(0, 0, 0));
//		  } else if (leafName.contains("土")) {
//		  ga.setColor(new Color(0, 0, 0));
//		  } else if (leafName.contains("金")) {
//		  ga.setColor(new Color(0, 0, 0));
//		  } else if (leafName.contains("水")) {
//		  ga.setColor(new Color(0, 0, 0));
//		  }