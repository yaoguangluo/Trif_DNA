package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import A_I.MPE.P.CopyLaw;
import A_I.MPE.P.DNA;
import A_I.MPE.P.DatingLaw;
import A_I.MPE.P.InheritanceLaw;
import A_I.MPE.P.Life;
import A_I.MPE.P.MutationLaw;
import A_I.MPE.P.PDN;
import A_I.MPE.P.RST;
import A_I.MPE.P.SeparaterLaw;
import A_I.MPE.P.SwapLaw;
import S_A.pheromone.IMV_SIQ;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

//著作权人+作者=罗瑶光
//我的世界就要来了。
public class StaticFunctionMapP_IDUQ_E implements StaticFunctionMapP_IDUQ_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    // CopyLaw{
    public DNA copy(App NE) {
        DNA dna = NE._I_U.dna;
        return new CopyLaw().copy(dna);
    }

    public ConcurrentHashMap<Integer, PDN> copyMap(App NE) {
        ConcurrentLinkedDeque<PDN> functionLineDeque = NE._I_U.functionLineDeque;
        return new CopyLaw().copyMap(functionLineDeque);
    }

    public ConcurrentLinkedDeque<PDN> mask(App NE) {
        ConcurrentLinkedDeque<PDN> originDeque = NE._I_U.originDeque;
        ConcurrentLinkedDeque<PDN> newDeque = NE._I_U.newDeque;
        ConcurrentLinkedDeque<PDN> maskOutput = NE._I_U.maskOutput;
        return new CopyLaw().mask(originDeque, newDeque, maskOutput);
    }

    public ConcurrentLinkedDeque<PDN> dequeCopy(App NE) {
        ConcurrentLinkedDeque<PDN> maskLineDeque = NE._I_U.maskLineDeque;
        return new CopyLaw().copy(maskLineDeque);
    }

    public DNA mutationCopy(App NE) {
        DNA dna = NE._I_U.dna;
        return new CopyLaw().mutationCopy(dna);
    }

    //DatingLaw{
    public RST dating(App NE) {
        RST father = NE._I_U.father;
        RST mother = NE._I_U.mother;
        return new DatingLaw().dating(father, mother);
    }

    //InheritanceLaw{
    public RST inheritance(App NE) {
        RST father = NE._I_U.father;
        RST mother = NE._I_U.mother;
        return new InheritanceLaw().inheritance(father, mother);
    }

    //Life{ //稍后 return 化
    public void born(App NE) {
        new Life().born();
    }

    //MutationLaw{
    public RST mutation(App NE) {
        RST father = NE._I_U.father;
        RST mother = NE._I_U.mother;
        return new MutationLaw().mutation(father, mother);
    }

    //SeparaterLaw{
    public ConcurrentLinkedDeque<DNA> separater(App NE) {
        ConcurrentLinkedDeque<DNA> original = NE._I_U.original;
        return new SeparaterLaw().separater(original);
    }

    //SwapLaw{
    public DNA swap(App NE) {
        DNA original = NE._I_U.originalDNA;
        return new SwapLaw().swap(original);
    }
}
