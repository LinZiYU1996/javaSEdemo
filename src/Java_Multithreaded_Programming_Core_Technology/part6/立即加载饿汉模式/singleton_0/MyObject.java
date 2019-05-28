package Java_Multithreaded_Programming_Core_Technology.part6.立即加载饿汉模式.singleton_0;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 15:59
* @Version:        1.0

*/
public class MyObject {
    //立即加载方式 == 懒汉模式
    private static MyObject object = new MyObject();

    public static MyObject getInstance() {
        return object;
    }
}
