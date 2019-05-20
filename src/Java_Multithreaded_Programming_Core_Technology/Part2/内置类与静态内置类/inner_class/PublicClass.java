package Java_Multithreaded_Programming_Core_Technology.Part2.内置类与静态内置类.inner_class;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 关键字sync缸onized的知识点还涉及内置类的使用。 先来看一下简单的内置类的测试。
 *
 *
 * @Date: Create in 22:57 2019/5/20
 */
public class PublicClass {

    private String username;
    private String password;

    class PrivateClass {
        private String age;
        private String address;

        public PrivateClass() {
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void printPublicProperty() {
            System.out.println(username + " " + password);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
