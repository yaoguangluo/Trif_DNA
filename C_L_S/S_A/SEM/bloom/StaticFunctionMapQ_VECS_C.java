package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

import java.util.List;

//著作权人 + 作者 = 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapQ_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    public void searchFromTable(App NE, int rangeScale);

    public List<Object[]> searchFromTablewithScale(App NE, int rangeScale, boolean isKey);
}	
