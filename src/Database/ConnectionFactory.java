package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author asjad
 */

//Class to retrieve connection for database and login verification.
public class ConnectionFactory {

    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/inventory";
    static final String username = "root"; // Directly hardcoded username
    static final String password = "Bsk001123@"; // Directly hardcoded password

    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public ConnectionFactory(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            statement = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, username, password);
            }
            System.out.println("Connected successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    // Login verification method
    public boolean checkLogin(String user, String pass, String userType) {
        String query = "SELECT * FROM users WHERE username='"
                + user
                + "' AND password='"
                + pass
                + "' AND usertype='"
                + userType
                + "' LIMIT 1";

        try {
            resultSet = statement.executeQuery(query);
            if (resultSet.next()) return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
