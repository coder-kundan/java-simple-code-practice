
public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {12,23,45,67,89,56,34};
		int j=arr.length-1;
		 for(int i=0;i<arr.length/2;i++)
		 {
			 int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]= temp;
			  j--;
		 }
		 for(int k=0;k<arr.length;k++)
		 {
			 System.out.println(arr[k]);
		 }
	}

}
