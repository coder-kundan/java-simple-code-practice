
public class Minimum_Diffe {

	public static void main(String[] args) {
     int arr[]= {4,5,7,8,11,15};
     int element=9;
    System.out.println(Find_Diff(arr,element));
	}
  public static int Find_Diff(int arr[],int element) 
  {
	  int start=0;
	  int end=0;
	  while(start<=end) 
	  {
		  int mid=(start+end)/2;
		  if(arr[mid]==element) {
			  return mid;
		  }
		  else if(arr[mid]<element)
		  {
			  start=mid+1;
		  }
		  else if(arr[mid]>element)
		  {
			  end=mid-1;
		  }
	  }
	  
	/*  if((arr[start]-element) < (arr[end]-element))
	  {
		  return start;
	  }
	  else {
		  return end;
	  }
	  */
	  int A= arr[start];
	  int B=arr[end];
	   int C= element-A;
	   int D= B-element;
	   if(C < D) {
		   return A;
	   }
	   else {
		   return B;
	   }
  }
}
