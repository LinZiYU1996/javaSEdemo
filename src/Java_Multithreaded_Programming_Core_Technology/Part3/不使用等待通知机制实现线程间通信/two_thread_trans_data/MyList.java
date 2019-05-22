package Java_Multithreaded_Programming_Core_Technology.Part3.不使用等待通知机制实现线程间通信.two_thread_trans_data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:41 2019/5/22
 */
public class MyList {

    List<String> list = new ArrayList<>();

    public void add() {
        list.add("谁谁");
    }

    public int size() {
        return list.size();
    }


}
