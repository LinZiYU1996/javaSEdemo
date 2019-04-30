package ThinkInJava.ReusingClasses.Combining_composition_and_inheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:30 2019/4/30
 */
public class Fork extends Utensil{

    Fork(int i) {
        super(i);
        System.out.println("Fork constructor");
    }
}
