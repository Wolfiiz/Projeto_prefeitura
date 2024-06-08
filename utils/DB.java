package utils;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    public DB(String dbURL, String username, String password) throws SQLException {
        DriverManager.getConnection(dbURL, username, password);
    }

   
}
