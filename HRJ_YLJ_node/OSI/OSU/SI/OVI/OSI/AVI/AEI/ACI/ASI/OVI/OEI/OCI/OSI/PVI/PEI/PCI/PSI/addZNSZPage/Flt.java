package OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZNSZPage;

import U_A.PEU.P.wave.DFT;
import P.wave.copy.Copy_X_copy1d;
import P.wave.maxAndMin.MaxAndMin_X_max_v;
import P.wave.peakStatistic.PeakStatistic_X_fengPaiyY;
import P.wave.peakStatistic.PeakStatistic_X_fengTong1;
import P.wave.proportion.Proportion_X_newX;
import P.wave.proportion.Proportion_X_newXY;
import P.wave.proportion.Proportion_X_newXYBest;
import P.wave.proportion.Proportion_X_newY;
import P.wave.proportion.Proportion_X_newYwithoutBound;
import P.wave.quantification.Quantification_X_liangHuaEqualDelete;
import P.wave.quantification.Quantification_X_liangHuaXiHua;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.geom.Line2D;
import java.util.Map;
import java.util.Vector;

/**
 * 作者罗瑶光
 */
public class Flt extends JPanel{
	
	double pi= 3.1415926;
	public void lt(Vector<Line2D.Double> flines
		, int N, double[] [] cos, double[][] sin
			, double[] newdata1, double[] fdata1) {
		for(int k= 0; k< N; k++){
			double v1= (2* pi* k/ N);
			for(int n= 0; n< N; n++){
				double v= v1* n;
				cos[k][n]= Math.cos(v);
				sin[k][n]= Math.sin(v);
			}
		}
		for(int k= 1; k< N; k++){
			double r= 0.0, i= 0.0;
			for(int n= 0; n< N; n++){
				r+= newdata1[n]* cos[k][n];
				i+= newdata1[n]* sin[k][n];
			}
			fdata1[k]= Math.sqrt(r*r+i*i);
			flines.add(new Line2D.Double(k, 0.0, k, fdata1[k]/900));
		}
	}

	public void clt(Vector<java.awt.geom.Line2D.Double> flines, int N
		, double[] [] cos, double[] [] sin
			, double[]  newdata1, double[]  fdata1) {
		double set= 2* pi/ N;
		for(int k= 0; k< N; k++){
			for(int n= 1; n < N; n ++){
				cos[k][n]= cos[k][n- 1]+ newdata1[n]* Math.cos(set* n * k);
			}
			fdata1[k]= Math.abs(cos[k][N-1]/N);
			flines.add(new Line2D.Double(k, 0, k, fdata1[k]));
		}
	}

