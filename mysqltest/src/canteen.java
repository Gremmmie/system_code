import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Gremmie102
 * @date 2022/7/23 23:49
 * @purpose :
 */
public class canteen {
    public static void main(String[] args) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("gyl20030217");

        Connection connection = dataSource.getConnection();

        String sql1 = "create database if not exists canteen;";
        String sql2 = "use canteen;";
        String sql3 = "create table if not exists canteen (" +
                "id int primary key not null," +
                "name varchar(20)" +
                ");";
        String sql4 = "create table if not exists windows (" +
                "id int primary key not null," +
                "dish_content varchar(20) comment '菜品内容'," +
                "canteen_id int," +
                "foreign key (canteen_id) references canteen(id)" +
                ");";
        String sql5 = "create table if not exists charge_record (" +
                "window_id int," +
                "income double default 0," +
                "expense double default 0," +
                "`time_record` datetime not null" +
                ");";

        PreparedStatement statement1 = connection.prepareStatement(sql1);
        PreparedStatement statement2 = connection.prepareStatement(sql2);
        PreparedStatement statement3 = connection.prepareStatement(sql3);
        PreparedStatement statement4 = connection.prepareStatement(sql4);
        PreparedStatement statement5 = connection.prepareStatement(sql5);

        statement1.executeUpdate();
        statement2.executeUpdate();
        statement3.executeUpdate();
        statement4.executeUpdate();
        statement5.executeUpdate();

        statement1.close();
        statement2.close();
        statement3.close();
        statement4.close();
        statement5.close();
        connection.close();

    }
}
