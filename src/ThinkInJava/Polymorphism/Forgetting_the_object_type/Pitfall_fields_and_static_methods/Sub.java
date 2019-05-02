package ThinkInJava.Polymorphism.Forgetting_the_object_type.Pitfall_fields_and_static_methods;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:29 2019/5/2
 */
public class Sub extends Super{

    public int field = 1;
    public int getField() { return field; }
    public int getSuperField() { return super.field; }
}
