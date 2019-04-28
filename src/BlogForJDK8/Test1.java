package BlogForJDK8;

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


    }
}
