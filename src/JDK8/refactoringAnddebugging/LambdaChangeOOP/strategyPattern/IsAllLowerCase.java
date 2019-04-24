package JDK8.refactoringAnddebugging.LambdaChangeOOP.strategyPattern;


/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 15:49 2019/4/24
 **/
public class IsAllLowerCase implements ValidationStrategy{

    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
