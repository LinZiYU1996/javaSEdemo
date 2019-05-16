package ThinkInJava.Inner_Classes.Usingthisandnew;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 如果你需要生成对外部类对象的引用，可以使用外部类的名字后面紧跟圆点和this。
 * 这样产 生的引用自动地具有正确的类型，这一点在编译期就被知晓井受到检查，因此没有任何运行时开销。
 * @Date: Create in 10:56 2019/5/16
 */
public class DotThis {


    void f() {
        System.out.println("DotThis.f()");
    }


    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner’s "this"
        }
    }


    public Inner inner() {
        return new Inner();
    }


    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }

}
