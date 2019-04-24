package JDK8.refactoringAnddebugging.LambdaChangeOOP.chainResponsibility;


import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 19:38 2019/4/24
 **/
public class Test {


    public static void main(String[] args) {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();

        p1.setSuccessor(p2);

        String res = p1.handle(" ladbs is good"); //将两个处理对象链接起来
        System.out.println(res);

        //使用Lambda表达式

        UnaryOperator<String> header = (String text) -> "From r,m and a" + text;

        UnaryOperator<String> speller = (String text) -> text.replaceAll("labda","lambda");

        Function<String,String> pipeLine = header.andThen(speller);

        String res_1 = pipeLine.apply("ladbs is good");

        System.out.println(res_1);


    }
}
