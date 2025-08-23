package jniLYGAFDCDFFT;

import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.wave.DFT;
import U_A.PEU.P.wave.FFT;
import P.wave.proportion.Proportion_X_newXY;

import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 * */
//这个算法纪念罗瑶光先生逝去的青春。
public class LYGAFDCTDFFT {
    public static void main(String[] argv) {
        double[] input = new double[256];
        for (int i = 0; i < input.length; i++) {
            input[i] = (1000000 * Math.random());
            System.out.println(input[i]);
        }
        double[] output = new LYGAFDCTDFFT().jniLYGAFDCTDFFT(input);
        double[] outputcdft = new LYGAFDCTDFFT().jniLYGAFDCTDFT(input);
        double[] outputldft = new LYGAFDCTDFFT().jniLYGAFLDFT(input);
        double[] outputlogdft = new LYGAFDCTDFFT().jniLYGAFLOGDFT(input);
        DFT dFT = new DFT();
        dFT.IV_(256);
        double[] b = new FFT().fft1(input);
        double[] output1 = dFT.ft(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println("-----" + i + "-----");
            System.out.println(output[i]);
            System.out.println(output1[i]);
            System.out.println(b[i]);
            System.out.println(outputcdft[i]);
            System.out.println(outputldft[i]);
            System.out.println(outputlogdft[i]);
        }
    }

    //double k[] = new double[1024];
    public double[] jniLYGAFDCTDFT(double[] input) {
        double[] output = new double[input.length];
        int n = input.length;
        double d_n = input.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 2 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double cc = Math.cos(pi_o_d_n);
        double ss = Math.sin(pi_o_d_n);
        for (int i = 0; i < n; i++) {
            double ccc = c * cc - s * ss;
            double sss = s * cc + c * ss;
            c = ccc;
            s = sss;
            double ccccc = 0.0, sssss = 0.0;
            for (double v : input) {
                double cccc = c * ccc - s * sss;
                double ssss = s * ccc + c * sss;
                ccccc += cccc * v;
                sssss += ssss * v;
                c = cccc;
                s = ssss;
            }
            c = ccc;
            s = sss;
            output[i] = Math.sqrt(ccccc * ccccc + sssss * sssss);
        }
        return output;
    }

    public double[] jniLYGAFDCTDFFT(double[] input) {
        double[] outputc = new double[input.length];
        System.arraycopy(input, 0, outputc, 0, input.length);
        double[] outputs = new double[input.length];
        int n = input.length;
        double d_n = input.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 2 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double cc = Math.cos(pi_o_d_n);
        double ss = Math.sin(pi_o_d_n);
        dofft(c, s, cc, ss, n, input, outputc, outputs, 1);
        for (int i = 0; i < n; i++) {
            outputc[i] = Math.sqrt(outputc[i] * outputc[i]
                + outputs[i] * outputs[i]);
        }
        return outputc;
    }

    private void dofft(double c, double s, double cc, double ss
        , int n, double[] input, double[] outputc, double[] outputs, int j) {

    }

    public double[] jniLYGAFLDFT(double[] input) {
        double[] output = new double[input.length];
        int n = input.length;
        double d_n = input.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 2 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double[][] kc = new double[n][n];
        double[][] ks = new double[n][n];
        double[] lcc = new double[n];
        double[] lss = new double[n];
        for (int i = 0; i < n; i++) {
            // double ic = input[i];
            double cc = c;
            double ss = s;
            for (int j = 0; j <= i; j++) {
                double kcc = c * cc - s * ss;
                double kss = s * cc + c * ss;
                cc = kcc;
                ss = kss;
            }
            lcc[i] = cc;
            lss[i] = ss;
        }
        for (int i = 0; i < n; i++) {
            double ic = input[i];
            double cc = lcc[i];
            double ss = lss[i];
            double ccc = kc[0][i] = ic * cc;
            double sss = ks[0][i] = ic * ss;
            for (int j = 1; j < n; j++) {
                double kcc = cc * ccc - ss * sss;
                double kss = ss * ccc + cc * sss;
                kc[j][i] = ccc = kcc;
                ks[j][i] = sss = kss;
            }
        }
        for (int i = 0; i < n; i++) {
            c = 0.0;
            s = 0.0;
            for (int j = 0; j < n; j++) {
                c += kc[i][j];
                s += ks[i][j];
            }
            output[i] = Math.sqrt(c * c + s * s);
        }
        return output;
    }

    public class cp {//later..
        double a;
        double b;
        double ca;
        double cb;
        double cpi;
        double sa;
        double sb;
    }

