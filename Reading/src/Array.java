import java.util.Scanner;

public class Array {
	
public static void main(String[] args)
{
int[] arr=new int[5];
Scanner sc= new Scanner(System.in);
int element=10;
for (int i=0;i<=arr.length-1;i++)
    { 
	System.out.println("Enter the value in array "+i);
	arr[i]=sc.nextInt();
	
	}  
    //search(arr, element);
      reverse(arr);
      System.out.println();
       /*
           for (int j=0;j<=arr.length-1;j++)
            {
	       System.out.println(arr[j]);
            } */
}

public static void search( int[]arr,int element )
   { 
	   for(int j=0;j<= arr.length-1;j++)
	   {
		   if(arr[j]==element)
		   {
			System.out.println(j);
			   
		   }   
	   }
	   System.out.println("Not in arry");
	   
   }
 public static void reverse(int[] arr)
 {  int temp = 0;
  int p = arr.length-1;
	 for(int k=0; k<=(arr.length-1)/2;k++)
	 {
		 temp=arr[k];
		 arr[k]=arr[p];
		 arr[p]=temp;
		 p--;
		 
	 }
	 for(int j=0;j<=arr.length-1;j++)
	 {
		 System.out.println(arr[j]);
	 }
		 
 }
}
