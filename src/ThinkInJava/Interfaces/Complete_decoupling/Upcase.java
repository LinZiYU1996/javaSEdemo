package ThinkInJava.Interfaces.Complete_decoupling;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:40 2019/5/2
 */
public class Upcase extends Processor{


    String process(Object input) { // Covariant return
        return ((String)input).toUpperCase();
    }

}
