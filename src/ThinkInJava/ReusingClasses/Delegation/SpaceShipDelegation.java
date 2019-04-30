package ThinkInJava.ReusingClasses.Delegation;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 代理解决了此难题
 *
 *
 * @Date: Create in 17:13 2019/4/30
 */
public class SpaceShipDelegation {


    private String name;

    private SpaceShipControls controls =
            new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }
    // Delegated methods:
    public void back(int velocity) {
        controls.back(velocity);
    }
    public void down(int velocity) {
        controls.down(velocity);
    }
    public void forward(int velocity) {
        controls.forward(velocity);
    }
    public void left(int velocity) {
        controls.left(velocity);
    }
    public void right(int velocity) {
        controls.right(velocity);
    }
    public void turboBoost() {
        controls.turboBoost();
    }
    public void up(int velocity) {
        controls.up(velocity);
    }
    public static void main(String[] args) {
        SpaceShipDelegation protector =
                new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }


}
