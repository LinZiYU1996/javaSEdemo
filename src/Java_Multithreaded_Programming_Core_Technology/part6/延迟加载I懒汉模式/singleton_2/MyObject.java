package Java_Multithreaded_Programming_Core_Technology.part6.延迟加载I懒汉模式.singleton_2;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:03
* @Version:        1.0

*/
public class MyObject {
    private static MyObject object;

    public static MyObject getInstance() {
        if (null == object) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            object = new MyObject();
        }
        return object;
    }
}

