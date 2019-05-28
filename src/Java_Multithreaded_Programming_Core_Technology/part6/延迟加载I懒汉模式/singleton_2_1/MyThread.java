package Java_Multithreaded_Programming_Core_Technology.part6.延迟加载I懒汉模式.singleton_2_1;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:05
* @Version:        1.0

*/
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(MyObject.getInstance().hashCode());
    }
}
