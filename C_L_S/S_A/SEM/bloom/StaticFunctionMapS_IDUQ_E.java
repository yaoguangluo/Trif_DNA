package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.PSO.regex.DoSplit;
import S_I.OSI.SIQ.tinMap.TinMap;

import java.util.List;

//著作权人+ 作者= 罗瑶光
public class StaticFunctionMapS_IDUQ_E implements StaticFunctionMapS_IDUQ_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    public TinMap clone(App NE) {
        TinMap tinMap = NE._I_U.tinMap;
        return tinMap.clone();
    }

    public List<String> splitRegex(App NE) {
        AES_QMS_XSD_TIH input = NE._I_U.inputString;
        AES_QMS_XSD_TIH split = NE._I_U.split;
        AES_QMS_XSD_TIH unSplit = NE._I_U.unSplit;
        return DoSplit.splitRegex(input._S_, split._S_, unSplit._S_, "\\");
    }
}
