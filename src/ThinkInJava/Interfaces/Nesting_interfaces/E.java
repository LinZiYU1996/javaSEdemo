package ThinkInJava.Interfaces.Nesting_interfaces;

public interface E {

    interface G {
        void f();
    }
    // Redundant "public":
    public interface H {
        void f();
    }
    void g();


    // Cannot be private within an interface:
    //! private interface I {}
    //内部接口不能定义为private

}
