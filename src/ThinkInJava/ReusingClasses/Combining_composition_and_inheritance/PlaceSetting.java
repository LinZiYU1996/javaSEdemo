package ThinkInJava.ReusingClasses.Combining_composition_and_inheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 同时使用组合和继承是很常见的事。下例就展示了同时使用这两种技术，井配以必要的构造器初始化，来创建更加复杂的类：
 * @Date: Create in 19:31 2019/4/30
 */
public class PlaceSetting extends Custom{

    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;
    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");
    }
    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
