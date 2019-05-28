package Java_Multithreaded_Programming_Core_Technology.part6.序列化与反序列化的单例模式实现.singleton_7_1;

import java.io.*;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:22
* @Version:        1.0

*/
public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObject object1 = MyObject.getInstance();
            FileOutputStream out = new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream outObject = new ObjectOutputStream(out);
            outObject.writeObject(object1);
            outObject.close();
            out.close();
            System.out.println(object1.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(new File("myObjectFile.txt"));
            ObjectInputStream inObject = new ObjectInputStream(in);
            MyObject object2 = (MyObject) inObject.readObject();
            inObject.close();
            in.close();
            System.out.println(object2.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
