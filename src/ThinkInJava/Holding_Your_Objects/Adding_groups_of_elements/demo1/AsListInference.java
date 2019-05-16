package ThinkInJava.Holding_Your_Objects.Adding_groups_of_elements.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * 当试图创建snow2时，Arrays.asListO中只有Powder类型，因此它会创建List<Powder>而
 * 不是List<SnoW>,
 * 尽管Collections.add.AIIO工作的很好，因为它从第一个参数中了解到了目标类型是什么。
 * 正如你从创建snow4的操作中所看到的，可以在Arrays.asL困tO中间插人一条“线索”，以告
 * 诉编译器对千由Arrays.asListO产生的List类型，实际的目标类型应该是什么。这称为显式类
 * 型 参数说明。
 *
 *
 * @Date: Create in 20:45 2019/5/16
 */
public class AsListInference {

    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder());
        // Won’t compile:
        // List<Snow> snow2 = Arrays.asList(
        // new Light(), new Heavy());
        // Compiler says:
        // found : java.util.List<Powder>
        // required: java.util.List<Snow>
        // Collections.addAll() doesn’t get confused:
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
        // Give a hint using an
        // explicit type argument specification:
        List<Snow> snow4 = Arrays.<Snow>asList(
                new Light(), new Heavy());
    }



}
