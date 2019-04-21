package JDK8.methodReferences_demo;


import JDK8.lambda_demo.Functional_interface.function_demo.Function;

import java.util.function.Supplier;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 20:14 2019/4/21
 **/
public class Test {

    //对于一个现有构造函数，你可以利用它的名称和关键字new来创建它的一个引用：
    //ClassName::new。它的功能与指向静态方法的引用类似。例如，假设有一个构造函数没有参数。
    //它适合Supplier的签名() -> Cat。
    public static void main(String[] args) {
        Supplier<Cat> catSupplier = Cat::new;
        Cat c = catSupplier.get();
        System.out.println(c.hashCode());

        //上述等价于

        Supplier<Cat> catSupplier1 = () -> new Cat();
        Cat c2 = catSupplier1.get();
        System.out.println(c2.hashCode());


        //如果你的构造函数的签名是Apple(Integer weight)，那么它就适合Function接口的签
        //名，于是你可以这样写：
        Function<String,Dog> function = Dog::new;
        Dog dog1 = function.apply("OOO");
        System.out.println(dog1.getName());

        //上述等价于

        Function<String,Dog> function2 = (name) -> new Dog(name);
        Dog dog2 = function2.apply("PPP");
        System.out.println(dog2.getName());




    }


}
