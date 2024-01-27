//find a number in routed sorted array
public class Find_number {
	
	public static void main(String[] args) {
		int arry[]= {11,12,15,18,2,5,6,8};
	    int	n=arry.length;
	    int element=2;
		 int result =binery(arry,n);
		System.out.println( Binary_search_On_LeftSide(arry,element,result-1));
		System.out.println(Binary_search_On_RightSide(arry,element,result));
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
	public static int Binary_search_On_LeftSide(int []arry,int element,int end)
	{    int start=0;
		while(start<=end) {
		int	mid= (start+end)/2;
		if(element==arry[mid])
		{
			return mid;
		}
		else if(arry[mid]>element) {
			end=mid-1;
		}
		else {
			start=mid+1;
		}
		}
		return -1;
	}
	
public static int Binary_search_On_RightSide(int []arry,int element,int start){
	   int end=arry.length-1;
	   
	   while(start<=end) {
		   int mid = (start+end)/2;
		   // System.out.println(start);
		    //System.out.println(mid);
			if(element == arry[mid])
			{
				return mid;
			}
			else if(arry[mid]>element) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		   
	   }
	
	return-1;
	 }

}
