package JDK8.stream.practise;


import java.util.Arrays;
import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 测试数据源
 * @Date 10:26 2019/4/22
 **/
public class Data {

    public static List<Transaction> produce(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }


}
