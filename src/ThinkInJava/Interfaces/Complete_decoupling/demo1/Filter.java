package ThinkInJava.Interfaces.Complete_decoupling.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:45 2019/5/2
 */
public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) { return input; }

    //Filter 与Processor具有相同的接口元素，
    // 但是因为它井非继承自 Processor- 因为Filter类 的创建者压根不清楚你想要将它用作Processor---
    // 因此你不能将Filter用千Apply.processO方法， 即便这样做可以正常运行。 这里主要是因为Apply:processO方法和Processor之间的耦合过紧，
    // 已经超出了所需要的程度， 这就使得应该复用Apply.processO的代码时，复用却被禁止了。 另外还需要注意的是它们的输入和输出都是Waveform。




}
