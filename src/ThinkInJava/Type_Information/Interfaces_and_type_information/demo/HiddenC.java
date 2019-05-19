package ThinkInJava.Type_Information.Interfaces_and_type_information.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 在这个包中唯一public的部分，即HiddenC,在被调用时将产生A接口类型的对象。
 * 这里有趣之处在千：即使你从makeA()返回的是C类型，你在包的外部仍旧不能使用A之外的任何方法，
 * 因为你不能在包的外部命名C。
 *
 *
 * @Date: Create in 17:51 2019/5/19
 */
public class HiddenC {

    public static A makeA() { return new C(); }


}
