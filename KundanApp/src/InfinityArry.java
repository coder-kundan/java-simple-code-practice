
public class InfinityArry {
	public static void main(String[] args) {
		int arr[]= {12,13,14,18,20,22,27,28,29,34};
		int item=29;
	 System.out.println (Find_a_number(arr,item));
	}
public static int Find_a_number(int arr[], int item) {
	int start=0;
	int end=1;
	while(item > arr[end]) {
		start=end;
		end=end*2;
	}
	while(start<=end) {
		int mid=(start+end)/2;
          if(item==arr[mid]) {
        	  return mid;
          }
          else if(item < arr[mid]) {
        	  end=mid-1;
          }
          else if(item > arr[mid])
          {
        	  start=mid+1;
          }
	}
	return-1;
 }

}
