package BlogForJDK8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:56 2019/4/29
 */
public class Test5 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum = nums.stream()
                .reduce(0,(x,y) -> x + y);
        System.out.println(sum);

        int sums = nums.stream()
                .reduce(0,Integer::sum);

        System.out.println(sums);

        Optional<Integer> max = nums.stream()
                .reduce(Integer::max);

        System.out.println(max);


    }

}
