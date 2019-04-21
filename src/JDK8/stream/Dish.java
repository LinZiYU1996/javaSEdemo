package JDK8.stream;


/*
*
 * @Author Mr.Lin
 * @Description //TODO
 * @Date 20:58 2019/4/21
 **/
public class Dish {

    private int calory;

    private String name;

    public Dish(int calory, String name) {
        this.calory = calory;
        this.name = name;
    }

    public Dish(int calory) {
        this.calory = calory;
    }

    public int getCalory() {
        return calory;
    }

    public String getName() {
        return name;
    }
}
