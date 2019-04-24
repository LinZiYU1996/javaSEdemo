package JDK8.refactoringAnddebugging.LambdaChangeOOP.observerPattern;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 16:12 2019/4/24
 **/
public class LeMonde  implements Observer{


    @Override
    public void notify(String tweet) {
        if(tweet != null && tweet.contains("wine")){
            System.out.println("Today cheese, wine and news! " + tweet);
        }
    }
}
