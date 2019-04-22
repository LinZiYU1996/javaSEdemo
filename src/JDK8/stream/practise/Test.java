package JDK8.stream.practise;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
(2) 交易员都在哪些不同的城市工作过？
(3) 查找所有来自于剑桥的交易员，并按姓名排序。
(4) 返回所有交易员的姓名字符串，按字母顺序排序。
(5) 有没有交易员是在米兰工作的？
(6) 打印生活在剑桥的交易员的所有交易额。
(7) 所有交易中，最高的交易额是多少？
(8) 找到交易额最小的交易。
*
*
 * @Date 10:28 2019/4/22
 **/
public class Test {


    public static void main(String[] args) {

        //测试数据
        List<Transaction> transactions = Data.produce();


        // problem(1)

        List<Transaction> tr2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011) //给filter传递一个谓词 来选择2011年的交易
                .sorted(Comparator.comparing(Transaction::getValue))  //按照交易额 进行排序
                .collect(Collectors.toList());  //将生成的Stream中的所有元素收集到 一个List中

        System.out.println(tr2011);


        System.out.println("=====================================================================");


        // problem(2)

        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())//提取与交易相关的每 位交易员的所在城市
                .distinct()  //只选择互不相同的城市
                .collect(Collectors.toList());

        System.out.println(cities);


        //这里还有一个新招：你可以去掉distinct()，改用toSet()，这样就会把流转换为集合。

        Set<String> cities_set = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());


        System.out.println("=====================================================================");


        // problem(3)

        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)//从交易中提取 所有交易员
                .filter(trader -> trader.getCity().equals("Cambridge"))//仅选择位于剑 桥的交易员
                .distinct()//确保没有任 何重复
                .sorted(Comparator.comparing(Trader::getName))//对生成的交易员流按 照姓名进行排序
                .collect(Collectors.toList());

        System.out.println(traders);

        System.out.println("=====================================================================");

        // problem(4)

        String traderStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())//提取所有交易员姓名，生成一 个Strings构成的Stream
                .distinct()//只选择 不相同 的姓名
                .sorted()//对姓名按字 母顺序排序
                .reduce("",(n1,n2) -> n1 + n2);//逐个拼接每个名字，得到一个将所有名字连接 起来的String
        System.out.println(traderStr);

        //请注意，此解决方案效率不高（所有字符串都被反复连接，每次迭代的时候都要建立一个新
        //的String对象）。下一章中，你将看到一个更为高效的解决方案，它像下面这样使用joining（其
        //内部会用到StringBuilder）

        String tradeStr_better = transactions.stream().map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println(tradeStr_better);

        System.out.println("=====================================================================");

        // problem(5)

        boolean milanBased = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));//把一个谓词传递给anyMatch，检查是否有交易员在米兰工作

        System.out.println(milanBased);


        System.out.println("=====================================================================");

        // problem(6)

        transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))//选择住在剑桥 的交易员所进 行的交易
                .map(Transaction::getValue) //提取这些交易的交易额
                .forEach(System.out::println); //打印每个值

        System.out.println("=====================================================================");

        // problem(7)

        Optional<Integer> highestValue = transactions.stream()
                .map(Transaction::getValue) //提取每项交易的交易额
                .reduce(Integer::max); //计算生成的流中的最大值

        System.out.println(highestValue);

        System.out.println("=====================================================================");

        // problem(8)

        Optional<Transaction> smallestTranstion = transactions.stream().
                reduce((t1,t2) -> t1.getValue() < t2.getValue() ? t1 : t2);

        System.out.println(smallestTranstion);




















    }


}
