package ThinkInJava.Type_Information.New_cast_syntax;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 18:51 2019/5/18
 */
public class ClassCasts {

    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House)b; // ... or just do this.

        //castO方法接受参数对象，并将其转型为Class引用的类型。当然，如果你观察上面的代码，
        //西则会发现，与实现了相同功能的mainO中最后一行相比，这种转型好像做了很多额外的工作。


    }


}
