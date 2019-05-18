package ThinkInJava.Type_Information.Generic_class_references.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 18:03 2019/5/18
 */
public class CountedInteger {

    private static long counter;
    private final long id = counter++;
    public String toString() { return Long.toString(id); }

}
