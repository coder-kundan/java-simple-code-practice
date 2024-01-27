import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int []arr=new int[5];
		int e=3;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=0, j=arr.length-1;
		while( k < j)
		{
			int temp=arr[k];
			arr[k]=arr[j];
			arr[j]=temp;
		     k++;
		     j--;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}
