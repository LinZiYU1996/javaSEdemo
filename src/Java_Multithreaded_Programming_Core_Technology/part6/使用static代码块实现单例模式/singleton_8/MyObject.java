package Java_Multithreaded_Programming_Core_Technology.part6.使用static代码块实现单例模式.singleton_8;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:24
* @Version:        1.0

*/
public class MyObject {

    private static MyObject instance = null;

    private MyObject() {

    }

    //使用静态代码块来实现单例模式
    static{
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }
}
