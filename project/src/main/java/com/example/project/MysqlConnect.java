package com.example.project;

import java.sql.Connection;
import java.sql.*;

public class MysqlConnect {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/sample";
        String userName = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from test1");

        resultSet.next();
        String name = resultSet.getString("barcode");
        System.out.println(name);

        resultSet.close();
        statement.close();
        connection.close();
    }
}
