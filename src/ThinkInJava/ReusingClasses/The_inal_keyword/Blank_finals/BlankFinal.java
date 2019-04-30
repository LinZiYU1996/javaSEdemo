package ThinkInJava.ReusingClasses.The_inal_keyword.Blank_finals;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:12 2019/4/30
 */
public class BlankFinal {

    private final int i = 0; // Initialized final

    private final int j; // Blank final

    private final Poppet p; // Blank final reference

    // Blank finals MUST be initialized in the constructor:
    public BlankFinal() {
        j = 1; // Initialize blank final
        p = new Poppet(1); // Initialize blank final reference
    }


    public BlankFinal(int x) {
        j = x; // Initialize blank final
        p = new Poppet(x); // Initialize blank final reference
    }


    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);

        //必须在域的定义处或者每个构造器中用表达式对final进行赋值，这正是final域在使用前总是被初始化的原因所在。


    }


}
