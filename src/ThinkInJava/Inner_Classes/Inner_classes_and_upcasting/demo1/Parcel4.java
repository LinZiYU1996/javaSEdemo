//package ThinkInJava.Inner_Classes.Inner_classes_and_upcasting.demo1;
//
///**
// * @Author: Mr.Lin
// * @Description:
// * @Date: Create in 15:34 2019/5/16
// */
//public class Parcel4 {
//
//    private class PContents implements Contents {
//        private int i = 11;
//        public int value() { return i; }
//    }
//    protected class PDestination implements Destination {
//        private String label;
//        private PDestination(String whereTo) {
//            label = whereTo;
//        }
//        public String readLabel() { return label; }
//    }
//    public Destination destination(String s) {
//        return new PDestination(s);
//    }
//    public Contents contents() {
//        return new PContents();
//    }
//
//
//}
