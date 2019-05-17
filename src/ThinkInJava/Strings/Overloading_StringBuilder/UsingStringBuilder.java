package ThinkInJava.Strings.Overloading_StringBuilder;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 如果你要在toString()方法中使用循环， 那么最好自己创建一个StringBuilder对象，用它来构造最终的结果。请参考以下示例
 *
 *
 * @Date: Create in 17:44 2019/5/17
 */
public class UsingStringBuilder {

    public static Random rand = new Random(47);


    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length()-2, result.length());
        result.append("]");
        return result.toString();
    }


    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }


}
