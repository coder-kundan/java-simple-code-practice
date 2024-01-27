
public class ArrayDelete {

	public static void main(String[] args) {
		int arr[]= {10,20,30,23,24};
		int index=2;
		for(int i=index;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		 arr[4]=0;
		 
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
