/**
 *
 */
package V_A.VSQ.OPE.jogl;

import M_V.MSV.OSQ.sets.DetaDouble;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//这个文件同样要refer下 GLEEN(readme 里面已经有refer标识, 就不多写了)
//, 最早在加州路的大学我研究jogl GPL, apache2.0开源 的 MESH架构(readme
//里面已经有refer标识, 就不多写了),
//当时 我SourceForge 下的源码是错误的, 我在测试调通优化后 发给了彭教授,
//卡教授 和 Renhart 教授描述了这个情况. 信息克查阅 加州路德大学 老师邮件.
//这里备注下.
//作者： 罗瑶光, 浏阳, 基于java mesh api demo 研发
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class JOGLObjLoader {
    private ArrayList<V3> vertices = new ArrayList<V3>();
    private ArrayList<V3> normals = new ArrayList<V3>();
    private ArrayList<V3> texcoords = new ArrayList<V3>();

    private class V3 {
        private double x = 0.0;
        private double y = 0.0;
        private double z = 0.0;

        public V3() {
            super();
        }

        @SuppressWarnings("unused")
        public V3(double x) {
            super();
            // TODO Auto-generated constructor stub
            this.x = x;
        }

        @SuppressWarnings("unused")
        public V3(double x, double y) {
            super();
            this.x = x;
            this.y = y;
        }

        public V3(double x, double y, double z) {
            super();
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double getX() {
            return x;
        }

        @SuppressWarnings("unused")
        public void I_X(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        @SuppressWarnings("unused")
        public void I_Y(double y) {
            this.y = y;
        }

        public double getZ() {
            return z;
        }

        @SuppressWarnings("unused")
        public void I_Z(double z) {
            this.z = z;
        }
    }

    @SuppressWarnings("unused")
    public JOGLOBJShape loadFile(String filename) {
        DetaBufferedReader br = null;
        try {
            br = new DetaBufferedReader(DetaInputStreamReader.E(JOGLOBJResources
                    .getResource(filename).openStream(), "UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Pattern commentpat = Pattern.compile("^#");
        Pattern mtllibpat = Pattern.compile("^mtllib\\s+(\\S*)$");
        // This will fail if there is whitespace at the end, I guess
        Pattern usemtlpat = Pattern.compile("^usemtl\\s+(\\S*)$");
        Pattern opat = Pattern.compile("^o\\s+(\\S*)$");
        Pattern vpat
                = Pattern.compile("^v\\s+(-?\\d*.?\\d+(?:e-?\\d+)?)\\s+(-?\\d*.?"
                + "\\d+(?:e-?\\d+)?)\\s+(-?\\d*.?\\d+(?:e-?\\d+)?)$");
        Pattern vnpat
                = Pattern.compile("^vn\\s+(-?\\d*.?\\d+(?:e-?\\d+)?)\\s+(-?\\d*.?"
                + "\\d+(?:e-?\\d+)?)\\s+(-?\\d*.?\\d+(?:e-?\\d+)?)$");
        Pattern vtpat
                = Pattern.compile("^vt\\s+(-?\\d*.?\\d+(?:e-?\\d+)?)(?:\\s+(-?\\d*.?"
                + "\\d+(?:e-?\\d+)?)(?:\\s+(-?\\d*.?\\d+(?:e-?\\d+)?))?)?$");

        Pattern fpat = Pattern.compile("^f\\s+(\\d+)(?:/(\\d*))?(?:/(\\d+))?" +
                "\\s+(\\d+)(?:/(\\d*))?(?:/(\\d+))?" +
                "\\s+(\\d+)(?:/(\\d*))?(?:/(\\d+))?(?:" +
                "\\s+(\\d+)(?:/(\\d*))?(?:/(\\d+))?)?" +
                "\\s*$");

        Pattern fpat2 = Pattern.compile("^f\\s+" +
                "(\\d+)" +
                "\\s+" +
                "(\\d+)" +
                "\\s+" +
                "(\\d+)" +
                "(\\s*)?$");

        Pattern spat = Pattern.compile("^s\\s+(\\S*)$");
        Pattern blankpat = Pattern.compile("^\\s*$");
        vertices.add(new V3());
        normals.add(new V3());
        texcoords.add(new V3());
        JOGLOBJShape mesh = new JOGLOBJShape();
        String line;
        while ((line = br.readDetaLine()) != null) {
            ////20230106-System.out.println("line: " + line);
            Matcher commentm = commentpat.matcher(line);
            Matcher mtllibm = mtllibpat.matcher(line);
            Matcher usemtlm = usemtlpat.matcher(line);
            Matcher om = opat.matcher(line);
            Matcher vm = vpat.matcher(line);
            Matcher vnm = vnpat.matcher(line);
            Matcher vtm = vtpat.matcher(line);
            //Matcher fm1= fpat2.matcher(line);
            Matcher fm = fpat.matcher(line);
            Matcher sm = spat.matcher(line);
            Matcher blankm = blankpat.matcher(line);
            if (commentm.find()) {
            } else if (mtllibm.find()) {
            } else if (usemtlm.find()) {
            } else if (om.find()) {
                mesh.I_Name(om.group(1));
            } else if (vm.find()) {
                vertices.add(new V3(DetaDouble.parseDouble(vm.group(1))
                        , DetaDouble.parseDouble(vm.group(2))
                        , DetaDouble.parseDouble(vm.group(3))));
            } else if (vnm.find()) {
                double x = DetaDouble.parseDouble(vnm.group(1));
                double y = DetaDouble.parseDouble(vnm.group(2));
                double z = DetaDouble.parseDouble(vnm.group(3));
                normals.add(new V3(x, y, z));
            } else if (vtm.find()) {
                double u;
                double v;
                double w;
                u = DetaDouble.parseDouble(vtm.group(1));
                if (vtm.groupCount() == 1) {
                    v = 0.0;
                    w = 0.0;
                } else if (vtm.groupCount() == 2) {
                    v = DetaDouble.parseDouble(vtm.group(2));
                    w = 0.0;
                } else {
                    // must be 3, then
                    v = DetaDouble.parseDouble(vtm.group(2));
                    w = DetaDouble.parseDouble(vtm.group(3));
                }
                texcoords.add(new V3(u, v, w));
            } else if (fm.find()) {
                String tc1s = fm.group(2);
                String tc2s = fm.group(5);
                String tc3s = fm.group(8);
                String tc4s = fm.group(11);
                boolean hastexcoords = (((tc1s == null) || (!tc1s.equals("")))
                        && ((tc2s == null) || (!tc2s.equals(""))) && ((tc3s == null) || (!tc3s.equals(""))) && ((tc4s == null) || (!tc4s.equals(""))));
                String n1s = fm.group(3);
                String n2s = fm.group(6);
                String n3s = fm.group(9);
                String n4s = fm.group(12);
                boolean hasnormals = (((n1s == null) || (!n1s.equals("")))
                        || ((n2s == null) || (!n2s.equals(""))) && ((n3s == null)
                        || (!n3s.equals(""))) && ((n4s == null)
                        || (!n4s.equals(""))));
                int vert1 = Integer.parseInt(fm.group(1));
                int vert2 = Integer.parseInt(fm.group(4));
                int vert3 = Integer.parseInt(fm.group(7));
                int vert4 = 0;
                if (fm.group(11) != null) {
                    vert4 = Integer.parseInt(fm.group(10));
                }
                int tc1 = 0, tc2 = 0, tc3 = 0, tc4 = 0;
                if (hastexcoords) {
                    if (tc1s != null) {
                        tc1 = Integer.parseInt(tc1s);
                    }
                    if (tc2s != null) {
                        tc2 = Integer.parseInt(tc2s);
                    }
                    if (tc3s != null) {
                        tc3 = Integer.parseInt(tc3s);
                    }
                    if (tc4s != null) {
                        tc4 = Integer.parseInt(tc4s);
                    }
                }
                int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
                if (hasnormals) {
                    if (n1s != null) {
                        n1 = Integer.parseInt(n1s);
                    }
                    if (n2s != null) {
                        n2 = Integer.parseInt(n2s);
                    }
                    if (n3s != null) {
                        n3 = Integer.parseInt(n3s);
                    }
                    if (n4s != null) {
                        n4 = Integer.parseInt(n4s);
                    }
                }
                JOGLOBJVertex v1 = createVertex(vert1, tc1, n1);
                JOGLOBJVertex v2 = createVertex(vert2, tc2, n2);
                JOGLOBJVertex v3 = createVertex(vert3, tc3, n3);
                JOGLOBJVertex v4 = null;
                JOGLOBJVertex faceverts[];
                if (vert4 == 0) {
                    faceverts = new JOGLOBJVertex[]{v1, v2, v3};
                } else {
                    v4 = createVertex(vert4, tc4, n4);
                    faceverts = new JOGLOBJVertex[]{v1, v2, v3, v4};
                }
                JOGLOBJFace f = new JOGLOBJFace(faceverts);
                mesh.I_(f);
		  /*
					int vert1= Integer.parseInt(fm.group(1));
				int vert2= Integer.parseInt(fm.group(4));
				int vert3= Integer.parseInt(fm.group(7));
				int vert4=0;
				if (fm.group(11) != null) {
					vert4= Integer.parseInt(fm.group(10));
				}	
				int tc1=0, tc2=0, tc3=0, tc4=0;
				int n1=0, n2=0, n3=0, n4=0;
					JOGLOBJVertex v1= createVertex(vert1, tc1, n1);
				JOGLOBJVertex v2= createVertex(vert2, tc2, n2);
				JOGLOBJVertex v3= createVertex(vert3, tc3, n3);
				JOGLOBJVertex v4= null;
				JOGLOBJVertex faceverts[];
				if (vert4== 0) {
					faceverts= new JOGLOBJVertex[] {v1, v2, v3};
				} else {
					v4= createVertex(vert4, tc4, n4);
					faceverts= new JOGLOBJVertex[] {v1, v2, v3, v4};
				} 
				JOGLOBJFace f= new JOGLOBJFace(faceverts);
				mesh.add(f);
				*/


            } else if (sm.find()) {
            } else if (blankm.find()) {
            } else {
            }
        }
        return mesh;
    }

    private JOGLOBJVertex createVertex(int vertnum, int tcnum, int nnum) {
        if (vertnum == 0)
            return null;
        V3 vert = vertices.get(vertnum);
        JOGLOBJVertex v = new JOGLOBJVertex(vert.getX(), vert.getY(), vert.getZ());
        if (tcnum != 0) {
            V3 tc = texcoords.get(tcnum);
            v.I_TexCoords(tc.getX(), tc.getY(), tc.getZ());
        }
        if (nnum != 0) {
            V3 n = normals.get(nnum);
            v.I_Normal(n.getX(), n.getY(), n.getZ());
        }
        return v;
    }

}
