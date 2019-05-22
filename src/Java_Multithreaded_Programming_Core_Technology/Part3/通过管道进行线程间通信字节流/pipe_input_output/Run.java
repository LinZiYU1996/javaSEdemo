package Java_Multithreaded_Programming_Core_Technology.Part3.通过管道进行线程间通信字节流.pipe_input_output;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 一
 * 管道流(pipeStream)是 种特殊的流，用千在不
 * 同线程间直接传送数据。一个线程发送数据到输出管道，另一个线程从输入管道中读数据。 通过使用管道，实现不同线程间的通信
 * ，而无须借助千类似临时文件之类的东西。
 *
 *
 *
 * @Date: Create in 20:22 2019/5/22
 */
public class Run {

    public static void main(String[] args) throws IOException, InterruptedException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();

        //使用connect的作用是 使两个Stream之间产生同行链接，这样才可以将数据进行输出输入。
        //in.connect(out)
        out.connect(in);

        ReadThread readThread = new ReadThread(readData, in);
        WriteThread writeThread = new WriteThread(writeData, out);

        readThread.start();

        Thread.sleep(2000);

        writeThread.start();
    }


}
