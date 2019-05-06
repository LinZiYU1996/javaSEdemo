package ThinkInJava.Interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 接口的一种常见用法就是前面提到的策略设计模式， 此时你编写一个执行某些操作
 * 的方法， 而该方法将接受一个同样是你指定的接口。
 * 你主要就是要声明： “你可以用任何你想要的对象来调用我的方法，
 * 只要你的对象遵循我的接口。” 这使得你的方法更加灵活 通用，井更
 *
 *
 * @Date: Create in 9:15 2019/5/6
 */
public class RandomWords implements Readable{

    private static Random rand = new Random(47);

    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private static final char[] vowels =
            "aeiou".toCharArray();

    private int count;
    public RandomWords(int count) { this.count = count; }
    public int read(CharBuffer cb) {
        if(count-- == 0)
            return -1; // Indicates end of input
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for(int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10; // Number of characters appended
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while(s.hasNext())
            System.out.println(s.next());
    }


    //Readable接口只要求实现readO方法，在readO内部， 将输入内容添加到CharBuffer参数中
    //（有多种方法可以实现此目的， 谘查看CharBuffer的文档）， 或者在没有任何输入时返回一1。





}
