


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodmanagementsystem;

import java.sql.DriverManager;

import java.sql.*;
/**
 *
 * @author eshak
 */
public class Connection2 {
    
    public static Connection2 getcon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection1 con=(Connection1) DriverManager.getConnection("jdbc:mysql://localhost:3307/traffic_management","root","naruto123@");
            Connection2 con=(Connection2) DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","2001");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public static void executeUpdate(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public java.beans.Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
