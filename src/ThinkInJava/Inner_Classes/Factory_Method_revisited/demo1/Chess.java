package ThinkInJava.Inner_Classes.Factory_Method_revisited.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:02 2019/5/16
 */
public class Chess implements Game{

    private Chess() {}
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        public Game getGame() { return new Chess(); }
    };

}
