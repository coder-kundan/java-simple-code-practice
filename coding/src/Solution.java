

	import java.util.Scanner;

	public class Solution {

	    static boolean isAnagram(String A, String B) {
	        String a=A.toLowerCase();
	        String b=B.toLowerCase();
	        
	       if(a.length()==b.length())
	         {
	             String k=""; 
	             for(int i=a.length()-1;i>=0; i--)
	              {
	                 k=k+a.charAt(i);
	              }
	             System.out.println(a+"  "+b);
	              if(k.equals(b))
	            	 
	               return true;
	               else
	                return false; 
	         }
	         else
	          return false;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}


