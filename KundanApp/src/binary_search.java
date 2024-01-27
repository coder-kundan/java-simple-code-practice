
public class binary_search 
{

	public static void main(String[] args) 
  {
	int [] arry= {10,30,70,90,91,94};
	int item=91;
	if(arry[1]<arry[2])
	{
		System.out.println(Binary_search_dec(arry,item));
	}
	else {
	System.out.println(Binary_search_acc(arry,item));
	}
  }
 public static int  Binary_search_acc(int arry[],int item){	
	int start=0;
	int end=arry.length-1;
	int mid=0;
	
	while(mid<=end)
	{	
	 mid=start+(end-start)/2;
	 if(arry[mid]==item)
	 {
		 return mid;
		
	 }
	 else if(arry[mid]<item)
	 {
		 end=mid-1;
		 
	 }
	 else {
		 start=mid+1;
	 }
	
      
	}
	 return -1;

	
 }
 
 
 public static int  Binary_search_dec(int arry[],int item){	
	int start=0;
	int end=arry.length-1;
	int mid=0;
	
	while(mid<=end)
	{	
	 mid=start+(end-start)/2;
	 if(arry[mid]==item)
	 {
		 return mid;
		
	 }
	 else if(arry[mid]<item)
	 {
		 start=mid+1;
		
	 }
	 else {
		 end=mid-1;
	 }
	
      
	}
	 return -1;

	
 }


}
