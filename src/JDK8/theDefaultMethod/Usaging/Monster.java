package JDK8.theDefaultMethod.Usaging;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 20:35 2019/4/24
 **/

//Monster类会自动继承Rotatable、Moveable和Resizable接口的默认方法。
public class Monster implements Rotatable,Moveable,Resizable{


    //需要给出所有抽象方法的实
    //现，但无需重复实现默认方法


    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setX(int x) {

    }

    @Override
    public void setY(int y) {

    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public void setHeight(int height) {

    }

    @Override
    public void setAbsoluteSize(int width, int height) {

    }

    @Override
    public void setRotationAngle(int angleInDegrees) {

    }

    @Override
    public int getRotationAngle() {
        return 0;
    }
}
