package Java_Multithreaded_Programming_Core_Technology.part6.序列化与反序列化的单例模式实现.singleton_7_1;

import java.io.Serializable;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:22
* @Version:        1.0

*/
public class MyObject implements Serializable {
    private static MyObject object;

    private static class MyObjectHandler {
        private static MyObject object = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHandler.object;
    }

    //在反序列化中使用readResolve方法 解决序列化问题。
    protected Object readResolve() {
        System.out.println("call readResolve method");
        return MyObjectHandler.object;
    }
}

