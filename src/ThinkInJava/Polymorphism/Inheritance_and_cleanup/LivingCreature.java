package ThinkInJava.Polymorphism.Inheritance_and_cleanup;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:47 2019/5/2
 */
public class LivingCreature {

    private Characteristic p =
            new Characteristic("is alive");
    private Description t =
            new Description("Basic Living Creature");
    LivingCreature() {
        System.out.println("LivingCreature()");
    }
    protected void dispose() {
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}
