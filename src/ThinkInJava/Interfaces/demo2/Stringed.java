package ThinkInJava.Interfaces.demo2;

import ThinkInJava.Polymorphism.demo1.Note;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:36 2019/5/2
 */
public class Stringed implements Instrument{
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { System.out.println(this + ".adjust()"); }



}
