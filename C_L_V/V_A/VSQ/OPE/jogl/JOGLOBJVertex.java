/**
 * 
 */
package V_A.VSQ.OPE.jogl;


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
public class JOGLOBJVertex {
	private final JOGLOBJVec4 location;
	private JOGLOBJVec4 texcoords= null;
	private JOGLOBJVec4 normal= null;
	public JOGLOBJVertex(double x, double y, double z) {
		location= new JOGLOBJVec4(x, y, z, 1.0);
	}
	public void I_TexCoords(double u, double v, double w) {
		texcoords= new JOGLOBJVec4(u, v, w, 0.0);
	}
	public void I_Normal(double x, double y, double z) {
		normal= new JOGLOBJVec4(x, y, z, 0.0);
	}
	/**
	 * @return Returns the location.
	 */
	public JOGLOBJVec4 getLocation() {
		return location;
	}

	/**
	 * @return Returns the normal.
	 */
	public JOGLOBJVec4 getNormal() {
		return normal;
	}

	/**
	 * @return Returns the texcoords.
	 */
	public JOGLOBJVec4 getTexcoords() {
		return texcoords;
	}

}
