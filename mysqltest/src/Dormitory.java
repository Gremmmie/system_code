import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Dormitory {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("gyl20030217");

        Connection connection = dataSource.getConnection();

        String sql1 = "create database if not exists student_dormitory;";
        String sql2 = "use student_dormitory;";
        String sql3 = "create table if not exists dormitory (" +
                        "id int PRIMARY KEY NOT NULL," +
                        "room_capacity int default 4" +
                        ");";
        String sql4 = "create table if not exists student (" +
                        "name varchar(20) not null," +
                        "student_id int primary key," +
                        "room_id int," +
                        "foreign key (room_id) references dormitory(id)" +
                        ");";
        String sql5 = "create table if not exists check (" +
                        "room_id int," +
                        "daily_check datetime," +
                        "foreign key (room_id) references dormitory(id)" +
                        ");";

        PreparedStatement statement1 = connection.prepareStatement(sql1);
        PreparedStatement statement2 = connection.prepareStatement(sql2);
        PreparedStatement statement3 = connection.prepareStatement(sql3);
        PreparedStatement statement4 = connection.prepareStatement(sql4);

        statement1.executeUpdate();
        statement2.executeUpdate();
        statement3.executeUpdate();
        statement4.executeUpdate();

        statement1.close();
        statement2.close();
        statement3.close();
        statement4.close();
        connection.close();
    }
}
