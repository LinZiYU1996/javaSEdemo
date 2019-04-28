package BlogForJDK8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        System.out.println(versions.toString());



        List<String> priceLessThan2000Names_By8 = Data.phones.stream()
                .filter(d -> d.getPrice() < 2000)
                .sorted(Comparator.comparing(Phone::getPrice))
                .map(Phone::getVersion)
                .collect(toList());

//        System.out.println(priceLessThan2000_By8);


    }

}
