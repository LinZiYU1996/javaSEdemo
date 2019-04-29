package BlogForJDK8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:29 2019/4/29
 */
public class Test4 {


    public static void main(String[] args) {

        Optional<Phone> phone = Data.phones.stream()
                .filter(Phone::isSupport5G)
                .findAny();
        System.out.println(phone.get().getVersion());

        List<Integer> someNums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> f = someNums.stream()
                .map( x -> x * x)
                .filter( x -> x % 3 == 0)
                .findFirst();

        System.out.println(f.get());

    }
}
