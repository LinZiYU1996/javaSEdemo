package ThinkInJava.Type_Information.Interfaces_and_type_information.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:51 2019/5/19
 */
public class C implements A{

    public void f() { System.out.println("public C.f()"); }
    public void g() { System.out.println("public C.g()"); }
    void u() { System.out.println("package C.u()"); }
    protected void v() { System.out.println("protected C.v()"); }
    private void w() { System.out.println("private C.w()"); }


}
