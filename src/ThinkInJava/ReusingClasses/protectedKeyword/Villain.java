package ThinkInJava.ReusingClasses.protectedKeyword;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:45 2019/4/30
 */
public class Villain {

    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    public String toString() {
        return "I’m a Villain and my name is " + name;
    }


}
