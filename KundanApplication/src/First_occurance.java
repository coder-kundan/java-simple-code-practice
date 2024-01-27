//find first occerance in shorted array
public class First_occurance {

	public static void main(String[] args)
	  {
		int []arr= {5,6,8,10,10,12,14,18};
		int element=10;
		int res =find_First_Occerance(arr,element);
        System.out.println(res);
	  }
	
	
	public static int find_First_Occerance(int arr[],int item)
	  {
		int start=0, end=arr.length;
	      int result =-1;
	      while(start<=end) {
	    	  int mid= start+(end-start)/2;
	    	  if(arr[mid]==item) {
	    		  result=mid;
	    		  end=mid-1;
	    	  }
	    	  else if(arr[mid]< item) {
	    		  start=mid+1;
	    	  }
	    	  else {
	    		  end=mid-1;
	    	  }
	      }
	      return result;
	  }

}
