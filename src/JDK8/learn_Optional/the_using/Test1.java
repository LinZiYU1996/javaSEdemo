package JDK8.learn_Optional.the_using;


import JDK8.learn_Optional.Car;
import JDK8.learn_Optional.Insurance;
import JDK8.learn_Optional.Person;

import java.util.Optional;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 10:28 2019/4/26
 **/
public class Test1 {

    //使用Optional获取car的Insurance名称
    public String getCarInsuanceName(Optional<Person> person){
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("UNKNOW"); //如果Optional的结果值为空，设置默认值

        //处理潜在可能缺失的值时，
        //使用Optional具有明显的优势。这一次，你可以用非常容易却又普适的方法实现之前你期望的
        //效果——不再需要使用那么多的条件分支，也不会增加代码的复杂性
    }


    public static void main(String[] args) {
//        使用 map 从 Optional 对象中提取和转换值
        Insurance insurance = new Insurance();
        insurance.setName("SAFE");
        Optional<Insurance> optInsurance = Optional.ofNullable(insurance);
        Optional<String> name = optInsurance.map(Insurance::getName);

        System.out.println(name);

        //与流的map方法相差无几。map操作会将提供的
        //函数应用于流的每个元素。你可以把Optional对象看成一种特殊的集合数据，它至多包含一个
        //元素。如果Optional包含一个值，那函数就将该值作为参数传递给map，对该值进行转换。如
        //果Optional为空，就什么也不做。


        System.out.println("==========================================================");

        //使用 flatMap 链接 Optional 对象

        Person person = new Person();

        Optional<Person> optionalPerson = Optional.of(person);

//        Optional<String> name =
//                optionalPerson.map(Person::getCar)
//                .map(Car::getInsurance)
//                .map(Insurance::getName)

        //这段代码无法通过编译.optPerson是Optional<Person>类型的
        //变量， 调用map方法应该没有问题。但getCar返回的是一个Optional<Car>类型的对象，这意味着map操作的结果是一个Optional<Optional<Car>>类型的对象。因
        //此，它对getInsurance的调用是非法的，因为最外层的optional对象包含了另一个optional
        //对象的值，而它当然不会支持getInsurance方法。


        //flatMap方法。使用流时，flatMap方法接受一个函数作为参数，这个函数的返回值是另一个流。
        //这个方法会应用到流中的每一个元素，最终形成一个新的流的流。但是flagMap会用流的内容替
        //换每个新生成的流。换句话说，由方法生成的各个流会被合并或者扁平化为一个单一的流。这里
        //你希望的结果其实也是类似的，但是你想要的是将两层的optional合并为一个。








    }
}
