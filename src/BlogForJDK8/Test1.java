package BlogForJDK8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:57 2019/4/28
 */
public class Test1 {


    public static void main(String[] args) {
        List<String> names = Data.phones.stream()
                .filter(d -> {
                    System.out.println("Filtering  : " + d.getVersion());
                    return d.getPrice() < 2000;
                })
                .map(d -> {
                    System.out.println("Maping  : " + d.getVersion());
                    return d.getVersion();
                })
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(names);

        Data.phones.stream().forEach(System.out::println);


        List<Phone> phoneSupported5G = Data.phones.stream()
                .filter(Phone::isSupport5G)
                .collect(Collectors.toList());


        List<Integer> numbers = Arrays.asList(1,2,5,9,4,4,8,9,5);
        numbers.stream()
                .filter( i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);


        List<Phone> phones = Data.phones.stream()
                .filter( d -> d.getPrice() > 2000)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(phones);

        List<Phone> phones_skip = Data.phones.stream()
                .filter( d -> d.getPrice() > 2000)
                .skip(2)
                .collect(Collectors.toList());



    }
}
