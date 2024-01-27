import java.util.Scanner;

public class RightForVote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int minage=18;
		System.out.println("Enter the age of voter");
	    int  age= sc.nextInt();
	   
	     if(age >= minage)
	     {
	    	 System.out.println("you have right");
	     }
	     else 
	    	 System.out.println(" you have not Right");
 
	}

}
