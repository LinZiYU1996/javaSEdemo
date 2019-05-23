package Java_Multithreaded_Programming_Core_Technology.Part3.解决get返回null问题.thread_local_22;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/23 21:05
* @Version:        1.0

*/
public class ThreadLocalExt extends ThreadLocal<String> {
    @Override
    protected String initialValue() {
        return "default value string!";
    }

}
