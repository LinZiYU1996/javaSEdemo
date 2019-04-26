package JDK8.learn_Optional;


import java.util.Optional;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 10:21 2019/4/26
 **/
public class Car {

    private Optional<Insurance> insurance;   //车可能进行了保险，也可能没有保险，所以将这个 字段声明为Optional
    public Optional<Insurance> getInsurance() { return insurance; }


}
