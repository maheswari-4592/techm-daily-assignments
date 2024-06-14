import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertQueryDemo {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahi","root","root");	
		//create the object for PreparedStatement 
        PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");

        Scanner s = new Scanner(System.in);     
        System.out.println("enter student id:");      
        int x =  s.nextInt();     
        System.out.println("enter student name:");     
        String y = s.next();
        System.out.println("enter student age:");      
        int z =  s.nextInt();
        
        ps.setInt(1, x);
        ps.setString(2, y);
        ps.setInt(3, z);
        int n = ps.executeUpdate();
        System.out.println(n + "row(s) inserted");
        
        con.close();
	}

}