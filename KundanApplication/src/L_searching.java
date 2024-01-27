import java.util.Scanner;

public class L_searching {

	
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		size=sc.nextInt();
		int [] arr=new int[size];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		System.out.println("Enter the element for search");
		int item=sc.nextInt();
		int k=1;
		for(int j=0;j<=arr.length-1;j++)
		{
			if(item==arr[j])
			{
				System.out.println("Item found index:"+j);
			}
			
			else if(j==arr.length-1)
			{
				System.out.println("Not found");
			}
		}
		

	}

}
