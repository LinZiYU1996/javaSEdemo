package ThinkInJava.Type_Information.The_Class_object.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:34 2019/5/18
 */
public class SweetShop {

    public static void main(String[] args) {


        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("Gum");
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn’t find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }


}
