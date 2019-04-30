package ThinkInJava.ReusingClasses.The_inal_keyword.final_classes;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 当将某个类的整体定义为final时（通过将关键字final置于它的定义之前），就表明了你不打
 *继承该类，而且也不允许别人这样做。换句话说，出于某种考虑，你对该类的设计永不需要做任何变动，或者出千安全的考虑，你不希望它有子类。
 *
 * @Date: Create in 20:27 2019/4/30
 */
public final class Dinosaur {


    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() {}



}
