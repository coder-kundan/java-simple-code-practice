import java.util.ArrayList;


public class Collection {

	public static void main(String[] args) {
	  ArrayList a1=new ArrayList();
      a1.add(34);
      a1.add(50);
      a1.add("Kundan");
        System.out.println(a1);
      ArrayList a2=new ArrayList();
      a2.add(25);
      a2.add(29);
      a2.add("ramesh");
      System.out.println(a2);
      a1.addAll(a2);
      System.out.println(a1);
	}

}
