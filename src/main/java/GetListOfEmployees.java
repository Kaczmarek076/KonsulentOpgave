/*
import java.sql.*;

public class GetListOfEmployees {
    public static void getList(String []) {
        //String url = "jdbc:sqlserver://localhost:1433;databaseName=dbKonsulentOpave;encrypt=true;trustServerCertificate=true;";
        String user = "as"; // your SQL username
        String password = "12345";

        String url = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=dbKunde;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";

        try (Connection conn = DriverManager.getConnection(url, user, password);) {
            System.out.println("Connected to database!");

            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM tblRapport"; // replace Employees with your table
            ResultSet rs = stmt.executeQuery(sql);


            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();


            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String columnValue = rs.getString(i);
                    System.out.print(rsmd.getColumnName(i) + ": " + columnValue + "\t");
                }
                System.out.println();
            }


            rs.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

 */
