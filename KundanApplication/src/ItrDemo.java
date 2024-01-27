import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ItrDemo {

	public static void main(String[] args) {
		 ArrayList<String> l = new ArrayList<>();
	  l.add("10");
	  l.add("hello");
	  l.add("rahul");
   System.out.println(l);
   Iterator itr=l.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
   
	}

}
