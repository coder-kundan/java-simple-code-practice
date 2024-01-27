import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xe","xe");
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from Employee");
			while(rs.next())
			{
				int eid=rs.getInt(1);
				String ename=rs.getString(2);
				double esal=rs.getDouble(3);
				System.out.println("Employee Id: "+eid);
				System.out.println("Employee Ename "+ename);
				System.out.println("Employee Salary "+esal);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
