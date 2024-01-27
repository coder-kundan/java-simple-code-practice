
public class Selection_sort{
 	public static void main(String[] args)
	{
		int arr[]= {10,40,30,60,50,20};
		/**
		int p=0;
	 for(int k=0;k<=arr.length-1;k++)
	 {
		int min=arr[k];
		
		for(int i=k+1;i<=arr.length-1;i++) 
		{
			if(min>arr[i])
			{
				min=arr[i];
				 p=i;
			}
		}
		int temp=arr[k];
		arr[k]=min;
		arr[p]=temp;
	}
	 for(int i=0;i<=arr.length-1;i++) {
	 System.out.println(arr[i]);
	 }
	}
 **/
		for(int i=0;i<=arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if (arr[min]>arr[j])
					min=j;
			}
			
		
		int temp=arr[i];
		arr[i]=arr[min];
	     arr[min]=temp;	
		}
		for(int i=0; i<=arr.length-1;i++)
		{
		System.out.println(arr[i]);
		}
	}
}
