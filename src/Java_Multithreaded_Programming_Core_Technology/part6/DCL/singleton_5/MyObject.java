package Java_Multithreaded_Programming_Core_Technology.part6.DCL.singleton_5;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:10
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
            //使用DCL双检查机制累实现多线程环境中的延迟加载单例模式设计。
            synchronized (MyObject.class) {
                if (null == object) {
                    object = new MyObject();
                }
            }
        }
        return object;
    }
}

