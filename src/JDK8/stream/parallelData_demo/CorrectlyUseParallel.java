package JDK8.stream.parallelData_demo;


import java.util.stream.LongStream;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 10:22 2019/4/24
 **/
public class CorrectlyUseParallel {


    public static class Accumulator{
        public long total = 0;

        public void add(long value){
            total += value;
        }
    }


    //。下面是另一种实
    //现对前n个自然数求和的方法，但这会改变一个共享累加器
    public static long sideSum(long n){
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1,n).forEach(accumulator::add);
        return accumulator.total;

        //这种代码非常普遍，特别是对那些熟悉指令式编程范式的程序员来说。这段代码和你习惯的
        //那种指令式迭代数字列表的方式很像：初始化一个累加器，一个个遍历列表中的元素，把它们和
        //累加器相加。
        //那这种代码又有什么问题呢？不幸的是，它真的无可救药，因为它在本质上就是顺序的。每
        //次访问total都会出现数据竞争。如果你尝试用同步来修复，那就完全失去并行的意义了
    }


    public static void main(String[] args) {



    }



}
