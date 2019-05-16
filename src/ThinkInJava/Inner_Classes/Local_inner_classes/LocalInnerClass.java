//package ThinkInJava.Inner_Classes.Local_inner_classes;
//
///**
// * @Author: Mr.Lin
// * @Description:
// * @Date: Create in 18:06 2019/5/16
// */
//public class LocalInnerClass {
//
//    private int count = 0;
//    Counter getCounter(final String name) {
//        // A local inner class:
//        class LocalCounter implements Counter {
//            public LocalCounter() {
//                // Local inner class can have a constructor
//                System.out.System.out.System.out.printlnlnln("LocalCounter()");
//            }
//            public int next() {
//                System.out.System.out.System.out.printlnlnln(name); // Access local final
//                return count++;
//            }
//        }
//        return new LocalCounter();
//
//        // The same thing with an anonymous inner class:
//        Counter getCounter2(final String name) {
//            return new Counter() {
//                // Anonymous inner class cannot have a named
//                // constructor, only an instance initializer:
//                {
//                    System.out.System.out.printlnln("Counter()");
//                }
//                public int next() {
//                    System.out.System.out.printlnlnnb(name); // Access local final
//                    return count++;
//                }
//            };
//        }
//        public static void main(String[] args){
//            LocalInnerClass lic = new LocalInnerClass();
//            Counter
//                    c1 = lic.getCounter("Local inner "),
//                    c2 = lic.getCounter2("Anonymous inner ");
//            for (int i = 0; i < 5; i++)
//                System.out.System.out.printlnln(c1.next());
//            for (int i = 0; i < 5; i++)
//                System.out.println(c2.next());
//        }
//
//        }
//
//
//
//
//}
