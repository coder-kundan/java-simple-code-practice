import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashing {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
         set.add(130);
         set.add(234);
         set.add(456);
         set.add(130);
         System.out.println(set);
         if (set.contains(1300))
         {
        	 System.out.println("set contains value 130");
        	 
         }   
         if(!set.contains(25))
         {
        	 System.out.println("Does not contains");
         }
         //delete
         set.remove(130);
         System.out.println(set);
         //Iterator
         
         //Iterator it= set.iterator();
         //while(it.hasNext())
         {
        	// System.out.println(it.next());
         }
	}

}
