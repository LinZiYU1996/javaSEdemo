package JDK8.learn_Optional.the_using;


import JDK8.learn_Optional.Car;

import java.util.Optional;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 10:24 2019/4/26
 **/
public class Test {


    public static void main(String[] args) {

        //声明一个空的Optional
        //通过静态工厂方法Optional.empty，创建一个空的Optional
        //对象：

        Optional<Car> optCar = Optional.empty();


        // 依据一个非空值创建Optional
        //使用静态工厂方法Optional.of，依据一个非空值创建一个Optional对象
        Car c = new Car();
        Optional<Car> optCars = Optional.of(c);

        //如果car是一个null，这段代码会立即抛出一个NullPointerException，而不是等到你
        //试图访问car的属性值时才返回一个错误。


        //可接受null的Optional

//        使用静态工厂方法Optional.ofNullable，你可以创建一个允许null值的Optional
//        对象：

        Optional<Car> optCarss = Optional.ofNullable(c);

        //如果car是null，那么得到的Optional对象就是个空对象








    }

}
