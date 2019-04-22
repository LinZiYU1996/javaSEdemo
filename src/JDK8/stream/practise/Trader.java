package JDK8.stream.practise;



/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 10:24 2019/4/22
 **/
public class Trader {

    private final String name;

    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader:"+this.name + " in " + this.city;
    }
}
