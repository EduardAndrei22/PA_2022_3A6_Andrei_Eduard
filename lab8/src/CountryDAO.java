import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CountryDAO {

    public void create(String name,int id) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into countrys (name,id,code,continet) values (?)")) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        }
    }
}
