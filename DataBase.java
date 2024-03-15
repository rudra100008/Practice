package com.To_Do_List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataBase {
    protected  void listDataBase(String list){
        String url="jdbc:mysql://localhost:3306/form";
        String user ="root";
        String password="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            String insert="INSERT INTO doList(list) VALUES(?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1,list);
            int result =preparedStatement.executeUpdate();
            if(result>0){
                System.out.println("Data inserted.......");
            }else {
                System.out.println("Data not inserted.....");
            }
            preparedStatement.close();
             connection.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
