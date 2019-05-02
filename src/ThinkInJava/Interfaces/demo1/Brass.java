package ThinkInJava.Interfaces.demo1;

import ThinkInJava.Polymorphism.demo1.Note;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 12:09 2019/5/2
 */
public class Brass extends Wind{


    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    public void adjust() { System.out.println("Brass.adjust()"); }

}
