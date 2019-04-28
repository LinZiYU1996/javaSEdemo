package BlogForJDK8;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:38 2019/4/28
 */
public class Test {

    public static void main(String[] args) {

        List<Phone> priceLessThan2000 = new ArrayList<>();
        for(Phone phone : Data.phones){
            if (phone.getPrice() < 2000) {
                priceLessThan2000.add(phone);
            }
        }

        Collections.sort(priceLessThan2000, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return Integer.compare(o1.getPrice(),o2.getPrice());
            }
        });

        List<String> versions = new ArrayList<>();
        for(Phone phone : priceLessThan2000){
            versions.add(phone.getVersion());
        }

//        System.out.println(versions.toString());



        List<String> priceLessThan2000Names_By8 = Data.phones.stream()
                .filter(d -> d.getPrice() < 2000)
                .sorted(Comparator.comparing(Phone::getPrice))
                .map(Phone::getVersion)
                .collect(toList());

//        System.out.println(priceLessThan2000_By8);



        List<String> threeHighPhones = Data.phones.stream()//从手机列表里获取流，建立操作流水线
                .filter( d -> d.getPrice() > 2000)//首先选出价钱高于2000的手机
                .map(Phone::getVersion)//获取手机型号
                .limit(3)//只选择头三个
                .collect(toList());//将结果保存在另一个List里面

        System.out.println(threeHighPhones);


        List<String> title = Arrays.asList("1","2","3");
        Stream<String> stringStream = title.stream();
        stringStream.forEach(System.out::println);
        stringStream.forEach(System.out::println);  //抛出错误，java.lang.IllegalStateException:流已被操作或关闭


        List<String> names = new ArrayList<>();
        for(Phone phone : Data.phones){//显示迭代手机列表
            names.add(phone.getVersion());//把型号添加进集合
        }


        List<String> names_ = Data.phones.stream()
                .map(Phone::getVersion)
                .collect(toList());







    }

}
