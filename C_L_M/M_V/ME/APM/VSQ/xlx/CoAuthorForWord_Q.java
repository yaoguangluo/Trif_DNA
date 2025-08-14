package M_V.ME.APM.VSQ.xlx;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import java.util.Iterator;
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
public class CoAuthorForWord_Q extends CoAuthorForWord_V {
    
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
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glBegin(GL.GL_TRIANGLES);
        deleteALatest(gl);
        drawANew(gl);
        gl.glEnd();
        gl.glFlush();
    }
    public void drawANew(GL2 gl) {
        float i = 1.0f;
        Iterator<String> iterators = rootClassMap.keySet().iterator();
        while (iterators.hasNext()) {
            String string = iterators.next();
            CommonRotClass commonRotClass = rootClassMap.getCommonRotClass(string);
            if (commonRotClass.buttonClicked) {
                rootLeaf = commonRotClass.rootLeaf;
                float rotRatio = commonRotClass.rot;
                float rotRatioZ = commonRotClass.rotZ;
                displayWords(gl, i, 1, 1, true
                    , rotRatio, rotRatioZ, ((i) * 2) % 6f);  //稍后整合五行
                i += 0.5f;
            }
        }
    }
    //先长度，再弧度，最后错开，
    public void deleteALatest(GL2 gl) {
        float i = 1.0f;
        boolean firstTime = true;
        Iterator<String> iterators = rootClassMap.keySet().iterator();
        while (iterators.hasNext()) {
            String string = iterators.next();
            CommonRotClass commonRotClass = rootClassMap.getCommonRotClass(string);
            if (commonRotClass.buttonClicked) {
                if (firstTime || (commonRotClass.rot != commonRotClass.rotl)) {
                    firstTime = false;
                    rootLeaf = commonRotClass.rootLeaf;
                    float rotRatio = commonRotClass.rotl;
                    float rotRatioZ = commonRotClass.rotZl;
                    displayWords(gl, i, 1, 1, false
                        , rotRatio, rotRatioZ, (i * 2) % 6f);
                    rotRatio = commonRotClass.rot;
                    rotRatioZ = commonRotClass.rotZ;
                    displayWords(gl, i, 1, 1, true
                        , rotRatio, rotRatioZ, (i * 2) % 6f);  //稍后整合五行
                    //更新
                    commonRotClass.rotl = commonRotClass.rot;
                    commonRotClass.rotZl = commonRotClass.rotZ;
                }
                i += 0.5f;
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
        for(int regi=0;regi<root.length;regi++){
            root[regi]=0.0;
        }
        didLeaf.clear();
        if (back) {
            drawWords(gl, section, 0, root, a, 0, 0, this.rootLeaf, didLeaf
                , length, rotRatio, rotRatioZ, (int) colorType, true);
        } else {
            drawWords(gl, section, 0, root, a, 0, 0, this.rootLeaf, didLeaf
                , length, rotRatio, rotRatioZ, (int) colorType, false);
        }
    }
    //稍后去重
    public void display(GLAutoDrawable drawable) {
        drawEngine(drawable);
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
        if (u.app_S.dic_li.containsKey(temp) || u.app_S.dic_yl.containsKey(temp)
            || u.app_S.dic_zf.containsKey(temp)) {
            IMV_SIQ_SS map = _A.parserMixStringByReturnFrequencyMap(
                (u.app_S.dic_li.get(temp) == null
                    ? "" : u.app_S.dic_li.get(temp))
                    + (u.app_S.dic_yl.get(temp) == null
                    ? "" : u.app_S.dic_yl.get(temp).toString())
                    + (u.app_S.dic_zf.get(temp) == null
                    ? "" : u.app_S.dic_zf.get(temp).toString())
            , NE);
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String tempRec = it.next();
                if (!findLeaf.containsKey(tempRec)) {
                    findLeaf.put(tempRec, 1);
                    frequencyLeaf.put(tempRec, 1);
                    if (u.app_S.dic_map.containsKey(tempRec)) {
                        IMV_SIQ subLeaf
                            = kernerForest(tempRec, leaf, findLeaf, depth, NE);
                        leaf.put(tempRec, subLeaf);
                    } else if (ml < 8) {
                        IMV_SIQ subLeaf
                            = kernerForest(tempRec, leaf, findLeaf, depth, NE);
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
}