package ThinkInJava.Polymorphism.Behavior_of_polymorphic_methods_inside_constructors;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:55 2019/5/2
 */
public class Glyph {

    void draw() { System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
