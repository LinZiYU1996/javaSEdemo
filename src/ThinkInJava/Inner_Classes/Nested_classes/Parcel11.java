//package ThinkInJava.Inner_Classes.Nested_classes;
//
//import ThinkInJava.Inner_Classes.Inner_classes_and_upcasting.demo1.Destination;
//import ThinkInJava.Inner_Classes.Usingthisandnew.Parcel3;
//
///**
// * @Author: Mr.Lin
// * @Description:
// * @Date: Create in 16:05 2019/5/16
// */
//public class Parcel11 {
//
//    private static class ParcelContents implements Parcel3.Contents {
//        private int i = 11;
//        public int value() { return i; }
//    }
//    protected static class ParcelDestination
//            implements Destination {
//        private String label;
//        private ParcelDestination(String whereTo) {
//            label = whereTo;
//        }
//        public String readLabel() { return label; }
//        // Nested classes can contain other static elements:
//        public static void f() {}
//        static int x = 10;
//        static class AnotherLevel {
//            public static void f() {}
//            static int x = 10;
//        }
//    }
//    public static Destination destination(String s) {
//        return new ParcelDestination(s);
//    }
//    public static Parcel3.Contents contents() {
//        return new ParcelContents();
//    }
//    public static void main(String[] args) {
//        Parcel3.Contents c = contents();
//        Destination d = destination("Tasmania");
//    }
//
//
//}
