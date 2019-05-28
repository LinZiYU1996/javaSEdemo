package Java_Multithreaded_Programming_Core_Technology.part6.延迟加载I懒汉模式.singleton_1;


public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(MyObject.getInstance().hashCode());
    }
}
