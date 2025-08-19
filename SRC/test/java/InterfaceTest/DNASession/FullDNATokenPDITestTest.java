package test.java.InterfaceTest.DNASession;

import org.junit.jupiter.api.Test;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 * */
class FullDNATokenPDITestTest {
    /*
     * 这个函数用于寻找不同酸碱浓度下可能存在的PDE变换，寻找最短的元基编码字符串浓缩结果。
     * 适用于肽计算中 元基编码 后的 密码缩进，词汇提示，长篇语言总结，深度文本分析。
     * PDS-PDI 很多人不知道肽展公式PDE怎么广泛运用，我就多举几把测试DEMO例子先。
     **/
    @Test
    void test() {
        String inputInitons = "EDVSDTUVSVSE";
        this.main(inputInitons);
        String inputInitons1 = "EDVSDTUVSVSEA";
        this.main(inputInitons1);
        String inputInitons2 = "EDVSDTUVSQVSQE";
        this.main(inputInitons2);
        String inputInitons3 = "EDVSDTUVSQVSQEA";
        this.main(inputInitons3);
        String inputInitons4 = "EDVSDTUVSQIVSQIE";
        this.main(inputInitons4);
        String inputInitons5 = "EDVSDTUVSQIVSQIEA";
        this.main(inputInitons5);
        String inputInitons6 = "EDVSDTUVSQIVSQIEAU";
        this.main(inputInitons6);
    }

    void main(String inputInitons) {
        //String inputInitons = "AOAOPPPPPPMVMEEECSIIDUQDUQTXHFTXHFFFFFF";
        //String inputInitons = "EDVSDTUVSQVSQEA";
        //String inputInitons ="VMECSIDUQDUQTXH";
        String beforeLoopInitons = inputInitons;
        System.out.println("输入char->" + beforeLoopInitons);
        beforeLoopInitons = duplication1(inputInitons);
        //计算
        System.out.println("简单去重单char->" + beforeLoopInitons);
        beforeLoopInitons = duplication2(beforeLoopInitons, 2);
        //计算
        System.out.println("简单去重双char->" + beforeLoopInitons);
        beforeLoopInitons = duplication2(beforeLoopInitons, 3);
        //计算
        System.out.println("简单去重3char->" + beforeLoopInitons);
        beforeLoopInitons = duplication2(beforeLoopInitons, 4);
        //计算
        System.out.println("简单去重4char，可loop->" + beforeLoopInitons);

        //PDS丝化降元 A = VS， O = ES， P = EC，M = CS，
        beforeLoopInitons = beforeLoopInitons.replace("A", "VS");
        beforeLoopInitons = beforeLoopInitons.replace("O", "ES");
        beforeLoopInitons = beforeLoopInitons.replace("P", "EC");
        beforeLoopInitons = beforeLoopInitons.replace("M", "CS");
//
        beforeLoopInitons = beforeLoopInitons.replace("T", "VE");
        //page 168
        beforeLoopInitons = beforeLoopInitons.replace("X", "VC");
        beforeLoopInitons = beforeLoopInitons.replace("H", "H");
        //HC HE 等同于P这里忽略先。
        beforeLoopInitons = beforeLoopInitons.replace("F", "ECS");
        System.out.println("简单PDS AOPM-VPCS->" + beforeLoopInitons);
        //PDI浓缩增元 , 不考虑酸，
        beforeLoopInitons = beforeLoopInitons.replace("V", "UQ");
        beforeLoopInitons = beforeLoopInitons.replace("E", "DU");
        beforeLoopInitons = beforeLoopInitons.replace("C", "DI");
        beforeLoopInitons = beforeLoopInitons.replace("S", "QI");
        System.out.println("简单PDS VPCS-IDUQ->" + beforeLoopInitons);
        //PDI 很多人不知道肽展公式PDE怎么广泛运用，我就多举几把测试DEMO例子先。
        beforeLoopInitons = beforeLoopInitons.replace("UQ", "V");
        beforeLoopInitons = beforeLoopInitons.replace("QU", "V");
        beforeLoopInitons = beforeLoopInitons.replace("DU", "E");
        beforeLoopInitons = beforeLoopInitons.replace("UD", "E");
        beforeLoopInitons = beforeLoopInitons.replace("DI", "C");
        beforeLoopInitons = beforeLoopInitons.replace("ID", "C");
        beforeLoopInitons = beforeLoopInitons.replace("QI", "S");
        beforeLoopInitons = beforeLoopInitons.replace("IQ", "S");
        System.out.println("简单PDI IDUQ-VECS->" + beforeLoopInitons);
        //
        beforeLoopInitons = beforeLoopInitons.replace("VS", "A");
        beforeLoopInitons = beforeLoopInitons.replace("SV", "A");
        beforeLoopInitons = beforeLoopInitons.replace("ES", "O");
        beforeLoopInitons = beforeLoopInitons.replace("SE", "O");
        beforeLoopInitons = beforeLoopInitons.replace("EC", "P");
        beforeLoopInitons = beforeLoopInitons.replace("CE", "P");
        beforeLoopInitons = beforeLoopInitons.replace("CS", "M");
        beforeLoopInitons = beforeLoopInitons.replace("SC", "M");
        //
        beforeLoopInitons = beforeLoopInitons.replace("VE", "T");
        beforeLoopInitons = beforeLoopInitons.replace("EV", "T");
        beforeLoopInitons = beforeLoopInitons.replace("VC", "X");
        beforeLoopInitons = beforeLoopInitons.replace("CV", "X");
        beforeLoopInitons = beforeLoopInitons.replace("HE", "H");
        //H 活性价值
        beforeLoopInitons = beforeLoopInitons.replace("EH", "H");
        beforeLoopInitons = beforeLoopInitons.replace("HC", "H");
        beforeLoopInitons = beforeLoopInitons.replace("CH", "H");
        beforeLoopInitons = beforeLoopInitons.replace("ECS", "F");
        //F 活性价值
        beforeLoopInitons = beforeLoopInitons.replace("ESC", "F");
        beforeLoopInitons = beforeLoopInitons.replace("CES", "F");
        beforeLoopInitons = beforeLoopInitons.replace("CSE", "F");
        beforeLoopInitons = beforeLoopInitons.replace("SEC", "F");
        beforeLoopInitons = beforeLoopInitons.replace("SCE", "F");
        System.out.println("简单PDI VECS-AOPM->" + beforeLoopInitons);
    }

