package JDK8.functionalProgramingSkills.delayCalculationStream.action;


import java.util.function.Predicate;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 18:28 2019/4/26
 **/
public class Empty <T> implements MyList<T>{

    public T head() {
        throw new UnsupportedOperationException();
    }
    public MyList<T> tail() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MyList<T> filter(Predicate<T> p) {
        return null;
    }
}
