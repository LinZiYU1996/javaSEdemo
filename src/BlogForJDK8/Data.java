package BlogForJDK8;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 提供测试数据
 * @Date: Create in 10:21 2019/4/28
 */
public class Data {


    static List<Phone> phones = Arrays.asList(
            new Phone("红米7","小米",1400,true, Phone.Type.TEENAGES),
            new Phone("小米8","小米",2500,true, Phone.Type.PUBLICPEOPLE),
            new Phone("魅蓝6","魅族",1200,false, Phone.Type.TEENAGES),
            new Phone("诺基亚N9","诺基亚",500,false, Phone.Type.OLDPEOPLE),
            new Phone("华为Mate8","华为",3000,false, Phone.Type.BUSINESSMAN),
            new Phone("华为荣耀7","华为",1300,false, Phone.Type.TEENAGES),
            new Phone("OPPOR10","OPPO",2300,true, Phone.Type.PUBLICPEOPLE),
            new Phone("IPhoneX","苹果",5000,true, Phone.Type.PUBLICPEOPLE)

    );

}
