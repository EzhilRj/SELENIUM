package DatabaseTesting;

import org.testng.annotations.Test;

import java.sql.*;

public class MySQLConnectionExample {

    //LAO

    @Test
    public static void dbconn() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/testingdb");

        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery("SELECT * FROM login");

        while (rs.next()) {

            System.out.println(rs.getString(3));
        }

    }


}
