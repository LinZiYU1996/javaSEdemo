package FunctionalProgram.AdvancedCollectionsandCollectors.ElementOrdering;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:19 2019/4/27
 */
public class Test {


    public static void main(String[] args) {


        //生成出现顺序

        Set<Integer> numbers = new HashSet<>(asList(4,3,2,1,0));

        List<Integer> sameOrder = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sameOrder);
    }
}
