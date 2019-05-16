package ThinkInJava.Holding_Your_Objects.System.out.printlning_containers;

import java.util.*;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * 查看输出会发现，默认的打印行为
 * （使用容器提供的toString()方法）即可生成可读性很好的结果。
 * Collection打印出来的内容用方括号括住，每个元素由逗号分隔。Map则用大括号括住，
 * 西键与值由等号联系（键在等号左边，值在右边）。
 *
 *
 *
 *
 *
 * @Date: Create in 20:58 2019/5/16
 */
public class PrintingContainers {

    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String,String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new LinkedHashMap<String,String>()));
    }
}
