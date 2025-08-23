//package S_A.linePage;
//
//import jniLYGAFDCDFFT.LYGAFDCTDFFT;
//import org.python.modules.math;
//
//public class FFdit {
//    public LYGAFDCTDFFT.cp[] log3ffdit(LYGAFDCTDFFT.cp[] cps) {
//        LYGAFDCTDFFT.cp[] output = new LYGAFDCTDFFT.cp[cps.length];
//        for (int i = 0; i < cps.length; i++) {
//            output[i] = new LYGAFDCTDFFT.cp();
//        }
//        int n = cps.length;
//        if (n < 2) {
//            output = new LYGAFDCTDFFT.cp[1];
//            output[0] = cps[0];
//            return output;
//        }
//        LYGAFDCTDFFT.cp[] even = new LYGAFDCTDFFT.cp[cps.length / 2];
//        LYGAFDCTDFFT.cp[] odd = new LYGAFDCTDFFT.cp[cps.length / 2];
//        LYGAFDCTDFFT.cp[] cpi = new LYGAFDCTDFFT.cp[cps.length / 2];
//        for (int i = 0; i < n / 2; i++) {
//            even[i] = cps[i * 2];
//            odd[i] = cps[i * 2 + 1];
//            cpi[i] = odd[i];
//        }
//        LYGAFDCTDFFT.cp[] a = log3ffdit(even);
//        LYGAFDCTDFFT.cp[] ab = log3ffdot(odd);
//        LYGAFDCTDFFT.cp[] abc = log3ffdot(cpi);
//        double d_n = (double) cps.length;
//        double pi = 3.1415926;
//        double o_d_n = 1 / d_n;
//        double pi_o_d_n = 2 * pi * o_d_n;
//        double c = math.cos(pi_o_d_n);
//        double s = math.sin(pi_o_d_n);
//        double i = s;
//        double[] lcc = new double[n];
//        double[] lss = new double[n];
//        double[] lii = new double[n];
//        double cc = c;
//        double ss = s;
//        double ii = i;
//        for (int j = 0; j < n / 2; j++) {
//            double kcc = c * cc - s * ss;
//            double kss = s * cc + c * ss;
//            double kii = i * cc - c * ii;
//            cc = kcc;
//            ss = kss;
//            ii = kii;
//            lcc[j] = cc;
//            lss[j] = ss;
//            lii[j] = ii;
//        }
//        for (int j = 0; j < n / 2; j++) {
//            c = lcc[j];
//            s = lss[j];
//            i = lii[j];
//            double ccc = a[j].a;
//            double sss = a[j].b;
//            double iii = a[j].cpi;
//            double kss = s * ccc + c * sss;
//            double kcc = c * ccc - s * sss;
//            double kii = i * ccc - c * iii;
//            output[j].a = ab[j].a + kcc;
//            output[j].ca = ab[j].ca + ccc;
//            output[j].cb = ab[j].cb + c;
//
//            output[j].b = ab[j].b + kss;
//            output[j].cpi = ab[j].cpi + kii;
//            output[j].sa = ab[j].sa + sss;
//            output[j].sb = ab[j].sb + s;
//
//            output[j + n / 2].a = abc[j].a - kcc;
//            output[j + n / 2].ca = abc[j].ca - ccc;
//            output[j + n / 2].cb = abc[j].cb - c;
//
//            output[j + n / 2].b = abc[j].b - kss;
//            output[j + n / 2].cpi = abc[j].cpi - kii;
//            output[j + n / 2].sa = abc[j].sa - sss;
//            output[j + n / 2].sb = abc[j].sb - s;
//        }
//        return output;
//    }
//}