    //    1 2   4    8     16      32      64      128    256    512      1024
//    1 0.5 0.25 0.125 0.0725 0.03625 0.018  0.009   0.0045  0.00225  0.001125
    public double[] jniLYGAFLOGDFT(double[] input) {
        cp[] cps = new cp[input.length];
        cp[] out = new cp[input.length];
        for (int i = 0; i < input.length; i++) {
            cps[i] = new cp();
            out[i] = new cp();
            cps[i].a = input[i];
        }
        out = log3ffdit(cps);
        double[] output = new double[input.length];
        double sum = 0.0;
        double sumcb = 0.0;
        double sumca = 0.0;
        for (int j = 0; j < input.length; j++) {
            double n = 0.001125 - 2 * out[j].ca * out[j].cb;
            output[j] = Math.abs(+n + out[j].b * out[j].cpi
                - 2 * out[j].ca * out[j].cb * out[j].b * out[j].cpi);
            sum += n;
            sumca += out[j].ca;
            sumcb += out[j].cb;
        }
        System.out.println("--");
        System.out.println(sum);
        System.out.println(sumca);
        System.out.println(sumcb);
        return output;
    }

    public void logdftK(cp[] cps, cp[] out) {
        cp[] output = cps;
        int n = cps.length;
        if (n < 2) {
            return;
        }
        cp[] even = new cp[cps.length / 2];
        cp[] odd = new cp[cps.length / 2];
        for (int i = 0; i < n / 2; i++) {
            even[i] = cps[i * 2];
            odd[i] = cps[i * 2 + 1];
        }
        logdftK(even, out);
        logdftK(odd, out);
        double d_n = cps.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 2 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double[][] kec = new double[n][n];
        double[][] kos = new double[n][n];
        double[] lcc = new double[n];
        double[] lss = new double[n];
        for (int i = 0; i < n / 2; i++) {
            double cc = c;
            double ss = s;
            for (int j = 0; j <= i; j++) {
                double kcc = c * cc - s * ss;
                double kss = s * cc + c * ss;
                cc = kcc;
                ss = kss;
            }
            lcc[i] = cc;
            lss[i] = ss;
        }
        for (int i = 0; i < n / 2; i++) {
            cp ie = even[i];
            cp io = odd[i];
            double cc = lcc[i];
            double ss = lss[i];
            double ccc = kec[0][i] = ie.a * cc;
            double sss = kos[0][i] = io.a * ss;
            for (int j = 1; j < n / 2; j++) {
                double kss = ss * ccc + cc * sss;
                double kcc = cc * ccc - ss * sss;
                kec[j][i] += ccc = kcc;
                kos[j][i] += sss = kss;
            }
        }
        for (int i = 0; i < n / 2; i++) {
            c = 0.0;
            s = 0.0;
            for (int j = 0; j < n / 2; j++) {
                c += kec[i][j];
                s += kos[i][j];
            }
            out[i].a += c;
            out[i].b += s;
            out[i + n / 2].a -= c;
            out[i + n / 2].b -= s;
        }
    }

    public void log3dftK(cp[] cps, cp[] out) {
        cp[] output = cps;
        int n = cps.length;
        if (n < 3) {
            return;
        }
        cp[] even = new cp[cps.length / 3];
        cp[] odd = new cp[cps.length / 3];
        cp[] cpi = new cp[cps.length / 3];
        for (int i = 0; i < n / 3; i++) {
            even[i] = cps[i * 3];
            odd[i] = cps[i * 3 + 1];
            cpi[i] = cps[i * 3 + 2];
        }
        log3dftK(even, out);
        log3dftK(odd, out);
        log3dftK(cpi, out);
        double d_n = (double) cps.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 3 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double csi = 0.0;
        double[][] kec = new double[n][n];
        double[][] kos = new double[n][n];
        double[][] kcs = new double[n][n];
        double[] lcc = new double[n];
        double[] lss = new double[n];
        double[] lii = new double[n];
        for (int i = 0; i < n / 3; i++) {
            double cc = c;
            double ss = s;
            double ii = s;
            for (int j = 0; j <= i; j++) {
                double kcc = c * cc - s * ss;
                double kss = s * cc + c * ss;
                double kii = s * cc - c * ss;
                cc = kcc;
                ss = kss;
                ii = kii;
            }
            lcc[i] = cc;
            lss[i] = ss;
            lii[i] = ii;
        }
        for (int i = 0; i < n / 3; i++) {
            cp ie = even[i];
            cp io = odd[i];
            cp ic = cpi[i];
            double cc = lcc[i];
            double ss = lss[i];
            double ii = lii[i];
            double ccc = kec[0][i] = ie.a * cc;
            double sss = kos[0][i] = io.a * ss;
            double iii = kcs[0][i] = ic.a * ii;
            for (int j = 1; j < n / 3; j++) {
                double kss = ss * ccc + cc * sss;
                double kcc = cc * ccc - ss * sss;
                double kii = ii * ccc - cc * iii;
                kec[j][i] += ccc = kcc;
                kos[j][i] += sss = kss;
                kcs[j][i] += iii = kii;
            }
        }
        for (int i = 0; i < n / 3; i++) {
            c = 0.0;
            s = 0.0;
            csi = 0.0;
            for (int j = 0; j < n / 3; j++) {
                c += kec[i][j];
                s += kos[i][j];
                csi += kcs[i][j];
            }
            out[i + n / 3].a += c;
            out[i + n / 3].b += s;
            out[i + n / 3].cpi += csi;
        }
    }

