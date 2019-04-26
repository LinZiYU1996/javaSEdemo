package JDK8.functionalProgramingSkills.currying;


import java.util.function.DoubleUnaryOperator;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 17:38 2019/4/26
 **/
public class Demo {


    //单位转换通常都会涉及转换因子以及基线调整因子的问题。比如，将摄氏度转换到华氏度的
    //公式是CtoF(x) = x*9/5 + 32。
    //所有的单位转换几乎都遵守下面这种模式：
    //(1) 乘以转换因子
    //(2) 如果需要，进行基线调整

    public static double converter(double x, double f, double b) {
        return x * f + b;

        //x是你希望转换的数量，f是转换因子，b是基线值。但是这个方法有些过于宽泛了。通
        //常，你还需要在同一类单位之间进行转换，比如公里和英里。当然，你也可以在每次调用
        //converter方法时都使用3个参数，但是每次都提供转换因子和基准比较繁琐，并且你还极有可
        //能输入错误
    }

    //提供一种简单的解法，它既能充分利用已有的逻辑，又能让converter针对每个应
    //用进行定制。你可以定义一个“工厂”方法，它生产带一个参数的转换方法，我们希望借此来说
    //明科里化

    public static DoubleUnaryOperator curriedConverter(double f, double b){
        return (double x) -> x * f + b;

        //现在，你要做的只是向它传递转换因子和基准值（f和b），它会不辞辛劳地按照你的要求返
        //回一个方法（使用参数x）
    }


    public static void main(String[] args) {
        DoubleUnaryOperator convertCtoF = curriedConverter(9.0/5, 32);
        DoubleUnaryOperator convertUSDtoGBP = curriedConverter(0.6, 0);
        DoubleUnaryOperator convertKmtoMi = curriedConverter(0.6214, 0);

//        由于DoubleUnaryOperator定义了方法applyAsDouble，你可以像下面这样使用你的
//        converter：

        double gbp = convertUSDtoGBP.applyAsDouble(1000);


//        这样一来，你的代码就更加灵活了，同时它又复用了现有的转换逻辑！让我们一起回顾下你
//        都做了哪些工作。你并没有一次性地向converter方法传递所有的参数x、f和b，相反，你只是
//        使用了参数f和b并返回了另一个方法，这个方法会接收参数x，最终返回你期望的值x * f + b。
//        通过这种方式，你复用了现有的转换逻辑，同时又为不同的转换因子创建了不同的转换方法
    }








}
