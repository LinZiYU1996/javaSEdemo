package FunctionalProgram.TheClassLibrary.defaultMethod;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:05 2019/4/27
 */
public class ChildImpl implements Child{

    @Override
    public void message(String body) {
        System.out.println(body);
    }

    @Override
    public String getLastMessage() {
        return null;
    }
}
