package ThinkInJava.constructor.staticdatainitialization;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 无论创建多少个对象，静态数据都只占用一份存储区域。static关键字不能应用局部变量
 * 此它只能作用与域。如果一个域是静态的基本类型域，且也没有对它进行初始化，
 * 那么它就会获得基本类型的标准初值1如果它是一个对象引用，那么它的默认初始化值就是null
 * @Date: Create in 21:12 2019/4/29
 */
public class StaticInitialization {

    public static void main(String[] args) {
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

}
