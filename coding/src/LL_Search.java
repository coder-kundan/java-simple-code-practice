 import java.util.*;
 
public class LL_Search {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(12);
		list.add(9);
		System.out.println(list);
	int	element=7;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==element)
			{
				System.out.println(i+1);
			}
		}
		list.set(3,9);
		System.out.println(list);
		
	}

}