    public cp[] log3fftK(cp[] cps) {
        cp[] output = cps;
        int n = cps.length;
        if (n < 3) {
            output = new cp[1];
            output[0] = cps[0];
            //output[1] = cps[1];
            //output[2] = cps[2];
            return output;
        }
        cp[] even = new cp[cps.length / 3];
        cp[] odd = new cp[cps.length / 3];
        cp[] cpi = new cp[cps.length / 3];
        for (int i = 0; i < n / 3; i++) {
            even[i] = cps[i * 3];
            odd[i] = cps[i * 3 + 1];
            cpi[i] = cps[i * 3 + 2];
        }
        cp[] a = log3fftK(even);
        cp[] ab = log3fftK(odd);
        double d_n = (double) cps.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 3 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double csi = 0.0;
        double[][] kec = new double[n][n];
        double[][] kos = new double[n][n];
        double[] lcc = new double[n];
        double[] lss = new double[n];
        for (int i = 0; i < n / 2; i++) {
            double cc = c;
            double ss = s;
            for (int j = 0; j <= i; j++) {
                double kcc = c * cc - s * ss;
                double kss = s * cc + c * ss;
                cc = kcc;
                ss = kss;
            }
            lcc[i] = cc;
            lss[i] = ss;
        }
        for (int i = 0; i < n / 2; i++) {
            cp ie = a[i];
            cp io = a[i];
            double cc = lcc[i];
            double ss = lss[i];
            double ccc = ie.a * cc;
            double sss = io.b * ss;
            double cccc = 0.0;
            double ssss = 0.0;
            double iiii = 0.0;
            for (int j = 0; j < 1; j++) {
                double kss = ss * ccc + cc * sss;
                double kcc = cc * ccc - ss * sss;
                cccc += ccc = kcc;
                ssss += sss = kss;
            }
            output[i].a = ab[i].a + cccc;
            output[i].b = ab[i].b + ssss;
            output[i].cpi = ab[i].cpi + iiii;
            output[i + n / 3].a = ab[i].a + cccc;
            output[i + n / 3].b = ab[i].b + ssss;
            output[i + n / 3].cpi = ab[i].cpi + iiii;
            output[i + n / 3 + n / 3].a = ab[i].a - cccc;
            output[i + n / 3 + n / 3].b = ab[i].b - ssss;
            output[i + n / 3 + n / 3].cpi = ab[i].cpi - iiii;
        }
        return output;
    }

    public cp[] log2fftK(cp[] cps) {
        cp[] output = new cp[cps.length];
        for (int i = 0; i < cps.length; i++) {
            output[i] = new cp();
        }
        int n = cps.length;
        if (n < 2) {
            output = new cp[1];
            output[0] = cps[0];
            return output;
        }
        cp[] even = new cp[cps.length / 2];
        cp[] odd = new cp[cps.length / 2];
        for (int i = 0; i < n / 2; i++) {
            even[i] = cps[i * 2];
            odd[i] = cps[i * 2 + 1];
        }
        cp[] a = log2fftK(even);
        cp[] ab = log2fftK(odd);
        double d_n = (double) cps.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 2 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double[] lcc = new double[n];
        double[] lss = new double[n];
        double cc = c;
        double ss = s;
        for (int i = 0; i < n / 2; i++) {
            double kcc = c * cc - s * ss;
            double kss = s * cc + c * ss;
            cc = kcc;
            ss = kss;
            lcc[i] = cc;
            lss[i] = ss;
        }
        for (int i = 0; i < n / 2; i++) {
            c = lcc[i];
            s = lss[i];
            double ccc = a[i].a;
            double sss = a[i].b;
            double kss = s * ccc + c * sss;
            double kcc = c * ccc - s * sss;
            output[i].a = ab[i].a + kcc;
            output[i].b = ab[i].b + kss;
            output[i + n / 2].a = ab[i].a - kcc;
            output[i + n / 2].b = ab[i].b - kss;
        }
        return output;
    }

