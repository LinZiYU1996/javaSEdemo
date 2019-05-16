package ThinkInJava.Inner_Classes.Factory_Method_revisited.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:01 2019/5/16
 */
public class Checkers implements Game{

    private Checkers() {}
    private int moves = 0;
    private static final int MOVES = 3;
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        public Game getGame() { return new Checkers(); }
    };
}
