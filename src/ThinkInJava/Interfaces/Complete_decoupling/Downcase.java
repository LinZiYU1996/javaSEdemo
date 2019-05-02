package ThinkInJava.Interfaces.Complete_decoupling;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:40 2019/5/2
 */
public class Downcase extends Processor{

    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
