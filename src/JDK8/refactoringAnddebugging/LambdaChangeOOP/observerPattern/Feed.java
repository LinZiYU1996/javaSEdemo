package JDK8.refactoringAnddebugging.LambdaChangeOOP.observerPattern;


import java.util.ArrayList;
import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 16:14 2019/4/24
 **/
public class Feed implements Subject{

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObservers(String tweet) {
        observers.forEach(o -> o.notify(tweet));
    }

    //这是一个非常直观的实现：Feed类在内部维护了一个观察者列表，一条新闻到达时，它就
    //进行通知


}
