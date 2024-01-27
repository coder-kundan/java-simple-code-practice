
		import java.io.BufferedReader;
		import java.io.InputStreamReader;
		import java.sql.Connection;
		import java.sql.DriverManager;

		import java.sql.Statement;
		
		public class JDBC_Delete {
	

			public static void main(String[] args) {
			
				 try
				   {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				   Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xe","xe");
				   Statement smt= con.createStatement();
				   
		            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		            
		           while(true)
		           {
		            	System.out.println("Enter Emp Id which yoy want to delete");
		            	int eno= Integer.parseInt(br.readLine());
		    
		               
		                int count=smt.executeUpdate("delete from employee where eno="+eno);
		                if(count>=1)
		                {
		                	System.out.println(count+"record Deleted");
		                }
		                else
		                	System.out.println("No record deleted: ");
		                System.out.println("Do you want to more recod delete:[yes/no] ");
		            String ch= br.readLine();
		            if(ch.equalsIgnoreCase("no"))
		                 break;
		           }
		 }     
				  catch(Exception e)
				 {
					  System.out.println(e);
				 }

				   
    }		
}
