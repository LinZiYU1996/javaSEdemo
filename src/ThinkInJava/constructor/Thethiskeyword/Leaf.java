package ThinkInJava.constructor.Thethiskeyword;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:34 2019/4/29
 */
public class Leaf {

    int i = 0;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }
    public static void main(String[] args) {
        Leaf x = new Leaf();

        //由于increment（）通过this关键字返回了当前对象的引用，所以可以一条语句对
        //同一个对象执行多次操作
        x.increment().increment().increment().print();
    }

}
