import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCDemo1 {
	public static void main(String[] args) {
		String connectionUrl = "jdbc:sqlserver://HARSHAD-WIN7:1433;databaseName=AdventureWorks2014;integratedSecurity=true;";
		
		try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con = DriverManager.getConnection(connectionUrl);
				Statement stmt = con.createStatement();
            	String SQL = "SELECT TOP 10 * FROM Person.Person";
            	ResultSet rs = stmt.executeQuery(SQL);

            	// Iterate through the data in the result set and display it.
            	while (rs.next()) {
                	System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            	}
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }		
	}
}