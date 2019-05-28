package Java_Multithreaded_Programming_Core_Technology.part6.使用enum枚举数据类型实现单例模式.singleton_9;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:25
* @Version:        1.0

*/
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.connectionFactory.getConnection().hashCode());
        }
    }
}
