package JDK8.lambda_demo.executeAround;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 17:01 2019/4/21
 **/
public class Test {


    //从一个文件中读取一行所需的模板代码

    //现在这段代码是有局限的。你只能读文件的第一行。如果你想要返回头两行，甚至是返回使
    //用最频繁的词，该怎么办呢？在理想的情况下，你要重用执行设置和清理的代码，并告诉
    //processFile方法对文件执行不同的操作。这听起来是不是很耳熟？是的，你需要把
    //processFile的行为参数化。你需要一种方法把行为传递给processFile，以便它可以利用
    //BufferedReader执行不同的行为
    public static String processFIle() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
        return bufferedReader.readLine();
    }

    public static String processFIle(BufferedReaderProcessor processor) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
        return  processor.process(bufferedReader);
    }

    public static void main(String[] args) throws IOException {

        //处理一行
        String oneLine = processFIle((BufferedReader b) -> b.readLine());

        //处理两行
        String twoLines = processFIle((BufferedReader b) -> b.readLine() + b.readLine());



    }

}
