package ThinkInJava.ReusingClasses.Upcasting;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:53 2019/4/30
 */
public class Instrument {

    public void play() {}
    static void tune(Instrument i) {
        // ...
        i.play();
    }


}
