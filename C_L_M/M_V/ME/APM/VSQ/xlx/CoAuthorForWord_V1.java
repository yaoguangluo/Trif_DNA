package M_V.ME.APM.VSQ.xlx;

import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Colors;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
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
public class CoAuthorForWord_V1 extends CoAuthorForWord_A {

    public void drawEngine(GLAutoDrawable drawable) {
        gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(lrot, brot, -36.0f);
        gl.glRotatef(xrot, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(yrot, 0.0f, 1.0f, 0.0f);
        gl.glRotatef(zrot, 0.0f, 0.0f, 1.0f);//稍后~
        gl.glPointSize(prot);
        gl.glOrtho(0, trot, 0, trot, 1, -1);
        deleteALatest(gl);
        drawANew(gl);
        gl.glEnd();
        gl.glFlush();
    }

    public void drawANew(GL2 gl) {
        float i = 0.5f;
        Iterator<String> iterators = rootClassMap.keySet().iterator();
        while (iterators.hasNext()) {
            String string = iterators.next();
            CommonRotClass commonRotClass = rootClassMap.getCommonRotClass(string);
            if (commonRotClass.buttonClicked) {
                rootLeaf = commonRotClass.rootLeaf;
                float rotRatio = commonRotClass.rot;
                float rotRatioZ = commonRotClass.rotZ;
                displayWords(gl, i += 0.5f, 1, 1, false, rotRatio, rotRatioZ, (i * 2) % 6f);  //稍后整合五行
            }
        }

    }

    //先长度，再弧度，最后错开，
    public void deleteALatest(GL2 gl) {
        float i = 0.5f;
        Iterator<String> iterators = rootClassMap.keySet().iterator();
        while (iterators.hasNext()) {
            String string = iterators.next();
            CommonRotClass commonRotClass = rootClassMap.getCommonRotClass(string);
            if (commonRotClass.buttonClicked) {
                i += 0.5f;
                if ((commonRotClass.rot != commonRotClass.rotl)) {
                    rootLeaf = commonRotClass.rootLeaf;
                    float rotRatio = commonRotClass.rotl;
                    float rotRatioZ = commonRotClass.rotZl;
                    displayWords(gl, i, 1, 1, true, rotRatio, rotRatioZ, (i * 2) % 6f);
                    rotRatio = commonRotClass.rot;
                    rotRatioZ = commonRotClass.rotZ;
                    displayWords(gl, i, 1, 1, false, rotRatio, rotRatioZ, (i * 2) % 6f);  //稍后整合五行
                    //更新
                    commonRotClass.rotl = commonRotClass.rot;
                }
            }
            rootClassMap.put(string, commonRotClass);
        }
    }

    //稍后移出去~
    public void displayWords(GL2 gl, float length, float arc, float flop, boolean back
        , float rotRatio, float rotRatioZ, float colorType) {
        int section[] = new int[21];
        section[0] = 32;
        section[1] = 32;
        section[2] = 32;
        section[3] = 32;
        section[4] = 10;
        section[5] = 10;
        section[6] = 10;
        section[7] = 10;
        section[8] = 10;
        section[9] = 10;
        section[10] = 10;
        section[11] = 10;
        float a = 10;
        double root[] = new double[3];
        didLeaf.clear();
        if (back) {
            drawWordsBlack(section, 0, root, a, 0, 0
                , this.rootLeaf, didLeaf, length, rotRatio, rotRatioZ);
        } else {
            drawWords(section, 0, root, a, 0, 0
                , this.rootLeaf, didLeaf, length, rotRatio, rotRatioZ, (int) colorType);
        }
    }

    //稍后去重
    public void display(GLAutoDrawable drawable) {
        drawEngine(drawable);
    }

    @SuppressWarnings({"unchecked", "static-access"})
    private void drawWordsBlack(int[] s, int se, double[] root, float a, int j
        , int k, LinkedHashMap<String, Object> root3, Map<String, Integer> didLeaf
        , float length, float rotRatio, float rotRatioZ) {
        if (root3 == null || root3.size() == 0) {
            return;
        }
        int i = 0;
        s[se] = root3.size();
        a = a * length;
        Iterator<String> iteratorLeaf = root3.keySet().iterator();
        Here:
        while (iteratorLeaf.hasNext()) {
            if (k >= irot) {
                return;
            }
            k++;
            double a1 = 1.0;
            String leafName = iteratorLeaf.next();
            if (leafName.length() == 0) {
                continue Here;
            }
            LinkedHashMap<String, Object> leaf = (LinkedHashMap<String, Object>) root3.get(leafName);
            if (leaf.size() > 0) {
                a1 = 1.0;
            }
            gl.glBegin(gl.GL_LINES);
            gl.glColor3f(0, 0, 0);
            gl.glVertex3d(root[0], root[1], root[2]);
            gl.glVertex3d(root[0] + Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[1] + Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[2] + (srot * a1));
            gl.glEnd();
            gl.glColor3f(0, 0, 0);
            gl.glRasterPos3d(root[0] + Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[1] + Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[2] + (srot * a1));
            String prePrint = leafName;
            Font font = new Font(prePrint, 20, 20);
            checkImageBuf = GLBuffers.newDirectByteBuffer(20 * prePrint.length() * 22 * 3);
            BufferedImage image = new BufferedImage(prePrint.length() * 32
                , 20, BufferedImage.TYPE_INT_RGB);
            Graphics2D ga = image.createGraphics();
            ga.setColor(Color.black);
            ImageIcon bagua_temp = null;
            //紫色：megenda
            if (leafName.contains("巽")) {
                bagua_temp = new ImageIcon(this.getClass().getResource(S_File.bg_xun_png));
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("离")) {
                bagua_temp = new ImageIcon(this.getClass().getResource(S_File.bg_li_png));
                ga.setColor(new Color(0, 0, 0));//zi
            } else if (leafName.contains("坤")) {
                bagua_temp = new ImageIcon(this.getClass().getResource(S_File.bg_kun_png));
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("兑")) {
                bagua_temp = new ImageIcon(this.getClass().getResource(S_File.bg_dui_png));
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("乾")) {
                bagua_temp = new ImageIcon(this.getClass().getResource(S_File.bg_qian_png));
                ga.setColor(Color.BLUE);
            } else if (leafName.contains("坎")) {
                bagua_temp = new ImageIcon(this.getClass().getResource(S_File.bg_kan_png));
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("艮")) {
                bagua_temp = new ImageIcon(this.getClass().getResource(S_File.bg_gen_png));
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("震")) {
                bagua_temp = new ImageIcon(this.getClass().getResource(S_File.bg_zhen_png));
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("木")) {
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("火")) {
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("土")) {
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("金")) {
                ga.setColor(new Color(0, 0, 0));
            } else if (leafName.contains("水")) {
                ga.setColor(new Color(0, 0, 0));
            }
            if (null != bagua_temp) {
                DrawImageBack(bagua_temp);
            }
            gl.glRasterPos3d(root[0] + Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[1] + Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[2] + (srot * a1) + 9);
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
            root1[0] = root[0] + Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a;
            root1[1] = root[1] + Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a;
            root1[2] = root[2] + (srot * a1);
            //j= i;
            if (!didLeaf.containsKey(leafName) && findLeaf.containsKey(leafName)) {
                didLeaf.put(leafName, 1);
                drawWordsBlack(s, se + 1, root1, a * 0.66f, j + i, k, leaf, didLeaf, length, rotRatio, rotRatioZ);
            }
            i++;
        }
    }

    @SuppressWarnings({"unchecked", "static-access"})
    private void drawWords(int[] s, int se, double[] root, float a, int j
        , int k, LinkedHashMap<String, Object> root3, Map<String, Integer> didLeaf
        , float length, float rotRatio, float rotRatioZ, int colorType) {
        if (root3 == null || root3.size() == 0) {
            return;
        }
        int i = 0;
        a = a * length;
        s[se] = root3.size();
        Iterator<String> iteratorLeaf = root3.keySet().iterator();
        Here:
        while (iteratorLeaf.hasNext()) {
            if (k >= irot) {
                return;
            }
            k++;
            double a1 = 1.0;
            String leafName = iteratorLeaf.next();
            if (leafName.length() == 0) {
                continue Here;
            }
            LinkedHashMap<String, Object> leaf = (LinkedHashMap<String, Object>) root3.get(leafName);
            if (leaf.size() > 0) {
                a1 = 1.0;
            }
            gl.glBegin(gl.GL_LINES);
            gl.glColor3f(S_Colors.colors[colorType][0], S_Colors.colors[colorType][1], S_Colors.colors[colorType][2]);
            gl.glVertex3d(root[0], root[1], root[2]);
            gl.glVertex3d(root[0] + Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[1] + Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[2] + (srot * a1));
            gl.glEnd();
            gl.glColor3f(S_Colors.colors[colorType][0], S_Colors.colors[colorType][1], S_Colors.colors[colorType][2]);
            gl.glRasterPos3d(root[0] + Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[1] + Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[2] + (srot * a1));
            String prePrint = leafName;
            Font font = new Font(prePrint, 20, 20);
            checkImageBuf = GLBuffers.newDirectByteBuffer(20 * prePrint.length() * 22 * 3);
            BufferedImage image = new BufferedImage(prePrint.length() * 32
                , 20, BufferedImage.TYPE_INT_RGB);
            Graphics2D ga = image.createGraphics();
            ga.setColor(Color.white);
            ImageIcon bagua_dui = null;
            //紫色：megenda
            if (leafName.contains("巽")) {
                bagua_dui = new ImageIcon(this.getClass().getResource(S_File.bg_xun_png));
                ga.setColor(new Color(226, 5, 9));
            } else if (leafName.contains("离")) {
                bagua_dui = new ImageIcon(this.getClass().getResource(S_File.bg_li_png));
                ga.setColor(new Color(240, 45, 216));//zi
            } else if (leafName.contains("坤")) {
                bagua_dui = new ImageIcon(this.getClass().getResource(S_File.bg_kun_png));
                ga.setColor(new Color(0, 185, 185));
            } else if (leafName.contains("兑")) {
                bagua_dui = new ImageIcon(this.getClass().getResource(S_File.bg_dui_png));
                ga.setColor(new Color(30, 164, 19));
            } else if (leafName.contains("乾")) {
                bagua_dui = new ImageIcon(this.getClass().getResource(S_File.bg_qian_png));
                ga.setColor(Color.BLUE);
            } else if (leafName.contains("坎")) {
                bagua_dui = new ImageIcon(this.getClass().getResource(S_File.bg_kan_png));
                ga.setColor(new Color(91, 15, 86));
            } else if (leafName.contains("艮")) {
                bagua_dui = new ImageIcon(this.getClass().getResource(S_File.bg_gen_png));
                ga.setColor(new Color(0, 255, 255));
            } else if (leafName.contains("震")) {
                bagua_dui = new ImageIcon(this.getClass().getResource(S_File.bg_zhen_png));
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
            if (null != bagua_dui) {
                DrawImage(bagua_dui);
            }
            gl.glRasterPos3d(root[0] + Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[1] + Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a
                , root[2] + (srot * a1) + 9);
            int AMV_MVS_VSQX = 1;
            int AMV_MVS_VSQY = 17;
            this.weightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
            this.heightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
            checkImageBuf.clear();
            int h = image.getHeight();
            for (int i1 = h - 1; i1 >= 0; i1--) {
                for (int j1 = 0; j1 < prePrint.length() * 20; j1++) {
                    checkImageBuf.put((byte) (image.getRGB(j1, i1) & (byte) 0xFF));
                    checkImageBuf.put((byte) (image.getRGB(j1, i1) >> 8 & (byte) 0xFF));
                    checkImageBuf.put((byte) (image.getRGB(j1, i1) >> 16 & (byte) 0xFF));
                }
            }
            checkImageBuf.rewind();
            gl.glDrawPixels(prePrint.length() * 20, 20, GL2.GL_RGB
                , GL.GL_UNSIGNED_BYTE, checkImageBuf);
            double root1[] = new double[3];
            root1[0] = root[0] + Math.cos(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a;
            root1[1] = root[1] + Math.sin(2 * Math.PI * ((i + rotRatio / 100)) / (s[se])) * a;
            root1[2] = root[2] + (srot * a1);
            //j= i;
            if (!didLeaf.containsKey(leafName) && findLeaf.containsKey(leafName)) {
                didLeaf.put(leafName, 1);
                drawWords(s, se + 1, root1, a * 0.66f, j + i, k, leaf, didLeaf, length, rotRatio, rotRatioZ, colorType);
            }
            i++;
        }
    }

    private void DrawImage(ImageIcon bagua_dui) {
        BufferedImage bufferedImage = new BufferedImage(bagua_dui.getIconWidth(),
            bagua_dui.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D ga = bufferedImage.createGraphics();

        ga.drawImage(bagua_dui.getImage(), 0, 0, bagua_dui.getImageObserver());
        ByteBuffer graphImageBuf
            = GLBuffers.newDirectByteBuffer((bufferedImage.getHeight())
            * (bufferedImage.getWidth() + 10) * 3);
        graphImageBuf.clear();
        int h = bufferedImage.getHeight();
        for (int i1 = h - 1; i1 >= 0; i1--) {
            for (int j1 = 0; j1 < bufferedImage.getWidth(); j1++) {
                if (bufferedImage.getRGB(j1, i1) != 0) {
                    graphImageBuf.put((byte) (bufferedImage.getRGB(j1, i1) >> 0 & (byte) 0xFF));
                    graphImageBuf.put((byte) (bufferedImage.getRGB(j1, i1) >> 8 & (byte) 0xFF));
                    graphImageBuf.put((byte) (bufferedImage.getRGB(j1, i1) >> 16 & (byte) 0xFF));
                }
            }
        }
        graphImageBuf.rewind();
        gl.glDrawPixels(bufferedImage.getWidth(), bufferedImage.getHeight()
            , GL2.GL_RGB, GL.GL_UNSIGNED_BYTE, graphImageBuf);
    }

    private void DrawImageBack(ImageIcon bagua_temp) {
        BufferedImage bufferedImage = new BufferedImage(bagua_temp.getIconWidth(),
            bagua_temp.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D ga = bufferedImage.createGraphics();

        ga.drawImage(bagua_temp.getImage(), 0, 0, bagua_temp.getImageObserver());
        ByteBuffer graphImageBuf
            = GLBuffers.newDirectByteBuffer((bufferedImage.getHeight())
            * (bufferedImage.getWidth() + 10) * 3);
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


    @SuppressWarnings("unused")
    private IMV_SIQ kernerForest(String temp, IMV_SIQ root
        , Map<String, Integer> findLeaf, int depth, App NE) {
        IMV_SIQ leaf = new IMV_SIQ();
        if (++depth > 6) {
            return leaf;
        }
        int ml = 0;
        if (u.app_S.dic_li.containsKey(temp) || u.app_S.dic_yl.containsKey(temp) || u.app_S.dic_zf.containsKey(temp)) {
            IMV_SIQ_SS map = _A.parserMixStringByReturnFrequencyMap(
                (u.app_S.dic_li.get(temp) == null ? "" : u.app_S.dic_li.get(temp)) +
                    (u.app_S.dic_yl.get(temp) == null ? "" : u.app_S.dic_yl.get(temp).toString()) +
                    (u.app_S.dic_zf.get(temp) == null ? "" : u.app_S.dic_zf.get(temp).toString())
                , NE
            );
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String tempRec = it.next();
                if (!findLeaf.containsKey(tempRec)) {
                    findLeaf.put(tempRec, 1);
                    frequencyLeaf.put(tempRec, 1);
                    if (u.app_S.dic_map.containsKey(tempRec)) {
                        IMV_SIQ subLeaf = kernerForest(tempRec, leaf, findLeaf, depth, NE);
                        leaf.put(tempRec, subLeaf);
                    } else if (ml < 8) {
                        IMV_SIQ subLeaf = kernerForest(tempRec, leaf, findLeaf, depth, NE);
                        if (subLeaf.size() > 0) {
                            leaf.put(tempRec, subLeaf);
                            ml++;
                        }
                    }
                } else {
                    frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
                }
            }
        }
        return leaf;
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
//67


//if(buttonYuanJiClicked) {
//	rootLeaf= rootLeafYuanJi;
//	float rotRatio= rotYuanJi;
//	displayWords(gl, i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);  //稍后整合五行
//}
//
//if(buttonWuXingClicked) {
//	rootLeaf= rootLeafWuXing;
//	float rotRatio= rotWuXing;
//	displayWords(gl, i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonShuangYuanClicked) {
//	rootLeaf= rootLeafShuangYuan;
//	float rotRatio= rotShuangYuan;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonBaYouClicked) {
//	rootLeaf= rootLeafBaYou;
//	float rotRatio= rotBaYou;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonJingLuoClicked) {
//	rootLeaf= rootLeafJingLuo;
//	float rotRatio= rotJingLuo;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonZiWuClicked) {
//	rootLeaf= rootLeafZiWu;
//	float rotRatio= rotZiWu;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonLiuZhuClicked) {
//	rootLeaf= rootLeafLiuZhu;
//	float rotRatio= rotLiuZhu;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonJieQiClicked) {
//	rootLeaf= rootLeafJieQi;
//	float rotRatio= rotJieQi;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonBaGangClicked) {
//	rootLeaf= rootLeafBaGang;
//	float rotRatio= rotBaGang;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonKanYuClicked) {
//	rootLeaf= rootLeafKanYu;
//	float rotRatio= rotKanYu;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonLiuRenClicked) {
//	rootLeaf= rootLeafLiuRen;
//	float rotRatio= rotLiuRen;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonYiShuClicked) {
//	rootLeaf= rootLeafYiShu;
//	float rotRatio= rotYiShu;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//
//if(buttonTianXingClicked) {
//	rootLeaf= rootLeafTianXing;
//	float rotRatio= rotTianXing;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//if(buttonSanJiaoClicked) {
//	rootLeaf= rootLeafSanJiao;
//	float rotRatio= rotSanJiao;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}
//if(buttonHeLuoClicked) {
//	rootLeaf= rootLeafHeLuo;
//	float rotRatio= rotHeLuo;
//	displayWords(gl,  i+=0.5f, 1, 1, false, rotRatio, (i* 2) % 6f);
//}

//177
//if(buttonYuanJiClicked) {
//i+=0.5f;
//if((rotYuanJi!= rotYuanJil)) {
//	rootLeaf= rootLeafYuanJi;
//	float rotRatio= rotYuanJil;
//	displayWords(gl, i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotYuanJi;
//	displayWords(gl, i, 1, 1, false, rotRatio, (i* 2) % 6f);  //稍后整合五行
//	//更新
//	rotYuanJil= rotYuanJi;
//}
//}
//
//if(buttonWuXingClicked){
//i+=0.5f;
//if((rotWuXing!= rotWuXingl)) {
//	rootLeaf= rootLeafWuXing;
//	float rotRatio= rotWuXingl;
//	displayWords(gl,  i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotWuXing;
//	displayWords(gl,  i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotWuXingl= rotWuXing;
//}
//}
//
//if(buttonShuangYuanClicked) {
//i+=0.5f;
//if((rotShuangYuan!= rotShuangYuanl)) {
//	rootLeaf= rootLeafShuangYuan;
//	float rotRatio= rotShuangYuanl;
//	displayWords(gl,  i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotShuangYuan;
//	displayWords(gl,  i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotShuangYuanl= rotShuangYuan;
//}
//}
//
//if(buttonBaYouClicked){
//i+=0.5f;
//if((rotBaYou!= rotBaYoul)) {
//	rootLeaf= rootLeafBaYou;
//	float rotRatio= rotBaYoul;
//	displayWords(gl,  i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotBaYou;
//	displayWords(gl,  i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotBaYoul= rotBaYou;
//}
//}
//
//if(buttonJingLuoClicked) {
//i+=0.5f;
//if((rotJingLuo!= rotJingLuol)) {
//	rootLeaf= rootLeafJingLuo;
//	float rotRatio= rotJingLuol;
//	displayWords(gl,  i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotJingLuo;
//	displayWords(gl,  i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotJingLuol= rotJingLuo;
//}
//}
//
//if(buttonZiWuClicked) {
//i+=0.5f;
//if(buttonZiWuClicked&& (rotZiWu!= rotZiWul)) {
//	rootLeaf= rootLeafZiWu;
//	float rotRatio= rotZiWul;
//	displayWords(gl,  i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotZiWu;
//	displayWords(gl,  i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotZiWul= rotZiWu;
//}
//}
//
//if(buttonLiuZhuClicked) {
//i+=0.5f;
//if(buttonLiuZhuClicked&& (rotLiuZhu!= rotLiuZhul)) {
//	rootLeaf= rootLeafLiuZhu;
//	float rotRatio= rotLiuZhul;
//	displayWords(gl,  i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotLiuZhu;
//	displayWords(gl,  i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotLiuZhul= rotLiuZhu;
//}
//}
//
//if(buttonJieQiClicked) {
//i+=0.5f;
//if((rotJieQi!= rotJieQil)) {
//	rootLeaf= rootLeafJieQi;
//	float rotRatio= rotJieQil;
//	displayWords(gl, i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotJieQi;
//	displayWords(gl, i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotJieQil= rotJieQi;
//}
//}
//if(buttonBaGangClicked) {
//i+=0.5f;
//if((rotBaGang!= rotBaGangl)) {
//	rootLeaf= rootLeafBaGang;
//	float rotRatio= rotBaGangl;
//	displayWords(gl, i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotBaGang;
//	displayWords(gl, i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotBaGangl= rotBaGang;
//}
//}
//if(buttonKanYuClicked) {
//i+=0.5f;
//if((rotKanYu!= rotKanYul)) {
//	rootLeaf= rootLeafKanYu;
//	float rotRatio= rotKanYul;
//	displayWords(gl, i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotKanYu;
//	displayWords(gl, i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotKanYul= rotKanYu;
//}
//}
//if(buttonLiuRenClicked) {
//i+=0.5f;
//if((rotLiuRen!= rotLiuRenl)) {
//	rootLeaf= rootLeafLiuRen;
//	float rotRatio= rotLiuRenl;
//	displayWords(gl, i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotLiuRen;
//	displayWords(gl, i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotLiuRenl= rotLiuRen;
//}
//}
//
//if(buttonYiShuClicked) {
//i+=0.5f;
//if((rotYiShu!= rotYiShul)) {
//	rootLeaf= rootLeafYiShu;
//	float rotRatio= rotYiShul;
//	displayWords(gl, i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotYiShu;
//	displayWords(gl, i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotYiShul= rotYiShu;
//}
//}
//
//if(buttonTianXingClicked) {
//i+=0.5f;
//if((rotTianXing!= rotTianXingl)) {
//	rootLeaf= rootLeafTianXing;
//	float rotRatio= rotTianXingl;
//	displayWords(gl, i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotTianXing;
//	displayWords(gl, i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotTianXingl= rotTianXing;
//}
//}
//
//if(buttonSanJiaoClicked) {
//i+=0.5f;
//if((rotSanJiao!= rotSanJiaol)) {
//	rootLeaf= rootLeafSanJiao;
//	float rotRatio= rotSanJiaol;
//	displayWords(gl, i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotSanJiao;
//	displayWords(gl, i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotSanJiaol= rotSanJiao;
//}
//}
//
//if(buttonHeLuoClicked) {
//i+=0.5f;
//if((rotHeLuo!= rotHeLuol)) {
//	rootLeaf= rootLeafHeLuo;
//	float rotRatio= rotHeLuol;
//	displayWords(gl, i, 1, 1, true, rotRatio, (i* 2) % 6f);
//	rotRatio= rotHeLuo;
//	displayWords(gl, i, 1, 1, false, rotRatio, (i* 2) % 6f);
//	rotHeLuol= rotHeLuo;
//}
//}