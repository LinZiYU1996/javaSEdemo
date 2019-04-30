package ThinkInJava.Polymorphism.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:31 2019/4/30
 */
public class Music {


    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }


    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting

        //Music.tune()方法接受一个Instrument引用，同时也接受任何导出自Instrument的类。在
        //mainO方法中，当一个Wind引用传递到tuneO方法时，就会出现这种情况，
        // 而不需要任何类型转换。这样做是允许的－􀀃因为Wind从Instrument继承而来，
        // 所以Instrument的接口必定存在千Wind中。从Wind向上转型到Instrument可能会”缩小“接口，但不会比Instrument的全部接 口更窄。

    }

}
