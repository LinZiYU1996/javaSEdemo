package JDK8.numericalFlow_demo;


import JDK8.stream.demo1.Dish;
import JDK8.stream.screeningAndslicing.Data;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 16:49 2019/4/22
 **/
public class Test {

    public static void main(String[] args) {

        //可以使用reduce方法计算流中元素的总和。例如，你可以像下面这样计
        //算菜单的热量
        int calories = Data.menu.stream()
                .map(Dish::getCalories)
                .reduce(0,Integer::sum);
        System.out.println(calories);

        //这段代码的问题是，它有一个暗含的装箱成本。每个Integer都必须拆箱成一个原始类型，
        //再进行求和。要是可以直接像下面这样调用sum方法，岂不是更好？

        //但这是不可能的。问题在于map方法会生成一个Stream<T>。虽然流中的元素是Integer类
        //型，但Streams接口没有定义sum方法。为什么没有呢？比方说，你只有一个像menu那样的
        //Stream<Dish>，把各种菜加起来是没有任何意义的。但不要担心，Stream API还提供了原始类
        //型流特化，专门支持处理数值流的方法



        // 映射到数值流
        //将流转换为特化版本的常用方法是mapToInt、mapToDouble和mapToLong。这些方法和前
        //面说的map方法的工作方式一样，只是它们返回的是一个特化流，而不是Stream<T>。例如，你
        //可以像下面这样用mapToInt对menu中的卡路里求和：

        int calories_1 = Data.menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println(calories_1);

        //这里，mapToInt会从每道菜中提取热量（用一个Integer表示），并返回一个IntStream
        //（而不是一个Stream<Integer>）。然后你就可以调用IntStream接口中定义的sum方法，对卡
        //路里求和了！请注意，如果流是空的，sum默认返回0。IntStream还支持其他的方便方法，如
        //max、min、average等。


        //转换回对象流
        //同样，一旦有了数值流，你可能会想把它转换回非特化流。例如，IntStream上的操作只能
        //产生原始整数： IntStream 的 map 操作接受的 Lambda 必须接受 int 并返回 int （一个
        //IntUnaryOperator）。但是你可能想要生成另一类值，比如Dish。为此，你需要访问Stream
        //接口中定义的那些更广义的操作。要把原始流转换成一般流（每个int都会装箱成一个
        //Integer），可以使用boxed方法，如下所示


        IntStream intStream = Data.menu.stream().mapToInt(Dish::getCalories);
        Stream<Integer> stream = intStream.boxed();


        //默认值OptionalInt
        //求和的那个例子很容易，因为它有一个默认值：0。但是，如果你要计算IntStream中的最
        //大元素，就得换个法子了，因为0是错误的结果。如何区分没有元素的流和最大值真的是0的流呢？
        //前面我们介绍了Optional类，这是一个可以表示值存在或不存在的容器。Optional可以用
        //Integer、String等参考类型来参数化。对于三种原始流特化，也分别有一个Optional原始类
        //型特化版本：OptionalInt、OptionalDouble和OptionalLong。
        //例如，要找到IntStream中的最大元素，可以调用max方法，它会返回一个OptionalInt：

        OptionalInt maxCalories = Data.menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
        System.out.println(maxCalories);

        //现在，如果没有最大值的话，你就可以显式处理OptionalInt去定义一个默认值了：
        int max = maxCalories.orElse(1);  //如果没有最大值的话，显式提供一个默认最大值

        //数值范围
        //和数字打交道时，有一个常用的东西就是数值范围。比如，假设你想要生成1和100之间的所
        //有数字。Java 8引入了两个可以用于IntStream和LongStream的静态方法，帮助生成这种范围：
        //range和rangeClosed。这两个方法都是第一个参数接受起始值，第二个参数接受结束值。但
        //range是不包含结束值的，而rangeClosed则包含结束值。让我们来看一个例子：

        IntStream evenNumbers = IntStream
                .rangeClosed(1, 100)//表示范围[1, 100]
                .filter(n -> n % 2 == 0); //一个从1到100的偶数流
        System.out.println(evenNumbers.count());//从 1 到 100 有50个偶数


        //这里我们用了rangeClosed方法来生成1到100之间的所有数字。它会产生一个流，然后你
        //可以链接filter方法，只选出偶数。到目前为止还没有进行任何计算。最后，你对生成的流调
        //用count。因为count是一个终端操作，所以它会处理流，并返回结果50，这正是1到100（包括
        //两端）中所有偶数的个数。请注意，比较一下，如果改用IntStream.range(1, 100)，则结果
        //将会是49个偶数，因为range是不包含结束值的。



























    }


}
