package JDK8.refactoringAnddebugging.LambdaChangeOOP.strategyPattern;


/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 15:50 2019/4/24
 **/
public class IsNumeric implements ValidationStrategy{

    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
