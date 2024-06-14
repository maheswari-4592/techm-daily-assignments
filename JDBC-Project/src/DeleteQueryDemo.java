import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteQueryDemo {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahi","root","root");
		// SQL query to update product price
        String query = "delete from orders where id=?";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter product id:");
        int id = s.nextInt();
   
        // Prepare the statement
        PreparedStatement ps = con.prepareStatement(query);

        // Set the parameters for the prepared statement
        ps.setInt(1, id);

        // Execute the update
        int n = ps.executeUpdate();
        System.out.println(n + " row(s) deleted");

        // Close the resources
        ps.close();
        con.close();
        s.close();
    }
}