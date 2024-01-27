
public class CelingOfNumbers {

	public static void main(String[] args) {
		int arr[]= {10,12,13,14,17,19,23,34};
		int t=33;
	System.out.println(	celling(arr,t));
	}
// celling and folour diffrent sirf mid and end ka hai

public static int celling(int[] arr,int target)
{
int start=0, end=arr.length-1,mid=0;
  while(start<end)
  {
	  mid=(start+end)/2;
	  if(arr[mid]==target)
	  {
		  return mid;
	  }
	  if(arr[mid]<target)
	  {
		  start=mid+1;
	  }
	  else
	  {
		  end=mid-1;
	  }
  }
     return end;
  }
 }