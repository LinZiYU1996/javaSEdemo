package ThinkInJava.Interfaces.Complete_decoupling;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:39 2019/5/2
 */
public class Processor {

    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) { return input; }


}
