package Java_Multithreaded_Programming_Core_Technology.Part3.值继承再修改.inheritable_thread_local_2;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:33
* @Version:        1.0

*/
public class InheritableThreadLocalExt extends InheritableThreadLocal<String> {
    @Override
    protected String initialValue() {
        return ""+System.currentTimeMillis();
    }

    @Override
    protected String childValue(String parentValue) {
        return parentValue + " child string";
    }
}
