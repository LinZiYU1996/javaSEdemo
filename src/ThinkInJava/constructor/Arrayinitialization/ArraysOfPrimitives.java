package ThinkInJava.constructor.Arrayinitialization;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:38 2019/4/29
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2;
        a2 = a1;
        for(int i = 0; i < a2.length; i++)
            a2[i] = a2[i] + 1;
        for(int i = 0; i < a1.length; i++)
            System.out.println("a1[" + i + "] = " + a1[i]);

        //可以看到代码中给出了al的初始值，但a2却没有1 在本例中，a2是在后面被赋给另一个数
        //组的。 由千a2和al是相同数组的别名，因此通过a2所做的修改在al中可以石到。


    }


}
