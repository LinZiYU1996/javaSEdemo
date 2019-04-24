package JDK8.refactoringAnddebugging.LambdaChangeOOP.observerPattern;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 你需要为Twitter这样的应用设计并
实现一个定制化的通知系统。想法很简单：好几家报纸机构，比如《纽约时报》《卫报》以及《世
界报》都订阅了新闻，他们希望当接收的新闻中包含他们感兴趣的关键字时，能得到特别通知。
 * @Date 16:08 2019/4/24
 **/
public interface Observer {

    //首先，你需要一个观察者接口，它将不同的观察者聚合在一起。它仅有一个名为notify的
    //方法，一旦接收到一条新的新闻，该方法就会被调用
    void notify(String tweet);



}
