package ThinkInJava.Interfaces.Multiple_inheritance_in_Java.Name_collisions_when_combining_Interfaces;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:03 2019/5/2
 */
public class C4 extends C implements I3{

    // Identical, no problem:
    public int f() { return 1; }
}
//在打算组合的不同接口中使用相同的方法名通常会造成代码可读性的混乱，请尽量避免这种情况。

