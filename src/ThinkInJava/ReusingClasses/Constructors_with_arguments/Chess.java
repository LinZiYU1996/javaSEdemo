package ThinkInJava.ReusingClasses.Constructors_with_arguments;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 如果没有默认的基类构造器， 或者想调用一个带参数的基类构造器， 就必须用关键字super显式地编写调用基类构造器的语句， 并且配以适当的参数列表：
 *
 *
 * @Date: Create in 16:48 2019/4/30
 */
public class Chess extends BoardGame{


    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
