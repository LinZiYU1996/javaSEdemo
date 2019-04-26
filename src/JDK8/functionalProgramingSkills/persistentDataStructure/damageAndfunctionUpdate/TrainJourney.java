package JDK8.functionalProgramingSkills.persistentDataStructure.damageAndfunctionUpdate;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 一个可变类TrainJourney（利用一
  个简单的单向链接列表实现）表示从A地到B地的火车旅行，你使用了一个整型字段对旅程的一些
  细节进行建模，比如当前路途段的价格。旅途中你需要换乘火车，所以需要使用几个由onward字
  段串联在一起的TrainJourney对象；直达火车或者旅途最后一段对象的onward字段为null：
*
 * @Date 17:43 2019/4/26
 **/
public class TrainJourney {

    public int price;
    public TrainJourney onward;
    public TrainJourney(int p, TrainJourney t) {
        price = p;
        onward = t;
    }

}
