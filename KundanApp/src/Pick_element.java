// Find the pick element of an unsorted array using binary Search
public class Pick_element {

	public static void main(String[] args) {
		int arr []= {5,10,20,50,18,60,15};
		int n=arr.length;
	int k= Pick_element(arr,n);
	System.out.println(k);

	}
	public static int Pick_element(int arr[],int n)
	{ 
		int low=0;
		int heigh=n-1;
		while(low<=heigh) 
		{
			int mid=(low+heigh)/2;
			
			if(mid > 0 && mid < n-1)
			{
				if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
				{
					return mid;
				}
				else if(arr[mid-1] > arr[mid])
				{
					heigh= mid-1;
				}
				else if(arr[mid+1] > arr[mid])
				{
					low=mid+1;
				}
			}
			
			else if(mid == 0)
			{
				if(arr[0] > arr[1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
			else if(mid==n-1)
			{
				if(arr[n-1]>arr[n-2])
				{
					return n-1;
				}
				else
				{
					return n+2;
				}
			}
	      		
		}
		return -1;

	}

}
