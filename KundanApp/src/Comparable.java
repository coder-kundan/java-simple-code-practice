import java.util.Scanner;

public class Comparable {

	public static void main(String[] args)
	
	{
		int arr_size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		arr_size = sc.nextInt();
		int[] arr = new int[arr_size];
		System.out.println("Enter the value");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
	  for(int j=0;j<=arr.length-1;j++) 
	  { 
		  for(int k=j+1; k<=arr.length-1;k++)
		  {
			if(arr[j]>arr[k])
			{   
				int temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
			}
		  }
		  
	  }
	  for(int l=0;l<=arr.length;l++)
	  {
		  System.out.println(arr[l]);
	  }

}
}
