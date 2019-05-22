package Java_Multithreaded_Programming_Core_Technology.Part2.解决同步死循环.t10;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 关键字volatile的作用是强制从公共堆栈中取得变量的值，而不是从线程私有数据栈中 取得变量的值。
 *
 *
 * @Date: Create in 10:53 2019/5/21
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        /**
         * 当下面代码运行在-server服务器模式中64bit的JVM上时，会出现死循环。解决的办法是使用volatile
         */
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("I want to stop it ! stop thread = " + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }


}
