package JDK8.refactoringAnddebugging;




/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *将实现单一抽象方法的匿名类转换为Lambda表达式
 * 因为匿名类是极其繁琐且容易出错的。采
   用Lambda表达式之后，你的代码会更简洁，可读性更好
 * @Date 15:11 2019/4/24
 **/
public class AnonymousToLambda {


    public static void main(String[] args) {

        //传统的方式使用匿名类
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Hello,Anonymous ");
            }
        };

        //新的方式，使用Lambda表达式
        Runnable r2 = () -> System.out.println(" Hello,Lambda");

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();


        System.out.println("====================================================");



        //但是某些情况下，将匿名类转换为Lambda表达式可能是一个比较复杂的过程①。首先，匿名
        //类和Lambda表达式中的this和super的含义是不同的。在匿名类中，this代表的是类自身，但
        //是在Lambda中，它代表的是包含类。其次，匿名类可以屏蔽包含类的变量，而Lambda表达式不
        //能（它们会导致编译错误），譬如下面

        int a = 10;

        Runnable r3 = () -> {
//            int a = 2;  //编译错误！
            System.out.println(a);
        };

        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                int a = 2;  //OK
                System.out.println(a);
            }
        };



        //在涉及重载的上下文里，将匿名类转换为Lambda表达式可能导致最终的代码更加晦
        //涩。实际上，匿名类的类型是在初始化时确定的，而Lambda的类型取决于它的上下文。通过下
        //面这个例子，我们可以了解问题是如何发生的。我们假设你用与Runnable同样的签名声明了一
        //个函数接口，我们称之为Task


//        interface Task{
//            public void execute();
//        }
//        public static void doSomething(Runnable r){ r.run(); }
//        public static void doSomething(Task a){ a.execute(); }


        //现在，你再传递一个匿名类实现的Task，没任何问题

//        doSomething(new Task() {
//            public void execute() {
//                System.out.println("Danger danger!!");
//            }
//        });


        //但是将这种匿名类转换为Lambda表达式时，就导致了一种晦涩的方法调用，因为Runnable
        //和Task都是合法的目标类型：

//        doSomething(() -> System.out.println("Danger danger!!"));
        //麻烦来了： doSomething(Runnable) 和
        //doSomething(Task)
        //都匹配该类型

//        你可以对Task尝试使用显式的类型转换来解决这种模棱两可的情况：

//        doSomething((Task)() -> System.out.println("Danger danger!!"));


    }



}
