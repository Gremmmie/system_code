import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Gremmie102
 * @date 2022/7/23 19:35
 * @purpose :
 */
public class VehicleViolationSystem {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("gyl20030217");

        Connection connection = dataSource.getConnection();

        String sql1 = "create database if not exists VehicleViolationSystem;";
        String sql2 = "use VehicleViolationSystem;";
        String sql3 = "create table if not exists user (" +
                        "id int primary key not null," +
                        "name varchar(20) not null," +
                        "IDCardNumber long not null" +
                        ");";
        String sql4 = "create table if not exists cars (" +
                        "name varchar(20)," +
                        "boardNumber varchar(20) primary key not null," +
                        "ownerID int," +
                        "foreign key (ownerID) references user(id)" +
                        ");";
        String sql5 = "create table if not exists violation_information (" +
                        "user_id int," +
                        "user_name varchar(20)," +
                        "car_boardNumber varchar(20)," +
                        "car_name varchar(20)," +
                        "violation_content varchar(500)," +
                        "foreign key (user_id) references user(id)," +
                        "foreign key (car_boardNumber) references cars(boardNumber)" +
                        ");";
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
        PreparedStatement preparedStatement3 = connection.prepareStatement(sql3);
        PreparedStatement preparedStatement4 = connection.prepareStatement(sql4);
        PreparedStatement preparedStatement5 = connection.prepareStatement(sql5);

        preparedStatement1.executeUpdate();
        preparedStatement2.executeUpdate();
        preparedStatement3.executeUpdate();
        preparedStatement4.executeUpdate();
        preparedStatement5.executeUpdate();

        preparedStatement1.close();
        preparedStatement2.close();
        preparedStatement3.close();
        preparedStatement4.close();
        preparedStatement5.close();
        connection.close();
    }
}
