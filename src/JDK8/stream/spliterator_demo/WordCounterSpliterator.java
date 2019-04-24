package JDK8.stream.spliterator_demo;


import java.util.Spliterator;
import java.util.function.Consumer;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *
 * @Date 15:03 2019/4/24
 **/
public class WordCounterSpliterator implements Spliterator<Character> {

    private final String string;
    private int currentChar = 0;
    public WordCounterSpliterator(String string) {
        this.string = string;
    }
    @Override
    public boolean tryAdvance(Consumer<? super Character> action) {
        action.accept(string.charAt(currentChar++)); //处理当前字符
        return currentChar < string.length(); //如果还有字符要处理，则返回true
    }
    @Override
    public Spliterator<Character> trySplit() {
        int currentSize = string.length() - currentChar;
        if (currentSize < 10) {
            return null;  //返回null表示要解析的 String 已经足够小，可 以顺序处理
        }
        for (int splitPos = currentSize / 2 + currentChar;
             splitPos < string.length(); splitPos++) { //将试探拆分位置设定为 要解析的 String的中 间
            if (Character.isWhitespace(string.charAt(splitPos))) {//让拆分位置前进直到下 一个空格
                Spliterator<Character> spliterator = //创建一个新WordCounterSpliterator 来解析String 从开始到拆分 位置的部分
                        new WordCounterSpliterator(string.substring(currentChar,
                                splitPos));
                currentChar = splitPos;  //将这个WordCounterSpliterator 的起始位置设为拆分位置
                return spliterator;
            }
        }
        return null;
    }
    @Override
    public long estimateSize() {
        return string.length() - currentChar;
    }
    @Override
    public int characteristics() {
        return ORDERED + SIZED + SUBSIZED + NONNULL + IMMUTABLE;
    }

}
