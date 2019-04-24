package JDK8.refactoringAnddebugging.LambdaChangeOOP.strategyPattern;


/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 15:51 2019/4/24
 **/
public class Validator {

    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String s){
        return strategy.execute(s);
    }

    public static void main(String[] args) {
        Validator numV = new Validator(new IsNumeric());
        System.out.println(numV.validate("aaaaa"));

        Validator lowerV = new Validator(new IsAllLowerCase());
        System.out.println(lowerV.validate("bbbb"));

        //使用Lambda表达式
        //到现在为止，你应该已经意识到ValidationStrategy是一个函数接口了（除此之外，它
        //还与Predicate<String>具有同样的函数描述）。这意味着我们不需要声明新的类来实现不同
        //的策略，通过直接传递Lambda表达式就能达到同样的目的，并且还更简洁


        Validator numVV = new Validator((String s) -> s.matches("[a-z]+"));
        System.out.println(numVV.validate("aaaaa"));


        Validator lowerVV = new Validator((String s) -> s.matches("\\d+"));
        System.out.println(lowerVV.validate("bbbbbb"));

        //Lambda表达式避免了采用策略设计模式时僵化的模板代码




    }

}
