package FunctionalProgram.Stream;


import FunctionalProgram.Data.Artist;
import FunctionalProgram.Data.Data;

import java.util.Iterator;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *   从外部迭代到内部迭代
 *
 *
 * @Date 10:56 2019/4/27
 **/
public class Compare {


    public static void main(String[] args) {


        //使用 for 循环计算来自伦敦的艺术家人数
        int count = 0;
        for(Artist artist : Data.artists){
            if ( artist.getOrigin().equals("London")) {
                count++;
            }
        }

        //尽管这样的操作可行，但存在几个问题。每次迭代集合类时，都需要写很多样板代码。将
        //for 循环改造成并行方式运行也很麻烦，需要修改每个 for 循环才能实现。
        //此外，上述代码无法流畅传达程序员的意图。for 循环的样板代码模糊了代码的本意，程
        //序员必须阅读整个循环体才能理解。若是单一的 for 循环，倒也问题不大，但面对一个满
        //是循环（尤其是嵌套循环）的庞大代码库时，负担就重了


        //使用迭代器计算来自伦敦的艺术家人数

        int count_ = 0;
        Iterator<Artist> iterator = Data.artists.iterator();
        while(iterator.hasNext()) {
            Artist artist = iterator.next();
            if (artist.getOrigin().equals("London")) {
                count_++;
            }
        }

        //外部迭代也有问题。首先，它很难抽象出本章稍后提及的不同操作；此外，它从本
        //质上来讲是一种串行化操作。总体来看，使用 for 循环会将行为和方法混为一谈


        //使用内部迭代计算来自伦敦的艺术家人数

        long count__ = Data.artists.stream()
                .filter(artist -> artist.getOrigin().equals("London"))
                .count();

        //每种操作都对应 Stream 接口的一个方法。为了找出来自伦敦的艺术家，需要对 Stream 对
        //象进行过滤：filter。过滤在这里是指“只保留通过某项测试的对象”。测试由一个函数完
        //成，根据艺术家是否来自伦敦，该函数返回 true 或者 false。由于 Stream API 的函数式编
        //程风格，我们并没有改变集合的内容，而是描述出 Stream 里的内容。count() 方法计算给
        //定 Stream 里包含多少个对象











    }
}
