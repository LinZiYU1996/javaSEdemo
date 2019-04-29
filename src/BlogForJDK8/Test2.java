package BlogForJDK8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:35 2019/4/28
 */
public class Test2 {


    public static void main(String[] args) {

        List<String> names = Data.phones.stream()
                .map(Phone::getVersion)
                .collect(Collectors.toList());

        System.out.println(names.toString());

        List<String> words = Arrays.asList("hello","abcdefk","alsjjfjfje");
        List<String> uniqueC = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueC);


        words.stream()
                .map(word -> word.split(""))
                .distinct()
                .collect(Collectors.toList());






















    }
}
