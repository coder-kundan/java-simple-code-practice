import java.util.HashSet;
import java.util.Set;

public class FindDub {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6,7,6,8,5};
          Set<Integer> s= new HashSet<>();
           for(int n:arr)
           {
        	   if(s.add(n)==false)
        	   {
        		   System.out.println(n+" ");
        	   }
           }
	}

}
