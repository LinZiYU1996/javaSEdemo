package JDK8.theDefaultMethod.theProblems;


/*
*
 * @Author Mr.Lin
 * @Description //
 * 你的一位铁杆用户根据自身的需求实现了Resizable接口，创建了Ellipse类
 * @Date 20:11 2019/4/24
 **/
public class Ellipse  implements Resizable{
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
    public void setRelativeSize(int wFactor, int hFactor) {

    }
}