    public cp[] log3fft(cp[] cps) {
        cp[] output = new cp[cps.length];
        for (int i = 0; i < cps.length; i++) {
            output[i] = new cp();
        }
        int n = cps.length;
        if (n < 2) {
            output = new cp[1];
            output[0] = cps[0];
            return output;
        }
        cp[] even = new cp[cps.length / 2];
        cp[] odd = new cp[cps.length / 2];
        cp[] cpi = new cp[cps.length / 2];
        for (int i = 0; i < n / 2; i++) {
            even[i] = cps[i * 2];
            odd[i] = cps[i * 2 + 1];
            cpi[i] = odd[i];
        }
        cp[] a = log3fft(even);
        cp[] ab = log3fft(odd);
        double d_n = (double) cps.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 2 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double i = s;
        double[] lcc = new double[n];
        double[] lss = new double[n];
        double[] lii = new double[n];
        double cc = c;
        double ss = s;
        double ii = i;
        for (int j = 0; j < n / 2; j++) {
            double kcc = c * cc - s * ss;
            double kss = s * cc + c * ss;
            c = cc = kcc;
            s = ss = kss;
            double ccc = a[j].a;
            double sss = a[j].b;
            output[j].a = ab[j].a + kcc;
            output[j].b = ab[j].b + kss;
            output[j].ca = ab[j].ca + ccc;
            output[j].cb = ab[j].cb + c;
            output[j].sa = ab[j].sa + sss;
            output[j].sb = ab[j].sb + s;
            output[j + n / 2].a = ab[j].a - kcc;
            output[j + n / 2].b = ab[j].b - kss;
            output[j + n / 2].ca = ab[j].ca - ccc;
            output[j + n / 2].cb = ab[j].cb - c;
            output[j + n / 2].sa = ab[j].sa - sss;
            output[j + n / 2].sb = ab[j].sb - s;
        }
        return output;
    }

    public cp[] log3ffdit(cp[] cps) {
        cp[] output = new cp[cps.length];
        for (int i = 0; i < cps.length; i++) {
            output[i] = new cp();
        }
        int n = cps.length;
        if (n < 2) {
            output = new cp[1];
            output[0] = cps[0];
            return output;
        }
        cp[] even = new cp[cps.length / 2];
        cp[] odd = new cp[cps.length / 2];
        cp[] cpi = new cp[cps.length / 2];
        for (int i = 0; i < n / 2; i++) {
            even[i] = cps[i * 2];
            odd[i] = cps[i * 2 + 1];
            cpi[i] = odd[i];
        }
        cp[] a = log3ffdit(even);
        cp[] ab = log3ffdot(odd);
        cp[] abc = log3ffdot(cpi);
        double d_n = cps.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 2 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double i = s;
        double[] lcc = new double[n];
        double[] lss = new double[n];
        double[] lii = new double[n];
        double cc = c;
        double ss = s;
        double ii = i;
        for (int j = 0; j < n / 2; j++) {
            double kcc = c * cc - s * ss;
            double kss = s * cc + c * ss;
            double kii = i * cc - c * ii;
            cc = kcc;
            ss = kss;
            ii = kii;
            lcc[j] = cc;
            lss[j] = ss;
            lii[j] = ii;
        }
        for (int j = 0; j < n / 2; j++) {
            c = lcc[j];
            s = lss[j];
            i = lii[j];
            double ccc = a[j].a;
            double sss = a[j].b;
            double iii = a[j].cpi;
            double kss = s * ccc + c * sss;
            double kcc = c * ccc - s * sss;
            double kii = i * ccc - c * iii;
            output[j].a = ab[j].a + kcc;
            output[j].ca = ab[j].ca + ccc;
            output[j].cb = ab[j].cb + c;

            output[j].b = ab[j].b + kss;
            output[j].cpi = ab[j].cpi + kii;
            output[j].sa = ab[j].sa + sss;
            output[j].sb = ab[j].sb + s;

            output[j + n / 2].a = abc[j].a - kcc;
            output[j + n / 2].ca = abc[j].ca - ccc;
            output[j + n / 2].cb = abc[j].cb - c;

            output[j + n / 2].b = abc[j].b - kss;
            output[j + n / 2].cpi = abc[j].cpi - kii;
            output[j + n / 2].sa = abc[j].sa - sss;
            output[j + n / 2].sb = abc[j].sb - s;
        }
        return output;
    }

