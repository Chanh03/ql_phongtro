package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCUtils {

    private static Connection conn;

    public static Connection
            getConnection(String user, String pass, String database) {
        Connection conn = null;

        try {
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=" + database + ";encrypt=false";
            // kết nối
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
