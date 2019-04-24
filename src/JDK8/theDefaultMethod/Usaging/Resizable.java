package JDK8.theDefaultMethod.Usaging;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 20:33 2019/4/24
 **/
public interface Resizable {


    int getWidth();
    int getHeight();
    void setWidth(int width);
    void setHeight(int height);
    void setAbsoluteSize(int width, int height);
    default void setRelativeSize(int wFactor, int hFactor){
        setAbsoluteSize(getWidth() / wFactor, getHeight() / hFactor);
    }



}
