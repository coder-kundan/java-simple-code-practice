
public class Bitomic_Array {
	public static void main(String[] args) {
		int arr []= {1,3,8,12,4,2};
		int n=arr.length;
	int pick= Pick_element(arr,n);
	//System.out.println(pick);
	int element=2;
	int Acc=Acc_Binary_Search(arr,pick,element);
	int Dec=Dec_Binary_Search(arr,pick,element);
	System.out.println(Acc);
	System.out.println(Dec);

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
    public static int Acc_Binary_Search(int arr[],int pick,int element)
    {
 	  int start=0;
 	  int end = pick-1;
 	  while(start<=end)
 	  {
 		  int mid = (start+end)/2;
 		  if(arr[mid]==element) 
 		  {
 			  return mid;
 		  }
 		  else if(arr[mid]<element)
 		  {
 			  start=mid+1;
 		  }
 		  else if(arr[mid]>element)
 			{
 			  end= mid-1;
 		    }
 		  }
 	 return -1;
    }
    
    public static int Dec_Binary_Search(int arr[],int pick,int element)
    {
   	  int start= pick;
   	  int end =arr.length-1;
   	  while(start<=end)
   	  {
   		  int mid = (start+end)/2;
   		  if(arr[mid]==element) 
   		  {
   			  return mid;
   		  }
   		  else if(arr[mid]<element)
   		  {
   			  
   			end= mid-1;
   		  }
   		  else if(arr[mid]>element)
   			{
   			start=mid+1;
   		    }
   		  }
   	 return -1;
    }
  }



