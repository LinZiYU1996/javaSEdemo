package Thread.JMM_demo;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 原子性是指一个操作是不可中断的。即使是在多个线程一起执行的时候，一个操作一旦开始，就不会被其他线程干扰。
比如，对于一个静态全局变量inti，两个线程同时对它赋值，线程A给它赋值1，线程B给它赋值为-1。
* 那么不管这两个线程以何种方式、何种步调工作，i的值要么是1，要么是-1。线程A和线程B之间是没有干扰的。这就是原子性的一个特点，不可被中断。
但如果我们不使用int 型数据而使用long型数据，可能就没有那么幸运了。对于32位系统来说，
* long型数据的读写不是原子性的（因为long型数据有64位）。
 * @Date 20:18 2019/4/22
 **/
public class TestAtomicity {


            public static long t = 0;
            public static class ChangeT implements Runnable{
                private long to;

                public ChangeT(long to) {
                    this.to = to;
                }

                @Override
                public void run() {
                    while (true) {
                        TestAtomicity.t = to;
                        Thread.yield();
                    }
                }
            }


            public static class ReadT implements Runnable{

                @Override
                public void run() {
                    while (true) {
                        long temp = TestAtomicity.t;
                        if (temp != 111L && temp != -999L && temp != 333L && temp != -444L) {
                            System.out.println(temp);
                        }
                        Thread.yield();
                    }
                }
            }

    public static void main(String[] args) {
        new Thread(new ChangeT(111L)).start();

        new Thread(new ChangeT(-999L)).start();

        new Thread(new ChangeT(333L)).start();

        new Thread(new ChangeT(-444L)).start();

        new Thread(new ReadT()).start();

        //上述代码有4个线程对long型数据t进行赋值，分别对t赋值为111、-999、333、444。然后，
        // 有一个读取线程，读取这个t的值。一般来说，t的值总是这4个数值中的一个。
        // 这当然也是我们的期望了。但很不幸，在32位的Java虚拟机中，未必总是这样。
        //如果读取线程ReadT总是读到合理的数据，那么这个程序应该没有任何输出。但是，
        // 实际上，这个程序一旦运行，就会大量输出以下信息：（再次强调，使用32位虚拟机）
    }


















}
