
public class LenerSerch1 {
	 
	  int search(int arr[],int element)
	  {   for(int i=0;i<arr.length ; i++)
	    {
		  if(arr[i]==element)
		  {
			  
			  return i;
			  //System.out.println("The Element prsent on endex" +i);
		  }
	    }
		return -1;  
	  }

	public static void main(String[] args) {
		int arr[]= {12,13,14,15,16,11,10};
		int element=19;
		LenerSerch1 sc=new LenerSerch1();
		int s=sc.search(arr,element);
		System.out.println(s);
	}

}
