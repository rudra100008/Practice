package com.database;

import java.sql.*;
import java.util.Scanner;

public class Fall_2021_6b {
    public static void main(String[] args) {
//        Scanner scan =new Scanner(System.in);
//        System.out.println("Enter your id:");
//
//        int id= scan.nextInt();
//        System.out.println("Enter your name");
//        String name=scan.next();
//        System.out.println(" Enter your address");
//        String address = scan.next();

        try {
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();


            String sql = "SELECT * FROM Student";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt(1)
                                + " "
                                + resultSet.getString(2)
                                + " "
                                + resultSet.getString(3)
                );
            }//To Delete data

            String sql1 = "DELETE  FROM Student WHERE id=?";
            // To Update query
            String sql2 = "UPDATE Student SET id = ?, name = ?,address=? WHERE id=?";
//                    String sqlInsert="INSERT INTO Student(id,name,address) VALUES (?,?,?)";
//                    PreparedStatement preparedStatement =connection.prepareStatement(sqlInsert);
//                    preparedStatement.setInt(1,id);
//                    preparedStatement.setString(2,name);
//                    preparedStatement.setString(3,address);
//
//                    int rowsInsert =preparedStatement.executeUpdate();
//                    if(rowsInsert>0) {
//                        System.out.println( rowsInsert+ "Data inserted....");
//                    }else{
//                        System.out.println("data not inserted....");
//                    }
try {
    PreparedStatement preparedStatement1 = connection.prepareStatement(sql2);
    PreparedStatement preparedStatement = connection.prepareStatement(sql1);
    preparedStatement1.setInt(1, 100);
    preparedStatement1.setString(2, "Shyam");
    preparedStatement1.setString(3, "Jorpati");
    int rowsUpdated = preparedStatement1.executeUpdate();
    int rowsDeleted = preparedStatement.executeUpdate();
    System.out.println("Data Updated..." + " " + rowsUpdated);
    System.out.println(rowsDeleted + " " + "Data Deleted...");

}catch(SQLException e){
    System.out.println(e);
}
                connection.close();

        }catch(Exception e){
            System.out.println(e );
        }

    }

}
