package ThinkInJava.ReusingClasses.Delegation;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:11 2019/4/30
 */
public class SpaceShip extends SpaceShipControls{


    private String name;

    public SpaceShip(String name) { this.name = name; }


    public String toString() { return name; }


    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);

        //例如， 太空船需要一个控制模块：


        //然而， SpaceShip并非真正的SpaceShipControls类型，
        // 即便你可以 “告诉" SpaceS􀀁ip向前运动 (forward()) 。
        // 更准确地讲， SpaceShip包含SpaceShipControls, 与此同时， SpaceShip­Controls的所有方法在SpaceShip中都暴露了出来
    }
}
