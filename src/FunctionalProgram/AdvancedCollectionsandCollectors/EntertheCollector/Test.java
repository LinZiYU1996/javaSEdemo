package FunctionalProgram.AdvancedCollectionsandCollectors.EntertheCollector;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:23 2019/4/27
 */
public class Test {



    //转换成值

    //找出成员最多的乐队
//    public Optional<Artist> biggestGroup(Stream<Artist> artists) {
//        Function<Artist,Long> getCount = artist -> artist.getMembers().count();
//        return artists.collect(maxBy(comparing(getCount)));
//    }


    //数据分块

    //一个常用的流操作是将其分解成两个集合。假设有一个艺术家组成的流，你可能希望
    //将其分成两个部分，一部分是独唱歌手，另一部分是由多人组成的乐队。可以使用两次过
    //滤操作，分别过滤出上述两种艺术家。
    //但是这样操作起来有问题。首先，为了执行两次过滤操作，需要有两个流。其次，如果过
    //滤操作复杂，每个流上都要执行这样的操作，代码也会变得冗余。
    //幸好我们有这样一个收集器 partitioningBy，它接受一个流，并将其分成两部分

    //它使用 Predicate 对象判断一个元素应该属于哪个部分，并根据布尔值返回一
    //个 Map 到列表。因此，对于 true List 中的元素，Predicate 返回 true；对其他 List 中的
    //元素，Predicate 返回 false


    //将艺术家组成的流分成乐队和独唱歌手两部分

//    public Map<Boolean, List<Artist>> bandsAndSolo(Stream<Artist> artists) {
//        return artists.collect(partitioningBy(artist -> artist.isSolo()));
//    }


    //使用方法引用将艺术家组成的 Stream 分成乐队和独唱歌手两部分

//    public Map<Boolean, List<Artist>> bandsAndSoloRef(Stream<Artist> artists) {
//        return artists.collect(partitioningBy(Artist::isSolo));
//    }


    //数据分组


    //数据分组是一种更自然的分割数据操作，与将数据分成 ture 和 false 两部分不同，可以使
    //用任意值对数据分组。比如现在有一个由专辑组成的流，可以按专辑当中的主唱对专辑分
    //组


//    使用主唱对专辑分组
//    public Map<Artist, List<Album>> albumsByArtist(Stream<Album> albums) {
//        return albums.collect(groupingBy(album -> album.getMainMusician()));
//    }


    public static void main(String[] args) {





    }
}
