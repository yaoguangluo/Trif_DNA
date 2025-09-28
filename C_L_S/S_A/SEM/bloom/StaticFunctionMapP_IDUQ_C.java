package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import A_I.MPE.P.DNA;
import A_I.MPE.P.PDN;
import A_I.MPE.P.RST;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
//著作权人+作者=罗瑶光
//终于开始快要派上用场了。我的初衷。
public interface StaticFunctionMapP_IDUQ_C  {

	// CopyLaw{
	public DNA copy(App NE);

	public ConcurrentHashMap<Integer, PDN> copyMap(App NE);

	public ConcurrentLinkedDeque<PDN> mask(App NE);

	public ConcurrentLinkedDeque<PDN> dequeCopy(App NE);

	public DNA mutationCopy(App NE);

	//DatingLaw{
	public RST dating(App NE);

	//InheritanceLaw{
	public RST inheritance(App NE);

	//Life{
	public void born(App NE);

	//MutationLaw{
	public RST mutation(App NE);

	//SeparaterLaw{
	public ConcurrentLinkedDeque<DNA> separater(App NE);

	//SwapLaw{
	public DNA swap(App NE);
}
