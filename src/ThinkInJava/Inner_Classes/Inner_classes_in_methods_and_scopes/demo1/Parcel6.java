package ThinkInJava.Inner_Classes.Inner_classes_in_methods_and_scopes.demo1;

/**
 * @Author: Mr.Lin
 * @Description:
 * 下面的例子展示了如何在任意的作用域内嵌入一个内部类：
 * @Date: Create in 15:43 2019/5/16
 */
public class Parcel6 {

    private void internalTracking(boolean b) {
        if(b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip() { return id; }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        // Can’t use it here! Out of scope:
        //! TrackingSlip ts = new TrackingSlip("x");
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }


}
