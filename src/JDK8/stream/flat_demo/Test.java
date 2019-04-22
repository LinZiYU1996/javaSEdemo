package JDK8.stream.flat_demo;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
*
 * @Author Mr.Lin
 * @Description //TODO
 * @Date 9:44 2019/4/22
 **/
public class Test {

    //你已经看到如何使用map方法返回列表中每个单词的长度了。让我们拓展一下：对于一张单
    //词表，如何返回一张列表，列出里面 各不相同的字符 呢？例如，给定单词列表
    //["Hello","World"]，你想要返回列表["H","e","l", "o","W","r","d"]。
    //你可能会认为这很容易，你可以把每个单词映射成一张字符表，然后调用distinct来过滤
    //重复的字符。第一个版本可能是这样的：
    //words.stream()
    // .map(word -> word.split(""))
    // .distinct()
    // .collect(toList());
    //这个方法的问题在于，传递给map方法的Lambda为每个单词返回了一个String[]（String
    //列表）。因此，map返回的流实际上是Stream<String[]>类型的。你真正想要的是用
    //Stream<String>来表示一个字符流


    //可以使用flatMap来解决这个问题


    public static void main(String[] args) {

        List<String> words = Arrays.asList("7878","ass ","pol");
        List<String> uniqueCharacters = words.stream()
                                        .map(w -> w.split(" "))  //将每个单词转换为由 其字母构成的数组
                                        .flatMap(Arrays::stream)   //将各个生成流扁平 化为单个流
                                        .distinct()
                                         .collect(Collectors.toList());
        System.out.println(uniqueCharacters);
    }


}
