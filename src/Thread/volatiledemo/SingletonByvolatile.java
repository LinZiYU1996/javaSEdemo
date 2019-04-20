package Thread.volatiledemo;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 单例模式的实现，典型的双重检查锁定（DCL）
 * @Date 20:34 2019/4/20
 **/
public class SingletonByvolatile {

    private volatile static SingletonByvolatile instance = null;

    private SingletonByvolatile() {

    }

    public static SingletonByvolatile getInstance() {
        if(instance==null) {
            synchronized (SingletonByvolatile.class) {
                if(instance==null)
                    instance = new SingletonByvolatile();
            }
        }
        return instance;
    }



}
