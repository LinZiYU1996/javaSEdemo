package ThinkInJava.Inner_Classes.The_link_to_the_outer_class;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 当生成一个内部类的对象时， 此对象与制造它
 * 的外围对 象(enclosing object) 之间就有了一种联系， 所以它能访问其外围
 * 对象的所有成员， 而不需要任何特殊条件。此外， 内部类
 * 还拥有其外围类的所有元素的访问权
 * @Date: Create in 10:13 2019/5/6
 */
public class Sequence {

    private Object[] items;

    private int next = 0;

    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }


    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }


    public Selector selector() {
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }


    //equence类只是一个固定大小的Ob.feet的数组，以类的形式包装了起来。 可以调用add()在
    //序列末增加新的Object(只要还有空间）。要获取Sequence中的每一个对象，可以使用Selector
    // 接口。这是＂迭代器”设计模式的一个例子，在本书稍后的部分将更多地学习它。Selector允许
    //你检查序列是否到末尾了(end()),访问当前对象(current()), 以及移到序列中的下一个对象 (next())。
    // 因为Selector是一个接口，所以别的类可以按它们自己的方式来实现这个接口，井且
    //另的方法能以此接口为参数，来生成更加通用的代码。
    //这里，SequenceSelector是提供Selector功能的private类。 可以看到，在main()中创建了一 个Sequence,
    // 并向其中添加了一些String对象。 然后通过调用selector()获取一个Selector, 并用
    //它在Sequence中移动和选择每一个元素。
    //最初看到SequenceSelector,可能会觉得它只不过是另一个内部类罢了。但请仔细观察它，
    //注意方法end()current()和next()都用到了objects,这是一个引用，它并不是SequenceSelector
    //、
    //的一部分，而是外围类中的一个private字段。 然而内部类可以访问其外围类的方法和字段，就
    //像自己拥有它们似的， 这带来了很大的方便，就如前面的例子所示。
    //所以内部类自动拥有对其外围类所有成员的访问权。 这是如何做到的呢？当某个外围类的
    //对象创建了一个内部类对象时，此内部类对象必定会秘密地捕获一个指向那个外围类对象的引用。 然
    // 后，在你访问此外围类的成员时，就是用那个引用来选择外围类的成员。 幸运的是，编译器会帮你处理所有的细节，但你现在可以看到：
    // 内部类的对象只能在与其外围类的对象相关联的情况下才能被创建（就像你应该看到的，在内部类是非static类时）。 构建内部类对象时，


}
