package Java_Multithreaded_Programming_Core_Technology.Part2.关键字volatile与死循环.t99;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 程序开始运行后， 根本停不下来
 * 停不下来的原因主要就是main线程 一直在处理while()循环， 导致程序不能 继续执行后面的代码。 解决的办法当然 是用多线程技术。
 *
 *
 * @Date: Create in 10:36 2019/5/21
 */
public class Run {

    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("I want to stop it! stop thread = " + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }


}
