import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL =
            "jdbc:postgresql://localhost:5432/cities";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password";
    private static Connection connection = null;

    private Database() {
    }

    public static Connection getConnection()throws SQLException  {
        Connection con= DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe");
        return con;
    }



    private static void createConnection(Connection connection) {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }

    public static void rollback() {
    }
}
