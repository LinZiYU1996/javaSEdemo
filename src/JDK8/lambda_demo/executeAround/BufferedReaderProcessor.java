package JDK8.lambda_demo.executeAround;


import java.io.BufferedReader;
import java.io.IOException;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 使用函数式接口来传递行为
 * @Date 17:17 2019/4/21
 **/

@FunctionalInterface
public interface BufferedReaderProcessor {

    String process(BufferedReader bufferedReader) throws IOException;

}
