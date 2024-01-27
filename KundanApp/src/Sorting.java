
public class Sorting {

	public static void main(String[] args) {
		int arr[]= {10,24,56,32,13,56,89};
		
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[i]>arr[j])
    		   {
    			   int temp=arr[i];
    			   arr[i]=arr[j];
    			   arr[j]=temp;
    		   }
    	   }
       }
       for(int k=0;k<=arr.length-1;k++)
       {
    	   System.out.println(arr[k]);
       }
	}

}
