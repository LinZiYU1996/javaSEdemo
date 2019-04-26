package JDK8.functionalProgramingSkills.delayCalculationStream.action;


import java.util.function.Predicate;
import java.util.function.Supplier;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 对这个类进行改造，使其符合延迟列表的思想，最简单的方法是避免让tail立刻出现在内
   存中，提供一个Supplier<T>方法（你也可以将其看成一个使用函数描述符
   void -> T的工厂方法），它会产生列表的下一个节点
 *
 * @Date 18:29 2019/4/26
 **/
public class LazyList<T> implements MyList<T> {


    final T head;
    final Supplier<MyList<T>> tail;
    public LazyList(T head, Supplier<MyList<T>> tail) {
        this.head = head;
        this.tail = tail;
    }
    public T head() {
        return head;
    }

    //注意，与前面的head不同，这
    //里tail使用了一个Supplier
    //方法提供了延迟性
    public MyList<T> tail() {
        return tail.get();

        //调用Supplier的get方法会触发延迟列表（LazyList）的节点创建，就像工厂会创建新的
        //对象一样
    }
    public boolean isEmpty() {
        return false;
    }

    //像下面那样传递一个Supplier作为LazyList的构造器的tail参数，创建由
    //数字构成的无限延迟列表了，该方法会创建一系列数字中的下一个元素

    public static LazyList<Integer> from(int n) {
        return new LazyList<Integer>(n, () -> from(n+1));
    }

    public MyList<T> filter(Predicate<T> p) {
        return isEmpty() ?
                this :
                p.test(head()) ?
                        new LazyList<>(head(), () -> tail().filter(p)) :
                        tail().filter(p);
    }


    //利用我们目前已经做的去生成一个自定义的质数延迟列表（有些时候，你会遭遇
    //无法使用Stream API的情况）。如果你将之前使用Stream API的代码转换成使用我们新版的
    //LazyList

    public static MyList<Integer> primes(MyList<Integer> numbers) {
        return new LazyList<>(
                numbers.head(),
                () -> primes(
                        numbers.tail()
                                .filter(n -> n % numbers.head() != 0)
                )
        );
    }


    public static void main(String[] args) {
        LazyList<Integer> lazyList = from(2);
        int two = primes(lazyList).head();
        int three = primes(lazyList).tail().head();
        int five = primes(lazyList).tail().tail().head();

        System.out.println(two + "   " + three + "    " + five);

    }







}
