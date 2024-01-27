import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_insert {

	public static void main(String[] args) {
		 try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xe","xe");
		   PreparedStatement psmt= con.prepareStatement("insert into Himanshu values(?,?,?)");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(true)
            {
            	System.out.println("Enter Emp Id");
            	int eno =Integer.parseInt(br.readLine());
            	
            	System.out.println("Enter Emp name: ");
            	String ename=br.readLine();
            	
            	System.out.println("Enter Emp salary: "); 
                double sal=Double.parseDouble(br.readLine());
                psmt.setInt(1,eno);
                psmt.setString(2,ename);
                psmt.setDouble(3,sal);
                int count=psmt.executeUpdate();
                if(count>0)
                {
                	System.out.println(count+"record Inserted");
                }
                else
                	System.out.println("No record Inserted");
                System.out.println("Do you want to more Record...");
                String ch=br.readLine();
                if (ch.equalsIgnoreCase("NO"))
                break;
            }
	      }
		  catch(Exception e)
		 {
			  System.out.println(e);
		 }

}

	
}
