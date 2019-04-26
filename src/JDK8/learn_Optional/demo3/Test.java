package JDK8.learn_Optional.demo3;


import java.util.HashMap;
import java.util.Optional;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 10:53 2019/4/26
 **/
public class Test {


    //异常与 Optional 的对比

    //静态方法Integer.parseInt(String)，将
    //String转换为int。在这个例子中，如果String无法解析到对应的整型，该方法就抛出一个
    //NumberFormatException。最后的效果是，发生String无法转换为int时，代码发出一个遭遇
    //非法参数的信号，唯一的不同是，这次你需要使用try/catch 语句，而不是使用if条件判断来
    //控制一个变量的值是否非空。


    //将String转换为Integer，并返回一个Optional对象
    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));  //如果String能转换为对应的Integer，将其封装 在Optioal对象中返回
        } catch (NumberFormatException e) {
            return Optional.empty();  //否则返回一个空的Optional对象
        }
    }



    public static void main(String[] args) {

        //如果Map中不含指定的键对应的值，它的get方法会返回一个null。但
        //是，正如我们之前介绍的，大多数情况下，你可能希望这些方法能返回一个Optional对象。你
        //无法修改这些方法的签名，但是你很容易用Optional对这些方法的返回值进行封装。我们接着
        //用Map做例子，假设你有一个Map<String, Object>方法，访问由key索引的值时，如果map
        //中没有与key关联的值，该次调用就会返回一个null。

        HashMap<String,String> hashMap = new HashMap<>();

        Object value = hashMap.get("key");


        //使用Optional封装map的返回值，你可以对这段代码进行优化。要达到这个目的有两种方
        //式：你可以使用笨拙的if-then-else判断语句，毫无疑问这种方式会增加代码的复杂度；或者
        //你可以采用我们前文介绍的Optional.ofNullable方法

        Optional<Object> values = Optional.ofNullable(hashMap.get("key"));


        //每次你希望安全地对潜在为null的对象进行转换，将其替换为Optional对象时，都可以考
        //虑使用这种方法。


        System.out.println("=============================================");









    }

}
