import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCHello {
    public static void main(String[] args) throws SQLException {
        // 1. 使用 DataSource 描述 MySQL 服务器的位置.
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("gyl20030217");

        // 2. 和数据库服务器建立连接~
        Connection connection = dataSource.getConnection();
        // System.out.println(connection);

        // 3. 构造 SQL 语句. JDBC 操作数据库, 本质仍然是通过 SQL 来描述数据库操作~~
        //    例如, 进行一个插入数据的操作.
        //    直接用 String 格式的 SQL 还不行, 还需要搭配一个 特殊的类.
        String sql1 = "create database attendance;";
        String sql2 = "use attendance;";
        String sql3 = "create table if not exists staff (id int not null primary key,name varchar(20) default 'unknown');";
        String sql4 = "create table if not exists attendance(" +
                "attendID int primary key unique not null," +
                "staff_id int not null," +
                "staff_name varchar(20) not null," +
                "onWork dateTime NOT NULL," +
                "offWork dateTime NOT NULL" +
                ");";
        String sql5 = "desc attendance;";
        PreparedStatement statement1 = connection.prepareStatement(sql1);
        PreparedStatement statement2 = connection.prepareStatement(sql2);
        PreparedStatement statement3 = connection.prepareStatement(sql3);
        PreparedStatement statement4 = connection.prepareStatement(sql4);
        PreparedStatement statement5 = connection.prepareStatement(sql5);

        // 4. 执行 SQL 语句, insert, update, delete 都是通过 executeUpdate 来执行的.
        //    select 则是通过 executeQuery 来执行的.
        //    executeUpdate 的返回值是一个 整数 表示这个操作影响到几行~


        statement1.executeUpdate();
        statement2.executeUpdate();
        statement3.executeUpdate();
        statement4.executeUpdate();
        statement5.executeUpdate();

//        System.out.println("n = " + n);

        // 5. 断开连接, 释放资源
        statement1.close();
        statement2.close();
        statement3.close();
        statement4.close();
        statement5.close();
        connection.close();
    }
}