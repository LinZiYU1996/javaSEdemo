package JDK8.refactoringAnddebugging.LambdaChangeOOP.chainResponsibility;



/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 19:35 2019/4/24
 **/
public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> successor;


    public void setSuccessor(ProcessingObject<T> successor){
        this.successor = successor;
    }


    //handle方法提供了如何进行
    //工作处理的框架。不同的处理对象可以通过继承ProcessingObject类，提供handleWork方法
    //来进行创建。
    public T handle(T input){
        T r = handleWork(input);
        if(successor != null){
            return successor.handle(r);
        }
        return r;
    }


    abstract protected T handleWork(T input);

}
