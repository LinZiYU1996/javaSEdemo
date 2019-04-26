package JDK8.functionalProgramingSkills.persistentDataStructure.damageAndfunctionUpdate;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 17:54 2019/4/26
 **/
public class TreeProcessor {

    public static int lookup(String k, int defaultval, Tree t) {
        if (t == null) return defaultval;
        if (k.equals(t.key)) return t.val;
        return lookup(k, defaultval,
                k.compareTo(t.key) < 0 ? t.left : t.right);
    }
    // 处理Tree的其他方法


    //如何更新与某个
    //键对应的值

//    public static void update(String k, int newval, Tree t) {
//        //简化起见，我们假设键已经存在于这个树中了
//        if (t == null) { /* 应增加一个新的节点 */ }
//        else if (k.equals(t.key)) t.val = newval;
////        else update(k, newval, k.compareTo(t.key) < 0 ? t.left : t.right);
//    }

    //对这个例子，增加一个新的节点会复杂很多；最简单的方法是让update直接返回它刚遍历
    //的树（除非你需要加入一个新的节点，否则返回的树结构是不变的）。现在，这段代码看起来已
    //经有些臃肿了（因为update试图对树进行原地更新，它返回的是跟传入的参数同样的树，但是
    //如果最初的树为空，那么新的节点会作为结果返回）
//    public static Tree update(String k, int newval, Tree t) {
////        if (t == null)
////            t = new Tree(k, newval, null, null);
////        else if (k.equals(t.key))
////            t.val = newval;
////        else if (k.compareTo(t.key) < 0)
//////            t.left = update(k, newval, t.left);
////        else
//////            t.right = update(k, newval, t.right);
////        return t;
////    }


    //注意，这两个版本的update都会对现有的树进行修改，这意味着使用树存放映射关系的所有用户都会感知到这些修改。




    //这一问题如何通过函数式的方法解决呢？你需要为新的键值对创建一个新的节点，除
    //此之外你还需要创建从树的根节点到新节点的路径上的所有节点。通常而言，这种操作的代价并
    //不太大，如果树的深度为d，并且保持一定的平衡性，那么这棵树的节点总数是2d
    //，这样你就只
    //需要重新创建树的一小部分节点了


    public static Tree fupdate(String k, int newval, Tree t) {
        return (t == null) ?
                new Tree(k, newval, null, null) :
                k.equals(t.key) ?
                        new Tree(k, newval, t.left, t.right) :
                        k.compareTo(t.key) < 0 ?
                                new Tree(t.key, t.val, fupdate(k,newval, t.left), t.right) :
                                new Tree(t.key, t.val, t.left, fupdate(k,newval, t.right));
    }


    //这段代码中，我们通过一行语句进行的条件判断，没有采用if-then-else这种方式，目的
    //是希望强调一个思想，那就是该函数体仅包含一条语句，没有任何副作用。不过你也可以按照自
    //己的习惯，使用if-then-else这种方式，在每一个判断结束处使用return返回。
    //那么，update 和fupdate之间的区别到底是什么呢？我们注意到，前文中方法update有这
    //样一种假设，即每一个update的用户都希望共享同一份数据结构，也希望能了解程序任何部分
    //所做的更新。因此，无论任何时候，只要你使用非函数式代码向树中添加某种形式的数据结构，
    //请立刻创建它的一份副本，因为谁也不知道将来的某一天，某个人会突然对它进行修改，这一点
    //非常重要（不过也经常被忽视）。与之相反，fupdate是纯函数式的。它会创建一个新的树，并
    //将其作为结果返回，通过参数的方式实现共享。你使用了一个树
    //结构，树的每个节点包含了person对象的姓名和年龄。调用fupdate不会修改现存的树，它会
    //在原有树的一侧创建新的节点，同时保证不损坏现有的数据结构


//这种函数式数据结构通常被称为持久化的——数据结构的值始终保持一致，不受其他部分变
//化的影响——这样，作为程序员的你才能确保fupdate不会对作为参数传入的数据结构进行修
//改。不过要达到这一效果还有一个附加条件：这个约定的另一面是，所有使用持久化数据结构的
//用户都必须遵守这一“不修改”原则。如果不这样，忽视这一原则的程序员很有可能修改fupdate
//的结果（比如，修改Emily的年纪为20岁）。这会成为一个例外（也是我们不期望发生的）事件，
//为所有使用该结构的方法感知，并在之后修改作为参数传递给fupdate的数据结构。







}
