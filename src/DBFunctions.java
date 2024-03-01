import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBFunctions{
    public Connection connect_to_db(String dbname, String user, String password) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
