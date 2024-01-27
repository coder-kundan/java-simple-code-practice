 import java.util.*;
public class LL {

	
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.addFirst("the");
		list.add("ram");
		System.out.println(list);
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		for(int i=0;i<val;i++)
		{
			String s =sc.nextLine();
			list.add(s);
		}
		list.add("shyam");
      System.out.println(list);
      System.out.println(list.size());
      
     //loop  
      for(int i=0;i<list.size();i++)
      {
    	  System.out.println(list.get(i));
      }
      list.removeFirst();
      list.removeLast();
      list.remove(3);
      System.out.println(list);
	}

}
