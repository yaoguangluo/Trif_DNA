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
public class JOGLOBJVec4 {

	double x;
	double y;
	double z;
	double w;
	/**
	 * 
	 */
	public JOGLOBJVec4() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 */
	public JOGLOBJVec4(double x, double y, double z) {
		super();
		// TODO Auto-generated constructor stub
		this.x= x;
		this.y= y;
		this.z= z;
	}
	/**
	 */
	public JOGLOBJVec4(double x, double y, double z, double w) {
		super();
		// TODO Auto-generated constructor stub
		this.x= x;
		this.y= y;
		this.z= z;
		this.w= w;
	}
	/**
	 * @return Returns the w.
	 */
	public double getW() {
		return w;
	}
	/**
	 * @param w The w to set.
	 */
	public void I_W(double w) {
		this.w= w;
	}
	/**
	 * @return Returns the x.
	 */
	public double getX() {
		return x;
	}
	/**
	 * @param x The x to set.
	 */
	public void I_X(double x) {
		this.x= x;
	}
	/**
	 * @return Returns the y.
	 */
	public double getY() {
		return y;
	}
	/**
	 * @param y The y to set.
	 */
	public void I_Y(double y) {
		this.y= y;
	}
	/**
	 * @return Returns the z.
	 */
	public double getZ() {
		return z;
	}
	/**
	 * @param z The z to set.
	 */
	public void I_Z(double z) {
		this.z= z;
	}
}
