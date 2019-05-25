package Java_Multithreaded_Programming_Core_Technology.Part3.值继承.inheritable_thread_local;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/25 10:32
* @Version:        1.0

*/
public class InheritableThreadLocalExt extends InheritableThreadLocal<Long> {
    @Override
    protected Long initialValue() {
        return System.currentTimeMillis();
    }

}
