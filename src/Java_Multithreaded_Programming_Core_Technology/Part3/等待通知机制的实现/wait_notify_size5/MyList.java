package Java_Multithreaded_Programming_Core_Technology.Part3.等待通知机制的实现.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 11:00 2019/5/22
 */
public class MyList {

    private static List<String> list = new ArrayList<>();
    public static void add() {
        list.add("anyString");
    }
    public static int size() {
        return list.size();
    }


}