	public String clt4(DFT dFT, Vector<java.awt.geom.Line2D.Double> lines
		, JpZNSZ jpt, Jpv jp3, Vector<java.awt.geom.Line2D.Double> mlines1,
                     Vector<java.awt.geom.Line2D.Double> mlines2,
                     Vector<java.awt.geom.Line2D.Double> mlines3,
                     Vector<java.awt.geom.Line2D.Double> mlines4,
                     Vector<java.awt.geom.Line2D.Double> mlines5,
                     Vector<java.awt.geom.Line2D.Double> mlines6,
                     Vector<java.awt.geom.Line2D.Double> mlines7,
                     Vector<java.awt.geom.Line2D.Double> mlines8,
                     Vector<java.awt.geom.Line2D.Double> mlines9,
                     Vector<java.awt.geom.Line2D.Double> mlines10,
                     Vector<java.awt.geom.Line2D.Double> mlines11,
                     Vector<java.awt.geom.Line2D.Double> mlines12, int N, double[] [] cos
		, double[] [] sin, double[]  newdata, double[]  fdata1,
                     Map<String, String> cache_bz, Map<String, String> cache_sj,
                     Vector<Line2D.Double> forOutput, Graphics graphics, int type)  {
		double[] newdata1= newdata;
		newdata1= U_A.PEU.P.wave.Median.median1d(newdata1, 0.0);
		double bili[]= Proportion_X_newYwithoutBound.newYwithoutBound(newdata1, 0.002);
		double max= MaxAndMin_X_max_v.max_v(bili);
		double bili0[]= bili;
		if(max>= 2&& 0== type) {
			bili0= Proportion_X_newXYBest.newXYBest(bili0, 1024.0, 65.0);
			bili0= U_A.PEU.P.wave.Guassian.guassian1d(bili0);
			lines.clear();
			for(int i= 0; i< bili0.length; i++) {
				lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
			}
			jp3.paint(jpt.getGraphics(), lines, forOutput);
		}else if(1== type) {
			bili0= Proportion_X_newXY.newXY(bili0, 1024.0, 100.0);
//			bili0= new PEU.waveProcessorYLJ.Proportion().newXYBest(bili0, 1024, 65);
			bili0= U_A.PEU.P.wave.Guassian.guassian1d(bili0);
			lines.clear();
			for(int i= 0; i< bili0.length; i++) {
				lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
			}
			jp3.paint(jpt.getGraphics(), lines, forOutput);
		}else{
			for(int i= 0; i< bili0.length; i++) {
				bili0[i]= 0.0;
			}
			lines.clear();
			for(int i=0; i<bili0.length; i++) {
				lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
			}
			mlines1.clear();
			mlines2.clear();
			mlines3.clear();
			mlines4.clear();
			mlines5.clear();
			mlines6.clear();
			mlines7.clear();
			mlines8.clear();
			mlines9.clear();
			return "";
		}
		double dft3[]= dFT.ft(bili0);
		double bili1[]= dft3;
		double caijian2[]= U_A.PEU.P.wave.Tailor.caiJian1(dft3, 0.0, (double)dft3.length/16);//64
		//锟斤拷锟轿革拷锟斤拷叶
		if(type== 0) {
			bili1= Proportion_X_newXY.newXY(caijian2, 256.0, 100.0);
		}else {
			bili1= Proportion_X_newXY.newXY(bili1, 1024.0, 100.0);
		}
		bili1= Quantification_X_liangHuaEqualDelete.liangHuaEqualDelete(bili1);
		mlines1.clear();
		for(int i=0;i<bili1.length;i++) {
			mlines1.add(new Line2D.Double(i, bili1[i], i, bili1[i]));
		}
		jp3.paint1(mlines1);
		double bili2 []= Proportion_X_newXYBest.newXYBest(caijian2, 256.0, 100.0);
		mlines2.clear();
		for(int i= 0;i< bili2.length; i++) {
			mlines2.add(new Line2D.Double(i, bili2[i], i, bili2[i]));
		}
		jp3.paint2(mlines2);
		//3
		double guassian3[]= U_A.PEU.P.wave.Median.median1d(bili2, 3.0);
		guassian3= U_A.PEU.P.wave.Guassian.guassian1d(guassian3);
		guassian3= U_A.PEU.P.wave.Guassian.guassian1d(guassian3);
		double bili3[]= Proportion_X_newXY.newXY(guassian3, 256.0, 100.0);
		mlines3.clear();
		for(int i= 0;i< bili3.length; i++) {
			mlines3.add(new Line2D.Double(i, bili3[i], i, bili3[i]));
		}
		jp3.paint3(mlines3);
		//lianghua4
		double xihua4[]= Quantification_X_liangHuaXiHua.liangHuaXiHua(bili3, 2.0);
		mlines4.clear();
		for(int i= 0; i< xihua4.length; i++) {
			mlines4.add(new Line2D.Double(i, xihua4[i], i, xihua4[i]));
		}
		jp3.paint4(mlines4);
		//5 shehold
		double shehold5[]=U_A.PEU.P.wave.Shehold.shehold1(xihua4, 25.0);
		mlines5.clear();
		for(int i=0;i<shehold5.length;i++) {
			mlines5.add(new Line2D.Double(i, shehold5[i], i, shehold5[i]));
		}
		jp3.paint5(mlines5);
		//6 file left
		double left= 0.0;
		for(int i= 0; i< shehold5.length; i++) {
			if(shehold5[i]> 0) {
				left= (double)i;
				break;
			}
		}
		double caijian[]= U_A.PEU.P.wave.Tailor.caiJian1(shehold5, left, left+128);
		mlines6.clear();
		for(int i=0; i<caijian.length; i++) {
			mlines6.add(new Line2D.Double(i, caijian[i], i, caijian[i]));
		}
		jp3.paint6(mlines6);
		//7 锟斤拷锟轿革拷锟斤拷叶
		double sample[]= new double[1024];
		double bili_sample[]= Proportion_X_newX.newX(caijian, 32.0);
		for(int i= 0; i< bili_sample.length; i++) {
			sample[i]= bili_sample[i];
			sample[1024-i-1]= bili_sample[i];
		}
		double dft2[]= dFT.ft(sample);
		dft2= Copy_X_copy1d.copy1d(dft2, 512.0);
		double bili7 []= Proportion_X_newXYBest.newXYBest(dft2, 256.0, 100.0);
		mlines7.clear();
		for(int i= 0;i< bili7.length; i++) {
			mlines7.add(new Line2D.Double(i, bili7[i], i, bili7[i]));
		}
		jp3.paint7(mlines7);
		//8 gaosi
		double guassian7[]= U_A.PEU.P.wave.Median.median1d(bili7, 0.0);
		guassian7= U_A.PEU.P.wave.Guassian.guassian1d(guassian7);
		mlines8.clear();
		for(int i= 0; i< guassian7.length; i++) {
			mlines8.add(new Line2D.Double(i, guassian7[i], i, guassian7[i]));
		}
		jp3.paint7(mlines8);
		//8 bili
		double sihua8[]= Quantification_X_liangHuaXiHua.liangHuaXiHua(guassian7, 2.0);
		double fengtong[][]= PeakStatistic_X_fengTong1.fengTong1(sihua8);
		double fengtongYy[][]= PeakStatistic_X_fengPaiyY.fengPaiYy(fengtong);
		double r= fengtongYy[0][0]>fengtongYy[1][0]?fengtongYy[0][0]:fengtongYy[1][0];
		System.out.println(r);
		if(r>200) {
			return "";
		}
		double bili8[]= U_A.PEU.P.wave.Tailor.caiJian1(guassian7, 0.0 , r);
		bili8= Proportion_X_newXYBest.newXYBest(bili8, 256.0, 100.0);
		mlines8.clear();
		for(int i=0; i<bili8.length; i++) {
			mlines8.add(new Line2D.Double(i, bili8[i], i, bili8[i]));
		}
		jp3.paint8(mlines8);
		//9 final
		double xihua9[]= Quantification_X_liangHuaXiHua.liangHuaXiHua(bili8, 2.0);
		mlines9.clear();
		for(int i= 0; i< xihua9.length; i++) {
			mlines9.add(new Line2D.Double(i, xihua9[i], i, xihua9[i]));
		}
		jp3.paint9(mlines9);
		//10 shehold
		double she10[]= U_A.PEU.P.wave.Shehold.shehold1(xihua9, 15.0);
		mlines10.clear();
		for(int i= 0; i< she10.length; i++) {
			mlines10.add(new Line2D.Double(i, she10[i], i, she10[i]));
		}
		jp3.paint10(mlines10);
		//gaosi
		double median11[]= U_A.PEU.P.wave.Guassian.guassian1d(she10);
		median11= Proportion_X_newY.newY(median11, 100.0);
		mlines11.clear();
		for(int i= 0; i< median11.length; i++) {
			mlines11.add(new Line2D.Double(i, median11[i], i, median11[i]));
		}
		jp3.paint11(mlines11);
		return "";
		//		//11 lianghua
		//		cp="0";
		//		for(int i=1;i<she10.length;i++) {
		//			if(she10[i]>15) {
		//				if(i>10) {
		//					cp+="+1/"+(int)(i/10)+"锟斤拷";
		//				}
		//			}
		//		}
		//		@SuppressWarnings("rawtypes")
		//		Set llll=cache_sj.keySet();
		//		@SuppressWarnings("rawtypes")
		//		Iterator lllll=llll.iterator();
		//		//System.out.println("outsj");
		//		while(lllll.hasNext()) {
		//			//System.out.println(lllll.next());
		//		}
		//		String rt="no find in txt";
		//		InputStream ain= getClass().getResourceAsStream("a.txt");
		//		DetaBufferedReader acReader= new DetaBufferedReader(DetaInputStreamReader.E(ain));
		//		String actempString= null;
		//		while ((actempString= acReader.readDetaLine()) != null) {
		//			if(actempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="a";
		//			}
		//		}
		//		acReader.closeDeta();
		//		//read o
		//		InputStream oin= getClass().getResourceAsStream("o.txt");
		//		DetaBufferedReader ocReader= new DetaBufferedReader(DetaInputStreamReader.E(oin));
		//		String octempString= null;
		//		while ((octempString= ocReader.readDetaLine()) != null) {
		//			if(octempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="o";
		//			}
		//		}
		//		ocReader.closeDeta();
		//		//read e
		//		InputStream ein= getClass().getResourceAsStream("e.txt");
		//		DetaBufferedReader ecReader= new DetaBufferedReader(DetaInputStreamReader.E(ein));
		//		String ectempString= null;
		//		while ((ectempString= ecReader.readDetaLine()) != null) {
		//			if(ectempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="e";
		//			}
		//		}
		//		ecReader.closeDeta();
		//		//read i
		//		InputStream iin= getClass().getResourceAsStream("i.txt");
		//		DetaBufferedReader icReader= new DetaBufferedReader(DetaInputStreamReader.E(iin));
		//		String ictempString= null;
		//		while ((ictempString= icReader.readDetaLine()) != null) {
		//			if(ictempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="i";
		//			}
		//		}
		//		icReader.closeDeta();
		//		//read u
		//		InputStream uin= getClass().getResourceAsStream("u.txt");
		//		DetaBufferedReader ucReader= new DetaBufferedReader(DetaInputStreamReader.E(uin));
		//		String uctempString= null;
		//		while ((uctempString= ucReader.readDetaLine()) != null) {
		//			if(uctempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="u";
		//			}
		//		}
		//		ucReader.closeDeta();
		//		if(rt.equals("no find in txt")) {
		//			rt=" "+cp;
		//			if(cache_bz.containsKey(cp)) {
		//				rt+="noise";
		//			}else {
		//				if(cache_sj.containsKey(cp)) {
		//					rt+="find";
		//				}else {
		//					cache_sj.put(cp, cp);
		//					rt+="add:";
		//				}
		//				rt+=cache_sj.size();
		//			}
		//		}
		//		jp3.paintvalue(rt);
		//		return rt;
	}
}
