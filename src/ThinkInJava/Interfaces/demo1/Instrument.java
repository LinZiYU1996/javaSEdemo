package ThinkInJava.Interfaces.demo1;

import ThinkInJava.Polymorphism.demo1.Note;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 12:07 2019/5/2
 */
public abstract class Instrument {

    private int i; // Storage allocated for each

    public abstract void play(Note n);
    public String what() { return "Instrument"; }
    public abstract void adjust();


}
