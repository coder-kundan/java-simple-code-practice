
public class MargeTwoArray {

	public static void main(String[] args) {
         int arr1[]= {1,3,5,6,8,10};
         int arr2[]= {2,7,9};
         int l =(arr1.length) + (arr2.length);
         int [] arr3= new int[l];
         int i=0,j=0,k=0;
         while(i<arr1.length && j<arr2.length)
         {
        	 if(arr1[i]<arr2[j])
        	 {
        		arr3[k]=arr1[i];
        		i++;
        		k++;
        	 }
        	 else
        	 {
        		 arr3[k]=arr2[j];
        		 j++;
        		 k++;
        	 }
         }
         
          while(j<=arr2.length-1)
            {
        	 arr3[k]=arr2[j];
        	 k++;
        	 j++;
            }
         
         
          while(i<=arr1.length-1) {
        	 arr3[k]=arr1[i];
        	 k++;
        	 i++;
            }
         
        for(int n=0;n<l;n++)
        {
        	System.out.println(arr3[n]);
        }
         
	}

}
