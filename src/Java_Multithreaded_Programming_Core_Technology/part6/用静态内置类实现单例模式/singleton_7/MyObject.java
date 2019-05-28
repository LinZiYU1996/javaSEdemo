package Java_Multithreaded_Programming_Core_Technology.part6.用静态内置类实现单例模式.singleton_7;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:20
* @Version:        1.0

*/
public class MyObject {
    private static MyObject object;

    private static class MyObjectHandler {
        private static MyObject object = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHandler.object;
    }
}

