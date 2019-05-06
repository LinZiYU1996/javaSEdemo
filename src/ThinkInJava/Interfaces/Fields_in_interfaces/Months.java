package ThinkInJava.Interfaces.Fields_in_interfaces;


//因为你放人接口中的任何域都自动是static和final的，所以接口就成为了一种很便捷的用来
//创建常朵组的工具。在JavaSES之前，这是产生与C或C++中的enum(枚举类型）具有相同效果
public interface Months {

    int
            JANUARY = 1, FEBRUARY = 2, MARCH = 3,
            APRIL = 4, MAY = 5, JUNE = 6, JULY = 7,
            AUGUST = 8, SEPTEMBER = 9, OCTOBER = 10,
            NOVEMBER = 11, DECEMBER = 12;

//Java中标识具有常最初始化值的static final时，
// 会使用大写字母的风格（在一个标识符中用下划线来分隔多个单词）。
// 接口中的域自动是public的，所以没有显式地指明这一点。

}
