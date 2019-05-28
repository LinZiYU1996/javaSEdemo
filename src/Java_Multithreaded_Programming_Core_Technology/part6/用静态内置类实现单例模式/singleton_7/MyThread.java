package Java_Multithreaded_Programming_Core_Technology.part6.用静态内置类实现单例模式.singleton_7;

/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:20
* @Version:        1.0

*/
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(MyObject.getInstance().hashCode());
    }
}