    public cp[] log3ffdot(cp[] cps) {
        cp[] output = new cp[cps.length];
        for (int i = 0; i < cps.length; i++) {
            output[i] = new cp();
        }
        int n = cps.length;
        if (n < 2) {
            output = new cp[1];
            output[0] = cps[0];
            return output;
        }
        cp[] even = new cp[cps.length / 2];
        cp[] odd = new cp[cps.length / 2];
        cp[] cpi = new cp[cps.length / 2];
        for (int i = 0; i < n / 2; i++) {
            even[i] = cps[i * 2];
            odd[i] = cps[i * 2 + 1];
            cpi[i] = odd[i];
        }
        cp[] a = log3ffdit(even);
        cp[] ab = log3ffdot(odd);
        cp[] abc = log3ffdot(cpi);
        double d_n = cps.length;
        double pi = 3.1415926;
        double o_d_n = 1 / d_n;
        double pi_o_d_n = 2 * pi * o_d_n;
        double c = Math.cos(pi_o_d_n);
        double s = Math.sin(pi_o_d_n);
        double i = s;
        double[] lcc = new double[n];
        double[] lss = new double[n];
        double[] lii = new double[n];
        double cc = c;
        double ss = s;
        double ii = i;
        for (int j = 0; j < n / 2; j++) {
            double kcc = c * cc - s * ss;
            double kss = s * cc + c * ss;
            double kii = i * cc - c * ii;
            cc = kcc;
            ss = kss;
            ii = kii;
            lcc[j] = cc;
            lss[j] = ss;
            lii[j] = ii;
        }
        for (int j = 0; j < n / 2; j++) {
            c = lcc[j];
            s = lss[j];
            i = lii[j];
            double ccc = a[j].a;
            double sss = a[j].b;
            double iii = a[j].cpi;
            double kss = s * ccc + c * sss;
            double kcc = c * ccc - s * sss;
            double kii = i * ccc - c * iii;
            output[j].a = ab[j].a + kcc;
            output[j].ca = ab[j].ca + ccc;
            output[j].cb = ab[j].cb + c;

            output[j].b = ab[j].b + kss;
            output[j].cpi = ab[j].cpi + kii;
            output[j].sa = ab[j].sa + sss;
            output[j].sb = ab[j].sb + s;

            output[j + n / 2].a = abc[j].a - kcc;
            output[j + n / 2].ca = abc[j].ca - ccc;
            output[j + n / 2].cb = abc[j].cb - c;

            output[j + n / 2].b = abc[j].b - kss;
            output[j + n / 2].cpi = abc[j].cpi - kii;
            output[j + n / 2].sa = abc[j].sa - sss;
            output[j + n / 2].sb = abc[j].sb - s;
        }
        return output;
    }

    public double[] jniLYGFFT(double[] input, cp[] outInput, int rangeLeft) {
        cp[] out = new cp[input.length];
        if (null != outInput[0]) {
            out = outInput;
        } else {
            cp[] cps = new cp[input.length];
            for (int i = 0; i < input.length; i++) {
                cps[i] = new cp();
                out[i] = new cp();
                cps[i].a = input[i];
            }
            out = log3ffdit(cps);
            for (int i = 0; i < out.length; i++) {
                outInput[i] = out[i];
            }
        }
        double[] output = new double[input.length];
        for (int j = rangeLeft; j < input.length; j++) {
            output[j] = Math.sqrt(out[j].ca * out[j].ca + out[j].sa * out[j].sa);
        }
        return output;
    }

    public double[] jniLYGFIT(double[] input, cp[] outInput, int rangeLeft) {
        cp[] out = new cp[input.length];
        if (null != outInput[0]) {
            out = outInput;
        } else {
            cp[] cps = new cp[input.length];
            for (int i = 0; i < input.length; i++) {
                cps[i] = new cp();
                out[i] = new cp();
                cps[i].a = input[i];
            }
            out = log3ffdit(cps);
            for (int i = 0; i < out.length; i++) {
                outInput[i] = out[i];
            }
        }
        double[] output = new double[input.length];
        for (int j = rangeLeft; j < input.length; j++) {
            output[j] = out[j].ca * out[j].cb * (2 * out[j].ca * out[j].cb - 1)
                + out[j].sa * out[j].sb;
        }
        return output;
    }

    public double[] jniLYGFLT(double[] input, cp[] outInput, int rangeLeft) {
        cp[] out = new cp[input.length];
        if (null != outInput[0]) {
            out = outInput;
        } else {
            cp[] cps = new cp[input.length];
            for (int i = 0; i < input.length; i++) {
                cps[i] = new cp();
                out[i] = new cp();
                cps[i].a = input[i];
            }
            out = log3ffdit(cps);
            for (int i = 0; i < out.length; i++) {
                outInput[i] = out[i];
            }
        }
        double[] output = new double[input.length];
        for (int j = rangeLeft; j < input.length; j++) {
            double n = -0.001125 - 2 * out[j].ca * out[j].cb;
            output[j] = Math.abs(-1 * out[j].b - 2 * out[j].a * out[j].b + n);
        }
        return output;
    }

