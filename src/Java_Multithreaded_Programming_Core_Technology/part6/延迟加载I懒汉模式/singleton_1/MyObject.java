package Java_Multithreaded_Programming_Core_Technology.part6.延迟加载I懒汉模式.singleton_1;


public class MyObject {
    private static MyObject object;

    public static MyObject getInstance() {
        if (null == object) {
            object = new MyObject();
        }
        return object;
    }
}

