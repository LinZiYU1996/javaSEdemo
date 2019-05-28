package Java_Multithreaded_Programming_Core_Technology.part6.使用enum枚举数据类型实现单例模式.singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*/**
* @Description:    TODO
* @Author:         Mr.Lin
* @CreateDate:     2019/5/28 16:25
* @Version:        1.0

*/
public enum MyObject {
    connectionFactory;
    private Connection connection;
    private MyObject() {
        try {
            System.out.println("call MyObject Constructor");
            String url = "jdbc:mysql://localhost/test";
            String username = "root";
            String password = "root1111";
            String driver = "";
            Class.forName(driver);
            //do database connect
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
