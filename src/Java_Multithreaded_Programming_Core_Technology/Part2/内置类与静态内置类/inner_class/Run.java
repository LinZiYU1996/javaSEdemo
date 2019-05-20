package Java_Multithreaded_Programming_Core_Technology.Part2.内置类与静态内置类.inner_class;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:57 2019/5/20
 */
public class Run {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
    }


}
