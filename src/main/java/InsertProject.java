import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertProject {
    public void insertProject(
            String projektNavn, String projektKunde, int projektTid,
            String projektAnsat, String projektKategori, int projektId ) {

        String user = "sa";
        String password = "12345";

        String url = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=dbKunde;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";


        String sql = "INSERT INTO tblProjekt VALUES (?, ?, ?, ?, ?, ?)";


        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, projektNavn);
            pstmt.setString(2, projektKunde);
            pstmt.setInt(3, projektTid);
            pstmt.setString(4, projektAnsat);
            pstmt.setString(5, projektKategori);
            pstmt.setInt(6, projektId);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new project has started!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}