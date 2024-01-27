
public class Atlist_sortedArry {

	public static void main(String[] args) {
	int arr []= {12,13,45,67,89,90};
	int element=90;
	System.out.println(Binary_search(arr,element));

	}
 public static int Binary_search(int arr[],int element){
	 int end=arr.length-1;
	 int start= 0;
	 
	 while(start<=end) {
		int mid= (start+end)/2;
		if(arr[mid]==element)
		{
			return mid;
		}
		else if(mid-1>=start && arr[mid-1]==element) {
			return mid-1;
		}
		else if(mid+1<=end && arr[mid+1]==element) {
			return mid+1;
		}
		else if(element >= arr[mid]) {
			start=mid+2;
		}
		else if (element <=arr[mid]){
			end=mid-2;
		}
	 }
	 return -1;
 }
}
