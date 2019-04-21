package JDK8.behavior_parameterization.num7Try;


import java.util.ArrayList;
import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 目前，filterApples方法还只适用于Apple。
你还可以将List类型抽象化，从而超越你眼前要处理的问题：
 * @Date 15:54 2019/4/21
 **/
public class TheFilter {

    public static <T> List<T> filter(List<T> list,Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T e : list){
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

}
