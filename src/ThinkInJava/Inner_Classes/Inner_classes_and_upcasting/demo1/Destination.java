package ThinkInJava.Inner_Classes.Inner_classes_and_upcasting.demo1;


//当将内部类向上转型为其基类，尤其是转型为一个接口的时候，内部类就有了用武之地。
//（从实现了某个接口的对象，得到对此接口的引用，与向上转型为这个对象的基类，实质上效果
//这是因为此内部类一某个接口的实现一能够完全不可见，并且不可用。
// 的只是指向基类或接口的引用，所以能够很方便地隐藏实现细节。
public interface Destination {

    String readLabel();


}
