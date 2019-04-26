package JDK8.functionalProgramingSkills.delayCalculationStream.action;


import java.util.stream.IntStream;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 生成质数的例子
 *
 * @Date 18:07 2019/4/26
 **/
public class Demo {

    //Stream应该实时地筛选掉那些能被质数整除的数字。这听起来有些异想天开，
    //不过我们一起看看怎样才能达到这样的效果。
    //(1) 你需要一个由数字构成的Stream，你会在其中选择质数。
    //(2) 你会从该Stream中取出第一个数字（即Stream的首元素），它是一个质数（初始时，这个
    //值是2）。
    //(3) 紧接着你会从Stream的尾部开始，筛选掉所有能被该数字整除的元素。
    //(4) 最后剩下的结果就是新的Stream，你会继续用它进行质数的查找。本质上，你还会回到
    //第一步，继续进行后续的操作，所以这个算法是递归的


    // 第一步： 构造由数字组成的Stream
    //你可以使用方法IntStream.iterate构造由数字组成的Stream，它由2开始，可以上达无限，


    public static IntStream numbers(){
        return IntStream.iterate(2, n -> n + 1);
    }


    // 第二步： 取得首元素
    //IntStream类提供了方法findFirst，可以返回Stream的第一个元素

    public static int head(IntStream numbers){
        return numbers.findFirst().getAsInt();
    }

    //第三步： 对尾部元素进行筛选
    //定义一个方法取得Stream的尾部元素：


    public static IntStream tail(IntStream numbers){
        return numbers.skip(1);
    }

    //第四步：递归地创建由质数组成的Stream
    //现在到了最复杂的部分。你可能试图将筛选返回的Stream作为参数再次传递给该方法，这样
    //你可以接着取得它的头元素，继续筛选掉更多的数字

    public static IntStream primes(IntStream numbers) {
        int head = head(numbers);
        return IntStream.concat(
                IntStream.of(head),
                primes(tail(numbers).filter(n -> n % head != 0))
        );
    }


    //如果执行步骤四中的代码，你会遭遇如下这个错误：“java.lang.IllegalStateException:
    //stream has already been operated upon or closed.”实际上，你正试图使用两个终端操作：findFirst
    //和skip将Stream切分成头尾两部分。一旦你对Stream执行
    //一次终端操作调用，它就永久地终止了！


    //除此之外，该操作还附带着一个更为严重的问题： 静态方法IntStream.concat接受两个
    //Stream实例作参数。但是，由于第二个参数是primes方法的直接递归调用，最终会导致出现无
    //限递归的状况。然而，对大多数的Java应用而言，Java 8在Stream上的这一限制，即“不允许递归
    //定义”是完全没有影响的，使用Stream后，数据库的查询更加直观了，程序还具备了并发的能力










}
