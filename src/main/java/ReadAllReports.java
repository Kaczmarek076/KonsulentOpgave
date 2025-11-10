import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadAllReports {
    public void ReadReports() {
        // Database connection details
        String url = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=dbKunde;"
                + "encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String password = "12345";

        // Query to execute
        String query = "SELECT * FROM tblProjekt ";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Connected to database!");

            // Iterate through the result set
            while (rs.next()) {
                String projectName = rs.getString("projektNavn");
                String projectCostumer = rs.getString("projektKunde");
                String projectTime = rs.getString("projektTid");
                String projectEmployee = rs.getString("projektAnsat");
                String projectDepartment = rs.getString("projektKategori");
                String projectID = rs.getString("projektId");

                System.out.println(projectName + " | " + projectCostumer + " | " + projectTime + " | " + projectEmployee + " | " + projectDepartment + " | " + projectID);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
            }