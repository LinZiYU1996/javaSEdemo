package FunctionalProgram.TheClassLibrary.defaultMethod;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:01 2019/4/27
 */
public class Test {

    public static void parentDefauktUsed(){
      Parent parent = new ParentImpl();
      parent.welcome();
    }

    public static void childOverrideDefault(){
        Child child = new ChildImpl();
        child.welcome();;
    }

    public static void concreteBeatsDefault(){
        Parent parent = new OverridingParent();
        parent.welcome();
    }


    public static void main(String[] args) {
        parentDefauktUsed();

        childOverrideDefault();

        concreteBeatsDefault();
    }


}
