package Java_Multithreaded_Programming_Core_Technology.Part2.任意对象作为对象监视器.t9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:31 2019/5/20
 */
public class MyService {

    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }


}
