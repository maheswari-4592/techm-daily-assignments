
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateQueryDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahi", "root", "root");

        // SQL query to update product price
        String updateQuery = "UPDATE products SET price = ? WHERE prod_id = ?";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter product id:");
        int prod_id = s.nextInt();
        System.out.println("Enter new price:");
        int price = s.nextInt(); 
        
        // Prepare the statement
        PreparedStatement ps = con.prepareStatement(updateQuery);

        // Set the parameters for the prepared statement
        ps.setInt(1, price); 
        ps.setInt(2, prod_id);

        // Execute the update
        int n = ps.executeUpdate();
        System.out.println(n + " row(s) updated");

        // Close the resources
        ps.close();
        con.close();
        s.close();
    }
}
