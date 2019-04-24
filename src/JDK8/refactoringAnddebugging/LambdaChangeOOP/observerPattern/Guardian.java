package JDK8.refactoringAnddebugging.LambdaChangeOOP.observerPattern;


/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 16:12 2019/4/24
 **/
public class Guardian implements Observer{


    @Override
    public void notify(String tweet) {
        if(tweet != null && tweet.contains("queen")){
            System.out.println("Yet another news in London... " + tweet);
        }
    }
}
