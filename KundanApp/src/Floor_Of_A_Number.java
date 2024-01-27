
public class Floor_Of_A_Number {

	public static void main(String[] args) {
		int arr[]= {12,13,14,18,20,22,27};
		int item=21;
		System.out.println(Binary_search(arr,item));
	}
	public static int  Binary_search(int arry[],int item){	
		int start=0;
		int end=arry.length-1;
		int ren=0;
		while(start<=end)
		{	
		int mid=(start+end)/2;
		
		 if(arry[mid]==item)
		 {
			 return mid;
			
		 }
		 else if(item<arry[mid])
		 {    
			 end=mid-1;
			 
		 }
		 else if (item>arry[mid]){
			 ren=mid;
			 start=mid+1;
		 }
		
	      
		}
		 return ren;

		
	 }

}
