package ThinkInJava.Holding_Your_Objects.Generics_and_type_safe_containers.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:30 2019/5/16
 */
public class Apple {

    private static long counter;
    private final long id = counter++;
    public long id() { return id; }


}
