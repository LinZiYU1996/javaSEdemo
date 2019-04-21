package JDK8.lambda_demo.Functional_interface.consumer_demo;


import java.util.Arrays;
import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * java.util.function.Consumer<T>定义了一个名叫accept的抽象方法，它接受泛型T
的对象，没有返回（void）。你如果需要访问类型T的对象，并对其执行某些操作，就可以使用
这个接口。比如，你可以用它来创建一个forEach方法，接受一个Integers的列表，并对其中
每个元素执行操作。在下面的代码中，你就可以使用这个forEach方法，并配合Lambda来打印
列表中的所有元素。
*
*
 * @Date 19:47 2019/4/21
 **/
public class Test {

    public static <T> void forEach(List<T> list, Consumer<T> c){
        for(T i: list){
            c.accept(i);
        }
    }

    public static void main(String[] args) {
        forEach(
                Arrays.asList(1,2,3,4,5),
                (Integer i) -> System.out.println(i)
        );
    }


}
