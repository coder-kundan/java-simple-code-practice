import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
	  ArrayList<Integer> list = new ArrayList<Integer>();
	//  ArrayList<String> lis = new ArrayList<String>();
	  list.add(30);
	  list.add(45);
	  
	  // use of get function
	  System.out.println(list);
	 System.out.println( list.get(1));
	 
	 
	 //use of add element in between
	 list.add(1,32);
	 System.out.println(list);
	 
	 // set Element function
	 list.set(0, 67);
	 System.out.println(list);
	 
	 // Delete element function
	 list.remove(0);
	 System.out.println(list);
	 // count function use
	 int sze =list.size();
	 System.out.println(sze);
	 
	 //loop
	   
	 for(int i=0;i<list.size();i++)
	 {
		 System.out.println(list.get(i));
	 }
	 //sorting
	 Collections.sort(list);
	 System.out.println(list);
	}

		
	}


