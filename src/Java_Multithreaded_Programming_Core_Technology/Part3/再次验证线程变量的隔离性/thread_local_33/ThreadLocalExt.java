package Java_Multithreaded_Programming_Core_Technology.Part3.再次验证线程变量的隔离性.thread_local_33;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 21:06
* @Version:        1.0

*/
public class ThreadLocalExt extends ThreadLocal<Long> {
    @Override
    protected Long initialValue() {
        return System.currentTimeMillis();
    }
}
