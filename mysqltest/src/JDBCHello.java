import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCHello {
    public static void main(String[] args) throws SQLException {
        // 1. 使用 DataSource 描述 MySQL 服务器的位置.
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/java104?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("2222");

        // 2. 和数据库服务器建立连接~
        Connection connection = dataSource.getConnection();
        // System.out.println(connection);

        // 3. 构造 SQL 语句. JDBC 操作数据库, 本质仍然是通过 SQL 来描述数据库操作~~
        //    例如, 进行一个插入数据的操作.
        //    直接用 String 格式的 SQL 还不行, 还需要搭配一个 特殊的类.
        String sql = "insert into student values(1, '张三')";
        PreparedStatement statement = connection.prepareStatement(sql);

        // 4. 执行 SQL 语句, insert, update, delete 都是通过 executeUpdate 来执行的.
        //    select 则是通过 executeQuery 来执行的.
        //    executeUpdate 的返回值是一个 整数 表示这个操作影响到几行~
        int n = statement.executeUpdate();
        System.out.println("n = " + n);

        // 5. 断开连接, 释放资源
        statement.close();
        connection.close();
    }
}