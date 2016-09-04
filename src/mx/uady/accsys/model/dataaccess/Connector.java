package mx.uady.accsys.model.dataaccess;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * Created by cesar on 03/09/16.
 */
public class Connector {
    private static String url = "jdbc:mysql://localhost:3306/laundrysys";
    private static String username = "root";
    private static String password = "juancmonhey";
    private Connection conn = null;

    public Connector(){
        System.out.println("Connecting database...");
        try {
            conn = DriverManager.getConnection(url,username,password);
            conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return conn;
    }
}
