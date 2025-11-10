import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertEmployee {
    public void insertEmployee(String name, String department, int id) {

        String user = "sa";
        String password = "12345";

        String url = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=dbKunde;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";


        String sql = "INSERT INTO tblRapport VALUES (?, ?, ?)";


        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, department);
            pstmt.setInt(3, id);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}