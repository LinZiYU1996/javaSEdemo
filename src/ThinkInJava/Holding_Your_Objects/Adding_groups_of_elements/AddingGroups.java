package ThinkInJava.Holding_Your_Objects.Adding_groups_of_elements;

import java.util.*;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 在java.util包中的Arrays和Collections类中都有很多实用方法，
 * 可以在一个Collection中添加 一组元素。
 * Arrays.asListO方法接受一个数组或是一个用逗号分隔的元素列表（使用可变参数），
 * 井将其转换为一个List对象。 CoUections.addAIIO方法接受一个Collection对象，
 * 以及一个数组或是一个用逗号分割的列表， 将元素添加到Collection中。
 * 下面的示例展示了这两个方法， 以及更加传统addAIIO方法， 所有Collection类型都包含该方法：
 *
 *
 *
 * @Date: Create in 20:39 2019/5/16
 */
public class AddingGroups {

    public static void main(String[] args) {
        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = { 6, 7, 8, 9, 10 };
        collection.addAll(Arrays.asList(moreInts));
        // Runs significantly faster, but you can’t
        // construct a Collection this way:
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        // Produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // OK -- modify an element
        // list.add(21); // Runtime error because the
        // underlying array cannot be resized.
    }





}
