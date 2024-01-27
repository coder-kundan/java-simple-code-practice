import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Demo {
	
	public static void main(String[] args) {
	 try
	 {
		 class.forName("oracle.jdbc.driver.oracle Driver");
		 connection con=DriverManager.getConnection(jdbc:oracle:thin:@localhost:1521:xe","System","xe" "xe");
	 }
		
	}

}
