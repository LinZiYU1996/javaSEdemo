package ThinkInJava.Interfaces.demo2;


import ThinkInJava.Polymorphism.demo1.Note;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:37 2019/5/2
 */
public class Music5 {

    // Doesn’t care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }



}
