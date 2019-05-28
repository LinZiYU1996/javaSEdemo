package Java_Multithreaded_Programming_Core_Technology.part6.DCL.singleton_5;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:10
* @Version:        1.0

*/
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(MyObject.getInstance().hashCode());
    }
}
