package Java_Multithreaded_Programming_Core_Technology.Part3.通过管道进行线程间通信字节流.pipe_input_output;

import java.io.PipedOutputStream;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:23 2019/5/22
 */
public class WriteThread extends Thread{

    private WriteData writeData;
    private PipedOutputStream out;

    public WriteThread(WriteData writeData, PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        writeData.writeMethod(out);
    }


}
