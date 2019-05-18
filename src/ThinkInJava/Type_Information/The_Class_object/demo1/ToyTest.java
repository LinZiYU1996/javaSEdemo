package ThinkInJava.Type_Information.The_Class_object.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:53 2019/5/18
 */
public class ToyTest {

    static void printlnInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("typeinfo.toys.FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("Can’t find FancyToy");
            System.exit(1);
        }
       printlnInfo(c);
        for(Class face : c.getInterfaces())
            printlnInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor:
            obj = up.newInstance();
        } catch(InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printlnInfo(obj.getClass());
    }


}
