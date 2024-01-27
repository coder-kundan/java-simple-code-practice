import java.util.*;

public class Binery {

	public static void main(String[] args) {
		int item,N;
		int[] arr=new int[5];
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Item you want to Search");
     item =sc.nextInt();
     
     
     for ( int i=0;i<=arr.length-1;i++)
     {
    	 System.out.println("Enter the value in array ");
     arr[i]=sc.nextInt();
     }
         int ans=  Binery_search(arr , item);
       System.out.println(ans);
}
	public static  int Binery_search(int[] arr, int item)
	{
		int first=0,last=arr.length-1;
	    
	     int ans=-1;
	       boolean isA= arr[first] < arr[last];
		while(first<=last)
		{
			 int mid=(first+last-first)/2;
		 if(arr[mid]==item)
			   {
				return mid+1; 
			   }
	 if(isA)
	 {	 
		
		
		if(arr[mid]<item)
		 {
			first=mid+1;
		 }
		else 
		{
		 last=mid-1;	
		}
	 }
	 else {
			
			if(arr[mid]<item)
			 {
				first=mid+1;
			 }
			else 
			{
			 last=mid-1;	
			}
	 }
		 
		}
		return ans;
		}
	
	}

