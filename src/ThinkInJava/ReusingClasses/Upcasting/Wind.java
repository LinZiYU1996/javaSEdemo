package ThinkInJava.ReusingClasses.Upcasting;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * ”为新的类提供方法”并不是继承技术中最重要的方面，其最重要的方面是用来表现新类和基类之间的关系。这种关系可以用“新类是现有类的一种类型”这句话加以概括。
 * 这个描述并非只是一种解释继承的华丽的方式，这直接是由语言所支撑的。例如，假设有一个称为Instrument的代表乐器的基类和一个称为Wind的导出类。
 * 由千继承可以确保基类中所有的方法在导出类中也同样有效，所以能够向基类发送的所有信息同样也可以向导出类发送。如果Instrument类具有一个play()方法，
 * 那么Wind乐器也将同样具备。这意味着我们可以准确地说Wind对象也是一种类型的Instrument。
 * @Date: Create in 19:54 2019/4/30
 */
public class Wind extends Instrument{

    public static void main(String[] args) {
        Wind flute = new Wind();

        Instrument.tune(flute); // Upcasting

        //这种将Wind引用转换为 Instrument引用的动作，我们称之为向上转型。


        //由导出类转型成基类，在继承图上是向上移动的，因此一般称为向上转
        //由千向上转型是从一个较专用类型向较通用类型转换，所以总是很安全
        //的。也就是说，导出类是基类的一个超集。它可能比基类含有更多的方法，Wind 但它必须至少具备基类中所含有的方法。在向上转型的过程中，类接口中唯
        //一可能发生的事情是丢失方法，而不是获取它们。这就是为什么编译器在“未曾明确表示转型”

        //未曾指定特殊标记”的情况下，仍然允许向上转型的原因。


    }
}
