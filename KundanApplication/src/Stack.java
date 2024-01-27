import java.util.*;
public class Stack {

	
	static	ArrayList<Integer> list =new ArrayList();
    public static boolean isEmpty()
    {
    	return list.size()==0;
    }
    
	//push
     public static void push(int data)
     {
      list.add(data);
      System.out.println(data);
     }
    //pop
    public static int pop ()
    {
    	if(isEmpty())
    	{
    		return -1;
    	}
    	int top=list.get(list.size()-1);
    	list.remove(list.size()-1);		
    	return top;
    }
    //peek
    public static int peek()
    {
    	if(isEmpty())
    	{
    		return-1;
    	}
    	return list.get(list.size()-1);
    }
    
  public static void main(String args[])
  {
	  
	Stack s=new Stack();
	  s.push(45);
	s.push(46);
	s.push(47);
	s.push(48);
	Stack.push(49);
	System.out.println(list);
	while(isEmpty()) {
      System.out.println(s.peek());
      s.pop();
	}
	System.out.println(list);
  }
}
