package ThinkInJava.Polymorphism.Forgetting_the_object_type;

import ThinkInJava.Polymorphism.demo1.Note;
import ThinkInJava.Polymorphism.demo1.Wind;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:36 2019/4/30
 */
public class Music2 {

    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }


    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }


    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }



    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // No upcasting
        tune(violin);
        tune(frenchHorn);


        //有一个主要缺点：必须为添加的每一个新Instrument类编写特定类型的

        //方法。这意味着在开始时就需要更多的编程，
        // 这也意味若如果以后想添加类似tune()的新方法
        // ，或者添加自Instrument导出的新类，仍需要做大批的工作。
        // 此外，如果我们忘记重载某个方法，荨编译器不会返回任何错误信息，这样关于类型的整个处理过程就变得难以操纵。

    }


}
