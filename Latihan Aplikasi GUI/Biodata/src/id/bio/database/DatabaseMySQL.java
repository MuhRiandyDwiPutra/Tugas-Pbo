package id.bio.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS TUF GAMING
 */
public class DatabaseMySQL {
    private static Connection connection = null;
    public static Connection getConnection() throws Exception {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbakademik", "root","");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return connection;
    }
    public static boolean isConnect() {
        try {
            if (getConnection()==null) {
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(DatabaseMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }  
}