    private String duplication1(String inputInitons) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = inputInitons.toCharArray();
        Here:
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
            for (int j = i; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    i = j;
                } else {
                    continue Here;
                }
            }
        }
        return stringBuilder.toString();
    }

    private String duplication2(String inputInitons, int compare) {
        StringBuilder stringBuilder = new StringBuilder();
        //
        StringBuilder stringBuilderOrdinary = new StringBuilder();
        StringBuilder stringBuilderCompare = new StringBuilder();
        //
        char[] chars = inputInitons.toCharArray();
        boolean hasTail = true;
        int i = 0;
        Here:
        for (i = 0; i < chars.length; i++) {
            //录入开始
            stringBuilderOrdinary.delete(0, stringBuilderOrdinary.length());
            stringBuilderCompare.delete(0, stringBuilderCompare.length());
            for (int j = i; j < i + compare && j < chars.length; j++) {
                stringBuilderOrdinary.append(chars[j]);
            }
            int l = 0;//过滤观测。
            int find = 0;
            //等差比较
            for (int j = i + compare; j < chars.length; j += compare) {
                for (int k = j; k < j + compare && k < chars.length; k++) {
                    stringBuilderCompare.append(chars[k]);
                }
                if (stringBuilderOrdinary.toString().equals(stringBuilderCompare.toString())) {
                    if (l++ < 1) {//过滤重复加。
                        stringBuilder.append(stringBuilderCompare);
                        find = 1;
                    }
                    j += compare;
                    i += compare + (compare - 1);
                    if (j > chars.length - compare) {//观测 尾差 数
                        hasTail = false;
                    }
                } else {
                    if (l < 1) {
                        stringBuilder.append(chars[i]);
                        find = 1;
                    }
                    continue Here;
                }
            }
            if (0 == find) {//条件与非条件综合补充尾差
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
//178
//        if (hasTail) {//条件补充尾差
//            for (int o = 0; o < compare; o++) {
//                stringBuilder.append(chars[chars.length - (compare - o)]);
//            }
//        }
//        else {
//            if (i <= chars.length) {//非条件补充尾差
//                for (int p = i-compare+(compare); p < chars.length; p++) {
//                    stringBuilder.append(chars[p]);
//                }
//            }
//        }

//19
////#### 元基数字= 元基符号= 肽展公式元基数字变换= (肽概率展开数字逻辑集合)
//    //#### 1位 ##### E= I= I=(I)
//    //##### F= U= I++ OR Q--=(I, Q)
//    //##### G= Q= Q=(Q)
//    //#### 1~2位
//    //##### 0= D= DD=(D, DD)
//    //#### 2位
//    //##### 1= C= DI=(DI)
//    //##### 3= E= IU, DU=(IU, DU)
//    //##### D= V= UQ=(UQ)
//    //##### 9= S= QI=(QI)
//    //#### 2~4位
//    //##### 4= H= (IU, DU) OR DI=(IU, DU, DI) OR (IUDI, DUDI)
//    //#### 4位
//    //##### 2= P= (IU, DU) + DI=(IUDI, DUDI)
//    //##### A= O= (IU, DU) + QI=(IUQI, DUQI)
//    //##### 7= A= UQQI=(UQQI)
//    //#### 4~6位
//    //##### 5= HC-= ((IU, DU) OR DI) + DI=(IUDI, DUDI, DIDI) OR (IUDIDI, DUDIDI)
//    //##### B= HE+= ((IU, DU) OR DI) + (IU, DU)=(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU)
//    //OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU)
//    //#### 6~8位
//    //##### 8= M= ((IU, DU) OR DI) + DI + QI=(IUDIQI, DUDIQI, DIDIQI) OR (IUDIDIQI, DUDIDIQI)
//    //##### 6= X= UQ + ((IU, DU) OR DI) + DI=(UQIUDI, UQDUDI, UQDIDI) OR (UQIUDIDI, UQDUDIDI)
//    //##### C= T= UQ + ((IU, DU) OR DI) + (IU, DU)=(UQIUIU, UQIUDU, UQDUIU, UQDUDU
//    //, UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU)
//113
//输出
//输入char->EDVSDTUVSVSE
//    简单去重单char->EDVSDTUVSVSE
//    简单去重双char->EDVSDTUVSE
//    简单去重3char->EDVSDTUVSE
//    简单去重4char，可loop->EDVSDTUVSE
//    简单PDS AOPM-VPCS->EDVSDVEUVSE
//    简单PDS VPCS-IDUQ->DUDUQQIDUQDUUUQQIDU
//    简单PDI IDUQ-VECS->EDVQCVEUVSE
//    简单PDI VECS-AOPM->EDVQCTUAE
//    输入char->EDVSDTUVSVSEA
//    简单去重单char->EDVSDTUVSVSEA
//    简单去重双char->EDVSDTUVSEA
//    简单去重3char->EDVSDTUVSEA
//    简单去重4char，可loop->EDVSDTUVSEA
//    简单PDS AOPM-VPCS->EDVSDVEUVSEVS
//    简单PDS VPCS-IDUQ->DUDUQQIDUQDUUUQQIDUUQQI
//    简单PDI IDUQ-VECS->EDVQCVEUVSEVS
//    简单PDI VECS-AOPM->EDVQCTUAEA
//    输入char->EDVSDTUVSQVSQE
//    简单去重单char->EDVSDTUVSQVSQE
//    简单去重双char->EDVSDTUVSQVSQE
//    简单去重3char->EDVSDTUVSQE
//    简单去重4char，可loop->EDVSDTUVSQE
//    简单PDS AOPM-VPCS->EDVSDVEUVSQE
//    简单PDS VPCS-IDUQ->DUDUQQIDUQDUUUQQIQDU
//    简单PDI IDUQ-VECS->EDVQCVEUVSQE
//    简单PDI VECS-AOPM->EDVQCTUAQE
//    输入char->EDVSDTUVSQVSQEA
//    简单去重单char->EDVSDTUVSQVSQEA
//    简单去重双char->EDVSDTUVSQVSQEA
//    简单去重3char->EDVSDTUVSQEA
//    简单去重4char，可loop->EDVSDTUVSQEA
//    简单PDS AOPM-VPCS->EDVSDVEUVSQEVS
//    简单PDS VPCS-IDUQ->DUDUQQIDUQDUUUQQIQDUUQQI
//    简单PDI IDUQ-VECS->EDVQCVEUVSQEVS
//    简单PDI VECS-AOPM->EDVQCTUAQEA
//    输入char->EDVSDTUVSQIVSQIE
//    简单去重单char->EDVSDTUVSQIVSQIE
//    简单去重双char->EDVSDTUVSQIVSQIE
//    简单去重3char->EDVSDTUVSQIVSQIE
//    简单去重4char，可loop->EDVSDTUVSQIE
//    简单PDS AOPM-VPCS->EDVSDVEUVSQIE
//    简单PDS VPCS-IDUQ->DUDUQQIDUQDUUUQQIQIDU
//    简单PDI IDUQ-VECS->EDVQCVEUVSSE
//    简单PDI VECS-AOPM->EDVQCTUAO
//    输入char->EDVSDTUVSQIVSQIEA
//    简单去重单char->EDVSDTUVSQIVSQIEA
//    简单去重双char->EDVSDTUVSQIVSQIEA
//    简单去重3char->EDVSDTUVSQIVSQIEA
//    简单去重4char，可loop->EDVSDTUVSQIEA
//    简单PDS AOPM-VPCS->EDVSDVEUVSQIEVS
//    简单PDS VPCS-IDUQ->DUDUQQIDUQDUUUQQIQIDUUQQI
//    简单PDI IDUQ-VECS->EDVQCVEUVSSEVS
//    简单PDI VECS-AOPM->EDVQCTUAOA
//    输入char->EDVSDTUVSQIVSQIEAU
//    简单去重单char->EDVSDTUVSQIVSQIEAU
//    简单去重双char->EDVSDTUVSQIVSQIEAU
//    简单去重3char->EDVSDTUVSQIVSQIEAU
//    简单去重4char，可loop->EDVSDTUVSQIEAU
//    简单PDS AOPM-VPCS->EDVSDVEUVSQIEVSU
//    简单PDS VPCS-IDUQ->DUDUQQIDUQDUUUQQIQIDUUQQIU
//    简单PDI IDUQ-VECS->EDVQCVEUVSSEVSU
//    简单PDI VECS-AOPM->EDVQCTUAOAU

//*************
// "AOAOPPPPPPMVMEEECSIIDUQDUQTXHFTXHFFFFFF" 的浓缩 PDW 结果 为VQXIPCACOMXTXPS
//*************
//

//Process finished with exit code 0
//Disconnected from the target VM, address: '127.0.0.1:51769', transport: 'socket'
//
//Process finished with exit code 0
