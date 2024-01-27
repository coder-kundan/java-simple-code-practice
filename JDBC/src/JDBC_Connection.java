import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connection {
	public static void main(String[] args)
	{
   try
   {
	Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xe","xe");
   Statement smt=con.createStatement();
   smt.executeUpdate("create table Himanshu(eno number,ename varchar(12),esal number)");
   System.out.println("Table created Successfully....");
   }
   catch(Exception e)
   {
	System.out.print(e);   
   }
 }
}
