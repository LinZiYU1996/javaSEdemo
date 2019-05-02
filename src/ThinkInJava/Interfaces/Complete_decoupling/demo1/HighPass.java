package ThinkInJava.Interfaces.Complete_decoupling.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:45 2019/5/2
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) { return input; }
}
