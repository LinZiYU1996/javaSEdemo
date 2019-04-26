package JDK8.functionalProgramingSkills.persistentDataStructure.damageAndfunctionUpdate;


/*
*
 * @Author Mr.Lin
 * @Description //
 * @Date 17:44 2019/4/26
 **/
public class Test {

    //假设你有几个相互分隔的TrainJourney对象分别代表从X到Y和从Y到Z的旅行。你希望创
    //建一段新的旅行，它能将两个TrainJourney对象串接起来（即从X到Y再到Z）

    //一种方式是采用简单的传统命令式的方法将这些火车旅行对象链接起来

    public static TrainJourney link(TrainJourney a, TrainJourney b){
        if (a==null) return b;
        TrainJourney t = a;
        while(t.onward != null){
            t = t.onward;
        }
        t.onward = b;
        return a;

        //这个方法是这样工作的，它找到TrainJourney对象a的下一站，将其由表示a列表结束的
        //null替换为列表b（如果a不包含任何元素，你需要进行特殊处理）。
        //这就出现了一个问题：假设变量firstJourney包含了从X地到Y地的线路，另一个变量
        //secondJourney包含了从Y地到Z地的线路。如果你调用link(firstJourney, secondJourney)
        //方法，这段代码会破坏性地更新 firstJourney ，结果 secondJourney 也会加被入到
        //firstJourney，最终请求从X地到Z地的用户会如其所愿地看到整合之后的旅程，不过从X地到Y
        //地的旅程也被破坏性地更新了。这之后，变量firstJourney就不再代表从X到Y的旅程，而是一
        //个新的从X到Z的旅程了！这一改动会导致依赖原先的firstJourney代码失效！假设
        //firstJourney表示的是清晨从伦敦到布鲁塞尔的火车，这趟车上后一段的乘客本来打算要去布
        //鲁塞尔，可是发生这样的改动之后他们莫名地多走了一站，最终可能跑到了科隆。现在你大致了
        //解了数据结构修改的可见性会导致怎样的问题了，作为程序员，我们一直在与这种缺陷作斗争。
    }


    //函数式编程解决这一问题的方法是禁止使用带有副作用的方法。如果你需要使用表示计算结
    //果的数据结果，那么请创建它的一个副本而不要直接修改现存的数据结构。这一最佳实践也适用
    //于标准的面向对象程序设计。不过，对这一原则，也存在着一些异议，比较常见的是认为这样做


    //会导致过度的对象复制，有些程序员会说“我会记住那些有副作用的方法”或者“我会将这些写
    //入文档”。但这些都不能解决问题，这些坑都留给了接受代码维护工作的程序员。采用函数式编
    //程方案的代码


    public static TrainJourney append(TrainJourney a, TrainJourney b){
        return a==null ? b : new TrainJourney(a.price, append(a.onward, b));

        //很明显，这段代码是函数式的（它没有做任何修改，即使是本地的修改），它没有改动任何
        //现存的数据结构。不过，也请特别注意，这段代码有一个特别的地方，它并未创建整个新
        //TrainJourney对象的副本——如果a是n个元素的序列，b是m个元素的序列，那么调用这个函
        //数后，它返回的是一个由n+m个元素组成的序列，这个序列的前n个元素是新创建的，而后m个元
        //素和TrainJourney对象b是共享的。另外，也请注意，用户需要确保不对append操作的结果进
        //行修改，因为一旦这样做了，作为参数传入的TrainJourney对象序列b就可能被破坏


    }







}
