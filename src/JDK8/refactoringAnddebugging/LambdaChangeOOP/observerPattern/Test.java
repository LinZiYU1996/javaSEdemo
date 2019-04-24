package JDK8.refactoringAnddebugging.LambdaChangeOOP.observerPattern;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * @Date 16:15 2019/4/24
 **/
public class Test {


    public static void main(String[] args) {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());
        f.notifyObservers("The queen said her favourite book is Java 8 in Action!");

        //毫不意外，《卫报》会特别关注这条新闻！


        //使用Lambda表达式
        //你可能会疑惑Lambda表达式在观察者设计模式中如何发挥它的作用。不知道你有没有注意
        //到，Observer接口的所有实现类都提供了一个方法：notify。新闻到达时，它们都只是对同一
        //段代码封装执行。Lambda表达式的设计初衷就是要消除这样的僵化代码。使用Lambda表达式后，
        //你无需显式地实例化三个观察者对象，直接传递Lambda表达式表示需要执行的行为即可：

        f.registerObserver((String tweet) -> {
            if (tweet != null && tweet.contains("money")){
                System.out.println("Breaking news in NY" + tweet);
            }
        });

        f.registerObserver((String tweet) -> {
            if (tweet != null && tweet.contains("queen")){
                System.out.println("Breaking news in London" + tweet);
            };
        });





    }

}
