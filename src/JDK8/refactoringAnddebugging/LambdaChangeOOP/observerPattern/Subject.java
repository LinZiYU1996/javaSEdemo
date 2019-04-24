package JDK8.refactoringAnddebugging.LambdaChangeOOP.observerPattern;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 16:14 2019/4/24
 **/
public interface Subject {

    void registerObserver(Observer o);
    void notifyObservers(String tweet);
}
