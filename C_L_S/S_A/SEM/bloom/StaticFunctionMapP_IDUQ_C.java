package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import A_I.MPE.P.DNA;
import A_I.MPE.P.PDN;
import A_I.MPE.P.RST;
import S_A.pheromone.IMV_SIQ;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

//著作权人+作者=罗瑶光
//终于开始快要派上用场了。我的初衷。
public interface StaticFunctionMapP_IDUQ_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();


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
