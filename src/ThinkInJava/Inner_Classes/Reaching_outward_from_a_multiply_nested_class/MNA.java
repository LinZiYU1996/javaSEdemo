package ThinkInJava.Inner_Classes.Reaching_outward_from_a_multiply_nested_class;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:12 2019/5/16
 */
public class MNA {

    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                g();
                f();
            }
        }
    }


}
