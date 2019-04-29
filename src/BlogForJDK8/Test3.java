package BlogForJDK8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:21 2019/4/28
 */
public class Test3 {


    public static void main(String[] args) {

        if (Data.phones.stream()
        .anyMatch(Phone::isSupport5G)) {
            System.out.println("有手机支持5G");
        }


        if(Data.phones.stream()
        .allMatch(Phone::isSupport5G)){
            System.out.println("都支持5G");
        }



    }
}
