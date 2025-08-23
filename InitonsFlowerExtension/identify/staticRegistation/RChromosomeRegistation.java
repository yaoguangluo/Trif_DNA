package identify.staticRegistation;


import java.lang.reflect.Method;

//我在思考要不要开源，因为家外面有开始砰 砰。一种莫名的被恐吓的感觉。
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RChromosomeRegistation {
    /*test*/
    public void test() {

    }

    /*test1*/
    public void test1() {

    }

    //test
    public static void main(String[] argv) {
        System.out.println("1：" + RChromosomeRegistation.class);
        System.out.println("2：" + RChromosomeRegistation.class.getName());
        System.out.println("3：" + RChromosomeRegistation.class.getCanonicalName());
        System.out.println("4：" + RChromosomeRegistation.class.getPackage());
        System.out.println("5：" + RChromosomeRegistation.class.getSimpleName());
        System.out.println("6：" + RChromosomeRegistation.class.getTypeName());
        System.out.println("7：" + RChromosomeRegistation.class.toGenericString());
        Method[] method = RChromosomeRegistation.class.getDeclaredMethods();
        for (Method m : method) {
            System.out.println("-->" + m.getName());
            System.out.println("-->" + m.getAnnotations());
        }
    }
}