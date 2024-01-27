
public class Binnery_Searching {

	public static void main(String[] args) {
		int[] arr= {4,7,9,11,13};
		int item=11;
	 int val= BinnerySearch(arr,item);
	 System.out.println(val);
	}
        static int BinnerySearch(int[] arr, int item) {
		int start=0,end=arr.length-1;
		while(start <= end)
		{
		   int mid = start +( end - start )/2 ;
		
			if(mid==item)
			    {
				return mid ;
			    }
			else if (item>arr[mid])
			{
				start=mid+1;
			}
			else if(item<arr[mid])
			{
				end=mid-1;
			}
		}
	      return -1;
        }
 }
