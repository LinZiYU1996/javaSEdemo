package ThinkInJava.Polymorphism.Forgetting_the_object_type.Pitfall_fields_and_static_methods;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:29 2019/5/2
 */
public class FieldAccess {

    public static void main(String[] args) {

        Super sup = new Sub(); // Upcast

        System.out.println("sup.field = " + sup.field +
                ", sup.getField() = " + sup.getField());

        Sub sub = new Sub();

        System.out.println("sub.field = " +
                sub.field + ", sub.getField() = " +
                sub.getField() +
                ", sub.getSuperField() = " +
                sub.getSuperField());



        //当Sub对象转型为Super引用时，任何域访问操作都将由编译器解析，因此不是多态的。在
        //本例中，为Super.field和Sub.field分配了不同的存储空间。这样，Sub实际上包含两个称为field
        //的域：它自己的和它从Super处得到的。然而，在引用Sub中的压Id时所产生的默认域井非Super臣汀 版本的酝Id域。因此，为了得到Super.field,必须显式地指明super.field。
    }
}
