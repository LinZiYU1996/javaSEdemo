package JDK8.behavior_parameterization.test2_2;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 下面的代码执行时会有什么样的输出呢，4、5、6还是42？
 * @Date 15:46 2019/4/21
 **/
public class MeaningOfThis {

    public final int value = 4;

    public void doIt(){
        int value = 6;
        Runnable runnable = new Runnable() {
            public final int value = 5;

            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        MeaningOfThis meaningOfThis = new MeaningOfThis();
        meaningOfThis.doIt();

        //答案是5，因为this指的是包含它的Runnable，而不是外面的类MeaningOfThis
    }
}
