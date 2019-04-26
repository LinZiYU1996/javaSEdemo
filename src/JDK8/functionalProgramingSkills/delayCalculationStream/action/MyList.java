package JDK8.functionalProgramingSkills.delayCalculationStream.action;


import java.util.function.Predicate;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 18:26 2019/4/26
 **/
public interface MyList<T> {

    T head();
    MyList<T> tail();
    default boolean isEmpty() {
        return true;
    }

    MyList<T> filter(Predicate<T> p);



}
