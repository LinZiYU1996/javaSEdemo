package JDK8.functionalProgramingSkills.delayCalculationStream.action;


import java.util.function.Predicate;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 18:27 2019/4/26
 **/
public class MyLinkedList <T> implements MyList<T>{


    private final T head;
    private final MyList<T> tail;
    public MyLinkedList(T head, MyList<T> tail) {
        this.head = head;
        this.tail = tail;
    }
    public T head() {
        return head;
    }
    public MyList<T> tail() {
        return tail;
    }
    public boolean isEmpty() {
        return false;
    }

    @Override
    public MyList<T> filter(Predicate<T> p) {
        return null;
    }
}
