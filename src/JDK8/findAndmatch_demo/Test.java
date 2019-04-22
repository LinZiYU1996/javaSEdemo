package JDK8.findAndmatch_demo;


import JDK8.stream.demo1.Dish;
import JDK8.stream.screeningAndslicing.Data;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 9:51 2019/4/22
 **/
public class Test {


    public static void main(String[] args) {

        //检查谓词是否至少匹配一个元素
        //anyMatch方法可以回答“流中是否有一个元素能匹配给定的谓词”。比如，你可以用它来看
        //看菜单里面是否有素食可选择
        if (Data.menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vete .......");
        }


        System.out.println("============================================");



        //检查谓词是否匹配所有元素
        //allMatch方法的工作原理和anyMatch类似，但它会看看流中的元素是否都能匹配给定的谓词。
        //比如，你可以用它来看看菜品是否有利健康（即所有菜的热量都低于1000卡路里）：
        boolean isHealthy = Data.menu.stream().allMatch(d -> d.getCalories() < 1000);
        System.out.println(isHealthy);


        System.out.println("============================================");


        //noneMatch
        //和allMatch相对的是noneMatch。它可以确保流中没有任何元素与给定的谓词匹配。比如，
        //你可以用noneMatch重写前面的例子：
        boolean isHealthy_1 = Data.menu.stream().noneMatch(d -> d.getCalories() >= 1000);
        System.out.println(isHealthy_1);




        //anyMatch、allMatch和noneMatch这三个操作都用到了我们所谓的短路，这就是大家熟悉
        //的Java中&&和||运算符短路在流中的版本

        //短路求值
        //有些操作不需要处理整个流就能得到结果。例如，假设你需要对一个用and连起来的大布
        //尔表达式求值。不管表达式有多长，你只需找到一个表达式为false，就可以推断整个表达式
        //将返回false，所以用不着计算整个表达式。这就是短路。
        //对于流而言，某些操作（例如allMatch、anyMatch、noneMatch、findFirst和findAny）
        //不用处理整个流就能得到结果。只要找到一个元素，就可以有结果了。同样，limit也是一个
        //短路操作：它只需要创建一个给定大小的流，而用不着处理流中所有的元素。在碰到无限大小
        //的流的时候，这种操作就有用了：它们可以把无限流变成有限流。我们会在5.7节中介绍无限
        //流的例子。

    }


}
