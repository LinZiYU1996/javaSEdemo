package ThinkInJava.Polymorphism.Behavior_of_polymorphic_methods_inside_constructors;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:55 2019/5/2
 */
public class RoundGlyph extends Glyph{

    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
