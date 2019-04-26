package JDK8.learn_Optional.demo2;


import JDK8.learn_Optional.Insurance;

import java.util.Optional;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 10:47 2019/4/26
 **/
public class Test {


    public static void main(String[] args) {
        //经常需要调用某个对象的方法，查看它的某些属性。比如，你可能需要检查保险公司的名
        //称是否为“Cambridge-Insurance”。为了以一种安全的方式进行这些操作，你首先需要确定引用指
        //向的Insurance对象是否为null，之后再调用它的getName方法

        Insurance insurances = new Insurance();
        if(insurances != null && "CambridgeInsurance".equals(insurances.getName())) {
            System.out.println("ok");
        }


//        使用Optional对象的filter方法，这段代码可以重构如下：


        Optional<Insurance> optInsurance = new Optional<>();
        optInsurance.filter(insurance ->
                "CambridgeInsurance".equals(insurance.getName()))
                .ifPresent(x -> System.out.println("ok"));

        //filter方法接受一个谓词作为参数。如果Optional对象的值存在，并且它符合谓词的条件，
        //filter方法就返回其值；否则它就返回一个空的Optional对象。

        //如果Optional
        //对象为空，它不做任何操作，反之，它就对Optional对象中包含的值施加谓词操作。如果该操
        //作的结果为true，它不做任何改变，直接返回该Optional对象，否则就将该值过滤掉，将
        //Optional的值置空。



    }

}
