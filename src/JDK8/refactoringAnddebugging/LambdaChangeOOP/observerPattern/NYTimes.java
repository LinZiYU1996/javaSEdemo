package JDK8.refactoringAnddebugging.LambdaChangeOOP.observerPattern;


/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 16:09 2019/4/24
 **/
public class NYTimes implements Observer{

    @Override
    public void notify(String tweet) {
        if(tweet != null && tweet.contains("money")){
            System.out.println("Breaking news in NY! " + tweet);
        }
    }
}