    public double[] jniLYGFLLT(double[] input) {
        cp[] cps = new cp[input.length];
        cp[] out = new cp[input.length];
        for (int i = 0; i < input.length; i++) {
            cps[i] = new cp();
            out[i] = new cp();
            cps[i].a = input[i];
        }
        out = log3ffdit(cps);
        double[] output = new double[input.length];
        for (int j = 0; j < input.length; j++) {
            double n = -0.001125 - 2 * out[j].ca * out[j].cb;
            output[j] = Math.abs(out[j].b * (1 + 2 * out[j].ca * out[j].cb) + n);
        }
        return output;
    }

    public double[] jniLYGFET(double[] input, double[] fflA, double[] fflBI
        , cp[] outInput, int rangeLeft) {
        cp[] out = new cp[input.length];
        if (null != outInput[0]) {
            out = outInput;
        } else {
            cp[] cps = new cp[input.length];
            for (int i = 0; i < input.length; i++) {
                cps[i] = new cp();
                out[i] = new cp();
                cps[i].a = input[i];
            }
            out = log3ffdit(cps);
            for (int i = 0; i < out.length; i++) {
                outInput[i] = out[i];
            }
        }
        double[] output = new double[input.length];
        for (int j = rangeLeft; j < input.length; j++) {
            double n = -0.001125 - 2 * out[j].ca * out[j].cb;
            output[j] = Math.abs(+n + out[j].b * out[j].cpi
                - 2 * out[j].ca * out[j].cb * out[j].b * out[j].cpi);
            fflA[j] = output[j] * out[j].ca;
            fflBI[j] = output[j] * out[j].cb * out[j].cpi;
        }
        return output;
    }

    public double[] jniLYGFET(double[] input) {
        cp[] cps = new cp[input.length];
        cp[] out = new cp[input.length];
        for (int i = 0; i < input.length; i++) {
            cps[i] = new cp();
            out[i] = new cp();
            cps[i].a = input[i];
        }
        out = log3ffdit(cps);
        double[] output = new double[input.length];
        for (int j = 0; j < input.length; j++) {
            double n = -0.001125 - 2 * out[j].ca * out[j].cb;
            output[j] = Math.abs(+n + out[j].b * out[j].cpi
                - 2 * out[j].ca * out[j].cb * out[j].b * out[j].cpi);
        }
        return output;
    }

    public double[] jniLYGFILT(double[] input) {
        cp[] cps = new cp[input.length];
        cp[] out = new cp[input.length];
        for (int i = 0; i < input.length; i++) {
            cps[i] = new cp();
            out[i] = new cp();
            cps[i].a = input[i];
        }
        log3dftK(cps, out);
        double[] output = new double[input.length];
        for (int j = 0; j < input.length; j++) {
            output[j] = Math.abs(-2 * out[j].b + 2 * out[j].a * out[j].cpi);
        }
        return output;
    }

    public double[] jniLYGFLTn(double[] input, cp[] outInput, int rangeLeft) {
        cp[] cps = new cp[input.length];
        cp[] out = new cp[input.length];
        for (int i = 0; i < input.length; i++) {
            cps[i] = new cp();
            out[i] = new cp();
            cps[i].a = input[i];
        }
        if (null != outInput[0]) {
            out = outInput;
        } else {
            out = log3ffdit(cps);
            for (int i = 0; i < out.length; i++) {
                outInput[i] = out[i];
            }
        }
        double[] output = new double[input.length];
        for (int j = rangeLeft; j < input.length; j++) {
            double n = -0.001125 - 2 * out[j].ca * out[j].cb;
            output[j] = Math.abs(n);
        }
        return output;
    }

    public double[] jniLYGFLTln(double[] input) {
        cp[] cps = new cp[input.length];
        cp[] out = new cp[input.length];
        for (int i = 0; i < input.length; i++) {
            cps[i] = new cp();
            out[i] = new cp();
            cps[i].a = input[i];
        }
        out = log3etime(cps);
        double[] output = new double[input.length];
        for (int j = 0; j < input.length; j++) {
            double n = -0.001125 + 2 * out[j].ca * out[j].cb;
            output[j] = Math.abs(n * out[j].ca * out[j].cb);
        }
        return output;
    }

    public double[] jniLYGFxET(double[] input, cp[] outInput, int rangeLeft) {
        cp[] out = new cp[input.length];
        if (null != outInput[0]) {
            out = outInput;
        } else {
            cp[] cps = new cp[input.length];
            for (int i = 0; i < input.length; i++) {
                cps[i] = new cp();
                out[i] = new cp();
                cps[i].a = input[i];
            }
            out = log3ffdit(cps);
            for (int i = 0; i < out.length; i++) {
                outInput[i] = out[i];
            }
        }
        double[] output = new double[input.length];
        for (int j = rangeLeft; j < input.length; j++) {
            double n = -0.001125 + 2 * out[j].ca * out[j].cb;
            output[j] = Math.abs(n * (out[j].ca * out[j].cb + 2 * out[j].sa * out[j].sb));
        }
        return output;
    }

