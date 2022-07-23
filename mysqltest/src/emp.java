import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Gremmie102
 * @date 2022/7/24 1:46
 * @purpose :
 */
public class emp {
    public static void main(String[] args) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("gyl20030217");

        Connection connection = dataSource.getConnection();
        String sql1 = "create database if not exists employee;";
        String sql2 = "use employee;";
        String sql3 = "create table if not exists emp (" +
                "name varchar(20) not null," +
                "sex varchar(1) not null," +
                "depart varchar(20)," +
                "salary double" +
                ");";
        String sql4 = "insert into emp values " +
                "('东方曜','男','稷下学院',8000)," +
                "('西施','女','稷下学院',8500)," +
                "('花木兰','女','长城护卫队',9000)," +
                "('百里守约','男','长城护卫队',8800)," +
                "('百里玄策','男','长城护卫队',8500)," +
                "('诸葛亮','男','稷下学院',10100);";
        String sql5 = "select sex,avg(salary) from emp group by sex;";
        String sql6 = "select depart,sum(salary) from emp group by depart;";
        String sql7 = "select depart,sum(salary) from emp group by depart order by sum(salary) desc limit 1,1;";
        String sql8 = "select name from emp group by name having count(name)>1;";
//        String sql9 = "select name,avg(salary) from emp where salary>10000 group by sex having sex = '男';";写错了
        String sql9 = "select name,avg(salary) from emp where salary>10000 and sex = '男' group by depart;";

        PreparedStatement statement1 = connection.prepareStatement(sql1);
        PreparedStatement statement2 = connection.prepareStatement(sql2);
        PreparedStatement statement3 = connection.prepareStatement(sql3);
        PreparedStatement statement4 = connection.prepareStatement(sql4);
        PreparedStatement statement5 = connection.prepareStatement(sql5);
        PreparedStatement statement6 = connection.prepareStatement(sql6);
        PreparedStatement statement7 = connection.prepareStatement(sql7);
        PreparedStatement statement8 = connection.prepareStatement(sql8);
        PreparedStatement statement9 = connection.prepareStatement(sql9);

        statement1.executeUpdate();
        statement2.executeUpdate();
        statement3.executeUpdate();
        int n = statement4.executeUpdate();
        System.out.println(n);
        ResultSet resultSet1 = statement5.executeQuery();
        System.out.print("{");
        while (resultSet1.next()){
            String name = resultSet1.getString(1);
            double average = resultSet1.getDouble(2);
            System.out.print(" [");
            System.out.print(name+","+average);
            System.out.print("] ");
        }
        System.out.print("}");
        System.out.println();


        ResultSet resultSet2 = statement6.executeQuery();
        System.out.print("{");
        while (resultSet2.next()){
            String depart = resultSet2.getString("depart");
            int sum = resultSet2.getInt(2);
            System.out.print(" [");
            System.out.print(depart+","+sum);
            System.out.print("] ");
        }
        System.out.print("}");
        System.out.println();

        ResultSet resultSet3 = statement7.executeQuery();
        System.out.print("{");
//        while (resultSet3.next()){
//            String depart = resultSet3.getString("depart");
//            int sum = resultSet2.getInt(2);
//            System.out.print(" [");
//            System.out.print(depart+","+sum);
//            System.out.print("] ");
//        }
        System.out.print("}");
        System.out.println();


        ResultSet resultSet4 = statement8.executeQuery();
        System.out.print("{");
        while (resultSet4.next()){
            String name = resultSet4.getString(1);
            System.out.print(" [");
            System.out.print(name);
            System.out.print("] ");
        }
        System.out.print("}");
        System.out.println();

        ResultSet resultSet5 = statement9.executeQuery();
        System.out.print("{");
        while (resultSet5.next()){
            String depart = resultSet5.getString(1);
            double avg = resultSet5.getDouble(2);
            System.out.print(" [");
            System.out.print(depart+","+avg);
            System.out.print("] ");
        }
        System.out.print("}");
        System.out.println();


        statement1.close();
        statement2.close();
        statement3.close();
        statement4.close();
        statement5.close();
        statement6.close();
        statement7.close();
        statement8.close();
        statement9.close();
        connection.close();
    }
}
