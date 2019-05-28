package Java_Multithreaded_Programming_Core_Technology.part6.延迟加载I懒汉模式.singleton_2_2;



/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:05
* @Version:        1.0

*/
public class MyObject {

    private static MyObject object;

    public static MyObject getInstance() {
        //其实和synchronized加在方法是一样的，效率低

        //此方法加入同步synchronized语句块得到相同实例的对象， 但此种方法的运行效率也是
        //非常低的， 和synchronized同步方法一样是同步运行的。 继续更改代码尝试解决这个缺点。'


        synchronized (MyObject.class) {
            if (null == object) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                object = new MyObject();
            }
        }
        return object;
    }
}

