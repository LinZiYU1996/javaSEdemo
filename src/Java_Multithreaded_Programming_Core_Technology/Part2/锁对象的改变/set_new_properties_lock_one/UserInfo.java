package Java_Multithreaded_Programming_Core_Technology.Part2.锁对象的改变.set_new_properties_lock_one;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 10:33 2019/5/21
 */
public class UserInfo {

    private String username;
    private String password;

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
