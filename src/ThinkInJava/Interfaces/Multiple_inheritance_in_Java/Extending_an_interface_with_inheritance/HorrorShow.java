package ThinkInJava.Interfaces.Multiple_inheritance_in_Java.Extending_an_interface_with_inheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:58 2019/5/2
 */
public class HorrorShow {

    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }



}
