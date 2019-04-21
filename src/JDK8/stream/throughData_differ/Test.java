package JDK8.stream.throughData_differ;


import JDK8.stream.Dish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 使用Collection接口需要用户去做迭代（比如用for-each），这称为外部迭代。 相反，
Streams库使用内部迭代——它帮你把迭代做了，还把得到的流值存在了某个地方，你只要给出
一个函数说要干什么就可以了。
 * @Date 21:28 2019/4/21
 **/
public class Test {

    public static void main(String[] args) {
        //集合：用for-each循环外部迭代
        List<String> names = new ArrayList<>();
        ArrayList<Dish> menu = new ArrayList<>();
        for(Dish d: menu){
            names.add(d.getName());
        }

        //请注意，for-each还隐藏了迭代中的一些复杂性。for-each结构是一个语法糖，它背后的
        //东西用Iterator对象表达出来更要丑陋得多


        //集合：用背后的迭代器做外部迭代
        List<String> names_2 = new ArrayList<>();
        Iterator<Dish> iterator = menu.iterator();
        while(iterator.hasNext()) {
            Dish d = iterator.next();
            names.add(d.getName());
        }

        //流：内部迭代
        List<String> names_1 = menu.stream()
                .map(Dish::getName)
                .collect(toList());





    }

}
