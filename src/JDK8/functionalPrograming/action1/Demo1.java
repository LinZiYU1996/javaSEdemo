package JDK8.functionalPrograming.action1;


import java.util.stream.LongStream;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 一个经典的教学问题是用迭
  代的方式或者递归的方式（假设输入值大于1）编写一个计算阶乘的函数（参数为正数），
 * @Date 17:27 2019/4/26
 **/
public class Demo1 {

    //迭代式的阶乘计算

    public static int factorialIterative(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
        return r;
    }

    //递归式的阶乘计算

    public static long factorialRecursive(long n) {
        return n == 1 ? 1 : n * factorialRecursive(n-1);
    }


    //基于Stream的阶乘

    public static long factorialStreams(long n){
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long a, long b) -> a * b);

        //作为Java的用户，相信你已经意识到函数式程序的狂热支持
        //者们总是会告诉你说，应该使用递归，摒弃迭代。然而，通常而言，执行一次递归式方法调用的
        //开销要比迭代执行单一机器级的分支指令大不少。为什么呢？每次执行factorialRecursive
        //方法调用都会在调用栈上创建一个新的栈帧，用于保存每个方法调用的状态（即它需要进行的乘
        //法运算），这个操作会一直指导程序运行直到结束。这意味着你的递归迭代方法会依据它接收的
        //输入成比例地消耗内存。这也是为什么如果你使用一个大型输入执行factorialRecursive方
        //法，很容易遭遇StackOverflowError异常：
        //Exception in thread "main" java.lang.StackOverflowError
        //这是否意味着递归百无一用呢？当然不是！函数式语言提供了一种方法解决这一问题：尾
        //调优化（tail-call optimization）。基本的思想是你可以编写阶乘的一个迭代定义，不过迭代调用发
        //生在函数的最后（所以我们说调用发生在尾部）。这种新型的迭代调用经过优化后执行的速度快
        //很多
    }


    //基于“尾递”的阶乘

    public static long factorialTailRecursive(long n) {
        return factorialHelper(1, n);
    }

    public static long factorialHelper(long acc, long n) {
        return n == 1 ? acc : factorialHelper(acc * n, n-1);
    }

    //方法factorialHelper属于“尾递”类型的函数，原因是递归调用发生在方法的最后。对
    //比我们前文中factorialRecursive方法的定义，这个方法的最后一个操作是乘以n，从而得到
    //递归调用的结果


    //这种形式的递归是非常有意义的，现在我们不需要在不同的栈帧上保存每次递归计算的中间
    //值，编译器能够自行决定复用某个栈帧进行计算。实际上，在factorialHelper的定义中，立
    //即数（阶乘计算的中间结果）直接作为参数传递给了该方法。再也不用为每个递归调用分配单独
    //的栈帧用于跟踪每次递归调用的中间值——通过方法的参数能够直接访问这些值。















}