    public double kc[][] = new double[11][512];
    public double ks[][] = new double[11][512];
    public Map<Integer, Integer> ki = new IMV_SIQ();

    //0    1    2    3    4    5    6   7   8   9
    //512  256  128  64   32   16   8   4   2   1
    public void initk() {
        int k = 512;
        double pi = 3.1415926;
        for (int i = 0; i < 10 && k > 0; i++) {
            ki.put(k, i);//?
            double d_n = (double) k * 2;
            double o_d_n = 1 / d_n;
            double pi_o_d_n = 2 * pi * o_d_n;
            double c = Math.cos(pi_o_d_n);
            double s = Math.sin(pi_o_d_n);
            double cc = c;
            double ss = s;
            for (int j = 0; j < k; j++) {
                double kcc = c * cc - s * ss;
                double kss = c * ss + s * cc;
                kc[i][j] = kcc;
                ks[i][j] = kss;
                c = cc;
                s = ss;
            }
            k >>= 1;
        }
    }

    public cp[] log3etime(cp[] cps) {
        cp[] output = new cp[cps.length];
        for (int i = 0; i < cps.length; i++) {
            output[i] = new cp();
        }
        int n = cps.length;
        if (n < 2) {
            output = new cp[1];
            output[0] = cps[0];
            return output;
        }
        cp[] even = new cp[cps.length / 2];
        cp[] odd = new cp[cps.length / 2];
        cp[] cpi = new cp[cps.length / 2];
        for (int i = 0; i < n / 2; i++) {
            even[i] = cps[i * 2];
            odd[i] = cps[i * 2 + 1];
            cpi[i] = odd[i];
        }
        cp[] a = log3etime(even);
        cp[] ab = log3etime(odd);
        cp[] abc = log3etime(cpi);
        for (int j = 0; j < n / 2; j++) {
            double kcc = kc[ki.get(n / 2)][j];
            double kss = ks[ki.get(n / 2)][j];
            double ccc = a[j].a;
            double sss = a[j].b;
            double ekcc = kcc * ccc - kss * sss;
            double ekss = kcc * sss + kss * ccc;
            output[j].a = ab[j].a + ekcc;
            output[j].b = ab[j].b + ekss;
            output[j].ca = ab[j].ca + ccc;
            output[j].cb = ab[j].cb + kcc;
            output[j + n / 2].a = abc[j].a - ekcc;
            output[j + n / 2].b = abc[j].b - ekss;
            output[j + n / 2].ca = abc[j].ca - ccc;
            output[j + n / 2].cb = abc[j].cb - kcc;
        }
        return output;
    }

