package ThinkInJava.Type_Information.Generic_class_references;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 在JavaSES中，Class<?>优千平凡的Class,即便它们是
 * 等价的，
 * 并且平凡的Class如你所见，不会产生编译器警告信息。
 * Class<?>的好处是它表示你并非是碰巧或者由千疏忽，而使用了一个非具体的类引用，
 * 你就是选择了非具体的版本。
 *
 *
 * @Date: Create in 18:01 2019/5/18
 */
public class WildcardClassReferences {

    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }


}
