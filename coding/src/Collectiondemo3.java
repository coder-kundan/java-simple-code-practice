import java.util.Stack;

public class Collectiondemo3 {

	public static void main(String[] args) {
		Stack s=new Stack();
		//s.add(12);
      //s.add(13);
      //s.push("abc");
      s.push("all");
      s.push("you");
      s.push(12);
      for(int i=0;i<=2;i++)
      s.pop();
      System.out.println(s);
	}

}
