package JDK8.theDefaultMethod.Usaging;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 定义一个单独的Rotatable接口，并提供两个抽象方法setRotationAngle和
    getRotationAngle，
 * @Date 20:26 2019/4/24
 **/
public interface Rotatable {
    void setRotationAngle(int angleInDegrees);
    int getRotationAngle();
    default void rotateBy(int angleInDegrees){
        setRotationAngle((getRotationAngle ()) % 360);
    }


}
