import java.util.Scanner;

public class Binery1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size=sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter the element of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value what do you want to search");
		int item=sc.nextInt();
		int ans = binery(arr,item);
		System.out.println("Endex is : "+ans);

	}
	static int binery(int [] arr,int item)
	{    int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==item)
			{
				return mid;
				
			}
			if(item<arr[mid+1]&& item >arr[mid])
			{
				return mid+1;
			}
		   if(arr[mid]> item)
		   {
			  end=mid-1;
		   }
		   else
		   {
			   start = mid +1;
		   }
		}
		return -1;
	}

}
