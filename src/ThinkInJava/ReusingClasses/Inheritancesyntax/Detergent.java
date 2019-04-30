package ThinkInJava.ReusingClasses.Inheritancesyntax;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:35 2019/4/30
 */
public class Detergent extends Cleanser{

    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }


    // Add methods to the interface:

    public void foam() { append(" foam()"); }



    // Test the new class:



    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();

        System.out.println(x);

        System.out.println("=============================");

        System.out.println("Testing base class:");

        System.out.println("=============================");
        Cleanser.main(args);

        //在Cleanser的接口中有一组方法：append()、dilute()applyO、scrub()和toString()。由千

        //Detergent是由关键字extends从Cleanser导出的，所以它可以在其接口中自动获得这些方法，尽

        //管并不能看到这些方法在Detergent中的显式定义。因此，可以将继承视作是对类的复用。



    }
}
