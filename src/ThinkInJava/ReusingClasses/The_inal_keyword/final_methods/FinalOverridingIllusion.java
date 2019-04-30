package ThinkInJava.ReusingClasses.The_inal_keyword.final_methods;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 类中所有的private方法都隐式地指定为是final的。 由于无法取用private方法，所以也就无
 * 法覆盖它。可以对private方法添加final 修饰词，但这井不能给该方法增加任何额外的意义。
 *
 *
 * @Date: Create in 20:22 2019/4/30
 */
public class FinalOverridingIllusion {

    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // You can upcast:
        OverridingPrivate op = op2;
        // But you can’t call the methods:
        //! op.f();
        //! op.g();
        // Same here:
        WithFinals wf = op2;
        //! wf.f();
        //! wf.g();

        //＂覆盖“只有在某方法是基类的接口的一部分时才会出现。即，
        // 必须能将一个对象向上转型为它的基本类型并调用相同的方法
        // 如果某方法为private,它就不是基 类的接口的一部分。它仅是一些隐藏于类中的程序代码，
        // 只不过是具有相同的名称而已。但如果在导出类中以相同的名称生成一个public、protected或包访问权限方法的话，
        // 该方法就不会产 生在基类中出现的＂仅具有相同名称＂的情况。此时你井没有覆盖该方法，仅是生成了一个新
        // 的方法。
        // 由干private方法无法触及而且能有效隐藏，所以除了把它看成是因为它所归属的类的组织结构的原因而存在外，其他任何事物都不蒂要考虑到它。


    }


}
