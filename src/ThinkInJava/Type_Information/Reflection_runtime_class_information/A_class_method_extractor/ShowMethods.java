package ThinkInJava.Type_Information.Reflection_runtime_class_information.A_class_method_extractor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 通常你不蒂要直接使用反射工具，但是它们在你需要创建更加动态的代码时会很有用。反
 * 射在Java中是用来支持其他特性的，例如对象序列化和JavaBean(它们在本书稍后部分都会提到）。
 * 但是，如果能动态地提取某个类的信息有的时候还是很有用的。请考虑类方法提取器。浏览实
 * 现了类定义的源代码或是其JDK文档，只能找到在这个类定义中被定义或被覆盖的方法。但对你来说，
 * 可能有数十个更有用的方法都是继承自基类的。要找出这些方法可能会很乏味且费时气幸运的是，
 * 反射机制提供了一种方法，使我们能够编写可以自动展示完整接口的简单工具。下面就是其工作方式：
 *
 *
 *
 * @Date: Create in 10:18 2019/5/19
 */
public class ShowMethods {


    private static String usage =  "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving ‘word’";


    private static Pattern p = Pattern.compile("\\w+\\.");


    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if(args.length == 1) {
                for(Method method : methods)
                    System.out.println(
                            p.matcher(method.toString()).replaceAll(""));
                for(Constructor ctor : ctors)
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            } else {
                for(Method method : methods)
                    if(method.toString().indexOf(args[1]) != -1) {
                        System.out.println(
                                p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                for(Constructor ctor : ctors)
                    if(ctor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(
                                ctor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        } catch(ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }


        //Class的getMethods()和getConstructors{)方法分别返回Method对象的数组和Constructor 对象的数组。
        // 这两个类都提供了深层方法，用以解析其对象所代表的方法，并获取其名字输

        //入参数以及返回值。但也可以像这里一样，只使用toString()生成一个含有完整的方法特征签名的字符串。
        // 代码其他部分用千提取命令行信息，判断某个特定的特征签名是否与我们的目标字符串相符（使用indexOf()),
        // 并使用正则表达式去掉了命名修饰词（正则表达式在第13章中介绍过）。
        //Class.forName()生成的结果在编译时是不可知的，因此所有的方法特征签名信息都是在执行时被提取出来的。
        // 如果研究一下JDK文档中关于反射的部分，就会看到，反射机制提供了足够的支持，使得能够创建一个在编译时完全未知的对象
        // 并调用此对象的方法（在本书后面会 有示例）。虽然开始的时候可能认为永远也不需要用到这些功能，但是反射机制的价值是很惊人的。





    }
}
