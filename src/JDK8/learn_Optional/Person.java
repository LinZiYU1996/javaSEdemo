package JDK8.learn_Optional;




import java.util.Optional;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 10:20 2019/4/26
 **/
public class Person {

    private Optional<Car> car;   //人可能有车，也可能没有车，因此将这个字段 声明为Optional
    public Optional<Car> getCar() { return car; }



    //person引用的是Optional<Car>，
    //而car引用的是Optional<Insurance>，这种方式非常清晰地表达了你的模型中一个person
    //可能拥有也可能没有car的情形，同样，car可能进行了保险，也可能没有保险




}
