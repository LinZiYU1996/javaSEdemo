package ThinkInJava.Polymorphism.Forgetting_the_object_type.demo;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:19 2019/5/2
 */
public class RandomShapeGenerator {

    private Random rand = new Random(47);


    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }


}
