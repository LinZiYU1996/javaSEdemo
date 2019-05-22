package Java_Multithreaded_Programming_Core_Technology.Part3.通过管道进行线程间通信字节流.pipe_input_output;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:23 2019/5/22
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write : ");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            System.out.println("====================================");


            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
