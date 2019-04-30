package ThinkInJava.ReusingClasses.Combining_composition_and_inheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:30 2019/4/30
 */
public class Knife extends Utensil{

    Knife(int i) {
        super(i);
        System.out.println("Knife constructor");
    }
}
