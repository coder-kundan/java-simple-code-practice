
public class Test {
	static int k=23;
	static void Display() 
	 { 
		 System.out.println(" hello" +k);
	 }
	 void Display()
	{
		System.out.println("I am Displayee");
	}

	public static void main(String[] args) {
		Test tc=new Test();
		Display();
		tc.Display();
		
       Display();
        System.out.println(k);
	}

}
