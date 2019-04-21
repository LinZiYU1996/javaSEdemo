package JDK8.lambda_demo.Functional_interface.predicate_demo;


import java.util.ArrayList;
import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 19:44 2019/4/21
 **/
public class FilterDemo {

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T s: list){
            if(p.test(s)){
                results.add(s);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(strings, nonEmptyStringPredicate);
    }

}
