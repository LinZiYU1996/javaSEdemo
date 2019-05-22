package Java_Multithreaded_Programming_Core_Technology.Part3.通过管道进行线程间通信字节流.pipe_input_output;

import java.io.PipedInputStream;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:22 2019/5/22
 */
public class ReadThread extends Thread{

    private ReadData read;
    private PipedInputStream in;

    public ReadThread(ReadData read, PipedInputStream in) {
        this.read = read;
        this.in = in;
    }

    @Override
    public void run() {
        super.run();
        read.readMethod(in);
    }


}
