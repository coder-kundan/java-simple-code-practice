import java.util.Scanner;

public class Constructor {
	int a;
  Constructor ()
  { int b;
  String Name=new String();
  Scanner sn=new  Scanner(System.in);
  System.out.println("Enter the name");
  Name=sn.nextLine();
	  a=sn.nextInt();
	 // System.out.println(Name);
  }
  void Name() {
	  
	  System.out.println(a);
  }
  public static void main(String[] args)
  {
	Constructor cn =new Constructor();
	 cn.Name();
  }
}
