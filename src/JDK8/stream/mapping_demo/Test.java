package JDK8.stream.mapping_demo;


import JDK8.stream.demo1.Dish;
import JDK8.stream.screeningAndslicing.Data;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/*
*
 * @Author Mr.Lin
 * @Description //TODO
 * @Date 9:36 2019/4/22
 **/
public class Test {


    //流支持map方法，它会接受一个函数作为参数。这个函数会被应用到每个元素上，并将其映
    //射成一个新的元素（使用映射一词，是因为它和转换类似，但其中的细微差别在于它是“创建一
    //个新版本”而不是去“修改”）

    public static void main(String[] args) {
        List<String> dishNames = Data.menu.stream()
                                .map(Dish::getName)
                                .collect(toList());
        System.out.println(dishNames);

        System.out.println("==================================");

        //给定一个单词列表，你想要返回另
        //一个列表，显示每个单词中有几个字母。怎么做呢？你需要对列表中的每个元素应用一个函数。
        //这听起来正好该用map方法去做！应用的函数应该接受一个单词，并返回其长度。你可以像下面
        //这样，给map传递一个方法引用String::length来解决这个问题

        List<String> words = Arrays.asList("Java 8","Lamdba","In","Action");
        List<Integer> wordLengths = words.stream()
                                    .map(String::length)
                                    .collect(toList());
        System.out.println(wordLengths);

    }


}
