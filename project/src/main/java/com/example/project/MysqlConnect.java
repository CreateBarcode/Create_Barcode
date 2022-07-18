package com.example.project;

import java.sql.Connection;
import java.sql.*;

public class MysqlConnect {
    public static void insert(String value, String title) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/sample";
        String userName = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        statement.executeUpdate("insert into test1 values(" + value +",'" + title + "')");
        //statement.executeQuery("select");


        statement.close();
        connection.close();
    }
}
