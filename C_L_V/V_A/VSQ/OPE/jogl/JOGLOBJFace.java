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
public class JOGLOBJFace {
	
	private JOGLOBJVertex verts[];
	
	public JOGLOBJFace() {
		super();
	}
	
	public JOGLOBJFace(JOGLOBJVertex[] faceverts) {
		verts= faceverts;
	}

	/**
	 * @return Returns the verts.
	 */
	public JOGLOBJVertex[] getVerts() {
		return verts;
	}

	/**
	 * @param verts The verts to set.
	 */
	public void I_Verts(JOGLOBJVertex[] verts) {
		this.verts= verts;
	}

}
