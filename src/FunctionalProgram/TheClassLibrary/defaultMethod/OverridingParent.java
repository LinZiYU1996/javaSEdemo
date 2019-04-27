package FunctionalProgram.TheClassLibrary.defaultMethod;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:07 2019/4/27
 */
public class OverridingParent extends ParentImpl{



    @Override
    public void welcome() {
        message("Class HI");
    }
}
