package JDK8.refactoringAnddebugging.LambdaChangeOOP.chainResponsibility;

public class SpellCheckerProcessing extends ProcessingObject<String>{


    @Override
    protected String handleWork(String text) {
        return text.replaceAll("labda", "lambda");
    }
}
