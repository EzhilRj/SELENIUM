package DatabaseTesting;

import org.testng.annotations.Test;

import java.sql.*;

public class SQLConnectionExample {

    //LAO
    @Test
    public static void main(String[]args){

        Connection con = null;

        String url = "jdbc:sqlserver://183.83.187.133\\\\FIELDLYTICSDEVS:1433;DatabaseName=Redipaetest;encrypt=true;trustServerCertificate=true";
        String username = "Fieldlytics2021";
        String Password = "PPMSdevserver$2022";

        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url,username,Password);

            String sqlquery = "select * from UserMaster where Username Bharathi";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sqlquery);

            result.next();
            System.out.println(result.getString("username"));


        }catch (Exception e){


            System.out.println(e.getMessage());
        }finally {

            if(con!=null){

                con=null;
            }
        }


    }




}
