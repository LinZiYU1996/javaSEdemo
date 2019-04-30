package ThinkInJava.Polymorphism.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:31 2019/4/30
 */
public class Wind extends Instrument{

    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}

