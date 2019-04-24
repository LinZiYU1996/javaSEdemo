package JDK8.stream.spliterator_demo;


import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * @Date 11:05 2019/4/24
 **/
public class CountWord_Test{

    //开发一个简单的方
    //法来数数一个String中的单词数。


    //一个迭代式字数统计方法

    public static int countW(String s){
        int count = 0;
        boolean lastSpace = true;
        for (char c : s.toCharArray()) { //逐个遍历String中的所有字符
            if (Character.isWhitespace(c)) {
                lastSpace = true;
            } else {
                if (lastSpace) {
                    count++;  //上一个字符是空格，而当前遍历的字符不是空格时，将 单词计数器加一
                }
                lastSpace = false;
            }
        }
        return count;
    }


    public static int countW_1(Stream<Character> stream){
        WordCounter wordCounter = stream.reduce(new WordCounter(0,true),
                WordCounter::accumlate,
                WordCounter::combine);
        return wordCounter.getCounter();
    }


    public static void main(String[] args) {
        final String SENTENCE =
                " Nel mezzo del cammin di nostra vita " +
                        "mi ritrovai in una selva oscura" +
                        " ché la dritta via era smarrita ";


        System.out.println(countW(SENTENCE));

        System.out.println("=========================================");

        Stream<Character> stream = IntStream.range(0,SENTENCE.length())
                .mapToObj(SENTENCE::charAt);

        Stream<Character> stream1 = IntStream.range(0,SENTENCE.length())
                .mapToObj(SENTENCE::charAt);

        System.out.println(countW_1(stream));


        //尝试用并行流来加快字数统计

        System.out.println("=========================================");


        System.out.println(countW_1(stream1.parallel()));  //结果为26  错误

        //？问题的根源并不难找。因为原始的String在任意
        //位置拆分，所以有时一个词会被分为两个词，然后数了两次。这就说明，拆分流会影响结果，而
        //把顺序流换成并行流就可能使结果出错。
        //如何解决这个问题呢？解决方案就是要确保String不是在随机位置拆开的，而只能在词尾
        //拆开。要做到这一点，你必须为Character实现一个Spliterator，它只能在两个词之间拆开
        //String


        System.out.println("=========================================");








    }

}
