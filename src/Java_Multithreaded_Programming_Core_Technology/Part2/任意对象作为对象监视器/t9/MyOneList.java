package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 创建l个只能放1个元素的自定义集合工具类MyOneList.java
 *
 *
 * @Date: Create in 20:31 2019/5/20
 */
public class MyOneList {


    private List<String> list = new ArrayList<>();

    synchronized public void add(String data) {
        list.add(data);
    }

    synchronized public int getSize() {
        return list.size();
    }


}
