package ThinkInJava.ReusingClasses.Name_hiding;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:34 2019/4/30
 */
public class Homer {

    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }


}
