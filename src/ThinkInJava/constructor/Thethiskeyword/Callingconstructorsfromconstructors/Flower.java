package ThinkInJava.constructor.Thethiskeyword.Callingconstructorsfromconstructors;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * 可能为一个类写了多个构造器，有时可能想在一个构造器中调用另一个构造器，以避免重
 * 复代码。可用this关键字做到这一点．
 *
 * 通常写this的时候，都是指“这个对象”或者”当前对象”，而且它本身表示对当前对象的
 * 引用。在构造器中，如果为this添加了参数列表，那么就有了不同的含义。这将产生对符合此参匝回 数列表的某个构造器的明确调用
 *
 *
 * @Date: Create in 20:42 2019/4/29
 */
public class Flower {

    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println();
        System.out.println("Constructor w/ int arg only, petalCount= "
                + petalCount);
    }


    Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }



    Flower(String s, int petals) {
        this(petals);
//! this(s); // Can’t call two!
        this.s = s; // Another use of "this"
        System.out.println("String & int args");
    }


    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }


    void printlnPetalCount() {
//! this(11); // Not inside non-constructor!
        System.out.println("petalCount = " + petalCount + " s = "+ s);
    }


    public static void main(String[] args) {
        Flower x = new Flower();

        x.printlnPetalCount();

        //构造器Flower(String s扭t petals)表明：尽管可以用this调用一个构造器，但却不能调用两个。 此外，必须将构造器调用置于最起始处，否则编译器会报错。
        //这个例子也展示了this的另一种用法。 由千参数s的名称和数据成员s的名字相同，所以会产生歧义。使用this.s来代表数据成员就能解决这个问题。



    }


}
