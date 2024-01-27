import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
	  ArrayList a1=new ArrayList();
	  a1.add(10);
	  a1.add(30);
	  a1.add(40);
	  a1.add(50);
	  a1.add("hello");
	  System.out.println(a1);
	  
	 ArrayList a2= new ArrayList();
	 a2.addAll(a1);
	 a2.add(60);
	 System.out.println(a2);
	 ListIterator li=a2.listIterator();
	 // while(li.hasNext())
	 // {
	//	  System.out.println(li.next());
	//  }
	  Iterator lu=a2.listIterator();
	   while(lu.hasNext());
	  {
		  System.out.println(lu.next());
	  }
	}

}
