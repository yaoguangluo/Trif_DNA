package S_A.linePage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 个人著作权人 ，作者 -DNA十六元基之父-罗瑶光, 浏阳
 * 既然入我元基门，就得遵守我门规仅一条-->读书每天要做笔记, 无论多少，有心即可。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
/*
 * --DNA16元基字符催化编码表--的一个真实环境下的使用例子。
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * VSEDIDIXXOMCIDYIUMASSVSAIH
 * SIDCVOHQSIVIMTQQDSEQUUDXUM
 * */
public class StringInitonEncoding{
	public List<String> parserList;
	public char[] En   = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N'
		,'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public char[] PDE1 = {'V','S','E','D','I','D','I','X','X','O','M','C','I','D'
		,'Y','I','U','M','A','S','S','V','S','A','I','H'};
	public char[] PDE2 = {'S','I','D','C','V','O','H','Q','S','I','V','I','M','T'
		,'Q','Q','D','S','E','Q','U','U','D','X','U','M'};
	public static void main(String[] argv) {
		StringInitonEncoding stringInitonEncoding = new StringInitonEncoding();
		stringInitonEncoding.parserList = new ArrayList<>();
		String string = "aaaabbbccc";
		System.out.println("输入->" + string);
		//test1 aaabbbccc-a bc
		//test2 aaabbbccc-abc
		//test3 aaabbbccc-ab c
		//test4 aaabbbccc-a b c
		stringInitonEncoding.doStringParser(string.toCharArray());
		Iterator<String> iterator = stringInitonEncoding.parserList.iterator();
		while(iterator.hasNext()) {
			String en = iterator.next();
			System.out.println("缩进->" + en);
			en = en.toUpperCase();
			String encodingPDE = stringInitonEncoding.doEncodingPDE(en.toCharArray());
			System.out.println("PDE->" + encodingPDE);
			// 之后可接PDE计算逻辑
			// to do。。。 比如 执行 RangePDITest 来优化这个PDE key
		}
	}
	private String doEncodingPDE(char[] en) {
		StringBuilder encodingPDE = new StringBuilder();
		for(int i = 0; i < en.length; i++) {
			char fix = en[i];
			for(int j = 0; j < En.length; j++) {
				if(En[j] == fix) {
					encodingPDE.append(PDE1[j]);
					encodingPDE.append(PDE2[j]);
				}
			}
		}
		return encodingPDE.toString();
	}
	
	private void doStringParser(char[] string) {
		StringBuilder stringBuilder = new StringBuilder();
		char fix;
		for(int i = 0; i < string.length; i++) {
			fix = string[i];
			stringBuilder.append(fix);
			int j = ++i;
			while(j< string.length && string[j] == fix) {
				j++;
			}
			i = --j;
		}
		parserList.add(stringBuilder.toString());
	}
}
//输入->aaaabbbccc
//缩进->abc
//PDE->VSSIED
