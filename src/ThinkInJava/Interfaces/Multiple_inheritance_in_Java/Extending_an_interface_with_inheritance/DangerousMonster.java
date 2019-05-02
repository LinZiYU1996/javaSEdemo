package ThinkInJava.Interfaces.Multiple_inheritance_in_Java.Extending_an_interface_with_inheritance;


/*
*
 * @Author Mr.Lin
 * @Description:
 * 通过继承，可以很容易地在接口中添加新的方法声明，还可以通过继承在新接口中组合数个接口。
 * 这两种情况都可以获得新的接口，就像在下例中所看到的：
 *
 *
 * @Date 20:00 2019/5/2
 **/
public interface DangerousMonster extends Monster{
    void destroy();

    //DangerousMonstei;-妞onster的直接扩展， 它产生了一个新接口。 DragonZilla中实现了这个接口。



}
