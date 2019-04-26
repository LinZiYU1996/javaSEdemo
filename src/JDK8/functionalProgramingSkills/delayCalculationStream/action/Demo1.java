package JDK8.functionalProgramingSkills.delayCalculationStream.action;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * 延迟列表
 *
 *
 * @Date 18:25 2019/4/26
 **/
public class Demo1 {

    //Java 8的Stream以其延迟性而著称。它们被刻意设计成这样，即延迟操作，有其独特的原因：
    //Stream就像是一个黑盒，它接收请求生成结果。当你向一个 Stream发起一系列的操作请求时，这
    //些请求只是被一一保存起来。只有当你向Stream发起一个终端操作时，才会实际地进行计算。这
    //种设计具有显著的优点，特别是你需要对Stream进行多个操作时（你有可能先要进行filter操
    //作，紧接着做一个map，最后进行一次终端操作reduce）；这种方式下Stream只需要遍历一次，
    //不需要为每个操作遍历一次所有的元素。


    //延迟列表，它是一种更加通用的Stream形式（延迟列表构造了一
    //个跟Stream非常类似的概念）。延迟列表同时还提供了一种极好的方式去理解高阶函数；你可以
    //将一个函数作为值放置到某个数据结构中，大多数时候它就静静地待在那里，一旦对其进行调用
    //（即根据需要），它能够创建更多的数据结构






}
