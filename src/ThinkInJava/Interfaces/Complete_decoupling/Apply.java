package ThinkInJava.Interfaces.Complete_decoupling;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:40 2019/5/2
 */
public class Apply {

    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
    public static String s =
            "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }


    //Apply.processO方法可以接受任何类型的Processor, 并将其应用到一个Object对象上，
    // 然后打印结果。 像本例这样，创建一个能够根据所传递的参数对象的不同而具有不同行为的方法，
    // 被称为策略设计模式。 这类方法包含所要执行的算法中固定不变的部分， 而 “策略” 包含变化的部分。
    // 策略就是传递进去的参数对象， 它包含要执行的代码。 这里，Process9r对象就是一个 策略，在mainO中可以看到有
    // 三种不同类型的策略应用到了String类型的s对象上。
    //splitO方法是String类的一部分，它接受String类型的对象，并以传递进来的参数作为边界， 将该String对象分隔开，
    // 然后返回一个数组String[]。它在这里被用来当作创建String数组的快捷方式。





}
