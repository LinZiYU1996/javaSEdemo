package JDK8.refactoringAnddebugging.LambdaChangeOOP.chainResponsibility;




/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 19:37 2019/4/24
 **/
public class HeaderTextProcessing extends ProcessingObject<String>{


    @Override
    protected String handleWork(String text) {
        return "From Raoul, Mario and Alan: " + text;
    }
}
