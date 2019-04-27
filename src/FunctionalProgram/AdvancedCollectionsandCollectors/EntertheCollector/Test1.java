package FunctionalProgram.AdvancedCollectionsandCollectors.EntertheCollector;

import FunctionalProgram.Data.Artist;
import FunctionalProgram.Data.Data;

import java.util.stream.Collectors;

/**
 * @Author: Mr.Lin
 * @Description:  字符串
 *
 *   很多时候，收集流中的数据都是为了在最后生成一个字符串。假设我们想将参与制作一张
 * 专辑的所有艺术家的名字输出为一个格式化好的列表
 *
 *
 * @Date: Create in 15:27 2019/4/27
 */
public class Test1 {


    public static void main(String[] args) {


        //使用 for 循环格式化艺术家姓名

        StringBuilder builder = new StringBuilder("[");
        for (Artist artist : Data.artists) {
            if (builder.length() > 1)
                builder.append(", ");
            String name = artist.getName();
            builder.append(name);
        }
        builder.append("]");
        String result = builder.toString();


        //使用流和收集器格式化艺术家姓名


        String result_ =
                Data.artists.stream()
                        .map(Artist::getName)
                        .collect(Collectors.joining(", ", "[", "]"));









    }
}
