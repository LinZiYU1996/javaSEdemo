package ThinkInJava.Interfaces.Interfaces_and_factories;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 9:43 2019/5/6
 */
public class Implementation2Factory implements ServiceFactory{

    public Service getService() {
        return new Implementation2();
    }


}
