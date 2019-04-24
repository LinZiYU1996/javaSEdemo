package JDK8.stream.branchMerge_demo.分支;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 10:33 2019/4/24
 **/
public class ForkJoinSumCalculator extends RecursiveTask<Long> {//继 承 RecursiveTask 来创建可以用 于分支/合并 框架的任务

    private final long[] numbers;  //要求和的数组

    private final int start ; //子任务处理的数组 的起始和终止位置
    private final int end ;

    public static final long THRESHOLD = 10_000;  //不再将任务分解为子任务的 数组大小

    public ForkJoinSumCalculator(long[] numbers) {//公共构造函数用于 创建主任 务
        this(numbers,0,numbers.length);
    }

    private ForkJoinSumCalculator(long[] numbers, int start, int end) {//私有构造函数用于以递归方式为主任务创建子 任务
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }


    @Override
    protected Long compute() {
        int length = end - start;  //该任务负责求和的 部分的大 小

        if (length <= THRESHOLD) {
            return computeSequentially(); //如果大小小于或等于阈值，顺 序计算结果
        }


        //创建一个子任
        //务来为数组的
        //前一半求和
        ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers,start,start + length / 2);
        leftTask.fork(); //利用另一个ForkJoinPool 线程异步执行新 创建的子任务

        //创建一个任务
        //为数组的后一
        //半求和
        ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers,start + length / 2 ,end);
        Long right = rightTask.compute(); //同步执行第二个子任务，有可能允许进 一步递归划分
        Long left = leftTask.join(); //读取第一个子任务的结果，如果尚未完成就等待
        return right + left; //该任务的结果是两个子任务结果的组合
    }


    //在子任
    //务不再
    //可分时
    //计算结
    //果的简
    //单算法
    private long computeSequentially(){
        long sum = 0;
        for (int i = start; i < end ; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    //现在编写一个方法来并行对前n个自然数求和就很简单了。你只需把想要的数字数组传给
    //ForkJoinSumCalculator的构造函数
    public static long forkJoinSum(long n){
        long[] numbers = LongStream.rangeClosed(1,n).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
        //这里用了一个LongStream来生成包含前n个自然数的数组，然后创建一个ForkJoinTask
        //（RecursiveTask的父类），并把数组传递给ForkJoinSumCalculator的公共
        //构造函数。最后，你创建了一个新的ForkJoinPool，并把任务传给它的调用方法 。在
        //ForkJoinPool中执行时，最后一个方法返回的值就是ForkJoinSumCalculator类定义的任务
        //结果
    }



}
