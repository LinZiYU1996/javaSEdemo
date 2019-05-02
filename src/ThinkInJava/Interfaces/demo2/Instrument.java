package ThinkInJava.Interfaces.demo2;

import ThinkInJava.Polymorphism.demo1.Note;

public interface Instrument {

    // Compile-time constant:
    int VALUE = 5; // static & final
    // Cannot have method definitions:
    void play(Note n); // Automatically public
    void adjust();


}
