package JDK8.stream.spliterator_demo;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 用来在遍历Character流时计数的类
 *
 *
 * 因为Java没有元组（tuple，用来表示由异类元素组成的有序列表的结构，不需要包装对象），
   所以必须创建一个新类WordCounter来把这个状态封装起来
 * @Date 11:10 2019/4/24
 **/
public class WordCounter {

    private final int counter;

    private final boolean lastSpace;

    public WordCounter(int counter, boolean lastSpace) {
        this.counter = counter;
        this.lastSpace = lastSpace;
    }


    //和迭代算法一样 ，
    //accumulate 方法一
    //个个遍历Character
    public WordCounter accumlate(Character c){
        if (Character.isWhitespace(c)) {
            return  lastSpace ? this : new WordCounter(counter,true);
        } else  {
            return lastSpace ? new WordCounter(counter + 1,false) : this;//上一个字符是空格，而当前遍历的字符不是 空格时，将单词计数器 加一
        }
    }


    //合并两个WordCounter，把其
    //计数器加起来
    public WordCounter combine(WordCounter wordCounter){
        return new WordCounter(counter + wordCounter.counter,wordCounter.lastSpace);  //仅需要计数器的总和，无需关 心lastSpace
    }

    public int getCounter(){
        return counter;
    }


    //在这个列表中，accumulate方法定义了如何更改WordCounter的状态，或更确切地说是用
    //哪个状态来建立新的WordCounter，因为这个类是不可变的。每次遍历到Stream中的一个新的
    //Character时，就会调用accumulate方法。具体来说，就像countWordsIteratively方法一样，当上一个字符是空格，新字符不是空格时，计数器就加一。
    //调用第二个方法 combine 时，会对作用于 Character 流的两个不同子部分的两个
    //WordCounter的部分结果进行汇总，也就是把两个WordCounter内部的计数器加起来





}
