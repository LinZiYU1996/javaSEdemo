package FunctionalProgram.TheClassLibrary.multipleInheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 接口允许多重继承，因此有可能碰到两个接口包含签名相同的默认方法的情况
 *
 * @Date: Create in 15:10 2019/4/27
 */
public class MusicalCarriage implements Carriage,Jukebox{

    @Override
    public String rock() {
        return Carriage.super.rock();//在类中实现 rock 方法就能解决这个问题

        //该例中使用了增强的 super 语法，用来指明使用接口 Carriage 中定义的默认方法。此前，
        //使用 super 关键字是指向父类，现在使用类似 InterfaceName.super 这样的语法指的是继承
        //自父接口的方法。
    }
}
