package Thread.volatiledemo;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 *
 * @Date 20:29 2019/4/20
 **/
public class Testvolatile {


    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final Testvolatile test = new Testvolatile();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<10;j++)
                        test.increase();
                };
            }.start();
        }

//        while(Thread.activeCount()>1)  //保证前面的线程都执行完
//            Thread.yield();
        System.out.println(test.inc);


        //按道理来说结果是100，但是运行下很可能是个小于100的值。
        // 有人可能会说volatile不是保证了可见性啊，一个线程对inc的修改，
        // 另外一个线程应该立刻看到啊！可是这里的操作inc++是个复合操作啊，包括读取inc的值，对其自增，然后再写回主存。
        //假设线程A，读取了inc的值为10，这时候被阻塞了，因为没有对变量进行修改，触发不了volatile规则。
        //线程B此时也读读inc的值，主存里inc的值依旧为10，做自增，然后立刻就被写回主存了，为11。
        //此时又轮到线程A执行，由于工作内存里保存的是10，所以继续做自增，再写回主存，11又被写了一遍。所以虽然两个线程执行了两次increase()
        // ，结果却只加了一次。
        //有人说，volatile不是会使缓存行无效的吗？但是这里线程A读取到线程B也进行操作之前，并没有修改inc值，所以线程B读取的时候，还是读的10。
        //又有人说，线程B将11写回主存，不会把线程A的缓存行设为无效吗？但是线程A的读取操作已经做过了啊，只有在做读取操作时，发现自己缓存行无效，
        // 才会去读主存的值，所以这里线程A只能继续做自增了。
        //综上所述，在这种复合操作的情景下，原子性的功能是维持不了了。但是volatile在上面那种设置flag值的例子里，由于对flag的读/写操作都是单步的，
        // 所以还是能保证原子性的。
        //要想保证原子性，只能借助于synchronized,Lock以及并发包下的atomic的原子操作类了，即对基本数据类型的 自增（加1操作），自减（减1操作）、
        // 以及加法操作（加一个数），减法操作（减一个数）进行了封装，保证这些操作是原子性操作。
        //

    }


}
