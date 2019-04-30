package ThinkInJava.ReusingClasses.Constructors_with_arguments;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 如果不在BoardGame()中调用基类构造器， 编译器将 “抱怨“ 无法找到符合Game()形式的
 *而且， 调用基类构造器必须是你在导出类构造器中要做的第一件事（如果你做错了， 编译器会提醒你）。
 *
 * @Date: Create in 16:48 2019/4/30
 */
public class BoardGame extends Game{

    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }




}
