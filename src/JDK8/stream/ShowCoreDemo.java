package JDK8.stream;


import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 元素序列——就像集合一样，流也提供了一个接口，可以访问特定元素类型的一组有序
值。因为集合是数据结构，所以它的主要目的是以特定的时间/空间复杂度存储和访问元
素（如ArrayList 与 LinkedList）。但流的目的在于表达计算，比如你前面见到的
filter、sorted和map。集合讲的是数据，流讲的是计算。我们会在后面几节中详细解
释这个思想。
 源——流会使用一个提供数据的源，如集合、数组或输入/输出资源。 请注意，从有序集
合生成流时会保留原有的顺序。由列表生成的流，其元素顺序与列表一致。
 数据处理操作——流的数据处理功能支持类似于数据库的操作，以及函数式编程语言中
的常用操作，如filter、map、reduce、find、match、sort等。流操作可以顺序执
行，也可并行执行。
此外，流操作有两个重要的特点。
 流水线——很多流操作本身会返回一个流，这样多个操作就可以链接起来，形成一个大
的流水线。这让我们下一章中的一些优化成为可能，如延迟和短路。流水线的操作可以
看作对数据源进行数据库式查询。
 内部迭代——与使用迭代器显式迭代的集合不同，流的迭代操作是在背后进行的。我们
在第1章中简要地提到了这个思想，下一节会再谈到它。
让我们来看一段能够体现所有这些概念的代码：
 * @Date 21:10 2019/4/21
 **/
public class ShowCoreDemo {

    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();
        List<String> threeHighCaloricDishNames =
                menu.stream()  //  从menu获得流（菜肴列表）

                        .filter(d -> d.getCalory() > 300) //首先选出高热量的菜肴

                        .map(Dish::getName)  //获取菜名

                        .limit(3)  //只选择 头三个

                        .collect(toList());  //将结果保存在另一 个List中

        System.out.println(threeHighCaloricDishNames);

        //在本例中，我们先是对menu调用stream方法，由菜单得到一个流。数据源是菜肴列表（菜
        //单），它给流提供一个元素序列。接下来，对流应用一系列数据处理操作：filter、map、limit
        //和collect。除了collect之外，所有这些操作都会返回另一个流，这样它们就可以接成一条流
        //水线，于是就可以看作对源的一个查询。最后，collect操作开始处理流水线，并返回结果（它
        //和别的操作不一样，因为它返回的不是流，在这里是一个List）。在调用collect之前，没有任
        //何结果产生，实际上根本就没有从menu里选择元素。你可以这么理解：链中的方法调用都在排
        //队等待，直到调用collect


        // filter——接受Lambda，从流中排除某些元素。在本例中，通过传递lambda d ->
        //d.getCalories() > 300，选择出热量超过300卡路里的菜肴。
        // map——接受一个Lambda，将元素转换成其他形式或提取信息。在本例中，通过传递方
        //法引用Dish::getName，相当于Lambda d -> d.getName()，提取了每道菜的菜名。
        // limit——截断流，使其元素不超过给定数量。
        // collect——将流转换为其他形式。在本例中，流被转换为一个列表。它看起来有点儿
        //像变魔术，我们在第6章中会详细解释collect的工作原理。现在，你可以把collect看
        //作能够接受各种方案作为参数，并将流中的元素累积成为一个汇总结果的操作。这里的
        //toList()就是将流转换为列表的方案
    }

}
