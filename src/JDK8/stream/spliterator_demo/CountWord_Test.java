package JDK8.stream.spliterator_demo;


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
        return wordCounter::getCounter;
    }


    public static void main(String[] args) {
        final String SENTENCE =
                " Nel mezzo del cammin di nostra vita " +
                        "mi ritrovai in una selva oscura" +
                        " ché la dritta via era smarrita ";


        System.out.println(countW(SENTENCE));
    }

}
