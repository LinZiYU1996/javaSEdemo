package ThinkInJava.ReusingClasses.Name_hiding;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *  名称屏蔽
 * 如果Java的基类拥有某个已被多次重载的方法名称， 那么在导出类中重新定义该方法名称 并不会屏蔽其在基类中的任何版本
 *
 *
 * @Date: Create in 19:35 2019/4/30
 */
public class Hide {


    public static void main(String[] args) {
        Bart b = new Bart();

        b.doh(1);

        b.doh('x');

        b.doh(1.0f);

        b.doh(new Milhouse());

        //可以看到，虽然Bart引入了一个新的重载方法

        //方法），但是在Bart中Homer的所有重载方法都是可用的。


    }

}
