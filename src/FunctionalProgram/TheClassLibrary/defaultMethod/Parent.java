package FunctionalProgram.TheClassLibrary.defaultMethod;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 15:00 2019/4/27
 **/
public interface Parent {

    public void message(String body);

    public default void welcome(){
        message(" Parent, HI");
    }

    public String getLastMessage();
}
