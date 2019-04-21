package JDK8.lambda_demo.Functional_interface.predicate_demo;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * java.util.function.Predicate<T>接口定义了一个名叫test的抽象方法，它接受泛型
T对象，并返回一个boolean。这恰恰和你先前创建的一样，现在就可以直接使用了。在你需要
表示一个涉及类型T的布尔表达式时，就可以使用这个接口。比如，你可以定义一个接受String
对象的Lambda表达式
 *
 * @Date 19:43 2019/4/21
 **/
public interface Predicate<T> {

    boolean test(T t);
}
