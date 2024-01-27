 //programme of bubble sort
public class Sorting {

	public static void main(String[] args) {
		int [] arr= {12,8,17,19,13,6};
		int temp;
    for(int i=0;i<arr.length-1;i++)
    {
    	for(int j=0;j< arr.length-1;j++)
    	{
    		if(arr[j]>arr[j+1])
    		{      temp=arr[j+1];
    			arr[j+1]=arr[j];
    			arr[j]=temp;
    		}
    	}
    }
     for(int i=0;i<=arr.length-1 ;i++)
    	 System.out.println(arr[i]);
	}

}
