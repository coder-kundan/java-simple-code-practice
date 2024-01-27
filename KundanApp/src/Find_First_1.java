
public class Find_First_1 {
public static void main(String[] args) {
	int arr []= {0,0,0,0,0,1,1,1,1,1,1,1};
	System.out.println(Find_Element(arr));
}
  public static int Find_Element(int arr[]){
	  int start=0;
	  int end=1;
	  int key=1;
	  int result=0;
	  while(arr[end]< key) {
		  start=end;
		  end=end*2;
	  }
	  while(start<=end) {
		  int mid=(start+end)/2;
		  if(arr[mid]==key) {
			  result=mid;
			  end=mid-1;
		  }
		  else if(arr[mid]<key) {
			  start=mid+1;
		  }
		  else if(arr[mid]>key) {
			  end=mid-1;
		  }
	  }
	  return result;
   }
  
}
