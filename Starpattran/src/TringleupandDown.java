
public class TringleupandDown {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{   if(j<=i&&j<=10-i)
				System.out.print("*");
			   else
				   System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}

