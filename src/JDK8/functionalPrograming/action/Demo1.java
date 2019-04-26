package JDK8.functionalPrograming.action;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*
 * @Author Mr.Lin
 * @Description //
 *给定一个列表List<value>，比如{1, 4, 9}，构造一个List<List<Integer>>，它的成员都是类表{1, 4, 9}的子集——我们暂时不考虑
  元素的顺序。{1, 4, 9}的子集是{1, 4, 9}、{1, 4}、{1, 9}、{4, 9}、{1}、{4}、{9}以及{}。
  包括空子集在内，这样的子集总共有8个。每个子集都使用List<Integer>表示，这就是答
  案中期望的List<List<Integer>>类型
 * @Date 16:01 2019/4/26
 **/
public class Demo1 {

        public static List<List<Integer>> subsets(List<Integer> list) {
            if (list.isEmpty()) { //如果输入为空，它就只包含一个子集，既空列表自身
                List<List<Integer>> ans = new ArrayList<>();
                ans.add(Collections.emptyList());
                return ans;
            }
            Integer first = list.get(0);
            List<Integer> rest = list.subList(1, list.size());
            List<List<Integer>> subans = subsets(rest); //否则就取出一个元素first，找出剩余部分的所有子集，并将其赋予subans。subans 构成了结果的另外一半
            List<List<Integer>> subans2 = insertAll(first, subans); //答案的另一半是 subans2 ，它包含了subans中的所有列表，但是经过调整，在 每个列表的第一个元素之前添加了first
            return concat(subans, subans2);  //将两个子答案整合 在一起就 完成了任 务，简单 吗？
        }

        public static List<List<Integer>> insertAll(Integer first,
                                         List<List<Integer>> lists) {
                List<List<Integer>> result = new ArrayList<>();
                for (List<Integer> list : lists) {
                    List<Integer> copyList = new ArrayList<>();
                    copyList.add(first);
                    copyList.addAll(list);
                    result.add(copyList);
                }
                return result;
                //你现在已经创建了一个新的List，它包含了subans的所有元素。你聪明地利
            //用了Integer对象无法修改这一优势，否则你需要为每个元素创建一个副本。由于聚焦于让
            //insertAll像函数式那样地工作，你很自然地将所有的复制操作放到了insertAll中，而不是
            //它的调用者中
    }


    //定义concat方法。这个例子中，我们提供了一个简单的实现，但是我们希
    //望你不要这样使用（我们展示这段代码的目的只是为了便于你比较不同的编程风格）

//        public static List<List<Integer>> concat(List<List<Integer>> a,
//                                                 List<List<Integer>> b) {
//            a.addAll(b);
//            return a;
//        }


    //真正建议你采用的是下面这种方式

    public static List<List<Integer>> concat(List<List<Integer>> a,
                                             List<List<Integer>> b) {
        List<List<Integer>> r = new ArrayList<>(a);
        r.addAll(b);
        return r;

        //第二个版本的concat是纯粹的函数式。虽然它在内部会对对象进行修改（向列
        //表r添加元素），但是它返回的结果基于参数却没有修改任何一个传入的参数。与此相反，第一个
        //版本基于这样的事实，执行完concat(subans, subans2)方法调用后，没人需要再次使用
        //subans的值。


    }








}
