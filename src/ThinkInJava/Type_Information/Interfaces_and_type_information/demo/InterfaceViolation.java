package ThinkInJava.Type_Information.Interfaces_and_type_information.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * interface关键字的一种重要目标就是允许程序员隔离构件，进而降低耦合性。
 * 如果你编写接口，那么就可以实现这一目标，但是通过类型信息，
 * 这种耦合性还是会传播出去一—接口并非是对解耦的一种无懈可击的保障。
 * 下面有一个示例，先是一个接口：
 *
 *
 * @Date: Create in 17:27 2019/5/19
 */
public class InterfaceViolation {



    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // Compile error
        System.out.println(a.getClass().getName());
        if(a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }

    //通过使用RTI'I,我们发现a是被当作B实现的。通过将其转型为B,我们可以调用不在A中的酮方法。

    //这是完全合法和可接受的，但是你也许并不想让客户端程序员这么做，
    // 因为这给了他们一 个机会，使得他们的代码与你的代码的耦合程度超过你的期望。也就是说，你可能认为
    //interface关键字正在保护若你；但是它井没有




}
