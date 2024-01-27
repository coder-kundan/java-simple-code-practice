
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.Statement;

	public class JDBC_upadate {

		public static void main(String[] args) {
			String value; int eid; double esal;
			 try
			   {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			   Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xe","xe");
			   Statement smt= con.createStatement();
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	         
	            {
	            	System.out.println("Enter Emp Id");
	            	 value=br.readLine();
	            	eid=Integer.parseInt(value);
	            	
	            	
	            	System.out.println("Enter Emp salary: ");
	            	value=br.readLine();
	                esal=Double.parseDouble(value);
	                
	                
	                int count=smt.executeUpdate("update employee set esal="+esal+"where eno="+eid);
	                if(count>0)
	                {
	                	System.out.println(count+"One row Updated");
	                }
	                else
	                	System.out.println("No rows found");
	                
	            }
		      }
			  catch(Exception e)
			 {
				  System.out.println(e);
			 }

	}

		
	}

