package FunctionalProgram.Stream;


/*
*
 * @Author Mr.Lin
 * @Description //
 *
 *  找出某张专辑上所有乐队的国籍
 *
 *
 * @Date 11:41 2019/4/27
 **/
public class IntegrateOperation {


    public static void main(String[] args) {

        //将这个问题分解为如下几个步骤。
        //1. 找出专辑上的所有表演者。
        //2. 分辨出哪些表演者是乐队。
        //3. 找出每个乐队的国籍。
        //4. 将找出的国籍放入一个集合



        //1. Album 类有个 getMusicians 方法，该方法返回一个 Stream 对象，包含整张专辑中所有的
        //表演者；
        //2. 使用 filter 方法对表演者进行过滤，只保留乐队；
        //3. 使用 map 方法将乐队映射为其所属国家；
        //4. 使用 collect(Collectors.toList()) 方法将国籍放入一个列表


//        Set<String> origins = Data.album.getMusicians()
//                .filter(artist -> artist.getName().startsWith("The"))
//                .map(artist -> artist)
//                .collect(toSet());












    }






}
