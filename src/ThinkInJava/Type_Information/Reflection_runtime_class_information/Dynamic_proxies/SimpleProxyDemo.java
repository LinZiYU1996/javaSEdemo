package ThinkInJava.Type_Information.Reflection_runtime_class_information.Dynamic_proxies;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 代理是基本的设计模式之一，它是你为了提供额外的或不同的操作，
 * 而插入的用来代替 “实际”对象的对象。这些操作通常涉及与“实际”对象的通信
 * ，因此代理通常充当着中间人的 角色。下面是一个用来展示代理结构的简单示例：
 *
 *
 * @Date: Create in 10:32 2019/5/19
 */
public class SimpleProxyDemo {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }

//因为consumer()接受的Interface,所以它无法知道正在获得的到底是Rea.lObject还是
//impleProxy, 因为这二者都实现了Interface。但是SimpleProxy已经被插人到了客户端
// 和 RealObject之间， 因此它会执行操作， 然后调用RealObject上相同的方法。
//在任何时刻，只要你想要将额外的操作从 “实际” 对象中分离到不同的地方，
// 特别是当你希望能够很容易地做出修改， 从没有使用额外操作转为使用这些操作？ 或者反过来时，
// 代理就显得很有用（设计模式的关键就是封装修改一因此你需要修改事务以证明这种模式的正确性）。
// 例如， 如果你希望跟踪对RealObject中的方法的调用， 或者希望度扯这些调用的开销，
// 那么你 应该怎样做呢？这些代码肯定是你不希望将其合并到应用中的代码， 因此代理使得你可以很容
// 易地添加或移除它们。
//Java的动态代理比代理的思想更向前迈进了一步， 因为它可以动态地创建代理并动态地处理
//回 对所代理方法的调用。 在动态代理上所做的所有调用都会被重定向到单一的调用处理器上






}
