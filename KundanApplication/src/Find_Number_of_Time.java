 //find number of times shorted array is rauted
public class Find_Number_of_Time {

	public static void main(String[] args) {
		int arry[]= {11,12,15,18,2,5,6,8};
	    int	n=arry.length;
		 System.out.println(binery(arry,n));
	}
	static int binery(int [] arr, int n)
	{    int start=0,end=n-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			int prevt= (mid-1+n)%n;
			int next= (mid+1)%n;
			
			if(arr[mid]< arr[prevt] && arr[mid]< arr[next])
			{
				return mid;
				
			}
			else if(arr[mid] <=arr[end])
			{
				end= mid-1;
			}
			else if(arr[mid] >= arr[start])
		   {
			  start=mid+1;
		   }
		   
		}
		return -1;
	}


}
