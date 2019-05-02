package ThinkInJava.Interfaces.Complete_decoupling.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:44 2019/5/2
 */
public class Waveform {

    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }





}
