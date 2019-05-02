package ThinkInJava.Interfaces.Complete_decoupling;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:40 2019/5/2
 */
public class Splitter extends Processor{

    String process(Object input) {
        // The split() argument divides a String into pieces:
        return Arrays.toString(((String)input).split(" "));
    }


}
