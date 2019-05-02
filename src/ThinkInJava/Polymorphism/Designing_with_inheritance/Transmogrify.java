package ThinkInJava.Polymorphism.Designing_with_inheritance;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 其是不能十分确定应该使用哪一种方式时。组合不会强
 * 制我们的程序设计进人继承的层次结构中。而且，组合更加灵活，因为它可以动态选择类型
 *（因此也就选择了行为），相反，继承在编译时就需要知道确切类型
 *
 * @Date: Create in 11:58 2019/5/2
 */
public class Transmogrify {

    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();

        //在这里，Stage对象包含一个对Actor的引用，而Actor被初始化为HappyActor对象。这意味

        //着performPlayO会产生某种特殊行为。既然引用在运行时可以与另一个不同的对象重新绑定起来，
        //所以SadActor对象的引用可以在actor中被替代，然后由performPlayO产生的行为也随之改变。医习
        //一
        //这样 来，我们在运行期间获得了动态灵活性



    }


}
