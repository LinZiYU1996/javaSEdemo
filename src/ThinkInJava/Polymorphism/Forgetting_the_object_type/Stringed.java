package ThinkInJava.Polymorphism.Forgetting_the_object_type;

import ThinkInJava.Polymorphism.demo1.Instrument;
import ThinkInJava.Polymorphism.demo1.Note;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:35 2019/4/30
 */
public class Stringed extends Instrument {

    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }


}
