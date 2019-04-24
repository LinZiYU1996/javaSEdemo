package JDK8.theDefaultMethod.Usaging;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 20:33 2019/4/24
 **/
public interface Moveable {

    int getX();
    int getY();
    void setX(int x);
    void setY(int y);
    default void moveHorizontally(int distance){
        setX(getX() + distance);
    }
    default void moveVertically(int distance){
        setY(getY() + distance);
    }


}
