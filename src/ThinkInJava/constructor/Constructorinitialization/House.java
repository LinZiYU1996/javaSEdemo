package ThinkInJava.constructor.Constructorinitialization;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 在类的内部，变量定义的先后顺序决定了初始化的顺序。即使变量定义散布于方法定义之间，它们仍旧会在任何方法（包括构造器）被调用之前得到初始化
 *
 *
 *
 * @Date: Create in 21:08 2019/4/29
 */
public class House {
    Window w1 = new Window(1); // Before constructor
    House() {
        // Show that we’re in the constructor:
        System.out.println("House()");
        w3 = new Window(33); // Reinitialize w3
    }
    Window w2 = new Window(2); // After constructor
    void f() { System.out.println("f()"); }
    Window w3 = new Window(3); // At end
}



