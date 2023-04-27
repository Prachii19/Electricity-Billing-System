/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.system;

/**
 *
 * @author prach
 */
import java.sql.*;
public class Conn {
    
    Connection con;
    Statement stmt;
    Conn(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
       con= DriverManager.getConnection("jdbc:mysql:///ebs","root","Prachii@12");
       stmt=con.createStatement();
    }catch(Exception e){
        e.printStackTrace();
    }
}
}
