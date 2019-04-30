package ThinkInJava.ReusingClasses.protectedKeyword;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 但在实际项目中，经常会想要将某些事物尽可能对这个世界隐藏起来， 但仍然允许导出类的成员访问它们。
 *
 * 关键字protected就是起这个作用的。它指明”就类用户而言，这是private的，
 * 但对千任何继承千此类的导出类或其他任何位千同一个包内的类来说，它却是可以访问的。"(protected也提供了包内访间权限。）
 *
 * @Date: Create in 19:46 2019/4/30
 */
public class Orc extends Villain{

    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name); // Available because it’s protected
        this.orcNumber = orcNumber;
    }

    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
