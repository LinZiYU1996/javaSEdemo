package JDK8.theDefaultMethod.theProblems;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 20:09 2019/4/24
 **/
public interface Resizable {

    //Resizable接口的最初版本提供了下面这些方法：
    int getWidth();
    int getHeight();
    void setWidth(int width);
    void setHeight(int height);
    void setAbsoluteSize(int width, int height);
    //库上线使用几个月之后，你收到很多请求，要求你更新Resizable的实现，让Square、
    //Rectangle以及其他的形状都能支持setRelativeSize方法。为了满足这些新的需求，你发布
    //了第二版API

    void setRelativeSize(int wFactor, int hFactor);  //第二版 API 添 加了一个新方法


    //用户面临的窘境
    //对Resizable接口的更新导致了一系列的问题。首先，接口现在要求它所有的实现类添加
    //setRelativeSize方法的实现。但是用户最初实现的Ellipse类并未包含setRelativeSize
    //方法。向接口添加新方法是二进制兼容的，这意味着如果不重新编译该类，即使不实现新的方法，
    //现有类的实现依旧可以运行。不过，用户可能修改他的游戏，在他的Utils.paint方法中调用
    //setRelativeSize方法，因为paint方法接受一个Resizable对象列表作为参数。如果传递的
    //是一个Ellipse对象，程序就会抛出一个运行时错误，因为它并未实现setRelativeSize方法：

    //Exception in thread "main" java.lang.AbstractMethodError:
    // lambdasinaction.chap9.Ellipse.setRelativeSize(II)V
    //其次，如果用户试图重新编译整个应用（包括Ellipse类），他会遭遇下面的编译错误：
    //lambdasinaction/chap9/Ellipse.java:6: error: Ellipse is not abstract and does
    // not override abstract method setRelativeSize(int,int) in Resizable
    //最后，更新已发布API会导致后向兼容性问题。这就是为什么对现存API的演进，比如官方
    //发布的Java Collection API，会给用户带来麻烦。当然，还有其他方式能够实现对API的改进，但
    //是都不是明智的选择。比如，你可以为你的API创建不同的发布版本，同时维护老版本和新版本，
    //但这是非常费时费力的，原因如下。其一，这增加了你作为类库的设计者维护类库的复杂度。其
    //次，类库的用户不得不同时使用一套代码的两个版本，而这会增大内存的消耗，延长程序的载入
    //时间，因为这种方式下项目使用的类文件数量更多了。

    //这就是默认方法试图解决的问题。它让类库的设计者放心地改进应用程序接口，无需担忧对
    //遗留代码的影响，这是因为实现更新接口的类现在会自动继承一个默认的方法实现。


}
