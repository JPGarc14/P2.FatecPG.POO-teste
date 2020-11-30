/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.*;
/**
 * Web application lifecycle listener.
 *
 * @author JPGARCIA
 */
public class DBListener implements ServletContextListener {
public static final String CLASS_NAME = "org.sqlite.JDBC";
public static final String DB_URL = "jdbc:sqlite:C:\\Users\\jpgar\\OneDrive\\Área de Trabalho\\tasks-noturno.db";
public static String exceptionMessage = null;
public static Connection getConnection()throws Exception{
    return DriverManager.getConnection(DB_URL);
} 

    @Override
    public void contextInitialized(ServletContextEvent sce) {
    Connection con = null; Statement stmt = null;
        try {
            Class.forName(CLASS_NAME);
            con = DriverManager.getConnection(DB_URL);
            stmt = con.createStatement();
        } catch (Exception ex) {
        }finally {
            try{stmt.close();}catch(Exception ex2){}
            try{con.close();}catch(Exception ex2){}   
            }
        }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
