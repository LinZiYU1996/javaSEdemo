package JDK8.lambda_demo;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 *
 * @Date 16:49 2019/4/21
 **/
public class Test1 {

    public static void process(Runnable runnable){
        runnable.run();
    }

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello");    //使用Lambda
        Runnable r2 = new Runnable() {                      //使用匿名类
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        process(r1);

        process(r2);

        process( () -> System.out.println("Hello"));


    }

}
