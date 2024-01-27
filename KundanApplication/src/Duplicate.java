
public class Duplicate {
	public static void main(String [] args)
	{
	int arr[]= {1,2,3,4,4,5,6};
	int l=arr.length,j=0;
	int [] ar=new int[l];
	
	for(int i=0;i<=arr.length-2;i++)
	{   if(i<arr.length-1)
		if(arr[i]!=arr[i+1])
		{
			ar[j]=arr[i];
			j++;
		}
	}
	int p=arr.length-1;
	 ar[j]=arr[p];
	for(int k=0;k<=ar.length-1;k++)
	{
		System.out.println(ar[k]);
	}
	}
}
