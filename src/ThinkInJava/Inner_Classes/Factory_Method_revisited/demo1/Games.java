package ThinkInJava.Inner_Classes.Factory_Method_revisited.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:02 2019/5/16
 */
public class Games {

    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while(s.move())
            ;
    }
    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }


}
