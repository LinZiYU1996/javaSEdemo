package ThinkInJava.Interfaces.Complete_decoupling.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:45 2019/5/2
 */
public class BandPass extends Filter{

    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input) { return input; }
}
