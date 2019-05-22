package Java_Multithreaded_Programming_Core_Technology.Part3.通过管道进行线程间通信字节流.pipe_input_output;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:22 2019/5/22
 */
public class ReadData {

    public void readMethod(PipedInputStream in) {
        try {
            System.out.println("read : ");
            byte[] bytes = new byte[20];
            int length = in.read(bytes);
            while (length != -1) {
                String newData = new String(bytes, 0, length);
                System.out.print(newData);
                length = in.read(bytes);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
