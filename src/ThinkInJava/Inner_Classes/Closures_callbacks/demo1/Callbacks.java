package ThinkInJava.Inner_Classes.Closures_callbacks.demo1;

/**
 * @Author: Mr.Lin
 *
 *
 * 这个例子进一
 * Callee! 是简单的解决方式。Callee2继承自Mylncrement,后者已经有了
 *
 * 方法，并且与Incrementable接口期望的increment()方法完全不相关。所
 * 以如果Callee2继承了 My Increment, 就不能为了Incrementable的用途而覆盖increment()方法，
 * 千是只能使用内部类独立地实现Incrementable。还要注意，当创建了一个内部类时
 * ，并没有在外围类的接口中添加东西，也没有修改外围类的接口。
 *
 *
 * 注意，在Callee2中除了getCallbackReference()以外，
 * 其他成员都是private的。要想建立与外部世界的任何连接，
 * interfaceIncrementable都是必需的。在这里可以看到，
 * interface是如何允许接口与接口的实现完全独立的．
 * 内部类Closure实现了lncrementable,以提供一个返回Callee2的
 * ＂钓子"(hook)一而且是一个安全的钓子。无论谁获得此Incrementable的引用，
 * 都只能调用increment(),除此之外没有其他功能（不像指针那样，允许你做很多事情）。
 * Caller的构造器需要一个lncrementable的引用作为参数（虽然可以在任意时刻捕获回调引用）
 * ，然后在以后的某个时刻，C􀀷ller对象可以使用此引用回调Callee类。
 *
 *
 *
 *
 *
 * @Date: Create in 17:54 2019/5/16
 */
public class Callbacks {

    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }



}
