
import java.util.Scanner;
public class Jdbc {
	 String name;
	 int empid;
      Jdbc(String name , int empid)
      {
    	  this.name =name;
    	  this.empid=empid;
    	  System.out.println(this.name);
      }
      public static void main(String[] args)
      {
    	  Jdbc j1=new Jdbc("Kundan",101);
    	  Jdbc j2=new Jdbc ("Ram",123);
    	  System.out.println(" first"+j1.name );
      }
	}