    public double[] jniLYGPDN(double[] input, int rangeLeft) {
        int height = 80;
        double[] bili1k = Proportion_X_newXY.newXY(input, 0.0
            + input.length, 80.0);
        double[] output = new double[161];
        for (int i = rangeLeft; i < bili1k.length; i++) {
            int temp = (int) bili1k[i];
            int tempHeight = temp + height;
            output[tempHeight] += temp;
        }
        return output;
    }
}
//622
//public cp[] log3ffdt(cp[] cps) {
//    cp[] output = new cp[cps.length];
//    for (int i = 0; i < cps.length; i++) {
//        output[i] = new cp();
//    }
//    int n = cps.length;
//    if (n < 2) {
//        output = new cp[1];
//        output[0] = cps[0];
//        return output;
//    }
//    cp[] even = new cp[cps.length / 2];
//    cp[] odd = new cp[cps.length / 2];
//    cp[] cpi = new cp[cps.length / 2];
//    for (int i = 0; i < n / 2; i++) {
//        even[i] = cps[i * 2];
//        odd[i] = cps[i * 2 + 1];
//        //cpi[i] = cps[i * 2 + 1];
//        cpi[i] = odd[i];
//    }
//    cp[] a = log3fft(even);
//    cp[] ab = log3fft(odd);
//    cp[] abc = log3fft(cpi);
//    double d_n = (double) cps.length;
//    double pi = 3.1415926;
//    double o_d_n = 1 / d_n;
//    double pi_o_d_n = 2 * pi * o_d_n;
//    double c = Math.cos(pi_o_d_n);
//    double s = Math.sin(pi_o_d_n);
//    double i = s;
//    double[] lcc = new double[n];
//    double[] lss = new double[n];
//    double[] lii = new double[n];
//    double cc = c;
//    double ss = s;
//    double ii = i;
//    for (int j = 0; j < n / 2; j++) {
//        double kcc = c * cc - s * ss;
//        double kss = s * cc + c * ss;
//        double kii = i * cc - c * ii;
//        cc = kcc;
//        ss = kss;
//        ii = kii;
//        lcc[j] = cc;
//        lss[j] = ss;
//        lii[j] = ii;
//    }
//    for (int j = 0; j < n / 2; j++) {
//        c = lcc[j];
//        s = lss[j];
//        i = lii[j];
//        double ccc = a[j].a;
//        double sss = a[j].b;
//        double iii = a[j].cpi;
//        double kss = s * ccc + c * sss;
//        double kcc = c * ccc - s * sss;
//        double kii = i * ccc - c * iii;
//        output[j].a = ab[j].a + kcc;
//        output[j].b = ab[j].b + kss;
//        output[j].cpi = ab[j].cpi + kii;
//        output[j + n / 2].a = abc[j].a - kcc;
//        output[j + n / 2].b = abc[j].b - kss;
//        output[j + n / 2].cpi = abc[j].cpi - kii;
//    }
//    return output;
//}
//305
//public double[] jniLYGAFLFFT(double[] input) {
//    double[] output = new double[input.length];
//    int n = input.length;
//    double d_n = (double) input.length;
//    double pi = 3.1415926;
//    double o_d_n = 1 / d_n;
//    double pi_o_d_n = 3 * pi * o_d_n;
//    double c = Math.cos(pi_o_d_n);
//    double s = Math.sin(pi_o_d_n);
//    double[][] kc = new double[n][n];
//    double[][] ks = new double[n][n];
//    double[] lcc = new double[n];
//    double[] lss = new double[n];
//    for (int i = 0; i < n; i++) {
//        double cc = c;
//        double ss = s;
//        for (int j = 0; j <= i; j++) {
//            double kcc = c * cc - s * ss;
//            double kss = s * cc + c * ss;
//            cc = kcc;
//            ss = kss;
//        }
//        lcc[i] = cc;
//        lss[i] = ss;
//    }
//    double klc[] = new double[n];
//    double kls[] = new double[n];
//    //doinner();
//    for (int i = 0; i < n; i++) {
//        double ic = input[i];
//        double cc = lcc[i];
//        double ss = lss[i];
//        double ccc = kc[0][i] = ic * cc;
//        double sss = ks[0][i] = ic * ss;
//        for (int j = 1; j < n; j++) {
//            double kcc = cc * ccc - ss * sss;
//            double kss = ss * ccc + cc * sss;
//            kc[j][i] = ccc = kcc;
//            ks[j][i] = sss = kss;
//            //1 可基偶变换，库里图基算是个知识分子
//            //2 可欧拉变换
//            //3 可高斯变换
//        }
//    }
//    for (int i = 0; i < n; i++) {
//        c = 0.0;
//        s = 0.0;
//        for (int j = 0; j < n; j++) {
//            c += kc[i][j];
//            s += ks[i][j];
//        }
//        output[i] = Math.sqrt(c * c + s * s);
//    }
//    return output;
//}
//196
//public double[] jniLYGAFLOG3DFT(double[] input) {
//    cp[] cps = new cp[input.length];
//    cp[] out = new cp[input.length];
//    for (int i = 0; i < input.length; i++) {
//        cps[i] = new cp();
//        out[i] = new cp();
//        cps[i].a = input[i];
//    }
//    log3dftK(cps, out);
//    double[] output = new double[input.length];
//    for (int j = 0; j < input.length; j++) {
//        output[j] = -2 * out[j].b
//            + 2 * out[j].a * out[j].cpi;
//    }
//    return output;
//}
//    public double[] jniLYGAFMCTDFT(double[] input) {
//        double[] output = new double[input.length];
//        int n = input.length;
//        double d_n = (double) input.length;
//        double pi = 3.1415926;
//        double o_d_n = 1 / d_n;
//        double pi_o_d_n = 2 * pi * o_d_n;
//        double c = Math.cos(pi_o_d_n);
//        double s = Math.sin(pi_o_d_n);
//        double cc = Math.cos(pi_o_d_n);
//        double ss = Math.sin(pi_o_d_n);
//        double[][] cccc = new double[n][n];
//        double[][] ssss = new double[n][n];
//        double ccc = 0.0, sss = 0.0;
//        for (int i = 0; i < n; i++) {
//            c = ccc = c * cc - s * ss;
//            s = sss = s * cc + c * ss;
//            for (int j = 0; j < n; j++) {
//                c = cccc[i][j] = c * ccc - s * sss;
//                s = ssss[i][j] = s * ccc + c * sss;
//            }
//            c = ccc;
//            s = sss;
//        }
//        //
//        return output;
//    }