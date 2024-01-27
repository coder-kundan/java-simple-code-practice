
public class ArrayReverse {
	public static void rotate(int[] arr, int order) {
		
		//{
			//throw new IllegalArgumentException("Illegal argument!");
		
		for(int i=0;i<=order;i++)
		{
			for(int j=arr.length-1;j>i;j--)
			{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
				
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		rotate(arr,6);
	}

}
