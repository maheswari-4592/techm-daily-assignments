
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQueryDemo {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahi","root","root");	
		Statement st = con.createStatement();
		
		//process the select query
		ResultSet rs = st.executeQuery("select * from employee");
		System.out.println("Employee Details");
		System.out.println("-----------------");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"---"+rs.getString(2));
		}
		rs.close();
		con.close();

	}

}
