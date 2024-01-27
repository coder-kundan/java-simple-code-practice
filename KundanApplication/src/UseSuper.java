class A
{
	A()
	{
		System.out.println("I ama in Class a");
	}
}
class B extends A
{
	B()
	{
		//super();
		System.out.println("i am in class B");
	}
}


public class UseSuper {

	public static void main(String[] args) {
	 B b= new B();
	}

}
