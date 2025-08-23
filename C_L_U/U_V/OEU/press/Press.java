package U_V.OEU.press;

//作者+ 著作权人： 罗瑶光, 浏阳, 
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Press {
    public void bitToRange() {
    }

    public static void main(String[] argv) {
        String input = "10110101000101001010101111110101000101001010010100"
            + "10100101010010101001010100100000000000101111111101010";
        //20230106-System.out.println(input);
        //20230106-System.out.println("");
        Node node = new Node();
        node.value = 1;
        //20230106-System.out.print("1");
        Node head = node.AOP_MVE_CSI_DUQ();
        for (int i = 1; i < input.length(); i++) {
            if ('1' == input.charAt(i)) {
                if (null == node.right) {
                    node.right = new Node();
                    node = node.right;
                    node.value = 1;
                    //20230106-System.out.print("1");
                } else {
                    node = node.right;
                    node.value = 1;
                    //20230106-System.out.print("1");
                }
            } else {
                if (null == node.left) {
                    node.left = new Node();
                    node = node.left;
                    node.value = 0;
                    //20230106-System.out.print("0");
                } else {
                    node = node.left;
                    node.value = 0;
                    //20230106-System.out.print("0");
                }
            }
        }
        //20230106-System.out.println("");
        for (int i = 0; i < 1; i++) {
            //20230106-System.out.println(output);
            //20230106-System.out.println(i);
            //20230106-System.out.println("");
            input = print(head.AOP_MVE_CSI_DUQ(), "");
            Node temp = new Node();
            temp.value = input.charAt(0) == '0' ? 0 : 1;
            //20230106-System.out.print(temp.value);
            head = temp.AOP_MVE_CSI_DUQ();
            for (int j = 1; j < input.length(); j++) {
                if ('1' == input.charAt(j)) {
                    if (null == temp.right) {
                        temp.right = new Node();
                        temp = temp.right;
                        temp.value = 1;
                        //20230106-System.out.print("1");
                    } else {
                        temp = temp.right;
                        temp.value = 1;
                        //20230106-System.out.print("1");
                    }
                } else {
                    if (null == temp.left) {
                        temp.left = new Node();
                        temp = temp.left;
                        temp.value = 0;
                        //20230106-System.out.print("0");
                    } else {
                        temp = temp.left;
                        temp.value = 0;
                        //20230106-System.out.print("0");
                    }
                }
            }
        }
        //print
//		printPrefix(head.AOP_MVE_CSI_DUQ());
//		//20230106-System.out.println("");
//		printInfix(head.AOP_MVE_CSI_DUQ());
//		//20230106-System.out.println("");
//		printBackfix(head.AOP_MVE_CSI_DUQ());
    }

    private static String print(Node head, String input) {
        //20230106-System.out.println("");
        input = printInfix(head.AOP_MVE_CSI_DUQ(), input);
        //20230106-System.out.println("");
        return input;
    }

    @SuppressWarnings("unused")
    private static void printBackfix(Node node) {
        if (node.left != null) {
            printBackfix(node.left.AOP_MVE_CSI_DUQ());
        }
        if (node.right != null) {
            printBackfix(node.right.AOP_MVE_CSI_DUQ());
        }
        //20230106-System.out.print(node.value);
    }

    private static String printInfix(Node node, String input) {
        if (node.left != null) {
            input = printInfix(node.left.AOP_MVE_CSI_DUQ(), input);
        }
        input += node.value;
        if (node.right != null) {
            input = printInfix(node.right.AOP_MVE_CSI_DUQ(), input);
        }
        return input;
    }

    @SuppressWarnings("unused")
    private static void printPrefix(Node node) {
        //20230106-System.out.print(node.value);
        if (node.left != null) {
            printPrefix(node.left.AOP_MVE_CSI_DUQ());
        }
        if (node.right != null) {
            printPrefix(node.right.AOP_MVE_CSI_DUQ());
        }
    }
}
