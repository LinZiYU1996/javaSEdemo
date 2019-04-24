package JDK8.theDefaultMethod.Usaging;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 20:44 2019/4/24
 **/
public class Test {


    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.rotateBy(180);
        monster.moveVertically(10);

        //像这种代码那样使用默认实现来定义简单的接口还有另一个好处。假设你需要修改
        //moveVertically的实现，让它更高效地运行。你可以在Moveable接口内直接修改它的实现，
        //所有实现该接口的类会自动继承新的代码（这里我们假设用户并未定义自己的方法实现）
    }
}
