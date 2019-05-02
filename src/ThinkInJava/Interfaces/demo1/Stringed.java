package ThinkInJava.Interfaces.demo1;

import ThinkInJava.Polymorphism.demo1.Note;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 12:09 2019/5/2
 */
public class Stringed extends Instrument{

    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
    public String what() { return "Stringed"; }
    public void adjust() {}


}
