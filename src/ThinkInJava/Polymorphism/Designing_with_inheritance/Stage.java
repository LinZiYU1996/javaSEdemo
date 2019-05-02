package ThinkInJava.Polymorphism.Designing_with_inheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:58 2019/5/2
 */
public class Stage {

    private Actor actor = new HappyActor();
    public void change() { actor = new SadActor(); }
    public void performPlay() { actor.act(); }


}
