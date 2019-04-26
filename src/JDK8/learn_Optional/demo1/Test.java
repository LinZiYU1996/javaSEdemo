package JDK8.learn_Optional.demo1;


import JDK8.learn_Optional.Car;
import JDK8.learn_Optional.Insurance;
import JDK8.learn_Optional.Person;

import java.util.Optional;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 10:41 2019/4/26
 **/
public class Test {



    //它接受一个Person和一个Car对象，并以此为条件对外
    //部提供的服务进行查询，通过一些复杂的业务逻辑，试图找到满足该组合的最便宜的保险公司：
    public Insurance findCheapestInsurance(Person person, Car car) {
        // 不同的保险公司提供的查询服务
        // 对比所有数据
        Insurance cheapestCompany = new Insurance();
        return cheapestCompany;
    }


    //想要该方法的一个null-安全的版本，它接受两个Optional对象作为参数，
    //返回值是一个Optional<Insurance>对象，如果传入的任何一个参数值为空，它的返回值亦为
    //空。Optional类还提供了一个isPresent方法，如果Optional对象包含值，该方法就返回true，

    public Optional<Insurance> nullSafeFindCheapestInsurance(
            Optional<Person> person, Optional<Car> car) {
        if (person.isPresent() && car.isPresent()) {
            return Optional.of(findCheapestInsurance(person.get(), car.get()));
        } else {
            return Optional.empty();
        }


        //这个方法具有明显的优势，我们从它的签名就能非常清楚地知道无论是person还是car，它
        //的值都有可能为空，出现这种情况时，方法的返回值也不会包含任何值。不幸的是，该方法的具
        //体实现和你之前曾经实现的null检查太相似了：方法接受一个Person和一个Car对象作为参数，
        //而二者都有可能为null。


    }




}
