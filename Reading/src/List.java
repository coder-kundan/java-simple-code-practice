import java.util.ArrayList;
import java.util.Scanner;
public class List {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list =new ArrayList<>();
     
		//insilization
		
		for(int i=0;i<=5;i++)
		{
			list.add(new ArrayList<>());
		}
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=2;j++) {
			list.get(i).add(sc.nextInt());
			}
		}
		System.out.println(list);	
		
	}

	}


